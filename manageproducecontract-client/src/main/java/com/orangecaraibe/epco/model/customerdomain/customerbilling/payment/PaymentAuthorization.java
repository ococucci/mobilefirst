
package com.orangecaraibe.epco.model.customerdomain.customerbilling.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.orangecaraibe.epco.model.commonbusiness.interaction.ComputerOrNetworkEquipment;
import com.orangecaraibe.epco.model.commonbusiness.party.paymentmeans.CashCard;


/**
 * <p>Java class for PaymentAuthorization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentAuthorization"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="paymentAuthorizationTempID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="payment" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment}Payment"/&gt;
 *         &lt;element name="cashCard" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans}CashCard"/&gt;
 *         &lt;element name="paymentAuthorizationID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="receipt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="computerOrNetworkEquipment" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}ComputerOrNetworkEquipment"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentAuthorization", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment", propOrder = {
    "date",
    "paymentAuthorizationTempID",
    "payment",
    "cashCard",
    "paymentAuthorizationID",
    "receipt",
    "computerOrNetworkEquipment"
})
public class PaymentAuthorization {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment", required = true)
    protected String paymentAuthorizationTempID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment", required = true)
    protected Payment payment;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment", required = true)
    protected CashCard cashCard;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment", required = true)
    protected String paymentAuthorizationID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment", required = true)
    protected String receipt;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment", required = true)
    protected ComputerOrNetworkEquipment computerOrNetworkEquipment;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the paymentAuthorizationTempID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAuthorizationTempID() {
        return paymentAuthorizationTempID;
    }

    /**
     * Sets the value of the paymentAuthorizationTempID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAuthorizationTempID(String value) {
        this.paymentAuthorizationTempID = value;
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
     * Gets the value of the cashCard property.
     * 
     * @return
     *     possible object is
     *     {@link CashCard }
     *     
     */
    public CashCard getCashCard() {
        return cashCard;
    }

    /**
     * Sets the value of the cashCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashCard }
     *     
     */
    public void setCashCard(CashCard value) {
        this.cashCard = value;
    }

    /**
     * Gets the value of the paymentAuthorizationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAuthorizationID() {
        return paymentAuthorizationID;
    }

    /**
     * Sets the value of the paymentAuthorizationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAuthorizationID(String value) {
        this.paymentAuthorizationID = value;
    }

    /**
     * Gets the value of the receipt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceipt() {
        return receipt;
    }

    /**
     * Sets the value of the receipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceipt(String value) {
        this.receipt = value;
    }

    /**
     * Gets the value of the computerOrNetworkEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link ComputerOrNetworkEquipment }
     *     
     */
    public ComputerOrNetworkEquipment getComputerOrNetworkEquipment() {
        return computerOrNetworkEquipment;
    }

    /**
     * Sets the value of the computerOrNetworkEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputerOrNetworkEquipment }
     *     
     */
    public void setComputerOrNetworkEquipment(ComputerOrNetworkEquipment value) {
        this.computerOrNetworkEquipment = value;
    }

}
