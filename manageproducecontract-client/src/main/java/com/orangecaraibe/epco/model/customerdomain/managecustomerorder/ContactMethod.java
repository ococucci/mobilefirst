
package com.orangecaraibe.epco.model.customerdomain.managecustomerorder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactMethod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactMethod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactMethodID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="temporary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="deliveryReceiver" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}DeliveryReceiver" minOccurs="0"/&gt;
 *         &lt;element name="prefContactMethod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactMethod", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", propOrder = {
    "contactMethodID",
    "temporary",
    "deliveryReceiver",
    "prefContactMethod"
})
@XmlSeeAlso({
    EmailAddress.class,
    Address.class,
    PhoneNumber.class
})
public class ContactMethod {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String contactMethodID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected Boolean temporary;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected DeliveryReceiver deliveryReceiver;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected Boolean prefContactMethod;

    /**
     * Gets the value of the contactMethodID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactMethodID() {
        return contactMethodID;
    }

    /**
     * Sets the value of the contactMethodID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactMethodID(String value) {
        this.contactMethodID = value;
    }

    /**
     * Gets the value of the temporary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTemporary() {
        return temporary;
    }

    /**
     * Sets the value of the temporary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTemporary(Boolean value) {
        this.temporary = value;
    }

    /**
     * Gets the value of the deliveryReceiver property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryReceiver }
     *     
     */
    public DeliveryReceiver getDeliveryReceiver() {
        return deliveryReceiver;
    }

    /**
     * Sets the value of the deliveryReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryReceiver }
     *     
     */
    public void setDeliveryReceiver(DeliveryReceiver value) {
        this.deliveryReceiver = value;
    }

    /**
     * Gets the value of the prefContactMethod property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrefContactMethod() {
        return prefContactMethod;
    }

    /**
     * Sets the value of the prefContactMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrefContactMethod(Boolean value) {
        this.prefContactMethod = value;
    }

}
