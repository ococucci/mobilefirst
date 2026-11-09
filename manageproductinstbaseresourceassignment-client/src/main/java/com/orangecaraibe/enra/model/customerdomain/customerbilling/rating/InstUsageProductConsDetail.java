
package com.orangecaraibe.enra.model.customerdomain.customerbilling.rating;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.enra.model.offeringandproducts.productcatalogue.UsageType;


/**
 * <p>Java class for InstUsageProductConsDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstUsageProductConsDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usageTypes" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue}UsageType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="valueUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxIncludedAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="dutyFreeAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="taxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstUsageProductConsDetail", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", propOrder = {
    "unitCode",
    "unitLabel",
    "usageTypes",
    "valueUsed",
    "taxIncludedAmount",
    "dutyFreeAmount",
    "taxAmount"
})
public class InstUsageProductConsDetail {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String unitCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String unitLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", nillable = true)
    protected List<UsageType> usageTypes;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String valueUsed;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected Double taxIncludedAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected Double dutyFreeAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected Double taxAmount;

    /**
     * Gets the value of the unitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * Sets the value of the unitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCode(String value) {
        this.unitCode = value;
    }

    /**
     * Gets the value of the unitLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitLabel() {
        return unitLabel;
    }

    /**
     * Sets the value of the unitLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitLabel(String value) {
        this.unitLabel = value;
    }

    /**
     * Gets the value of the usageTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usageTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsageType }
     * 
     * 
     */
    public List<UsageType> getUsageTypes() {
        if (usageTypes == null) {
            usageTypes = new ArrayList<UsageType>();
        }
        return this.usageTypes;
    }

    /**
     * Gets the value of the valueUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueUsed() {
        return valueUsed;
    }

    /**
     * Sets the value of the valueUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueUsed(String value) {
        this.valueUsed = value;
    }

    /**
     * Gets the value of the taxIncludedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxIncludedAmount() {
        return taxIncludedAmount;
    }

    /**
     * Sets the value of the taxIncludedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxIncludedAmount(Double value) {
        this.taxIncludedAmount = value;
    }

    /**
     * Gets the value of the dutyFreeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDutyFreeAmount() {
        return dutyFreeAmount;
    }

    /**
     * Sets the value of the dutyFreeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDutyFreeAmount(Double value) {
        this.dutyFreeAmount = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxAmount(Double value) {
        this.taxAmount = value;
    }

}
