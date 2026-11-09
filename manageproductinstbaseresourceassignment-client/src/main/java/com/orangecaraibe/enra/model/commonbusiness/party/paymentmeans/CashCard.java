
package com.orangecaraibe.enra.model.commonbusiness.party.paymentmeans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CashCard"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans}PaymentMean"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CVV" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="local3DSecureData" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans}Local3DSecureData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashCard", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans", propOrder = {
    "cardType",
    "cardNumber",
    "expirationDate",
    "lastName",
    "cvv",
    "firstName",
    "local3DSecureData"
})
@XmlSeeAlso({
    StoredCashCard.class,
    EmbeddedCashCard.class
})
public class CashCard
    extends PaymentMean
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans")
    protected String cardType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans", required = true)
    protected String cardNumber;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans", required = true)
    protected String expirationDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans", required = true)
    protected String lastName;
    @XmlElement(name = "CVV", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans", required = true)
    protected String cvv;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans", required = true)
    protected String firstName;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans")
    protected Local3DSecureData local3DSecureData;

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the cvv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVV() {
        return cvv;
    }

    /**
     * Sets the value of the cvv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVV(String value) {
        this.cvv = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the local3DSecureData property.
     * 
     * @return
     *     possible object is
     *     {@link Local3DSecureData }
     *     
     */
    public Local3DSecureData getLocal3DSecureData() {
        return local3DSecureData;
    }

    /**
     * Sets the value of the local3DSecureData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Local3DSecureData }
     *     
     */
    public void setLocal3DSecureData(Local3DSecureData value) {
        this.local3DSecureData = value;
    }

}
