
package com.orangecaraibe.soa.v2.model.customerdomain.customerbilling.rating;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.orangecaraibe.soa.v2.model.offeringandproducts.productinstalledbase.InstalledNetworkProduct;


/**
 * <p>Java class for InstUsageProductConsumption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstUsageProductConsumption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consumptionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastUsageDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="totalTaxIncludedAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="taxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="instUsageProductConsDetails" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating}InstUsageProductConsDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="installedUsageProduct" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase}InstalledNetworkProduct" minOccurs="0"/&gt;
 *         &lt;element name="totalDutyFreeAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstUsageProductConsumption", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", propOrder = {
    "consumptionType",
    "lastUsageDate",
    "totalTaxIncludedAmount",
    "taxAmount",
    "instUsageProductConsDetails",
    "installedUsageProduct",
    "totalDutyFreeAmount"
})
public class InstUsageProductConsumption {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String consumptionType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUsageDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected Double totalTaxIncludedAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected Double taxAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", nillable = true)
    protected List<InstUsageProductConsDetail> instUsageProductConsDetails;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected InstalledNetworkProduct installedUsageProduct;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected Double totalDutyFreeAmount;

    /**
     * Gets the value of the consumptionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumptionType() {
        return consumptionType;
    }

    /**
     * Sets the value of the consumptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumptionType(String value) {
        this.consumptionType = value;
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
     * Gets the value of the totalTaxIncludedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalTaxIncludedAmount() {
        return totalTaxIncludedAmount;
    }

    /**
     * Sets the value of the totalTaxIncludedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalTaxIncludedAmount(Double value) {
        this.totalTaxIncludedAmount = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxAmount(Double value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the instUsageProductConsDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instUsageProductConsDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstUsageProductConsDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstUsageProductConsDetail }
     * 
     * 
     */
    public List<InstUsageProductConsDetail> getInstUsageProductConsDetails() {
        if (instUsageProductConsDetails == null) {
            instUsageProductConsDetails = new ArrayList<InstUsageProductConsDetail>();
        }
        return this.instUsageProductConsDetails;
    }

    /**
     * Gets the value of the installedUsageProduct property.
     * 
     * @return
     *     possible object is
     *     {@link InstalledNetworkProduct }
     *     
     */
    public InstalledNetworkProduct getInstalledUsageProduct() {
        return installedUsageProduct;
    }

    /**
     * Sets the value of the installedUsageProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstalledNetworkProduct }
     *     
     */
    public void setInstalledUsageProduct(InstalledNetworkProduct value) {
        this.installedUsageProduct = value;
    }

    /**
     * Gets the value of the totalDutyFreeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalDutyFreeAmount() {
        return totalDutyFreeAmount;
    }

    /**
     * Sets the value of the totalDutyFreeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalDutyFreeAmount(Double value) {
        this.totalDutyFreeAmount = value;
    }

}
