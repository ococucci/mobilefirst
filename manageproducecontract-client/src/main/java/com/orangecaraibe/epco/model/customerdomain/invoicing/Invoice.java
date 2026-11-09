
package com.orangecaraibe.epco.model.customerdomain.invoicing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.orangecaraibe.epco.model.commonbusiness.interaction.InteractionSubject;
import com.orangecaraibe.epco.model.commonbusiness.party.role.Distributor;
import com.orangecaraibe.epco.model.commonbusiness.party.role.Operator;
import com.orangecaraibe.epco.model.customerdomain.customer.BillReceiver;
import com.orangecaraibe.epco.model.customerdomain.customer.Holder;
import com.orangecaraibe.epco.model.customerdomain.customer.Payer;
import com.orangecaraibe.epco.model.customerdomain.customerbilling.BillingAccount;
import com.orangecaraibe.epco.model.customerdomain.customerbilling.BillingCycleSpecification;
import com.orangecaraibe.epco.model.customerdomain.customerbilling.Currency;
import com.orangecaraibe.epco.model.customerdomain.customerbilling.InvoiceFormatSpec;
import com.orangecaraibe.epco.model.customerdomain.customerbilling.TaxItem;
import com.orangecaraibe.epco.model.customerdomain.customerbilling.consumption.CallDetailSheetItem;
import com.orangecaraibe.epco.model.customerdomain.customerbilling.payment.PaymentMethod;
import com.orangecaraibe.epco.model.customerdomain.customerorder.CustomerOrderItem;
import com.orangecaraibe.epco.model.offeringandproducts.commercialinstalledbase.InstalledPublicKey;


