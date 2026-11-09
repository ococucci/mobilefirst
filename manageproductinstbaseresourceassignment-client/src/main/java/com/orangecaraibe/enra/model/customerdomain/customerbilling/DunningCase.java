
package com.orangecaraibe.enra.model.customerdomain.customerbilling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.enra.model.customerdomain.customerbilling.rating.AppliedCharge;
import com.orangecaraibe.enra.model.customerdomain.invoicing.Invoice;


/**
 * <p>Java class for DunningCase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DunningCase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dunningCaseAction" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}DunningCaseAction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="customeraccount" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}CustomerAccount"/&gt;
 *         &lt;element name="customerbill" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Invoicing}Invoice" maxOccurs="unbounded"/&gt;
 *         &lt;element name="dunningscenario" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}DunningScenarioSpec"/&gt;
 *         &lt;element name="appliedcharge" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating}AppliedCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DunningCase", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", propOrder = {
    "dunningCaseAction",
    "customeraccount",
    "customerbill",
    "dunningscenario",
    "appliedcharge"
})
@XmlSeeAlso({
    SoftDunning.class,
    HardDunning.class
})
public class DunningCase {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", nillable = true)
    protected List<DunningCaseAction> dunningCaseAction;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", required = true)
    protected CustomerAccount customeraccount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", required = true)
    protected List<Invoice> customerbill;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", required = true)
    protected DunningScenarioSpec dunningscenario;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", nillable = true)
    protected List<AppliedCharge> appliedcharge;

    /**
     * Gets the value of the dunningCaseAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dunningCaseAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDunningCaseAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DunningCaseAction }
     * 
     * 
     */
    public List<DunningCaseAction> getDunningCaseAction() {
        if (dunningCaseAction == null) {
            dunningCaseAction = new ArrayList<DunningCaseAction>();
        }
        return this.dunningCaseAction;
    }

    /**
     * Gets the value of the customeraccount property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccount }
     *     
     */
    public CustomerAccount getCustomeraccount() {
        return customeraccount;
    }

    /**
     * Sets the value of the customeraccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccount }
     *     
     */
    public void setCustomeraccount(CustomerAccount value) {
        this.customeraccount = value;
    }

    /**
     * Gets the value of the customerbill property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerbill property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerbill().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Invoice }
     * 
     * 
     */
    public List<Invoice> getCustomerbill() {
        if (customerbill == null) {
            customerbill = new ArrayList<Invoice>();
        }
        return this.customerbill;
    }

    /**
     * Gets the value of the dunningscenario property.
     * 
     * @return
     *     possible object is
     *     {@link DunningScenarioSpec }
     *     
     */
    public DunningScenarioSpec getDunningscenario() {
        return dunningscenario;
    }

    /**
     * Sets the value of the dunningscenario property.
     * 
     * @param value
     *     allowed object is
     *     {@link DunningScenarioSpec }
     *     
     */
    public void setDunningscenario(DunningScenarioSpec value) {
        this.dunningscenario = value;
    }

    /**
     * Gets the value of the appliedcharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliedcharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliedcharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppliedCharge }
     * 
     * 
     */
    public List<AppliedCharge> getAppliedcharge() {
        if (appliedcharge == null) {
            appliedcharge = new ArrayList<AppliedCharge>();
        }
        return this.appliedcharge;
    }

}
