
package com.orangecaraibe.enra.model.offeringandproducts.productinstalledbase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InstalledProductStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstalledProductStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isCurrentStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="statusOrigin" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase}InstalledProductStatusOrigin" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstalledProductStatus", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase", propOrder = {
    "statusCode",
    "isCurrentStatus",
    "startDate",
    "endDate",
    "statusOrigin"
})
public class InstalledProductStatus {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase")
    protected String statusCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase")
    protected boolean isCurrentStatus;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase")
    protected InstalledProductStatusOrigin statusOrigin;

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the isCurrentStatus property.
     * 
     */
    public boolean isIsCurrentStatus() {
        return isCurrentStatus;
    }

    /**
     * Sets the value of the isCurrentStatus property.
     * 
     */
    public void setIsCurrentStatus(boolean value) {
        this.isCurrentStatus = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the statusOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link InstalledProductStatusOrigin }
     *     
     */
    public InstalledProductStatusOrigin getStatusOrigin() {
        return statusOrigin;
    }

    /**
     * Sets the value of the statusOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstalledProductStatusOrigin }
     *     
     */
    public void setStatusOrigin(InstalledProductStatusOrigin value) {
        this.statusOrigin = value;
    }

}
