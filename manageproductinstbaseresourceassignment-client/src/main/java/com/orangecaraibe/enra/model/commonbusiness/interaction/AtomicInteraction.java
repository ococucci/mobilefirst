
package com.orangecaraibe.enra.model.commonbusiness.interaction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AtomicInteraction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AtomicInteraction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}Interaction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="results" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}InteractionResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AtomicInteraction", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", propOrder = {
    "results"
})
public class AtomicInteraction
    extends Interaction
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", required = true)
    protected InteractionResult results;

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link InteractionResult }
     *     
     */
    public InteractionResult getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractionResult }
     *     
     */
    public void setResults(InteractionResult value) {
        this.results = value;
    }

}
