
package com.orangecaraibe.soa.v2.model.customerdomain.customerproblem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reason complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reason"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mainReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reasonDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localReasonObject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localReasonSpecification" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem}LocalReasonSpecification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reason", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem", propOrder = {
    "mainReason",
    "reason",
    "subReason",
    "reasonDescription",
    "localReasonObject",
    "localReasonSpecification"
})
public class Reason {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem")
    protected String mainReason;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem")
    protected String reason;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem")
    protected String subReason;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem")
    protected String reasonDescription;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem")
    protected String localReasonObject;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem")
    protected LocalReasonSpecification localReasonSpecification;

    /**
     * Gets the value of the mainReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainReason() {
        return mainReason;
    }

    /**
     * Sets the value of the mainReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainReason(String value) {
        this.mainReason = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the subReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubReason() {
        return subReason;
    }

    /**
     * Sets the value of the subReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubReason(String value) {
        this.subReason = value;
    }

    /**
     * Gets the value of the reasonDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonDescription() {
        return reasonDescription;
    }

    /**
     * Sets the value of the reasonDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonDescription(String value) {
        this.reasonDescription = value;
    }

    /**
     * Gets the value of the localReasonObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalReasonObject() {
        return localReasonObject;
    }

    /**
     * Sets the value of the localReasonObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalReasonObject(String value) {
        this.localReasonObject = value;
    }

    /**
     * Gets the value of the localReasonSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link LocalReasonSpecification }
     *     
     */
    public LocalReasonSpecification getLocalReasonSpecification() {
        return localReasonSpecification;
    }

    /**
     * Sets the value of the localReasonSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalReasonSpecification }
     *     
     */
    public void setLocalReasonSpecification(LocalReasonSpecification value) {
        this.localReasonSpecification = value;
    }

}
