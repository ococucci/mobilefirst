
package com.orangecaraibe.epco.model.customerdomain.customerproblem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Intervention complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Intervention"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="interventionID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isAppointment" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Intervention", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem", propOrder = {
    "interventionID",
    "isAppointment"
})
public class Intervention {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem", required = true)
    protected String interventionID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem")
    protected boolean isAppointment;

    /**
     * Gets the value of the interventionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterventionID() {
        return interventionID;
    }

    /**
     * Sets the value of the interventionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterventionID(String value) {
        this.interventionID = value;
    }

    /**
     * Gets the value of the isAppointment property.
     * 
     */
    public boolean isIsAppointment() {
        return isAppointment;
    }

    /**
     * Sets the value of the isAppointment property.
     * 
     */
    public void setIsAppointment(boolean value) {
        this.isAppointment = value;
    }

}
