
package com.orangecaraibe.soa.v2.interfaces.managepayment.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.soa.v2.model.customerdomain.customerbilling.payment.LocalPaymentFacility;


/**
 * <p>Java class for createPaymentFacilityResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createPaymentFacilityResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentFacility" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment}LocalPaymentFacility"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createPaymentFacilityResponse", namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManagePayment/Schemas", propOrder = {
    "paymentFacility"
})
public class CreatePaymentFacilityResponse {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManagePayment/Schemas", required = true)
    protected LocalPaymentFacility paymentFacility;

    /**
     * Gets the value of the paymentFacility property.
     * 
     * @return
     *     possible object is
     *     {@link LocalPaymentFacility }
     *     
     */
    public LocalPaymentFacility getPaymentFacility() {
        return paymentFacility;
    }

    /**
     * Sets the value of the paymentFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalPaymentFacility }
     *     
     */
    public void setPaymentFacility(LocalPaymentFacility value) {
        this.paymentFacility = value;
    }

}
