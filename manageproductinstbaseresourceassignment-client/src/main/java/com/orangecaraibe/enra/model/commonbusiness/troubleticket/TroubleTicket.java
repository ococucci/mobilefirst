
package com.orangecaraibe.enra.model.commonbusiness.troubleticket;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.enra.model.commonbusiness.interaction.Interaction;
import com.orangecaraibe.enra.model.customerdomain.customerproblem.CustomerProblem;


/**
 * <p>Java class for TroubleTicket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TroubleTicket"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}Interaction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="troubleTicketID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TroubleTicket", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/TroubleTicket", propOrder = {
    "troubleTicketID"
})
@XmlSeeAlso({
    CustomerProblem.class,
    ResourceTroubleTicket.class,
    CollectiveTroubleTicket.class
})
public class TroubleTicket
    extends Interaction
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/TroubleTicket", required = true)
    protected String troubleTicketID;

    /**
     * Gets the value of the troubleTicketID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTroubleTicketID() {
        return troubleTicketID;
    }

    /**
     * Sets the value of the troubleTicketID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTroubleTicketID(String value) {
        this.troubleTicketID = value;
    }

}
