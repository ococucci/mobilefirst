
package com.orangecaraibe.soa.v2.model.commonbusiness.party;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PartyStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partyStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="statusOrigin" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party}PartyStatusOrigin" minOccurs="0"/&gt;
 *         &lt;element name="local_scoringCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="localPreventelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localPreventelLastCheckDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyStatus", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", propOrder = {
    "partyStatusCode",
    "startDate",
    "endDate",
    "statusOrigin",
    "localScoringCode",
    "localPreventelFlag",
    "localPreventelLastCheckDate"
})
public class PartyStatus {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", required = true)
    protected String partyStatusCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
    protected PartyStatusOrigin statusOrigin;
    @XmlElement(name = "local_scoringCode", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", required = true)
    protected String localScoringCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
    protected String localPreventelFlag;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar localPreventelLastCheckDate;

    /**
     * Gets the value of the partyStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyStatusCode() {
        return partyStatusCode;
    }

    /**
     * Sets the value of the partyStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyStatusCode(String value) {
        this.partyStatusCode = value;
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
     * Gets the value of the statusOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link PartyStatusOrigin }
     *     
     */
    public PartyStatusOrigin getStatusOrigin() {
        return statusOrigin;
    }

    /**
     * Sets the value of the statusOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyStatusOrigin }
     *     
     */
    public void setStatusOrigin(PartyStatusOrigin value) {
        this.statusOrigin = value;
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
     * Gets the value of the localPreventelFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalPreventelFlag() {
        return localPreventelFlag;
    }

    /**
     * Sets the value of the localPreventelFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalPreventelFlag(String value) {
        this.localPreventelFlag = value;
    }

    /**
     * Gets the value of the localPreventelLastCheckDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocalPreventelLastCheckDate() {
        return localPreventelLastCheckDate;
    }

    /**
     * Sets the value of the localPreventelLastCheckDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocalPreventelLastCheckDate(XMLGregorianCalendar value) {
        this.localPreventelLastCheckDate = value;
    }

}
