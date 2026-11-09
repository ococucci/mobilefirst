
package com.orangecaraibe.soa.v2.model.customerdomain.customerbilling.rating;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsumptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ConsumptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BEYOND"/&gt;
 *     &lt;enumeration value="OUTOF"/&gt;
 *     &lt;enumeration value="TOTAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConsumptionType", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Rating")
@XmlEnum
public enum ConsumptionType {

    BEYOND,
    OUTOF,
    TOTAL;

    public String value() {
        return name();
    }

    public static ConsumptionType fromValue(String v) {
        return valueOf(v);
    }

}
