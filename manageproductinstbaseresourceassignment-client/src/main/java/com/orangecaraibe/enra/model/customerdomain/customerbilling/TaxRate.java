
package com.orangecaraibe.enra.model.customerdomain.customerbilling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxRate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="taxRateCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxRateLabel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxRate" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="vatCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxRate", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", propOrder = {
    "taxRateCode",
    "taxRateLabel",
    "taxRate",
    "vatCode"
})
public class TaxRate {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", required = true)
    protected String taxRateCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", required = true)
    protected String taxRateLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected float taxRate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", required = true)
    protected String vatCode;

    /**
     * Gets the value of the taxRateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRateCode() {
        return taxRateCode;
    }

    /**
     * Sets the value of the taxRateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRateCode(String value) {
        this.taxRateCode = value;
    }

    /**
     * Gets the value of the taxRateLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRateLabel() {
        return taxRateLabel;
    }

    /**
     * Sets the value of the taxRateLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRateLabel(String value) {
        this.taxRateLabel = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     */
    public float getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     */
    public void setTaxRate(float value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the vatCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatCode() {
        return vatCode;
    }

    /**
     * Sets the value of the vatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatCode(String value) {
        this.vatCode = value;
    }

}
