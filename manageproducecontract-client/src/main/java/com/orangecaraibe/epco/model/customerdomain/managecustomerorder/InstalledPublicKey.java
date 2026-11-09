
package com.orangecaraibe.epco.model.customerdomain.managecustomerorder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstalledPublicKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstalledPublicKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="installedPublicKeyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="functionSpecification" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}FunctionSpecification"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstalledPublicKey", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", propOrder = {
    "installedPublicKeyID",
    "functionSpecification"
})
public class InstalledPublicKey {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String installedPublicKeyID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", required = true)
    protected FunctionSpecification functionSpecification;

    /**
     * Gets the value of the installedPublicKeyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstalledPublicKeyID() {
        return installedPublicKeyID;
    }

    /**
     * Sets the value of the installedPublicKeyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstalledPublicKeyID(String value) {
        this.installedPublicKeyID = value;
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
