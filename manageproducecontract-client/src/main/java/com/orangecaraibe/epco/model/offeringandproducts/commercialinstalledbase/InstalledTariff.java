
package com.orangecaraibe.epco.model.offeringandproducts.commercialinstalledbase;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.orangecaraibe.epco.model.offeringandproducts.commercialcatalogue.CommercialOperation;
import com.orangecaraibe.epco.model.offeringandproducts.commercialcatalogue.TariffSpecification;


/**
 * <p>Java class for InstalledTariff complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstalledTariff"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tariffSpecification" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue}TariffSpecification" minOccurs="0"/&gt;
 *         &lt;element name="installedTariffID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="commercialOperation" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue}CommercialOperation" minOccurs="0"/&gt;
 *         &lt;element name="installedDiscount" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase}InstalledDiscount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="applyingTriggeringEvent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="valueIncludingTax" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstalledTariff", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase", propOrder = {
    "tariffSpecification",
    "installedTariffID",
    "startDate",
    "endDate",
    "commercialOperation",
    "installedDiscount",
    "value",
    "applyingTriggeringEvent",
    "unit",
    "valueIncludingTax"
})
@XmlSeeAlso({
    InstalledRecurringTariff.class,
    InstalledNonRecurringTariff.class
})
public class InstalledTariff {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected TariffSpecification tariffSpecification;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase", required = true)
    protected String installedTariffID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected CommercialOperation commercialOperation;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase", nillable = true)
    protected List<InstalledDiscount> installedDiscount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected double value;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase", required = true)
    protected String applyingTriggeringEvent;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase", required = true)
    protected String unit;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected double valueIncludingTax;

    /**
     * Gets the value of the tariffSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link TariffSpecification }
     *     
     */
    public TariffSpecification getTariffSpecification() {
        return tariffSpecification;
    }

    /**
     * Sets the value of the tariffSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffSpecification }
     *     
     */
    public void setTariffSpecification(TariffSpecification value) {
        this.tariffSpecification = value;
    }

    /**
     * Gets the value of the installedTariffID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstalledTariffID() {
        return installedTariffID;
    }

    /**
     * Sets the value of the installedTariffID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstalledTariffID(String value) {
        this.installedTariffID = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the commercialOperation property.
     * 
     * @return
     *     possible object is
     *     {@link CommercialOperation }
     *     
     */
    public CommercialOperation getCommercialOperation() {
        return commercialOperation;
    }

    /**
     * Sets the value of the commercialOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercialOperation }
     *     
     */
    public void setCommercialOperation(CommercialOperation value) {
        this.commercialOperation = value;
    }

    /**
     * Gets the value of the installedDiscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installedDiscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstalledDiscount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstalledDiscount }
     * 
     * 
     */
    public List<InstalledDiscount> getInstalledDiscount() {
        if (installedDiscount == null) {
            installedDiscount = new ArrayList<InstalledDiscount>();
        }
        return this.installedDiscount;
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

}
