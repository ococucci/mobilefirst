
package com.orangecaraibe.enra.model.offeringandproducts.commercialinstalledbase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkedInstalledOffer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkedInstalledOffer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="installedOfferID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="installedOfferTemporaryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkedInstalledOffer", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase", propOrder = {
    "installedOfferID",
    "installedOfferTemporaryID"
})
public class LinkedInstalledOffer {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected String installedOfferID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected String installedOfferTemporaryID;

    /**
     * Gets the value of the installedOfferID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstalledOfferID() {
        return installedOfferID;
    }

    /**
     * Sets the value of the installedOfferID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstalledOfferID(String value) {
        this.installedOfferID = value;
    }

    /**
     * Gets the value of the installedOfferTemporaryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstalledOfferTemporaryID() {
        return installedOfferTemporaryID;
    }

    /**
     * Sets the value of the installedOfferTemporaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstalledOfferTemporaryID(String value) {
        this.installedOfferTemporaryID = value;
    }

}
