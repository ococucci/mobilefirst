
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
 * <p>Java class for CustomerOrderItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrderItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerOrderItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parentCustomerOrderItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="effectDateWished" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="commitment" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}Commitment" minOccurs="0"/&gt;
 *         &lt;element name="customerOrderItemLink" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}CustomerOrderItemLink" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="installedOfferLink" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}InstalledOfferLink" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="installedOffer" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}InstalledOffer" minOccurs="0"/&gt;
 *         &lt;element name="holder" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}Holder" minOccurs="0"/&gt;
 *         &lt;element name="offerSpecification" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}OfferSpecification" minOccurs="0"/&gt;
 *         &lt;element name="paidThrough" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}PaidThrough" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="chargedTo" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}ChargedTo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productOrderItem" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}ProductOrderItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="appliedChargeSplittingCriteria" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}AppliedChargeSplittingCriteria" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="effectDatePlanned" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="localIncomingRIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localRIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localPortageDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="localPortageOperateurSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="party" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}Party" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrderItem", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", propOrder = {
    "customerOrderItemID",
    "parentCustomerOrderItemID",
    "effectDateWished",
    "quantity",
    "commitment",
    "customerOrderItemLink",
    "installedOfferLink",
    "installedOffer",
    "holder",
    "offerSpecification",
    "paidThrough",
    "chargedTo",
    "productOrderItem",
    "appliedChargeSplittingCriteria",
    "effectDatePlanned",
    "localIncomingRIO",
    "localRIO",
    "localPortageDate",
    "localPortageOperateurSource",
    "party"
})
public class CustomerOrderItem {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String customerOrderItemID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String parentCustomerOrderItemID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectDateWished;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected Integer quantity;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected Commitment commitment;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", nillable = true)
    protected List<CustomerOrderItemLink> customerOrderItemLink;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", nillable = true)
    protected List<InstalledOfferLink> installedOfferLink;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected InstalledOffer installedOffer;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected Holder holder;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected OfferSpecification offerSpecification;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", nillable = true)
    protected List<PaidThrough> paidThrough;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", nillable = true)
    protected List<ChargedTo> chargedTo;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", nillable = true)
    protected List<ProductOrderItem> productOrderItem;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", nillable = true)
    protected List<AppliedChargeSplittingCriteria> appliedChargeSplittingCriteria;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectDatePlanned;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String localIncomingRIO;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String localRIO;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar localPortageDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String localPortageOperateurSource;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", nillable = true)
    protected List<Party> party;

    /**
     * Gets the value of the customerOrderItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerOrderItemID() {
        return customerOrderItemID;
    }

    /**
     * Sets the value of the customerOrderItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerOrderItemID(String value) {
        this.customerOrderItemID = value;
    }

    /**
     * Gets the value of the parentCustomerOrderItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentCustomerOrderItemID() {
        return parentCustomerOrderItemID;
    }

    /**
     * Sets the value of the parentCustomerOrderItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentCustomerOrderItemID(String value) {
        this.parentCustomerOrderItemID = value;
    }

    /**
     * Gets the value of the effectDateWished property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectDateWished() {
        return effectDateWished;
    }

    /**
     * Sets the value of the effectDateWished property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectDateWished(XMLGregorianCalendar value) {
        this.effectDateWished = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the commitment property.
     * 
     * @return
     *     possible object is
     *     {@link Commitment }
     *     
     */
    public Commitment getCommitment() {
        return commitment;
    }

    /**
     * Sets the value of the commitment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Commitment }
     *     
     */
    public void setCommitment(Commitment value) {
        this.commitment = value;
    }

    /**
     * Gets the value of the customerOrderItemLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerOrderItemLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerOrderItemLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerOrderItemLink }
     * 
     * 
     */
    public List<CustomerOrderItemLink> getCustomerOrderItemLink() {
        if (customerOrderItemLink == null) {
            customerOrderItemLink = new ArrayList<CustomerOrderItemLink>();
        }
        return this.customerOrderItemLink;
    }

    /**
     * Gets the value of the installedOfferLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installedOfferLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstalledOfferLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstalledOfferLink }
     * 
     * 
     */
    public List<InstalledOfferLink> getInstalledOfferLink() {
        if (installedOfferLink == null) {
            installedOfferLink = new ArrayList<InstalledOfferLink>();
        }
        return this.installedOfferLink;
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
     * Gets the value of the paidThrough property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paidThrough property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaidThrough().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaidThrough }
     * 
     * 
     */
    public List<PaidThrough> getPaidThrough() {
        if (paidThrough == null) {
            paidThrough = new ArrayList<PaidThrough>();
        }
        return this.paidThrough;
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
     * {@link ProductOrderItem }
     * 
     * 
     */
    public List<ProductOrderItem> getProductOrderItem() {
        if (productOrderItem == null) {
            productOrderItem = new ArrayList<ProductOrderItem>();
        }
        return this.productOrderItem;
    }

    /**
     * Gets the value of the appliedChargeSplittingCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliedChargeSplittingCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliedChargeSplittingCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppliedChargeSplittingCriteria }
     * 
     * 
     */
    public List<AppliedChargeSplittingCriteria> getAppliedChargeSplittingCriteria() {
        if (appliedChargeSplittingCriteria == null) {
            appliedChargeSplittingCriteria = new ArrayList<AppliedChargeSplittingCriteria>();
        }
        return this.appliedChargeSplittingCriteria;
    }

    /**
     * Gets the value of the effectDatePlanned property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectDatePlanned() {
        return effectDatePlanned;
    }

    /**
     * Sets the value of the effectDatePlanned property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectDatePlanned(XMLGregorianCalendar value) {
        this.effectDatePlanned = value;
    }

    /**
     * Gets the value of the localIncomingRIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalIncomingRIO() {
        return localIncomingRIO;
    }

    /**
     * Sets the value of the localIncomingRIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalIncomingRIO(String value) {
        this.localIncomingRIO = value;
    }

    /**
     * Gets the value of the localRIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalRIO() {
        return localRIO;
    }

    /**
     * Sets the value of the localRIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalRIO(String value) {
        this.localRIO = value;
    }

    /**
     * Gets the value of the localPortageDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocalPortageDate() {
        return localPortageDate;
    }

    /**
     * Sets the value of the localPortageDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocalPortageDate(XMLGregorianCalendar value) {
        this.localPortageDate = value;
    }

    /**
     * Gets the value of the localPortageOperateurSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalPortageOperateurSource() {
        return localPortageOperateurSource;
    }

    /**
     * Sets the value of the localPortageOperateurSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalPortageOperateurSource(String value) {
        this.localPortageOperateurSource = value;
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

}
