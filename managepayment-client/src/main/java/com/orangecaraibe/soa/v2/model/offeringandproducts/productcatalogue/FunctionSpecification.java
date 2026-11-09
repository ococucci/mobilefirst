
package com.orangecaraibe.soa.v2.model.offeringandproducts.productcatalogue;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FunctionSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunctionSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="functionSpecificationLabel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="functionSpecificationCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="functionSpecificationAction" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isPublicKey" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="functionValueSpecifications" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue}FunctionValueSpecification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctionSpecification", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue", propOrder = {
    "functionSpecificationLabel",
    "functionSpecificationCode",
    "functionSpecificationAction",
    "isPublicKey",
    "functionValueSpecifications"
})
public class FunctionSpecification {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue", required = true)
    protected String functionSpecificationLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue", required = true)
    protected String functionSpecificationCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue", required = true)
    protected String functionSpecificationAction;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue")
    protected boolean isPublicKey;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue", nillable = true)
    protected List<FunctionValueSpecification> functionValueSpecifications;

    /**
     * Gets the value of the functionSpecificationLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionSpecificationLabel() {
        return functionSpecificationLabel;
    }

    /**
     * Sets the value of the functionSpecificationLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionSpecificationLabel(String value) {
        this.functionSpecificationLabel = value;
    }

    /**
     * Gets the value of the functionSpecificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionSpecificationCode() {
        return functionSpecificationCode;
    }

    /**
     * Sets the value of the functionSpecificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionSpecificationCode(String value) {
        this.functionSpecificationCode = value;
    }

    /**
     * Gets the value of the functionSpecificationAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionSpecificationAction() {
        return functionSpecificationAction;
    }

    /**
     * Sets the value of the functionSpecificationAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionSpecificationAction(String value) {
        this.functionSpecificationAction = value;
    }

    /**
     * Gets the value of the isPublicKey property.
     * 
     */
    public boolean isIsPublicKey() {
        return isPublicKey;
    }

    /**
     * Sets the value of the isPublicKey property.
     * 
     */
    public void setIsPublicKey(boolean value) {
        this.isPublicKey = value;
    }

    /**
     * Gets the value of the functionValueSpecifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the functionValueSpecifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunctionValueSpecifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FunctionValueSpecification }
     * 
     * 
     */
    public List<FunctionValueSpecification> getFunctionValueSpecifications() {
        if (functionValueSpecifications == null) {
            functionValueSpecifications = new ArrayList<FunctionValueSpecification>();
        }
        return this.functionValueSpecifications;
    }

}
