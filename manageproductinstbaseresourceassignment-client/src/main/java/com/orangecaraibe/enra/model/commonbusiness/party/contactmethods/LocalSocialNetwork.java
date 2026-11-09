
package com.orangecaraibe.enra.model.commonbusiness.party.contactmethods;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocalSocialNetwork complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocalSocialNetwork"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods}ContactMethod"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="localApplication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalSocialNetwork", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods", propOrder = {
    "localApplication",
    "localLogin"
})
public class LocalSocialNetwork
    extends ContactMethod
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods")
    protected String localApplication;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods")
    protected String localLogin;

    /**
     * Gets the value of the localApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalApplication() {
        return localApplication;
    }

    /**
     * Sets the value of the localApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalApplication(String value) {
        this.localApplication = value;
    }

    /**
     * Gets the value of the localLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalLogin() {
        return localLogin;
    }

    /**
     * Sets the value of the localLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalLogin(String value) {
        this.localLogin = value;
    }

}
