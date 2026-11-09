
package com.orangecaraibe.enra.model.offeringandproducts.commercialcatalogue;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompositeOfferSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompositeOfferSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue}OfferSpecification"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="childrenOfferSpecRoles" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue}OfferSpecRole" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeOfferSpecification", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue", propOrder = {
    "childrenOfferSpecRoles"
})
@XmlSeeAlso({
    PlaySpecification.class,
    ContractSpecification.class
})
public class CompositeOfferSpecification
    extends OfferSpecification
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue", nillable = true)
    protected List<OfferSpecRole> childrenOfferSpecRoles;

    /**
     * Gets the value of the childrenOfferSpecRoles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childrenOfferSpecRoles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildrenOfferSpecRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferSpecRole }
     * 
     * 
     */
    public List<OfferSpecRole> getChildrenOfferSpecRoles() {
        if (childrenOfferSpecRoles == null) {
            childrenOfferSpecRoles = new ArrayList<OfferSpecRole>();
        }
        return this.childrenOfferSpecRoles;
    }

}
