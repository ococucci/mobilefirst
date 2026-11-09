
package com.orangecaraibe.soa.v2.model.commonbusiness.identity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.soa.v2.model.commonbusiness.party.right.RightContainerSpecs;


/**
 * <p>Java class for PartyRoleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyRoleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partyRoleTypeID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rightContainerSpecs" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Right}RightContainerSpecs" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyRoleType", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity", propOrder = {
    "partyRoleTypeID",
    "rightContainerSpecs"
})
public class PartyRoleType {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity", required = true)
    protected String partyRoleTypeID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity", required = true)
    protected List<RightContainerSpecs> rightContainerSpecs;

    /**
     * Gets the value of the partyRoleTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyRoleTypeID() {
        return partyRoleTypeID;
    }

    /**
     * Sets the value of the partyRoleTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyRoleTypeID(String value) {
        this.partyRoleTypeID = value;
    }

    /**
     * Gets the value of the rightContainerSpecs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rightContainerSpecs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRightContainerSpecs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RightContainerSpecs }
     * 
     * 
     */
    public List<RightContainerSpecs> getRightContainerSpecs() {
        if (rightContainerSpecs == null) {
            rightContainerSpecs = new ArrayList<RightContainerSpecs>();
        }
        return this.rightContainerSpecs;
    }

}
