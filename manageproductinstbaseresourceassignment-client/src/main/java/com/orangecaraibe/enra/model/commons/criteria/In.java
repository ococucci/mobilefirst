
package com.orangecaraibe.enra.model.commons.criteria;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for In complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="In"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/Commons/Criteria}PropertyRestriction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="values" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "In", namespace = "http://www.orangecaraibe.com/soa/v2/Model/Commons/Criteria", propOrder = {
    "values"
})
public class In
    extends PropertyRestriction
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/Commons/Criteria", nillable = true)
    protected List<Object> values;

    /**
     * Gets the value of the values property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the values property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getValues() {
        if (values == null) {
            values = new ArrayList<Object>();
        }
        return this.values;
    }

}
