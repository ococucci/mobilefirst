
package com.orangecaraibe.soa.v2.interfaces.managepayment.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.soa.v2.model.customerdomain.customerbilling.payment.PaymentAuthorization;


/**
 * <p>Java class for getPaymentAuthorizationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPaymentAuthorizationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentAuthorization" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment}PaymentAuthorization"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPaymentAuthorizationResponse", namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManagePayment/Schemas", propOrder = {
    "paymentAuthorization"
})
public class GetPaymentAuthorizationResponse {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManagePayment/Schemas", required = true)
    protected PaymentAuthorization paymentAuthorization;

    /**
     * Gets the value of the paymentAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentAuthorization }
     *     
     */
    public PaymentAuthorization getPaymentAuthorization() {
        return paymentAuthorization;
    }

    /**
     * Sets the value of the paymentAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAuthorization }
     *     
     */
    public void setPaymentAuthorization(PaymentAuthorization value) {
        this.paymentAuthorization = value;
    }

}
