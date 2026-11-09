
package com.orangecaraibe.soa.v2.interfaces.managepayment.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.soa.v2.model.commons.UseCase;
import com.orangecaraibe.soa.v2.model.customerdomain.customerbilling.payment.PaymentAuthorization;


/**
 * <p>Java class for getPaymentAuthorization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPaymentAuthorization"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentAuthorization" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment}PaymentAuthorization"/&gt;
 *         &lt;element name="useCase" type="{http://www.orangecaraibe.com/soa/v2/Model/Commons}UseCase" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPaymentAuthorization", namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManagePayment/Schemas", propOrder = {
    "paymentAuthorization",
    "useCase"
})
public class GetPaymentAuthorization {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManagePayment/Schemas", required = true)
    protected PaymentAuthorization paymentAuthorization;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManagePayment/Schemas", required = true)
    protected List<UseCase> useCase;

    /**
     * Gets the value of the paymentAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentAuthorization }
     *     
     */
    public PaymentAuthorization getPaymentAuthorization() {
        return paymentAuthorization;
    }

    /**
     * Sets the value of the paymentAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAuthorization }
     *     
     */
    public void setPaymentAuthorization(PaymentAuthorization value) {
        this.paymentAuthorization = value;
    }

    /**
     * Gets the value of the useCase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useCase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseCase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UseCase }
     * 
     * 
     */
    public List<UseCase> getUseCase() {
        if (useCase == null) {
            useCase = new ArrayList<UseCase>();
        }
        return this.useCase;
    }

}
