
package com.orangecaraibe.soa.v2.interfaces.managepayment.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.soa.v2.model.commons.UseCase;
import com.orangecaraibe.soa.v2.model.customerdomain.customerbilling.payment.Refund;


/**
 * <p>Java class for executeRefund complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="executeRefund"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="useCase" type="{http://www.orangecaraibe.com/soa/v2/Model/Commons}UseCase"/&gt;
 *         &lt;element name="refund" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment}Refund"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executeRefund", namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManagePayment/Schemas", propOrder = {
    "useCase",
    "refund"
})
public class ExecuteRefund {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManagePayment/Schemas", required = true)
    protected UseCase useCase;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManagePayment/Schemas", required = true)
    protected Refund refund;

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
     * Gets the value of the refund property.
     * 
     * @return
     *     possible object is
     *     {@link Refund }
     *     
     */
    public Refund getRefund() {
        return refund;
    }

    /**
     * Sets the value of the refund property.
     * 
     * @param value
     *     allowed object is
     *     {@link Refund }
     *     
     */
    public void setRefund(Refund value) {
        this.refund = value;
    }

}
