
package com.orangecaraibe.soa.v2.model.resourcedomain.resourceinstalledbase;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstalledMobileNetwork complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstalledMobileNetwork"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publicLandMobileNetworkCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="publicLandMobileNetworkType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="installedMobileNetworkElement" type="{http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceInstalledBase}InstalledMobileNetworkElement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="publicLandMobileNetworkLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localRoamingNetwork" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstalledMobileNetwork", namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceInstalledBase", propOrder = {
    "publicLandMobileNetworkCode",
    "publicLandMobileNetworkType",
    "installedMobileNetworkElement",
    "publicLandMobileNetworkLabel",
    "localRoamingNetwork"
})
public class InstalledMobileNetwork {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceInstalledBase")
    protected String publicLandMobileNetworkCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceInstalledBase")
    protected String publicLandMobileNetworkType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceInstalledBase", nillable = true)
    protected List<InstalledMobileNetworkElement> installedMobileNetworkElement;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceInstalledBase")
    protected String publicLandMobileNetworkLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceInstalledBase")
    protected Boolean localRoamingNetwork;

    /**
     * Gets the value of the publicLandMobileNetworkCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicLandMobileNetworkCode() {
        return publicLandMobileNetworkCode;
    }

    /**
     * Sets the value of the publicLandMobileNetworkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicLandMobileNetworkCode(String value) {
        this.publicLandMobileNetworkCode = value;
    }

    /**
     * Gets the value of the publicLandMobileNetworkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicLandMobileNetworkType() {
        return publicLandMobileNetworkType;
    }

    /**
     * Sets the value of the publicLandMobileNetworkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicLandMobileNetworkType(String value) {
        this.publicLandMobileNetworkType = value;
    }

    /**
     * Gets the value of the installedMobileNetworkElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installedMobileNetworkElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstalledMobileNetworkElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstalledMobileNetworkElement }
     * 
     * 
     */
    public List<InstalledMobileNetworkElement> getInstalledMobileNetworkElement() {
        if (installedMobileNetworkElement == null) {
            installedMobileNetworkElement = new ArrayList<InstalledMobileNetworkElement>();
        }
        return this.installedMobileNetworkElement;
    }

    /**
     * Gets the value of the publicLandMobileNetworkLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicLandMobileNetworkLabel() {
        return publicLandMobileNetworkLabel;
    }

    /**
     * Sets the value of the publicLandMobileNetworkLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicLandMobileNetworkLabel(String value) {
        this.publicLandMobileNetworkLabel = value;
    }

    /**
     * Gets the value of the localRoamingNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalRoamingNetwork() {
        return localRoamingNetwork;
    }

    /**
     * Sets the value of the localRoamingNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalRoamingNetwork(Boolean value) {
        this.localRoamingNetwork = value;
    }

}
