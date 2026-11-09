
package com.orangecaraibe.enra.model.offeringandproducts.commercialcatalogue;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.enra.model.offeringandproducts.productcatalogue.ProductSpecification;


/**
 * <p>Java class for AtomicOfferSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AtomicOfferSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue}OfferSpecification"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerMaxNumberOfOccurences" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="maxNumberOfCustomers" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="deliveryDuration" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="deliveryDurationUnit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productSpecifications" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue}ProductSpecification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AtomicOfferSpecification", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue", propOrder = {
    "customerMaxNumberOfOccurences",
    "maxNumberOfCustomers",
    "deliveryDuration",
    "deliveryDurationUnit",
    "productSpecifications"
})
public class AtomicOfferSpecification
    extends OfferSpecification
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue")
    protected int customerMaxNumberOfOccurences;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue")
    protected int maxNumberOfCustomers;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue")
    protected int deliveryDuration;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue", required = true)
    protected String deliveryDurationUnit;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue", nillable = true)
    protected List<ProductSpecification> productSpecifications;

    /**
     * Gets the value of the customerMaxNumberOfOccurences property.
     * 
     */
    public int getCustomerMaxNumberOfOccurences() {
        return customerMaxNumberOfOccurences;
    }

    /**
     * Sets the value of the customerMaxNumberOfOccurences property.
     * 
     */
    public void setCustomerMaxNumberOfOccurences(int value) {
        this.customerMaxNumberOfOccurences = value;
    }

    /**
     * Gets the value of the maxNumberOfCustomers property.
     * 
     */
    public int getMaxNumberOfCustomers() {
        return maxNumberOfCustomers;
    }

    /**
     * Sets the value of the maxNumberOfCustomers property.
     * 
     */
    public void setMaxNumberOfCustomers(int value) {
        this.maxNumberOfCustomers = value;
    }

    /**
     * Gets the value of the deliveryDuration property.
     * 
     */
    public int getDeliveryDuration() {
        return deliveryDuration;
    }

    /**
     * Sets the value of the deliveryDuration property.
     * 
     */
    public void setDeliveryDuration(int value) {
        this.deliveryDuration = value;
    }

    /**
     * Gets the value of the deliveryDurationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryDurationUnit() {
        return deliveryDurationUnit;
    }

    /**
     * Sets the value of the deliveryDurationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryDurationUnit(String value) {
        this.deliveryDurationUnit = value;
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

}
