
package com.orangecaraibe.enra.model.customerdomain.customerbilling.rating;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxAmountDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxAmountDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="taxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="taxBaseAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="detailedTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAmountDetails", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", propOrder = {
    "taxType",
    "taxRate",
    "taxBaseAmount",
    "detailedTaxAmount"
})
public class TaxAmountDetails {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String taxType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected Double taxRate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected Double taxBaseAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected Double detailedTaxAmount;

    /**
     * Gets the value of the taxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxType() {
        return taxType;
    }

    /**
     * Sets the value of the taxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxType(String value) {
        this.taxType = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxRate(Double value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the taxBaseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxBaseAmount() {
        return taxBaseAmount;
    }

    /**
     * Sets the value of the taxBaseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxBaseAmount(Double value) {
        this.taxBaseAmount = value;
    }

    /**
     * Gets the value of the detailedTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDetailedTaxAmount() {
        return detailedTaxAmount;
    }

    /**
     * Sets the value of the detailedTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDetailedTaxAmount(Double value) {
        this.detailedTaxAmount = value;
    }

}
