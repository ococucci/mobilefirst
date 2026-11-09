package com.orange.rhoc.client;

import com.orange.rhoc.client.model.DiscountRightStatus;
import com.orange.rhoc.client.model.Vertical;

/**
 * Parameters of {@code GET /v0/discountRights}. {@code status} and {@code vertical} are required,
 * the other criteria are optional (not sent when {@code null}).
 *
 * <pre>
 * DiscountRightsQuery.of(DiscountRightStatus.ALL, Vertical.MOBILE_OAG).pendingOrderId("123")
 * </pre>
 */
public final class DiscountRightsQuery {

    private final DiscountRightStatus status;
    private final Vertical vertical;
    private String sponsorCid;
    private String sponsorPid;
    private String beneficiaryCid;
    private String beneficiaryPid;
    private String pendingOrderId;

    private DiscountRightsQuery(DiscountRightStatus status, Vertical vertical) {
        if (status == null || vertical == null) {
            throw new IllegalArgumentException("status and vertical are required");
        }
        this.status = status;
        this.vertical = vertical;
    }

    public static DiscountRightsQuery of(DiscountRightStatus status, Vertical vertical) {
        return new DiscountRightsQuery(status, vertical);
    }

    public DiscountRightsQuery sponsorCid(String sponsorCid) {
        this.sponsorCid = sponsorCid;
        return this;
    }

    public DiscountRightsQuery sponsorPid(String sponsorPid) {
        this.sponsorPid = sponsorPid;
        return this;
    }

    public DiscountRightsQuery beneficiaryCid(String beneficiaryCid) {
        this.beneficiaryCid = beneficiaryCid;
        return this;
    }

    public DiscountRightsQuery beneficiaryPid(String beneficiaryPid) {
        this.beneficiaryPid = beneficiaryPid;
        return this;
    }

    public DiscountRightsQuery pendingOrderId(String pendingOrderId) {
        this.pendingOrderId = pendingOrderId;
        return this;
    }

    DiscountRightStatus status() {
        return status;
    }

    Vertical vertical() {
        return vertical;
    }

    String sponsorCid() {
        return sponsorCid;
    }

    String sponsorPid() {
        return sponsorPid;
    }

    String beneficiaryCid() {
        return beneficiaryCid;
    }

    String beneficiaryPid() {
        return beneficiaryPid;
    }

    String pendingOrderId() {
        return pendingOrderId;
    }
}
