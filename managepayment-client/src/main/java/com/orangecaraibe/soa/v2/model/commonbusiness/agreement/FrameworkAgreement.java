
package com.orangecaraibe.soa.v2.model.commonbusiness.agreement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FrameworkAgreement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrameworkAgreement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Agreement}Agreement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="agreementDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agreementStatementOfIntent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agreementPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrameworkAgreement", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Agreement", propOrder = {
    "agreementDocumentNumber",
    "agreementStatementOfIntent",
    "agreementPeriod"
})
public class FrameworkAgreement
    extends Agreement
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Agreement")
    protected String agreementDocumentNumber;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Agreement")
    protected String agreementStatementOfIntent;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Agreement")
    protected String agreementPeriod;

    /**
     * Gets the value of the agreementDocumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementDocumentNumber() {
        return agreementDocumentNumber;
    }

    /**
     * Sets the value of the agreementDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementDocumentNumber(String value) {
        this.agreementDocumentNumber = value;
    }

    /**
     * Gets the value of the agreementStatementOfIntent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementStatementOfIntent() {
        return agreementStatementOfIntent;
    }

    /**
     * Sets the value of the agreementStatementOfIntent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementStatementOfIntent(String value) {
        this.agreementStatementOfIntent = value;
    }

    /**
     * Gets the value of the agreementPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementPeriod() {
        return agreementPeriod;
    }

    /**
     * Sets the value of the agreementPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementPeriod(String value) {
        this.agreementPeriod = value;
    }

}
