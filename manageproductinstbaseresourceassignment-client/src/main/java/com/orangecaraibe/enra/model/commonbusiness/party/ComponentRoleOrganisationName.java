
package com.orangecaraibe.enra.model.commonbusiness.party;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComponentRoleOrganisationName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentRoleOrganisationName"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradingName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentRoleOrganisationName", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", propOrder = {
    "tradingName",
    "brand"
})
public class ComponentRoleOrganisationName {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", required = true)
    protected String tradingName;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
    protected String brand;

    /**
     * Gets the value of the tradingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradingName() {
        return tradingName;
    }

    /**
     * Sets the value of the tradingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradingName(String value) {
        this.tradingName = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

}
