package com.orangecaraibe.client.managepayment;

import com.orangecaraibe.soa.managepayment.DoPaymentException;
import com.orangecaraibe.soa.managepayment.FindAndGetPaymentException;
import com.orangecaraibe.soa.managepayment.FindAndGetPaymentFacilityException;
import com.orangecaraibe.soa.managepayment.InterfaceUnavailableException;
import com.orangecaraibe.soa.managepayment.ManagePayment;
import com.orangecaraibe.soa.v2.model.commonbusiness.interaction.ComputerOrNetworkEquipment;
import com.orangecaraibe.soa.v2.model.commons.UseCase;
import com.orangecaraibe.soa.v2.model.commons.criteria.Criteria;
import com.orangecaraibe.soa.v2.model.commons.criteria.Eq;
import com.orangecaraibe.soa.v2.model.commons.exception.Fault;
import com.orangecaraibe.soa.v2.model.customerdomain.customerbilling.payment.Payment;

import javax.xml.ws.Holder;
import javax.xml.ws.WebServiceException;
import java.util.List;

/**
 * Usage examples for the ManagePayment client.
 * <p>
 * Run with: {@code mvn compile exec:java -Dexec.args="http://host:8080/enabler-si-monetique/soa/managePayment"}
 * <p>
 * Property names and values used below (paymentID, useCase IDs, ...) are examples:
 * use the values agreed with the enabler-si-monetique team.
 */
public final class ManagePaymentClientMain {

    public static void main(String[] args) {
        String address = args.length > 0 ? args[0] : ManagePaymentClientFactory.DEFAULT_ADDRESS;

        ManagePayment port = new ManagePaymentClientFactory()
                .address(address)
                .logMessages(true)
                .create();

        findPayment(port, "PAYMENT-ID-123");
    }

    /** findAndGetPayment: search payments with a Criteria (here paymentID = id). */
    static List<Payment> findPayment(ManagePayment port, String paymentId) {
        Eq eq = new Eq();
        eq.setProperty("paymentID");
        eq.setValue(paymentId);

        Criteria criteria = new Criteria();
        criteria.getRestrictions().add(eq);

        try {
            List<Payment> payments = port.findAndGetPayment(criteria);
            for (Payment p : payments) {
                System.out.println("Payment " + p.getPaymentID() + " amount=" + p.getAmount());
            }
            return payments;
        } catch (FindAndGetPaymentException e) {
            logFault("findAndGetPayment", e.getFaultInfo());
        } catch (FindAndGetPaymentFacilityException e) {
            logFault("findAndGetPayment", e.getFaultInfo());
        } catch (InterfaceUnavailableException e) {
            logFault("findAndGetPayment (interface unavailable)", e.getFaultInfo());
        } catch (WebServiceException e) {
            // network error, timeout, undeclared SOAP fault...
            System.err.println("findAndGetPayment: technical error: " + e.getMessage());
        }
        return java.util.Collections.emptyList();
    }

    /**
     * doPayment: the payment is an IN/OUT parameter. After the call, {@code holder.value}
     * contains the payment returned by the service.
     */
    static Payment doPayment(ManagePayment port, Payment payment, String clientIp) {
        UseCase useCase = new UseCase();
        useCase.setUseCaseID("DO_PAYMENT");

        ComputerOrNetworkEquipment equipment = new ComputerOrNetworkEquipment();
        equipment.setName("mobilefirst");
        equipment.setDescription("ManagePayment client");
        equipment.setAddress(clientIp);

        Holder<Payment> holder = new Holder<>(payment);
        try {
            port.doPayment(useCase, holder, equipment);
            return holder.value;
        } catch (DoPaymentException e) {
            logFault("doPayment", e.getFaultInfo());
        } catch (InterfaceUnavailableException e) {
            logFault("doPayment (interface unavailable)", e.getFaultInfo());
        } catch (WebServiceException e) {
            System.err.println("doPayment: technical error: " + e.getMessage());
        }
        return null;
    }

    /** Every fault of the WSDL extends Commons/Exception:Fault (code, label, details). */
    static void logFault(String operation, Fault fault) {
        if (fault == null) {
            System.err.println(operation + " failed (no fault detail)");
            return;
        }
        System.err.println(operation + " failed: code=" + fault.getCode() + " label=" + fault.getLabel()
                + " criticity=" + fault.getLocalCriticity());
        fault.getFaultDetail().forEach(d ->
                System.err.println("  " + d.getFieldName() + " = " + d.getFieldValue()));
    }
}
