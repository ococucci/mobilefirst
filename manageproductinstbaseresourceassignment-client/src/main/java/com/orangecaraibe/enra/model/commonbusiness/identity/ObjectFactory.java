
package com.orangecaraibe.enra.model.commonbusiness.identity;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.orangecaraibe.enra.model.commonbusiness.identity package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.orangecaraibe.enra.model.commonbusiness.identity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PartyIdentification }
     * 
     */
    public PartyIdentification createPartyIdentification() {
        return new PartyIdentification();
    }

    /**
     * Create an instance of {@link PartyRoleType }
     * 
     */
    public PartyRoleType createPartyRoleType() {
        return new PartyRoleType();
    }

    /**
     * Create an instance of {@link UserIdentity }
     * 
     */
    public UserIdentity createUserIdentity() {
        return new UserIdentity();
    }

    /**
     * Create an instance of {@link Credential }
     * 
     */
    public Credential createCredential() {
        return new Credential();
    }

    /**
     * Create an instance of {@link LoginPasswordCredential }
     * 
     */
    public LoginPasswordCredential createLoginPasswordCredential() {
        return new LoginPasswordCredential();
    }

    /**
     * Create an instance of {@link CollectiveIdentity }
     * 
     */
    public CollectiveIdentity createCollectiveIdentity() {
        return new CollectiveIdentity();
    }

    /**
     * Create an instance of {@link IndividualIdentity }
     * 
     */
    public IndividualIdentity createIndividualIdentity() {
        return new IndividualIdentity();
    }

    /**
     * Create an instance of {@link IndividualIdentityItem }
     * 
     */
    public IndividualIdentityItem createIndividualIdentityItem() {
        return new IndividualIdentityItem();
    }

}
