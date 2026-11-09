
package com.orangecaraibe.soa.v2.model.commonbusiness.party.paymentmeans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocalPaypal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocalPaypal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans}PaymentMean"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="confirmUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="paypalUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cancelUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tokenID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalPaypal", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans", propOrder = {
    "confirmUrl",
    "paypalUrl",
    "cancelUrl",
    "tokenID",
    "payerId"
})
public class LocalPaypal
    extends PaymentMean
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans", required = true)
    protected String confirmUrl;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans")
    protected String paypalUrl;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans", required = true)
    protected String cancelUrl;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans")
    protected String tokenID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans")
    protected String payerId;

    /**
     * Gets the value of the confirmUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmUrl() {
        return confirmUrl;
    }

    /**
     * Sets the value of the confirmUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmUrl(String value) {
        this.confirmUrl = value;
    }

    /**
     * Gets the value of the paypalUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalUrl() {
        return paypalUrl;
    }

    /**
     * Sets the value of the paypalUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalUrl(String value) {
        this.paypalUrl = value;
    }

    /**
     * Gets the value of the cancelUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelUrl() {
        return cancelUrl;
    }

    /**
     * Sets the value of the cancelUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelUrl(String value) {
        this.cancelUrl = value;
    }

    /**
     * Gets the value of the tokenID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenID() {
        return tokenID;
    }

    /**
     * Sets the value of the tokenID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenID(String value) {
        this.tokenID = value;
    }

    /**
     * Gets the value of the payerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerId() {
        return payerId;
    }

    /**
     * Sets the value of the payerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerId(String value) {
        this.payerId = value;
    }

}
