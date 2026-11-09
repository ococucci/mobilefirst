
package com.orangecaraibe.enra.model.offeringandproducts.productcatalogue;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FunctionalOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunctionalOperation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="functionalOperationType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="functionalOperationCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="functionSpecification" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue}FunctionSpecification"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctionalOperation", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue", propOrder = {
    "functionalOperationType",
    "functionalOperationCode",
    "functionSpecification"
})
public class FunctionalOperation {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue", required = true)
    protected String functionalOperationType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue", required = true)
    protected String functionalOperationCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue", required = true)
    protected FunctionSpecification functionSpecification;

    /**
     * Gets the value of the functionalOperationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionalOperationType() {
        return functionalOperationType;
    }

    /**
     * Sets the value of the functionalOperationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionalOperationType(String value) {
        this.functionalOperationType = value;
    }

    /**
     * Gets the value of the functionalOperationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionalOperationCode() {
        return functionalOperationCode;
    }

    /**
     * Sets the value of the functionalOperationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionalOperationCode(String value) {
        this.functionalOperationCode = value;
    }

    /**
     * Gets the value of the functionSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionSpecification }
     *     
     */
    public FunctionSpecification getFunctionSpecification() {
        return functionSpecification;
    }

    /**
     * Sets the value of the functionSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionSpecification }
     *     
     */
    public void setFunctionSpecification(FunctionSpecification value) {
        this.functionSpecification = value;
    }

}
