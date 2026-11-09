
package com.orangecaraibe.epco.model.offeringandproducts.commercialinstalledbase;

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
import com.orangecaraibe.epco.model.customerdomain.customer.Holder;
import com.orangecaraibe.epco.model.customerdomain.customerbilling.BillingAccount;
import com.orangecaraibe.epco.model.customerdomain.customerbilling.rating.ChargedTo;
import com.orangecaraibe.epco.model.customerdomain.customerorder.CustomerOrderItem;
import com.orangecaraibe.epco.model.offeringandproducts.commercialcatalogue.OfferSpecification;


/**
 * <p>Java class for InstalledOffer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstalledOffer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}InteractionSubject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="installedOfferID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offerSpecification" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue}OfferSpecification" minOccurs="0"/&gt;
 *         &lt;element name="installedTariffs" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase}InstalledTariff" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="installedOfferStatus" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase}InstalledOfferStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="holder" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Customer}Holder" minOccurs="0"/&gt;
 *         &lt;element name="billingAccount" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}BillingAccount" minOccurs="0"/&gt;
 *         &lt;element name="installedOfferCustomerLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="modificationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="parentInstalledOffer" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase}InstalledCompositeOffer" minOccurs="0"/&gt;
 *         &lt;element name="installedOfferLinks" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase}InstalledOfferLink" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="customerOrderItem" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerOrder}CustomerOrderItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="commitment" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase}Commitment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="charged_To" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating}ChargedTo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="installedOfferTemporaryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offerTermsAndConditionsImage" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase}OfferTermsAndConditionsImage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstalledOffer", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase", propOrder = {
    "installedOfferID",
    "offerSpecification",
    "installedTariffs",
    "installedOfferStatus",
    "version",
    "holder",
    "billingAccount",
    "installedOfferCustomerLabel",
    "creationDate",
    "modificationDate",
    "parentInstalledOffer",
    "installedOfferLinks",
    "customerOrderItem",
    "commitment",
    "chargedTo",
    "installedOfferTemporaryID",
    "offerTermsAndConditionsImage"
})
@XmlSeeAlso({
    InstalledCompositeOffer.class,
    InstalledAtomicOffer.class
})
public class InstalledOffer
    extends InteractionSubject
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected String installedOfferID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected OfferSpecification offerSpecification;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase", nillable = true)
    protected List<InstalledTariff> installedTariffs;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase", nillable = true)
    protected List<InstalledOfferStatus> installedOfferStatus;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected String version;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected Holder holder;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected BillingAccount billingAccount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected String installedOfferCustomerLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar modificationDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected InstalledCompositeOffer parentInstalledOffer;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase", nillable = true)
    protected List<InstalledOfferLink> installedOfferLinks;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase", nillable = true)
    protected List<CustomerOrderItem> customerOrderItem;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase", nillable = true)
    protected List<Commitment> commitment;
    @XmlElement(name = "charged_To", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected List<ChargedTo> chargedTo;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected String installedOfferTemporaryID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase", nillable = true)
    protected List<OfferTermsAndConditionsImage> offerTermsAndConditionsImage;

    /**
     * Gets the value of the installedOfferID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstalledOfferID() {
        return installedOfferID;
    }

    /**
     * Sets the value of the installedOfferID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstalledOfferID(String value) {
        this.installedOfferID = value;
    }

    /**
     * Gets the value of the offerSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link OfferSpecification }
     *     
     */
    public OfferSpecification getOfferSpecification() {
        return offerSpecification;
    }

    /**
     * Sets the value of the offerSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferSpecification }
     *     
     */
    public void setOfferSpecification(OfferSpecification value) {
        this.offerSpecification = value;
    }

    /**
     * Gets the value of the installedTariffs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installedTariffs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstalledTariffs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstalledTariff }
     * 
     * 
     */
    public List<InstalledTariff> getInstalledTariffs() {
        if (installedTariffs == null) {
            installedTariffs = new ArrayList<InstalledTariff>();
        }
        return this.installedTariffs;
    }

    /**
     * Gets the value of the installedOfferStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installedOfferStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstalledOfferStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstalledOfferStatus }
     * 
     * 
     */
    public List<InstalledOfferStatus> getInstalledOfferStatus() {
        if (installedOfferStatus == null) {
            installedOfferStatus = new ArrayList<InstalledOfferStatus>();
        }
        return this.installedOfferStatus;
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
     * Gets the value of the installedOfferCustomerLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstalledOfferCustomerLabel() {
        return installedOfferCustomerLabel;
    }

    /**
     * Sets the value of the installedOfferCustomerLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstalledOfferCustomerLabel(String value) {
        this.installedOfferCustomerLabel = value;
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
     * Gets the value of the parentInstalledOffer property.
     * 
     * @return
     *     possible object is
     *     {@link InstalledCompositeOffer }
     *     
     */
    public InstalledCompositeOffer getParentInstalledOffer() {
        return parentInstalledOffer;
    }

    /**
     * Sets the value of the parentInstalledOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstalledCompositeOffer }
     *     
     */
    public void setParentInstalledOffer(InstalledCompositeOffer value) {
        this.parentInstalledOffer = value;
    }

    /**
     * Gets the value of the installedOfferLinks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installedOfferLinks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstalledOfferLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstalledOfferLink }
     * 
     * 
     */
    public List<InstalledOfferLink> getInstalledOfferLinks() {
        if (installedOfferLinks == null) {
            installedOfferLinks = new ArrayList<InstalledOfferLink>();
        }
        return this.installedOfferLinks;
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
     * Gets the value of the chargedTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargedTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargedTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargedTo }
     * 
     * 
     */
    public List<ChargedTo> getChargedTo() {
        if (chargedTo == null) {
            chargedTo = new ArrayList<ChargedTo>();
        }
        return this.chargedTo;
    }

    /**
     * Gets the value of the installedOfferTemporaryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstalledOfferTemporaryID() {
        return installedOfferTemporaryID;
    }

    /**
     * Sets the value of the installedOfferTemporaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstalledOfferTemporaryID(String value) {
        this.installedOfferTemporaryID = value;
    }

    /**
     * Gets the value of the offerTermsAndConditionsImage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerTermsAndConditionsImage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferTermsAndConditionsImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferTermsAndConditionsImage }
     * 
     * 
     */
    public List<OfferTermsAndConditionsImage> getOfferTermsAndConditionsImage() {
        if (offerTermsAndConditionsImage == null) {
            offerTermsAndConditionsImage = new ArrayList<OfferTermsAndConditionsImage>();
        }
        return this.offerTermsAndConditionsImage;
    }

}
