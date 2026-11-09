
package com.orangecaraibe.epco.model.commonbusiness.party.contactmethods;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.epco.model.commonbusiness.location.Address;
import com.orangecaraibe.epco.model.commonbusiness.party.Party;
import com.orangecaraibe.epco.model.commonbusiness.party.role.PartyRole;


/**
 * <p>Java class for ContactMethod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactMethod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactMethodQuality" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods}ContactMethodQuality"/&gt;
 *         &lt;element name="isRestrictedTo" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role}PartyRole" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contactMethodStatus" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods}ContactMethodStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contactMethodID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="party" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party}Party" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactMethod", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods", propOrder = {
    "contactMethodQuality",
    "isRestrictedTo",
    "contactMethodStatus",
    "contactMethodID",
    "party"
})
@XmlSeeAlso({
    EmailAddress.class,
    WebSite.class,
    PhoneNumber.class,
    LocalSocialNetwork.class,
    Address.class
})
public class ContactMethod {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods", required = true)
    protected ContactMethodQuality contactMethodQuality;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods", nillable = true)
    protected List<PartyRole> isRestrictedTo;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods", nillable = true)
    protected List<ContactMethodStatus> contactMethodStatus;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods", required = true)
    protected String contactMethodID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods")
    protected Party party;

    /**
     * Gets the value of the contactMethodQuality property.
     * 
     * @return
     *     possible object is
     *     {@link ContactMethodQuality }
     *     
     */
    public ContactMethodQuality getContactMethodQuality() {
        return contactMethodQuality;
    }

    /**
     * Sets the value of the contactMethodQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMethodQuality }
     *     
     */
    public void setContactMethodQuality(ContactMethodQuality value) {
        this.contactMethodQuality = value;
    }

    /**
     * Gets the value of the isRestrictedTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isRestrictedTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsRestrictedTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyRole }
     * 
     * 
     */
    public List<PartyRole> getIsRestrictedTo() {
        if (isRestrictedTo == null) {
            isRestrictedTo = new ArrayList<PartyRole>();
        }
        return this.isRestrictedTo;
    }

    /**
     * Gets the value of the contactMethodStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactMethodStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactMethodStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactMethodStatus }
     * 
     * 
     */
    public List<ContactMethodStatus> getContactMethodStatus() {
        if (contactMethodStatus == null) {
            contactMethodStatus = new ArrayList<ContactMethodStatus>();
        }
        return this.contactMethodStatus;
    }

    /**
     * Gets the value of the contactMethodID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactMethodID() {
        return contactMethodID;
    }

    /**
     * Sets the value of the contactMethodID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactMethodID(String value) {
        this.contactMethodID = value;
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

}
