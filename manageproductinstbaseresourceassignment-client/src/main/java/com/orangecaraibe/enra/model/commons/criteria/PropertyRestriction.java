
package com.orangecaraibe.enra.model.commons.criteria;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyRestriction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyRestriction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/Commons/Criteria}Restriction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="property" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyRestriction", namespace = "http://www.orangecaraibe.com/soa/v2/Model/Commons/Criteria", propOrder = {
    "property"
})
@XmlSeeAlso({
    Null.class,
    In.class,
    NotNull.class,
    PropertyValueRestriction.class
})
public class PropertyRestriction
    extends Restriction
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/Commons/Criteria", required = true)
    protected String property;

    /**
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperty() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperty(String value) {
        this.property = value;
    }

}
