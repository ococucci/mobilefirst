
package com.orangecaraibe.enra.model.commonbusiness.party;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyStatusOrigin complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyStatusOrigin"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="originCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="originLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyStatusOrigin", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", propOrder = {
    "originCode",
    "originLabel"
})
public class PartyStatusOrigin {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", required = true)
    protected String originCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
    protected String originLabel;

    /**
     * Gets the value of the originCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCode() {
        return originCode;
    }

    /**
     * Sets the value of the originCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCode(String value) {
        this.originCode = value;
    }

    /**
     * Gets the value of the originLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginLabel() {
        return originLabel;
    }

    /**
     * Sets the value of the originLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginLabel(String value) {
        this.originLabel = value;
    }

}
