
package com.orangecaraibe.enra.model.customerdomain.customer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.enra.model.commonbusiness.party.contactmethods.EmailAddress;
import com.orangecaraibe.enra.model.customerdomain.customerbilling.BillingAccount;
import com.orangecaraibe.enra.model.offeringandproducts.commercialinstalledbase.Commitment;


/**
 * <p>Java class for Payer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Customer}Customer"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billingAccount" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}BillingAccount" minOccurs="0"/&gt;
 *         &lt;element name="commitment" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase}Commitment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="emailAddress" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods}EmailAddress" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payer", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Customer", propOrder = {
    "billingAccount",
    "commitment",
    "emailAddress"
})
public class Payer
    extends Customer
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Customer")
    protected BillingAccount billingAccount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Customer", nillable = true)
    protected List<Commitment> commitment;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Customer")
    protected EmailAddress emailAddress;

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

    /**
     * Gets the value of the commitment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commitment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commitment }
     * 
     * 
     */
    public List<Commitment> getCommitment() {
        if (commitment == null) {
            commitment = new ArrayList<Commitment>();
        }
        return this.commitment;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddress }
     *     
     */
    public EmailAddress getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddress }
     *     
     */
    public void setEmailAddress(EmailAddress value) {
        this.emailAddress = value;
    }

}
