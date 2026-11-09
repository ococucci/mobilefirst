
package com.orangecaraibe.soa.v2.model.customerdomain.invoicing;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.orangecaraibe.soa.v2.model.customerdomain.invoicing package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.orangecaraibe.soa.v2.model.customerdomain.invoicing
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Invoice }
     * 
     */
    public Invoice createInvoice() {
        return new Invoice();
    }

    /**
     * Create an instance of {@link InvoiceStatus }
     * 
     */
    public InvoiceStatus createInvoiceStatus() {
        return new InvoiceStatus();
    }

    /**
     * Create an instance of {@link InvoiceImage }
     * 
     */
    public InvoiceImage createInvoiceImage() {
        return new InvoiceImage();
    }

    /**
     * Create an instance of {@link Period }
     * 
     */
    public Period createPeriod() {
        return new Period();
    }

    /**
     * Create an instance of {@link InvoiceItem }
     * 
     */
    public InvoiceItem createInvoiceItem() {
        return new InvoiceItem();
    }

    /**
     * Create an instance of {@link Lettering }
     * 
     */
    public Lettering createLettering() {
        return new Lettering();
    }

    /**
     * Create an instance of {@link Contains }
     * 
     */
    public Contains createContains() {
        return new Contains();
    }

}
