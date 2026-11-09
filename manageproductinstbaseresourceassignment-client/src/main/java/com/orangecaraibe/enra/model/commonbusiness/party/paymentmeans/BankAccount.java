
package com.orangecaraibe.enra.model.commonbusiness.party.paymentmeans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankAccount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="domiciliation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IBAN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BIC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="incumbent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="localAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="localCleRIB" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="localBankCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="localCounterBank" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankAccount", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans", propOrder = {
    "domiciliation",
    "iban",
    "bic",
    "incumbent",
    "localAccountNumber",
    "localCleRIB",
    "localBankCode",
    "localCounterBank",
    "rum"
})
public class BankAccount {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans")
    protected String domiciliation;
    @XmlElement(name = "IBAN", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans", required = true)
    protected String iban;
    @XmlElement(name = "BIC", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans", required = true)
    protected String bic;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans", required = true)
    protected String incumbent;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans", required = true)
    protected String localAccountNumber;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans", required = true)
    protected String localCleRIB;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans", required = true)
    protected String localBankCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans", required = true)
    protected String localCounterBank;
    @XmlElement(name = "RUM", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans")
    protected String rum;

    /**
     * Gets the value of the domiciliation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomiciliation() {
        return domiciliation;
    }

    /**
     * Sets the value of the domiciliation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomiciliation(String value) {
        this.domiciliation = value;
    }

    /**
     * Gets the value of the iban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
    }

    /**
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIC() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIC(String value) {
        this.bic = value;
    }

    /**
     * Gets the value of the incumbent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncumbent() {
        return incumbent;
    }

    /**
     * Sets the value of the incumbent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncumbent(String value) {
        this.incumbent = value;
    }

    /**
     * Gets the value of the localAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalAccountNumber() {
        return localAccountNumber;
    }

    /**
     * Sets the value of the localAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalAccountNumber(String value) {
        this.localAccountNumber = value;
    }

    /**
     * Gets the value of the localCleRIB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalCleRIB() {
        return localCleRIB;
    }

    /**
     * Sets the value of the localCleRIB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalCleRIB(String value) {
        this.localCleRIB = value;
    }

    /**
     * Gets the value of the localBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalBankCode() {
        return localBankCode;
    }

    /**
     * Sets the value of the localBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalBankCode(String value) {
        this.localBankCode = value;
    }

    /**
     * Gets the value of the localCounterBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalCounterBank() {
        return localCounterBank;
    }

    /**
     * Sets the value of the localCounterBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalCounterBank(String value) {
        this.localCounterBank = value;
    }

    /**
     * Gets the value of the rum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUM() {
        return rum;
    }

    /**
     * Sets the value of the rum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUM(String value) {
        this.rum = value;
    }

}
