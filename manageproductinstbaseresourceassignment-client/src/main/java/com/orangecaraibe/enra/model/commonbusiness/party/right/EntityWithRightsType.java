
package com.orangecaraibe.enra.model.commonbusiness.party.right;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityWithRightsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityWithRightsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rightSpecs" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Right}RightSpec"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityWithRightsType", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Right", propOrder = {
    "rightSpecs"
})
public class EntityWithRightsType {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Right", required = true)
    protected RightSpec rightSpecs;

    /**
     * Gets the value of the rightSpecs property.
     * 
     * @return
     *     possible object is
     *     {@link RightSpec }
     *     
     */
    public RightSpec getRightSpecs() {
        return rightSpecs;
    }

    /**
     * Sets the value of the rightSpecs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RightSpec }
     *     
     */
    public void setRightSpecs(RightSpec value) {
        this.rightSpecs = value;
    }

}
