
package com.orangecaraibe.epco.model.commonbusiness.party;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.epco.model.commonbusiness.party.role.PartyRole;


/**
 * <p>Java class for Organisation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organisation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party}Party"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isLegalEntity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="activityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="legalShapeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hasForContact" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role}PartyRole" minOccurs="0"/&gt;
 *         &lt;element name="organisationClassification" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party}OrganisationClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="organisationComponentRole" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party}OrganisationComponentRole" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organisation", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", propOrder = {
    "isLegalEntity",
    "activityCode",
    "legalShapeCode",
    "hasForContact",
    "organisationClassification",
    "organisationComponentRole"
})
public class Organisation
    extends Party
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
    protected Boolean isLegalEntity;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
    protected String activityCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
    protected String legalShapeCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
    protected PartyRole hasForContact;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", nillable = true)
    protected List<OrganisationClassification> organisationClassification;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", nillable = true)
    protected List<OrganisationComponentRole> organisationComponentRole;

    /**
     * Gets the value of the isLegalEntity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLegalEntity() {
        return isLegalEntity;
    }

    /**
     * Sets the value of the isLegalEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLegalEntity(Boolean value) {
        this.isLegalEntity = value;
    }

    /**
     * Gets the value of the activityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityCode() {
        return activityCode;
    }

    /**
     * Sets the value of the activityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityCode(String value) {
        this.activityCode = value;
    }

    /**
     * Gets the value of the legalShapeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalShapeCode() {
        return legalShapeCode;
    }

    /**
     * Sets the value of the legalShapeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalShapeCode(String value) {
        this.legalShapeCode = value;
    }

    /**
     * Gets the value of the hasForContact property.
     * 
     * @return
     *     possible object is
     *     {@link PartyRole }
     *     
     */
    public PartyRole getHasForContact() {
        return hasForContact;
    }

    /**
     * Sets the value of the hasForContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRole }
     *     
     */
    public void setHasForContact(PartyRole value) {
        this.hasForContact = value;
    }

    /**
     * Gets the value of the organisationClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisationClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationClassification }
     * 
     * 
     */
    public List<OrganisationClassification> getOrganisationClassification() {
        if (organisationClassification == null) {
            organisationClassification = new ArrayList<OrganisationClassification>();
        }
        return this.organisationClassification;
    }

    /**
     * Gets the value of the organisationComponentRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationComponentRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisationComponentRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationComponentRole }
     * 
     * 
     */
    public List<OrganisationComponentRole> getOrganisationComponentRole() {
        if (organisationComponentRole == null) {
            organisationComponentRole = new ArrayList<OrganisationComponentRole>();
        }
        return this.organisationComponentRole;
    }

}
