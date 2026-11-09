
package com.orangecaraibe.enra.model.customerdomain.customerbilling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.orangecaraibe.enra.model.marketsales.marketingcampaigns.Media;


/**
 * <p>Java class for InvoiceFormatSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceFormatSpec"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="invoiceFormatSpecCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="billMedia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isCallDetailSheet" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="localHasAlreadySubscribedEInvoice" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="localEInvoiceFirstSubscriptionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="localMedia" type="{http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketingCampaigns}Media" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceFormatSpec", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", propOrder = {
    "invoiceFormatSpecCode",
    "language",
    "billMedia",
    "isCallDetailSheet",
    "localHasAlreadySubscribedEInvoice",
    "localEInvoiceFirstSubscriptionDate",
    "localMedia"
})
public class InvoiceFormatSpec {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected String invoiceFormatSpecCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", required = true)
    protected String language;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected String billMedia;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected boolean isCallDetailSheet;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected boolean localHasAlreadySubscribedEInvoice;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar localEInvoiceFirstSubscriptionDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", nillable = true)
    protected List<Media> localMedia;

    /**
     * Gets the value of the invoiceFormatSpecCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceFormatSpecCode() {
        return invoiceFormatSpecCode;
    }

    /**
     * Sets the value of the invoiceFormatSpecCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceFormatSpecCode(String value) {
        this.invoiceFormatSpecCode = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the billMedia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillMedia() {
        return billMedia;
    }

    /**
     * Sets the value of the billMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillMedia(String value) {
        this.billMedia = value;
    }

    /**
     * Gets the value of the isCallDetailSheet property.
     * 
     */
    public boolean isIsCallDetailSheet() {
        return isCallDetailSheet;
    }

    /**
     * Sets the value of the isCallDetailSheet property.
     * 
     */
    public void setIsCallDetailSheet(boolean value) {
        this.isCallDetailSheet = value;
    }

    /**
     * Gets the value of the localHasAlreadySubscribedEInvoice property.
     * 
     */
    public boolean isLocalHasAlreadySubscribedEInvoice() {
        return localHasAlreadySubscribedEInvoice;
    }

    /**
     * Sets the value of the localHasAlreadySubscribedEInvoice property.
     * 
     */
    public void setLocalHasAlreadySubscribedEInvoice(boolean value) {
        this.localHasAlreadySubscribedEInvoice = value;
    }

    /**
     * Gets the value of the localEInvoiceFirstSubscriptionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocalEInvoiceFirstSubscriptionDate() {
        return localEInvoiceFirstSubscriptionDate;
    }

    /**
     * Sets the value of the localEInvoiceFirstSubscriptionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocalEInvoiceFirstSubscriptionDate(XMLGregorianCalendar value) {
        this.localEInvoiceFirstSubscriptionDate = value;
    }

    /**
     * Gets the value of the localMedia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localMedia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalMedia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Media }
     * 
     * 
     */
    public List<Media> getLocalMedia() {
        if (localMedia == null) {
            localMedia = new ArrayList<Media>();
        }
        return this.localMedia;
    }

}
