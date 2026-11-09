
package com.orangecaraibe.epco.model.customerdomain.customerorder;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.orangecaraibe.epco.model.commonbusiness.interaction.ComputerOrNetworkEquipment;
import com.orangecaraibe.epco.model.commonbusiness.interaction.InteractionSubject;
import com.orangecaraibe.epco.model.commonbusiness.party.Person;
import com.orangecaraibe.epco.model.commonbusiness.party.role.Creator;
import com.orangecaraibe.epco.model.commonbusiness.party.role.Distributor;
import com.orangecaraibe.epco.model.customerdomain.customerbilling.Currency;


/**
 * <p>Java class for CustomerOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}InteractionSubject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerOrderID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerOrderItem" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerOrder}CustomerOrderItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="distributor" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role}Distributor" minOccurs="0"/&gt;
 *         &lt;element name="localOrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creator" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role}Creator" minOccurs="0"/&gt;
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="localDeliveryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localInvoiceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="person" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party}Person" minOccurs="0"/&gt;
 *         &lt;element name="computerOrNetworkEquipment" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}ComputerOrNetworkEquipment" minOccurs="0"/&gt;
 *         &lt;element name="localAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}Currency" minOccurs="0"/&gt;
 *         &lt;element name="localLoyaltyAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="localLoyaltyUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrder", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerOrder", propOrder = {
    "customerOrderID",
    "customerOrderItem",
    "distributor",
    "localOrderType",
    "creator",
    "creationDate",
    "localDeliveryID",
    "localInvoiceID",
    "person",
    "computerOrNetworkEquipment",
    "localAmount",
    "currency",
    "localLoyaltyAmount",
    "localLoyaltyUnitCode"
})
public class CustomerOrder
    extends InteractionSubject
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerOrder", required = true)
    protected String customerOrderID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerOrder", nillable = true)
    protected List<CustomerOrderItem> customerOrderItem;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerOrder")
    protected Distributor distributor;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerOrder")
    protected String localOrderType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerOrder")
    protected Creator creator;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerOrder")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerOrder")
    protected String localDeliveryID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerOrder")
    protected String localInvoiceID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerOrder")
    protected Person person;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerOrder")
    protected ComputerOrNetworkEquipment computerOrNetworkEquipment;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerOrder")
    protected Double localAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerOrder")
    protected Currency currency;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerOrder")
    protected Double localLoyaltyAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerOrder")
    protected String localLoyaltyUnitCode;

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
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link Creator }
     *     
     */
    public Creator getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Creator }
     *     
     */
    public void setCreator(Creator value) {
        this.creator = value;
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
     * Gets the value of the localDeliveryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalDeliveryID() {
        return localDeliveryID;
    }

    /**
     * Sets the value of the localDeliveryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalDeliveryID(String value) {
        this.localDeliveryID = value;
    }

    /**
     * Gets the value of the localInvoiceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalInvoiceID() {
        return localInvoiceID;
    }

    /**
     * Sets the value of the localInvoiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalInvoiceID(String value) {
        this.localInvoiceID = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
    }

    /**
     * Gets the value of the computerOrNetworkEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link ComputerOrNetworkEquipment }
     *     
     */
    public ComputerOrNetworkEquipment getComputerOrNetworkEquipment() {
        return computerOrNetworkEquipment;
    }

    /**
     * Sets the value of the computerOrNetworkEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputerOrNetworkEquipment }
     *     
     */
    public void setComputerOrNetworkEquipment(ComputerOrNetworkEquipment value) {
        this.computerOrNetworkEquipment = value;
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

}
