
package com.orangecaraibe.epco.model.customerdomain.customerbilling.consumption;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InstFxPricePackageBalanceDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstFxPricePackageBalanceDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="usedValue" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="unusedValue" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="initialValue" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="endDateValidityPeriod" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="startDateValidityPeriod" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="currentBalanceDetailLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="currentBalanceDetailShortLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstFxPricePackageBalanceDetail", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption", propOrder = {
    "usedValue",
    "unusedValue",
    "initialValue",
    "endDateValidityPeriod",
    "startDateValidityPeriod",
    "currentBalanceDetailLabel",
    "type",
    "currentBalanceDetailShortLabel",
    "unitCode"
})
public class InstFxPricePackageBalanceDetail {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected double usedValue;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected double unusedValue;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected double initialValue;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateValidityPeriod;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateValidityPeriod;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected String currentBalanceDetailLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption", required = true)
    protected String type;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected String currentBalanceDetailShortLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption")
    protected String unitCode;

    /**
     * Gets the value of the usedValue property.
     * 
     */
    public double getUsedValue() {
        return usedValue;
    }

    /**
     * Sets the value of the usedValue property.
     * 
     */
    public void setUsedValue(double value) {
        this.usedValue = value;
    }

    /**
     * Gets the value of the unusedValue property.
     * 
     */
    public double getUnusedValue() {
        return unusedValue;
    }

    /**
     * Sets the value of the unusedValue property.
     * 
     */
    public void setUnusedValue(double value) {
        this.unusedValue = value;
    }

    /**
     * Gets the value of the initialValue property.
     * 
     */
    public double getInitialValue() {
        return initialValue;
    }

    /**
     * Sets the value of the initialValue property.
     * 
     */
    public void setInitialValue(double value) {
        this.initialValue = value;
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
     * Gets the value of the currentBalanceDetailLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentBalanceDetailLabel() {
        return currentBalanceDetailLabel;
    }

    /**
     * Sets the value of the currentBalanceDetailLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentBalanceDetailLabel(String value) {
        this.currentBalanceDetailLabel = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the currentBalanceDetailShortLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentBalanceDetailShortLabel() {
        return currentBalanceDetailShortLabel;
    }

    /**
     * Sets the value of the currentBalanceDetailShortLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentBalanceDetailShortLabel(String value) {
        this.currentBalanceDetailShortLabel = value;
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

}
