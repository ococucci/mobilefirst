
package com.orangecaraibe.enra.model.customerdomain.customerbilling.rating;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.enra.model.customerdomain.customerbilling.BillingAccount;


/**
 * <p>Java class for AppliedChargeSplittingCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppliedChargeSplittingCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appliedChargeType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="billingAccount" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}BillingAccount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppliedChargeSplittingCriteria", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", propOrder = {
    "appliedChargeType",
    "billingAccount"
})
public class AppliedChargeSplittingCriteria {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", required = true)
    protected String appliedChargeType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected BillingAccount billingAccount;

    /**
     * Gets the value of the appliedChargeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppliedChargeType() {
        return appliedChargeType;
    }

    /**
     * Sets the value of the appliedChargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppliedChargeType(String value) {
        this.appliedChargeType = value;
    }

    /**
     * Gets the value of the billingAccount property.
     * 
     * @return
     *     possible object is
     *     {@link BillingAccount }
     *     
     */
    public BillingAccount getBillingAccount() {
        return billingAccount;
    }

    /**
     * Sets the value of the billingAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingAccount }
     *     
     */
    public void setBillingAccount(BillingAccount value) {
        this.billingAccount = value;
    }

}
