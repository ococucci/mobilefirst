package com.orange.iml.client;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.orange.iml.client.api.ImlProviderApi;
import com.orange.iml.client.model.Error;
import com.orange.iml.client.model.InParametersTokenize;
import com.orange.iml.client.model.InParametersUntokenize;
import com.orange.iml.client.model.OutParamatersUntokenize;
import com.orange.iml.client.model.OutParametersTokenize;
import com.orange.iml.client.model.UniqueBankAccount;
import com.orange.iml.client.model.UniqueToken;
import org.apache.cxf.ext.logging.LoggingFeature;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.JAXRSClientFactoryBean;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import java.util.Collections;
import java.util.List;

/**
 * Client for the IBAN Management Layer REST API (Apache CXF 3.4 JAX-RS proxy).
 * <p>
 * Wraps the generated {@link ImlProviderApi} interface: configures JSON, timeouts and logging,
 * and turns HTTP errors (400 / 500 / 503) into {@link ImlApiException}.
 *
 * <pre>
 * ImlClient iml = ImlClient.builder()
 *         .baseUrl("http://in-iml-as1.ms.fcm:9500/iban-management-layer/ws/api")
 *         .appId("CLEMENTINE")
 *         .build();
 * OutParametersTokenize out = iml.tokenize("FR7630006000011234567890189");
 * </pre>
 */
public final class ImlClient {

    public static final String DEFAULT_BASE_URL = "http://in-iml-as1.ms.fcm:9500/iban-management-layer/ws/api";

    private final ImlProviderApi api;
    private final ObjectMapper mapper;
    private final String appId;
    private final String userId;

    private ImlClient(Builder b) {
        this.mapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .setSerializationInclusion(JsonInclude.Include.NON_NULL);
        this.appId = b.appId;
        this.userId = b.userId;

        JAXRSClientFactoryBean factory = new JAXRSClientFactoryBean();
        factory.setAddress(b.baseUrl);
        factory.setServiceClass(ImlProviderApi.class);
        factory.setProviders(Collections.singletonList(new JacksonJsonProvider(mapper)));
        if (b.logMessages) {
            LoggingFeature logging = new LoggingFeature();
            logging.setPrettyLogging(true);
            factory.getFeatures().add(logging);
        }
        this.api = factory.create(ImlProviderApi.class);

        ClientConfiguration config = WebClient.getConfig(api);
        HTTPClientPolicy policy = new HTTPClientPolicy();
        policy.setConnectionTimeout(b.connectTimeoutMs);
        policy.setReceiveTimeout(b.receiveTimeoutMs);
        config.getHttpConduit().setClient(policy);
    }

    public static Builder builder() {
        return new Builder();
    }

    /** Raw generated JAX-RS proxy, for direct use (errors are then CXF WebApplicationExceptions). */
    public ImlProviderApi api() {
        return api;
    }

    // ---------------------------------------------------------------- tokenize

    /** POST /tokenize: returns the tokens of the given bank accounts (RIB or IBAN). */
    public OutParametersTokenize tokenize(InParametersTokenize request) {
        try {
            return api.tokenize1(request);
        } catch (WebApplicationException e) {
            throw toImlException(e);
        }
    }

    /**
     * Tokenizes the given IBAN/RIB with the configured appId/userId.
     * Each item gets uid "1", "2", ... in the given order.
     */
    public OutParametersTokenize tokenize(String... bankAccounts) {
        InParametersTokenize request = new InParametersTokenize().appId(requireAppId()).userId(userId);
        for (int i = 0; i < bankAccounts.length; i++) {
            request.addUniqueBankAccountsItem(new UniqueBankAccount().uid(String.valueOf(i + 1)).bankAccount(bankAccounts[i]));
        }
        return tokenize(request);
    }

    // -------------------------------------------------------------- untokenize

    /** POST /untokenize: returns the IBAN of the given tokens. */
    public OutParamatersUntokenize untokenize(InParametersUntokenize request) {
        try {
            return api.untokenize1(request);
        } catch (WebApplicationException e) {
            throw toImlException(e);
        }
    }

    /**
     * Untokenizes the given tokens with the configured appId/userId.
     * Each item gets uid "1", "2", ... in the given order.
     */
    public OutParamatersUntokenize untokenize(String... tokens) {
        InParametersUntokenize request = new InParametersUntokenize().appId(requireAppId()).userId(userId);
        for (int i = 0; i < tokens.length; i++) {
            request.addUniqueTokensItem(new UniqueToken().uid(String.valueOf(i + 1)).token(tokens[i]));
        }
        return untokenize(request);
    }

    // ------------------------------------------------------------------ errors

    private ImlApiException toImlException(WebApplicationException e) {
        Response response = e.getResponse();
        int status = response != null ? response.getStatus() : -1;
        String body = null;
        Error error = null;
        if (response != null && response.hasEntity()) {
            try {
                body = response.readEntity(String.class);
            } catch (RuntimeException ignored) {
                // body not readable
            }
        }
        // The server can send the Error JSON as application/json or text/plain: parse it either way
        if (body != null && !body.trim().isEmpty()) {
            try {
                error = mapper.readValue(body, Error.class);
            } catch (Exception ignored) {
                // not JSON: kept in rawBody
            }
        }
        return new ImlApiException(status, error, body, e);
    }

    private String requireAppId() {
        if (appId == null) {
            throw new IllegalStateException("appId is required: set it with ImlClient.builder().appId(...)");
        }
        return appId;
    }

    // ----------------------------------------------------------------- builder

    public static final class Builder {
        private String baseUrl = DEFAULT_BASE_URL;
        private String appId;
        private String userId;
        private long connectTimeoutMs = 10_000;
        private long receiveTimeoutMs = 30_000;
        private boolean logMessages;

        private Builder() {
        }

        /** Base URL, e.g. http://in-iml-as1.ms.fcm:9500/iban-management-layer/ws/api */
        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        /** Calling application identifier (required by the API), e.g. CLEMENTINE. */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /** Optional identifier of the end user at the origin of the call. */
        public Builder userId(String userId) {
            this.userId = userId;
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

        /** Logs HTTP requests/responses. Warning: they contain IBANs. */
        public Builder logMessages(boolean logMessages) {
            this.logMessages = logMessages;
            return this;
        }

        public ImlClient build() {
            return new ImlClient(this);
        }
    }

    /** Convenience accessor for empty-safe iteration. */
    static <T> List<T> orEmpty(List<T> list) {
        return list != null ? list : Collections.<T>emptyList();
    }
}
