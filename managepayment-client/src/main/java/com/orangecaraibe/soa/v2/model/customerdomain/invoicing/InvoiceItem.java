
package com.orangecaraibe.soa.v2.model.customerdomain.invoicing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.soa.v2.model.customerdomain.customerbilling.rating.AppliedCharge;
import com.orangecaraibe.soa.v2.model.offeringandproducts.commercialinstalledbase.InstalledOffer;
import com.orangecaraibe.soa.v2.model.offeringandproducts.productinstalledbase.InstalledProduct;


/**
 * <p>Java class for InvoiceItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="invoiceDomainSpecLabel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="invoiceItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxIncludedAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="dutyFreeAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="nonTaxAppliedChargeAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="taxRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="appliedCharge" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating}AppliedCharge"/&gt;
 *         &lt;element name="installedOffer" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase}InstalledOffer" minOccurs="0"/&gt;
 *         &lt;element name="installedProduct" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase}InstalledProduct" minOccurs="0"/&gt;
 *         &lt;element name="period" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing}Period" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceItem", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing", propOrder = {
    "invoiceDomainSpecLabel",
    "invoiceItemLabel",
    "level",
    "taxIncludedAmount",
    "dutyFreeAmount",
    "nonTaxAppliedChargeAmount",
    "taxRate",
    "appliedCharge",
    "installedOffer",
    "installedProduct",
    "period"
})
public class InvoiceItem {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing", required = true)
    protected String invoiceDomainSpecLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    protected String invoiceItemLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing", required = true)
    protected String level;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    protected Float taxIncludedAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    protected Float dutyFreeAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    protected Float nonTaxAppliedChargeAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    protected Float taxRate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing", required = true)
    protected AppliedCharge appliedCharge;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    protected InstalledOffer installedOffer;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    protected InstalledProduct installedProduct;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    protected Period period;

    /**
     * Gets the value of the invoiceDomainSpecLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceDomainSpecLabel() {
        return invoiceDomainSpecLabel;
    }

    /**
     * Sets the value of the invoiceDomainSpecLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceDomainSpecLabel(String value) {
        this.invoiceDomainSpecLabel = value;
    }

    /**
     * Gets the value of the invoiceItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceItemLabel() {
        return invoiceItemLabel;
    }

    /**
     * Sets the value of the invoiceItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceItemLabel(String value) {
        this.invoiceItemLabel = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel(String value) {
        this.level = value;
    }

    /**
     * Gets the value of the taxIncludedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTaxIncludedAmount() {
        return taxIncludedAmount;
    }

    /**
     * Sets the value of the taxIncludedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTaxIncludedAmount(Float value) {
        this.taxIncludedAmount = value;
    }

    /**
     * Gets the value of the dutyFreeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDutyFreeAmount() {
        return dutyFreeAmount;
    }

    /**
     * Sets the value of the dutyFreeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDutyFreeAmount(Float value) {
        this.dutyFreeAmount = value;
    }

    /**
     * Gets the value of the nonTaxAppliedChargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNonTaxAppliedChargeAmount() {
        return nonTaxAppliedChargeAmount;
    }

    /**
     * Sets the value of the nonTaxAppliedChargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNonTaxAppliedChargeAmount(Float value) {
        this.nonTaxAppliedChargeAmount = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTaxRate(Float value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the appliedCharge property.
     * 
     * @return
     *     possible object is
     *     {@link AppliedCharge }
     *     
     */
    public AppliedCharge getAppliedCharge() {
        return appliedCharge;
    }

    /**
     * Sets the value of the appliedCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppliedCharge }
     *     
     */
    public void setAppliedCharge(AppliedCharge value) {
        this.appliedCharge = value;
    }

    /**
     * Gets the value of the installedOffer property.
     * 
     * @return
     *     possible object is
     *     {@link InstalledOffer }
     *     
     */
    public InstalledOffer getInstalledOffer() {
        return installedOffer;
    }

    /**
     * Sets the value of the installedOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstalledOffer }
     *     
     */
    public void setInstalledOffer(InstalledOffer value) {
        this.installedOffer = value;
    }

    /**
     * Gets the value of the installedProduct property.
     * 
     * @return
     *     possible object is
     *     {@link InstalledProduct }
     *     
     */
    public InstalledProduct getInstalledProduct() {
        return installedProduct;
    }

    /**
     * Sets the value of the installedProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstalledProduct }
     *     
     */
    public void setInstalledProduct(InstalledProduct value) {
        this.installedProduct = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setPeriod(Period value) {
        this.period = value;
    }

}
