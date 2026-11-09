
package com.orangecaraibe.enra.model.customerdomain.customerbilling.rating;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuantityForRating complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuantityForRating"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ratedUnitValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityForRating", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", propOrder = {
    "unitCode",
    "unitLabel",
    "unitValue",
    "ratedUnitValue"
})
public class QuantityForRating {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String unitCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String unitLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected Double unitValue;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected Double ratedUnitValue;

    /**
     * Gets the value of the unitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * Sets the value of the unitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCode(String value) {
        this.unitCode = value;
    }

    /**
     * Gets the value of the unitLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitLabel() {
        return unitLabel;
    }

    /**
     * Sets the value of the unitLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitLabel(String value) {
        this.unitLabel = value;
    }

    /**
     * Gets the value of the unitValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnitValue() {
        return unitValue;
    }

    /**
     * Sets the value of the unitValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitValue(Double value) {
        this.unitValue = value;
    }

    /**
     * Gets the value of the ratedUnitValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRatedUnitValue() {
        return ratedUnitValue;
    }

    /**
     * Sets the value of the ratedUnitValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRatedUnitValue(Double value) {
        this.ratedUnitValue = value;
    }

}
