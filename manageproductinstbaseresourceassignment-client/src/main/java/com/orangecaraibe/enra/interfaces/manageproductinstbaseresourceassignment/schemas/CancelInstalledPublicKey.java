
package com.orangecaraibe.enra.interfaces.manageproductinstbaseresourceassignment.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.enra.model.commonbusiness.party.role.Distributor;
import com.orangecaraibe.enra.model.offeringandproducts.productinstalledbase.InstalledPublicKey;


/**
 * <p>Java class for CancelInstalledPublicKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelInstalledPublicKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="installedPublicKey" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase}InstalledPublicKey"/&gt;
 *         &lt;element name="distributor" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role}Distributor"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelInstalledPublicKey", namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageProductInstBaseResourceAssignment/Schemas", propOrder = {
    "installedPublicKey",
    "distributor"
})
public class CancelInstalledPublicKey {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageProductInstBaseResourceAssignment/Schemas", required = true)
    protected InstalledPublicKey installedPublicKey;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageProductInstBaseResourceAssignment/Schemas", required = true)
    protected Distributor distributor;

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

    /**
     * Gets the value of the distributor property.
     * 
     * @return
     *     possible object is
     *     {@link Distributor }
     *     
     */
    public Distributor getDistributor() {
        return distributor;
    }

    /**
     * Sets the value of the distributor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distributor }
     *     
     */
    public void setDistributor(Distributor value) {
        this.distributor = value;
    }

}
