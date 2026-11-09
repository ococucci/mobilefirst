
package com.orangecaraibe.enra.model.marketsales.marketingcampaigns;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.enra.model.commonbusiness.interaction.CompositeInteraction;


/**
 * <p>Java class for MarketingCampaign complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketingCampaign"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}CompositeInteraction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactList" type="{http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketingCampaigns}MarketingCampaignContactsList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketingCampaign", namespace = "http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketingCampaigns", propOrder = {
    "contactList"
})
public class MarketingCampaign
    extends CompositeInteraction
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketingCampaigns", required = true)
    protected MarketingCampaignContactsList contactList;

    /**
     * Gets the value of the contactList property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingCampaignContactsList }
     *     
     */
    public MarketingCampaignContactsList getContactList() {
        return contactList;
    }

    /**
     * Sets the value of the contactList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingCampaignContactsList }
     *     
     */
    public void setContactList(MarketingCampaignContactsList value) {
        this.contactList = value;
    }

}
