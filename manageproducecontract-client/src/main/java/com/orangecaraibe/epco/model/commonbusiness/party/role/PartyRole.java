
package com.orangecaraibe.epco.model.commonbusiness.party.role;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.epco.model.commonbusiness.identity.PartyRoleType;
import com.orangecaraibe.epco.model.commonbusiness.identity.UserIdentity;
import com.orangecaraibe.epco.model.commonbusiness.interaction.InteractionActor;
import com.orangecaraibe.epco.model.commonbusiness.party.Party;
import com.orangecaraibe.epco.model.commonbusiness.party.right.RightContainer;
import com.orangecaraibe.epco.model.customerdomain.customer.Customer;
import com.orangecaraibe.epco.model.customerdomain.customer.ManagedBy;
import com.orangecaraibe.epco.model.marketsales.marketsegment.MarketSegment;


/**
 * <p>Java class for PartyRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyRole"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}InteractionActor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partyRoleID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="party" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party}Party" minOccurs="0"/&gt;
 *         &lt;element name="partyRoleTemporaryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="partyRoleType" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity}PartyRoleType" minOccurs="0"/&gt;
 *         &lt;element name="userIdentity" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity}UserIdentity" minOccurs="0"/&gt;
 *         &lt;element name="partyRoleStatus" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role}PartyRoleStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="rightContainers" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Right}RightContainer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="partyRoleSet" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role}PartyRoleSet" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="identifiedBy" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity}UserIdentity" maxOccurs="unbounded"/&gt;
 *         &lt;element name="marketSegments" type="{http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketSegment}MarketSegment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyRole", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role", propOrder = {
    "partyRoleID",
    "party",
    "partyRoleTemporaryID",
    "partyRoleType",
    "userIdentity",
    "partyRoleStatus",
    "rightContainers",
    "partyRoleSet",
    "identifiedBy",
    "marketSegments"
})
@XmlSeeAlso({
    Customer.class,
    ManagedBy.class,
    Operator.class,
    Distributor.class,
    Supplier.class,
    Manufacturer.class,
    Creator.class,
    CustomerServiceRepresentative.class,
    CustomerInterlocutor.class,
    AssociatedPartyRole.class,
    User.class,
    ProspectiveCustomer.class,
    RestrictedPartyRole.class
})
public class PartyRole
    extends InteractionActor
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role")
    protected String partyRoleID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role")
    protected Party party;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role")
    protected String partyRoleTemporaryID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role")
    protected PartyRoleType partyRoleType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role")
    protected UserIdentity userIdentity;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role", nillable = true)
    protected List<PartyRoleStatus> partyRoleStatus;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role", nillable = true)
    protected List<RightContainer> rightContainers;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role", nillable = true)
    protected List<PartyRoleSet> partyRoleSet;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role", required = true)
    protected List<UserIdentity> identifiedBy;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role", nillable = true)
    protected List<MarketSegment> marketSegments;

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
     *     {@link PartyRoleType }
     *     
     */
    public PartyRoleType getPartyRoleType() {
        return partyRoleType;
    }

    /**
     * Sets the value of the partyRoleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRoleType }
     *     
     */
    public void setPartyRoleType(PartyRoleType value) {
        this.partyRoleType = value;
    }

    /**
     * Gets the value of the userIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link UserIdentity }
     *     
     */
    public UserIdentity getUserIdentity() {
        return userIdentity;
    }

    /**
     * Sets the value of the userIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserIdentity }
     *     
     */
    public void setUserIdentity(UserIdentity value) {
        this.userIdentity = value;
    }

    /**
     * Gets the value of the partyRoleStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyRoleStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyRoleStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyRoleStatus }
     * 
     * 
     */
    public List<PartyRoleStatus> getPartyRoleStatus() {
        if (partyRoleStatus == null) {
            partyRoleStatus = new ArrayList<PartyRoleStatus>();
        }
        return this.partyRoleStatus;
    }

    /**
     * Gets the value of the rightContainers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rightContainers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRightContainers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RightContainer }
     * 
     * 
     */
    public List<RightContainer> getRightContainers() {
        if (rightContainers == null) {
            rightContainers = new ArrayList<RightContainer>();
        }
        return this.rightContainers;
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

    /**
     * Gets the value of the identifiedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifiedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifiedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserIdentity }
     * 
     * 
     */
    public List<UserIdentity> getIdentifiedBy() {
        if (identifiedBy == null) {
            identifiedBy = new ArrayList<UserIdentity>();
        }
        return this.identifiedBy;
    }

    /**
     * Gets the value of the marketSegments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketSegments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketSegments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketSegment }
     * 
     * 
     */
    public List<MarketSegment> getMarketSegments() {
        if (marketSegments == null) {
            marketSegments = new ArrayList<MarketSegment>();
        }
        return this.marketSegments;
    }

}
