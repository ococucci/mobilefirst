
package com.orangecaraibe.enra.model.offeringandproducts.commercialcatalogue;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ValidityPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidityPeriod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="validityPeriodStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="validityPeriodEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidityPeriod", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue", propOrder = {
    "validityPeriodStartDate",
    "validityPeriodEndDate"
})
public class ValidityPeriod {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validityPeriodStartDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validityPeriodEndDate;

    /**
     * Gets the value of the validityPeriodStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidityPeriodStartDate() {
        return validityPeriodStartDate;
    }

    /**
     * Sets the value of the validityPeriodStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidityPeriodStartDate(XMLGregorianCalendar value) {
        this.validityPeriodStartDate = value;
    }

    /**
     * Gets the value of the validityPeriodEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidityPeriodEndDate() {
        return validityPeriodEndDate;
    }

    /**
     * Sets the value of the validityPeriodEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidityPeriodEndDate(XMLGregorianCalendar value) {
        this.validityPeriodEndDate = value;
    }

}
