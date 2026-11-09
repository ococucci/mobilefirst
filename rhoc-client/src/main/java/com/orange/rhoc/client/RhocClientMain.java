package com.orange.rhoc.client;

import com.orange.rhoc.client.model.DiscountRight;
import com.orange.rhoc.client.model.DiscountRightStatus;
import com.orange.rhoc.client.model.Vertical;

import java.util.List;

/**
 * Example: list the consumable discount rights of a beneficiary.
 * <p>
 * {@code mvn compile exec:java -Dexec.args="<baseUrl> <beneficiaryCid>"}
 */
public final class RhocClientMain {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Usage: RhocClientMain <baseUrl> [beneficiaryCid]");
            return;
        }
        RhocClient rhoc = RhocClient.builder().baseUrl(args[0]).build();
        String beneficiaryCid = args.length > 1 ? args[1] : "590690000000";

        try {
            List<DiscountRight> rights = rhoc.getDiscountRights(
                    DiscountRightsQuery.of(DiscountRightStatus.CONSOMMABLE, Vertical.MOBILE_OAG)
                            .beneficiaryCid(beneficiaryCid));
            for (DiscountRight r : rights) {
                System.out.println(r.getDiscountRightCode() + " status=" + r.getStatus()
                        + " sponsorCid=" + r.getSponsorCid() + " pendingOrderId=" + r.getPendingOrderId());
            }
            System.out.println(rights.size() + " discount right(s)");
        } catch (RhocApiException e) {
            // 400 (codes 25-28), 403 (code 3), 503 (code 5)
            System.err.println(e.getMessage());
        } catch (javax.ws.rs.ProcessingException e) {
            // connection refused, timeout...
            System.err.println("Technical error: " + e.getMessage());
        }
    }
}
