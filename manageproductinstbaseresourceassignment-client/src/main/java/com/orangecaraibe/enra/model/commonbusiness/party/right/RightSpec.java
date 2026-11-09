
package com.orangecaraibe.enra.model.commonbusiness.party.right;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RightSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RightSpec"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rightSpecCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rightSpecType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RightSpec", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Right", propOrder = {
    "rightSpecCode",
    "rightSpecType"
})
public class RightSpec {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Right")
    protected String rightSpecCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Right", required = true)
    protected String rightSpecType;

    /**
     * Gets the value of the rightSpecCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightSpecCode() {
        return rightSpecCode;
    }

    /**
     * Sets the value of the rightSpecCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightSpecCode(String value) {
        this.rightSpecCode = value;
    }

    /**
     * Gets the value of the rightSpecType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightSpecType() {
        return rightSpecType;
    }

    /**
     * Sets the value of the rightSpecType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightSpecType(String value) {
        this.rightSpecType = value;
    }

}
