
package com.orangecaraibe.epco.model.marketsales.marketingcampaigns;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketingCampaignContactsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketingCampaignContactsList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactListID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contacts" type="{http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketingCampaigns}MarketingCampaignContact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="media" type="{http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketingCampaigns}Media"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketingCampaignContactsList", namespace = "http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketingCampaigns", propOrder = {
    "contactListID",
    "contacts",
    "media"
})
public class MarketingCampaignContactsList {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketingCampaigns", required = true)
    protected String contactListID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketingCampaigns", nillable = true)
    protected List<MarketingCampaignContact> contacts;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketingCampaigns", required = true)
    protected Media media;

    /**
     * Gets the value of the contactListID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactListID() {
        return contactListID;
    }

    /**
     * Sets the value of the contactListID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactListID(String value) {
        this.contactListID = value;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketingCampaignContact }
     * 
     * 
     */
    public List<MarketingCampaignContact> getContacts() {
        if (contacts == null) {
            contacts = new ArrayList<MarketingCampaignContact>();
        }
        return this.contacts;
    }

    /**
     * Gets the value of the media property.
     * 
     * @return
     *     possible object is
     *     {@link Media }
     *     
     */
    public Media getMedia() {
        return media;
    }

    /**
     * Sets the value of the media property.
     * 
     * @param value
     *     allowed object is
     *     {@link Media }
     *     
     */
    public void setMedia(Media value) {
        this.media = value;
    }

}
