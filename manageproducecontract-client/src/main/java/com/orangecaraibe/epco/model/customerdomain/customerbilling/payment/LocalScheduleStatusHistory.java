
package com.orangecaraibe.epco.model.customerdomain.customerbilling.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LocalScheduleStatusHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocalScheduleStatusHistory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="localScheduleCurrentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localScheduleCurrentStatusdate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalScheduleStatusHistory", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment", propOrder = {
    "localScheduleCurrentStatus",
    "localScheduleCurrentStatusdate"
})
public class LocalScheduleStatusHistory {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected String localScheduleCurrentStatus;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar localScheduleCurrentStatusdate;

    /**
     * Gets the value of the localScheduleCurrentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalScheduleCurrentStatus() {
        return localScheduleCurrentStatus;
    }

    /**
     * Sets the value of the localScheduleCurrentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalScheduleCurrentStatus(String value) {
        this.localScheduleCurrentStatus = value;
    }

    /**
     * Gets the value of the localScheduleCurrentStatusdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocalScheduleCurrentStatusdate() {
        return localScheduleCurrentStatusdate;
    }

    /**
     * Sets the value of the localScheduleCurrentStatusdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocalScheduleCurrentStatusdate(XMLGregorianCalendar value) {
        this.localScheduleCurrentStatusdate = value;
    }

}
