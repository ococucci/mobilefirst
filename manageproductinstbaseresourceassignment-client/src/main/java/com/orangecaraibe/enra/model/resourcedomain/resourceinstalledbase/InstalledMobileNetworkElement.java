
package com.orangecaraibe.enra.model.resourcedomain.resourceinstalledbase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstalledMobileNetworkElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstalledMobileNetworkElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="installedResourceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="installedResourceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstalledMobileNetworkElement", namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceInstalledBase", propOrder = {
    "installedResourceID",
    "installedResourceType"
})
public class InstalledMobileNetworkElement {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceInstalledBase")
    protected String installedResourceID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceInstalledBase")
    protected String installedResourceType;

    /**
     * Gets the value of the installedResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstalledResourceID() {
        return installedResourceID;
    }

    /**
     * Sets the value of the installedResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstalledResourceID(String value) {
        this.installedResourceID = value;
    }

    /**
     * Gets the value of the installedResourceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstalledResourceType() {
        return installedResourceType;
    }

    /**
     * Sets the value of the installedResourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstalledResourceType(String value) {
        this.installedResourceType = value;
    }

}
