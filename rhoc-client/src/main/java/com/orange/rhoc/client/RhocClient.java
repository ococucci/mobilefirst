package com.orange.rhoc.client;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.orange.rhoc.client.api.DefaultApi;
import com.orange.rhoc.client.model.ApiPayloadNotTreatedModel;
import com.orange.rhoc.client.model.DiscountRight;
import com.orange.rhoc.client.model.Message;
import com.orange.rhoc.client.model.PayloadPubSub;
import org.apache.cxf.ext.logging.LoggingFeature;
import org.apache.cxf.feature.Feature;
import org.apache.cxf.jaxrs.client.JAXRSClientFactoryBean;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/**
 * Client for the RHOC API (discount rights), based on Apache CXF 3.4 JAX-RS.
 * <p>
 * Wraps the generated {@link DefaultApi}: configures JSON, timeouts, logging, the required
 * {@code X-Cloud-Trace-Context} header, and turns HTTP errors into {@link RhocApiException}.
 *
 * <pre>
 * RhocClient rhoc = RhocClient.builder().baseUrl("https://rhoc.example").build();
 * List&lt;DiscountRight&gt; rights = rhoc.getDiscountRights(
 *         DiscountRightsQuery.of(DiscountRightStatus.CONSOMMABLE, Vertical.MOBILE_OAG).beneficiaryCid("123"));
 * </pre>
 */
public final class RhocClient {

    static final String PUBSUB_PATH = "/v0/discountRights/pubsub";
    private static final SecureRandom RANDOM = new SecureRandom();

    private final DefaultApi api;
    private final WebClient pubsubClient;
    private final ObjectMapper mapper;

    private RhocClient(Builder b) {
        if (b.baseUrl == null) {
            throw new IllegalStateException("baseUrl is required (the RHOC spec declares no server)");
        }
        this.mapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .setSerializationInclusion(JsonInclude.Include.NON_NULL);
        List<Object> providers = Collections.<Object>singletonList(new JacksonJsonProvider(mapper));
        List<Feature> features = new ArrayList<>();
        if (b.logMessages) {
            LoggingFeature logging = new LoggingFeature();
            logging.setPrettyLogging(true);
            features.add(logging);
        }

        JAXRSClientFactoryBean factory = new JAXRSClientFactoryBean();
        factory.setAddress(b.baseUrl);
        factory.setServiceClass(DefaultApi.class);
        factory.setProviders(providers);
        factory.setFeatures(features);
        this.api = factory.create(DefaultApi.class);
        configure(WebClient.client(api), b);

        // POST /pubsub returns a different body per status (201 list, 200 object, 204 empty):
        // called with a plain WebClient to read each case.
        this.pubsubClient = WebClient.create(b.baseUrl, providers, features, null)
                .path(PUBSUB_PATH)
                .type(MediaType.APPLICATION_JSON_TYPE)
                .accept(MediaType.APPLICATION_JSON_TYPE);
        configure(pubsubClient, b);
    }

    private static void configure(org.apache.cxf.jaxrs.client.Client client, Builder b) {
        HTTPClientPolicy policy = new HTTPClientPolicy();
        policy.setConnectionTimeout(b.connectTimeoutMs);
        policy.setReceiveTimeout(b.receiveTimeoutMs);
        WebClient.getConfig(client).getHttpConduit().setClient(policy);
    }

    public static Builder builder() {
        return new Builder();
    }

    // -------------------------------------------------------- discount rights

    /** GET /v0/discountRights with a generated X-Cloud-Trace-Context. Empty list if nothing matches. */
    public List<DiscountRight> getDiscountRights(DiscountRightsQuery query) {
        return getDiscountRights(query, newTraceContext());
    }

    /** GET /v0/discountRights with the given X-Cloud-Trace-Context (e.g. propagated from the incoming request). */
    public List<DiscountRight> getDiscountRights(DiscountRightsQuery query, String traceContext) {
        try {
            List<DiscountRight> rights = api.getDiscountRightsV0DiscountRightsGet(query.status(), query.vertical(),
                    traceContext, query.sponsorCid(), query.sponsorPid(), query.beneficiaryCid(),
                    query.beneficiaryPid(), query.pendingOrderId());
            return rights != null ? rights : Collections.<DiscountRight>emptyList();
        } catch (WebApplicationException e) {
            throw toException(e.getResponse(), e);
        }
    }

