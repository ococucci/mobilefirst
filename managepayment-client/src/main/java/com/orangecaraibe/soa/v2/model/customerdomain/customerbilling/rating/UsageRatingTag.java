
package com.orangecaraibe.soa.v2.model.customerdomain.customerbilling.rating;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UsageRatingTag.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="UsageRatingTag"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="USAGE"/&gt;
 *     &lt;enumeration value="INCLUDED"/&gt;
 *     &lt;enumeration value="NONINCLUDED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UsageRatingTag", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
@XmlEnum
public enum UsageRatingTag {

    USAGE,
    INCLUDED,
    NONINCLUDED;

    public String value() {
        return name();
    }

    public static UsageRatingTag fromValue(String v) {
        return valueOf(v);
    }

}
