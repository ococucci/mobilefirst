
package com.orangecaraibe.enra.model.offeringandproducts.commercialinstalledbase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.enra.model.offeringandproducts.productcatalogue.FunctionSpecification;


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
 *         &lt;element name="functionValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="functionSpecification" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue}FunctionSpecification" minOccurs="0"/&gt;
 *         &lt;element name="installedPublicKeyID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstalledPublicKey", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase", propOrder = {
    "functionValue",
    "functionSpecification",
    "installedPublicKeyID"
})
public class InstalledPublicKey {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected String functionValue;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected FunctionSpecification functionSpecification;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase", required = true)
    protected String installedPublicKeyID;

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

}
