
package com.orangecaraibe.enra.model.resourcedomain.resourcecatalogue;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceSpecificationCharacteristic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceSpecificationCharacteristic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resourceCharacteristicCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resourceCharacteristicLabel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resourceSpecificationCharacteristicValues" type="{http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue}ResourceSpecificationCharacteristicValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceSpecificationCharacteristic", namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue", propOrder = {
    "resourceCharacteristicCode",
    "resourceCharacteristicLabel",
    "resourceSpecificationCharacteristicValues"
})
public class ResourceSpecificationCharacteristic {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue", required = true)
    protected String resourceCharacteristicCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue", required = true)
    protected String resourceCharacteristicLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue", nillable = true)
    protected List<ResourceSpecificationCharacteristicValue> resourceSpecificationCharacteristicValues;

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
     * Gets the value of the resourceSpecificationCharacteristicValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceSpecificationCharacteristicValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceSpecificationCharacteristicValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceSpecificationCharacteristicValue }
     * 
     * 
     */
    public List<ResourceSpecificationCharacteristicValue> getResourceSpecificationCharacteristicValues() {
        if (resourceSpecificationCharacteristicValues == null) {
            resourceSpecificationCharacteristicValues = new ArrayList<ResourceSpecificationCharacteristicValue>();
        }
        return this.resourceSpecificationCharacteristicValues;
    }

}
