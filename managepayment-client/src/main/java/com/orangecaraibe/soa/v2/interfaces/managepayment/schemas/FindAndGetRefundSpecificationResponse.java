
package com.orangecaraibe.soa.v2.interfaces.managepayment.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.soa.v2.model.customerdomain.customerbilling.payment.LocalRefundSpecification;


/**
 * <p>Java class for findAndGetRefundSpecificationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findAndGetRefundSpecificationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="refundSpecification" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment}LocalRefundSpecification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findAndGetRefundSpecificationResponse", namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManagePayment/Schemas", propOrder = {
    "refundSpecification"
})
public class FindAndGetRefundSpecificationResponse {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManagePayment/Schemas", nillable = true)
    protected List<LocalRefundSpecification> refundSpecification;

    /**
     * Gets the value of the refundSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refundSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefundSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalRefundSpecification }
     * 
     * 
     */
    public List<LocalRefundSpecification> getRefundSpecification() {
        if (refundSpecification == null) {
            refundSpecification = new ArrayList<LocalRefundSpecification>();
        }
        return this.refundSpecification;
    }

}
