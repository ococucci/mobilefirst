
package com.orangecaraibe.epco.model.offeringandproducts.productcatalogue;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FxPricePackageSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxPricePackageSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue}ProductSpecification"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sharedFxPricePackageUserType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userInclusiveMaxValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastUsageDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="isSharedInstFxPricePackage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isFirstUsageOption" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="firstUsageDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="isOptionalInstFxPricePackage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="usageType" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="rolloverPeriodsNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="maxRolloverValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="unitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nominalValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="reinitFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reinitDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reinitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="instFxPricePackageBalance" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="localBenefitValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="localSecondsEquivalentValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="localEurosEquivalentValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="localUnlimited" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxPricePackageSpecification", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue", propOrder = {
    "sharedFxPricePackageUserType",
    "userInclusiveMaxValue",
    "lastUsageDate",
    "isSharedInstFxPricePackage",
    "isFirstUsageOption",
    "firstUsageDate",
    "isOptionalInstFxPricePackage",
    "usageType",
    "rolloverPeriodsNumber",
    "maxRolloverValue",
    "unitCode",
    "unitLabel",
    "nominalValue",
    "reinitFrequency",
    "reinitDay",
    "reinitDate",
    "instFxPricePackageBalance",
    "localBenefitValue",
    "localSecondsEquivalentValue",
    "localEurosEquivalentValue",
    "localUnlimited"
})
public class FxPricePackageSpecification
    extends ProductSpecification
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue")
    protected String sharedFxPricePackageUserType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue")
    protected String userInclusiveMaxValue;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUsageDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue")
    protected Boolean isSharedInstFxPricePackage;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue")
    protected Boolean isFirstUsageOption;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstUsageDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue")
    protected Boolean isOptionalInstFxPricePackage;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue", nillable = true)
    protected List<Object> usageType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue")
    protected BigInteger rolloverPeriodsNumber;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue")
    protected Double maxRolloverValue;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue")
    protected String unitCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue")
    protected String unitLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue")
    protected Double nominalValue;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue")
    protected String reinitFrequency;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue")
    protected String reinitDay;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue")
    protected String reinitDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue", required = true)
    protected List<Object> instFxPricePackageBalance;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue")
    protected Double localBenefitValue;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue")
    protected Double localSecondsEquivalentValue;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue")
    protected Double localEurosEquivalentValue;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue")
    protected Boolean localUnlimited;

    /**
     * Gets the value of the sharedFxPricePackageUserType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedFxPricePackageUserType() {
        return sharedFxPricePackageUserType;
    }

    /**
     * Sets the value of the sharedFxPricePackageUserType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedFxPricePackageUserType(String value) {
        this.sharedFxPricePackageUserType = value;
    }

    /**
     * Gets the value of the userInclusiveMaxValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserInclusiveMaxValue() {
        return userInclusiveMaxValue;
    }

    /**
     * Sets the value of the userInclusiveMaxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserInclusiveMaxValue(String value) {
        this.userInclusiveMaxValue = value;
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
     * Gets the value of the isSharedInstFxPricePackage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSharedInstFxPricePackage() {
        return isSharedInstFxPricePackage;
    }

    /**
     * Sets the value of the isSharedInstFxPricePackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSharedInstFxPricePackage(Boolean value) {
        this.isSharedInstFxPricePackage = value;
    }

    /**
     * Gets the value of the isFirstUsageOption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFirstUsageOption() {
        return isFirstUsageOption;
    }

    /**
     * Sets the value of the isFirstUsageOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFirstUsageOption(Boolean value) {
        this.isFirstUsageOption = value;
    }

    /**
     * Gets the value of the firstUsageDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstUsageDate() {
        return firstUsageDate;
    }

    /**
     * Sets the value of the firstUsageDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstUsageDate(XMLGregorianCalendar value) {
        this.firstUsageDate = value;
    }

    /**
     * Gets the value of the isOptionalInstFxPricePackage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOptionalInstFxPricePackage() {
        return isOptionalInstFxPricePackage;
    }

    /**
     * Sets the value of the isOptionalInstFxPricePackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOptionalInstFxPricePackage(Boolean value) {
        this.isOptionalInstFxPricePackage = value;
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
     * {@link Object }
     * 
     * 
     */
    public List<Object> getUsageType() {
        if (usageType == null) {
            usageType = new ArrayList<Object>();
        }
        return this.usageType;
    }

    /**
     * Gets the value of the rolloverPeriodsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRolloverPeriodsNumber() {
        return rolloverPeriodsNumber;
    }

    /**
     * Sets the value of the rolloverPeriodsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRolloverPeriodsNumber(BigInteger value) {
        this.rolloverPeriodsNumber = value;
    }

    /**
     * Gets the value of the maxRolloverValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxRolloverValue() {
        return maxRolloverValue;
    }

    /**
     * Sets the value of the maxRolloverValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxRolloverValue(Double value) {
        this.maxRolloverValue = value;
    }

    /**
     * Gets the value of the unitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * Sets the value of the unitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCode(String value) {
        this.unitCode = value;
    }

    /**
     * Gets the value of the unitLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitLabel() {
        return unitLabel;
    }

    /**
     * Sets the value of the unitLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitLabel(String value) {
        this.unitLabel = value;
    }

    /**
     * Gets the value of the nominalValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNominalValue() {
        return nominalValue;
    }

    /**
     * Sets the value of the nominalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNominalValue(Double value) {
        this.nominalValue = value;
    }

    /**
     * Gets the value of the reinitFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReinitFrequency() {
        return reinitFrequency;
    }

    /**
     * Sets the value of the reinitFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReinitFrequency(String value) {
        this.reinitFrequency = value;
    }

    /**
     * Gets the value of the reinitDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReinitDay() {
        return reinitDay;
    }

    /**
     * Sets the value of the reinitDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReinitDay(String value) {
        this.reinitDay = value;
    }

    /**
     * Gets the value of the reinitDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReinitDate() {
        return reinitDate;
    }

    /**
     * Sets the value of the reinitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReinitDate(String value) {
        this.reinitDate = value;
    }

    /**
     * Gets the value of the instFxPricePackageBalance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instFxPricePackageBalance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstFxPricePackageBalance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getInstFxPricePackageBalance() {
        if (instFxPricePackageBalance == null) {
            instFxPricePackageBalance = new ArrayList<Object>();
        }
        return this.instFxPricePackageBalance;
    }

    /**
     * Gets the value of the localBenefitValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLocalBenefitValue() {
        return localBenefitValue;
    }

    /**
     * Sets the value of the localBenefitValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLocalBenefitValue(Double value) {
        this.localBenefitValue = value;
    }

    /**
     * Gets the value of the localSecondsEquivalentValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLocalSecondsEquivalentValue() {
        return localSecondsEquivalentValue;
    }

    /**
     * Sets the value of the localSecondsEquivalentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLocalSecondsEquivalentValue(Double value) {
        this.localSecondsEquivalentValue = value;
    }

    /**
     * Gets the value of the localEurosEquivalentValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLocalEurosEquivalentValue() {
        return localEurosEquivalentValue;
    }

    /**
     * Sets the value of the localEurosEquivalentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLocalEurosEquivalentValue(Double value) {
        this.localEurosEquivalentValue = value;
    }

    /**
     * Gets the value of the localUnlimited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalUnlimited() {
        return localUnlimited;
    }

    /**
     * Sets the value of the localUnlimited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalUnlimited(Boolean value) {
        this.localUnlimited = value;
    }

}
