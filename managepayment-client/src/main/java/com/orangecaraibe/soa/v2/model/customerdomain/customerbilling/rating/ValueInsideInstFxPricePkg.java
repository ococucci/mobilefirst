
package com.orangecaraibe.soa.v2.model.customerdomain.customerbilling.rating;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.soa.v2.model.offeringandproducts.productinstalledbase.InstalledFxPricePackage;


/**
 * <p>Java class for ValueInsideInstFxPricePkg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueInsideInstFxPricePkg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="instFxPricePackageUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="instFxPricePackageUnitLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="instFxPricePackageValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="installedFxPricePackage" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase}InstalledFxPricePackage" minOccurs="0"/&gt;
 *         &lt;element name="IFPPValueConvertedInAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueInsideInstFxPricePkg", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", propOrder = {
    "instFxPricePackageUnitCode",
    "instFxPricePackageUnitLabel",
    "instFxPricePackageValue",
    "installedFxPricePackage",
    "ifppValueConvertedInAmount"
})
public class ValueInsideInstFxPricePkg {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String instFxPricePackageUnitCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String instFxPricePackageUnitLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected Double instFxPricePackageValue;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected InstalledFxPricePackage installedFxPricePackage;
    @XmlElement(name = "IFPPValueConvertedInAmount", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected Double ifppValueConvertedInAmount;

    /**
     * Gets the value of the instFxPricePackageUnitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstFxPricePackageUnitCode() {
        return instFxPricePackageUnitCode;
    }

    /**
     * Sets the value of the instFxPricePackageUnitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstFxPricePackageUnitCode(String value) {
        this.instFxPricePackageUnitCode = value;
    }

    /**
     * Gets the value of the instFxPricePackageUnitLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstFxPricePackageUnitLabel() {
        return instFxPricePackageUnitLabel;
    }

    /**
     * Sets the value of the instFxPricePackageUnitLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstFxPricePackageUnitLabel(String value) {
        this.instFxPricePackageUnitLabel = value;
    }

    /**
     * Gets the value of the instFxPricePackageValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInstFxPricePackageValue() {
        return instFxPricePackageValue;
    }

    /**
     * Sets the value of the instFxPricePackageValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInstFxPricePackageValue(Double value) {
        this.instFxPricePackageValue = value;
    }

    /**
     * Gets the value of the installedFxPricePackage property.
     * 
     * @return
     *     possible object is
     *     {@link InstalledFxPricePackage }
     *     
     */
    public InstalledFxPricePackage getInstalledFxPricePackage() {
        return installedFxPricePackage;
    }

    /**
     * Sets the value of the installedFxPricePackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstalledFxPricePackage }
     *     
     */
    public void setInstalledFxPricePackage(InstalledFxPricePackage value) {
        this.installedFxPricePackage = value;
    }

    /**
     * Gets the value of the ifppValueConvertedInAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIFPPValueConvertedInAmount() {
        return ifppValueConvertedInAmount;
    }

    /**
     * Sets the value of the ifppValueConvertedInAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIFPPValueConvertedInAmount(Double value) {
        this.ifppValueConvertedInAmount = value;
    }

}
