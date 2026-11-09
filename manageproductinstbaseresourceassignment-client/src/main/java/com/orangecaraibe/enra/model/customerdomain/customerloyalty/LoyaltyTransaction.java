
package com.orangecaraibe.enra.model.customerdomain.customerloyalty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.orangecaraibe.enra.model.customerdomain.customerorder.CustomerOrder;


/**
 * <p>Java class for LoyaltyTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoyaltyTransaction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="loyaltyTransactionID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerOrder" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerOrder}CustomerOrder"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="loyaltyAccount" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty}LoyaltyAccount"/&gt;
 *         &lt;element name="unitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localBonusValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyTransaction", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty", propOrder = {
    "amount",
    "creationDate",
    "loyaltyTransactionID",
    "customerOrder",
    "value",
    "loyaltyAccount",
    "unitCode",
    "localBonusValue"
})
@XmlSeeAlso({
    LoyaltyBurn.class,
    LoyaltyEarn.class
})
public class LoyaltyTransaction {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty")
    protected double amount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty", required = true)
    protected String loyaltyTransactionID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty", required = true)
    protected CustomerOrder customerOrder;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty")
    protected double value;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty", required = true)
    protected LoyaltyAccount loyaltyAccount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty")
    protected String unitCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty")
    protected Double localBonusValue;

    /**
     * Gets the value of the amount property.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
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
     * Gets the value of the loyaltyTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyTransactionID() {
        return loyaltyTransactionID;
    }

    /**
     * Sets the value of the loyaltyTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyTransactionID(String value) {
        this.loyaltyTransactionID = value;
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
     * Gets the value of the value property.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Gets the value of the loyaltyAccount property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyAccount }
     *     
     */
    public LoyaltyAccount getLoyaltyAccount() {
        return loyaltyAccount;
    }

    /**
     * Sets the value of the loyaltyAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyAccount }
     *     
     */
    public void setLoyaltyAccount(LoyaltyAccount value) {
        this.loyaltyAccount = value;
    }

    /**
     * Gets the value of the unitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * Sets the value of the unitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCode(String value) {
        this.unitCode = value;
    }

    /**
     * Gets the value of the localBonusValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLocalBonusValue() {
        return localBonusValue;
    }

    /**
     * Sets the value of the localBonusValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLocalBonusValue(Double value) {
        this.localBonusValue = value;
    }

}
