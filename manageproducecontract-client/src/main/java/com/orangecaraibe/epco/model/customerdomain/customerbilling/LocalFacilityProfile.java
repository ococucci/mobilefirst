
package com.orangecaraibe.epco.model.customerdomain.customerbilling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LocalFacilityProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocalFacilityProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentFacilityEligibleDelay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="paymentFacilityEligibleSchedule" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="deferredPaymentMaxDateDelay" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="deferredPaymentMaxDateSchedule" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="maxPaymentScheduleCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="firstFacilityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="firstFacilityAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalFacilityProfile", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", propOrder = {
    "paymentFacilityEligibleDelay",
    "paymentFacilityEligibleSchedule",
    "deferredPaymentMaxDateDelay",
    "deferredPaymentMaxDateSchedule",
    "maxPaymentScheduleCount",
    "firstFacilityDate",
    "firstFacilityAmount"
})
public class LocalFacilityProfile {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected Boolean paymentFacilityEligibleDelay;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected Boolean paymentFacilityEligibleSchedule;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deferredPaymentMaxDateDelay;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deferredPaymentMaxDateSchedule;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected Integer maxPaymentScheduleCount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstFacilityDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected Float firstFacilityAmount;

    /**
     * Gets the value of the paymentFacilityEligibleDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentFacilityEligibleDelay() {
        return paymentFacilityEligibleDelay;
    }

    /**
     * Sets the value of the paymentFacilityEligibleDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentFacilityEligibleDelay(Boolean value) {
        this.paymentFacilityEligibleDelay = value;
    }

    /**
     * Gets the value of the paymentFacilityEligibleSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentFacilityEligibleSchedule() {
        return paymentFacilityEligibleSchedule;
    }

    /**
     * Sets the value of the paymentFacilityEligibleSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentFacilityEligibleSchedule(Boolean value) {
        this.paymentFacilityEligibleSchedule = value;
    }

    /**
     * Gets the value of the deferredPaymentMaxDateDelay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeferredPaymentMaxDateDelay() {
        return deferredPaymentMaxDateDelay;
    }

    /**
     * Sets the value of the deferredPaymentMaxDateDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeferredPaymentMaxDateDelay(XMLGregorianCalendar value) {
        this.deferredPaymentMaxDateDelay = value;
    }

    /**
     * Gets the value of the deferredPaymentMaxDateSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeferredPaymentMaxDateSchedule() {
        return deferredPaymentMaxDateSchedule;
    }

    /**
     * Sets the value of the deferredPaymentMaxDateSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeferredPaymentMaxDateSchedule(XMLGregorianCalendar value) {
        this.deferredPaymentMaxDateSchedule = value;
    }

    /**
     * Gets the value of the maxPaymentScheduleCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxPaymentScheduleCount() {
        return maxPaymentScheduleCount;
    }

    /**
     * Sets the value of the maxPaymentScheduleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxPaymentScheduleCount(Integer value) {
        this.maxPaymentScheduleCount = value;
    }

    /**
     * Gets the value of the firstFacilityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstFacilityDate() {
        return firstFacilityDate;
    }

    /**
     * Sets the value of the firstFacilityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstFacilityDate(XMLGregorianCalendar value) {
        this.firstFacilityDate = value;
    }

    /**
     * Gets the value of the firstFacilityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFirstFacilityAmount() {
        return firstFacilityAmount;
    }

    /**
     * Sets the value of the firstFacilityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFirstFacilityAmount(Float value) {
        this.firstFacilityAmount = value;
    }

}
