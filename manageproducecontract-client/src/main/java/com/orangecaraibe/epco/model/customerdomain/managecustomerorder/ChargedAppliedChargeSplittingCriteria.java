
package com.orangecaraibe.epco.model.customerdomain.managecustomerorder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargedAppliedChargeSplittingCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargedAppliedChargeSplittingCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appliedChargeType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="paymentMean" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}ChargedPaymentMean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargedAppliedChargeSplittingCriteria", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", propOrder = {
    "appliedChargeType",
    "paymentMean"
})
public class ChargedAppliedChargeSplittingCriteria {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected Object appliedChargeType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected ChargedPaymentMean paymentMean;

    /**
     * Gets the value of the appliedChargeType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAppliedChargeType() {
        return appliedChargeType;
    }

    /**
     * Sets the value of the appliedChargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAppliedChargeType(Object value) {
        this.appliedChargeType = value;
    }

    /**
     * Gets the value of the paymentMean property.
     * 
     * @return
     *     possible object is
     *     {@link ChargedPaymentMean }
     *     
     */
    public ChargedPaymentMean getPaymentMean() {
        return paymentMean;
    }

    /**
     * Sets the value of the paymentMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargedPaymentMean }
     *     
     */
    public void setPaymentMean(ChargedPaymentMean value) {
        this.paymentMean = value;
    }

}
