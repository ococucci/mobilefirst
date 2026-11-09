
package com.orangecaraibe.epco.model.customerdomain.managecustomerorder;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CustomerOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerOrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="catalogueReferentialID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="externalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="depositDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="configurationChecked" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="configurationCheckedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="customerOrderStatus" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}CustomerOrderStatus" minOccurs="0"/&gt;
 *         &lt;element name="quotation" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}Quotation" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}Currency" minOccurs="0"/&gt;
 *         &lt;element name="interaction" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}Interaction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="creator" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}User" minOccurs="0"/&gt;
 *         &lt;element name="distributor" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}Distributor" minOccurs="0"/&gt;
 *         &lt;element name="otherPartyRoleConcerned" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}OtherPartyRoleConcerned" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="couldUseTemporaryContactMethod" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}ContactMethod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="customerOrderItem" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}CustomerOrderItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="deliveryDriver" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}DeliveryDriver" minOccurs="0"/&gt;
 *         &lt;element name="modificationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="localBillingAccountID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localInstalledPublicKey" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}InstalledPublicKey" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="localPaymentTemporaryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localPaymentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localBookingLoyaltyTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localLoyaltyTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localOrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localSubOrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="localLoyaltyAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="localCancellable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="localBlockingFor" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="party" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}Party" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="localToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localCustomerOrderStatusHistory" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}CustomerOrderStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paymentMean" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}PaymentMean" minOccurs="0"/&gt;
 *         &lt;element name="localBillingAccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loyaltyBalanceBefore" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="localBillDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="localContractDocument" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}LocalContractDocument" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="localParentBillingAccountID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recurringPaymentMean" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}PaymentMean" minOccurs="0"/&gt;
 *         &lt;element name="localValidationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localPayerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localOldBillingAccountID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localNotificationSubscriptionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localAGCContextID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localLoyaltyUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localLoyaltyBonusBefore" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="localLoyaltyBonusAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="localParentInteractionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localParentInteractionDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localCustomerProblemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localCustomerProblemDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interactionSubjectLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interactionSubjectDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocalCustomerOrderExternalIdentification" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}LocalCustomerOrderExternalIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrder", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", propOrder = {
    "customerOrderID",
    "catalogueReferentialID",
    "version",
    "externalID",
    "description",
    "creationDate",
    "depositDate",
    "configurationChecked",
    "configurationCheckedDate",
    "customerOrderStatus",
    "quotation",
    "currency",
    "interaction",
    "creator",
    "distributor",
    "otherPartyRoleConcerned",
    "couldUseTemporaryContactMethod",
    "customerOrderItem",
    "deliveryDriver",
    "modificationDate",
    "localBillingAccountID",
    "localInstalledPublicKey",
    "localPaymentTemporaryID",
    "localPaymentID",
    "localBookingLoyaltyTransactionID",
    "localLoyaltyTransactionID",
    "localOrderType",
    "localSubOrderType",
    "localAmount",
    "localLoyaltyAmount",
    "localCancellable",
    "localBlockingFor",
    "party",
    "localToken",
    "localCustomerOrderStatusHistory",
    "paymentMean",
    "localBillingAccountCode",
    "loyaltyBalanceBefore",
    "localBillDay",
    "localContractDocument",
    "localParentBillingAccountID",
    "recurringPaymentMean",
    "localValidationID",
    "localPayerID",
    "localOldBillingAccountID",
    "localNotificationSubscriptionID",
    "localAGCContextID",
    "localLoyaltyUnitCode",
    "localLoyaltyBonusBefore",
    "localLoyaltyBonusAmount",
    "localParentInteractionID",
    "localParentInteractionDetails",
    "localCustomerProblemID",
    "localCustomerProblemDetails",
    "interactionSubjectLabel",
    "interactionSubjectDescription",
    "localCustomerOrderExternalIdentification"
})
public class CustomerOrder {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String customerOrderID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String catalogueReferentialID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String version;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String externalID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String description;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar depositDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected boolean configurationChecked;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar configurationCheckedDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected CustomerOrderStatus customerOrderStatus;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected Quotation quotation;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected Currency currency;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", nillable = true)
    protected List<Interaction> interaction;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected User creator;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected Distributor distributor;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", nillable = true)
    protected List<OtherPartyRoleConcerned> otherPartyRoleConcerned;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", nillable = true)
    protected List<ContactMethod> couldUseTemporaryContactMethod;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", nillable = true)
    protected List<CustomerOrderItem> customerOrderItem;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected DeliveryDriver deliveryDriver;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar modificationDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String localBillingAccountID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", nillable = true)
    protected List<InstalledPublicKey> localInstalledPublicKey;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String localPaymentTemporaryID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String localPaymentID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String localBookingLoyaltyTransactionID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String localLoyaltyTransactionID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String localOrderType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String localSubOrderType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected Double localAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected Double localLoyaltyAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected Boolean localCancellable;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", nillable = true)
    protected List<String> localBlockingFor;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", nillable = true)
    protected List<Party> party;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String localToken;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", nillable = true)
    protected List<CustomerOrderStatus> localCustomerOrderStatusHistory;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected PaymentMean paymentMean;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String localBillingAccountCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected Double loyaltyBalanceBefore;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected Integer localBillDay;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", nillable = true)
    protected List<LocalContractDocument> localContractDocument;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String localParentBillingAccountID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected PaymentMean recurringPaymentMean;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String localValidationID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String localPayerID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String localOldBillingAccountID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String localNotificationSubscriptionID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String localAGCContextID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String localLoyaltyUnitCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected Double localLoyaltyBonusBefore;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected Double localLoyaltyBonusAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String localParentInteractionID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String localParentInteractionDetails;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String localCustomerProblemID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String localCustomerProblemDetails;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String interactionSubjectLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String interactionSubjectDescription;
    @XmlElement(name = "LocalCustomerOrderExternalIdentification", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected List<LocalCustomerOrderExternalIdentification> localCustomerOrderExternalIdentification;

    /**
     * Gets the value of the customerOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerOrderID() {
        return customerOrderID;
    }

    /**
     * Sets the value of the customerOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerOrderID(String value) {
        this.customerOrderID = value;
    }

    /**
     * Gets the value of the catalogueReferentialID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogueReferentialID() {
        return catalogueReferentialID;
    }

    /**
     * Sets the value of the catalogueReferentialID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogueReferentialID(String value) {
        this.catalogueReferentialID = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the externalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalID() {
        return externalID;
    }

    /**
     * Sets the value of the externalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalID(String value) {
        this.externalID = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the depositDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepositDate() {
        return depositDate;
    }

    /**
     * Sets the value of the depositDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepositDate(XMLGregorianCalendar value) {
        this.depositDate = value;
    }

    /**
     * Gets the value of the configurationChecked property.
     * 
     */
    public boolean isConfigurationChecked() {
        return configurationChecked;
    }

    /**
     * Sets the value of the configurationChecked property.
     * 
     */
    public void setConfigurationChecked(boolean value) {
        this.configurationChecked = value;
    }

    /**
     * Gets the value of the configurationCheckedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConfigurationCheckedDate() {
        return configurationCheckedDate;
    }

    /**
     * Sets the value of the configurationCheckedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConfigurationCheckedDate(XMLGregorianCalendar value) {
        this.configurationCheckedDate = value;
    }

    /**
     * Gets the value of the customerOrderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderStatus }
     *     
     */
    public CustomerOrderStatus getCustomerOrderStatus() {
        return customerOrderStatus;
    }

    /**
     * Sets the value of the customerOrderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderStatus }
     *     
     */
    public void setCustomerOrderStatus(CustomerOrderStatus value) {
        this.customerOrderStatus = value;
    }

    /**
     * Gets the value of the quotation property.
     * 
     * @return
     *     possible object is
     *     {@link Quotation }
     *     
     */
    public Quotation getQuotation() {
        return quotation;
    }

    /**
     * Sets the value of the quotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quotation }
     *     
     */
    public void setQuotation(Quotation value) {
        this.quotation = value;
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
     * Gets the value of the interaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInteraction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Interaction }
     * 
     * 
     */
    public List<Interaction> getInteraction() {
        if (interaction == null) {
            interaction = new ArrayList<Interaction>();
        }
        return this.interaction;
    }

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setCreator(User value) {
        this.creator = value;
    }

    /**
     * Gets the value of the distributor property.
     * 
     * @return
     *     possible object is
     *     {@link Distributor }
     *     
     */
    public Distributor getDistributor() {
        return distributor;
    }

    /**
     * Sets the value of the distributor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distributor }
     *     
     */
    public void setDistributor(Distributor value) {
        this.distributor = value;
    }

    /**
     * Gets the value of the otherPartyRoleConcerned property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherPartyRoleConcerned property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherPartyRoleConcerned().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherPartyRoleConcerned }
     * 
     * 
     */
    public List<OtherPartyRoleConcerned> getOtherPartyRoleConcerned() {
        if (otherPartyRoleConcerned == null) {
            otherPartyRoleConcerned = new ArrayList<OtherPartyRoleConcerned>();
        }
        return this.otherPartyRoleConcerned;
    }

    /**
     * Gets the value of the couldUseTemporaryContactMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the couldUseTemporaryContactMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCouldUseTemporaryContactMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactMethod }
     * 
     * 
     */
    public List<ContactMethod> getCouldUseTemporaryContactMethod() {
        if (couldUseTemporaryContactMethod == null) {
            couldUseTemporaryContactMethod = new ArrayList<ContactMethod>();
        }
        return this.couldUseTemporaryContactMethod;
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
     * Gets the value of the deliveryDriver property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryDriver }
     *     
     */
    public DeliveryDriver getDeliveryDriver() {
        return deliveryDriver;
    }

    /**
     * Sets the value of the deliveryDriver property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryDriver }
     *     
     */
    public void setDeliveryDriver(DeliveryDriver value) {
        this.deliveryDriver = value;
    }

    /**
     * Gets the value of the modificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModificationDate() {
        return modificationDate;
    }

    /**
     * Sets the value of the modificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModificationDate(XMLGregorianCalendar value) {
        this.modificationDate = value;
    }

    /**
     * Gets the value of the localBillingAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalBillingAccountID() {
        return localBillingAccountID;
    }

    /**
     * Sets the value of the localBillingAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalBillingAccountID(String value) {
        this.localBillingAccountID = value;
    }

    /**
     * Gets the value of the localInstalledPublicKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localInstalledPublicKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalInstalledPublicKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstalledPublicKey }
     * 
     * 
     */
    public List<InstalledPublicKey> getLocalInstalledPublicKey() {
        if (localInstalledPublicKey == null) {
            localInstalledPublicKey = new ArrayList<InstalledPublicKey>();
        }
        return this.localInstalledPublicKey;
    }

    /**
     * Gets the value of the localPaymentTemporaryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalPaymentTemporaryID() {
        return localPaymentTemporaryID;
    }

    /**
     * Sets the value of the localPaymentTemporaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalPaymentTemporaryID(String value) {
        this.localPaymentTemporaryID = value;
    }

    /**
     * Gets the value of the localPaymentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalPaymentID() {
        return localPaymentID;
    }

    /**
     * Sets the value of the localPaymentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalPaymentID(String value) {
        this.localPaymentID = value;
    }

    /**
     * Gets the value of the localBookingLoyaltyTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalBookingLoyaltyTransactionID() {
        return localBookingLoyaltyTransactionID;
    }

    /**
     * Sets the value of the localBookingLoyaltyTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalBookingLoyaltyTransactionID(String value) {
        this.localBookingLoyaltyTransactionID = value;
    }

    /**
     * Gets the value of the localLoyaltyTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalLoyaltyTransactionID() {
        return localLoyaltyTransactionID;
    }

    /**
     * Sets the value of the localLoyaltyTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalLoyaltyTransactionID(String value) {
        this.localLoyaltyTransactionID = value;
    }

    /**
     * Gets the value of the localOrderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalOrderType() {
        return localOrderType;
    }

    /**
     * Sets the value of the localOrderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalOrderType(String value) {
        this.localOrderType = value;
    }

    /**
     * Gets the value of the localSubOrderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalSubOrderType() {
        return localSubOrderType;
    }

    /**
     * Sets the value of the localSubOrderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalSubOrderType(String value) {
        this.localSubOrderType = value;
    }

    /**
     * Gets the value of the localAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLocalAmount() {
        return localAmount;
    }

    /**
     * Sets the value of the localAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLocalAmount(Double value) {
        this.localAmount = value;
    }

    /**
     * Gets the value of the localLoyaltyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLocalLoyaltyAmount() {
        return localLoyaltyAmount;
    }

    /**
     * Sets the value of the localLoyaltyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLocalLoyaltyAmount(Double value) {
        this.localLoyaltyAmount = value;
    }

    /**
     * Gets the value of the localCancellable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalCancellable() {
        return localCancellable;
    }

    /**
     * Sets the value of the localCancellable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalCancellable(Boolean value) {
        this.localCancellable = value;
    }

    /**
     * Gets the value of the localBlockingFor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localBlockingFor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalBlockingFor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLocalBlockingFor() {
        if (localBlockingFor == null) {
            localBlockingFor = new ArrayList<String>();
        }
        return this.localBlockingFor;
    }

    /**
     * Gets the value of the party property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the party property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Party }
     * 
     * 
     */
    public List<Party> getParty() {
        if (party == null) {
            party = new ArrayList<Party>();
        }
        return this.party;
    }

    /**
     * Gets the value of the localToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalToken() {
        return localToken;
    }

    /**
     * Sets the value of the localToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalToken(String value) {
        this.localToken = value;
    }

    /**
     * Gets the value of the localCustomerOrderStatusHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localCustomerOrderStatusHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalCustomerOrderStatusHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerOrderStatus }
     * 
     * 
     */
    public List<CustomerOrderStatus> getLocalCustomerOrderStatusHistory() {
        if (localCustomerOrderStatusHistory == null) {
            localCustomerOrderStatusHistory = new ArrayList<CustomerOrderStatus>();
        }
        return this.localCustomerOrderStatusHistory;
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
     * Gets the value of the loyaltyBalanceBefore property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLoyaltyBalanceBefore() {
        return loyaltyBalanceBefore;
    }

    /**
     * Sets the value of the loyaltyBalanceBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLoyaltyBalanceBefore(Double value) {
        this.loyaltyBalanceBefore = value;
    }

    /**
     * Gets the value of the localBillDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocalBillDay() {
        return localBillDay;
    }

    /**
     * Sets the value of the localBillDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocalBillDay(Integer value) {
        this.localBillDay = value;
    }

    /**
     * Gets the value of the localContractDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localContractDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalContractDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalContractDocument }
     * 
     * 
     */
    public List<LocalContractDocument> getLocalContractDocument() {
        if (localContractDocument == null) {
            localContractDocument = new ArrayList<LocalContractDocument>();
        }
        return this.localContractDocument;
    }

    /**
     * Gets the value of the localParentBillingAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalParentBillingAccountID() {
        return localParentBillingAccountID;
    }

    /**
     * Sets the value of the localParentBillingAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalParentBillingAccountID(String value) {
        this.localParentBillingAccountID = value;
    }

    /**
     * Gets the value of the recurringPaymentMean property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMean }
     *     
     */
    public PaymentMean getRecurringPaymentMean() {
        return recurringPaymentMean;
    }

    /**
     * Sets the value of the recurringPaymentMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMean }
     *     
     */
    public void setRecurringPaymentMean(PaymentMean value) {
        this.recurringPaymentMean = value;
    }

    /**
     * Gets the value of the localValidationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalValidationID() {
        return localValidationID;
    }

    /**
     * Sets the value of the localValidationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalValidationID(String value) {
        this.localValidationID = value;
    }

    /**
     * Gets the value of the localPayerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalPayerID() {
        return localPayerID;
    }

    /**
     * Sets the value of the localPayerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalPayerID(String value) {
        this.localPayerID = value;
    }

    /**
     * Gets the value of the localOldBillingAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalOldBillingAccountID() {
        return localOldBillingAccountID;
    }

    /**
     * Sets the value of the localOldBillingAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalOldBillingAccountID(String value) {
        this.localOldBillingAccountID = value;
    }

    /**
     * Gets the value of the localNotificationSubscriptionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalNotificationSubscriptionID() {
        return localNotificationSubscriptionID;
    }

    /**
     * Sets the value of the localNotificationSubscriptionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalNotificationSubscriptionID(String value) {
        this.localNotificationSubscriptionID = value;
    }

    /**
     * Gets the value of the localAGCContextID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalAGCContextID() {
        return localAGCContextID;
    }

    /**
     * Sets the value of the localAGCContextID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalAGCContextID(String value) {
        this.localAGCContextID = value;
    }

    /**
     * Gets the value of the localLoyaltyUnitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalLoyaltyUnitCode() {
        return localLoyaltyUnitCode;
    }

    /**
     * Sets the value of the localLoyaltyUnitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalLoyaltyUnitCode(String value) {
        this.localLoyaltyUnitCode = value;
    }

    /**
     * Gets the value of the localLoyaltyBonusBefore property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLocalLoyaltyBonusBefore() {
        return localLoyaltyBonusBefore;
    }

    /**
     * Sets the value of the localLoyaltyBonusBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLocalLoyaltyBonusBefore(Double value) {
        this.localLoyaltyBonusBefore = value;
    }

    /**
     * Gets the value of the localLoyaltyBonusAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLocalLoyaltyBonusAmount() {
        return localLoyaltyBonusAmount;
    }

    /**
     * Sets the value of the localLoyaltyBonusAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLocalLoyaltyBonusAmount(Double value) {
        this.localLoyaltyBonusAmount = value;
    }

    /**
     * Gets the value of the localParentInteractionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalParentInteractionID() {
        return localParentInteractionID;
    }

    /**
     * Sets the value of the localParentInteractionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalParentInteractionID(String value) {
        this.localParentInteractionID = value;
    }

    /**
     * Gets the value of the localParentInteractionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalParentInteractionDetails() {
        return localParentInteractionDetails;
    }

    /**
     * Sets the value of the localParentInteractionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalParentInteractionDetails(String value) {
        this.localParentInteractionDetails = value;
    }

    /**
     * Gets the value of the localCustomerProblemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalCustomerProblemID() {
        return localCustomerProblemID;
    }

    /**
     * Sets the value of the localCustomerProblemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalCustomerProblemID(String value) {
        this.localCustomerProblemID = value;
    }

    /**
     * Gets the value of the localCustomerProblemDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalCustomerProblemDetails() {
        return localCustomerProblemDetails;
    }

    /**
     * Sets the value of the localCustomerProblemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalCustomerProblemDetails(String value) {
        this.localCustomerProblemDetails = value;
    }

    /**
     * Gets the value of the interactionSubjectLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteractionSubjectLabel() {
        return interactionSubjectLabel;
    }

    /**
     * Sets the value of the interactionSubjectLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteractionSubjectLabel(String value) {
        this.interactionSubjectLabel = value;
    }

    /**
     * Gets the value of the interactionSubjectDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteractionSubjectDescription() {
        return interactionSubjectDescription;
    }

    /**
     * Sets the value of the interactionSubjectDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteractionSubjectDescription(String value) {
        this.interactionSubjectDescription = value;
    }

    /**
     * Gets the value of the localCustomerOrderExternalIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localCustomerOrderExternalIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalCustomerOrderExternalIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalCustomerOrderExternalIdentification }
     * 
     * 
     */
    public List<LocalCustomerOrderExternalIdentification> getLocalCustomerOrderExternalIdentification() {
        if (localCustomerOrderExternalIdentification == null) {
            localCustomerOrderExternalIdentification = new ArrayList<LocalCustomerOrderExternalIdentification>();
        }
        return this.localCustomerOrderExternalIdentification;
    }

}
