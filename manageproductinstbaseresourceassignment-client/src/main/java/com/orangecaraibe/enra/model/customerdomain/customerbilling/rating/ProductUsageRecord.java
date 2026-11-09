
package com.orangecaraibe.enra.model.customerdomain.customerbilling.rating;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductUsageRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductUsageRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="usageRecordCharacteristicValue" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating}UsageRecordCharacteristicValue" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductUsageRecord", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", propOrder = {
    "usageRecordCharacteristicValue"
})
public class ProductUsageRecord {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", required = true)
    protected List<UsageRecordCharacteristicValue> usageRecordCharacteristicValue;

    /**
     * Gets the value of the usageRecordCharacteristicValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usageRecordCharacteristicValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageRecordCharacteristicValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsageRecordCharacteristicValue }
     * 
     * 
     */
    public List<UsageRecordCharacteristicValue> getUsageRecordCharacteristicValue() {
        if (usageRecordCharacteristicValue == null) {
            usageRecordCharacteristicValue = new ArrayList<UsageRecordCharacteristicValue>();
        }
        return this.usageRecordCharacteristicValue;
    }

}
