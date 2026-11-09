
package com.orangecaraibe.enra.interfaces.managestock.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.enra.model.resourcedomain.resourcecatalogue.ResourceSpecification;


/**
 * <p>Java class for CheckResourceInStockResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckResourceInStockResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resources" type="{http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue}ResourceSpecification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckResourceInStockResponse", namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageStock/Schemas", propOrder = {
    "resources"
})
public class CheckResourceInStockResponse {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageStock/Schemas", nillable = true)
    protected List<ResourceSpecification> resources;

    /**
     * Gets the value of the resources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceSpecification }
     * 
     * 
     */
    public List<ResourceSpecification> getResources() {
        if (resources == null) {
            resources = new ArrayList<ResourceSpecification>();
        }
        return this.resources;
    }

}
