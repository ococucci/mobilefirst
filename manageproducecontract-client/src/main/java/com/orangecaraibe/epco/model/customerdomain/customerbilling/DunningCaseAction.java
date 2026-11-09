
package com.orangecaraibe.epco.model.customerdomain.customerbilling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.epco.model.commonbusiness.interaction.Interaction;
import com.orangecaraibe.epco.model.customerdomain.customerbilling.rating.AppliedCharge;
import com.orangecaraibe.epco.model.customerdomain.customerorder.CustomerOrder;


/**
 * <p>Java class for DunningCaseAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DunningCaseAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="interaction" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}Interaction" minOccurs="0"/&gt;
 *         &lt;element name="customerorder" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerOrder}CustomerOrder" minOccurs="0"/&gt;
 *         &lt;element name="dunningscenarioactionspec" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}DunningScenarioActionSpec"/&gt;
 *         &lt;element name="penaltycharge" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating}AppliedCharge" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DunningCaseAction", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", propOrder = {
    "interaction",
    "customerorder",
    "dunningscenarioactionspec",
    "penaltycharge"
})
public class DunningCaseAction {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected Interaction interaction;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected CustomerOrder customerorder;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", required = true)
    protected DunningScenarioActionSpec dunningscenarioactionspec;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected AppliedCharge penaltycharge;

    /**
     * Gets the value of the interaction property.
     * 
     * @return
     *     possible object is
     *     {@link Interaction }
     *     
     */
    public Interaction getInteraction() {
        return interaction;
    }

    /**
     * Sets the value of the interaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interaction }
     *     
     */
    public void setInteraction(Interaction value) {
        this.interaction = value;
    }

    /**
     * Gets the value of the customerorder property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrder }
     *     
     */
    public CustomerOrder getCustomerorder() {
        return customerorder;
    }

    /**
     * Sets the value of the customerorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrder }
     *     
     */
    public void setCustomerorder(CustomerOrder value) {
        this.customerorder = value;
    }

    /**
     * Gets the value of the dunningscenarioactionspec property.
     * 
     * @return
     *     possible object is
     *     {@link DunningScenarioActionSpec }
     *     
     */
    public DunningScenarioActionSpec getDunningscenarioactionspec() {
        return dunningscenarioactionspec;
    }

    /**
     * Sets the value of the dunningscenarioactionspec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DunningScenarioActionSpec }
     *     
     */
    public void setDunningscenarioactionspec(DunningScenarioActionSpec value) {
        this.dunningscenarioactionspec = value;
    }

    /**
     * Gets the value of the penaltycharge property.
     * 
     * @return
     *     possible object is
     *     {@link AppliedCharge }
     *     
     */
    public AppliedCharge getPenaltycharge() {
        return penaltycharge;
    }

    /**
     * Sets the value of the penaltycharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppliedCharge }
     *     
     */
    public void setPenaltycharge(AppliedCharge value) {
        this.penaltycharge = value;
    }

}
