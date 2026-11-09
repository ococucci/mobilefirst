
package com.orangecaraibe.enra.model.commonbusiness.party;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganisationClassification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganisationClassification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="organisationClassificationID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="organisationClassificationType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationClassification", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", propOrder = {
    "organisationClassificationID",
    "organisationClassificationType"
})
public class OrganisationClassification {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", required = true)
    protected String organisationClassificationID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", required = true)
    protected String organisationClassificationType;

    /**
     * Gets the value of the organisationClassificationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationClassificationID() {
        return organisationClassificationID;
    }

    /**
     * Sets the value of the organisationClassificationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationClassificationID(String value) {
        this.organisationClassificationID = value;
    }

    /**
     * Gets the value of the organisationClassificationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationClassificationType() {
        return organisationClassificationType;
    }

    /**
     * Sets the value of the organisationClassificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationClassificationType(String value) {
        this.organisationClassificationType = value;
    }

}
