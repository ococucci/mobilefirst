
package com.orangecaraibe.epco.model.offeringandproducts.productcatalogue;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UsageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="usageTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="usageTypeLabel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="usageTypeCat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsageType", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue", propOrder = {
    "usageTypeCode",
    "usageTypeLabel",
    "usageTypeCat"
})
public class UsageType {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue", required = true)
    protected String usageTypeCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue", required = true)
    protected String usageTypeLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue", required = true)
    protected String usageTypeCat;

    /**
     * Gets the value of the usageTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageTypeCode() {
        return usageTypeCode;
    }

    /**
     * Sets the value of the usageTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageTypeCode(String value) {
        this.usageTypeCode = value;
    }

    /**
     * Gets the value of the usageTypeLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageTypeLabel() {
        return usageTypeLabel;
    }

    /**
     * Sets the value of the usageTypeLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageTypeLabel(String value) {
        this.usageTypeLabel = value;
    }

    /**
     * Gets the value of the usageTypeCat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageTypeCat() {
        return usageTypeCat;
    }

    /**
     * Sets the value of the usageTypeCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageTypeCat(String value) {
        this.usageTypeCat = value;
    }

}
