
package com.orangecaraibe.enra.interfaces.manageproductinstbaseresourceassignment.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.enra.model.offeringandproducts.productinstalledbase.InstalledPublicKey;


/**
 * <p>Java class for FindAndGetInstalledPublicKeyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindAndGetInstalledPublicKeyResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="installedPublicKey" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase}InstalledPublicKey" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindAndGetInstalledPublicKeyResponse", namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageProductInstBaseResourceAssignment/Schemas", propOrder = {
    "installedPublicKey"
})
public class FindAndGetInstalledPublicKeyResponse {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageProductInstBaseResourceAssignment/Schemas", nillable = true)
    protected List<InstalledPublicKey> installedPublicKey;

    /**
     * Gets the value of the installedPublicKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installedPublicKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstalledPublicKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstalledPublicKey }
     * 
     * 
     */
    public List<InstalledPublicKey> getInstalledPublicKey() {
        if (installedPublicKey == null) {
            installedPublicKey = new ArrayList<InstalledPublicKey>();
        }
        return this.installedPublicKey;
    }

}
