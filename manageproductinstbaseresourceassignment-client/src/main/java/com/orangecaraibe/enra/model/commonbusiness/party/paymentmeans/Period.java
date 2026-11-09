
package com.orangecaraibe.enra.model.commonbusiness.party.paymentmeans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Period complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Period"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startPeriod" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="endPeriod" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Period", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans", propOrder = {
    "startPeriod",
    "endPeriod"
})
public class Period {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startPeriod;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endPeriod;

    /**
     * Gets the value of the startPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartPeriod() {
        return startPeriod;
    }

    /**
     * Sets the value of the startPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartPeriod(XMLGregorianCalendar value) {
        this.startPeriod = value;
    }

    /**
     * Gets the value of the endPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndPeriod() {
        return endPeriod;
    }

    /**
     * Sets the value of the endPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndPeriod(XMLGregorianCalendar value) {
        this.endPeriod = value;
    }

}