/**
 * <p>Java class for Invoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Invoice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}InteractionSubject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="invoiceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoiceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="nonTaxAppliedChargeAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="invoiceState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoiceStatus" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing}InvoiceStatus" minOccurs="0"/&gt;
 *         &lt;element name="billingAccount" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}BillingAccount" minOccurs="0"/&gt;
 *         &lt;element name="payer" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Customer}Payer" minOccurs="0"/&gt;
 *         &lt;element name="holder" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Customer}Holder" minOccurs="0"/&gt;
 *         &lt;element name="callDetailSheetItem" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Consumption}CallDetailSheetItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="installedPublicKey" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase}InstalledPublicKey" minOccurs="0"/&gt;
 *         &lt;element name="period" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing}Period" minOccurs="0"/&gt;
 *         &lt;element name="nextInvoiceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="amountDue" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="netOfTaxAmount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="currentBalance" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="previousBalance" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="invoiceFormatSpec" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}InvoiceFormatSpec"/&gt;
 *         &lt;element name="invoiceDomainSpec" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing}InvoiceItem" minOccurs="0"/&gt;
 *         &lt;element name="billingCycleSpecification" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}BillingCycleSpecification"/&gt;
 *         &lt;element name="currency" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}Currency"/&gt;
 *         &lt;element name="receiver" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Customer}BillReceiver"/&gt;
 *         &lt;element name="operator" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role}Operator"/&gt;
 *         &lt;element name="paymentMethod" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment}PaymentMethod" minOccurs="0"/&gt;
 *         &lt;element name="lettering" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing}Lettering" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="taxItem" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}TaxItem" maxOccurs="unbounded"/&gt;
 *         &lt;element name="contains" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing}Contains"/&gt;
 *         &lt;element name="invoiceImage" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing}InvoiceImage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="remainderAmount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="netOfTaxRemainderAmount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="taxIncludedTotAmount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="localDistributor" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role}Distributor" minOccurs="0"/&gt;
 *         &lt;element name="localChannelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerOrderItem" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerOrder}CustomerOrderItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Invoice", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing", propOrder = {
    "invoiceID",
    "invoiceType",
    "invoiceDate",
    "nonTaxAppliedChargeAmount",
    "invoiceState",
    "invoiceStatus",
    "billingAccount",
    "payer",
    "holder",
    "callDetailSheetItem",
    "installedPublicKey",
    "period",
    "nextInvoiceDate",
    "amountDue",
    "dueDate",
    "netOfTaxAmount",
    "currentBalance",
    "previousBalance",
    "invoiceFormatSpec",
    "invoiceDomainSpec",
    "billingCycleSpecification",
    "currency",
    "receiver",
    "operator",
    "paymentMethod",
    "lettering",
    "taxItem",
    "contains",
    "invoiceImage",
    "remainderAmount",
    "netOfTaxRemainderAmount",
    "taxIncludedTotAmount",
    "localDistributor",
    "localChannelID",
    "customerOrderItem"
})
public class Invoice
    extends InteractionSubject
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    protected String invoiceID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    protected String invoiceType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar invoiceDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    protected Float nonTaxAppliedChargeAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    protected String invoiceState;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    protected InvoiceStatus invoiceStatus;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    protected BillingAccount billingAccount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    protected Payer payer;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    protected Holder holder;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing", nillable = true)
    protected List<CallDetailSheetItem> callDetailSheetItem;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    protected InstalledPublicKey installedPublicKey;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    protected Period period;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextInvoiceDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    protected float amountDue;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    protected float netOfTaxAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    protected float currentBalance;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    protected Float previousBalance;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing", required = true)
    protected InvoiceFormatSpec invoiceFormatSpec;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    protected InvoiceItem invoiceDomainSpec;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing", required = true)
    protected BillingCycleSpecification billingCycleSpecification;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing", required = true)
    protected Currency currency;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing", required = true)
    protected BillReceiver receiver;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing", required = true)
    protected Operator operator;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    protected PaymentMethod paymentMethod;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing", nillable = true)
    protected List<Lettering> lettering;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing", required = true)
    protected List<TaxItem> taxItem;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing", required = true)
    protected Contains contains;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing", nillable = true)
    protected List<InvoiceImage> invoiceImage;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    protected float remainderAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    protected float netOfTaxRemainderAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    protected float taxIncludedTotAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    protected Distributor localDistributor;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    protected String localChannelID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing")
    protected CustomerOrderItem customerOrderItem;

    /**
     * Gets the value of the invoiceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceID() {
        return invoiceID;
    }

    /**
     * Sets the value of the invoiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceID(String value) {
        this.invoiceID = value;
    }

    /**
     * Gets the value of the invoiceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceType() {
        return invoiceType;
    }

    /**
     * Sets the value of the invoiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceType(String value) {
        this.invoiceType = value;
    }

    /**
     * Gets the value of the invoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Sets the value of the invoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvoiceDate(XMLGregorianCalendar value) {
        this.invoiceDate = value;
    }

    /**
     * Gets the value of the nonTaxAppliedChargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNonTaxAppliedChargeAmount() {
        return nonTaxAppliedChargeAmount;
    }

    /**
     * Sets the value of the nonTaxAppliedChargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNonTaxAppliedChargeAmount(Float value) {
        this.nonTaxAppliedChargeAmount = value;
    }

    /**
     * Gets the value of the invoiceState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceState() {
        return invoiceState;
    }

    /**
     * Sets the value of the invoiceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceState(String value) {
        this.invoiceState = value;
    }

    /**
     * Gets the value of the invoiceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceStatus }
     *     
     */
    public InvoiceStatus getInvoiceStatus() {
        return invoiceStatus;
    }

    /**
     * Sets the value of the invoiceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceStatus }
     *     
     */
    public void setInvoiceStatus(InvoiceStatus value) {
        this.invoiceStatus = value;
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
     * Gets the value of the holder property.
     * 
     * @return
     *     possible object is
     *     {@link Holder }
     *     
     */
    public Holder getHolder() {
        return holder;
    }

    /**
     * Sets the value of the holder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Holder }
     *     
     */
    public void setHolder(Holder value) {
        this.holder = value;
    }

    /**
     * Gets the value of the callDetailSheetItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callDetailSheetItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallDetailSheetItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CallDetailSheetItem }
     * 
     * 
     */
    public List<CallDetailSheetItem> getCallDetailSheetItem() {
        if (callDetailSheetItem == null) {
            callDetailSheetItem = new ArrayList<CallDetailSheetItem>();
        }
        return this.callDetailSheetItem;
    }

    /**
     * Gets the value of the installedPublicKey property.
     * 
     * @return
     *     possible object is
     *     {@link InstalledPublicKey }
     *     
     */
    public InstalledPublicKey getInstalledPublicKey() {
        return installedPublicKey;
    }

    /**
     * Sets the value of the installedPublicKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstalledPublicKey }
     *     
     */
    public void setInstalledPublicKey(InstalledPublicKey value) {
        this.installedPublicKey = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setPeriod(Period value) {
        this.period = value;
    }

    /**
     * Gets the value of the nextInvoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextInvoiceDate() {
        return nextInvoiceDate;
    }

    /**
     * Sets the value of the nextInvoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextInvoiceDate(XMLGregorianCalendar value) {
        this.nextInvoiceDate = value;
    }

    /**
     * Gets the value of the amountDue property.
     * 
     */
    public float getAmountDue() {
        return amountDue;
    }

    /**
     * Sets the value of the amountDue property.
     * 
     */
    public void setAmountDue(float value) {
        this.amountDue = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the netOfTaxAmount property.
     * 
     */
    public float getNetOfTaxAmount() {
        return netOfTaxAmount;
    }

    /**
     * Sets the value of the netOfTaxAmount property.
     * 
     */
    public void setNetOfTaxAmount(float value) {
        this.netOfTaxAmount = value;
    }

    /**
     * Gets the value of the currentBalance property.
     * 
     */
    public float getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Sets the value of the currentBalance property.
     * 
     */
    public void setCurrentBalance(float value) {
        this.currentBalance = value;
    }

    /**
     * Gets the value of the previousBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPreviousBalance() {
        return previousBalance;
    }

    /**
     * Sets the value of the previousBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPreviousBalance(Float value) {
        this.previousBalance = value;
    }

    /**
     * Gets the value of the invoiceFormatSpec property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceFormatSpec }
     *     
     */
    public InvoiceFormatSpec getInvoiceFormatSpec() {
        return invoiceFormatSpec;
    }

    /**
     * Sets the value of the invoiceFormatSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceFormatSpec }
     *     
     */
    public void setInvoiceFormatSpec(InvoiceFormatSpec value) {
        this.invoiceFormatSpec = value;
    }

    /**
     * Gets the value of the invoiceDomainSpec property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceItem }
     *     
     */
    public InvoiceItem getInvoiceDomainSpec() {
        return invoiceDomainSpec;
    }

    /**
     * Sets the value of the invoiceDomainSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceItem }
     *     
     */
    public void setInvoiceDomainSpec(InvoiceItem value) {
        this.invoiceDomainSpec = value;
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
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link BillReceiver }
     *     
     */
    public BillReceiver getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillReceiver }
     *     
     */
    public void setReceiver(BillReceiver value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link Operator }
     *     
     */
    public Operator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operator }
     *     
     */
    public void setOperator(Operator value) {
        this.operator = value;
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
     * Gets the value of the lettering property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lettering property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLettering().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lettering }
     * 
     * 
     */
    public List<Lettering> getLettering() {
        if (lettering == null) {
            lettering = new ArrayList<Lettering>();
        }
        return this.lettering;
    }

    /**
     * Gets the value of the taxItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxItem }
     * 
     * 
     */
    public List<TaxItem> getTaxItem() {
        if (taxItem == null) {
            taxItem = new ArrayList<TaxItem>();
        }
        return this.taxItem;
    }

    /**
     * Gets the value of the contains property.
     * 
     * @return
     *     possible object is
     *     {@link Contains }
     *     
     */
    public Contains getContains() {
        return contains;
    }

    /**
     * Sets the value of the contains property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contains }
     *     
     */
    public void setContains(Contains value) {
        this.contains = value;
    }

    /**
     * Gets the value of the invoiceImage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceImage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceImage }
     * 
     * 
     */
    public List<InvoiceImage> getInvoiceImage() {
        if (invoiceImage == null) {
            invoiceImage = new ArrayList<InvoiceImage>();
        }
        return this.invoiceImage;
    }

    /**
     * Gets the value of the remainderAmount property.
     * 
     */
    public float getRemainderAmount() {
        return remainderAmount;
    }

    /**
     * Sets the value of the remainderAmount property.
     * 
     */
    public void setRemainderAmount(float value) {
        this.remainderAmount = value;
    }

    /**
     * Gets the value of the netOfTaxRemainderAmount property.
     * 
     */
    public float getNetOfTaxRemainderAmount() {
        return netOfTaxRemainderAmount;
    }

    /**
     * Sets the value of the netOfTaxRemainderAmount property.
     * 
     */
    public void setNetOfTaxRemainderAmount(float value) {
        this.netOfTaxRemainderAmount = value;
    }

    /**
     * Gets the value of the taxIncludedTotAmount property.
     * 
     */
    public float getTaxIncludedTotAmount() {
        return taxIncludedTotAmount;
    }

    /**
     * Sets the value of the taxIncludedTotAmount property.
     * 
     */
    public void setTaxIncludedTotAmount(float value) {
        this.taxIncludedTotAmount = value;
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
     * Gets the value of the customerOrderItem property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderItem }
     *     
     */
    public CustomerOrderItem getCustomerOrderItem() {
        return customerOrderItem;
    }

    /**
     * Sets the value of the customerOrderItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderItem }
     *     
     */
    public void setCustomerOrderItem(CustomerOrderItem value) {
        this.customerOrderItem = value;
    }

}
