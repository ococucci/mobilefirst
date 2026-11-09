
package com.orangecaraibe.soa.v2.model.customerdomain.customerbilling.rating;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.soa.v2.model.resourcedomain.resourceinstalledbase.InstalledMobileNetwork;


/**
 * <p>Java class for HasASourceLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HasASourceLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="installedMobileNetwork" type="{http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceInstalledBase}InstalledMobileNetwork" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HasASourceLocation", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", propOrder = {
    "installedMobileNetwork"
})
public class HasASourceLocation {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected InstalledMobileNetwork installedMobileNetwork;

    /**
     * Gets the value of the installedMobileNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link InstalledMobileNetwork }
     *     
     */
    public InstalledMobileNetwork getInstalledMobileNetwork() {
        return installedMobileNetwork;
    }

    /**
     * Sets the value of the installedMobileNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstalledMobileNetwork }
     *     
     */
    public void setInstalledMobileNetwork(InstalledMobileNetwork value) {
        this.installedMobileNetwork = value;
    }

}
