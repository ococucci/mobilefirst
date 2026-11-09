
package com.orangecaraibe.soa.v2.model.commonbusiness.party.contactmethods;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.orangecaraibe.soa.v2.model.commonbusiness.party.contactmethods package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.orangecaraibe.soa.v2.model.commonbusiness.party.contactmethods
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContactMethod }
     * 
     */
    public ContactMethod createContactMethod() {
        return new ContactMethod();
    }

    /**
     * Create an instance of {@link ContactMethodQuality }
     * 
     */
    public ContactMethodQuality createContactMethodQuality() {
        return new ContactMethodQuality();
    }

    /**
     * Create an instance of {@link ContactMethodStatus }
     * 
     */
    public ContactMethodStatus createContactMethodStatus() {
        return new ContactMethodStatus();
    }

    /**
     * Create an instance of {@link EmailAddress }
     * 
     */
    public EmailAddress createEmailAddress() {
        return new EmailAddress();
    }

    /**
     * Create an instance of {@link WebSite }
     * 
     */
    public WebSite createWebSite() {
        return new WebSite();
    }

    /**
     * Create an instance of {@link PhoneNumber }
     * 
     */
    public PhoneNumber createPhoneNumber() {
        return new PhoneNumber();
    }

    /**
     * Create an instance of {@link LocalSocialNetwork }
     * 
     */
    public LocalSocialNetwork createLocalSocialNetwork() {
        return new LocalSocialNetwork();
    }

    /**
     * Create an instance of {@link PostalAddress }
     * 
     */
    public PostalAddress createPostalAddress() {
        return new PostalAddress();
    }

    /**
     * Create an instance of {@link FormattedPostalAddress }
     * 
     */
    public FormattedPostalAddress createFormattedPostalAddress() {
        return new FormattedPostalAddress();
    }

    /**
     * Create an instance of {@link AddressLine }
     * 
     */
    public AddressLine createAddressLine() {
        return new AddressLine();
    }

    /**
     * Create an instance of {@link ContactMethodStatusOrigin }
     * 
     */
    public ContactMethodStatusOrigin createContactMethodStatusOrigin() {
        return new ContactMethodStatusOrigin();
    }

}
