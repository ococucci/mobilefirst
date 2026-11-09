package com.orange.rhoc.client;

import com.orange.rhoc.client.model.ApiPayloadNotTreatedModel;
import com.orange.rhoc.client.model.DiscountRight;

import java.util.Collections;
import java.util.List;

/**
 * Result of {@code POST /v0/discountRights/pubsub}, whose body depends on the HTTP status:
 * <ul>
 *     <li>201: discount rights created → {@link #getDiscountRights()}</li>
 *     <li>200: payload not treated (code 1) or invalid payload (code 2) → {@link #getNotTreated()}</li>
 *     <li>204: no content, {@link #getLocation()} gives the URL of the related discount rights</li>
 * </ul>
 */
public final class PubSubResult {

    private final int status;
    private final List<DiscountRight> discountRights;
    private final ApiPayloadNotTreatedModel notTreated;
    private final String location;

    PubSubResult(int status, List<DiscountRight> discountRights, ApiPayloadNotTreatedModel notTreated, String location) {
        this.status = status;
        this.discountRights = discountRights != null ? discountRights : Collections.<DiscountRight>emptyList();
        this.notTreated = notTreated;
        this.location = location;
    }

    public int getStatus() {
        return status;
    }

    /** 201 Created. */
    public boolean isCreated() {
        return status == 201;
    }

    /** 200: the payload was received but not processed (see {@link #getNotTreated()}). */
    public boolean isNotTreated() {
        return status == 200;
    }

    /** 204 No Content. */
    public boolean isNoContent() {
        return status == 204;
    }

    /** Created discount rights (201), empty otherwise. */
    public List<DiscountRight> getDiscountRights() {
        return discountRights;
    }

    /** Reason why the payload was not treated (200), {@code null} otherwise. */
    public ApiPayloadNotTreatedModel getNotTreated() {
        return notTreated;
    }

    /** {@code Location} header (204), e.g. /v0/discountRights?vertical=MOBILE_OAG&amp;status=All&amp;pendingOrderId=..., or {@code null}. */
    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "PubSubResult{status=" + status + ", discountRights=" + discountRights.size()
                + ", notTreated=" + (notTreated != null ? notTreated.getCode() + " " + notTreated.getMessage() : null)
                + ", location=" + location + "}";
    }
}
