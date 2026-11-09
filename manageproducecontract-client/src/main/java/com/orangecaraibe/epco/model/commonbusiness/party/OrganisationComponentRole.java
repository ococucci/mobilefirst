
package com.orangecaraibe.epco.model.commonbusiness.party;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganisationComponentRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganisationComponentRole"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="componentRoleType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="orientation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="organisation" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party}ComponentRoleOrganisation" maxOccurs="unbounded"/&gt;
 *         &lt;element name="hierarchyLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="parentPartyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationComponentRole", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", propOrder = {
    "componentRoleType",
    "orientation",
    "organisation",
    "hierarchyLevel",
    "parentPartyID"
})
public class OrganisationComponentRole {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", required = true)
    protected String componentRoleType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", required = true)
    protected String orientation;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", required = true)
    protected List<ComponentRoleOrganisation> organisation;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
    protected Integer hierarchyLevel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
    protected String parentPartyID;

    /**
     * Gets the value of the componentRoleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentRoleType() {
        return componentRoleType;
    }

    /**
     * Sets the value of the componentRoleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentRoleType(String value) {
        this.componentRoleType = value;
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

    /**
     * Gets the value of the organisation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComponentRoleOrganisation }
     * 
     * 
     */
    public List<ComponentRoleOrganisation> getOrganisation() {
        if (organisation == null) {
            organisation = new ArrayList<ComponentRoleOrganisation>();
        }
        return this.organisation;
    }

    /**
     * Gets the value of the hierarchyLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHierarchyLevel() {
        return hierarchyLevel;
    }

    /**
     * Sets the value of the hierarchyLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHierarchyLevel(Integer value) {
        this.hierarchyLevel = value;
    }

    /**
     * Gets the value of the parentPartyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentPartyID() {
        return parentPartyID;
    }

    /**
     * Sets the value of the parentPartyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentPartyID(String value) {
        this.parentPartyID = value;
    }

}
