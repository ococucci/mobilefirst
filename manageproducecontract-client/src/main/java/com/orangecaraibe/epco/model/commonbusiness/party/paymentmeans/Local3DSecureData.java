
package com.orangecaraibe.epco.model.commonbusiness.party.paymentmeans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Local3DSecureData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Local3DSecureData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="payerAuthenticationRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="actionURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payerAuthenticationResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payboxRemoteMPIResponse" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans}PayboxRemoteMPIResponse" minOccurs="0"/&gt;
 *         &lt;element name="idSession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idMerchant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Local3DSecureData", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans", propOrder = {
    "payerAuthenticationRequest",
    "merchantData",
    "actionURL",
    "payerAuthenticationResponse",
    "payboxRemoteMPIResponse",
    "idSession",
    "idMerchant"
})
public class Local3DSecureData {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans")
    protected String payerAuthenticationRequest;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans")
    protected String merchantData;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans")
    protected String actionURL;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans")
    protected String payerAuthenticationResponse;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans")
    protected PayboxRemoteMPIResponse payboxRemoteMPIResponse;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans")
    protected String idSession;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans")
    protected String idMerchant;

    /**
     * Gets the value of the payerAuthenticationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerAuthenticationRequest() {
        return payerAuthenticationRequest;
    }

    /**
     * Sets the value of the payerAuthenticationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerAuthenticationRequest(String value) {
        this.payerAuthenticationRequest = value;
    }

    /**
     * Gets the value of the merchantData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantData() {
        return merchantData;
    }

    /**
     * Sets the value of the merchantData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantData(String value) {
        this.merchantData = value;
    }

    /**
     * Gets the value of the actionURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionURL() {
        return actionURL;
    }

    /**
     * Sets the value of the actionURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionURL(String value) {
        this.actionURL = value;
    }

    /**
     * Gets the value of the payerAuthenticationResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerAuthenticationResponse() {
        return payerAuthenticationResponse;
    }

    /**
     * Sets the value of the payerAuthenticationResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerAuthenticationResponse(String value) {
        this.payerAuthenticationResponse = value;
    }

    /**
     * Gets the value of the payboxRemoteMPIResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PayboxRemoteMPIResponse }
     *     
     */
    public PayboxRemoteMPIResponse getPayboxRemoteMPIResponse() {
        return payboxRemoteMPIResponse;
    }

    /**
     * Sets the value of the payboxRemoteMPIResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayboxRemoteMPIResponse }
     *     
     */
    public void setPayboxRemoteMPIResponse(PayboxRemoteMPIResponse value) {
        this.payboxRemoteMPIResponse = value;
    }

    /**
     * Gets the value of the idSession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSession() {
        return idSession;
    }

    /**
     * Sets the value of the idSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSession(String value) {
        this.idSession = value;
    }

    /**
     * Gets the value of the idMerchant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdMerchant() {
        return idMerchant;
    }

    /**
     * Sets the value of the idMerchant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdMerchant(String value) {
        this.idMerchant = value;
    }

}
