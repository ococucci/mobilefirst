
package com.orangecaraibe.epco.model.commonbusiness.interaction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.epco.model.commonbusiness.agreement.Agreement;
import com.orangecaraibe.epco.model.customerdomain.customerbilling.BillingAccount;
import com.orangecaraibe.epco.model.offeringandproducts.commercialcatalogue.OfferSpecification;
import com.orangecaraibe.epco.model.offeringandproducts.commercialinstalledbase.InstalledOffer;
import com.orangecaraibe.epco.model.offeringandproducts.productinstalledbase.InstalledProduct;
import com.orangecaraibe.epco.model.resourcedomain.resourcecatalogue.ResourceSpecification;
import com.orangecaraibe.epco.model.resourcedomain.resourceinstalledbase.InstalledResource;


/**
 * <p>Java class for InteractionSubjectList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InteractionSubjectList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="installedOffer" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase}InstalledOffer"/&gt;
 *         &lt;element name="installedProduct" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase}InstalledProduct"/&gt;
 *         &lt;element name="offerSpecification" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue}OfferSpecification"/&gt;
 *         &lt;element name="billingAccount" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}BillingAccount"/&gt;
 *         &lt;element name="installedResource" type="{http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceInstalledBase}InstalledResource"/&gt;
 *         &lt;element name="resourceSpecification" type="{http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue}ResourceSpecification"/&gt;
 *         &lt;element name="agreement" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Agreement}Agreement"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InteractionSubjectList", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", propOrder = {
    "installedOffer",
    "installedProduct",
    "offerSpecification",
    "billingAccount",
    "installedResource",
    "resourceSpecification",
    "agreement"
})
public class InteractionSubjectList {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", required = true)
    protected InstalledOffer installedOffer;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", required = true)
    protected InstalledProduct installedProduct;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", required = true)
    protected OfferSpecification offerSpecification;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", required = true)
    protected BillingAccount billingAccount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", required = true)
    protected InstalledResource installedResource;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", required = true)
    protected ResourceSpecification resourceSpecification;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", required = true)
    protected Agreement agreement;

    /**
     * Gets the value of the installedOffer property.
     * 
     * @return
     *     possible object is
     *     {@link InstalledOffer }
     *     
     */
    public InstalledOffer getInstalledOffer() {
        return installedOffer;
    }

    /**
     * Sets the value of the installedOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstalledOffer }
     *     
     */
    public void setInstalledOffer(InstalledOffer value) {
        this.installedOffer = value;
    }

    /**
     * Gets the value of the installedProduct property.
     * 
     * @return
     *     possible object is
     *     {@link InstalledProduct }
     *     
     */
    public InstalledProduct getInstalledProduct() {
        return installedProduct;
    }

    /**
     * Sets the value of the installedProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstalledProduct }
     *     
     */
    public void setInstalledProduct(InstalledProduct value) {
        this.installedProduct = value;
    }

    /**
     * Gets the value of the offerSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link OfferSpecification }
     *     
     */
    public OfferSpecification getOfferSpecification() {
        return offerSpecification;
    }

    /**
     * Sets the value of the offerSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferSpecification }
     *     
     */
    public void setOfferSpecification(OfferSpecification value) {
        this.offerSpecification = value;
    }

    /**
     * Gets the value of the billingAccount property.
     * 
     * @return
     *     possible object is
     *     {@link BillingAccount }
     *     
     */
    public BillingAccount getBillingAccount() {
        return billingAccount;
    }

    /**
     * Sets the value of the billingAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingAccount }
     *     
     */
    public void setBillingAccount(BillingAccount value) {
        this.billingAccount = value;
    }

    /**
     * Gets the value of the installedResource property.
     * 
     * @return
     *     possible object is
     *     {@link InstalledResource }
     *     
     */
    public InstalledResource getInstalledResource() {
        return installedResource;
    }

    /**
     * Sets the value of the installedResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstalledResource }
     *     
     */
    public void setInstalledResource(InstalledResource value) {
        this.installedResource = value;
    }

    /**
     * Gets the value of the resourceSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceSpecification }
     *     
     */
    public ResourceSpecification getResourceSpecification() {
        return resourceSpecification;
    }

    /**
     * Sets the value of the resourceSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceSpecification }
     *     
     */
    public void setResourceSpecification(ResourceSpecification value) {
        this.resourceSpecification = value;
    }

    /**
     * Gets the value of the agreement property.
     * 
     * @return
     *     possible object is
     *     {@link Agreement }
     *     
     */
    public Agreement getAgreement() {
        return agreement;
    }

    /**
     * Sets the value of the agreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agreement }
     *     
     */
    public void setAgreement(Agreement value) {
        this.agreement = value;
    }

}
