
package com.orangecaraibe.enra.model.customerdomain.customerbilling.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocalLedgerSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocalLedgerSegment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="localGLCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localGLCodeLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalLedgerSegment", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment", propOrder = {
    "localGLCode",
    "localGLCodeLabel"
})
public class LocalLedgerSegment {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected String localGLCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
    protected String localGLCodeLabel;

    /**
     * Gets the value of the localGLCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalGLCode() {
        return localGLCode;
    }

    /**
     * Sets the value of the localGLCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalGLCode(String value) {
        this.localGLCode = value;
    }

    /**
     * Gets the value of the localGLCodeLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalGLCodeLabel() {
        return localGLCodeLabel;
    }

    /**
     * Sets the value of the localGLCodeLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalGLCodeLabel(String value) {
        this.localGLCodeLabel = value;
    }

}
