package com.orangecaraibe.client.manageproductinstbaseresourceassignment;

import com.orangecaraibe.enra.manageproductinstbaseresourceassignment.ConfirmInstalledPublicKeyException;
import com.orangecaraibe.enra.manageproductinstbaseresourceassignment.FindAndGetInstalledPublicKeyException;
import com.orangecaraibe.enra.manageproductinstbaseresourceassignment.InterfaceUnavailableException;
import com.orangecaraibe.enra.manageproductinstbaseresourceassignment.ManageProductInstBaseResourceAssignment;
import com.orangecaraibe.enra.manageproductinstbaseresourceassignment.ReserveInstalledPublicKeyException;
import com.orangecaraibe.enra.model.commonbusiness.party.role.Distributor;
import com.orangecaraibe.enra.model.commons.criteria.Criteria;
import com.orangecaraibe.enra.model.commons.criteria.Eq;
import com.orangecaraibe.enra.model.commons.exception.Fault;
import com.orangecaraibe.enra.model.offeringandproducts.productinstalledbase.InstalledPublicKey;

import javax.xml.ws.Holder;
import javax.xml.ws.WebServiceException;
import java.util.Collections;
import java.util.List;

/**
 * Usage examples for the ManageProductInstBaseResourceAssignment client (installed public keys:
 * MSISDN, SIM...).
 * <p>
 * Run with: {@code mvn compile exec:java -Dexec.args="http://enra.gitg.ms.fcm/soa/manageProductInstBaseResourceAssignment"}
 * <p>
 * Property names and values used below (functionValue, channelID...) are examples:
 * use the values agreed with the ENRA team.
 * <p>
 * Signatures:
 * <ul>
 *     <li>{@code findAndGetInstalledPublicKey(Criteria)} returns {@code List<InstalledPublicKey>}</li>
 *     <li>{@code reserve / check (Holder<InstalledPublicKey>, Distributor)}: key is IN/OUT</li>
 *     <li>{@code release / recycle / recycleAndReserve (Holder<InstalledPublicKey>)}: key is IN/OUT</li>
 *     <li>{@code confirm / cancel (InstalledPublicKey, Distributor)}: no return value</li>
 * </ul>
 */
public final class ManageProductInstBaseResourceAssignmentClientMain {

    public static void main(String[] args) {
        String address = args.length > 0 ? args[0] : ManageProductInstBaseResourceAssignmentClientFactory.DEFAULT_ADDRESS;

        ManageProductInstBaseResourceAssignment port = new ManageProductInstBaseResourceAssignmentClientFactory()
                .address(address)
                .logMessages(true)
                .create();

        List<InstalledPublicKey> keys = findAndGet(port, "590690000000");
        for (InstalledPublicKey key : keys) {
            System.out.println("Key " + key.getInstalledPublicKeyID() + " value=" + key.getFunctionValue());
        }
    }

    /** findAndGetInstalledPublicKey: search keys with a Criteria (here functionValue = value). */
    static List<InstalledPublicKey> findAndGet(ManageProductInstBaseResourceAssignment port, String value) {
        Eq eq = new Eq();
        eq.setProperty("functionValue");
        eq.setValue(value);

        Criteria criteria = new Criteria();
        criteria.getRestrictions().add(eq);

        try {
            return port.findAndGetInstalledPublicKey(criteria);
        } catch (FindAndGetInstalledPublicKeyException e) {
            logFault("findAndGetInstalledPublicKey", e.getFaultInfo());
        } catch (InterfaceUnavailableException e) {
            logFault("findAndGetInstalledPublicKey (interface unavailable)", e.getFaultInfo());
        } catch (WebServiceException e) {
            // network error, timeout, undeclared SOAP fault...
            System.err.println("findAndGetInstalledPublicKey: technical error: " + e.getMessage());
        }
        return Collections.emptyList();
    }

    /**
     * reserveInstalledPublicKey: the key is an IN/OUT parameter. After the call,
     * {@code holder.value} contains the key returned by the service (reserved key, status...).
     */
    static InstalledPublicKey reserve(ManageProductInstBaseResourceAssignment port, InstalledPublicKey key, String channelId) {
        Holder<InstalledPublicKey> holder = new Holder<>(key);
        try {
            port.reserveInstalledPublicKey(holder, distributor(channelId));
            return holder.value;
        } catch (ReserveInstalledPublicKeyException e) {
            logFault("reserveInstalledPublicKey", e.getFaultInfo());
        } catch (InterfaceUnavailableException e) {
            logFault("reserveInstalledPublicKey (interface unavailable)", e.getFaultInfo());
        } catch (WebServiceException e) {
            System.err.println("reserveInstalledPublicKey: technical error: " + e.getMessage());
        }
        return null;
    }

    /** confirmInstalledPublicKey: confirms a reserved key (no return value). */
    static boolean confirm(ManageProductInstBaseResourceAssignment port, InstalledPublicKey key, String channelId) {
        try {
            port.confirmInstalledPublicKey(key, distributor(channelId));
            return true;
        } catch (ConfirmInstalledPublicKeyException e) {
            logFault("confirmInstalledPublicKey", e.getFaultInfo());
        } catch (InterfaceUnavailableException e) {
            logFault("confirmInstalledPublicKey (interface unavailable)", e.getFaultInfo());
        } catch (WebServiceException e) {
            System.err.println("confirmInstalledPublicKey: technical error: " + e.getMessage());
        }
        return false;
    }

    static Distributor distributor(String channelId) {
        Distributor distributor = new Distributor();
        distributor.setChannelID(channelId);
        return distributor;
    }

    /** Every fault of the WSDL extends Commons/Exception:Fault (code, label, details). */
    static void logFault(String operation, Fault fault) {
        if (fault == null) {
            System.err.println(operation + " failed (no fault detail)");
            return;
        }
        System.err.println(operation + " failed: code=" + fault.getCode() + " label=" + fault.getLabel());
        fault.getFaultDetail().forEach(d ->
                System.err.println("  " + d.getFieldName() + " = " + d.getFieldValue()));
    }
}
