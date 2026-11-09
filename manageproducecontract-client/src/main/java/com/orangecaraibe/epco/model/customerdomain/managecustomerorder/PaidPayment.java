
package com.orangecaraibe.epco.model.customerdomain.managecustomerorder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaidPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaidPayment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentMean" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}PaidPaymentMean" minOccurs="0"/&gt;
 *         &lt;element name="paymentAuthorization" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}PaidPaymentAuthorization" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaidPayment", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", propOrder = {
    "paymentID",
    "paymentMean",
    "paymentAuthorization"
})
public class PaidPayment {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String paymentID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected PaidPaymentMean paymentMean;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected PaidPaymentAuthorization paymentAuthorization;

    /**
     * Gets the value of the paymentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentID() {
        return paymentID;
    }

    /**
     * Sets the value of the paymentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentID(String value) {
        this.paymentID = value;
    }

    /**
     * Gets the value of the paymentMean property.
     * 
     * @return
     *     possible object is
     *     {@link PaidPaymentMean }
     *     
     */
    public PaidPaymentMean getPaymentMean() {
        return paymentMean;
    }

    /**
     * Sets the value of the paymentMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaidPaymentMean }
     *     
     */
    public void setPaymentMean(PaidPaymentMean value) {
        this.paymentMean = value;
    }

    /**
     * Gets the value of the paymentAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link PaidPaymentAuthorization }
     *     
     */
    public PaidPaymentAuthorization getPaymentAuthorization() {
        return paymentAuthorization;
    }

    /**
     * Sets the value of the paymentAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaidPaymentAuthorization }
     *     
     */
    public void setPaymentAuthorization(PaidPaymentAuthorization value) {
        this.paymentAuthorization = value;
    }

}
