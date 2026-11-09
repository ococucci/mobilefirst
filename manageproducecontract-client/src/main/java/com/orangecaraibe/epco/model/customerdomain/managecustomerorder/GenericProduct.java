
package com.orangecaraibe.epco.model.customerdomain.managecustomerorder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenericProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericProduct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="genericProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericProduct", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", propOrder = {
    "genericProductCode"
})
public class GenericProduct {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String genericProductCode;

    /**
     * Gets the value of the genericProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenericProductCode() {
        return genericProductCode;
    }

    /**
     * Sets the value of the genericProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenericProductCode(String value) {
        this.genericProductCode = value;
    }

}
