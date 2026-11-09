
package com.orangecaraibe.soa.v2.model.marketsales.marketingcampaigns;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.soa.v2.model.commonbusiness.party.contactmethods.ContactMethod;


/**
 * <p>Java class for MarketingCampaignContact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketingCampaignContact"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactList" type="{http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketingCampaigns}MarketingCampaignContactsList" minOccurs="0"/&gt;
 *         &lt;element name="contactMethod" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods}ContactMethod"/&gt;
 *         &lt;element name="contactStatus" type="{http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketingCampaigns}MarketingCampaignContactStatus"/&gt;
 *         &lt;element name="marketingContactID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactDetails" type="{http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketingCampaigns}MarketingCampaignContactDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketingCampaignContact", namespace = "http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketingCampaigns", propOrder = {
    "contactList",
    "contactMethod",
    "contactStatus",
    "marketingContactID",
    "contactDetails"
})
public class MarketingCampaignContact {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketingCampaigns")
    protected MarketingCampaignContactsList contactList;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketingCampaigns", required = true)
    protected ContactMethod contactMethod;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketingCampaigns", required = true)
    protected MarketingCampaignContactStatus contactStatus;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketingCampaigns")
    protected String marketingContactID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketingCampaigns", nillable = true)
    protected List<MarketingCampaignContactDetail> contactDetails;

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

    /**
     * Gets the value of the contactMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ContactMethod }
     *     
     */
    public ContactMethod getContactMethod() {
        return contactMethod;
    }

    /**
     * Sets the value of the contactMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMethod }
     *     
     */
    public void setContactMethod(ContactMethod value) {
        this.contactMethod = value;
    }

    /**
     * Gets the value of the contactStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingCampaignContactStatus }
     *     
     */
    public MarketingCampaignContactStatus getContactStatus() {
        return contactStatus;
    }

    /**
     * Sets the value of the contactStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingCampaignContactStatus }
     *     
     */
    public void setContactStatus(MarketingCampaignContactStatus value) {
        this.contactStatus = value;
    }

    /**
     * Gets the value of the marketingContactID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingContactID() {
        return marketingContactID;
    }

    /**
     * Sets the value of the marketingContactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingContactID(String value) {
        this.marketingContactID = value;
    }

    /**
     * Gets the value of the contactDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketingCampaignContactDetail }
     * 
     * 
     */
    public List<MarketingCampaignContactDetail> getContactDetails() {
        if (contactDetails == null) {
            contactDetails = new ArrayList<MarketingCampaignContactDetail>();
        }
        return this.contactDetails;
    }

}
