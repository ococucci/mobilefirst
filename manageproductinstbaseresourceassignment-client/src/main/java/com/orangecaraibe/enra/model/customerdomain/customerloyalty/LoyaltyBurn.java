
package com.orangecaraibe.enra.model.customerdomain.customerloyalty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.enra.model.customerdomain.customerbilling.payment.Payment;


/**
 * <p>Java class for LoyaltyBurn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoyaltyBurn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty}LoyaltyTransaction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="payment" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment}Payment"/&gt;
 *         &lt;element name="burnAction" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyBurn", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty", propOrder = {
    "payment",
    "burnAction"
})
public class LoyaltyBurn
    extends LoyaltyTransaction
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty", required = true)
    protected Payment payment;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty", required = true)
    protected String burnAction;

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setPayment(Payment value) {
        this.payment = value;
    }

    /**
     * Gets the value of the burnAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBurnAction() {
        return burnAction;
    }

    /**
     * Sets the value of the burnAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBurnAction(String value) {
        this.burnAction = value;
    }

}
