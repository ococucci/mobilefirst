
package com.orangecaraibe.enra.model.offeringandproducts.productinstalledbase;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.orangecaraibe.enra.model.commonbusiness.interaction.InteractionSubject;
import com.orangecaraibe.enra.model.commonbusiness.location.Address;
import com.orangecaraibe.enra.model.commonbusiness.party.Party;
import com.orangecaraibe.enra.model.customerdomain.customerbilling.BillingAccount;
import com.orangecaraibe.enra.model.offeringandproducts.commercialinstalledbase.InstalledOffer;
import com.orangecaraibe.enra.model.offeringandproducts.productcatalogue.ProductSpecification;
import com.orangecaraibe.enra.model.resourcedomain.resourceinstalledbase.InstalledResource;


/**
 * <p>Java class for InstalledProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstalledProduct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}InteractionSubject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="installedProductID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="installedPublicKey" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase}InstalledPublicKey" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="installedProductStatus" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase}InstalledProductStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productSpecification" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue}ProductSpecification" minOccurs="0"/&gt;
 *         &lt;element name="installedFunctionValues" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase}InstalledFunctionValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parties" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party}Party" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="installedProductCustomerLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="modificationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="installedProductLink" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase}InstalledProductLink" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productOrderItem" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="deliveredAt" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Location}Address" minOccurs="0"/&gt;
 *         &lt;element name="installedProductTemporaryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="installedOffer" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase}InstalledOffer" minOccurs="0"/&gt;
 *         &lt;element name="billingAccount" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}BillingAccount" minOccurs="0"/&gt;
 *         &lt;element name="installedResources" type="{http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceInstalledBase}InstalledResource" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="installedProductShortLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstalledProduct", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase", propOrder = {
    "installedProductID",
    "installedPublicKey",
    "version",
    "installedProductStatus",
    "productSpecification",
    "installedFunctionValues",
    "parties",
    "installedProductCustomerLabel",
    "creationDate",
    "modificationDate",
    "installedProductLink",
    "productOrderItem",
    "deliveredAt",
    "installedProductTemporaryID",
    "installedOffer",
    "billingAccount",
    "installedResources",
    "installedProductShortLabel"
})
@XmlSeeAlso({
    InstalledNetworkProduct.class,
    InstalledFxPricePackage.class,
    InstalledLoyaltyProduct.class
})
public class InstalledProduct
    extends InteractionSubject
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase")
    protected String installedProductID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase", nillable = true)
    protected List<InstalledPublicKey> installedPublicKey;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase")
    protected String version;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase", nillable = true)
    protected List<InstalledProductStatus> installedProductStatus;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase")
    protected ProductSpecification productSpecification;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase", nillable = true)
    protected List<InstalledFunctionValue> installedFunctionValues;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase", nillable = true)
    protected List<Party> parties;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase")
    protected String installedProductCustomerLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar modificationDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase", nillable = true)
    protected List<InstalledProductLink> installedProductLink;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase", nillable = true)
    protected List<Object> productOrderItem;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase")
    protected Address deliveredAt;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase")
    protected String installedProductTemporaryID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase")
    protected InstalledOffer installedOffer;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase")
    protected BillingAccount billingAccount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase", nillable = true)
    protected List<InstalledResource> installedResources;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase")
    protected String installedProductShortLabel;

    /**
     * Gets the value of the installedProductID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstalledProductID() {
        return installedProductID;
    }

    /**
     * Sets the value of the installedProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstalledProductID(String value) {
        this.installedProductID = value;
    }

    /**
     * Gets the value of the installedPublicKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installedPublicKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstalledPublicKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstalledPublicKey }
     * 
     * 
     */
    public List<InstalledPublicKey> getInstalledPublicKey() {
        if (installedPublicKey == null) {
            installedPublicKey = new ArrayList<InstalledPublicKey>();
        }
        return this.installedPublicKey;
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
     * Gets the value of the installedProductStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installedProductStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstalledProductStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstalledProductStatus }
     * 
     * 
     */
    public List<InstalledProductStatus> getInstalledProductStatus() {
        if (installedProductStatus == null) {
            installedProductStatus = new ArrayList<InstalledProductStatus>();
        }
        return this.installedProductStatus;
    }

    /**
     * Gets the value of the productSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductSpecification }
     *     
     */
    public ProductSpecification getProductSpecification() {
        return productSpecification;
    }

    /**
     * Sets the value of the productSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSpecification }
     *     
     */
    public void setProductSpecification(ProductSpecification value) {
        this.productSpecification = value;
    }

    /**
     * Gets the value of the installedFunctionValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installedFunctionValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstalledFunctionValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstalledFunctionValue }
     * 
     * 
     */
    public List<InstalledFunctionValue> getInstalledFunctionValues() {
        if (installedFunctionValues == null) {
            installedFunctionValues = new ArrayList<InstalledFunctionValue>();
        }
        return this.installedFunctionValues;
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
     * Gets the value of the installedProductCustomerLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstalledProductCustomerLabel() {
        return installedProductCustomerLabel;
    }

    /**
     * Sets the value of the installedProductCustomerLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstalledProductCustomerLabel(String value) {
        this.installedProductCustomerLabel = value;
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
     * Gets the value of the installedProductLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installedProductLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstalledProductLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstalledProductLink }
     * 
     * 
     */
    public List<InstalledProductLink> getInstalledProductLink() {
        if (installedProductLink == null) {
            installedProductLink = new ArrayList<InstalledProductLink>();
        }
        return this.installedProductLink;
    }

    /**
     * Gets the value of the productOrderItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productOrderItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getProductOrderItem() {
        if (productOrderItem == null) {
            productOrderItem = new ArrayList<Object>();
        }
        return this.productOrderItem;
    }

    /**
     * Gets the value of the deliveredAt property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getDeliveredAt() {
        return deliveredAt;
    }

    /**
     * Sets the value of the deliveredAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setDeliveredAt(Address value) {
        this.deliveredAt = value;
    }

    /**
     * Gets the value of the installedProductTemporaryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstalledProductTemporaryID() {
        return installedProductTemporaryID;
    }

    /**
     * Sets the value of the installedProductTemporaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstalledProductTemporaryID(String value) {
        this.installedProductTemporaryID = value;
    }

    /**
     * Gets the value of the installedOffer property.
     * 
     * @return
     *     possible object is
     *     {@link InstalledOffer }
     *     
     */
    public InstalledOffer getInstalledOffer() {
        return installedOffer;
    }

    /**
     * Sets the value of the installedOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstalledOffer }
     *     
     */
    public void setInstalledOffer(InstalledOffer value) {
        this.installedOffer = value;
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
     * Gets the value of the installedResources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installedResources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstalledResources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstalledResource }
     * 
     * 
     */
    public List<InstalledResource> getInstalledResources() {
        if (installedResources == null) {
            installedResources = new ArrayList<InstalledResource>();
        }
        return this.installedResources;
    }

    /**
     * Gets the value of the installedProductShortLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstalledProductShortLabel() {
        return installedProductShortLabel;
    }

    /**
     * Sets the value of the installedProductShortLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstalledProductShortLabel(String value) {
        this.installedProductShortLabel = value;
    }

}
