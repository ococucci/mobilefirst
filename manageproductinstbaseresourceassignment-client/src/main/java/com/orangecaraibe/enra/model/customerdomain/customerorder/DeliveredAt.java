
package com.orangecaraibe.enra.model.customerdomain.customerorder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveredAt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveredAt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveredAt", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerOrder", propOrder = {
    "address"
})
public class DeliveredAt {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerOrder", required = true)
    protected Object address;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAddress(Object value) {
        this.address = value;
    }

}
