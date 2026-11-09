
package com.orangecaraibe.soa.v2.model.customerdomain.customerloyalty;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.soa.v2.model.commonbusiness.interaction.InteractionSubject;
import com.orangecaraibe.soa.v2.model.customerdomain.customerbilling.BillingAccount;
import com.orangecaraibe.soa.v2.model.offeringandproducts.commercialinstalledbase.InstalledContract;


/**
 * <p>Java class for LoyaltyAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoyaltyAccount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}InteractionSubject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billingAccount" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}BillingAccount" minOccurs="0"/&gt;
 *         &lt;element name="loyaltyAccountID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="loyaltyBalance" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty}LoyaltyBalance" maxOccurs="unbounded"/&gt;
 *         &lt;element name="localInstalledContract" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase}InstalledContract" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyAccount", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty", propOrder = {
    "billingAccount",
    "loyaltyAccountID",
    "loyaltyBalance",
    "localInstalledContract"
})
public class LoyaltyAccount
    extends InteractionSubject
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty")
    protected BillingAccount billingAccount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty", required = true)
    protected String loyaltyAccountID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty", required = true)
    protected List<LoyaltyBalance> loyaltyBalance;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty")
    protected InstalledContract localInstalledContract;

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
     * Gets the value of the loyaltyAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyAccountID() {
        return loyaltyAccountID;
    }

    /**
     * Sets the value of the loyaltyAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyAccountID(String value) {
        this.loyaltyAccountID = value;
    }

    /**
     * Gets the value of the loyaltyBalance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyBalance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyBalance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyBalance }
     * 
     * 
     */
    public List<LoyaltyBalance> getLoyaltyBalance() {
        if (loyaltyBalance == null) {
            loyaltyBalance = new ArrayList<LoyaltyBalance>();
        }
        return this.loyaltyBalance;
    }

    /**
     * Gets the value of the localInstalledContract property.
     * 
     * @return
     *     possible object is
     *     {@link InstalledContract }
     *     
     */
    public InstalledContract getLocalInstalledContract() {
        return localInstalledContract;
    }

    /**
     * Sets the value of the localInstalledContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstalledContract }
     *     
     */
    public void setLocalInstalledContract(InstalledContract value) {
        this.localInstalledContract = value;
    }

}