    // ----------------------------------------------------------------- pubsub

    /** POST /v0/discountRights/pubsub (normally called by Google Pub/Sub push). */
    public PubSubResult handlePubSubMessage(PayloadPubSub payload) {
        Response response = pubsubClient.post(Entity.json(payload));
        try {
            int status = response.getStatus();
            switch (status) {
                case 201:
                    return new PubSubResult(status, readList(response), null, null);
                case 200:
                    return new PubSubResult(status, null, readNotTreated(response), null);
                case 204:
                    return new PubSubResult(status, null, null, response.getHeaderString("Location"));
                default:
                    if (status >= 200 && status < 300) {
                        return new PubSubResult(status, null, null, response.getHeaderString("Location"));
                    }
                    throw toException(response, null);
            }
        } finally {
            response.close();
        }
    }

    /**
     * Builds a Pub/Sub push payload: {@code message.data} is the base64 of the given JSON
     * (e.g. a CustomerOrder), as Google Pub/Sub does.
     */
    public static PayloadPubSub pubSubPayload(String json, String subscription) {
        String id = UUID.randomUUID().toString();
        Message message = new Message()
                .data(Base64.getEncoder().encodeToString(json.getBytes(StandardCharsets.UTF_8)))
                .messageId(id)
                .messageIdSnakeCase(id);
        return new PayloadPubSub().message(message).subscription(subscription);
    }

    /** Raw generated JAX-RS proxy (errors are then CXF WebApplicationExceptions). */
    public DefaultApi api() {
        return api;
    }

    // ----------------------------------------------------------------- utils

    /**
     * New Google Cloud trace header value: {@code TRACE_ID/SPAN_ID;o=1}
     * (32 hex characters / unsigned decimal span id).
     */
    public static String newTraceContext() {
        String traceId = UUID.randomUUID().toString().replace("-", "");
        long spanId = RANDOM.nextLong() & Long.MAX_VALUE;
        return traceId + "/" + spanId + ";o=1";
    }

    private List<DiscountRight> readList(Response response) {
        String body = response.readEntity(String.class);
        if (body == null || body.trim().isEmpty()) {
            return Collections.emptyList();
        }
        try {
            return mapper.readValue(body, new TypeReference<List<DiscountRight>>() { });
        } catch (Exception e) {
            throw new IllegalStateException("Unexpected pubsub 201 body: " + body, e);
        }
    }

    private ApiPayloadNotTreatedModel readNotTreated(Response response) {
        String body = response.readEntity(String.class);
        if (body == null || body.trim().isEmpty()) {
            return null;
        }
        try {
            return mapper.readValue(body, ApiPayloadNotTreatedModel.class);
        } catch (Exception e) {
            throw new IllegalStateException("Unexpected pubsub 200 body: " + body, e);
        }
    }

    private RhocApiException toException(Response response, Throwable cause) {
        int status = response != null ? response.getStatus() : -1;
        String body = null;
        if (response != null && response.hasEntity()) {
            try {
                body = response.readEntity(String.class);
            } catch (RuntimeException ignored) {
                // body not readable
            }
        }
        return new RhocApiException(status, body, mapper, cause);
    }

    // ---------------------------------------------------------------- builder

    public static final class Builder {
        private String baseUrl;
        private long connectTimeoutMs = 10_000;
        private long receiveTimeoutMs = 30_000;
        private boolean logMessages;

        private Builder() {
        }

        /** Base URL of the RHOC API, without /v0 (required). */
        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public Builder connectTimeout(long millis) {
            this.connectTimeoutMs = millis;
            return this;
        }

        public Builder receiveTimeout(long millis) {
            this.receiveTimeoutMs = millis;
            return this;
        }

        /** Logs HTTP requests/responses (they contain customer identifiers). */
        public Builder logMessages(boolean logMessages) {
            this.logMessages = logMessages;
            return this;
        }

        public RhocClient build() {
            return new RhocClient(this);
        }
    }
}
