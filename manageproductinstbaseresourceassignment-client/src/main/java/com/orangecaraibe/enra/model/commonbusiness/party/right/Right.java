
package com.orangecaraibe.enra.model.commonbusiness.party.right;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Right complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Right"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rightID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rightSpec" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Right}RightSpec"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Right", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Right", propOrder = {
    "rightID",
    "rightSpec"
})
public class Right {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Right")
    protected String rightID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Right", required = true)
    protected RightSpec rightSpec;

    /**
     * Gets the value of the rightID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightID() {
        return rightID;
    }

    /**
     * Sets the value of the rightID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightID(String value) {
        this.rightID = value;
    }

    /**
     * Gets the value of the rightSpec property.
     * 
     * @return
     *     possible object is
     *     {@link RightSpec }
     *     
     */
    public RightSpec getRightSpec() {
        return rightSpec;
    }

    /**
     * Sets the value of the rightSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link RightSpec }
     *     
     */
    public void setRightSpec(RightSpec value) {
        this.rightSpec = value;
    }

}
