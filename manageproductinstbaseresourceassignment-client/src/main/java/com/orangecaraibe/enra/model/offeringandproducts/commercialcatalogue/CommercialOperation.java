
package com.orangecaraibe.enra.model.offeringandproducts.commercialcatalogue;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommercialOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommercialOperation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="commercialOperationType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommercialOperation", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue", propOrder = {
    "commercialOperationType"
})
public class CommercialOperation {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue", required = true)
    protected String commercialOperationType;

    /**
     * Gets the value of the commercialOperationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialOperationType() {
        return commercialOperationType;
    }

    /**
     * Sets the value of the commercialOperationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialOperationType(String value) {
        this.commercialOperationType = value;
    }

}
