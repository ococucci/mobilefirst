
package com.orangecaraibe.soa.v2.model.offeringandproducts.commercialinstalledbase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Commitment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Commitment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="durationChosen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trigger" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="localAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="localClosedAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="localOpenAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="localFirstPaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="localPaidAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="localTotalFinalAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="localSourceInstalledContractID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localCommittedActiveOrSuspContractsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="localCommittedRemovedContractsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="localDelayDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="localDelayMonth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="localCommited" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="localCommitmentStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localCommitmentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localDelay" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Commitment", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase", propOrder = {
    "durationChosen",
    "trigger",
    "startDate",
    "endDate",
    "localAmount",
    "localClosedAmount",
    "localOpenAmount",
    "localFirstPaymentDate",
    "localPaidAmount",
    "localTotalFinalAmount",
    "localSourceInstalledContractID",
    "localCommittedActiveOrSuspContractsCount",
    "localCommittedRemovedContractsCount",
    "localDelayDay",
    "localDelayMonth",
    "localCommited",
    "localCommitmentStatusCode",
    "localCommitmentID",
    "localDelay"
})
public class Commitment {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected String durationChosen;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected String trigger;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected Double localAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected Double localClosedAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected Double localOpenAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar localFirstPaymentDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected Double localPaidAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected Double localTotalFinalAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected String localSourceInstalledContractID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected Integer localCommittedActiveOrSuspContractsCount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected Integer localCommittedRemovedContractsCount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected Integer localDelayDay;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected Integer localDelayMonth;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected Boolean localCommited;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected String localCommitmentStatusCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected String localCommitmentID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected int localDelay;

    /**
     * Gets the value of the durationChosen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationChosen() {
        return durationChosen;
    }

    /**
     * Sets the value of the durationChosen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationChosen(String value) {
        this.durationChosen = value;
    }

    /**
     * Gets the value of the trigger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrigger() {
        return trigger;
    }

    /**
     * Sets the value of the trigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrigger(String value) {
        this.trigger = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the localAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLocalAmount() {
        return localAmount;
    }

    /**
     * Sets the value of the localAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLocalAmount(Double value) {
        this.localAmount = value;
    }

    /**
     * Gets the value of the localClosedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLocalClosedAmount() {
        return localClosedAmount;
    }

    /**
     * Sets the value of the localClosedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLocalClosedAmount(Double value) {
        this.localClosedAmount = value;
    }

    /**
     * Gets the value of the localOpenAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLocalOpenAmount() {
        return localOpenAmount;
    }

    /**
     * Sets the value of the localOpenAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLocalOpenAmount(Double value) {
        this.localOpenAmount = value;
    }

    /**
     * Gets the value of the localFirstPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocalFirstPaymentDate() {
        return localFirstPaymentDate;
    }

    /**
     * Sets the value of the localFirstPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocalFirstPaymentDate(XMLGregorianCalendar value) {
        this.localFirstPaymentDate = value;
    }

    /**
     * Gets the value of the localPaidAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLocalPaidAmount() {
        return localPaidAmount;
    }

    /**
     * Sets the value of the localPaidAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLocalPaidAmount(Double value) {
        this.localPaidAmount = value;
    }

    /**
     * Gets the value of the localTotalFinalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLocalTotalFinalAmount() {
        return localTotalFinalAmount;
    }

    /**
     * Sets the value of the localTotalFinalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLocalTotalFinalAmount(Double value) {
        this.localTotalFinalAmount = value;
    }

    /**
     * Gets the value of the localSourceInstalledContractID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalSourceInstalledContractID() {
        return localSourceInstalledContractID;
    }

    /**
     * Sets the value of the localSourceInstalledContractID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalSourceInstalledContractID(String value) {
        this.localSourceInstalledContractID = value;
    }

    /**
     * Gets the value of the localCommittedActiveOrSuspContractsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocalCommittedActiveOrSuspContractsCount() {
        return localCommittedActiveOrSuspContractsCount;
    }

    /**
     * Sets the value of the localCommittedActiveOrSuspContractsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocalCommittedActiveOrSuspContractsCount(Integer value) {
        this.localCommittedActiveOrSuspContractsCount = value;
    }

    /**
     * Gets the value of the localCommittedRemovedContractsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocalCommittedRemovedContractsCount() {
        return localCommittedRemovedContractsCount;
    }

    /**
     * Sets the value of the localCommittedRemovedContractsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocalCommittedRemovedContractsCount(Integer value) {
        this.localCommittedRemovedContractsCount = value;
    }

    /**
     * Gets the value of the localDelayDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocalDelayDay() {
        return localDelayDay;
    }

    /**
     * Sets the value of the localDelayDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocalDelayDay(Integer value) {
        this.localDelayDay = value;
    }

    /**
     * Gets the value of the localDelayMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocalDelayMonth() {
        return localDelayMonth;
    }

    /**
     * Sets the value of the localDelayMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocalDelayMonth(Integer value) {
        this.localDelayMonth = value;
    }

    /**
     * Gets the value of the localCommited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalCommited() {
        return localCommited;
    }

    /**
     * Sets the value of the localCommited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalCommited(Boolean value) {
        this.localCommited = value;
    }

    /**
     * Gets the value of the localCommitmentStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalCommitmentStatusCode() {
        return localCommitmentStatusCode;
    }

    /**
     * Sets the value of the localCommitmentStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalCommitmentStatusCode(String value) {
        this.localCommitmentStatusCode = value;
    }

    /**
     * Gets the value of the localCommitmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalCommitmentID() {
        return localCommitmentID;
    }

    /**
     * Sets the value of the localCommitmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalCommitmentID(String value) {
        this.localCommitmentID = value;
    }

    /**
     * Gets the value of the localDelay property.
     * 
     */
    public int getLocalDelay() {
        return localDelay;
    }

    /**
     * Sets the value of the localDelay property.
     * 
     */
    public void setLocalDelay(int value) {
        this.localDelay = value;
    }

}
