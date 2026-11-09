
package com.orangecaraibe.soa.v2.model.customerdomain.customerloyalty;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.orangecaraibe.soa.v2.model.customerdomain.customerloyalty package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.orangecaraibe.soa.v2.model.customerdomain.customerloyalty
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoyaltyAccount }
     * 
     */
    public LoyaltyAccount createLoyaltyAccount() {
        return new LoyaltyAccount();
    }

    /**
     * Create an instance of {@link LoyaltyBalance }
     * 
     */
    public LoyaltyBalance createLoyaltyBalance() {
        return new LoyaltyBalance();
    }

    /**
     * Create an instance of {@link LoyaltyTransaction }
     * 
     */
    public LoyaltyTransaction createLoyaltyTransaction() {
        return new LoyaltyTransaction();
    }

    /**
     * Create an instance of {@link LoyaltyBurn }
     * 
     */
    public LoyaltyBurn createLoyaltyBurn() {
        return new LoyaltyBurn();
    }

    /**
     * Create an instance of {@link LoyaltyEarn }
     * 
     */
    public LoyaltyEarn createLoyaltyEarn() {
        return new LoyaltyEarn();
    }

    /**
     * Create an instance of {@link LoyaltyAction }
     * 
     */
    public LoyaltyAction createLoyaltyAction() {
        return new LoyaltyAction();
    }

}
