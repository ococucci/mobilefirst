
package com.orangecaraibe.epco.model.customerdomain.customerbilling.rating;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RatingDiscountAmount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RatingDiscountAmount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ratingDiscountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ratingDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ratingDiscountRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatingDiscountAmount", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", propOrder = {
    "ratingDiscountName",
    "ratingDiscountAmount",
    "ratingDiscountRate"
})
public class RatingDiscountAmount {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String ratingDiscountName;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected double ratingDiscountAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected Double ratingDiscountRate;

    /**
     * Gets the value of the ratingDiscountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatingDiscountName() {
        return ratingDiscountName;
    }

    /**
     * Sets the value of the ratingDiscountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatingDiscountName(String value) {
        this.ratingDiscountName = value;
    }

    /**
     * Gets the value of the ratingDiscountAmount property.
     * 
     */
    public double getRatingDiscountAmount() {
        return ratingDiscountAmount;
    }

    /**
     * Sets the value of the ratingDiscountAmount property.
     * 
     */
    public void setRatingDiscountAmount(double value) {
        this.ratingDiscountAmount = value;
    }

    /**
     * Gets the value of the ratingDiscountRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRatingDiscountRate() {
        return ratingDiscountRate;
    }

    /**
     * Sets the value of the ratingDiscountRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRatingDiscountRate(Double value) {
        this.ratingDiscountRate = value;
    }

}
