
package com.orangecaraibe.soa.v2.model.commonbusiness.party.right;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RightContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RightContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entitiesWithRights" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Right}EntityWithRights" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RightContainer", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Right", propOrder = {
    "entitiesWithRights"
})
@XmlSeeAlso({
    UserCreatedRightContainer.class,
    DefaultRightContainer.class
})
public class RightContainer {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Right", nillable = true)
    protected List<EntityWithRights> entitiesWithRights;

    /**
     * Gets the value of the entitiesWithRights property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entitiesWithRights property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntitiesWithRights().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityWithRights }
     * 
     * 
     */
    public List<EntityWithRights> getEntitiesWithRights() {
        if (entitiesWithRights == null) {
            entitiesWithRights = new ArrayList<EntityWithRights>();
        }
        return this.entitiesWithRights;
    }

}
