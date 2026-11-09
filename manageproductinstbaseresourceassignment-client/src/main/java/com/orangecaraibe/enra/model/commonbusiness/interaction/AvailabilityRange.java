
package com.orangecaraibe.enra.model.commonbusiness.interaction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AvailabilityRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailabilityRange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isDatePreference" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="toDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="fromTime" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="toTime" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailabilityRange", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", propOrder = {
    "isDatePreference",
    "fromDate",
    "toDate",
    "fromTime",
    "toTime"
})
public class AvailabilityRange {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction")
    protected boolean isDatePreference;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar toDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fromTime;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar toTime;

    /**
     * Gets the value of the isDatePreference property.
     * 
     */
    public boolean isIsDatePreference() {
        return isDatePreference;
    }

    /**
     * Sets the value of the isDatePreference property.
     * 
     */
    public void setIsDatePreference(boolean value) {
        this.isDatePreference = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
    }

    /**
     * Gets the value of the fromTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromTime() {
        return fromTime;
    }

    /**
     * Sets the value of the fromTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromTime(XMLGregorianCalendar value) {
        this.fromTime = value;
    }

    /**
     * Gets the value of the toTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToTime() {
        return toTime;
    }

    /**
     * Sets the value of the toTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToTime(XMLGregorianCalendar value) {
        this.toTime = value;
    }

}
