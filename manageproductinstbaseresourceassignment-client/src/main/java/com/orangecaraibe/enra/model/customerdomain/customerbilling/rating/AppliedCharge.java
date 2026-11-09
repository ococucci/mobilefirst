
package com.orangecaraibe.enra.model.customerdomain.customerbilling.rating;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppliedCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppliedCharge"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appliedChargeID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppliedCharge", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", propOrder = {
    "appliedChargeID",
    "type"
})
@XmlSeeAlso({
    AppliedProductRatedCharge.class,
    AppliedOneTimeCharge.class,
    AppliedRecurringCharge.class
})
public class AppliedCharge {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", required = true)
    protected String appliedChargeID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", required = true)
    protected String type;

    /**
     * Gets the value of the appliedChargeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppliedChargeID() {
        return appliedChargeID;
    }

    /**
     * Sets the value of the appliedChargeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppliedChargeID(String value) {
        this.appliedChargeID = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
