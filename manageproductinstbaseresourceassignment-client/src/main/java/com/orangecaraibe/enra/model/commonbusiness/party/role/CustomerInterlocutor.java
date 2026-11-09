
package com.orangecaraibe.enra.model.commonbusiness.party.role;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.enra.model.commonbusiness.interaction.AvailabilityRange;
import com.orangecaraibe.enra.model.commonbusiness.party.contactmethods.ContactMethod;


/**
 * <p>Java class for CustomerInterlocutor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerInterlocutor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role}PartyRole"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mayBeContactedUsing" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods}ContactMethod"/&gt;
 *         &lt;element name="availabilityRange" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}AvailabilityRange" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerInterlocutor", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role", propOrder = {
    "mayBeContactedUsing",
    "availabilityRange"
})
public class CustomerInterlocutor
    extends PartyRole
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role", required = true)
    protected ContactMethod mayBeContactedUsing;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role", nillable = true)
    protected List<AvailabilityRange> availabilityRange;

    /**
     * Gets the value of the mayBeContactedUsing property.
     * 
     * @return
     *     possible object is
     *     {@link ContactMethod }
     *     
     */
    public ContactMethod getMayBeContactedUsing() {
        return mayBeContactedUsing;
    }

    /**
     * Sets the value of the mayBeContactedUsing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMethod }
     *     
     */
    public void setMayBeContactedUsing(ContactMethod value) {
        this.mayBeContactedUsing = value;
    }

    /**
     * Gets the value of the availabilityRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availabilityRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailabilityRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AvailabilityRange }
     * 
     * 
     */
    public List<AvailabilityRange> getAvailabilityRange() {
        if (availabilityRange == null) {
            availabilityRange = new ArrayList<AvailabilityRange>();
        }
        return this.availabilityRange;
    }

}
