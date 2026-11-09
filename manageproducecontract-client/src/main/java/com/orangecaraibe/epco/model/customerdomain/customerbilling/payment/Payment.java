
package com.orangecaraibe.epco.model.customerdomain.customerbilling.payment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.orangecaraibe.epco.model.commonbusiness.interaction.InteractionSubject;
import com.orangecaraibe.epco.model.commonbusiness.party.paymentmeans.PaymentMean;
import com.orangecaraibe.epco.model.commonbusiness.party.role.Distributor;
import com.orangecaraibe.epco.model.customerdomain.customerbilling.Currency;
import com.orangecaraibe.epco.model.customerdomain.customerloyalty.LoyaltyBurn;
import com.orangecaraibe.epco.model.customerdomain.customerorder.CustomerOrderItem;
import com.orangecaraibe.epco.model.customerdomain.invoicing.Lettering;


/**
 * <p>Java class for Payment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}InteractionSubject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="customerOrderItem" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerOrder}CustomerOrderItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paymentStatus" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment}PaymentStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paymentSchedule" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment}PaymentSchedule" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="paymentMean" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans}PaymentMean" minOccurs="0"/&gt;
 *         &lt;element name="paymentMethod" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment}PaymentMethod" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}Currency" minOccurs="0"/&gt;
 *         &lt;element name="paymentTemporaryID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="loyaltyBurn" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty}LoyaltyBurn" minOccurs="0"/&gt;
 *         &lt;element name="letterings" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing}Lettering" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paymentLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localCustomerOrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receipt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localPaymentExternalSystemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localPaymentExternalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localChannelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localLoyaltyAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="localNewBillingAccountID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localCurrentBillingAccountID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentImages" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment}PaymentImage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="localProcessStepOrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localTransID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localDistributor" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role}Distributor" minOccurs="0"/&gt;
 *         &lt;element name="localPaymentType" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment}LocalPaymentType" minOccurs="0"/&gt;
 *         &lt;element name="localWhaInformations" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment}LocalWhaInformations" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payment", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment", propOrder = {
    "paymentID",
    "paymentDate",
    "customerOrderItem",
    "paymentStatus",
    "paymentSchedule",
    "amount",
    "paymentMean",
    "paymentMethod",
    "currency",
    "paymentTemporaryID",
    "loyaltyBurn",
    "letterings",
    "paymentLabel",
    "localCustomerOrderID",
    "receipt",
    "localPaymentExternalSystemCode",
    "localPaymentExternalID",
    "localChannelID",
    "localLoyaltyAmount",
    "localNewBillingAccountID",
    "localCurrentBillingAccountID",
    "paymentImages",
    "localProcessStepOrderID",
    "localTransID",
    "localDistributor",
    "localPaymentType",
    "localWhaInformations"
})
@XmlSeeAlso({
    LocalPaymentFacility.class
})
public class Payment
    extends InteractionSubject
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected String paymentID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment", nillable = true)
    protected List<CustomerOrderItem> customerOrderItem;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment", nillable = true)
    protected List<PaymentStatus> paymentStatus;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment", nillable = true)
    protected List<PaymentSchedule> paymentSchedule;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected Float amount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected PaymentMean paymentMean;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected PaymentMethod paymentMethod;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected Currency currency;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment", required = true)
    protected String paymentTemporaryID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected LoyaltyBurn loyaltyBurn;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment", nillable = true)
    protected List<Lettering> letterings;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected String paymentLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected String localCustomerOrderID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected String receipt;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected String localPaymentExternalSystemCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected String localPaymentExternalID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected String localChannelID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected Float localLoyaltyAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected String localNewBillingAccountID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected String localCurrentBillingAccountID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment", nillable = true)
    protected List<PaymentImage> paymentImages;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected String localProcessStepOrderID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected String localTransID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected Distributor localDistributor;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected LocalPaymentType localPaymentType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected LocalWhaInformations localWhaInformations;

    /**
     * Gets the value of the paymentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentID() {
        return paymentID;
    }

    /**
     * Sets the value of the paymentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentID(String value) {
        this.paymentID = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDate(XMLGregorianCalendar value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the customerOrderItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerOrderItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerOrderItem }
     * 
     * 
     */
    public List<CustomerOrderItem> getCustomerOrderItem() {
        if (customerOrderItem == null) {
            customerOrderItem = new ArrayList<CustomerOrderItem>();
        }
        return this.customerOrderItem;
    }

    /**
     * Gets the value of the paymentStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentStatus }
     * 
     * 
     */
    public List<PaymentStatus> getPaymentStatus() {
        if (paymentStatus == null) {
            paymentStatus = new ArrayList<PaymentStatus>();
        }
        return this.paymentStatus;
    }

    /**
     * Gets the value of the paymentSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentSchedule }
     * 
     * 
     */
    public List<PaymentSchedule> getPaymentSchedule() {
        if (paymentSchedule == null) {
            paymentSchedule = new ArrayList<PaymentSchedule>();
        }
        return this.paymentSchedule;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAmount(Float value) {
        this.amount = value;
    }

    /**
     * Gets the value of the paymentMean property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMean }
     *     
     */
    public PaymentMean getPaymentMean() {
        return paymentMean;
    }

    /**
     * Sets the value of the paymentMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMean }
     *     
     */
    public void setPaymentMean(PaymentMean value) {
        this.paymentMean = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethod }
     *     
     */
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethod }
     *     
     */
    public void setPaymentMethod(PaymentMethod value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the paymentTemporaryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTemporaryID() {
        return paymentTemporaryID;
    }

    /**
     * Sets the value of the paymentTemporaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTemporaryID(String value) {
        this.paymentTemporaryID = value;
    }

    /**
     * Gets the value of the loyaltyBurn property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyBurn }
     *     
     */
    public LoyaltyBurn getLoyaltyBurn() {
        return loyaltyBurn;
    }

    /**
     * Sets the value of the loyaltyBurn property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyBurn }
     *     
     */
    public void setLoyaltyBurn(LoyaltyBurn value) {
        this.loyaltyBurn = value;
    }

    /**
     * Gets the value of the letterings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the letterings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLetterings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lettering }
     * 
     * 
     */
    public List<Lettering> getLetterings() {
        if (letterings == null) {
            letterings = new ArrayList<Lettering>();
        }
        return this.letterings;
    }

    /**
     * Gets the value of the paymentLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentLabel() {
        return paymentLabel;
    }

    /**
     * Sets the value of the paymentLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentLabel(String value) {
        this.paymentLabel = value;
    }

    /**
     * Gets the value of the localCustomerOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalCustomerOrderID() {
        return localCustomerOrderID;
    }

    /**
     * Sets the value of the localCustomerOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalCustomerOrderID(String value) {
        this.localCustomerOrderID = value;
    }

    /**
     * Gets the value of the receipt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceipt() {
        return receipt;
    }

    /**
     * Sets the value of the receipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceipt(String value) {
        this.receipt = value;
    }

    /**
     * Gets the value of the localPaymentExternalSystemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalPaymentExternalSystemCode() {
        return localPaymentExternalSystemCode;
    }

    /**
     * Sets the value of the localPaymentExternalSystemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalPaymentExternalSystemCode(String value) {
        this.localPaymentExternalSystemCode = value;
    }

    /**
     * Gets the value of the localPaymentExternalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalPaymentExternalID() {
        return localPaymentExternalID;
    }

    /**
     * Sets the value of the localPaymentExternalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalPaymentExternalID(String value) {
        this.localPaymentExternalID = value;
    }

    /**
     * Gets the value of the localChannelID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalChannelID() {
        return localChannelID;
    }

    /**
     * Sets the value of the localChannelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalChannelID(String value) {
        this.localChannelID = value;
    }

    /**
     * Gets the value of the localLoyaltyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLocalLoyaltyAmount() {
        return localLoyaltyAmount;
    }

    /**
     * Sets the value of the localLoyaltyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLocalLoyaltyAmount(Float value) {
        this.localLoyaltyAmount = value;
    }

    /**
     * Gets the value of the localNewBillingAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalNewBillingAccountID() {
        return localNewBillingAccountID;
    }

    /**
     * Sets the value of the localNewBillingAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalNewBillingAccountID(String value) {
        this.localNewBillingAccountID = value;
    }

    /**
     * Gets the value of the localCurrentBillingAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalCurrentBillingAccountID() {
        return localCurrentBillingAccountID;
    }

    /**
     * Sets the value of the localCurrentBillingAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalCurrentBillingAccountID(String value) {
        this.localCurrentBillingAccountID = value;
    }

    /**
     * Gets the value of the paymentImages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentImages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentImages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentImage }
     * 
     * 
     */
    public List<PaymentImage> getPaymentImages() {
        if (paymentImages == null) {
            paymentImages = new ArrayList<PaymentImage>();
        }
        return this.paymentImages;
    }

    /**
     * Gets the value of the localProcessStepOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalProcessStepOrderID() {
        return localProcessStepOrderID;
    }

    /**
     * Sets the value of the localProcessStepOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalProcessStepOrderID(String value) {
        this.localProcessStepOrderID = value;
    }

    /**
     * Gets the value of the localTransID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTransID() {
        return localTransID;
    }

    /**
     * Sets the value of the localTransID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTransID(String value) {
        this.localTransID = value;
    }

    /**
     * Gets the value of the localDistributor property.
     * 
     * @return
     *     possible object is
     *     {@link Distributor }
     *     
     */
    public Distributor getLocalDistributor() {
        return localDistributor;
    }

    /**
     * Sets the value of the localDistributor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distributor }
     *     
     */
    public void setLocalDistributor(Distributor value) {
        this.localDistributor = value;
    }

    /**
     * Gets the value of the localPaymentType property.
     * 
     * @return
     *     possible object is
     *     {@link LocalPaymentType }
     *     
     */
    public LocalPaymentType getLocalPaymentType() {
        return localPaymentType;
    }

    /**
     * Sets the value of the localPaymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalPaymentType }
     *     
     */
    public void setLocalPaymentType(LocalPaymentType value) {
        this.localPaymentType = value;
    }

    /**
     * Gets the value of the localWhaInformations property.
     * 
     * @return
     *     possible object is
     *     {@link LocalWhaInformations }
     *     
     */
    public LocalWhaInformations getLocalWhaInformations() {
        return localWhaInformations;
    }

    /**
     * Sets the value of the localWhaInformations property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalWhaInformations }
     *     
     */
    public void setLocalWhaInformations(LocalWhaInformations value) {
        this.localWhaInformations = value;
    }

}
