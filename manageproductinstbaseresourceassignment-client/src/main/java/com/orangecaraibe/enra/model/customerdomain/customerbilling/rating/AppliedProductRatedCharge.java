
package com.orangecaraibe.enra.model.customerdomain.customerbilling.rating;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.orangecaraibe.enra.model.offeringandproducts.commercialinstalledbase.InstalledPublicKey;
import com.orangecaraibe.enra.model.offeringandproducts.productcatalogue.UsageType;
import com.orangecaraibe.enra.model.offeringandproducts.productinstalledbase.InstalledNetworkProduct;


/**
 * <p>Java class for AppliedProductRatedCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppliedProductRatedCharge"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating}AppliedCharge"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="installedPublicKey" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase}InstalledPublicKey" minOccurs="0"/&gt;
 *         &lt;element name="installedUsageProduct" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase}InstalledNetworkProduct" minOccurs="0"/&gt;
 *         &lt;element name="productUsageRecord" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating}ProductUsageRecord" minOccurs="0"/&gt;
 *         &lt;element name="totalResults" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="isLastRecordReturned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="resultFileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startRange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="endRange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ratingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="originatingFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isBilled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="quantityForRating" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating}QuantityForRating" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ratingAmount" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating}RatingAmount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="valueInsideInstFxPricePkg" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating}ValueInsideInstFxPricePkg" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hasASourceLocation" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating}HasASourceLocation" minOccurs="0"/&gt;
 *         &lt;element name="usageDetailsUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usageDetailsUnitLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usageType" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue}UsageType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="usageDetailsValueUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usageDetailsTaxIncludedAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="usageDetailsTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="taxAmountDetails" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating}TaxAmountDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="usageRatingTag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppliedProductRatedCharge", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", propOrder = {
    "to",
    "installedPublicKey",
    "installedUsageProduct",
    "productUsageRecord",
    "totalResults",
    "isLastRecordReturned",
    "resultFileID",
    "startRange",
    "endRange",
    "ratingDate",
    "startDate",
    "endDate",
    "originatingFrom",
    "isBilled",
    "quantityForRating",
    "ratingAmount",
    "valueInsideInstFxPricePkg",
    "hasASourceLocation",
    "usageDetailsUnitCode",
    "usageDetailsUnitLabel",
    "usageType",
    "usageDetailsValueUsed",
    "usageDetailsTaxIncludedAmount",
    "usageDetailsTaxAmount",
    "taxAmountDetails",
    "usageRatingTag"
})
public class AppliedProductRatedCharge
    extends AppliedCharge
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", nillable = true)
    protected List<String> to;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected InstalledPublicKey installedPublicKey;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected InstalledNetworkProduct installedUsageProduct;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected ProductUsageRecord productUsageRecord;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected Integer totalResults;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected Boolean isLastRecordReturned;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String resultFileID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected Integer startRange;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected Integer endRange;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ratingDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String originatingFrom;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected Boolean isBilled;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", required = true)
    protected List<QuantityForRating> quantityForRating;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", nillable = true)
    protected List<RatingAmount> ratingAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", nillable = true)
    protected List<ValueInsideInstFxPricePkg> valueInsideInstFxPricePkg;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected HasASourceLocation hasASourceLocation;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String usageDetailsUnitCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String usageDetailsUnitLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", nillable = true)
    protected List<UsageType> usageType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected String usageDetailsValueUsed;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected Double usageDetailsTaxIncludedAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected Double usageDetailsTaxAmount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", nillable = true)
    protected List<TaxAmountDetails> taxAmountDetails;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", required = true)
    protected String usageRatingTag;

    /**
     * Gets the value of the to property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the to property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTo() {
        if (to == null) {
            to = new ArrayList<String>();
        }
        return this.to;
    }

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
     * Gets the value of the productUsageRecord property.
     * 
     * @return
     *     possible object is
     *     {@link ProductUsageRecord }
     *     
     */
    public ProductUsageRecord getProductUsageRecord() {
        return productUsageRecord;
    }

    /**
     * Sets the value of the productUsageRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductUsageRecord }
     *     
     */
    public void setProductUsageRecord(ProductUsageRecord value) {
        this.productUsageRecord = value;
    }

    /**
     * Gets the value of the totalResults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalResults() {
        return totalResults;
    }

    /**
     * Sets the value of the totalResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalResults(Integer value) {
        this.totalResults = value;
    }

    /**
     * Gets the value of the isLastRecordReturned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLastRecordReturned() {
        return isLastRecordReturned;
    }

    /**
     * Sets the value of the isLastRecordReturned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLastRecordReturned(Boolean value) {
        this.isLastRecordReturned = value;
    }

    /**
     * Gets the value of the resultFileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultFileID() {
        return resultFileID;
    }

    /**
     * Sets the value of the resultFileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultFileID(String value) {
        this.resultFileID = value;
    }

    /**
     * Gets the value of the startRange property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartRange() {
        return startRange;
    }

    /**
     * Sets the value of the startRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartRange(Integer value) {
        this.startRange = value;
    }

    /**
     * Gets the value of the endRange property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEndRange() {
        return endRange;
    }

    /**
     * Sets the value of the endRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndRange(Integer value) {
        this.endRange = value;
    }

    /**
     * Gets the value of the ratingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRatingDate() {
        return ratingDate;
    }

    /**
     * Sets the value of the ratingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRatingDate(XMLGregorianCalendar value) {
        this.ratingDate = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the originatingFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingFrom() {
        return originatingFrom;
    }

    /**
     * Sets the value of the originatingFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingFrom(String value) {
        this.originatingFrom = value;
    }

    /**
     * Gets the value of the isBilled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBilled() {
        return isBilled;
    }

    /**
     * Sets the value of the isBilled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBilled(Boolean value) {
        this.isBilled = value;
    }

    /**
     * Gets the value of the quantityForRating property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityForRating property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityForRating().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityForRating }
     * 
     * 
     */
    public List<QuantityForRating> getQuantityForRating() {
        if (quantityForRating == null) {
            quantityForRating = new ArrayList<QuantityForRating>();
        }
        return this.quantityForRating;
    }

    /**
     * Gets the value of the ratingAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratingAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatingAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RatingAmount }
     * 
     * 
     */
    public List<RatingAmount> getRatingAmount() {
        if (ratingAmount == null) {
            ratingAmount = new ArrayList<RatingAmount>();
        }
        return this.ratingAmount;
    }

    /**
     * Gets the value of the valueInsideInstFxPricePkg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueInsideInstFxPricePkg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueInsideInstFxPricePkg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueInsideInstFxPricePkg }
     * 
     * 
     */
    public List<ValueInsideInstFxPricePkg> getValueInsideInstFxPricePkg() {
        if (valueInsideInstFxPricePkg == null) {
            valueInsideInstFxPricePkg = new ArrayList<ValueInsideInstFxPricePkg>();
        }
        return this.valueInsideInstFxPricePkg;
    }

    /**
     * Gets the value of the hasASourceLocation property.
     * 
     * @return
     *     possible object is
     *     {@link HasASourceLocation }
     *     
     */
    public HasASourceLocation getHasASourceLocation() {
        return hasASourceLocation;
    }

    /**
     * Sets the value of the hasASourceLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HasASourceLocation }
     *     
     */
    public void setHasASourceLocation(HasASourceLocation value) {
        this.hasASourceLocation = value;
    }

    /**
     * Gets the value of the usageDetailsUnitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageDetailsUnitCode() {
        return usageDetailsUnitCode;
    }

    /**
     * Sets the value of the usageDetailsUnitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageDetailsUnitCode(String value) {
        this.usageDetailsUnitCode = value;
    }

    /**
     * Gets the value of the usageDetailsUnitLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageDetailsUnitLabel() {
        return usageDetailsUnitLabel;
    }

    /**
     * Sets the value of the usageDetailsUnitLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageDetailsUnitLabel(String value) {
        this.usageDetailsUnitLabel = value;
    }

    /**
     * Gets the value of the usageType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usageType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsageType }
     * 
     * 
     */
    public List<UsageType> getUsageType() {
        if (usageType == null) {
            usageType = new ArrayList<UsageType>();
        }
        return this.usageType;
    }

    /**
     * Gets the value of the usageDetailsValueUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageDetailsValueUsed() {
        return usageDetailsValueUsed;
    }

    /**
     * Sets the value of the usageDetailsValueUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageDetailsValueUsed(String value) {
        this.usageDetailsValueUsed = value;
    }

    /**
     * Gets the value of the usageDetailsTaxIncludedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUsageDetailsTaxIncludedAmount() {
        return usageDetailsTaxIncludedAmount;
    }

    /**
     * Sets the value of the usageDetailsTaxIncludedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUsageDetailsTaxIncludedAmount(Double value) {
        this.usageDetailsTaxIncludedAmount = value;
    }

    /**
     * Gets the value of the usageDetailsTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUsageDetailsTaxAmount() {
        return usageDetailsTaxAmount;
    }

    /**
     * Sets the value of the usageDetailsTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUsageDetailsTaxAmount(Double value) {
        this.usageDetailsTaxAmount = value;
    }

    /**
     * Gets the value of the taxAmountDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxAmountDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxAmountDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxAmountDetails }
     * 
     * 
     */
    public List<TaxAmountDetails> getTaxAmountDetails() {
        if (taxAmountDetails == null) {
            taxAmountDetails = new ArrayList<TaxAmountDetails>();
        }
        return this.taxAmountDetails;
    }

    /**
     * Gets the value of the usageRatingTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageRatingTag() {
        return usageRatingTag;
    }

    /**
     * Sets the value of the usageRatingTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageRatingTag(String value) {
        this.usageRatingTag = value;
    }

}
