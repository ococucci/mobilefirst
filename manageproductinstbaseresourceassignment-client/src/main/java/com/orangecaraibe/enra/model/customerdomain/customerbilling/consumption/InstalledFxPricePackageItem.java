
package com.orangecaraibe.enra.model.customerdomain.customerbilling.consumption;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.orangecaraibe.enra.model.commonbusiness.party.paymentmeans.Period;
import com.orangecaraibe.enra.model.customerdomain.customerbilling.rating.AppliedCharge;
import com.orangecaraibe.enra.model.offeringandproducts.commercialinstalledbase.InstalledOffer;
import com.orangecaraibe.enra.model.offeringandproducts.productinstalledbase.InstalledProduct;


/**
 * <p>Java class for InstalledFxPricePackageItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstalledFxPricePackageItem"&gt;
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
 *         &lt;element name="reinitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="chargingValue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="rolloverValue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="droppedValue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="initialBalance" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="initialExtraBenefitsValue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="finalBalance" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="totalConditionalBenefitsValue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="inclusiveValueUsed" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="nonInclusiveValueUsed" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="nextPeriodInitialBalance" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="nextInitialExtraBenefitsValue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
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
@XmlType(name = "InstalledFxPricePackageItem", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption", propOrder = {
    "invoiceItemLabel",
    "level",
    "taxIncludedAmount",
    "dutyFreeAmount",
    "nonTaxAppliedChargeAmoun",
    "taxRate",
    "unitCode",
    "unitLabel",
    "reinitDate",
    "chargingValue",
    "rolloverValue",
    "droppedValue",
    "initialBalance",
    "initialExtraBenefitsValue",
    "finalBalance",
    "totalConditionalBenefitsValue",
    "inclusiveValueUsed",
    "nonInclusiveValueUsed",
    "nextPeriodInitialBalance",
    "nextInitialExtraBenefitsValue",
    "appliedCharge",
    "installedOffer",
    "installedProduct",
    "period"
})
public class InstalledFxPricePackageItem {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected String invoiceItemLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption", required = true)
    protected String level;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected Float taxIncludedAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected Float dutyFreeAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected Float nonTaxAppliedChargeAmoun;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected Float taxRate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected String unitCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected String unitLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reinitDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected Float chargingValue;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected Float rolloverValue;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected Float droppedValue;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected Float initialBalance;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected Float initialExtraBenefitsValue;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected Float finalBalance;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected Float totalConditionalBenefitsValue;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected Float inclusiveValueUsed;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected Float nonInclusiveValueUsed;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected Float nextPeriodInitialBalance;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected Float nextInitialExtraBenefitsValue;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption", required = true)
    protected AppliedCharge appliedCharge;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected InstalledOffer installedOffer;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected InstalledProduct installedProduct;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
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
     * Gets the value of the reinitDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReinitDate() {
        return reinitDate;
    }

    /**
     * Sets the value of the reinitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReinitDate(XMLGregorianCalendar value) {
        this.reinitDate = value;
    }

    /**
     * Gets the value of the chargingValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getChargingValue() {
        return chargingValue;
    }

    /**
     * Sets the value of the chargingValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setChargingValue(Float value) {
        this.chargingValue = value;
    }

    /**
     * Gets the value of the rolloverValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRolloverValue() {
        return rolloverValue;
    }

    /**
     * Sets the value of the rolloverValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRolloverValue(Float value) {
        this.rolloverValue = value;
    }

    /**
     * Gets the value of the droppedValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDroppedValue() {
        return droppedValue;
    }

    /**
     * Sets the value of the droppedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDroppedValue(Float value) {
        this.droppedValue = value;
    }

    /**
     * Gets the value of the initialBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getInitialBalance() {
        return initialBalance;
    }

    /**
     * Sets the value of the initialBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setInitialBalance(Float value) {
        this.initialBalance = value;
    }

    /**
     * Gets the value of the initialExtraBenefitsValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getInitialExtraBenefitsValue() {
        return initialExtraBenefitsValue;
    }

    /**
     * Sets the value of the initialExtraBenefitsValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setInitialExtraBenefitsValue(Float value) {
        this.initialExtraBenefitsValue = value;
    }

    /**
     * Gets the value of the finalBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFinalBalance() {
        return finalBalance;
    }

    /**
     * Sets the value of the finalBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFinalBalance(Float value) {
        this.finalBalance = value;
    }

    /**
     * Gets the value of the totalConditionalBenefitsValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTotalConditionalBenefitsValue() {
        return totalConditionalBenefitsValue;
    }

    /**
     * Sets the value of the totalConditionalBenefitsValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTotalConditionalBenefitsValue(Float value) {
        this.totalConditionalBenefitsValue = value;
    }

    /**
     * Gets the value of the inclusiveValueUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getInclusiveValueUsed() {
        return inclusiveValueUsed;
    }

    /**
     * Sets the value of the inclusiveValueUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setInclusiveValueUsed(Float value) {
        this.inclusiveValueUsed = value;
    }

    /**
     * Gets the value of the nonInclusiveValueUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNonInclusiveValueUsed() {
        return nonInclusiveValueUsed;
    }

    /**
     * Sets the value of the nonInclusiveValueUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNonInclusiveValueUsed(Float value) {
        this.nonInclusiveValueUsed = value;
    }

    /**
     * Gets the value of the nextPeriodInitialBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNextPeriodInitialBalance() {
        return nextPeriodInitialBalance;
    }

    /**
     * Sets the value of the nextPeriodInitialBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNextPeriodInitialBalance(Float value) {
        this.nextPeriodInitialBalance = value;
    }

    /**
     * Gets the value of the nextInitialExtraBenefitsValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNextInitialExtraBenefitsValue() {
        return nextInitialExtraBenefitsValue;
    }

    /**
     * Sets the value of the nextInitialExtraBenefitsValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNextInitialExtraBenefitsValue(Float value) {
        this.nextInitialExtraBenefitsValue = value;
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
