
package com.orangecaraibe.enra.model.customerdomain.customerbilling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.orangecaraibe.enra.model.commonbusiness.interaction.InteractionSubject;
import com.orangecaraibe.enra.model.commonbusiness.party.Party;
import com.orangecaraibe.enra.model.commonbusiness.party.contactmethods.PostalAddress;
import com.orangecaraibe.enra.model.commonbusiness.party.paymentmeans.PaymentMean;
import com.orangecaraibe.enra.model.customerdomain.invoicing.Invoice;
import com.orangecaraibe.enra.model.offeringandproducts.commercialinstalledbase.InstalledOffer;
import com.orangecaraibe.enra.model.offeringandproducts.productinstalledbase.InstalledProduct;


/**
 * <p>Java class for BillingAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillingAccount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}InteractionSubject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billingAccountID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}Currency" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ledgerSegment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="customerAccount" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}CustomerAccount" minOccurs="0"/&gt;
 *         &lt;element name="billDate" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}BillDate" minOccurs="0"/&gt;
 *         &lt;element name="invoiceFormatSpec" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}InvoiceFormatSpec" minOccurs="0"/&gt;
 *         &lt;element name="taxProfile" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}TaxProfile" minOccurs="0"/&gt;
 *         &lt;element name="paymentTerm" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}PaymentTerm" minOccurs="0"/&gt;
 *         &lt;element name="dunningProfile" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}DunningProfile" minOccurs="0"/&gt;
 *         &lt;element name="updateDesiredDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="billingAccountStatus" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}BillingAccountStatus" minOccurs="0"/&gt;
 *         &lt;element name="billingCycleSpecification" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}BillingCycleSpecification" minOccurs="0"/&gt;
 *         &lt;element name="invoices" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing}Invoice" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lastInvoiceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="nextInvoiceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="billingCyclePeriod" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}BillingCyclePeriod" minOccurs="0"/&gt;
 *         &lt;element name="installedProducts" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase}InstalledProduct" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paymentMeans" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans}PaymentMean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="installedOffers" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase}InstalledOffer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billAddress" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods}PostalAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parties" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party}Party" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="localBillingAccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localDealerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localPaymentFacilityEligible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="localDeferredPaymentMaxDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="localFacilityProfile" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}LocalFacilityProfile" minOccurs="0"/&gt;
 *         &lt;element name="appliedDiscount" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}AppliedDiscount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingAccount", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", propOrder = {
    "billingAccountID",
    "currency",
    "type",
    "ledgerSegment",
    "creationDate",
    "customerAccount",
    "billDate",
    "invoiceFormatSpec",
    "taxProfile",
    "paymentTerm",
    "dunningProfile",
    "updateDesiredDate",
    "billingAccountStatus",
    "billingCycleSpecification",
    "invoices",
    "lastInvoiceDate",
    "nextInvoiceDate",
    "billingCyclePeriod",
    "installedProducts",
    "paymentMeans",
    "installedOffers",
    "billAddress",
    "parties",
    "localBillingAccountCode",
    "localDealerID",
    "localPaymentFacilityEligible",
    "localDeferredPaymentMaxDate",
    "localFacilityProfile",
    "appliedDiscount"
})
public class BillingAccount
    extends InteractionSubject
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected String billingAccountID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected Currency currency;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected String type;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected String ledgerSegment;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected CustomerAccount customerAccount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected BillDate billDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected InvoiceFormatSpec invoiceFormatSpec;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected TaxProfile taxProfile;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected PaymentTerm paymentTerm;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected DunningProfile dunningProfile;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar updateDesiredDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected BillingAccountStatus billingAccountStatus;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected BillingCycleSpecification billingCycleSpecification;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", nillable = true)
    protected List<Invoice> invoices;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastInvoiceDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextInvoiceDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected BillingCyclePeriod billingCyclePeriod;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", nillable = true)
    protected List<InstalledProduct> installedProducts;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", nillable = true)
    protected List<PaymentMean> paymentMeans;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", nillable = true)
    protected List<InstalledOffer> installedOffers;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", nillable = true)
    protected List<PostalAddress> billAddress;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", nillable = true)
    protected List<Party> parties;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected String localBillingAccountCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected String localDealerID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected Boolean localPaymentFacilityEligible;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar localDeferredPaymentMaxDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected LocalFacilityProfile localFacilityProfile;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", nillable = true)
    protected List<AppliedDiscount> appliedDiscount;

    /**
     * Gets the value of the billingAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountID() {
        return billingAccountID;
    }

    /**
     * Sets the value of the billingAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountID(String value) {
        this.billingAccountID = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the ledgerSegment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLedgerSegment() {
        return ledgerSegment;
    }

    /**
     * Sets the value of the ledgerSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLedgerSegment(String value) {
        this.ledgerSegment = value;
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
     * Gets the value of the customerAccount property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccount }
     *     
     */
    public CustomerAccount getCustomerAccount() {
        return customerAccount;
    }

    /**
     * Sets the value of the customerAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccount }
     *     
     */
    public void setCustomerAccount(CustomerAccount value) {
        this.customerAccount = value;
    }

    /**
     * Gets the value of the billDate property.
     * 
     * @return
     *     possible object is
     *     {@link BillDate }
     *     
     */
    public BillDate getBillDate() {
        return billDate;
    }

    /**
     * Sets the value of the billDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillDate }
     *     
     */
    public void setBillDate(BillDate value) {
        this.billDate = value;
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
     * Gets the value of the taxProfile property.
     * 
     * @return
     *     possible object is
     *     {@link TaxProfile }
     *     
     */
    public TaxProfile getTaxProfile() {
        return taxProfile;
    }

    /**
     * Sets the value of the taxProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxProfile }
     *     
     */
    public void setTaxProfile(TaxProfile value) {
        this.taxProfile = value;
    }

    /**
     * Gets the value of the paymentTerm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTerm }
     *     
     */
    public PaymentTerm getPaymentTerm() {
        return paymentTerm;
    }

    /**
     * Sets the value of the paymentTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTerm }
     *     
     */
    public void setPaymentTerm(PaymentTerm value) {
        this.paymentTerm = value;
    }

    /**
     * Gets the value of the dunningProfile property.
     * 
     * @return
     *     possible object is
     *     {@link DunningProfile }
     *     
     */
    public DunningProfile getDunningProfile() {
        return dunningProfile;
    }

    /**
     * Sets the value of the dunningProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link DunningProfile }
     *     
     */
    public void setDunningProfile(DunningProfile value) {
        this.dunningProfile = value;
    }

    /**
     * Gets the value of the updateDesiredDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDesiredDate() {
        return updateDesiredDate;
    }

    /**
     * Sets the value of the updateDesiredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDesiredDate(XMLGregorianCalendar value) {
        this.updateDesiredDate = value;
    }

    /**
     * Gets the value of the billingAccountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BillingAccountStatus }
     *     
     */
    public BillingAccountStatus getBillingAccountStatus() {
        return billingAccountStatus;
    }

    /**
     * Sets the value of the billingAccountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingAccountStatus }
     *     
     */
    public void setBillingAccountStatus(BillingAccountStatus value) {
        this.billingAccountStatus = value;
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
     * Gets the value of the invoices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Invoice }
     * 
     * 
     */
    public List<Invoice> getInvoices() {
        if (invoices == null) {
            invoices = new ArrayList<Invoice>();
        }
        return this.invoices;
    }

    /**
     * Gets the value of the lastInvoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastInvoiceDate() {
        return lastInvoiceDate;
    }

    /**
     * Sets the value of the lastInvoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastInvoiceDate(XMLGregorianCalendar value) {
        this.lastInvoiceDate = value;
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
     * Gets the value of the billingCyclePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BillingCyclePeriod }
     *     
     */
    public BillingCyclePeriod getBillingCyclePeriod() {
        return billingCyclePeriod;
    }

    /**
     * Sets the value of the billingCyclePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingCyclePeriod }
     *     
     */
    public void setBillingCyclePeriod(BillingCyclePeriod value) {
        this.billingCyclePeriod = value;
    }

    /**
     * Gets the value of the installedProducts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installedProducts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstalledProducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstalledProduct }
     * 
     * 
     */
    public List<InstalledProduct> getInstalledProducts() {
        if (installedProducts == null) {
            installedProducts = new ArrayList<InstalledProduct>();
        }
        return this.installedProducts;
    }

    /**
     * Gets the value of the paymentMeans property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMeans property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMeans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMean }
     * 
     * 
     */
    public List<PaymentMean> getPaymentMeans() {
        if (paymentMeans == null) {
            paymentMeans = new ArrayList<PaymentMean>();
        }
        return this.paymentMeans;
    }

    /**
     * Gets the value of the installedOffers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installedOffers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstalledOffers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstalledOffer }
     * 
     * 
     */
    public List<InstalledOffer> getInstalledOffers() {
        if (installedOffers == null) {
            installedOffers = new ArrayList<InstalledOffer>();
        }
        return this.installedOffers;
    }

    /**
     * Gets the value of the billAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostalAddress }
     * 
     * 
     */
    public List<PostalAddress> getBillAddress() {
        if (billAddress == null) {
            billAddress = new ArrayList<PostalAddress>();
        }
        return this.billAddress;
    }

    /**
     * Gets the value of the parties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Party }
     * 
     * 
     */
    public List<Party> getParties() {
        if (parties == null) {
            parties = new ArrayList<Party>();
        }
        return this.parties;
    }

    /**
     * Gets the value of the localBillingAccountCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalBillingAccountCode() {
        return localBillingAccountCode;
    }

    /**
     * Sets the value of the localBillingAccountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalBillingAccountCode(String value) {
        this.localBillingAccountCode = value;
    }

    /**
     * Gets the value of the localDealerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalDealerID() {
        return localDealerID;
    }

    /**
     * Sets the value of the localDealerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalDealerID(String value) {
        this.localDealerID = value;
    }

    /**
     * Gets the value of the localPaymentFacilityEligible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalPaymentFacilityEligible() {
        return localPaymentFacilityEligible;
    }

    /**
     * Sets the value of the localPaymentFacilityEligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalPaymentFacilityEligible(Boolean value) {
        this.localPaymentFacilityEligible = value;
    }

    /**
     * Gets the value of the localDeferredPaymentMaxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocalDeferredPaymentMaxDate() {
        return localDeferredPaymentMaxDate;
    }

    /**
     * Sets the value of the localDeferredPaymentMaxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocalDeferredPaymentMaxDate(XMLGregorianCalendar value) {
        this.localDeferredPaymentMaxDate = value;
    }

    /**
     * Gets the value of the localFacilityProfile property.
     * 
     * @return
     *     possible object is
     *     {@link LocalFacilityProfile }
     *     
     */
    public LocalFacilityProfile getLocalFacilityProfile() {
        return localFacilityProfile;
    }

    /**
     * Sets the value of the localFacilityProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalFacilityProfile }
     *     
     */
    public void setLocalFacilityProfile(LocalFacilityProfile value) {
        this.localFacilityProfile = value;
    }

    /**
     * Gets the value of the appliedDiscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliedDiscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliedDiscount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppliedDiscount }
     * 
     * 
     */
    public List<AppliedDiscount> getAppliedDiscount() {
        if (appliedDiscount == null) {
            appliedDiscount = new ArrayList<AppliedDiscount>();
        }
        return this.appliedDiscount;
    }

}
