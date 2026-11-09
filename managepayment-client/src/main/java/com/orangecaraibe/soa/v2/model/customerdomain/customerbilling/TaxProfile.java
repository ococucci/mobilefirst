
package com.orangecaraibe.soa.v2.model.customerdomain.customerbilling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="taxProfileCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxProfileLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isDefaultTaxProfile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="taxRates" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}TaxRate" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxProfile", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", propOrder = {
    "taxProfileCode",
    "taxProfileLabel",
    "isDefaultTaxProfile",
    "taxRates"
})
public class TaxProfile {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected String taxProfileCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected String taxProfileLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected Boolean isDefaultTaxProfile;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", required = true)
    protected List<TaxRate> taxRates;

    /**
     * Gets the value of the taxProfileCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxProfileCode() {
        return taxProfileCode;
    }

    /**
     * Sets the value of the taxProfileCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxProfileCode(String value) {
        this.taxProfileCode = value;
    }

    /**
     * Gets the value of the taxProfileLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxProfileLabel() {
        return taxProfileLabel;
    }

    /**
     * Sets the value of the taxProfileLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxProfileLabel(String value) {
        this.taxProfileLabel = value;
    }

    /**
     * Gets the value of the isDefaultTaxProfile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDefaultTaxProfile() {
        return isDefaultTaxProfile;
    }

    /**
     * Sets the value of the isDefaultTaxProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDefaultTaxProfile(Boolean value) {
        this.isDefaultTaxProfile = value;
    }

    /**
     * Gets the value of the taxRates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxRates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxRates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxRate }
     * 
     * 
     */
    public List<TaxRate> getTaxRates() {
        if (taxRates == null) {
            taxRates = new ArrayList<TaxRate>();
        }
        return this.taxRates;
    }

}
