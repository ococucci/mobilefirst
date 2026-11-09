
package com.orangecaraibe.enra.model.customerdomain.customerbilling.payment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PaymentSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentSchedule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentScheduleID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="localPlanificationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="localScheduleCurrentStatus" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment}PaymentStatus" minOccurs="0"/&gt;
 *         &lt;element name="localScheduleStatusHistory" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment}LocalScheduleStatusHistory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="localComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentSchedule", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment", propOrder = {
    "paymentScheduleID",
    "amount",
    "localPlanificationDate",
    "localScheduleCurrentStatus",
    "localScheduleStatusHistory",
    "localComment"
})
public class PaymentSchedule {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected String paymentScheduleID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected Float amount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar localPlanificationDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected PaymentStatus localScheduleCurrentStatus;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment", nillable = true)
    protected List<LocalScheduleStatusHistory> localScheduleStatusHistory;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected String localComment;

    /**
     * Gets the value of the paymentScheduleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentScheduleID() {
        return paymentScheduleID;
    }

    /**
     * Sets the value of the paymentScheduleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentScheduleID(String value) {
        this.paymentScheduleID = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAmount(Float value) {
        this.amount = value;
    }

    /**
     * Gets the value of the localPlanificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocalPlanificationDate() {
        return localPlanificationDate;
    }

    /**
     * Sets the value of the localPlanificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocalPlanificationDate(XMLGregorianCalendar value) {
        this.localPlanificationDate = value;
    }

    /**
     * Gets the value of the localScheduleCurrentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatus }
     *     
     */
    public PaymentStatus getLocalScheduleCurrentStatus() {
        return localScheduleCurrentStatus;
    }

    /**
     * Sets the value of the localScheduleCurrentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatus }
     *     
     */
    public void setLocalScheduleCurrentStatus(PaymentStatus value) {
        this.localScheduleCurrentStatus = value;
    }

    /**
     * Gets the value of the localScheduleStatusHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localScheduleStatusHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalScheduleStatusHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalScheduleStatusHistory }
     * 
     * 
     */
    public List<LocalScheduleStatusHistory> getLocalScheduleStatusHistory() {
        if (localScheduleStatusHistory == null) {
            localScheduleStatusHistory = new ArrayList<LocalScheduleStatusHistory>();
        }
        return this.localScheduleStatusHistory;
    }

    /**
     * Gets the value of the localComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalComment() {
        return localComment;
    }

    /**
     * Sets the value of the localComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalComment(String value) {
        this.localComment = value;
    }

}
