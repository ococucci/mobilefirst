
package com.orangecaraibe.epco.model.customerdomain.managecustomerorder;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfferSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="offerSpecificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offerSpecificationLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offerSpecificationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="genericProduct" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}GenericProduct" minOccurs="0"/&gt;
 *         &lt;element name="tariffSpecification" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}OfferTariffSpecification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="commercialOperation" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}CommercialOperation" minOccurs="0"/&gt;
 *         &lt;element name="commercialClassification" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}CommercialClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferSpecification", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", propOrder = {
    "offerSpecificationCode",
    "offerSpecificationLabel",
    "offerSpecificationType",
    "genericProduct",
    "tariffSpecification",
    "commercialOperation",
    "commercialClassification"
})
public class OfferSpecification {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String offerSpecificationCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String offerSpecificationLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String offerSpecificationType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected GenericProduct genericProduct;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", nillable = true)
    protected List<OfferTariffSpecification> tariffSpecification;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected CommercialOperation commercialOperation;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", nillable = true)
    protected List<CommercialClassification> commercialClassification;

    /**
     * Gets the value of the offerSpecificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferSpecificationCode() {
        return offerSpecificationCode;
    }

    /**
     * Sets the value of the offerSpecificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferSpecificationCode(String value) {
        this.offerSpecificationCode = value;
    }

    /**
     * Gets the value of the offerSpecificationLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferSpecificationLabel() {
        return offerSpecificationLabel;
    }

    /**
     * Sets the value of the offerSpecificationLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferSpecificationLabel(String value) {
        this.offerSpecificationLabel = value;
    }

    /**
     * Gets the value of the offerSpecificationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferSpecificationType() {
        return offerSpecificationType;
    }

    /**
     * Sets the value of the offerSpecificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferSpecificationType(String value) {
        this.offerSpecificationType = value;
    }

    /**
     * Gets the value of the genericProduct property.
     * 
     * @return
     *     possible object is
     *     {@link GenericProduct }
     *     
     */
    public GenericProduct getGenericProduct() {
        return genericProduct;
    }

    /**
     * Sets the value of the genericProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericProduct }
     *     
     */
    public void setGenericProduct(GenericProduct value) {
        this.genericProduct = value;
    }

    /**
     * Gets the value of the tariffSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tariffSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTariffSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferTariffSpecification }
     * 
     * 
     */
    public List<OfferTariffSpecification> getTariffSpecification() {
        if (tariffSpecification == null) {
            tariffSpecification = new ArrayList<OfferTariffSpecification>();
        }
        return this.tariffSpecification;
    }

    /**
     * Gets the value of the commercialOperation property.
     * 
     * @return
     *     possible object is
     *     {@link CommercialOperation }
     *     
     */
    public CommercialOperation getCommercialOperation() {
        return commercialOperation;
    }

    /**
     * Sets the value of the commercialOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercialOperation }
     *     
     */
    public void setCommercialOperation(CommercialOperation value) {
        this.commercialOperation = value;
    }

    /**
     * Gets the value of the commercialClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commercialClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommercialClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommercialClassification }
     * 
     * 
     */
    public List<CommercialClassification> getCommercialClassification() {
        if (commercialClassification == null) {
            commercialClassification = new ArrayList<CommercialClassification>();
        }
        return this.commercialClassification;
    }

}
