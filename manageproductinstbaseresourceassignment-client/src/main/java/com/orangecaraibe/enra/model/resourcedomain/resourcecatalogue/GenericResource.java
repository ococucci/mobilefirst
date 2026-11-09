
package com.orangecaraibe.enra.model.resourcedomain.resourcecatalogue;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenericResource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericResource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="genericResourceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GenericResourceLabel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericResource", namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue", propOrder = {
    "genericResourceCode",
    "genericResourceLabel"
})
public class GenericResource {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue", required = true)
    protected String genericResourceCode;
    @XmlElement(name = "GenericResourceLabel", namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue", required = true)
    protected String genericResourceLabel;

    /**
     * Gets the value of the genericResourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenericResourceCode() {
        return genericResourceCode;
    }

    /**
     * Sets the value of the genericResourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenericResourceCode(String value) {
        this.genericResourceCode = value;
    }

    /**
     * Gets the value of the genericResourceLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenericResourceLabel() {
        return genericResourceLabel;
    }

    /**
     * Sets the value of the genericResourceLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenericResourceLabel(String value) {
        this.genericResourceLabel = value;
    }

}
