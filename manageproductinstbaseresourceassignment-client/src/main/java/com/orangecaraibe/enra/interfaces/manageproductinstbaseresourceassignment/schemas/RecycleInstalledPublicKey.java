
package com.orangecaraibe.enra.interfaces.manageproductinstbaseresourceassignment.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.enra.model.offeringandproducts.productinstalledbase.InstalledPublicKey;


/**
 * <p>Java class for RecycleInstalledPublicKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecycleInstalledPublicKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="installedPublicKey" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase}InstalledPublicKey"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecycleInstalledPublicKey", namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageProductInstBaseResourceAssignment/Schemas", propOrder = {
    "installedPublicKey"
})
public class RecycleInstalledPublicKey {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageProductInstBaseResourceAssignment/Schemas", required = true)
    protected InstalledPublicKey installedPublicKey;

    /**
     * Gets the value of the installedPublicKey property.
     * 
     * @return
     *     possible object is
     *     {@link InstalledPublicKey }
     *     
     */
    public InstalledPublicKey getInstalledPublicKey() {
        return installedPublicKey;
    }

    /**
     * Sets the value of the installedPublicKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstalledPublicKey }
     *     
     */
    public void setInstalledPublicKey(InstalledPublicKey value) {
        this.installedPublicKey = value;
    }

}
