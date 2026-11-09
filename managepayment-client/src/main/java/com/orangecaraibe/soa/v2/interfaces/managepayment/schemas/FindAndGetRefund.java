
package com.orangecaraibe.soa.v2.interfaces.managepayment.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.soa.v2.model.commons.criteria.Criteria;


/**
 * <p>Java class for findAndGetRefund complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findAndGetRefund"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="criteria" type="{http://www.orangecaraibe.com/soa/v2/Model/Commons/Criteria}Criteria"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findAndGetRefund", namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManagePayment/Schemas", propOrder = {
    "criteria"
})
public class FindAndGetRefund {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManagePayment/Schemas", required = true)
    protected Criteria criteria;

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link Criteria }
     *     
     */
    public Criteria getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link Criteria }
     *     
     */
    public void setCriteria(Criteria value) {
        this.criteria = value;
    }

}
