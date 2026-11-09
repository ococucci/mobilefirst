
package com.orangecaraibe.epco.model.customerdomain.managecustomerorder;

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
 *         &lt;element name="functionSpecificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="functionSpecificationLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="functionSpecificationAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="functionValueSpecification" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}FunctionValueSpecification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctionSpecification", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", propOrder = {
    "functionSpecificationCode",
    "functionSpecificationLabel",
    "functionSpecificationAction",
    "functionValueSpecification"
})
public class FunctionSpecification {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String functionSpecificationCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String functionSpecificationLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String functionSpecificationAction;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected FunctionValueSpecification functionValueSpecification;

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
     * Gets the value of the functionValueSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionValueSpecification }
     *     
     */
    public FunctionValueSpecification getFunctionValueSpecification() {
        return functionValueSpecification;
    }

    /**
     * Sets the value of the functionValueSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionValueSpecification }
     *     
     */
    public void setFunctionValueSpecification(FunctionValueSpecification value) {
        this.functionValueSpecification = value;
    }

}
