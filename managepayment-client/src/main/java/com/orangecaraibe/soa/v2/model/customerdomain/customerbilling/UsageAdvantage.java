
package com.orangecaraibe.soa.v2.model.customerdomain.customerbilling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UsageAdvantage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsageAdvantage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="usageAdvantageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usageAdvantageDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usageAdvantageUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usageAdvantageUnitLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="previousPeriodEarnedValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="earnedValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nextEarnedValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isAvailableInCurrentPeriod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="usePeriodValidityStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="usePeriodValidityEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsageAdvantage", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", propOrder = {
    "usageAdvantageID",
    "usageAdvantageDescription",
    "usageAdvantageUnitCode",
    "usageAdvantageUnitLabel",
    "previousPeriodEarnedValue",
    "earnedValue",
    "nextEarnedValue",
    "isAvailableInCurrentPeriod",
    "usePeriodValidityStartDate",
    "usePeriodValidityEndDate"
})
public class UsageAdvantage {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected String usageAdvantageID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected String usageAdvantageDescription;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected String usageAdvantageUnitCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected String usageAdvantageUnitLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected String previousPeriodEarnedValue;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected String earnedValue;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected String nextEarnedValue;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected Boolean isAvailableInCurrentPeriod;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar usePeriodValidityStartDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar usePeriodValidityEndDate;

    /**
     * Gets the value of the usageAdvantageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageAdvantageID() {
        return usageAdvantageID;
    }

    /**
     * Sets the value of the usageAdvantageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageAdvantageID(String value) {
        this.usageAdvantageID = value;
    }

    /**
     * Gets the value of the usageAdvantageDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageAdvantageDescription() {
        return usageAdvantageDescription;
    }

    /**
     * Sets the value of the usageAdvantageDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageAdvantageDescription(String value) {
        this.usageAdvantageDescription = value;
    }

    /**
     * Gets the value of the usageAdvantageUnitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageAdvantageUnitCode() {
        return usageAdvantageUnitCode;
    }

    /**
     * Sets the value of the usageAdvantageUnitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageAdvantageUnitCode(String value) {
        this.usageAdvantageUnitCode = value;
    }

    /**
     * Gets the value of the usageAdvantageUnitLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageAdvantageUnitLabel() {
        return usageAdvantageUnitLabel;
    }

    /**
     * Sets the value of the usageAdvantageUnitLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageAdvantageUnitLabel(String value) {
        this.usageAdvantageUnitLabel = value;
    }

    /**
     * Gets the value of the previousPeriodEarnedValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousPeriodEarnedValue() {
        return previousPeriodEarnedValue;
    }

    /**
     * Sets the value of the previousPeriodEarnedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousPeriodEarnedValue(String value) {
        this.previousPeriodEarnedValue = value;
    }

    /**
     * Gets the value of the earnedValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarnedValue() {
        return earnedValue;
    }

    /**
     * Sets the value of the earnedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarnedValue(String value) {
        this.earnedValue = value;
    }

    /**
     * Gets the value of the nextEarnedValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextEarnedValue() {
        return nextEarnedValue;
    }

    /**
     * Sets the value of the nextEarnedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextEarnedValue(String value) {
        this.nextEarnedValue = value;
    }

    /**
     * Gets the value of the isAvailableInCurrentPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAvailableInCurrentPeriod() {
        return isAvailableInCurrentPeriod;
    }

    /**
     * Sets the value of the isAvailableInCurrentPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAvailableInCurrentPeriod(Boolean value) {
        this.isAvailableInCurrentPeriod = value;
    }

    /**
     * Gets the value of the usePeriodValidityStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUsePeriodValidityStartDate() {
        return usePeriodValidityStartDate;
    }

    /**
     * Sets the value of the usePeriodValidityStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUsePeriodValidityStartDate(XMLGregorianCalendar value) {
        this.usePeriodValidityStartDate = value;
    }

    /**
     * Gets the value of the usePeriodValidityEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUsePeriodValidityEndDate() {
        return usePeriodValidityEndDate;
    }

    /**
     * Sets the value of the usePeriodValidityEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUsePeriodValidityEndDate(XMLGregorianCalendar value) {
        this.usePeriodValidityEndDate = value;
    }

}
