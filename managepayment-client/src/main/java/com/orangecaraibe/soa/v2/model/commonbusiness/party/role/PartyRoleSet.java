
package com.orangecaraibe.soa.v2.model.commonbusiness.party.role;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyRoleSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyRoleSet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partyRoleSetID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="partyRoleSetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="partyRoleSetLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="associatedPartyRole" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role}AssociatedPartyRole" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyRoleSet", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role", propOrder = {
    "partyRoleSetID",
    "partyRoleSetType",
    "partyRoleSetLabel",
    "associatedPartyRole"
})
public class PartyRoleSet {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role")
    protected String partyRoleSetID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role")
    protected String partyRoleSetType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role")
    protected String partyRoleSetLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role", nillable = true)
    protected List<AssociatedPartyRole> associatedPartyRole;

    /**
     * Gets the value of the partyRoleSetID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyRoleSetID() {
        return partyRoleSetID;
    }

    /**
     * Sets the value of the partyRoleSetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyRoleSetID(String value) {
        this.partyRoleSetID = value;
    }

    /**
     * Gets the value of the partyRoleSetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyRoleSetType() {
        return partyRoleSetType;
    }

    /**
     * Sets the value of the partyRoleSetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyRoleSetType(String value) {
        this.partyRoleSetType = value;
    }

    /**
     * Gets the value of the partyRoleSetLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyRoleSetLabel() {
        return partyRoleSetLabel;
    }

    /**
     * Sets the value of the partyRoleSetLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyRoleSetLabel(String value) {
        this.partyRoleSetLabel = value;
    }

    /**
     * Gets the value of the associatedPartyRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedPartyRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedPartyRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedPartyRole }
     * 
     * 
     */
    public List<AssociatedPartyRole> getAssociatedPartyRole() {
        if (associatedPartyRole == null) {
            associatedPartyRole = new ArrayList<AssociatedPartyRole>();
        }
        return this.associatedPartyRole;
    }

}
