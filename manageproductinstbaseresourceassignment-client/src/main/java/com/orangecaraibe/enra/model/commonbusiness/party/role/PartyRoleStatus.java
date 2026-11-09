
package com.orangecaraibe.enra.model.commonbusiness.party.role;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PartyRoleStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyRoleStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partyRoleStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="statusOrigin" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role}PartyRoleStatusOrigin" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyRoleStatus", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role", propOrder = {
    "partyRoleStatusCode",
    "startDate",
    "endDate",
    "statusOrigin"
})
public class PartyRoleStatus {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role", required = true)
    protected String partyRoleStatusCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role")
    protected PartyRoleStatusOrigin statusOrigin;

    /**
     * Gets the value of the partyRoleStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyRoleStatusCode() {
        return partyRoleStatusCode;
    }

    /**
     * Sets the value of the partyRoleStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyRoleStatusCode(String value) {
        this.partyRoleStatusCode = value;
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
     *     {@link PartyRoleStatusOrigin }
     *     
     */
    public PartyRoleStatusOrigin getStatusOrigin() {
        return statusOrigin;
    }

    /**
     * Sets the value of the statusOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRoleStatusOrigin }
     *     
     */
    public void setStatusOrigin(PartyRoleStatusOrigin value) {
        this.statusOrigin = value;
    }

}
