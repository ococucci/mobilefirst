
package com.orangecaraibe.epco.model.commonbusiness.party.right;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityWithRights complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityWithRights"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entityWithRightsID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entityWithRightsType" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Right}EntityWithRightsType"/&gt;
 *         &lt;element name="rights" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Right}Right" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityWithRights", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Right", propOrder = {
    "entityWithRightsID",
    "entityWithRightsType",
    "rights"
})
public class EntityWithRights {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Right")
    protected String entityWithRightsID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Right", required = true)
    protected EntityWithRightsType entityWithRightsType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Right", nillable = true)
    protected List<Right> rights;

    /**
     * Gets the value of the entityWithRightsID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityWithRightsID() {
        return entityWithRightsID;
    }

    /**
     * Sets the value of the entityWithRightsID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityWithRightsID(String value) {
        this.entityWithRightsID = value;
    }

    /**
     * Gets the value of the entityWithRightsType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityWithRightsType }
     *     
     */
    public EntityWithRightsType getEntityWithRightsType() {
        return entityWithRightsType;
    }

    /**
     * Sets the value of the entityWithRightsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityWithRightsType }
     *     
     */
    public void setEntityWithRightsType(EntityWithRightsType value) {
        this.entityWithRightsType = value;
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

}
