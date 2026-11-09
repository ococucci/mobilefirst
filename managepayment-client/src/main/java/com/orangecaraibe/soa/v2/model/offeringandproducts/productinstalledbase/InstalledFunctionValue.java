
package com.orangecaraibe.soa.v2.model.offeringandproducts.productinstalledbase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.orangecaraibe.soa.v2.model.offeringandproducts.productcatalogue.FunctionSpecification;


/**
 * <p>Java class for InstalledFunctionValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstalledFunctionValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isInstalledPublicKey" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="functionValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="functionSpecification" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue}FunctionSpecification"/&gt;
 *         &lt;element name="functionValueLabel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="localLastChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstalledFunctionValue", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase", propOrder = {
    "isInstalledPublicKey",
    "functionValue",
    "functionSpecification",
    "functionValueLabel",
    "localLastChangeDate"
})
public class InstalledFunctionValue {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase")
    protected boolean isInstalledPublicKey;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase", required = true)
    protected String functionValue;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase", required = true)
    protected FunctionSpecification functionSpecification;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase", required = true)
    protected String functionValueLabel;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar localLastChangeDate;

    /**
     * Gets the value of the isInstalledPublicKey property.
     * 
     */
    public boolean isIsInstalledPublicKey() {
        return isInstalledPublicKey;
    }

    /**
     * Sets the value of the isInstalledPublicKey property.
     * 
     */
    public void setIsInstalledPublicKey(boolean value) {
        this.isInstalledPublicKey = value;
    }

    /**
     * Gets the value of the functionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionValue() {
        return functionValue;
    }

    /**
     * Sets the value of the functionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionValue(String value) {
        this.functionValue = value;
    }

    /**
     * Gets the value of the functionSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionSpecification }
     *     
     */
    public FunctionSpecification getFunctionSpecification() {
        return functionSpecification;
    }

    /**
     * Sets the value of the functionSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionSpecification }
     *     
     */
    public void setFunctionSpecification(FunctionSpecification value) {
        this.functionSpecification = value;
    }

    /**
     * Gets the value of the functionValueLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionValueLabel() {
        return functionValueLabel;
    }

    /**
     * Sets the value of the functionValueLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionValueLabel(String value) {
        this.functionValueLabel = value;
    }

    /**
     * Gets the value of the localLastChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocalLastChangeDate() {
        return localLastChangeDate;
    }

    /**
     * Sets the value of the localLastChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocalLastChangeDate(XMLGregorianCalendar value) {
        this.localLastChangeDate = value;
    }

}
