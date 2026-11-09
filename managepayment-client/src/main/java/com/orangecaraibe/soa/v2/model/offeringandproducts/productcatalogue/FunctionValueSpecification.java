
package com.orangecaraibe.soa.v2.model.offeringandproducts.productcatalogue;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FunctionValueSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunctionValueSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="functionValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="functionValueLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctionValueSpecification", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue", propOrder = {
    "functionValue",
    "functionValueLabel"
})
public class FunctionValueSpecification {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue", required = true)
    protected String functionValue;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue")
    protected String functionValueLabel;

    /**
     * Gets the value of the functionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionValue() {
        return functionValue;
    }

    /**
     * Sets the value of the functionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionValue(String value) {
        this.functionValue = value;
    }

    /**
     * Gets the value of the functionValueLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionValueLabel() {
        return functionValueLabel;
    }

    /**
     * Sets the value of the functionValueLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionValueLabel(String value) {
        this.functionValueLabel = value;
    }

}
