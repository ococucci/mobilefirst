
package com.orangecaraibe.enra.model.customerdomain.customerbilling.rating;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.enra.model.customerdomain.customerbilling.AppliedDiscount;


/**
 * <p>Java class for AppliedChargeAdjustment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppliedChargeAdjustment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}AppliedDiscount"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adjustedInvoiceItemLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppliedChargeAdjustment", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", propOrder = {
    "adjustedInvoiceItemLabel"
})
public class AppliedChargeAdjustment
    extends AppliedDiscount
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String adjustedInvoiceItemLabel;

    /**
     * Gets the value of the adjustedInvoiceItemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustedInvoiceItemLabel() {
        return adjustedInvoiceItemLabel;
    }

    /**
     * Sets the value of the adjustedInvoiceItemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustedInvoiceItemLabel(String value) {
        this.adjustedInvoiceItemLabel = value;
    }

}
