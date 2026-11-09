
package com.orangecaraibe.epco.model.customerdomain.invoicing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.epco.model.customerdomain.customerbilling.payment.OverPayment;
import com.orangecaraibe.epco.model.customerdomain.customerbilling.payment.Payment;


/**
 * <p>Java class for Lettering complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Lettering"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="payment" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment}Payment"/&gt;
 *         &lt;element name="invoice" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing}Invoice"/&gt;
 *         &lt;element name="overPayment" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment}OverPayment"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lettering", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing", propOrder = {
    "amount",
    "payment",
    "invoice",
    "overPayment"
})
public class Lettering {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    protected float amount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing", required = true)
    protected Payment payment;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing", required = true)
    protected Invoice invoice;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing", required = true)
    protected OverPayment overPayment;

    /**
     * Gets the value of the amount property.
     * 
     */
    public float getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(float value) {
        this.amount = value;
    }

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
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link Invoice }
     *     
     */
    public Invoice getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Invoice }
     *     
     */
    public void setInvoice(Invoice value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the overPayment property.
     * 
     * @return
     *     possible object is
     *     {@link OverPayment }
     *     
     */
    public OverPayment getOverPayment() {
        return overPayment;
    }

    /**
     * Sets the value of the overPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverPayment }
     *     
     */
    public void setOverPayment(OverPayment value) {
        this.overPayment = value;
    }

}
