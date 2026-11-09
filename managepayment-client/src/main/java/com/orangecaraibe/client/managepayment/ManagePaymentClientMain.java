package com.orangecaraibe.client.managepayment;

import com.orangecaraibe.soa.managepayment.ManagePayment;

/**
 * Example entry point.
 * <p>
 * Run with: {@code mvn compile exec:java -Dexec.args="http://host:8080/enabler-si-monetique/soa/managePayment"}
 */
public final class ManagePaymentClientMain {

    public static void main(String[] args) {
        String address = args.length > 0 ? args[0] : ManagePaymentClientFactory.DEFAULT_ADDRESS;

        ManagePayment port = new ManagePaymentClientFactory()
                .address(address)
                .logMessages(true)
                .create();

        System.out.println("ManagePayment client ready on " + address + " -> " + port);

        // Available operations (see the generated ManagePayment interface for exact signatures):
        //   doPayment, preparePayment, executePayment, updatePayment, setPayment, cancelPayment,
        //   getPaymentAuthorization, findAndGetPayment,
        //   createPaymentFacility, findAndGetPaymentFacility, cancelPaymentFacility,
        //   executeRefund, findAndGetRefund, findAndGetRefundSpecification
        //
        // Example:
        //   try {
        //       FindAndGetPaymentResponse resp = port.findAndGetPayment(request);
        //   } catch (FindAndGetPaymentException | InterfaceUnavailableException e) {
        //       // SOAP faults declared in the WSDL
        //   }
    }
}
