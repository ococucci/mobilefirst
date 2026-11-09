
package com.orangecaraibe.enra.model.commonbusiness.party;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComponentOrganisation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentOrganisation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="partyTemporaryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentOrganisation", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", propOrder = {
    "partyID",
    "partyTemporaryID"
})
public class ComponentOrganisation {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
    protected String partyID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
    protected String partyTemporaryID;

    /**
     * Gets the value of the partyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyID() {
        return partyID;
    }

    /**
     * Sets the value of the partyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyID(String value) {
        this.partyID = value;
    }

    /**
     * Gets the value of the partyTemporaryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyTemporaryID() {
        return partyTemporaryID;
    }

    /**
     * Sets the value of the partyTemporaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyTemporaryID(String value) {
        this.partyTemporaryID = value;
    }

}
