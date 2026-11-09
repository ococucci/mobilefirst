
package com.orangecaraibe.epco.model.resourcedomain.resourcecatalogue;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.epco.model.commonbusiness.interaction.InteractionSubject;
import com.orangecaraibe.epco.model.offeringandproducts.productcatalogue.ProductSpecification;
import com.orangecaraibe.epco.model.resourcedomain.resourceinstalledbase.InstalledResource;


/**
 * <p>Java class for ResourceSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}InteractionSubject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resourceSpecificationCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resourceSpecificationLabel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="usageState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resourceSpecificationCharacteristics" type="{http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue}ResourceSpecificationCharacteristic" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="genericResource" type="{http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue}GenericResource"/&gt;
 *         &lt;element name="productSpecifications" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue}ProductSpecification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="stocks" type="{http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue}Stock" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="installedResources" type="{http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceInstalledBase}InstalledResource" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceSpecification", namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue", propOrder = {
    "resourceSpecificationCode",
    "resourceSpecificationLabel",
    "usageState",
    "resourceSpecificationCharacteristics",
    "genericResource",
    "productSpecifications",
    "stocks",
    "installedResources"
})
@XmlSeeAlso({
    LogicalResourceSpec.class,
    PhysicalResourceSpec.class
})
public class ResourceSpecification
    extends InteractionSubject
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue", required = true)
    protected String resourceSpecificationCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue", required = true)
    protected String resourceSpecificationLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue", required = true)
    protected String usageState;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue", nillable = true)
    protected List<ResourceSpecificationCharacteristic> resourceSpecificationCharacteristics;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue", required = true)
    protected GenericResource genericResource;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue", nillable = true)
    protected List<ProductSpecification> productSpecifications;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue", nillable = true)
    protected List<Stock> stocks;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue", nillable = true)
    protected List<InstalledResource> installedResources;

    /**
     * Gets the value of the resourceSpecificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceSpecificationCode() {
        return resourceSpecificationCode;
    }

    /**
     * Sets the value of the resourceSpecificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceSpecificationCode(String value) {
        this.resourceSpecificationCode = value;
    }

    /**
     * Gets the value of the resourceSpecificationLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceSpecificationLabel() {
        return resourceSpecificationLabel;
    }

    /**
     * Sets the value of the resourceSpecificationLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceSpecificationLabel(String value) {
        this.resourceSpecificationLabel = value;
    }

    /**
     * Gets the value of the usageState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageState() {
        return usageState;
    }

    /**
     * Sets the value of the usageState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageState(String value) {
        this.usageState = value;
    }

    /**
     * Gets the value of the resourceSpecificationCharacteristics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceSpecificationCharacteristics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceSpecificationCharacteristics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceSpecificationCharacteristic }
     * 
     * 
     */
    public List<ResourceSpecificationCharacteristic> getResourceSpecificationCharacteristics() {
        if (resourceSpecificationCharacteristics == null) {
            resourceSpecificationCharacteristics = new ArrayList<ResourceSpecificationCharacteristic>();
        }
        return this.resourceSpecificationCharacteristics;
    }

    /**
     * Gets the value of the genericResource property.
     * 
     * @return
     *     possible object is
     *     {@link GenericResource }
     *     
     */
    public GenericResource getGenericResource() {
        return genericResource;
    }

    /**
     * Sets the value of the genericResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericResource }
     *     
     */
    public void setGenericResource(GenericResource value) {
        this.genericResource = value;
    }

    /**
     * Gets the value of the productSpecifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSpecifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSpecifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductSpecification }
     * 
     * 
     */
    public List<ProductSpecification> getProductSpecifications() {
        if (productSpecifications == null) {
            productSpecifications = new ArrayList<ProductSpecification>();
        }
        return this.productSpecifications;
    }

    /**
     * Gets the value of the stocks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stocks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStocks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Stock }
     * 
     * 
     */
    public List<Stock> getStocks() {
        if (stocks == null) {
            stocks = new ArrayList<Stock>();
        }
        return this.stocks;
    }

    /**
     * Gets the value of the installedResources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installedResources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstalledResources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstalledResource }
     * 
     * 
     */
    public List<InstalledResource> getInstalledResources() {
        if (installedResources == null) {
            installedResources = new ArrayList<InstalledResource>();
        }
        return this.installedResources;
    }

}
