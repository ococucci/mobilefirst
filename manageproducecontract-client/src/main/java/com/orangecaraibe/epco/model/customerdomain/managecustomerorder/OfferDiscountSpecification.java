
package com.orangecaraibe.epco.model.customerdomain.managecustomerorder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfferDiscountSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferDiscountSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="discountSpecificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tailorMadeAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="tailorMadePercentage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="discountAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="installedDiscount" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}InstalledDiscount" minOccurs="0"/&gt;
 *         &lt;element name="discountSpecificationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tailorMadeAmountIncludingTax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="discountDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferDiscountSpecification", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", propOrder = {
    "discountSpecificationCode",
    "tailorMadeAmount",
    "tailorMadePercentage",
    "discountAction",
    "installedDiscount",
    "discountSpecificationType",
    "tailorMadeAmountIncludingTax",
    "discountDuration"
})
public class OfferDiscountSpecification {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String discountSpecificationCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected Double tailorMadeAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected Integer tailorMadePercentage;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String discountAction;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected InstalledDiscount installedDiscount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String discountSpecificationType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected Double tailorMadeAmountIncludingTax;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected Integer discountDuration;

    /**
     * Gets the value of the discountSpecificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountSpecificationCode() {
        return discountSpecificationCode;
    }

    /**
     * Sets the value of the discountSpecificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountSpecificationCode(String value) {
        this.discountSpecificationCode = value;
    }

    /**
     * Gets the value of the tailorMadeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTailorMadeAmount() {
        return tailorMadeAmount;
    }

    /**
     * Sets the value of the tailorMadeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTailorMadeAmount(Double value) {
        this.tailorMadeAmount = value;
    }

    /**
     * Gets the value of the tailorMadePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTailorMadePercentage() {
        return tailorMadePercentage;
    }

    /**
     * Sets the value of the tailorMadePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTailorMadePercentage(Integer value) {
        this.tailorMadePercentage = value;
    }

    /**
     * Gets the value of the discountAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountAction() {
        return discountAction;
    }

    /**
     * Sets the value of the discountAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountAction(String value) {
        this.discountAction = value;
    }

    /**
     * Gets the value of the installedDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link InstalledDiscount }
     *     
     */
    public InstalledDiscount getInstalledDiscount() {
        return installedDiscount;
    }

    /**
     * Sets the value of the installedDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstalledDiscount }
     *     
     */
    public void setInstalledDiscount(InstalledDiscount value) {
        this.installedDiscount = value;
    }

    /**
     * Gets the value of the discountSpecificationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountSpecificationType() {
        return discountSpecificationType;
    }

    /**
     * Sets the value of the discountSpecificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountSpecificationType(String value) {
        this.discountSpecificationType = value;
    }

    /**
     * Gets the value of the tailorMadeAmountIncludingTax property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTailorMadeAmountIncludingTax() {
        return tailorMadeAmountIncludingTax;
    }

    /**
     * Sets the value of the tailorMadeAmountIncludingTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTailorMadeAmountIncludingTax(Double value) {
        this.tailorMadeAmountIncludingTax = value;
    }

    /**
     * Gets the value of the discountDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiscountDuration() {
        return discountDuration;
    }

    /**
     * Sets the value of the discountDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiscountDuration(Integer value) {
        this.discountDuration = value;
    }

}
