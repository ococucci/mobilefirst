
package com.orangecaraibe.soa.v2.model.offeringandproducts.commercialcatalogue;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TariffSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tariffSpecificationCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="applyingTriggeringEvent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vatCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tariffAction" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="valueIncludingTax" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="discountSpecifications" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue}DiscountSpecification" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "TariffSpecification", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue", propOrder = {
    "tariffSpecificationCode",
    "value",
    "applyingTriggeringEvent",
    "unit",
    "vatCode",
    "tariffAction",
    "valueIncludingTax",
    "discountSpecifications",
    "validityPeriods"
})
@XmlSeeAlso({
    RecurringTariffSpec.class,
    NonRecurringTariffSpec.class
})
public class TariffSpecification {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue", required = true)
    protected String tariffSpecificationCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue")
    protected double value;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue", required = true)
    protected String applyingTriggeringEvent;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue", required = true)
    protected String unit;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue", required = true)
    protected String vatCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue", required = true)
    protected String tariffAction;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue")
    protected double valueIncludingTax;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue", nillable = true)
    protected List<DiscountSpecification> discountSpecifications;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue", nillable = true)
    protected List<ValidityPeriod> validityPeriods;

    /**
     * Gets the value of the tariffSpecificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffSpecificationCode() {
        return tariffSpecificationCode;
    }

    /**
     * Sets the value of the tariffSpecificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffSpecificationCode(String value) {
        this.tariffSpecificationCode = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Gets the value of the applyingTriggeringEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyingTriggeringEvent() {
        return applyingTriggeringEvent;
    }

    /**
     * Sets the value of the applyingTriggeringEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyingTriggeringEvent(String value) {
        this.applyingTriggeringEvent = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the vatCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatCode() {
        return vatCode;
    }

    /**
     * Sets the value of the vatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatCode(String value) {
        this.vatCode = value;
    }

    /**
     * Gets the value of the tariffAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffAction() {
        return tariffAction;
    }

    /**
     * Sets the value of the tariffAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffAction(String value) {
        this.tariffAction = value;
    }

    /**
     * Gets the value of the valueIncludingTax property.
     * 
     */
    public double getValueIncludingTax() {
        return valueIncludingTax;
    }

    /**
     * Sets the value of the valueIncludingTax property.
     * 
     */
    public void setValueIncludingTax(double value) {
        this.valueIncludingTax = value;
    }

    /**
     * Gets the value of the discountSpecifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountSpecifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountSpecifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountSpecification }
     * 
     * 
     */
    public List<DiscountSpecification> getDiscountSpecifications() {
        if (discountSpecifications == null) {
            discountSpecifications = new ArrayList<DiscountSpecification>();
        }
        return this.discountSpecifications;
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
