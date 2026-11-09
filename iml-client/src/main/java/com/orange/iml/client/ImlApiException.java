package com.orange.iml.client;

import com.orange.iml.client.model.Error;

/**
 * Error returned by the IBAN Management Layer (HTTP 400, 500, 503...).
 * <p>
 * {@link #getError()} holds the parsed {@code Error} body (code, message, detail, appId, userId)
 * when the server returned one, {@link #getRawBody()} the body as received.
 */
public class ImlApiException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private final int status;
    private final transient Error error;
    private final String rawBody;

    public ImlApiException(int status, Error error, String rawBody, Throwable cause) {
        super(buildMessage(status, error, rawBody), cause);
        this.status = status;
        this.error = error;
        this.rawBody = rawBody;
    }

    /** HTTP status code (400 = invalid input, 503 = OPSI unavailable, 500 = internal error). */
    public int getStatus() {
        return status;
    }

    /** Parsed error body, or {@code null} if the body was empty or not JSON. */
    public Error getError() {
        return error;
    }

    /** Error code from the body (e.g. "4000", "5030"), or {@code null}. */
    public String getErrorCode() {
        return error != null ? error.getCode() : null;
    }

    public String getRawBody() {
        return rawBody;
    }

    public boolean isBadRequest() {
        return status == 400;
    }

    public boolean isServiceUnavailable() {
        return status == 503;
    }

    private static String buildMessage(int status, Error error, String rawBody) {
        StringBuilder sb = new StringBuilder("IML error HTTP ").append(status);
        if (error != null) {
            sb.append(" code=").append(error.getCode()).append(" message=").append(error.getMessage());
            if (error.getDetail() != null) {
                sb.append(" detail=").append(error.getDetail());
            }
        } else if (rawBody != null && !rawBody.isEmpty()) {
            sb.append(" body=").append(rawBody);
        }
        return sb.toString();
    }
}
