
package com.orangecaraibe.enra.model.customerdomain.customerbilling.rating;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.orangecaraibe.enra.model.customerdomain.customerbilling.UsageAdvantage;


/**
 * <p>Java class for UsageThreshold complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsageThreshold"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="usageThresholdID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usageThresholdDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usageType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="usageThresholdUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usageThresholdUnitLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usageValueUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usageStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="usageEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="reachedUsageThreshold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isMaxUsageThreshold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="nextUsageThresholdValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nextUsageThresholdToReach" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="previousPeriodValueUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="previousPeriodReachedThreshold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usageAdvantage" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}UsageAdvantage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsageThreshold", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", propOrder = {
    "usageThresholdID",
    "usageThresholdDescription",
    "usageType",
    "usageThresholdUnitCode",
    "usageThresholdUnitLabel",
    "usageValueUsed",
    "usageStartDate",
    "usageEndDate",
    "reachedUsageThreshold",
    "isMaxUsageThreshold",
    "nextUsageThresholdValue",
    "nextUsageThresholdToReach",
    "previousPeriodValueUsed",
    "previousPeriodReachedThreshold",
    "usageAdvantage"
})
public class UsageThreshold {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String usageThresholdID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String usageThresholdDescription;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", nillable = true)
    protected List<String> usageType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String usageThresholdUnitCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String usageThresholdUnitLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String usageValueUsed;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar usageStartDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar usageEndDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String reachedUsageThreshold;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected Boolean isMaxUsageThreshold;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String nextUsageThresholdValue;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String nextUsageThresholdToReach;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String previousPeriodValueUsed;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String previousPeriodReachedThreshold;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", nillable = true)
    protected List<UsageAdvantage> usageAdvantage;

    /**
     * Gets the value of the usageThresholdID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageThresholdID() {
        return usageThresholdID;
    }

    /**
     * Sets the value of the usageThresholdID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageThresholdID(String value) {
        this.usageThresholdID = value;
    }

    /**
     * Gets the value of the usageThresholdDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageThresholdDescription() {
        return usageThresholdDescription;
    }

    /**
     * Sets the value of the usageThresholdDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageThresholdDescription(String value) {
        this.usageThresholdDescription = value;
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
     * {@link String }
     * 
     * 
     */
    public List<String> getUsageType() {
        if (usageType == null) {
            usageType = new ArrayList<String>();
        }
        return this.usageType;
    }

    /**
     * Gets the value of the usageThresholdUnitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageThresholdUnitCode() {
        return usageThresholdUnitCode;
    }

    /**
     * Sets the value of the usageThresholdUnitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageThresholdUnitCode(String value) {
        this.usageThresholdUnitCode = value;
    }

    /**
     * Gets the value of the usageThresholdUnitLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageThresholdUnitLabel() {
        return usageThresholdUnitLabel;
    }

    /**
     * Sets the value of the usageThresholdUnitLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageThresholdUnitLabel(String value) {
        this.usageThresholdUnitLabel = value;
    }

    /**
     * Gets the value of the usageValueUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageValueUsed() {
        return usageValueUsed;
    }

    /**
     * Sets the value of the usageValueUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageValueUsed(String value) {
        this.usageValueUsed = value;
    }

    /**
     * Gets the value of the usageStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUsageStartDate() {
        return usageStartDate;
    }

    /**
     * Sets the value of the usageStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUsageStartDate(XMLGregorianCalendar value) {
        this.usageStartDate = value;
    }

    /**
     * Gets the value of the usageEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUsageEndDate() {
        return usageEndDate;
    }

    /**
     * Sets the value of the usageEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUsageEndDate(XMLGregorianCalendar value) {
        this.usageEndDate = value;
    }

    /**
     * Gets the value of the reachedUsageThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReachedUsageThreshold() {
        return reachedUsageThreshold;
    }

    /**
     * Sets the value of the reachedUsageThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReachedUsageThreshold(String value) {
        this.reachedUsageThreshold = value;
    }

    /**
     * Gets the value of the isMaxUsageThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMaxUsageThreshold() {
        return isMaxUsageThreshold;
    }

    /**
     * Sets the value of the isMaxUsageThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMaxUsageThreshold(Boolean value) {
        this.isMaxUsageThreshold = value;
    }

    /**
     * Gets the value of the nextUsageThresholdValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextUsageThresholdValue() {
        return nextUsageThresholdValue;
    }

    /**
     * Sets the value of the nextUsageThresholdValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextUsageThresholdValue(String value) {
        this.nextUsageThresholdValue = value;
    }

    /**
     * Gets the value of the nextUsageThresholdToReach property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextUsageThresholdToReach() {
        return nextUsageThresholdToReach;
    }

    /**
     * Sets the value of the nextUsageThresholdToReach property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextUsageThresholdToReach(String value) {
        this.nextUsageThresholdToReach = value;
    }

    /**
     * Gets the value of the previousPeriodValueUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousPeriodValueUsed() {
        return previousPeriodValueUsed;
    }

    /**
     * Sets the value of the previousPeriodValueUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousPeriodValueUsed(String value) {
        this.previousPeriodValueUsed = value;
    }

    /**
     * Gets the value of the previousPeriodReachedThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousPeriodReachedThreshold() {
        return previousPeriodReachedThreshold;
    }

    /**
     * Sets the value of the previousPeriodReachedThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousPeriodReachedThreshold(String value) {
        this.previousPeriodReachedThreshold = value;
    }

    /**
     * Gets the value of the usageAdvantage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usageAdvantage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageAdvantage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsageAdvantage }
     * 
     * 
     */
    public List<UsageAdvantage> getUsageAdvantage() {
        if (usageAdvantage == null) {
            usageAdvantage = new ArrayList<UsageAdvantage>();
        }
        return this.usageAdvantage;
    }

}
