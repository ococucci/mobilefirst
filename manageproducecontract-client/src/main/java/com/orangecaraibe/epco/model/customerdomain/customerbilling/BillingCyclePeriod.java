
package com.orangecaraibe.epco.model.customerdomain.customerbilling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BillingCyclePeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillingCyclePeriod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startDateBillingCyclePeriod" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="endDateBillingCyclePeriod" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingCyclePeriod", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", propOrder = {
    "startDateBillingCyclePeriod",
    "endDateBillingCyclePeriod"
})
public class BillingCyclePeriod {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateBillingCyclePeriod;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateBillingCyclePeriod;

    /**
     * Gets the value of the startDateBillingCyclePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateBillingCyclePeriod() {
        return startDateBillingCyclePeriod;
    }

    /**
     * Sets the value of the startDateBillingCyclePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateBillingCyclePeriod(XMLGregorianCalendar value) {
        this.startDateBillingCyclePeriod = value;
    }

    /**
     * Gets the value of the endDateBillingCyclePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateBillingCyclePeriod() {
        return endDateBillingCyclePeriod;
    }

    /**
     * Sets the value of the endDateBillingCyclePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDateBillingCyclePeriod(XMLGregorianCalendar value) {
        this.endDateBillingCyclePeriod = value;
    }

}
