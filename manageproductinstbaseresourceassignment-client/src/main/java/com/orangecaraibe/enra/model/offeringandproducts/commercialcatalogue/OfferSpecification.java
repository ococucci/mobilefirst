
package com.orangecaraibe.enra.model.offeringandproducts.commercialcatalogue;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.enra.model.commonbusiness.interaction.InteractionSubject;
import com.orangecaraibe.enra.model.commonbusiness.party.role.Operator;
import com.orangecaraibe.enra.model.customerdomain.customerbilling.Currency;
import com.orangecaraibe.enra.model.offeringandproducts.productcatalogue.GenericProduct;


/**
 * <p>Java class for OfferSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}InteractionSubject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="offerSpecificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offerSpecificationLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="genericProduct" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue}GenericProduct" minOccurs="0"/&gt;
 *         &lt;element name="operator" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role}Operator" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}Currency" minOccurs="0"/&gt;
 *         &lt;element name="commercialOperation" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue}CommercialOperation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tariffSpecifications" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue}TariffSpecification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contractualConditions" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue}ContractualConditions" maxOccurs="unbounded"/&gt;
 *         &lt;element name="commercialClassifications" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue}CommercialClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="offerImages" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue}OfferImage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="localLegacyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parentOfferSpecRoles" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue}OfferSpecRole" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="validityPeriods" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue}ValidityPeriod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferSpecification", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue", propOrder = {
    "offerSpecificationCode",
    "offerSpecificationLabel",
    "genericProduct",
    "operator",
    "currency",
    "commercialOperation",
    "tariffSpecifications",
    "contractualConditions",
    "commercialClassifications",
    "offerImages",
    "localLegacyCode",
    "parentOfferSpecRoles",
    "validityPeriods"
})
@XmlSeeAlso({
    CompositeOfferSpecification.class,
    AtomicOfferSpecification.class
})
public class OfferSpecification
    extends InteractionSubject
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue")
    protected String offerSpecificationCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue")
    protected String offerSpecificationLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue")
    protected GenericProduct genericProduct;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue")
    protected Operator operator;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue")
    protected Currency currency;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue", nillable = true)
    protected List<CommercialOperation> commercialOperation;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue", nillable = true)
    protected List<TariffSpecification> tariffSpecifications;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue", required = true)
    protected List<ContractualConditions> contractualConditions;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue", nillable = true)
    protected List<CommercialClassification> commercialClassifications;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue", nillable = true)
    protected List<OfferImage> offerImages;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue")
    protected String localLegacyCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue", nillable = true)
    protected List<OfferSpecRole> parentOfferSpecRoles;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue", nillable = true)
    protected List<ValidityPeriod> validityPeriods;

    /**
     * Gets the value of the offerSpecificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferSpecificationCode() {
        return offerSpecificationCode;
    }

    /**
     * Sets the value of the offerSpecificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferSpecificationCode(String value) {
        this.offerSpecificationCode = value;
    }

    /**
     * Gets the value of the offerSpecificationLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferSpecificationLabel() {
        return offerSpecificationLabel;
    }

    /**
     * Sets the value of the offerSpecificationLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferSpecificationLabel(String value) {
        this.offerSpecificationLabel = value;
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
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link Operator }
     *     
     */
    public Operator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operator }
     *     
     */
    public void setOperator(Operator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the commercialOperation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commercialOperation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommercialOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommercialOperation }
     * 
     * 
     */
    public List<CommercialOperation> getCommercialOperation() {
        if (commercialOperation == null) {
            commercialOperation = new ArrayList<CommercialOperation>();
        }
        return this.commercialOperation;
    }

    /**
     * Gets the value of the tariffSpecifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tariffSpecifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTariffSpecifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffSpecification }
     * 
     * 
     */
    public List<TariffSpecification> getTariffSpecifications() {
        if (tariffSpecifications == null) {
            tariffSpecifications = new ArrayList<TariffSpecification>();
        }
        return this.tariffSpecifications;
    }

    /**
     * Gets the value of the contractualConditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractualConditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractualConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractualConditions }
     * 
     * 
     */
    public List<ContractualConditions> getContractualConditions() {
        if (contractualConditions == null) {
            contractualConditions = new ArrayList<ContractualConditions>();
        }
        return this.contractualConditions;
    }

    /**
     * Gets the value of the commercialClassifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commercialClassifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommercialClassifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommercialClassification }
     * 
     * 
     */
    public List<CommercialClassification> getCommercialClassifications() {
        if (commercialClassifications == null) {
            commercialClassifications = new ArrayList<CommercialClassification>();
        }
        return this.commercialClassifications;
    }

    /**
     * Gets the value of the offerImages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerImages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferImages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferImage }
     * 
     * 
     */
    public List<OfferImage> getOfferImages() {
        if (offerImages == null) {
            offerImages = new ArrayList<OfferImage>();
        }
        return this.offerImages;
    }

    /**
     * Gets the value of the localLegacyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalLegacyCode() {
        return localLegacyCode;
    }

    /**
     * Sets the value of the localLegacyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalLegacyCode(String value) {
        this.localLegacyCode = value;
    }

    /**
     * Gets the value of the parentOfferSpecRoles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentOfferSpecRoles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentOfferSpecRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferSpecRole }
     * 
     * 
     */
    public List<OfferSpecRole> getParentOfferSpecRoles() {
        if (parentOfferSpecRoles == null) {
            parentOfferSpecRoles = new ArrayList<OfferSpecRole>();
        }
        return this.parentOfferSpecRoles;
    }

    /**
     * Gets the value of the validityPeriods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validityPeriods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidityPeriods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidityPeriod }
     * 
     * 
     */
    public List<ValidityPeriod> getValidityPeriods() {
        if (validityPeriods == null) {
            validityPeriods = new ArrayList<ValidityPeriod>();
        }
        return this.validityPeriods;
    }

}
