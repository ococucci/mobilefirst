
package com.orangecaraibe.epco.model.customerdomain.customerbilling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DunningProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DunningProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dunningProfileCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dunningProfileLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localDunnable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="localExclusionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="localSuspensionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="localResiliationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="localStepNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localStepDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="localNextStepDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DunningProfile", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", propOrder = {
    "dunningProfileCode",
    "dunningProfileLabel",
    "localDunnable",
    "localExclusionDate",
    "localSuspensionDate",
    "localResiliationDate",
    "localStepNumber",
    "localStepDate",
    "localNextStepDate"
})
public class DunningProfile {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected String dunningProfileCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected String dunningProfileLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected Boolean localDunnable;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar localExclusionDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar localSuspensionDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar localResiliationDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    protected String localStepNumber;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar localStepDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar localNextStepDate;

    /**
     * Gets the value of the dunningProfileCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDunningProfileCode() {
        return dunningProfileCode;
    }

    /**
     * Sets the value of the dunningProfileCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDunningProfileCode(String value) {
        this.dunningProfileCode = value;
    }

    /**
     * Gets the value of the dunningProfileLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDunningProfileLabel() {
        return dunningProfileLabel;
    }

    /**
     * Sets the value of the dunningProfileLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDunningProfileLabel(String value) {
        this.dunningProfileLabel = value;
    }

    /**
     * Gets the value of the localDunnable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalDunnable() {
        return localDunnable;
    }

    /**
     * Sets the value of the localDunnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalDunnable(Boolean value) {
        this.localDunnable = value;
    }

    /**
     * Gets the value of the localExclusionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocalExclusionDate() {
        return localExclusionDate;
    }

    /**
     * Sets the value of the localExclusionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocalExclusionDate(XMLGregorianCalendar value) {
        this.localExclusionDate = value;
    }

    /**
     * Gets the value of the localSuspensionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocalSuspensionDate() {
        return localSuspensionDate;
    }

    /**
     * Sets the value of the localSuspensionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocalSuspensionDate(XMLGregorianCalendar value) {
        this.localSuspensionDate = value;
    }

    /**
     * Gets the value of the localResiliationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocalResiliationDate() {
        return localResiliationDate;
    }

    /**
     * Sets the value of the localResiliationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocalResiliationDate(XMLGregorianCalendar value) {
        this.localResiliationDate = value;
    }

    /**
     * Gets the value of the localStepNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalStepNumber() {
        return localStepNumber;
    }

    /**
     * Sets the value of the localStepNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalStepNumber(String value) {
        this.localStepNumber = value;
    }

    /**
     * Gets the value of the localStepDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocalStepDate() {
        return localStepDate;
    }

    /**
     * Sets the value of the localStepDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocalStepDate(XMLGregorianCalendar value) {
        this.localStepDate = value;
    }

    /**
     * Gets the value of the localNextStepDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocalNextStepDate() {
        return localNextStepDate;
    }

    /**
     * Sets the value of the localNextStepDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocalNextStepDate(XMLGregorianCalendar value) {
        this.localNextStepDate = value;
    }

}
