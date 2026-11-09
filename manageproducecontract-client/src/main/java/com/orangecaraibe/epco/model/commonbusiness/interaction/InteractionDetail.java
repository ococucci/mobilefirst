
package com.orangecaraibe.epco.model.commonbusiness.interaction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InteractionDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InteractionDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="interaction" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}Interaction" minOccurs="0"/&gt;
 *         &lt;element name="interactionDetailType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="interactionSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interactionBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InteractionDetail", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", propOrder = {
    "interaction",
    "interactionDetailType",
    "interactionSubject",
    "interactionBody"
})
public class InteractionDetail {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction")
    protected Interaction interaction;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", required = true)
    protected String interactionDetailType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction")
    protected String interactionSubject;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction")
    protected String interactionBody;

    /**
     * Gets the value of the interaction property.
     * 
     * @return
     *     possible object is
     *     {@link Interaction }
     *     
     */
    public Interaction getInteraction() {
        return interaction;
    }

    /**
     * Sets the value of the interaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interaction }
     *     
     */
    public void setInteraction(Interaction value) {
        this.interaction = value;
    }

    /**
     * Gets the value of the interactionDetailType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteractionDetailType() {
        return interactionDetailType;
    }

    /**
     * Sets the value of the interactionDetailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteractionDetailType(String value) {
        this.interactionDetailType = value;
    }

    /**
     * Gets the value of the interactionSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteractionSubject() {
        return interactionSubject;
    }

    /**
     * Sets the value of the interactionSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteractionSubject(String value) {
        this.interactionSubject = value;
    }

    /**
     * Gets the value of the interactionBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteractionBody() {
        return interactionBody;
    }

    /**
     * Sets the value of the interactionBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteractionBody(String value) {
        this.interactionBody = value;
    }

}
