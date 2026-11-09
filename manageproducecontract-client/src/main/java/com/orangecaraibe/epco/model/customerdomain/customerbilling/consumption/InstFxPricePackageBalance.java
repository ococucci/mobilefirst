
package com.orangecaraibe.epco.model.customerdomain.customerbilling.consumption;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.orangecaraibe.epco.model.offeringandproducts.productcatalogue.UsageType;


/**
 * <p>Java class for InstFxPricePackageBalance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstFxPricePackageBalance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usageType" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue}UsageType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="initialBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="iFPPUnitDetailedValueUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userQuotaInclusiveValueUsed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="currentBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="currentBalanceLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditInstFxPricePkgBalance" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption}CreditInstFxPricePkgBalance" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="unitLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endDateValidityPeriod" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="startDateValidityPeriod" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="credits" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption}CreditInstFxPricePkgBalance" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="balanceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inclusiveValueUsed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="localEquivalent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstFxPricePackageBalance", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption", propOrder = {
    "unitCode",
    "usageType",
    "initialBalance",
    "ifppUnitDetailedValueUsed",
    "userQuotaInclusiveValueUsed",
    "currentBalance",
    "currentBalanceLabel",
    "creditInstFxPricePkgBalance",
    "unitLabel",
    "endDateValidityPeriod",
    "startDateValidityPeriod",
    "credits",
    "balanceType",
    "inclusiveValueUsed",
    "localEquivalent"
})
public class InstFxPricePackageBalance {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected String unitCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption", nillable = true)
    protected List<UsageType> usageType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected Double initialBalance;
    @XmlElement(name = "iFPPUnitDetailedValueUsed", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected String ifppUnitDetailedValueUsed;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected Double userQuotaInclusiveValueUsed;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected Double currentBalance;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected String currentBalanceLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption", nillable = true)
    protected List<CreditInstFxPricePkgBalance> creditInstFxPricePkgBalance;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected String unitLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateValidityPeriod;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateValidityPeriod;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption", nillable = true)
    protected List<CreditInstFxPricePkgBalance> credits;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected String balanceType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected Double inclusiveValueUsed;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected Boolean localEquivalent;

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
     * Gets the value of the usageType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usageType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsageType }
     * 
     * 
     */
    public List<UsageType> getUsageType() {
        if (usageType == null) {
            usageType = new ArrayList<UsageType>();
        }
        return this.usageType;
    }

    /**
     * Gets the value of the initialBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInitialBalance() {
        return initialBalance;
    }

    /**
     * Sets the value of the initialBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInitialBalance(Double value) {
        this.initialBalance = value;
    }

    /**
     * Gets the value of the ifppUnitDetailedValueUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIFPPUnitDetailedValueUsed() {
        return ifppUnitDetailedValueUsed;
    }

    /**
     * Sets the value of the ifppUnitDetailedValueUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIFPPUnitDetailedValueUsed(String value) {
        this.ifppUnitDetailedValueUsed = value;
    }

    /**
     * Gets the value of the userQuotaInclusiveValueUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUserQuotaInclusiveValueUsed() {
        return userQuotaInclusiveValueUsed;
    }

    /**
     * Sets the value of the userQuotaInclusiveValueUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUserQuotaInclusiveValueUsed(Double value) {
        this.userQuotaInclusiveValueUsed = value;
    }

    /**
     * Gets the value of the currentBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Sets the value of the currentBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCurrentBalance(Double value) {
        this.currentBalance = value;
    }

    /**
     * Gets the value of the currentBalanceLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentBalanceLabel() {
        return currentBalanceLabel;
    }

    /**
     * Sets the value of the currentBalanceLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentBalanceLabel(String value) {
        this.currentBalanceLabel = value;
    }

    /**
     * Gets the value of the creditInstFxPricePkgBalance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditInstFxPricePkgBalance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditInstFxPricePkgBalance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditInstFxPricePkgBalance }
     * 
     * 
     */
    public List<CreditInstFxPricePkgBalance> getCreditInstFxPricePkgBalance() {
        if (creditInstFxPricePkgBalance == null) {
            creditInstFxPricePkgBalance = new ArrayList<CreditInstFxPricePkgBalance>();
        }
        return this.creditInstFxPricePkgBalance;
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
     * Gets the value of the endDateValidityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateValidityPeriod() {
        return endDateValidityPeriod;
    }

    /**
     * Sets the value of the endDateValidityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDateValidityPeriod(XMLGregorianCalendar value) {
        this.endDateValidityPeriod = value;
    }

    /**
     * Gets the value of the startDateValidityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateValidityPeriod() {
        return startDateValidityPeriod;
    }

    /**
     * Sets the value of the startDateValidityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateValidityPeriod(XMLGregorianCalendar value) {
        this.startDateValidityPeriod = value;
    }

    /**
     * Gets the value of the credits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the credits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCredits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditInstFxPricePkgBalance }
     * 
     * 
     */
    public List<CreditInstFxPricePkgBalance> getCredits() {
        if (credits == null) {
            credits = new ArrayList<CreditInstFxPricePkgBalance>();
        }
        return this.credits;
    }

    /**
     * Gets the value of the balanceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceType() {
        return balanceType;
    }

    /**
     * Sets the value of the balanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceType(String value) {
        this.balanceType = value;
    }

    /**
     * Gets the value of the inclusiveValueUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInclusiveValueUsed() {
        return inclusiveValueUsed;
    }

    /**
     * Sets the value of the inclusiveValueUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInclusiveValueUsed(Double value) {
        this.inclusiveValueUsed = value;
    }

    /**
     * Gets the value of the localEquivalent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalEquivalent() {
        return localEquivalent;
    }

    /**
     * Sets the value of the localEquivalent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalEquivalent(Boolean value) {
        this.localEquivalent = value;
    }

}
