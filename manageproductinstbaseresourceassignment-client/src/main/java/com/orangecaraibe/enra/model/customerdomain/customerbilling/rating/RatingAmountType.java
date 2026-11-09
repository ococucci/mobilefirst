
package com.orangecaraibe.enra.model.customerdomain.customerbilling.rating;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RatingAmountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RatingAmountType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TOTAL"/&gt;
 *     &lt;enumeration value="BEYOND"/&gt;
 *     &lt;enumeration value="OUTOF"/&gt;
 *     &lt;enumeration value="SERVICECOST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RatingAmountType", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
@XmlEnum
public enum RatingAmountType {

    TOTAL,
    BEYOND,
    OUTOF,
    SERVICECOST;

    public String value() {
        return name();
    }

    public static RatingAmountType fromValue(String v) {
        return valueOf(v);
    }

}
