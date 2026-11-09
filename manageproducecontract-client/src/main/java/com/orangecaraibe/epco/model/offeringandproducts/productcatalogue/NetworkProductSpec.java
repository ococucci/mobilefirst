
package com.orangecaraibe.epco.model.offeringandproducts.productcatalogue;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkProductSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkProductSpec"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue}ProductSpecification"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fxPricePackageSpecifications" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue}FxPricePackageSpecification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkProductSpec", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue", propOrder = {
    "fxPricePackageSpecifications"
})
public class NetworkProductSpec
    extends ProductSpecification
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue", nillable = true)
    protected List<FxPricePackageSpecification> fxPricePackageSpecifications;

    /**
     * Gets the value of the fxPricePackageSpecifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fxPricePackageSpecifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFxPricePackageSpecifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FxPricePackageSpecification }
     * 
     * 
     */
    public List<FxPricePackageSpecification> getFxPricePackageSpecifications() {
        if (fxPricePackageSpecifications == null) {
            fxPricePackageSpecifications = new ArrayList<FxPricePackageSpecification>();
        }
        return this.fxPricePackageSpecifications;
    }

}
