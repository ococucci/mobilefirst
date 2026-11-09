
package com.orangecaraibe.epco.model.commonbusiness.party.role;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IsRestrictedTo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IsRestrictedTo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partyRole" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role}RestrictedPartyRole"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IsRestrictedTo", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role", propOrder = {
    "partyRole"
})
public class IsRestrictedTo {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role", required = true)
    protected RestrictedPartyRole partyRole;

    /**
     * Gets the value of the partyRole property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedPartyRole }
     *     
     */
    public RestrictedPartyRole getPartyRole() {
        return partyRole;
    }

    /**
     * Sets the value of the partyRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedPartyRole }
     *     
     */
    public void setPartyRole(RestrictedPartyRole value) {
        this.partyRole = value;
    }

}
