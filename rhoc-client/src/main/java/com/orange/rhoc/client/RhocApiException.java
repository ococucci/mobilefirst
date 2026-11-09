package com.orange.rhoc.client;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * HTTP error returned by the RHOC API.
 * <p>
 * The documented error bodies (InvalidParameterModel 400, UnauthorizatedModel 403,
 * ApiTemporaryUnavailableResponse 503) all have the same shape: {@code code}, {@code message},
 * {@code description}. FastAPI validation errors (422) have a {@code detail} array instead,
 * available through {@link #getJson()}.
 * <p>
 * Documented codes: 25 missing header, 26 missing header value, 27 missing query-string parameter,
 * 28 invalid query-string parameter, 3 forbidden, 5 API temporarily unavailable.
 */
public class RhocApiException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private final int status;
    private final String rawBody;
    private final transient JsonNode json;

    RhocApiException(int status, String rawBody, ObjectMapper mapper, Throwable cause) {
        this(status, rawBody, parse(rawBody, mapper), cause);
    }

    private RhocApiException(int status, String rawBody, JsonNode json, Throwable cause) {
        super(buildMessage(status, json, rawBody), cause);
        this.status = status;
        this.rawBody = rawBody;
        this.json = json;
    }

    /** HTTP status (400, 403, 422, 503...). */
    public int getStatus() {
        return status;
    }

    /** Functional error code from the body (e.g. 28, 3, 5), or {@code null}. */
    public Integer getErrorCode() {
        return json != null && json.hasNonNull("code") && json.get("code").canConvertToInt()
                ? json.get("code").asInt() : null;
    }

    /** Error message from the body, or {@code null}. */
    public String getErrorMessage() {
        return text("message");
    }

    /** Error description from the body, or {@code null}. */
    public String getErrorDescription() {
        return text("description");
    }

    /** Parsed JSON body (e.g. FastAPI {@code detail} for 422), or {@code null} if not JSON. */
    public JsonNode getJson() {
        return json;
    }

    public String getRawBody() {
        return rawBody;
    }

    public boolean isForbidden() {
        return status == 403;
    }

    public boolean isServiceUnavailable() {
        return status == 503;
    }

    private String text(String field) {
        return json != null && json.hasNonNull(field) ? json.get(field).asText() : null;
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

    private static String buildMessage(int status, JsonNode json, String rawBody) {
        StringBuilder sb = new StringBuilder("RHOC API error HTTP ").append(status);
        if (json != null) {
            if (json.has("code")) {
                sb.append(" code=").append(json.get("code").asText());
            }
            if (json.has("message")) {
                sb.append(" message=").append(json.get("message").asText());
            }
            if (json.has("description")) {
                sb.append(" description=").append(json.get("description").asText());
            }
            if (json.has("detail")) {
                sb.append(" detail=").append(json.get("detail"));
            }
        } else if (rawBody != null && !rawBody.isEmpty()) {
            sb.append(" body=").append(rawBody);
        }
        return sb.toString();
    }
}
