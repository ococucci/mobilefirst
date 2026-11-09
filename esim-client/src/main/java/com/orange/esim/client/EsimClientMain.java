package com.orange.esim.client;

import com.orange.esim.client.model.AllocateProfileRequest;
import com.orange.esim.client.model.AllocateProfileResponse;
import com.orange.esim.client.model.DeliverProfileRequest;
import com.orange.esim.client.model.DeliverProfileResponse;
import com.orange.esim.client.model.GetProfileResponse;
import com.orange.esim.client.model.GetStatusResponse;

/**
 * Example: API status, allocate a profile, deliver it with an activation code, read it back.
 * <p>
 * {@code mvn compile exec:java -Dexec.args="<baseUrl> <applicationId> <profileType>"}
 * <p>
 * Values (applicationId, profileType...) are examples: use the ones agreed with the enabler-esim team.
 */
public final class EsimClientMain {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Usage: EsimClientMain <baseUrl e.g. http://host/enabler-esim/api/api> [applicationId] [profileType]");
            return;
        }
        String baseUrl = args[0];
        String applicationId = args.length > 1 ? args[1] : "MYAPP";
        String profileType = args.length > 2 ? args[2] : "P9054-2";

        EsimClient esim = EsimClient.builder()
                .baseUrl(baseUrl)
                .applicationId(applicationId)
                .build();

        try {
            GetStatusResponse status = esim.getStatus();
            System.out.println("API " + status.getName() + " status=" + status.getStatus() + " version=" + status.getVersion());

            AllocateProfileResponse allocated = esim.allocateProfile(new AllocateProfileRequest().profileType(profileType));
            System.out.println("Allocated iccid=" + allocated.getIccid() + " imsi=" + allocated.getImsi());

            DeliverProfileResponse delivered = esim.deliverProfile(allocated.getIccid(),
                    new DeliverProfileRequest().deliveryMode("AC"));
            System.out.println("Activation code=" + delivered.getActivationCode());

            GetProfileResponse profile = esim.getProfileByIccid(allocated.getIccid());
            System.out.println("Profile status=" + profile.getProfileStatus() + " last operation="
                    + profile.getLastOperationDone() + "/" + profile.getLastOperationResult());
        } catch (EsimApiException e) {
            // 400 / 403 / 404 / 424 / 500: see getError(), getSourceError(), getEsimProfileError()
            System.err.println(e.getMessage());
        } catch (javax.ws.rs.ProcessingException e) {
            // connection refused, timeout...
            System.err.println("Technical error: " + e.getMessage());
        }
    }
}
