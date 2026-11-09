
package com.orangecaraibe.soa.v2.model.customerdomain.customerbilling.payment;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.orangecaraibe.soa.v2.model.customerdomain.customerbilling.payment package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.orangecaraibe.soa.v2.model.customerdomain.customerbilling.payment
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Payment }
     * 
     */
    public Payment createPayment() {
        return new Payment();
    }

    /**
     * Create an instance of {@link PaymentImage }
     * 
     */
    public PaymentImage createPaymentImage() {
        return new PaymentImage();
    }

    /**
     * Create an instance of {@link PaymentMethod }
     * 
     */
    public PaymentMethod createPaymentMethod() {
        return new PaymentMethod();
    }

    /**
     * Create an instance of {@link OverPayment }
     * 
     */
    public OverPayment createOverPayment() {
        return new OverPayment();
    }

    /**
     * Create an instance of {@link Refund }
     * 
     */
    public Refund createRefund() {
        return new Refund();
    }

    /**
     * Create an instance of {@link LocalRefundNature }
     * 
     */
    public LocalRefundNature createLocalRefundNature() {
        return new LocalRefundNature();
    }

    /**
     * Create an instance of {@link LocalRefundFamily }
     * 
     */
    public LocalRefundFamily createLocalRefundFamily() {
        return new LocalRefundFamily();
    }

    /**
     * Create an instance of {@link LocalLedgerSegment }
     * 
     */
    public LocalLedgerSegment createLocalLedgerSegment() {
        return new LocalLedgerSegment();
    }

    /**
     * Create an instance of {@link LocalWhaInformations }
     * 
     */
    public LocalWhaInformations createLocalWhaInformations() {
        return new LocalWhaInformations();
    }

    /**
     * Create an instance of {@link PaymentStatus }
     * 
     */
    public PaymentStatus createPaymentStatus() {
        return new PaymentStatus();
    }

    /**
     * Create an instance of {@link PaymentSchedule }
     * 
     */
    public PaymentSchedule createPaymentSchedule() {
        return new PaymentSchedule();
    }

    /**
     * Create an instance of {@link LocalScheduleStatusHistory }
     * 
     */
    public LocalScheduleStatusHistory createLocalScheduleStatusHistory() {
        return new LocalScheduleStatusHistory();
    }

    /**
     * Create an instance of {@link LocalPaymentType }
     * 
     */
    public LocalPaymentType createLocalPaymentType() {
        return new LocalPaymentType();
    }

    /**
     * Create an instance of {@link LocalPaymentFacility }
     * 
     */
    public LocalPaymentFacility createLocalPaymentFacility() {
        return new LocalPaymentFacility();
    }

    /**
     * Create an instance of {@link LocalPaymentFacilityStatus }
     * 
     */
    public LocalPaymentFacilityStatus createLocalPaymentFacilityStatus() {
        return new LocalPaymentFacilityStatus();
    }

    /**
     * Create an instance of {@link PaymentAuthorization }
     * 
     */
    public PaymentAuthorization createPaymentAuthorization() {
        return new PaymentAuthorization();
    }

    /**
     * Create an instance of {@link LocalRefundSpecification }
     * 
     */
    public LocalRefundSpecification createLocalRefundSpecification() {
        return new LocalRefundSpecification();
    }

}
