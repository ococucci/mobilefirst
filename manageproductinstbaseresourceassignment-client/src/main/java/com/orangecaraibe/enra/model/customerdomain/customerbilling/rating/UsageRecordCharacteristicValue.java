
package com.orangecaraibe.enra.model.customerdomain.customerbilling.rating;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.enra.model.offeringandproducts.commercialcatalogue.UsageSpecCharacteristic;


/**
 * <p>Java class for UsageRecordCharacteristicValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsageRecordCharacteristicValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="usageRecordCharacteristicValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="usageSpecCharacteristic" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue}UsageSpecCharacteristic"/&gt;
 *         &lt;element name="usageRecordCharacteristicLabel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsageRecordCharacteristicValue", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", propOrder = {
    "usageRecordCharacteristicValue",
    "usageSpecCharacteristic",
    "usageRecordCharacteristicLabel"
})
public class UsageRecordCharacteristicValue {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", required = true)
    protected String usageRecordCharacteristicValue;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", required = true)
    protected UsageSpecCharacteristic usageSpecCharacteristic;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", required = true)
    protected String usageRecordCharacteristicLabel;

    /**
     * Gets the value of the usageRecordCharacteristicValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageRecordCharacteristicValue() {
        return usageRecordCharacteristicValue;
    }

    /**
     * Sets the value of the usageRecordCharacteristicValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageRecordCharacteristicValue(String value) {
        this.usageRecordCharacteristicValue = value;
    }

    /**
     * Gets the value of the usageSpecCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link UsageSpecCharacteristic }
     *     
     */
    public UsageSpecCharacteristic getUsageSpecCharacteristic() {
        return usageSpecCharacteristic;
    }

    /**
     * Sets the value of the usageSpecCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageSpecCharacteristic }
     *     
     */
    public void setUsageSpecCharacteristic(UsageSpecCharacteristic value) {
        this.usageSpecCharacteristic = value;
    }

    /**
     * Gets the value of the usageRecordCharacteristicLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageRecordCharacteristicLabel() {
        return usageRecordCharacteristicLabel;
    }

    /**
     * Sets the value of the usageRecordCharacteristicLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageRecordCharacteristicLabel(String value) {
        this.usageRecordCharacteristicLabel = value;
    }

}
