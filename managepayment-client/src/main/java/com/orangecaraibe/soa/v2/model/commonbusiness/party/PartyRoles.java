
package com.orangecaraibe.soa.v2.model.commonbusiness.party;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.soa.v2.model.commonbusiness.party.role.PartyRoleSet;
import com.orangecaraibe.soa.v2.model.commonbusiness.party.role.PartyRoleStatus;


/**
 * <p>Java class for PartyRoles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyRoles"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partyRoleID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="party" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party}Party" minOccurs="0"/&gt;
 *         &lt;element name="tradingName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partyRoleTemporaryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="partyRoleType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partyRoleStatus" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role}PartyRoleStatus" minOccurs="0"/&gt;
 *         &lt;element name="partyRoleSet" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role}PartyRoleSet" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyRoles", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", propOrder = {
    "partyRoleID",
    "party",
    "tradingName",
    "partyRoleTemporaryID",
    "partyRoleType",
    "partyRoleStatus",
    "partyRoleSet"
})
public class PartyRoles {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", required = true)
    protected String partyRoleID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
    protected Party party;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", required = true)
    protected String tradingName;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
    protected String partyRoleTemporaryID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", required = true)
    protected String partyRoleType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
    protected PartyRoleStatus partyRoleStatus;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", nillable = true)
    protected List<PartyRoleSet> partyRoleSet;

    /**
     * Gets the value of the partyRoleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyRoleID() {
        return partyRoleID;
    }

    /**
     * Sets the value of the partyRoleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyRoleID(String value) {
        this.partyRoleID = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setParty(Party value) {
        this.party = value;
    }

    /**
     * Gets the value of the tradingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradingName() {
        return tradingName;
    }

    /**
     * Sets the value of the tradingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradingName(String value) {
        this.tradingName = value;
    }

    /**
     * Gets the value of the partyRoleTemporaryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyRoleTemporaryID() {
        return partyRoleTemporaryID;
    }

    /**
     * Sets the value of the partyRoleTemporaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyRoleTemporaryID(String value) {
        this.partyRoleTemporaryID = value;
    }

    /**
     * Gets the value of the partyRoleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyRoleType() {
        return partyRoleType;
    }

    /**
     * Sets the value of the partyRoleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyRoleType(String value) {
        this.partyRoleType = value;
    }

    /**
     * Gets the value of the partyRoleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PartyRoleStatus }
     *     
     */
    public PartyRoleStatus getPartyRoleStatus() {
        return partyRoleStatus;
    }

    /**
     * Sets the value of the partyRoleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRoleStatus }
     *     
     */
    public void setPartyRoleStatus(PartyRoleStatus value) {
        this.partyRoleStatus = value;
    }

    /**
     * Gets the value of the partyRoleSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyRoleSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyRoleSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyRoleSet }
     * 
     * 
     */
    public List<PartyRoleSet> getPartyRoleSet() {
        if (partyRoleSet == null) {
            partyRoleSet = new ArrayList<PartyRoleSet>();
        }
        return this.partyRoleSet;
    }

}
