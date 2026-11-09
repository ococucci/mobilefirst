
package com.orangecaraibe.soa.v2.model.customerdomain.customerbilling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HardDunning complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HardDunning"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}DunningCase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hardDunningAmount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="hardDunningDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HardDunning", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", propOrder = {
    "hardDunningAmount",
    "hardDunningDate"
})
public class HardDunning
    extends DunningCase
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected float hardDunningAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar hardDunningDate;

    /**
     * Gets the value of the hardDunningAmount property.
     * 
     */
    public float getHardDunningAmount() {
        return hardDunningAmount;
    }

    /**
     * Sets the value of the hardDunningAmount property.
     * 
     */
    public void setHardDunningAmount(float value) {
        this.hardDunningAmount = value;
    }

    /**
     * Gets the value of the hardDunningDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHardDunningDate() {
        return hardDunningDate;
    }

    /**
     * Sets the value of the hardDunningDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHardDunningDate(XMLGregorianCalendar value) {
        this.hardDunningDate = value;
    }

}
