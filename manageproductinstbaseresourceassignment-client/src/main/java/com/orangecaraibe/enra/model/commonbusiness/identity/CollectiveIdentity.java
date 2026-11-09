
package com.orangecaraibe.enra.model.commonbusiness.identity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollectiveIdentity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollectiveIdentity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity}UserIdentity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="individualIdentities" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity}IndividualIdentity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectiveIdentity", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity", propOrder = {
    "individualIdentities"
})
public class CollectiveIdentity
    extends UserIdentity
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity", nillable = true)
    protected List<IndividualIdentity> individualIdentities;

    /**
     * Gets the value of the individualIdentities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the individualIdentities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndividualIdentities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualIdentity }
     * 
     * 
     */
    public List<IndividualIdentity> getIndividualIdentities() {
        if (individualIdentities == null) {
            individualIdentities = new ArrayList<IndividualIdentity>();
        }
        return this.individualIdentities;
    }

}
