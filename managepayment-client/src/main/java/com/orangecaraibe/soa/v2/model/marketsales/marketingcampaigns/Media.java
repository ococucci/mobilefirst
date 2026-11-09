
package com.orangecaraibe.soa.v2.model.marketsales.marketingcampaigns;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Media complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Media"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mediaCharacteristics" type="{http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketingCampaigns}MediaCharacteristic" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Media", namespace = "http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketingCampaigns", propOrder = {
    "mediaCharacteristics"
})
@XmlSeeAlso({
    TV.class,
    Email.class,
    Banner.class,
    Radio.class,
    LocalLetter.class,
    Adweb.class,
    Mms.class,
    LocalSelfcare.class,
    Phone.class,
    Sms.class,
    LocalShop.class,
    Fax.class,
    LocalSocialMedia.class
})
public class Media {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketingCampaigns", nillable = true)
    protected List<MediaCharacteristic> mediaCharacteristics;

    /**
     * Gets the value of the mediaCharacteristics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaCharacteristics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaCharacteristics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaCharacteristic }
     * 
     * 
     */
    public List<MediaCharacteristic> getMediaCharacteristics() {
        if (mediaCharacteristics == null) {
            mediaCharacteristics = new ArrayList<MediaCharacteristic>();
        }
        return this.mediaCharacteristics;
    }

}
