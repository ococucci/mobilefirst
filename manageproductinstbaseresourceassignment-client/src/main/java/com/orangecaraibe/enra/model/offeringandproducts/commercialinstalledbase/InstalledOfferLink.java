
package com.orangecaraibe.enra.model.offeringandproducts.commercialinstalledbase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstalledOfferLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstalledOfferLink"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="linkType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="installedOffer" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase}LinkedInstalledOffer"/&gt;
 *         &lt;element name="linkAction" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstalledOfferLink", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase", propOrder = {
    "linkType",
    "installedOffer",
    "linkAction"
})
public class InstalledOfferLink {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase", required = true)
    protected String linkType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase", required = true)
    protected LinkedInstalledOffer installedOffer;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase", required = true)
    protected String linkAction;

    /**
     * Gets the value of the linkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkType() {
        return linkType;
    }

    /**
     * Sets the value of the linkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkType(String value) {
        this.linkType = value;
    }

    /**
     * Gets the value of the installedOffer property.
     * 
     * @return
     *     possible object is
     *     {@link LinkedInstalledOffer }
     *     
     */
    public LinkedInstalledOffer getInstalledOffer() {
        return installedOffer;
    }

    /**
     * Sets the value of the installedOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkedInstalledOffer }
     *     
     */
    public void setInstalledOffer(LinkedInstalledOffer value) {
        this.installedOffer = value;
    }

    /**
     * Gets the value of the linkAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkAction() {
        return linkAction;
    }

    /**
     * Sets the value of the linkAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkAction(String value) {
        this.linkAction = value;
    }

}
