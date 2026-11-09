
package com.orangecaraibe.enra.model.offeringandproducts.commercialinstalledbase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.orangecaraibe.enra.model.offeringandproducts.commercialcatalogue.DiscountSpecification;


/**
 * <p>Java class for InstalledDiscount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstalledDiscount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="installedDiscountID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="discountSpecification" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue}DiscountSpecification"/&gt;
 *         &lt;element name="installedDiscountTemporaryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tailorMadeAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="tailorMadeAmountIncludingTax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstalledDiscount", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase", propOrder = {
    "installedDiscountID",
    "startDate",
    "endDate",
    "discountSpecification",
    "installedDiscountTemporaryID",
    "tailorMadeAmount",
    "tailorMadeAmountIncludingTax"
})
@XmlSeeAlso({
    InstalledNonRecurringDiscount.class,
    InstalledRecurringDiscount.class
})
public class InstalledDiscount {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase", required = true)
    protected String installedDiscountID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase", required = true)
    protected DiscountSpecification discountSpecification;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected String installedDiscountTemporaryID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected Double tailorMadeAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected Double tailorMadeAmountIncludingTax;

    /**
     * Gets the value of the installedDiscountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstalledDiscountID() {
        return installedDiscountID;
    }

    /**
     * Sets the value of the installedDiscountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstalledDiscountID(String value) {
        this.installedDiscountID = value;
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
     * Gets the value of the discountSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountSpecification }
     *     
     */
    public DiscountSpecification getDiscountSpecification() {
        return discountSpecification;
    }

    /**
     * Sets the value of the discountSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountSpecification }
     *     
     */
    public void setDiscountSpecification(DiscountSpecification value) {
        this.discountSpecification = value;
    }

    /**
     * Gets the value of the installedDiscountTemporaryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstalledDiscountTemporaryID() {
        return installedDiscountTemporaryID;
    }

    /**
     * Sets the value of the installedDiscountTemporaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstalledDiscountTemporaryID(String value) {
        this.installedDiscountTemporaryID = value;
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

}
