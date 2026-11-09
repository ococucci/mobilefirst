
package com.orangecaraibe.soa.v2.interfaces.managepayment.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.soa.v2.model.commonbusiness.interaction.ComputerOrNetworkEquipment;
import com.orangecaraibe.soa.v2.model.commons.UseCase;
import com.orangecaraibe.soa.v2.model.customerdomain.customerbilling.payment.Payment;


/**
 * <p>Java class for executePayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="executePayment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="useCase" type="{http://www.orangecaraibe.com/soa/v2/Model/Commons}UseCase"/&gt;
 *         &lt;element name="payment" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment}Payment"/&gt;
 *         &lt;element name="computerOrNetworkEquipment" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}ComputerOrNetworkEquipment"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executePayment", namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManagePayment/Schemas", propOrder = {
    "useCase",
    "payment",
    "computerOrNetworkEquipment"
})
public class ExecutePayment {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManagePayment/Schemas", required = true)
    protected UseCase useCase;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManagePayment/Schemas", required = true)
    protected Payment payment;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManagePayment/Schemas", required = true)
    protected ComputerOrNetworkEquipment computerOrNetworkEquipment;

    /**
     * Gets the value of the useCase property.
     * 
     * @return
     *     possible object is
     *     {@link UseCase }
     *     
     */
    public UseCase getUseCase() {
        return useCase;
    }

    /**
     * Sets the value of the useCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link UseCase }
     *     
     */
    public void setUseCase(UseCase value) {
        this.useCase = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setPayment(Payment value) {
        this.payment = value;
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

}
