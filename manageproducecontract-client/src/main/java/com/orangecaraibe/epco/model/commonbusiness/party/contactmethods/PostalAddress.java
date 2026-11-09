
package com.orangecaraibe.epco.model.commonbusiness.party.contactmethods;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.epco.model.commonbusiness.location.Address;


/**
 * <p>Java class for PostalAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostalAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Location}Address"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="postOfficeBox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cedex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isLegalAddress" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="formattedPostalAddress" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods}FormattedPostalAddress" minOccurs="0"/&gt;
 *         &lt;element name="local_isChronopostDeliverySupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddress", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods", propOrder = {
    "postOfficeBox",
    "cedex",
    "isLegalAddress",
    "formattedPostalAddress",
    "localIsChronopostDeliverySupported"
})
public class PostalAddress
    extends Address
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods")
    protected String postOfficeBox;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods")
    protected String cedex;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods")
    protected boolean isLegalAddress;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods")
    protected FormattedPostalAddress formattedPostalAddress;
    @XmlElement(name = "local_isChronopostDeliverySupported", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods")
    protected Boolean localIsChronopostDeliverySupported;

    /**
     * Gets the value of the postOfficeBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostOfficeBox() {
        return postOfficeBox;
    }

    /**
     * Sets the value of the postOfficeBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostOfficeBox(String value) {
        this.postOfficeBox = value;
    }

    /**
     * Gets the value of the cedex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCedex() {
        return cedex;
    }

    /**
     * Sets the value of the cedex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCedex(String value) {
        this.cedex = value;
    }

    /**
     * Gets the value of the isLegalAddress property.
     * 
     */
    public boolean isIsLegalAddress() {
        return isLegalAddress;
    }

    /**
     * Sets the value of the isLegalAddress property.
     * 
     */
    public void setIsLegalAddress(boolean value) {
        this.isLegalAddress = value;
    }

    /**
     * Gets the value of the formattedPostalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link FormattedPostalAddress }
     *     
     */
    public FormattedPostalAddress getFormattedPostalAddress() {
        return formattedPostalAddress;
    }

    /**
     * Sets the value of the formattedPostalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedPostalAddress }
     *     
     */
    public void setFormattedPostalAddress(FormattedPostalAddress value) {
        this.formattedPostalAddress = value;
    }

    /**
     * Gets the value of the localIsChronopostDeliverySupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalIsChronopostDeliverySupported() {
        return localIsChronopostDeliverySupported;
    }

    /**
     * Sets the value of the localIsChronopostDeliverySupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalIsChronopostDeliverySupported(Boolean value) {
        this.localIsChronopostDeliverySupported = value;
    }

}
