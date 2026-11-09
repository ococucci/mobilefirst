
package com.orangecaraibe.soa.v2.interfaces.manageresourceinstalledbase.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.soa.v2.model.resourcedomain.resourceinstalledbase.InstalledResource;


/**
 * <p>Java class for Update complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Update"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="installedResource" type="{http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceInstalledBase}InstalledResource"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Update", namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageResourceInstalledBase/Schemas", propOrder = {
    "installedResource"
})
public class Update {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageResourceInstalledBase/Schemas", required = true)
    protected InstalledResource installedResource;

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

}
