
package com.orangecaraibe.enra.model.commonbusiness.party.contactmethods;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormattedPostalAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormattedPostalAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addressLines" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods}AddressLine" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormattedPostalAddress", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods", propOrder = {
    "addressLines"
})
public class FormattedPostalAddress {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods", required = true)
    protected List<AddressLine> addressLines;

    /**
     * Gets the value of the addressLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressLine }
     * 
     * 
     */
    public List<AddressLine> getAddressLines() {
        if (addressLines == null) {
            addressLines = new ArrayList<AddressLine>();
        }
        return this.addressLines;
    }

}
