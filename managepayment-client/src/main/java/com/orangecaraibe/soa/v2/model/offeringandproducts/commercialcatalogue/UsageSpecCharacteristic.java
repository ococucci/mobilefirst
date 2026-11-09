
package com.orangecaraibe.soa.v2.model.offeringandproducts.commercialcatalogue;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UsageSpecCharacteristic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsageSpecCharacteristic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="usageSpecCharacteristicCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usageSpecCharacteristicLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsageSpecCharacteristic", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue", propOrder = {
    "usageSpecCharacteristicCode",
    "usageSpecCharacteristicLabel"
})
public class UsageSpecCharacteristic {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue")
    protected String usageSpecCharacteristicCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue")
    protected String usageSpecCharacteristicLabel;

    /**
     * Gets the value of the usageSpecCharacteristicCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageSpecCharacteristicCode() {
        return usageSpecCharacteristicCode;
    }

    /**
     * Sets the value of the usageSpecCharacteristicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageSpecCharacteristicCode(String value) {
        this.usageSpecCharacteristicCode = value;
    }

    /**
     * Gets the value of the usageSpecCharacteristicLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageSpecCharacteristicLabel() {
        return usageSpecCharacteristicLabel;
    }

    /**
     * Sets the value of the usageSpecCharacteristicLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageSpecCharacteristicLabel(String value) {
        this.usageSpecCharacteristicLabel = value;
    }

}
