
package com.orangecaraibe.soa.v2.model.commonbusiness.party.paymentmeans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.orangecaraibe.soa.v2.model.customerdomain.customer.Payer;
import com.orangecaraibe.soa.v2.model.customerdomain.customerbilling.BillingAccount;


/**
 * <p>Java class for PaymentMean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentMean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentMeanID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentMeanStatus" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans}PaymentMeanStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billingAccount" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}BillingAccount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paymentMeanTemporaryID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="chequeNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="usesForPeriod" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans}Period" minOccurs="0"/&gt;
 *         &lt;element name="payer" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Customer}Payer"/&gt;
 *         &lt;element name="paymentPageData" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans}PaymentPageData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMean", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans", propOrder = {
    "paymentMeanID",
    "paymentMeanStatus",
    "billingAccount",
    "paymentMeanTemporaryID",
    "chequeNumber",
    "creationDate",
    "usesForPeriod",
    "payer",
    "paymentPageData"
})
@XmlSeeAlso({
    Cash.class,
    LocalPaypal.class,
    LocalPayboxSystem.class,
    CashCard.class,
    DirectDebit.class,
    BankTransfer.class,
    BillingAccountChargePM.class,
    TIP.class,
    Cheque.class,
    VirtualPursePM.class,
    Other.class
})
public class PaymentMean {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans")
    protected String paymentMeanID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans", nillable = true)
    protected List<PaymentMeanStatus> paymentMeanStatus;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans", nillable = true)
    protected List<BillingAccount> billingAccount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans", required = true)
    protected String paymentMeanTemporaryID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans", required = true)
    protected String chequeNumber;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans")
    protected Period usesForPeriod;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans", required = true)
    protected Payer payer;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans", required = true)
    protected PaymentPageData paymentPageData;

    /**
     * Gets the value of the paymentMeanID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMeanID() {
        return paymentMeanID;
    }

    /**
     * Sets the value of the paymentMeanID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMeanID(String value) {
        this.paymentMeanID = value;
    }

    /**
     * Gets the value of the paymentMeanStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMeanStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMeanStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMeanStatus }
     * 
     * 
     */
    public List<PaymentMeanStatus> getPaymentMeanStatus() {
        if (paymentMeanStatus == null) {
            paymentMeanStatus = new ArrayList<PaymentMeanStatus>();
        }
        return this.paymentMeanStatus;
    }

    /**
     * Gets the value of the billingAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingAccount }
     * 
     * 
     */
    public List<BillingAccount> getBillingAccount() {
        if (billingAccount == null) {
            billingAccount = new ArrayList<BillingAccount>();
        }
        return this.billingAccount;
    }

    /**
     * Gets the value of the paymentMeanTemporaryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMeanTemporaryID() {
        return paymentMeanTemporaryID;
    }

    /**
     * Sets the value of the paymentMeanTemporaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMeanTemporaryID(String value) {
        this.paymentMeanTemporaryID = value;
    }

    /**
     * Gets the value of the chequeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChequeNumber() {
        return chequeNumber;
    }

    /**
     * Sets the value of the chequeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChequeNumber(String value) {
        this.chequeNumber = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the usesForPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getUsesForPeriod() {
        return usesForPeriod;
    }

    /**
     * Sets the value of the usesForPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setUsesForPeriod(Period value) {
        this.usesForPeriod = value;
    }

    /**
     * Gets the value of the payer property.
     * 
     * @return
     *     possible object is
     *     {@link Payer }
     *     
     */
    public Payer getPayer() {
        return payer;
    }

    /**
     * Sets the value of the payer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payer }
     *     
     */
    public void setPayer(Payer value) {
        this.payer = value;
    }

    /**
     * Gets the value of the paymentPageData property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentPageData }
     *     
     */
    public PaymentPageData getPaymentPageData() {
        return paymentPageData;
    }

    /**
     * Sets the value of the paymentPageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentPageData }
     *     
     */
    public void setPaymentPageData(PaymentPageData value) {
        this.paymentPageData = value;
    }

}
