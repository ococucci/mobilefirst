
package com.orangecaraibe.epco.model.customerdomain.managecustomerorder;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LocalContractDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocalContractDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contractDocumentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractDocumentCreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="contractDocumentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractDocumentSigningDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="contractDocumentImage" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}LocalContractDocumentImage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contractDocumentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractDocumentGenerationMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractDocumentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalContractDocument", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", propOrder = {
    "contractDocumentID",
    "contractDocumentCreationDate",
    "contractDocumentType",
    "contractDocumentSigningDate",
    "contractDocumentImage",
    "contractDocumentStatus",
    "contractDocumentGenerationMode",
    "contractDocumentName"
})
public class LocalContractDocument {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String contractDocumentID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar contractDocumentCreationDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String contractDocumentType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar contractDocumentSigningDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", nillable = true)
    protected List<LocalContractDocumentImage> contractDocumentImage;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String contractDocumentStatus;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String contractDocumentGenerationMode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String contractDocumentName;

    /**
     * Gets the value of the contractDocumentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractDocumentID() {
        return contractDocumentID;
    }

    /**
     * Sets the value of the contractDocumentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractDocumentID(String value) {
        this.contractDocumentID = value;
    }

    /**
     * Gets the value of the contractDocumentCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractDocumentCreationDate() {
        return contractDocumentCreationDate;
    }

    /**
     * Sets the value of the contractDocumentCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractDocumentCreationDate(XMLGregorianCalendar value) {
        this.contractDocumentCreationDate = value;
    }

    /**
     * Gets the value of the contractDocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractDocumentType() {
        return contractDocumentType;
    }

    /**
     * Sets the value of the contractDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractDocumentType(String value) {
        this.contractDocumentType = value;
    }

    /**
     * Gets the value of the contractDocumentSigningDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractDocumentSigningDate() {
        return contractDocumentSigningDate;
    }

    /**
     * Sets the value of the contractDocumentSigningDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractDocumentSigningDate(XMLGregorianCalendar value) {
        this.contractDocumentSigningDate = value;
    }

    /**
     * Gets the value of the contractDocumentImage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractDocumentImage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractDocumentImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalContractDocumentImage }
     * 
     * 
     */
    public List<LocalContractDocumentImage> getContractDocumentImage() {
        if (contractDocumentImage == null) {
            contractDocumentImage = new ArrayList<LocalContractDocumentImage>();
        }
        return this.contractDocumentImage;
    }

    /**
     * Gets the value of the contractDocumentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractDocumentStatus() {
        return contractDocumentStatus;
    }

    /**
     * Sets the value of the contractDocumentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractDocumentStatus(String value) {
        this.contractDocumentStatus = value;
    }

    /**
     * Gets the value of the contractDocumentGenerationMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractDocumentGenerationMode() {
        return contractDocumentGenerationMode;
    }

    /**
     * Sets the value of the contractDocumentGenerationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractDocumentGenerationMode(String value) {
        this.contractDocumentGenerationMode = value;
    }

    /**
     * Gets the value of the contractDocumentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractDocumentName() {
        return contractDocumentName;
    }

    /**
     * Sets the value of the contractDocumentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractDocumentName(String value) {
        this.contractDocumentName = value;
    }

}
