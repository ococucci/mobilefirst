
package com.orangecaraibe.enra.model.commonbusiness.party;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BirthLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BirthLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="city" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party}BirthCity" minOccurs="0"/&gt;
 *         &lt;element name="state" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party}BirthState" minOccurs="0"/&gt;
 *         &lt;element name="country" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party}BirthCountry" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BirthLocation", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", propOrder = {
    "city",
    "state",
    "country"
})
public class BirthLocation {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
    protected BirthCity city;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
    protected BirthState state;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
    protected BirthCountry country;

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link BirthCity }
     *     
     */
    public BirthCity getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthCity }
     *     
     */
    public void setCity(BirthCity value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link BirthState }
     *     
     */
    public BirthState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthState }
     *     
     */
    public void setState(BirthState value) {
        this.state = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link BirthCountry }
     *     
     */
    public BirthCountry getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthCountry }
     *     
     */
    public void setCountry(BirthCountry value) {
        this.country = value;
    }

}
