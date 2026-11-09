package com.orange.esim.client;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.orange.esim.client.model.Error;
import com.orange.esim.client.model.EsimProfileError;
import com.orange.esim.client.model.SourceError;

/**
 * HTTP error returned by the eSIM Consumer API.
 * <p>
 * Depending on the operation and the status, the body is one of:
 * <ul>
 *     <li>{@link Error} (code, message): 400, 403, 404, 500 on /profiles</li>
 *     <li>{@link SourceError} (source.name, source.httpCode, source.error): 424 Failed Dependency on /profiles</li>
 *     <li>{@link EsimProfileError} (code, message, data): 400, 404, 500 on /serviceOrder</li>
 * </ul>
 * The matching getter returns the parsed body, the others return {@code null}.
 */
public class EsimApiException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private final int status;
    private final String rawBody;
    private final transient Error error;
    private final transient SourceError sourceError;
    private final transient EsimProfileError esimProfileError;

    EsimApiException(int status, String rawBody, ObjectMapper mapper, Throwable cause) {
        this(status, rawBody, parse(rawBody, mapper), mapper, cause);
    }

    private EsimApiException(int status, String rawBody, JsonNode json, ObjectMapper mapper, Throwable cause) {
        super(buildMessage(status, json, rawBody), cause);
        this.status = status;
        this.rawBody = rawBody;
        boolean hasCode = json != null && (json.has("code") || json.has("message"));
        boolean hasSource = json != null && json.has("source");
        boolean hasData = json != null && json.has("data");
        this.error = hasCode ? convert(json, Error.class, mapper) : null;
        this.esimProfileError = hasCode || hasData ? convert(json, EsimProfileError.class, mapper) : null;
        this.sourceError = hasSource ? convert(json, SourceError.class, mapper) : null;
    }

    /** HTTP status (400, 403, 404, 424, 500...). */
    public int getStatus() {
        return status;
    }

    public String getRawBody() {
        return rawBody;
    }

    /** {@code Error} body (code, message), or {@code null}. */
    public Error getError() {
        return error;
    }

    /** {@code SourceError} body returned with 424 Failed Dependency, or {@code null}. */
    public SourceError getSourceError() {
        return sourceError;
    }

    /** {@code EsimProfileError} body returned by /serviceOrder (code, message, data), or {@code null}. */
    public EsimProfileError getEsimProfileError() {
        return esimProfileError;
    }

    /** Functional error code from the body, or {@code null}. */
    public String getErrorCode() {
        return error != null ? error.getCode() : null;
    }

    public boolean isNotFound() {
        return status == 404;
    }

    public boolean isForbidden() {
        return status == 403;
    }

    public boolean isFailedDependency() {
        return status == 424;
    }

    private static JsonNode parse(String body, ObjectMapper mapper) {
        if (body == null || body.trim().isEmpty()) {
            return null;
        }
        try {
            JsonNode node = mapper.readTree(body);
            return node != null && node.isObject() ? node : null;
        } catch (Exception e) {
            return null;
        }
    }

    private static <T> T convert(JsonNode json, Class<T> type, ObjectMapper mapper) {
        try {
            return mapper.treeToValue(json, type);
        } catch (Exception e) {
            return null;
        }
    }

    private static String buildMessage(int status, JsonNode json, String rawBody) {
        StringBuilder sb = new StringBuilder("eSIM API error HTTP ").append(status);
        if (json != null) {
            if (json.has("code")) {
                sb.append(" code=").append(json.get("code").asText());
            }
            if (json.has("message")) {
                sb.append(" message=").append(json.get("message").asText());
            }
            JsonNode source = json.get("source");
            if (source != null) {
                sb.append(" source=").append(source.path("name").asText())
                        .append(" sourceHttpCode=").append(source.path("httpCode").asText())
                        .append(" sourceError=").append(source.path("error").asText());
            }
        } else if (rawBody != null && !rawBody.isEmpty()) {
            sb.append(" body=").append(rawBody);
        }
        return sb.toString();
    }
}
