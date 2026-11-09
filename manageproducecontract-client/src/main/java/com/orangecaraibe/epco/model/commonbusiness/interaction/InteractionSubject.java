
package com.orangecaraibe.epco.model.commonbusiness.interaction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.epco.model.commonbusiness.agreement.Agreement;
import com.orangecaraibe.epco.model.commonbusiness.party.Party;
import com.orangecaraibe.epco.model.customerdomain.customerbilling.BillingAccount;
import com.orangecaraibe.epco.model.customerdomain.customerbilling.CustomerAccount;
import com.orangecaraibe.epco.model.customerdomain.customerbilling.payment.Payment;
import com.orangecaraibe.epco.model.customerdomain.customerbilling.payment.Refund;
import com.orangecaraibe.epco.model.customerdomain.customerloyalty.LoyaltyAccount;
import com.orangecaraibe.epco.model.customerdomain.customerorder.CustomerOrder;
import com.orangecaraibe.epco.model.customerdomain.invoicing.Invoice;
import com.orangecaraibe.epco.model.offeringandproducts.commercialcatalogue.OfferSpecification;
import com.orangecaraibe.epco.model.offeringandproducts.commercialinstalledbase.InstalledOffer;
import com.orangecaraibe.epco.model.offeringandproducts.productcatalogue.ProductSpecification;
import com.orangecaraibe.epco.model.offeringandproducts.productinstalledbase.InstalledProduct;
import com.orangecaraibe.epco.model.resourcedomain.resourcecatalogue.ResourceSpecification;
import com.orangecaraibe.epco.model.resourcedomain.resourceinstalledbase.InstalledResource;


/**
 * <p>Java class for InteractionSubject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InteractionSubject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="localParentInteractionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localParentInteractionDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localCustomerProblemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localCustomerProblemDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interactionSubjectLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interactionSubjectDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InteractionSubject", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", propOrder = {
    "localParentInteractionID",
    "localParentInteractionDetails",
    "localCustomerProblemID",
    "localCustomerProblemDetails",
    "interactionSubjectLabel",
    "interactionSubjectDescription"
})
@XmlSeeAlso({
    InstalledResource.class,
    ResourceSpecification.class,
    ProductSpecification.class,
    InstalledProduct.class,
    InstalledOffer.class,
    OfferSpecification.class,
    Invoice.class,
    CustomerOrder.class,
    LoyaltyAccount.class,
    Payment.class,
    Refund.class,
    BillingAccount.class,
    CustomerAccount.class,
    Party.class,
    InteractionResult.class,
    Agreement.class
})
public class InteractionSubject {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction")
    protected String localParentInteractionID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction")
    protected String localParentInteractionDetails;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction")
    protected String localCustomerProblemID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction")
    protected String localCustomerProblemDetails;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction")
    protected String interactionSubjectLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction")
    protected String interactionSubjectDescription;

    /**
     * Gets the value of the localParentInteractionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalParentInteractionID() {
        return localParentInteractionID;
    }

    /**
     * Sets the value of the localParentInteractionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalParentInteractionID(String value) {
        this.localParentInteractionID = value;
    }

    /**
     * Gets the value of the localParentInteractionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalParentInteractionDetails() {
        return localParentInteractionDetails;
    }

    /**
     * Sets the value of the localParentInteractionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalParentInteractionDetails(String value) {
        this.localParentInteractionDetails = value;
    }

    /**
     * Gets the value of the localCustomerProblemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalCustomerProblemID() {
        return localCustomerProblemID;
    }

    /**
     * Sets the value of the localCustomerProblemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalCustomerProblemID(String value) {
        this.localCustomerProblemID = value;
    }

    /**
     * Gets the value of the localCustomerProblemDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalCustomerProblemDetails() {
        return localCustomerProblemDetails;
    }

    /**
     * Sets the value of the localCustomerProblemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalCustomerProblemDetails(String value) {
        this.localCustomerProblemDetails = value;
    }

    /**
     * Gets the value of the interactionSubjectLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteractionSubjectLabel() {
        return interactionSubjectLabel;
    }

    /**
     * Sets the value of the interactionSubjectLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteractionSubjectLabel(String value) {
        this.interactionSubjectLabel = value;
    }

    /**
     * Gets the value of the interactionSubjectDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteractionSubjectDescription() {
        return interactionSubjectDescription;
    }

    /**
     * Sets the value of the interactionSubjectDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteractionSubjectDescription(String value) {
        this.interactionSubjectDescription = value;
    }

}
