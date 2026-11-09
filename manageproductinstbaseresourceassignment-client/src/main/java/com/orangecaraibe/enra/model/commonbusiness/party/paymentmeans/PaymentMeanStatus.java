
package com.orangecaraibe.enra.model.commonbusiness.party.paymentmeans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PaymentMeanStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentMeanStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="local_scoringCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMeanStatus", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans", propOrder = {
    "startDate",
    "endDate",
    "statusCode",
    "localScoringCode",
    "statusReason",
    "statusLabel"
})
public class PaymentMeanStatus {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans", required = true)
    protected String statusCode;
    @XmlElement(name = "local_scoringCode", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans")
    protected String localScoringCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans")
    protected String statusReason;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans")
    protected String statusLabel;

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
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the localScoringCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalScoringCode() {
        return localScoringCode;
    }

    /**
     * Sets the value of the localScoringCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalScoringCode(String value) {
        this.localScoringCode = value;
    }

    /**
     * Gets the value of the statusReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusReason() {
        return statusReason;
    }

    /**
     * Sets the value of the statusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusReason(String value) {
        this.statusReason = value;
    }

    /**
     * Gets the value of the statusLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusLabel() {
        return statusLabel;
    }

    /**
     * Sets the value of the statusLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusLabel(String value) {
        this.statusLabel = value;
    }

}
