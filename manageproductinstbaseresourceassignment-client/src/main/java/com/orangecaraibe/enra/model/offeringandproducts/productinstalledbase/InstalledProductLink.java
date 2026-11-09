
package com.orangecaraibe.enra.model.offeringandproducts.productinstalledbase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstalledProductLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstalledProductLink"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="linkType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="linkOrientation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="installedProduct" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase}InstalledProduct"/&gt;
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
@XmlType(name = "InstalledProductLink", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase", propOrder = {
    "linkType",
    "linkOrientation",
    "installedProduct",
    "linkAction"
})
public class InstalledProductLink {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase", required = true)
    protected String linkType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase", required = true)
    protected String linkOrientation;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase", required = true)
    protected InstalledProduct installedProduct;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase", required = true)
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
     * Gets the value of the linkOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkOrientation() {
        return linkOrientation;
    }

    /**
     * Sets the value of the linkOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkOrientation(String value) {
        this.linkOrientation = value;
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
