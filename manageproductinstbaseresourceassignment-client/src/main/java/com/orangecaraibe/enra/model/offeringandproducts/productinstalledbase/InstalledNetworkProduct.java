
package com.orangecaraibe.enra.model.offeringandproducts.productinstalledbase;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.orangecaraibe.enra.model.customerdomain.customerbilling.rating.InstUsageProductConsumption;
import com.orangecaraibe.enra.model.customerdomain.customerbilling.rating.UsageThreshold;


/**
 * <p>Java class for InstalledNetworkProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstalledNetworkProduct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase}InstalledProduct"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="installedFxPricePackages" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase}InstalledFxPricePackage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="instUsageProductConsumption" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating}InstUsageProductConsumption" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lastUsageDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="firstActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="usageThreshold" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating}UsageThreshold" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstalledNetworkProduct", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase", propOrder = {
    "installedFxPricePackages",
    "instUsageProductConsumption",
    "lastUsageDate",
    "firstActivationDate",
    "usageThreshold"
})
public class InstalledNetworkProduct
    extends InstalledProduct
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase", nillable = true)
    protected List<InstalledFxPricePackage> installedFxPricePackages;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase", nillable = true)
    protected List<InstUsageProductConsumption> instUsageProductConsumption;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUsageDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstActivationDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase", nillable = true)
    protected List<UsageThreshold> usageThreshold;

    /**
     * Gets the value of the installedFxPricePackages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installedFxPricePackages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstalledFxPricePackages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstalledFxPricePackage }
     * 
     * 
     */
    public List<InstalledFxPricePackage> getInstalledFxPricePackages() {
        if (installedFxPricePackages == null) {
            installedFxPricePackages = new ArrayList<InstalledFxPricePackage>();
        }
        return this.installedFxPricePackages;
    }

    /**
     * Gets the value of the instUsageProductConsumption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instUsageProductConsumption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstUsageProductConsumption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstUsageProductConsumption }
     * 
     * 
     */
    public List<InstUsageProductConsumption> getInstUsageProductConsumption() {
        if (instUsageProductConsumption == null) {
            instUsageProductConsumption = new ArrayList<InstUsageProductConsumption>();
        }
        return this.instUsageProductConsumption;
    }

    /**
     * Gets the value of the lastUsageDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUsageDate() {
        return lastUsageDate;
    }

    /**
     * Sets the value of the lastUsageDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUsageDate(XMLGregorianCalendar value) {
        this.lastUsageDate = value;
    }

    /**
     * Gets the value of the firstActivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstActivationDate() {
        return firstActivationDate;
    }

    /**
     * Sets the value of the firstActivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstActivationDate(XMLGregorianCalendar value) {
        this.firstActivationDate = value;
    }

    /**
     * Gets the value of the usageThreshold property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usageThreshold property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageThreshold().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsageThreshold }
     * 
     * 
     */
    public List<UsageThreshold> getUsageThreshold() {
        if (usageThreshold == null) {
            usageThreshold = new ArrayList<UsageThreshold>();
        }
        return this.usageThreshold;
    }

}
