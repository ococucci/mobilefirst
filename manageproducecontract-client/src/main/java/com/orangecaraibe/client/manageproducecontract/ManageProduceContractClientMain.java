package com.orangecaraibe.client.manageproducecontract;

import com.orangecaraibe.epco.manageproducecontract.FindAndGetException;
import com.orangecaraibe.epco.manageproducecontract.InterfaceUnavailableException;
import com.orangecaraibe.epco.manageproducecontract.ManageProduceContract;
import com.orangecaraibe.epco.manageproducecontract.ProduceContractException;
import com.orangecaraibe.epco.manageproducecontract.UpdateContractException;
import com.orangecaraibe.epco.model.commons.UseCase;
import com.orangecaraibe.epco.model.commons.criteria.Criteria;
import com.orangecaraibe.epco.model.commons.criteria.Eq;
import com.orangecaraibe.epco.model.commons.exception.Fault;
import com.orangecaraibe.epco.model.customerdomain.managecustomerorder.CustomerOrder;

import javax.xml.ws.Holder;
import javax.xml.ws.WebServiceException;
import java.util.Collections;
import java.util.List;

/**
 * Usage examples for the ManageProduceContract client.
 * <p>
 * Run with: {@code mvn compile exec:java -Dexec.args="http://epco.gitg.ms.fcm/soa/manageProduceContract"}
 * <p>
 * Property names and values used below (customerOrderID, useCase IDs, ...) are examples:
 * use the values agreed with the EPCO team.
 */
public final class ManageProduceContractClientMain {

    public static void main(String[] args) {
        String address = args.length > 0 ? args[0] : ManageProduceContractClientFactory.DEFAULT_ADDRESS;

        ManageProduceContract port = new ManageProduceContractClientFactory()
                .address(address)
                .logMessages(true)
                .create();

        List<CustomerOrder> orders = findAndGet(port, "CUSTOMER-ORDER-ID-123");
        if (!orders.isEmpty()) {
            produceContract(port, orders);
        }
    }

    /** findAndGet: search customer orders with a Criteria (here customerOrderID = id). */
    static List<CustomerOrder> findAndGet(ManageProduceContract port, String customerOrderId) {
        Eq eq = new Eq();
        eq.setProperty("customerOrderID");
        eq.setValue(customerOrderId);

        Criteria criteria = new Criteria();
        criteria.getRestrictions().add(eq);

        try {
            List<CustomerOrder> orders = port.findAndGet(criteria);
            for (CustomerOrder o : orders) {
                System.out.println("CustomerOrder " + o.getCustomerOrderID() + " version=" + o.getVersion());
            }
            return orders;
        } catch (FindAndGetException e) {
            logFault("findAndGet", e.getFaultInfo());
        } catch (InterfaceUnavailableException e) {
            logFault("findAndGet (interface unavailable)", e.getFaultInfo());
        } catch (WebServiceException e) {
            // network error, timeout, undeclared SOAP fault...
            System.err.println("findAndGet: technical error: " + e.getMessage());
        }
        return Collections.emptyList();
    }

    /**
     * produceContract: the customer orders are an IN/OUT parameter. After the call,
     * {@code holder.value} contains the orders returned by the service.
     */
    static List<CustomerOrder> produceContract(ManageProduceContract port, List<CustomerOrder> orders) {
        Holder<List<CustomerOrder>> holder = new Holder<>(orders);
        try {
            port.produceContract(holder);
            return holder.value;
        } catch (ProduceContractException e) {
            logFault("produceContract", e.getFaultInfo());
        } catch (InterfaceUnavailableException e) {
            logFault("produceContract (interface unavailable)", e.getFaultInfo());
        } catch (WebServiceException e) {
            System.err.println("produceContract: technical error: " + e.getMessage());
        }
        return null;
    }

    /** updateContract: same IN/OUT pattern, with a use case. */
    static List<CustomerOrder> updateContract(ManageProduceContract port, List<CustomerOrder> orders) {
        UseCase useCase = new UseCase();
        useCase.setUseCaseID("UPDATE_CONTRACT");

        Holder<List<CustomerOrder>> holder = new Holder<>(orders);
        try {
            port.updateContract(holder, useCase);
            return holder.value;
        } catch (UpdateContractException e) {
            logFault("updateContract", e.getFaultInfo());
        } catch (InterfaceUnavailableException e) {
            logFault("updateContract (interface unavailable)", e.getFaultInfo());
        } catch (WebServiceException e) {
            System.err.println("updateContract: technical error: " + e.getMessage());
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
