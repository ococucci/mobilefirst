
package com.orangecaraibe.enra.model.customerdomain.customerbilling.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.orangecaraibe.enra.model.commonbusiness.interaction.InteractionSubject;
import com.orangecaraibe.enra.model.commonbusiness.location.Site;
import com.orangecaraibe.enra.model.commonbusiness.party.role.Distributor;
import com.orangecaraibe.enra.model.customerdomain.customerorder.CustomerOrder;
import com.orangecaraibe.enra.model.customerdomain.invoicing.Invoice;


/**
 * <p>Java class for Refund complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Refund"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}InteractionSubject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="refundID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="customerOrder" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerOrder}CustomerOrder"/&gt;
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="statusLabel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="localDistributor" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role}Distributor" minOccurs="0"/&gt;
 *         &lt;element name="refundDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localSite" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Location}Site" minOccurs="0"/&gt;
 *         &lt;element name="localRefundNature" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment}LocalRefundNature" minOccurs="0"/&gt;
 *         &lt;element name="localRefundFamily" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment}LocalRefundFamily" minOccurs="0"/&gt;
 *         &lt;element name="invoice" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing}Invoice" minOccurs="0"/&gt;
 *         &lt;element name="localRefundsSheetID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localRefundType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "Refund", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment", propOrder = {
    "amount",
    "refundID",
    "date",
    "customerOrder",
    "statusCode",
    "statusLabel",
    "localDistributor",
    "refundDescription",
    "localSite",
    "localRefundNature",
    "localRefundFamily",
    "invoice",
    "localRefundsSheetID",
    "localRefundType",
    "localWhaInformations"
})
public class Refund
    extends InteractionSubject
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected float amount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment", required = true)
    protected String refundID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment", required = true)
    protected CustomerOrder customerOrder;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment", required = true)
    protected String statusCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment", required = true)
    protected String statusLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected Distributor localDistributor;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected String refundDescription;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected Site localSite;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected LocalRefundNature localRefundNature;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected LocalRefundFamily localRefundFamily;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected Invoice invoice;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected String localRefundsSheetID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected String localRefundType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected LocalWhaInformations localWhaInformations;

    /**
     * Gets the value of the amount property.
     * 
     */
    public float getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(float value) {
        this.amount = value;
    }

    /**
     * Gets the value of the refundID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundID() {
        return refundID;
    }

    /**
     * Sets the value of the refundID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundID(String value) {
        this.refundID = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the customerOrder property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrder }
     *     
     */
    public CustomerOrder getCustomerOrder() {
        return customerOrder;
    }

    /**
     * Sets the value of the customerOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrder }
     *     
     */
    public void setCustomerOrder(CustomerOrder value) {
        this.customerOrder = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the statusLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusLabel() {
        return statusLabel;
    }

    /**
     * Sets the value of the statusLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusLabel(String value) {
        this.statusLabel = value;
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
     * Gets the value of the refundDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundDescription() {
        return refundDescription;
    }

    /**
     * Sets the value of the refundDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundDescription(String value) {
        this.refundDescription = value;
    }

    /**
     * Gets the value of the localSite property.
     * 
     * @return
     *     possible object is
     *     {@link Site }
     *     
     */
    public Site getLocalSite() {
        return localSite;
    }

    /**
     * Sets the value of the localSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Site }
     *     
     */
    public void setLocalSite(Site value) {
        this.localSite = value;
    }

    /**
     * Gets the value of the localRefundNature property.
     * 
     * @return
     *     possible object is
     *     {@link LocalRefundNature }
     *     
     */
    public LocalRefundNature getLocalRefundNature() {
        return localRefundNature;
    }

    /**
     * Sets the value of the localRefundNature property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalRefundNature }
     *     
     */
    public void setLocalRefundNature(LocalRefundNature value) {
        this.localRefundNature = value;
    }

    /**
     * Gets the value of the localRefundFamily property.
     * 
     * @return
     *     possible object is
     *     {@link LocalRefundFamily }
     *     
     */
    public LocalRefundFamily getLocalRefundFamily() {
        return localRefundFamily;
    }

    /**
     * Sets the value of the localRefundFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalRefundFamily }
     *     
     */
    public void setLocalRefundFamily(LocalRefundFamily value) {
        this.localRefundFamily = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link Invoice }
     *     
     */
    public Invoice getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Invoice }
     *     
     */
    public void setInvoice(Invoice value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the localRefundsSheetID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalRefundsSheetID() {
        return localRefundsSheetID;
    }

    /**
     * Sets the value of the localRefundsSheetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalRefundsSheetID(String value) {
        this.localRefundsSheetID = value;
    }

    /**
     * Gets the value of the localRefundType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalRefundType() {
        return localRefundType;
    }

    /**
     * Sets the value of the localRefundType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalRefundType(String value) {
        this.localRefundType = value;
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
