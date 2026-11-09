
package com.orangecaraibe.epco.model.commonbusiness.identity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.epco.model.commonbusiness.party.Party;
import com.orangecaraibe.epco.model.commonbusiness.party.right.Right;


/**
 * <p>Java class for UserIdentity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserIdentity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="credentials" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity}Credential" maxOccurs="unbounded"/&gt;
 *         &lt;element name="party" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party}Party" minOccurs="0"/&gt;
 *         &lt;element name="rights" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Right}Right" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="localIdentityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserIdentity", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity", propOrder = {
    "gid",
    "credentials",
    "party",
    "rights",
    "localIdentityType"
})
@XmlSeeAlso({
    CollectiveIdentity.class,
    IndividualIdentity.class
})
public class UserIdentity {

    @XmlElement(name = "GID", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity", required = true)
    protected String gid;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity", required = true)
    protected List<Credential> credentials;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity")
    protected Party party;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity", nillable = true)
    protected List<Right> rights;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity")
    protected String localIdentityType;

    /**
     * Gets the value of the gid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGID() {
        return gid;
    }

    /**
     * Sets the value of the gid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGID(String value) {
        this.gid = value;
    }

    /**
     * Gets the value of the credentials property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the credentials property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCredentials().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Credential }
     * 
     * 
     */
    public List<Credential> getCredentials() {
        if (credentials == null) {
            credentials = new ArrayList<Credential>();
        }
        return this.credentials;
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
     * Gets the value of the rights property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rights property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRights().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Right }
     * 
     * 
     */
    public List<Right> getRights() {
        if (rights == null) {
            rights = new ArrayList<Right>();
        }
        return this.rights;
    }

    /**
     * Gets the value of the localIdentityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalIdentityType() {
        return localIdentityType;
    }

    /**
     * Sets the value of the localIdentityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalIdentityType(String value) {
        this.localIdentityType = value;
    }

}
