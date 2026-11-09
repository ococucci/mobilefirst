
package com.orangecaraibe.enra.model.customerdomain.customerbilling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DunningScenarioSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DunningScenarioSpec"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="p_dunningscenarioaction" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}DunningScenarioActionSpec" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DunningScenarioSpec", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", propOrder = {
    "pDunningscenarioaction"
})
public class DunningScenarioSpec {

    @XmlElement(name = "p_dunningscenarioaction", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling", required = true)
    protected List<DunningScenarioActionSpec> pDunningscenarioaction;

    /**
     * Gets the value of the pDunningscenarioaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pDunningscenarioaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPDunningscenarioaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DunningScenarioActionSpec }
     * 
     * 
     */
    public List<DunningScenarioActionSpec> getPDunningscenarioaction() {
        if (pDunningscenarioaction == null) {
            pDunningscenarioaction = new ArrayList<DunningScenarioActionSpec>();
        }
        return this.pDunningscenarioaction;
    }

}
