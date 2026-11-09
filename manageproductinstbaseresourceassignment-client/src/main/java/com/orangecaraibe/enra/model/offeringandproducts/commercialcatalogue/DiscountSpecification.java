
package com.orangecaraibe.enra.model.offeringandproducts.commercialcatalogue;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscountSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="discountSpecificationCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tailorMadeAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="tailorMadePercentage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="discountValueSpec" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue}DiscountValueSpec" minOccurs="0"/&gt;
 *         &lt;element name="discountAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discountDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="tailorMadeAmountIncludingTax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="discountSpecificationLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validityPeriods" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue}ValidityPeriod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountSpecification", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue", propOrder = {
    "discountSpecificationCode",
    "tailorMadeAmount",
    "tailorMadePercentage",
    "discountValueSpec",
    "discountAction",
    "discountDuration",
    "tailorMadeAmountIncludingTax",
    "discountSpecificationLabel",
    "validityPeriods"
})
@XmlSeeAlso({
    RecurringDiscountSpec.class,
    NonRecurringDiscountSpec.class
})
public class DiscountSpecification {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue", required = true)
    protected String discountSpecificationCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue")
    protected Double tailorMadeAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue")
    protected Integer tailorMadePercentage;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue")
    protected DiscountValueSpec discountValueSpec;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue")
    protected String discountAction;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue")
    protected Integer discountDuration;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue")
    protected Double tailorMadeAmountIncludingTax;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue")
    protected String discountSpecificationLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue", nillable = true)
    protected List<ValidityPeriod> validityPeriods;

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
     * Gets the value of the discountValueSpec property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountValueSpec }
     *     
     */
    public DiscountValueSpec getDiscountValueSpec() {
        return discountValueSpec;
    }

    /**
     * Sets the value of the discountValueSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountValueSpec }
     *     
     */
    public void setDiscountValueSpec(DiscountValueSpec value) {
        this.discountValueSpec = value;
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
     * Gets the value of the discountSpecificationLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountSpecificationLabel() {
        return discountSpecificationLabel;
    }

    /**
     * Sets the value of the discountSpecificationLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountSpecificationLabel(String value) {
        this.discountSpecificationLabel = value;
    }

    /**
     * Gets the value of the validityPeriods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validityPeriods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidityPeriods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidityPeriod }
     * 
     * 
     */
    public List<ValidityPeriod> getValidityPeriods() {
        if (validityPeriods == null) {
            validityPeriods = new ArrayList<ValidityPeriod>();
        }
        return this.validityPeriods;
    }

}
