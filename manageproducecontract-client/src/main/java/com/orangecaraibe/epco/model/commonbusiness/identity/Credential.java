
package com.orangecaraibe.epco.model.commonbusiness.identity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Credential complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Credential"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="credentialID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userIdentity" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity}UserIdentity"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Credential", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity", propOrder = {
    "credentialID",
    "userIdentity"
})
@XmlSeeAlso({
    LoginPasswordCredential.class
})
public class Credential {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity", required = true)
    protected String credentialID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity", required = true)
    protected UserIdentity userIdentity;

    /**
     * Gets the value of the credentialID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredentialID() {
        return credentialID;
    }

    /**
     * Sets the value of the credentialID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredentialID(String value) {
        this.credentialID = value;
    }

    /**
     * Gets the value of the userIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link UserIdentity }
     *     
     */
    public UserIdentity getUserIdentity() {
        return userIdentity;
    }

    /**
     * Sets the value of the userIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserIdentity }
     *     
     */
    public void setUserIdentity(UserIdentity value) {
        this.userIdentity = value;
    }

}
