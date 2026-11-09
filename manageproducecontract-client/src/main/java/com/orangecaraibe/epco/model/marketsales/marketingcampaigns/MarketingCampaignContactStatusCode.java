
package com.orangecaraibe.epco.model.marketsales.marketingcampaigns;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketingCampaignContactStatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MarketingCampaignContactStatusCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="VALID"/&gt;
 *     &lt;enumeration value="CANCELED"/&gt;
 *     &lt;enumeration value="BLACKLISTED"/&gt;
 *     &lt;enumeration value="REJECTED"/&gt;
 *     &lt;enumeration value="UNCONFIRMED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MarketingCampaignContactStatusCode", namespace = "http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketingCampaigns")
@XmlEnum
public enum MarketingCampaignContactStatusCode {

    VALID,
    CANCELED,
    BLACKLISTED,
    REJECTED,
    UNCONFIRMED;

    public String value() {
        return name();
    }

    public static MarketingCampaignContactStatusCode fromValue(String v) {
        return valueOf(v);
    }

}
