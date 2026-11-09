
package com.orangecaraibe.epco.model.customerdomain.customerbilling.rating;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.epco.model.commons.Image;


/**
 * <p>Java class for FindAndGetAppliedProductRatedChargeResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindAndGetAppliedProductRatedChargeResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="returnedRecordsNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="isLastRecordReturned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="startRange" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="endRange" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="resultFile" type="{http://www.orangecaraibe.com/soa/v2/Model/Commons}Image" minOccurs="0"/&gt;
 *         &lt;element name="ratedCharges" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating}AppliedProductRatedCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="totalRecords" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindAndGetAppliedProductRatedChargeResults", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", propOrder = {
    "returnedRecordsNumber",
    "isLastRecordReturned",
    "startRange",
    "endRange",
    "resultFile",
    "ratedCharges",
    "totalRecords"
})
public class FindAndGetAppliedProductRatedChargeResults {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected BigInteger returnedRecordsNumber;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected Boolean isLastRecordReturned;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected BigInteger startRange;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected BigInteger endRange;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected Image resultFile;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating", nillable = true)
    protected List<AppliedProductRatedCharge> ratedCharges;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
    protected BigInteger totalRecords;

    /**
     * Gets the value of the returnedRecordsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReturnedRecordsNumber() {
        return returnedRecordsNumber;
    }

    /**
     * Sets the value of the returnedRecordsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReturnedRecordsNumber(BigInteger value) {
        this.returnedRecordsNumber = value;
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
     * Gets the value of the startRange property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartRange() {
        return startRange;
    }

    /**
     * Sets the value of the startRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartRange(BigInteger value) {
        this.startRange = value;
    }

    /**
     * Gets the value of the endRange property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEndRange() {
        return endRange;
    }

    /**
     * Sets the value of the endRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEndRange(BigInteger value) {
        this.endRange = value;
    }

    /**
     * Gets the value of the resultFile property.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getResultFile() {
        return resultFile;
    }

    /**
     * Sets the value of the resultFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setResultFile(Image value) {
        this.resultFile = value;
    }

    /**
     * Gets the value of the ratedCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratedCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatedCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppliedProductRatedCharge }
     * 
     * 
     */
    public List<AppliedProductRatedCharge> getRatedCharges() {
        if (ratedCharges == null) {
            ratedCharges = new ArrayList<AppliedProductRatedCharge>();
        }
        return this.ratedCharges;
    }

    /**
     * Gets the value of the totalRecords property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalRecords() {
        return totalRecords;
    }

    /**
     * Sets the value of the totalRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalRecords(BigInteger value) {
        this.totalRecords = value;
    }

}
