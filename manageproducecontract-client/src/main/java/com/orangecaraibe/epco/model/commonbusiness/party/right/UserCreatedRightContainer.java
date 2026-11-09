
package com.orangecaraibe.epco.model.commonbusiness.party.right;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserCreatedRightContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserCreatedRightContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Right}RightContainer"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rights" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Right}Right"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserCreatedRightContainer", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Right", propOrder = {
    "rights"
})
public class UserCreatedRightContainer
    extends RightContainer
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Right", required = true)
    protected Right rights;

    /**
     * Gets the value of the rights property.
     * 
     * @return
     *     possible object is
     *     {@link Right }
     *     
     */
    public Right getRights() {
        return rights;
    }

    /**
     * Sets the value of the rights property.
     * 
     * @param value
     *     allowed object is
     *     {@link Right }
     *     
     */
    public void setRights(Right value) {
        this.rights = value;
    }

}
