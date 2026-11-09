
package com.orangecaraibe.soa.v2.model.customerdomain.customerbilling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BillDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillDate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="billingCycleSpecification" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}BillingCycleSpecification"/&gt;
 *         &lt;element name="localBillDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillDate", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", propOrder = {
    "billDay",
    "billingCycleSpecification",
    "localBillDate"
})
public class BillDate {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected Integer billDay;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", required = true)
    protected BillingCycleSpecification billingCycleSpecification;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar localBillDate;

    /**
     * Gets the value of the billDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBillDay() {
        return billDay;
    }

    /**
     * Sets the value of the billDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBillDay(Integer value) {
        this.billDay = value;
    }

    /**
     * Gets the value of the billingCycleSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link BillingCycleSpecification }
     *     
     */
    public BillingCycleSpecification getBillingCycleSpecification() {
        return billingCycleSpecification;
    }

    /**
     * Sets the value of the billingCycleSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingCycleSpecification }
     *     
     */
    public void setBillingCycleSpecification(BillingCycleSpecification value) {
        this.billingCycleSpecification = value;
    }

    /**
     * Gets the value of the localBillDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocalBillDate() {
        return localBillDate;
    }

    /**
     * Sets the value of the localBillDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocalBillDate(XMLGregorianCalendar value) {
        this.localBillDate = value;
    }

}
