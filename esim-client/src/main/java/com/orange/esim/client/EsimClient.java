package com.orange.esim.client;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.orange.esim.client.api.NotificationsApi;
import com.orange.esim.client.api.ProfilesApi;
import com.orange.esim.client.api.ServiceOrderApi;
import com.orange.esim.client.model.AllocateProfileRequest;
import com.orange.esim.client.model.AllocateProfileResponse;
import com.orange.esim.client.model.CancelProfileRequest;
import com.orange.esim.client.model.CancelProfileResponse;
import com.orange.esim.client.model.DeliverProfileRequest;
import com.orange.esim.client.model.DeliverProfileResponse;
import com.orange.esim.client.model.EsimProfileRequest;
import com.orange.esim.client.model.EsimProfileResponse;
import com.orange.esim.client.model.GetProfileResponse;
import com.orange.esim.client.model.GetStatusResponse;
import com.orange.esim.client.model.HandleDownloadProgressInfoRequest;
import com.orange.esim.client.model.ServiceOrder;
import com.orange.esim.client.model.ServiceOrderCreate;
import org.apache.cxf.ext.logging.LoggingFeature;
import org.apache.cxf.jaxrs.client.JAXRSClientFactoryBean;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collections;
import java.util.function.Supplier;

/**
 * Client for the eSIM Consumer REST API (enabler-esim), based on Apache CXF 3.4 JAX-RS proxies.
 * <p>
 * Wraps the generated {@link ProfilesApi}, {@link ServiceOrderApi} and {@link NotificationsApi}:
 * configures JSON, timeouts, logging and the {@code X-ORANGE-Application-Id} / {@code X-ORANGE-User-Id}
 * headers, and turns HTTP errors into {@link EsimApiException}.
 *
 * <pre>
 * EsimClient esim = EsimClient.builder()
 *         .baseUrl("http://host/enabler-esim/api/api")
 *         .applicationId("MYAPP")
 *         .build();
 * AllocateProfileResponse allocated = esim.allocateProfile(new AllocateProfileRequest().profileType("P9054-2"));
 * </pre>
 */
public final class EsimClient {

    /** Base path declared by the Swagger; the host must be provided by the caller. */
    public static final String BASE_PATH = "/enabler-esim/api/api";

    private final ProfilesApi profiles;
    private final ServiceOrderApi serviceOrders;
    private final NotificationsApi notifications;
    private final ObjectMapper mapper;
    private final String applicationId;
    private final String userId;

    private EsimClient(Builder b) {
        if (b.baseUrl == null) {
            throw new IllegalStateException("baseUrl is required, e.g. http://host" + BASE_PATH);
        }
        this.mapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .setSerializationInclusion(JsonInclude.Include.NON_NULL);
        this.applicationId = b.applicationId;
        this.userId = b.userId;
        this.profiles = createProxy(ProfilesApi.class, b);
        this.serviceOrders = createProxy(ServiceOrderApi.class, b);
        this.notifications = createProxy(NotificationsApi.class, b);
    }

    private <T> T createProxy(Class<T> type, Builder b) {
        JAXRSClientFactoryBean factory = new JAXRSClientFactoryBean();
        factory.setAddress(b.baseUrl);
        factory.setServiceClass(type);
        factory.setProviders(Collections.singletonList(new JacksonJsonProvider(mapper)));
        if (b.logMessages) {
            LoggingFeature logging = new LoggingFeature();
            logging.setPrettyLogging(true);
            factory.getFeatures().add(logging);
        }
        T proxy = factory.create(type);

        // The Swagger declares no "consumes" for /profiles/allocate and /profiles/{iccid}/deliver:
        // send JSON by default for every request body.
        WebClient.client(proxy).type(MediaType.APPLICATION_JSON_TYPE).accept(MediaType.APPLICATION_JSON_TYPE);

        HTTPClientPolicy policy = new HTTPClientPolicy();
        policy.setConnectionTimeout(b.connectTimeoutMs);
        policy.setReceiveTimeout(b.receiveTimeoutMs);
        WebClient.getConfig(proxy).getHttpConduit().setClient(policy);
        return proxy;
    }

