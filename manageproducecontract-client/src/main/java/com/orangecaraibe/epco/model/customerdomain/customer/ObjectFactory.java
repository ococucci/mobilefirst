
package com.orangecaraibe.epco.model.customerdomain.customer;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.orangecaraibe.epco.model.customerdomain.customer package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.orangecaraibe.epco.model.customerdomain.customer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Holder }
     * 
     */
    public Holder createHolder() {
        return new Holder();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link Payer }
     * 
     */
    public Payer createPayer() {
        return new Payer();
    }

    /**
     * Create an instance of {@link BillingAccountManager }
     * 
     */
    public BillingAccountManager createBillingAccountManager() {
        return new BillingAccountManager();
    }

    /**
     * Create an instance of {@link BillReceiver }
     * 
     */
    public BillReceiver createBillReceiver() {
        return new BillReceiver();
    }

    /**
     * Create an instance of {@link ManagedBy }
     * 
     */
    public ManagedBy createManagedBy() {
        return new ManagedBy();
    }

}
