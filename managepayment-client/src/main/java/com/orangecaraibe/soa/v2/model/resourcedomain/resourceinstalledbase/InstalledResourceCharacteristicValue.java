
package com.orangecaraibe.soa.v2.model.resourcedomain.resourceinstalledbase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstalledResourceCharacteristicValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstalledResourceCharacteristicValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resourceCharacteristicCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resourceCharacteristicLabel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstalledResourceCharacteristicValue", namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceInstalledBase", propOrder = {
    "resourceCharacteristicCode",
    "resourceCharacteristicLabel",
    "value"
})
public class InstalledResourceCharacteristicValue {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceInstalledBase", required = true)
    protected String resourceCharacteristicCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceInstalledBase", required = true)
    protected String resourceCharacteristicLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceInstalledBase", required = true)
    protected String value;

    /**
     * Gets the value of the resourceCharacteristicCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceCharacteristicCode() {
        return resourceCharacteristicCode;
    }

    /**
     * Sets the value of the resourceCharacteristicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceCharacteristicCode(String value) {
        this.resourceCharacteristicCode = value;
    }

    /**
     * Gets the value of the resourceCharacteristicLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceCharacteristicLabel() {
        return resourceCharacteristicLabel;
    }

    /**
     * Sets the value of the resourceCharacteristicLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceCharacteristicLabel(String value) {
        this.resourceCharacteristicLabel = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