    public static Builder builder() {
        return new Builder();
    }

    // --------------------------------------------------------------- profiles

    /** POST /profiles: eSIM profile information for a MSISDN and profileType. */
    public EsimProfileResponse getProfile(EsimProfileRequest request) {
        return call(() -> profiles.profilesPost(applicationId, userId, request));
    }

    /** POST /profiles/allocate: allocates an eSIM profile on the SM-DP+ server. */
    public AllocateProfileResponse allocateProfile(AllocateProfileRequest request) {
        return call(() -> profiles.profilesAllocatePost(applicationId, userId, request));
    }

    /** POST /profiles/{iccid}/deliver: confirms the use of a previously allocated profile. */
    public DeliverProfileResponse deliverProfile(String iccid, DeliverProfileRequest request) {
        return call(() -> profiles.profilesIccidDeliverPost(iccid, applicationId, userId, request));
    }

    /** POST /profiles/{iccid}/cancel: cancels a profile that has not been downloaded. */
    public CancelProfileResponse cancelProfile(String iccid, CancelProfileRequest request) {
        return call(() -> profiles.profilesIccidCancelPost(iccid, applicationId, userId, request));
    }

    /** GET /profiles/{iccid}: profile data. */
    public GetProfileResponse getProfileByIccid(String iccid) {
        return call(() -> profiles.profilesIccidGet(iccid, applicationId, userId));
    }

    /** GET /profiles/status: API availability. */
    public GetStatusResponse getStatus() {
        return call(profiles::profilesStatusGet);
    }

    // ---------------------------------------------------------- service order

    /** POST /serviceOrder: creates a ServiceOrder (errors are {@code EsimProfileError}). */
    public ServiceOrder createServiceOrder(ServiceOrderCreate request) {
        return call(() -> serviceOrders.createServiceOrder(request));
    }

    // ---------------------------------------------------------- notifications

    /** POST /gsma/rsp2/es2plus/handleDownloadProgressInfo (ES2+ notification, normally sent by SM-DP+). */
    public void handleDownloadProgressInfo(HandleDownloadProgressInfoRequest request) {
        call(() -> {
            notifications.handleDownloadProgressInfo(request);
            return null;
        });
    }

    // ------------------------------------------------------------- raw access

    /** Generated JAX-RS proxies, for direct use (errors are then CXF WebApplicationExceptions). */
    public ProfilesApi profilesApi() {
        return profiles;
    }

    public ServiceOrderApi serviceOrderApi() {
        return serviceOrders;
    }

    public NotificationsApi notificationsApi() {
        return notifications;
    }

    // ----------------------------------------------------------------- errors

    private <T> T call(Supplier<T> invocation) {
        try {
            return invocation.get();
        } catch (WebApplicationException e) {
            Response response = e.getResponse();
            int status = response != null ? response.getStatus() : -1;
            String body = null;
            if (response != null && response.hasEntity()) {
                try {
                    body = response.readEntity(String.class);
                } catch (RuntimeException ignored) {
                    // body not readable
                }
            }
            throw new EsimApiException(status, body, mapper, e);
        }
    }

    // ---------------------------------------------------------------- builder

    public static final class Builder {
        private String baseUrl;
        private String applicationId;
        private String userId;
        private long connectTimeoutMs = 10_000;
        private long receiveTimeoutMs = 30_000;
        private boolean logMessages;

        private Builder() {
        }

        /** Base URL including the base path, e.g. http://host/enabler-esim/api/api (required). */
        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        /** Value of the X-ORANGE-Application-Id header (403 if missing or unknown). */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /** Value of the X-ORANGE-User-Id header. */
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

        /** Logs HTTP requests/responses (they contain ICCID, EID, activation codes...). */
        public Builder logMessages(boolean logMessages) {
            this.logMessages = logMessages;
            return this;
        }

        public EsimClient build() {
            return new EsimClient(this);
        }
    }
}
