
package com.orangecaraibe.soa.v2.model.customerdomain.customerbilling.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocalRefundFamily complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocalRefundFamily"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="familyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="familyLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocalLedgerSegment" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment}LocalLedgerSegment" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalRefundFamily", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment", propOrder = {
    "familyID",
    "familyLabel",
    "localLedgerSegment"
})
public class LocalRefundFamily {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected String familyID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected String familyLabel;
    @XmlElement(name = "LocalLedgerSegment", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected LocalLedgerSegment localLedgerSegment;

    /**
     * Gets the value of the familyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyID() {
        return familyID;
    }

    /**
     * Sets the value of the familyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyID(String value) {
        this.familyID = value;
    }

    /**
     * Gets the value of the familyLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyLabel() {
        return familyLabel;
    }

    /**
     * Sets the value of the familyLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyLabel(String value) {
        this.familyLabel = value;
    }

    /**
     * Gets the value of the localLedgerSegment property.
     * 
     * @return
     *     possible object is
     *     {@link LocalLedgerSegment }
     *     
     */
    public LocalLedgerSegment getLocalLedgerSegment() {
        return localLedgerSegment;
    }

    /**
     * Sets the value of the localLedgerSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalLedgerSegment }
     *     
     */
    public void setLocalLedgerSegment(LocalLedgerSegment value) {
        this.localLedgerSegment = value;
    }

}
