
package com.orangecaraibe.enra.model.resourcedomain.resourcecatalogue;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.enra.model.commonbusiness.party.role.Manufacturer;


/**
 * <p>Java class for PhysicalResourceSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalResourceSpec"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue}ResourceSpecification"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="manufacturer" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role}Manufacturer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalResourceSpec", namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue", propOrder = {
    "manufacturer"
})
public class PhysicalResourceSpec
    extends ResourceSpecification
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue", required = true)
    protected Manufacturer manufacturer;

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link Manufacturer }
     *     
     */
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Manufacturer }
     *     
     */
    public void setManufacturer(Manufacturer value) {
        this.manufacturer = value;
    }

}
