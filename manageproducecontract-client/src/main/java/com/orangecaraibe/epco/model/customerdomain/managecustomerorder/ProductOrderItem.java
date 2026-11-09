
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
 * <p>Java class for ProductOrderItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductOrderItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productOrderItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="effectDateWished" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="productOrderItemStatus" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}ProductOrderItemStatus" minOccurs="0"/&gt;
 *         &lt;element name="productOrderItemLink" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}ProductOrderItemLink" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="installedProduct" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}InstalledProduct" minOccurs="0"/&gt;
 *         &lt;element name="installedProductLink" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}InstalledProductLink" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="user" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}User" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="functionalOperation" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}FunctionalOperation" minOccurs="0"/&gt;
 *         &lt;element name="productSpecification" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}ProductSpecification" minOccurs="0"/&gt;
 *         &lt;element name="deliveryContact" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}DeliveryContact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="deliveredAt" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}DeliveredAt" minOccurs="0"/&gt;
 *         &lt;element name="effectDatePlanned" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductOrderItem", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", propOrder = {
    "productOrderItemID",
    "effectDateWished",
    "productOrderItemStatus",
    "productOrderItemLink",
    "installedProduct",
    "installedProductLink",
    "user",
    "functionalOperation",
    "productSpecification",
    "deliveryContact",
    "deliveredAt",
    "effectDatePlanned"
})
public class ProductOrderItem {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String productOrderItemID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectDateWished;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected ProductOrderItemStatus productOrderItemStatus;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", nillable = true)
    protected List<ProductOrderItemLink> productOrderItemLink;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected InstalledProduct installedProduct;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", nillable = true)
    protected List<InstalledProductLink> installedProductLink;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", nillable = true)
    protected List<User> user;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected FunctionalOperation functionalOperation;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected ProductSpecification productSpecification;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", nillable = true)
    protected List<DeliveryContact> deliveryContact;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected DeliveredAt deliveredAt;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectDatePlanned;

    /**
     * Gets the value of the productOrderItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductOrderItemID() {
        return productOrderItemID;
    }

    /**
     * Sets the value of the productOrderItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductOrderItemID(String value) {
        this.productOrderItemID = value;
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
     * Gets the value of the productOrderItemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ProductOrderItemStatus }
     *     
     */
    public ProductOrderItemStatus getProductOrderItemStatus() {
        return productOrderItemStatus;
    }

    /**
     * Sets the value of the productOrderItemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductOrderItemStatus }
     *     
     */
    public void setProductOrderItemStatus(ProductOrderItemStatus value) {
        this.productOrderItemStatus = value;
    }

    /**
     * Gets the value of the productOrderItemLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productOrderItemLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductOrderItemLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductOrderItemLink }
     * 
     * 
     */
    public List<ProductOrderItemLink> getProductOrderItemLink() {
        if (productOrderItemLink == null) {
            productOrderItemLink = new ArrayList<ProductOrderItemLink>();
        }
        return this.productOrderItemLink;
    }

    /**
     * Gets the value of the installedProduct property.
     * 
     * @return
     *     possible object is
     *     {@link InstalledProduct }
     *     
     */
    public InstalledProduct getInstalledProduct() {
        return installedProduct;
    }

    /**
     * Sets the value of the installedProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstalledProduct }
     *     
     */
    public void setInstalledProduct(InstalledProduct value) {
        this.installedProduct = value;
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
     * Gets the value of the user property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the user property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link User }
     * 
     * 
     */
    public List<User> getUser() {
        if (user == null) {
            user = new ArrayList<User>();
        }
        return this.user;
    }

    /**
     * Gets the value of the functionalOperation property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionalOperation }
     *     
     */
    public FunctionalOperation getFunctionalOperation() {
        return functionalOperation;
    }

    /**
     * Sets the value of the functionalOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionalOperation }
     *     
     */
    public void setFunctionalOperation(FunctionalOperation value) {
        this.functionalOperation = value;
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
     * Gets the value of the deliveryContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryContact }
     * 
     * 
     */
    public List<DeliveryContact> getDeliveryContact() {
        if (deliveryContact == null) {
            deliveryContact = new ArrayList<DeliveryContact>();
        }
        return this.deliveryContact;
    }

    /**
     * Gets the value of the deliveredAt property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveredAt }
     *     
     */
    public DeliveredAt getDeliveredAt() {
        return deliveredAt;
    }

    /**
     * Sets the value of the deliveredAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveredAt }
     *     
     */
    public void setDeliveredAt(DeliveredAt value) {
        this.deliveredAt = value;
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

}
