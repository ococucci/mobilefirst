
package com.orangecaraibe.enra.model.commonbusiness.party.contactmethods;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmailAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods}ContactMethod"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eMailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailAddress", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods", propOrder = {
    "eMailAddress"
})
public class EmailAddress
    extends ContactMethod
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods", required = true)
    protected String eMailAddress;

    /**
     * Gets the value of the eMailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMailAddress() {
        return eMailAddress;
    }

    /**
     * Sets the value of the eMailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMailAddress(String value) {
        this.eMailAddress = value;
    }

}
