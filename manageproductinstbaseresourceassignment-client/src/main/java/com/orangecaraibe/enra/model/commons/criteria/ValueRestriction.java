
package com.orangecaraibe.enra.model.commons.criteria;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValueRestriction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueRestriction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/Commons/Criteria}Restriction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="left" type="{http://www.orangecaraibe.com/soa/v2/Model/Commons/Criteria}Restriction"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueRestriction", namespace = "http://www.orangecaraibe.com/soa/v2/Model/Commons/Criteria", propOrder = {
    "left"
})
@XmlSeeAlso({
    Not.class,
    ValueValueRestriction.class
})
public class ValueRestriction
    extends Restriction
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/Commons/Criteria", required = true)
    protected Restriction left;

    /**
     * Gets the value of the left property.
     * 
     * @return
     *     possible object is
     *     {@link Restriction }
     *     
     */
    public Restriction getLeft() {
        return left;
    }

    /**
     * Sets the value of the left property.
     * 
     * @param value
     *     allowed object is
     *     {@link Restriction }
     *     
     */
    public void setLeft(Restriction value) {
        this.left = value;
    }

}
