
package com.orangecaraibe.epco.model.commonbusiness.identity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualIdentityItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualIdentityItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userInclusiveValueUsed" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="userNonInclusiveValueUsed" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="userTotalValueUsed" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="userTaxIncludedAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="userDutyFreeAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="userNonTaxAppliedChargeAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="taxRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="individualIdentity" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity}IndividualIdentity"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualIdentityItem", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity", propOrder = {
    "userType",
    "userInclusiveValueUsed",
    "userNonInclusiveValueUsed",
    "userTotalValueUsed",
    "userTaxIncludedAmount",
    "userDutyFreeAmount",
    "userNonTaxAppliedChargeAmount",
    "taxRate",
    "individualIdentity"
})
public class IndividualIdentityItem {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity")
    protected String userType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity")
    protected Float userInclusiveValueUsed;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity")
    protected Float userNonInclusiveValueUsed;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity")
    protected Float userTotalValueUsed;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity")
    protected Float userTaxIncludedAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity")
    protected Float userDutyFreeAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity")
    protected Float userNonTaxAppliedChargeAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity")
    protected Float taxRate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity", required = true)
    protected IndividualIdentity individualIdentity;

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

    /**
     * Gets the value of the userInclusiveValueUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getUserInclusiveValueUsed() {
        return userInclusiveValueUsed;
    }

    /**
     * Sets the value of the userInclusiveValueUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setUserInclusiveValueUsed(Float value) {
        this.userInclusiveValueUsed = value;
    }

    /**
     * Gets the value of the userNonInclusiveValueUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getUserNonInclusiveValueUsed() {
        return userNonInclusiveValueUsed;
    }

    /**
     * Sets the value of the userNonInclusiveValueUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setUserNonInclusiveValueUsed(Float value) {
        this.userNonInclusiveValueUsed = value;
    }

    /**
     * Gets the value of the userTotalValueUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getUserTotalValueUsed() {
        return userTotalValueUsed;
    }

    /**
     * Sets the value of the userTotalValueUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setUserTotalValueUsed(Float value) {
        this.userTotalValueUsed = value;
    }

    /**
     * Gets the value of the userTaxIncludedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getUserTaxIncludedAmount() {
        return userTaxIncludedAmount;
    }

    /**
     * Sets the value of the userTaxIncludedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setUserTaxIncludedAmount(Float value) {
        this.userTaxIncludedAmount = value;
    }

    /**
     * Gets the value of the userDutyFreeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getUserDutyFreeAmount() {
        return userDutyFreeAmount;
    }

    /**
     * Sets the value of the userDutyFreeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setUserDutyFreeAmount(Float value) {
        this.userDutyFreeAmount = value;
    }

    /**
     * Gets the value of the userNonTaxAppliedChargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getUserNonTaxAppliedChargeAmount() {
        return userNonTaxAppliedChargeAmount;
    }

    /**
     * Sets the value of the userNonTaxAppliedChargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setUserNonTaxAppliedChargeAmount(Float value) {
        this.userNonTaxAppliedChargeAmount = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTaxRate(Float value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the individualIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualIdentity }
     *     
     */
    public IndividualIdentity getIndividualIdentity() {
        return individualIdentity;
    }

    /**
     * Sets the value of the individualIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualIdentity }
     *     
     */
    public void setIndividualIdentity(IndividualIdentity value) {
        this.individualIdentity = value;
    }

}
