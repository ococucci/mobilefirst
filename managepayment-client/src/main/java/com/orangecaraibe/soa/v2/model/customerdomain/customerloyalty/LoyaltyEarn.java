
package com.orangecaraibe.soa.v2.model.customerdomain.customerloyalty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltyEarn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoyaltyEarn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty}LoyaltyTransaction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="earnAction" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyEarn", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty", propOrder = {
    "earnAction"
})
public class LoyaltyEarn
    extends LoyaltyTransaction
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty", required = true)
    protected String earnAction;

    /**
     * Gets the value of the earnAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarnAction() {
        return earnAction;
    }

    /**
     * Sets the value of the earnAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarnAction(String value) {
        this.earnAction = value;
    }

}
