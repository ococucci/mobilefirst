
package com.orangecaraibe.epco.model.customerdomain.managecustomerorder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppliedChargeSplittingCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppliedChargeSplittingCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentMean" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}PaymentMean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppliedChargeSplittingCriteria", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", propOrder = {
    "paymentMean"
})
public class AppliedChargeSplittingCriteria {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected PaymentMean paymentMean;

    /**
     * Gets the value of the paymentMean property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMean }
     *     
     */
    public PaymentMean getPaymentMean() {
        return paymentMean;
    }

    /**
     * Sets the value of the paymentMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMean }
     *     
     */
    public void setPaymentMean(PaymentMean value) {
        this.paymentMean = value;
    }

}
