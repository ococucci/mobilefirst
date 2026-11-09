
package com.orangecaraibe.enra.model.commonbusiness.party.paymentmeans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocalPayboxSystem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocalPayboxSystem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans}PaymentMean"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="providerResponse" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans}ProviderResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalPayboxSystem", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans", propOrder = {
    "providerResponse"
})
public class LocalPayboxSystem
    extends PaymentMean
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans")
    protected ProviderResponse providerResponse;

    /**
     * Gets the value of the providerResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderResponse }
     *     
     */
    public ProviderResponse getProviderResponse() {
        return providerResponse;
    }

    /**
     * Sets the value of the providerResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderResponse }
     *     
     */
    public void setProviderResponse(ProviderResponse value) {
        this.providerResponse = value;
    }

}
