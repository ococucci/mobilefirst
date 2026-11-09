
package com.orangecaraibe.enra.model.offeringandproducts.commercialinstalledbase;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="StatusReason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONPAYMENT"/&gt;
 *     &lt;enumeration value="ONDEMAND"/&gt;
 *     &lt;enumeration value="LOST"/&gt;
 *     &lt;enumeration value="ROBBED"/&gt;
 *     &lt;enumeration value="CEDED"/&gt;
 *     &lt;enumeration value="PORTED"/&gt;
 *     &lt;enumeration value="ACTIVATION"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatusReason", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
@XmlEnum
public enum StatusReason {

    NONPAYMENT,
    ONDEMAND,
    LOST,
    ROBBED,
    CEDED,
    PORTED,
    ACTIVATION,
    OTHER;

    public String value() {
        return name();
    }

    public static StatusReason fromValue(String v) {
        return valueOf(v);
    }

}
