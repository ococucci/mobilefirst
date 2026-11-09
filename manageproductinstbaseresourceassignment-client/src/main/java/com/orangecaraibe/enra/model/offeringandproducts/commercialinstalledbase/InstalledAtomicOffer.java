
package com.orangecaraibe.enra.model.offeringandproducts.commercialinstalledbase;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.enra.model.offeringandproducts.productinstalledbase.InstalledProduct;


/**
 * <p>Java class for InstalledAtomicOffer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstalledAtomicOffer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase}InstalledOffer"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="installedProducts" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase}InstalledProduct" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="deliveryDuration" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="deliveryDurationUnit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstalledAtomicOffer", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase", propOrder = {
    "installedProducts",
    "deliveryDuration",
    "deliveryDurationUnit"
})
public class InstalledAtomicOffer
    extends InstalledOffer
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase", nillable = true)
    protected List<InstalledProduct> installedProducts;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
    protected int deliveryDuration;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase", required = true)
    protected String deliveryDurationUnit;

    /**
     * Gets the value of the installedProducts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installedProducts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstalledProducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstalledProduct }
     * 
     * 
     */
    public List<InstalledProduct> getInstalledProducts() {
        if (installedProducts == null) {
            installedProducts = new ArrayList<InstalledProduct>();
        }
        return this.installedProducts;
    }

    /**
     * Gets the value of the deliveryDuration property.
     * 
     */
    public int getDeliveryDuration() {
        return deliveryDuration;
    }

    /**
     * Sets the value of the deliveryDuration property.
     * 
     */
    public void setDeliveryDuration(int value) {
        this.deliveryDuration = value;
    }

    /**
     * Gets the value of the deliveryDurationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryDurationUnit() {
        return deliveryDurationUnit;
    }

    /**
     * Sets the value of the deliveryDurationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryDurationUnit(String value) {
        this.deliveryDurationUnit = value;
    }

}
