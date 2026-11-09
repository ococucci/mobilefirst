
package com.orangecaraibe.enra.model.offeringandproducts.productcatalogue;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.enra.model.commonbusiness.interaction.InteractionSubject;
import com.orangecaraibe.enra.model.offeringandproducts.commercialcatalogue.OfferSpecification;
import com.orangecaraibe.enra.model.resourcedomain.resourcecatalogue.ResourceSpecification;


/**
 * <p>Java class for ProductSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}InteractionSubject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productSpecificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productSpecificationLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="functionalOperation" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue}FunctionalOperation"/&gt;
 *         &lt;element name="functionSpecifications" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue}FunctionSpecification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="offerSpecification" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue}OfferSpecification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="resourceSpecifications" type="{http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue}ResourceSpecification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="genericProduct" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue}GenericProduct" minOccurs="0"/&gt;
 *         &lt;element name="productSpecificationType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productImages" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue}ProductImage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSpecification", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue", propOrder = {
    "productSpecificationCode",
    "productSpecificationLabel",
    "functionalOperation",
    "functionSpecifications",
    "offerSpecification",
    "resourceSpecifications",
    "genericProduct",
    "productSpecificationType",
    "productImages"
})
@XmlSeeAlso({
    FxPricePackageSpecification.class,
    NetworkProductSpec.class,
    LoyaltyProductSpecification.class
})
public class ProductSpecification
    extends InteractionSubject
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue")
    protected String productSpecificationCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue")
    protected String productSpecificationLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue", required = true)
    protected FunctionalOperation functionalOperation;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue", nillable = true)
    protected List<FunctionSpecification> functionSpecifications;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue", nillable = true)
    protected List<OfferSpecification> offerSpecification;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue", nillable = true)
    protected List<ResourceSpecification> resourceSpecifications;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue")
    protected GenericProduct genericProduct;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue", required = true)
    protected String productSpecificationType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue", nillable = true)
    protected List<ProductImage> productImages;

    /**
     * Gets the value of the productSpecificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSpecificationCode() {
        return productSpecificationCode;
    }

    /**
     * Sets the value of the productSpecificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSpecificationCode(String value) {
        this.productSpecificationCode = value;
    }

    /**
     * Gets the value of the productSpecificationLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSpecificationLabel() {
        return productSpecificationLabel;
    }

    /**
     * Sets the value of the productSpecificationLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSpecificationLabel(String value) {
        this.productSpecificationLabel = value;
    }

    /**
     * Gets the value of the functionalOperation property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionalOperation }
     *     
     */
    public FunctionalOperation getFunctionalOperation() {
        return functionalOperation;
    }

    /**
     * Sets the value of the functionalOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionalOperation }
     *     
     */
    public void setFunctionalOperation(FunctionalOperation value) {
        this.functionalOperation = value;
    }

    /**
     * Gets the value of the functionSpecifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the functionSpecifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunctionSpecifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FunctionSpecification }
     * 
     * 
     */
    public List<FunctionSpecification> getFunctionSpecifications() {
        if (functionSpecifications == null) {
            functionSpecifications = new ArrayList<FunctionSpecification>();
        }
        return this.functionSpecifications;
    }

    /**
     * Gets the value of the offerSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferSpecification }
     * 
     * 
     */
    public List<OfferSpecification> getOfferSpecification() {
        if (offerSpecification == null) {
            offerSpecification = new ArrayList<OfferSpecification>();
        }
        return this.offerSpecification;
    }

    /**
     * Gets the value of the resourceSpecifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceSpecifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceSpecifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceSpecification }
     * 
     * 
     */
    public List<ResourceSpecification> getResourceSpecifications() {
        if (resourceSpecifications == null) {
            resourceSpecifications = new ArrayList<ResourceSpecification>();
        }
        return this.resourceSpecifications;
    }

    /**
     * Gets the value of the genericProduct property.
     * 
     * @return
     *     possible object is
     *     {@link GenericProduct }
     *     
     */
    public GenericProduct getGenericProduct() {
        return genericProduct;
    }

    /**
     * Sets the value of the genericProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericProduct }
     *     
     */
    public void setGenericProduct(GenericProduct value) {
        this.genericProduct = value;
    }

    /**
     * Gets the value of the productSpecificationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSpecificationType() {
        return productSpecificationType;
    }

    /**
     * Sets the value of the productSpecificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSpecificationType(String value) {
        this.productSpecificationType = value;
    }

    /**
     * Gets the value of the productImages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productImages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductImages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductImage }
     * 
     * 
     */
    public List<ProductImage> getProductImages() {
        if (productImages == null) {
            productImages = new ArrayList<ProductImage>();
        }
        return this.productImages;
    }

}
