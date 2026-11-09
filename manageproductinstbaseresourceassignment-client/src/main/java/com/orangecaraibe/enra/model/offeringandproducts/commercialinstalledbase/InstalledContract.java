
package com.orangecaraibe.enra.model.offeringandproducts.commercialinstalledbase;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstalledContract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstalledContract"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase}InstalledCompositeOffer"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="installedPublicKey" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase}InstalledPublicKey" maxOccurs="unbounded"/&gt;
 *         &lt;element name="localRIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localCommitmentExcluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstalledContract", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase", propOrder = {
    "installedPublicKey",
    "localRIO",
    "localCommitmentExcluded"
})
public class InstalledContract
    extends InstalledCompositeOffer
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase", required = true)
    protected List<InstalledPublicKey> installedPublicKey;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected String localRIO;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected Boolean localCommitmentExcluded;

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

    /**
     * Gets the value of the localRIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalRIO() {
        return localRIO;
    }

    /**
     * Sets the value of the localRIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalRIO(String value) {
        this.localRIO = value;
    }

    /**
     * Gets the value of the localCommitmentExcluded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalCommitmentExcluded() {
        return localCommitmentExcluded;
    }

    /**
     * Sets the value of the localCommitmentExcluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalCommitmentExcluded(Boolean value) {
        this.localCommitmentExcluded = value;
    }

}
