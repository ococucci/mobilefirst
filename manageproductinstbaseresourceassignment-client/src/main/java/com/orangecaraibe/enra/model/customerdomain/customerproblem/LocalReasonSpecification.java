
package com.orangecaraibe.enra.model.customerdomain.customerproblem;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocalReasonSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocalReasonSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reasonSpecificationCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reasonSpecificationLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="childrenReasonSpecifcations" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem}LocalReasonSpecification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parentReasonSpecifcations" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem}LocalReasonSpecification" minOccurs="0"/&gt;
 *         &lt;element name="reasonSpecificationURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localReasonSpecificationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalReasonSpecification", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem", propOrder = {
    "reasonSpecificationCode",
    "reasonSpecificationLabel",
    "childrenReasonSpecifcations",
    "parentReasonSpecifcations",
    "reasonSpecificationURL",
    "localReasonSpecificationType"
})
public class LocalReasonSpecification {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem", required = true)
    protected String reasonSpecificationCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem")
    protected String reasonSpecificationLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem", nillable = true)
    protected List<LocalReasonSpecification> childrenReasonSpecifcations;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem")
    protected LocalReasonSpecification parentReasonSpecifcations;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem")
    protected String reasonSpecificationURL;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem")
    protected String localReasonSpecificationType;

    /**
     * Gets the value of the reasonSpecificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonSpecificationCode() {
        return reasonSpecificationCode;
    }

    /**
     * Sets the value of the reasonSpecificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonSpecificationCode(String value) {
        this.reasonSpecificationCode = value;
    }

    /**
     * Gets the value of the reasonSpecificationLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonSpecificationLabel() {
        return reasonSpecificationLabel;
    }

    /**
     * Sets the value of the reasonSpecificationLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonSpecificationLabel(String value) {
        this.reasonSpecificationLabel = value;
    }

    /**
     * Gets the value of the childrenReasonSpecifcations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childrenReasonSpecifcations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildrenReasonSpecifcations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalReasonSpecification }
     * 
     * 
     */
    public List<LocalReasonSpecification> getChildrenReasonSpecifcations() {
        if (childrenReasonSpecifcations == null) {
            childrenReasonSpecifcations = new ArrayList<LocalReasonSpecification>();
        }
        return this.childrenReasonSpecifcations;
    }

    /**
     * Gets the value of the parentReasonSpecifcations property.
     * 
     * @return
     *     possible object is
     *     {@link LocalReasonSpecification }
     *     
     */
    public LocalReasonSpecification getParentReasonSpecifcations() {
        return parentReasonSpecifcations;
    }

    /**
     * Sets the value of the parentReasonSpecifcations property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalReasonSpecification }
     *     
     */
    public void setParentReasonSpecifcations(LocalReasonSpecification value) {
        this.parentReasonSpecifcations = value;
    }

    /**
     * Gets the value of the reasonSpecificationURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonSpecificationURL() {
        return reasonSpecificationURL;
    }

    /**
     * Sets the value of the reasonSpecificationURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonSpecificationURL(String value) {
        this.reasonSpecificationURL = value;
    }

    /**
     * Gets the value of the localReasonSpecificationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalReasonSpecificationType() {
        return localReasonSpecificationType;
    }

    /**
     * Sets the value of the localReasonSpecificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalReasonSpecificationType(String value) {
        this.localReasonSpecificationType = value;
    }

}
