
package com.orangecaraibe.enra.model.customerdomain.customerbilling.rating;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.enra.model.commonbusiness.party.paymentmeans.Period;
import com.orangecaraibe.enra.model.offeringandproducts.commercialinstalledbase.InstalledOffer;
import com.orangecaraibe.enra.model.offeringandproducts.productinstalledbase.InstalledProduct;


/**
 * <p>Java class for AppliedProductRatedChargeItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppliedProductRatedChargeItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="invoiceItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxIncludedAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="dutyFreeAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="nonTaxAppliedChargeAmoun" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="taxRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="unitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitNumber" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usageClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appliedCharge" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating}AppliedCharge"/&gt;
 *         &lt;element name="installedOffer" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase}InstalledOffer" minOccurs="0"/&gt;
 *         &lt;element name="installedProduct" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase}InstalledProduct" minOccurs="0"/&gt;
 *         &lt;element name="period" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans}Period" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppliedProductRatedChargeItem", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", propOrder = {
    "invoiceItemLabel",
    "level",
    "taxIncludedAmount",
    "dutyFreeAmount",
    "nonTaxAppliedChargeAmoun",
    "taxRate",
    "unitCode",
    "unitLabel",
    "unitNumber",
    "source",
    "destination",
    "usageClassification",
    "appliedCharge",
    "installedOffer",
    "installedProduct",
    "period"
})
public class AppliedProductRatedChargeItem {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String invoiceItemLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", required = true)
    protected String level;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected Float taxIncludedAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected Float dutyFreeAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected Float nonTaxAppliedChargeAmoun;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected Float taxRate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String unitCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String unitLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected Float unitNumber;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String source;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String destination;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String usageClassification;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", required = true)
    protected AppliedCharge appliedCharge;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected InstalledOffer installedOffer;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected InstalledProduct installedProduct;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected Period period;

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
     * Gets the value of the nonTaxAppliedChargeAmoun property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNonTaxAppliedChargeAmoun() {
        return nonTaxAppliedChargeAmoun;
    }

    /**
     * Sets the value of the nonTaxAppliedChargeAmoun property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNonTaxAppliedChargeAmoun(Float value) {
        this.nonTaxAppliedChargeAmoun = value;
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
     * Gets the value of the unitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getUnitNumber() {
        return unitNumber;
    }

    /**
     * Sets the value of the unitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setUnitNumber(Float value) {
        this.unitNumber = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the usageClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageClassification() {
        return usageClassification;
    }

    /**
     * Sets the value of the usageClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageClassification(String value) {
        this.usageClassification = value;
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
