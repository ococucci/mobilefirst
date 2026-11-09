
package com.orangecaraibe.enra.model.commons.criteria;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyValueRestriction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyValueRestriction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/Commons/Criteria}PropertyRestriction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyValueRestriction", namespace = "http://www.orangecaraibe.com/soa/v2/Model/Commons/Criteria", propOrder = {
    "value"
})
@XmlSeeAlso({
    Eq.class,
    Gt.class,
    Like.class,
    Ne.class,
    Le.class,
    Lt.class,
    Ge.class
})
public class PropertyValueRestriction
    extends PropertyRestriction
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/Commons/Criteria", required = true)
    protected Object value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setValue(Object value) {
        this.value = value;
    }

}
