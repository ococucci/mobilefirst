
package com.orangecaraibe.epco.model.customerdomain.managecustomerorder;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfferTariffSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferTariffSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tariffSpecificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tariffAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discountSpecification" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}OfferDiscountSpecification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="installedTariff" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}InstalledTariff" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="valueIncludingTax" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="tariffSpecificationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferTariffSpecification", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", propOrder = {
    "tariffSpecificationCode",
    "tariffAction",
    "discountSpecification",
    "installedTariff",
    "value",
    "valueIncludingTax",
    "tariffSpecificationType",
    "unit"
})
public class OfferTariffSpecification {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String tariffSpecificationCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String tariffAction;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", nillable = true)
    protected List<OfferDiscountSpecification> discountSpecification;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected InstalledTariff installedTariff;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected double value;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected double valueIncludingTax;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String tariffSpecificationType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String unit;

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
     * Gets the value of the discountSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferDiscountSpecification }
     * 
     * 
     */
    public List<OfferDiscountSpecification> getDiscountSpecification() {
        if (discountSpecification == null) {
            discountSpecification = new ArrayList<OfferDiscountSpecification>();
        }
        return this.discountSpecification;
    }

    /**
     * Gets the value of the installedTariff property.
     * 
     * @return
     *     possible object is
     *     {@link InstalledTariff }
     *     
     */
    public InstalledTariff getInstalledTariff() {
        return installedTariff;
    }

    /**
     * Sets the value of the installedTariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstalledTariff }
     *     
     */
    public void setInstalledTariff(InstalledTariff value) {
        this.installedTariff = value;
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
     * Gets the value of the tariffSpecificationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffSpecificationType() {
        return tariffSpecificationType;
    }

    /**
     * Sets the value of the tariffSpecificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffSpecificationType(String value) {
        this.tariffSpecificationType = value;
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

}
