
package com.orangecaraibe.epco.model.customerdomain.customerloyalty;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.orangecaraibe.epco.model.commonbusiness.interaction.Interaction;
import com.orangecaraibe.epco.model.offeringandproducts.commercialcatalogue.CommercialClassification;


/**
 * <p>Java class for LoyaltyBalance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoyaltyBalance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="loyaltyTransactions" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty}LoyaltyTransaction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="currentBalance" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="unitCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="unitLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loyaltyEarns" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty}LoyaltyEarn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="loyaltyBurns" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty}LoyaltyBurn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="totalEarn" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="totalBurn" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="totalBonus" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="localThreshold" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="localMessages" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}Interaction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="localCommercialClassifications" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue}CommercialClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="localMainBalance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyBalance", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty", propOrder = {
    "loyaltyTransactions",
    "currentBalance",
    "unitCode",
    "unitLabel",
    "loyaltyEarns",
    "loyaltyBurns",
    "totalEarn",
    "totalBurn",
    "totalBonus",
    "localThreshold",
    "localMessages",
    "localCommercialClassifications",
    "startDate",
    "endDate",
    "localMainBalance"
})
public class LoyaltyBalance {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty", nillable = true)
    protected List<LoyaltyTransaction> loyaltyTransactions;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty")
    protected double currentBalance;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty", required = true)
    protected String unitCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty")
    protected String unitLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty", nillable = true)
    protected List<LoyaltyEarn> loyaltyEarns;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty", nillable = true)
    protected List<LoyaltyBurn> loyaltyBurns;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty")
    protected double totalEarn;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty")
    protected double totalBurn;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty")
    protected double totalBonus;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty")
    protected BigInteger localThreshold;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty", nillable = true)
    protected List<Interaction> localMessages;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty", nillable = true)
    protected List<CommercialClassification> localCommercialClassifications;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty")
    protected Boolean localMainBalance;

    /**
     * Gets the value of the loyaltyTransactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyTransactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyTransactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyTransaction }
     * 
     * 
     */
    public List<LoyaltyTransaction> getLoyaltyTransactions() {
        if (loyaltyTransactions == null) {
            loyaltyTransactions = new ArrayList<LoyaltyTransaction>();
        }
        return this.loyaltyTransactions;
    }

    /**
     * Gets the value of the currentBalance property.
     * 
     */
    public double getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Sets the value of the currentBalance property.
     * 
     */
    public void setCurrentBalance(double value) {
        this.currentBalance = value;
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
     * Gets the value of the unitLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitLabel() {
        return unitLabel;
    }

    /**
     * Sets the value of the unitLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitLabel(String value) {
        this.unitLabel = value;
    }

    /**
     * Gets the value of the loyaltyEarns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyEarns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyEarns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyEarn }
     * 
     * 
     */
    public List<LoyaltyEarn> getLoyaltyEarns() {
        if (loyaltyEarns == null) {
            loyaltyEarns = new ArrayList<LoyaltyEarn>();
        }
        return this.loyaltyEarns;
    }

    /**
     * Gets the value of the loyaltyBurns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyBurns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyBurns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyBurn }
     * 
     * 
     */
    public List<LoyaltyBurn> getLoyaltyBurns() {
        if (loyaltyBurns == null) {
            loyaltyBurns = new ArrayList<LoyaltyBurn>();
        }
        return this.loyaltyBurns;
    }

    /**
     * Gets the value of the totalEarn property.
     * 
     */
    public double getTotalEarn() {
        return totalEarn;
    }

    /**
     * Sets the value of the totalEarn property.
     * 
     */
    public void setTotalEarn(double value) {
        this.totalEarn = value;
    }

    /**
     * Gets the value of the totalBurn property.
     * 
     */
    public double getTotalBurn() {
        return totalBurn;
    }

    /**
     * Sets the value of the totalBurn property.
     * 
     */
    public void setTotalBurn(double value) {
        this.totalBurn = value;
    }

    /**
     * Gets the value of the totalBonus property.
     * 
     */
    public double getTotalBonus() {
        return totalBonus;
    }

    /**
     * Sets the value of the totalBonus property.
     * 
     */
    public void setTotalBonus(double value) {
        this.totalBonus = value;
    }

    /**
     * Gets the value of the localThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLocalThreshold() {
        return localThreshold;
    }

    /**
     * Sets the value of the localThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLocalThreshold(BigInteger value) {
        this.localThreshold = value;
    }

    /**
     * Gets the value of the localMessages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localMessages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Interaction }
     * 
     * 
     */
    public List<Interaction> getLocalMessages() {
        if (localMessages == null) {
            localMessages = new ArrayList<Interaction>();
        }
        return this.localMessages;
    }

    /**
     * Gets the value of the localCommercialClassifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localCommercialClassifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalCommercialClassifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommercialClassification }
     * 
     * 
     */
    public List<CommercialClassification> getLocalCommercialClassifications() {
        if (localCommercialClassifications == null) {
            localCommercialClassifications = new ArrayList<CommercialClassification>();
        }
        return this.localCommercialClassifications;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the localMainBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalMainBalance() {
        return localMainBalance;
    }

    /**
     * Sets the value of the localMainBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalMainBalance(Boolean value) {
        this.localMainBalance = value;
    }

}
