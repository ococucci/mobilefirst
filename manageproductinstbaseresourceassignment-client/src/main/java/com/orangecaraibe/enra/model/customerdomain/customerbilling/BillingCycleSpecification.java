
package com.orangecaraibe.enra.model.customerdomain.customerbilling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingCycleSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillingCycleSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billingCycleSpecPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="localBillCycleNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingCycleSpecification", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", propOrder = {
    "billingCycleSpecPeriod",
    "localBillCycleNumber"
})
public class BillingCycleSpecification {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected int billingCycleSpecPeriod;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected String localBillCycleNumber;

    /**
     * Gets the value of the billingCycleSpecPeriod property.
     * 
     */
    public int getBillingCycleSpecPeriod() {
        return billingCycleSpecPeriod;
    }

    /**
     * Sets the value of the billingCycleSpecPeriod property.
     * 
     */
    public void setBillingCycleSpecPeriod(int value) {
        this.billingCycleSpecPeriod = value;
    }

    /**
     * Gets the value of the localBillCycleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalBillCycleNumber() {
        return localBillCycleNumber;
    }

    /**
     * Sets the value of the localBillCycleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalBillCycleNumber(String value) {
        this.localBillCycleNumber = value;
    }

}
