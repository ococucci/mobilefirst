
package com.orangecaraibe.epco.model.commonbusiness.party.paymentmeans;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMeanStatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PaymentMeanStatusCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INITIALISED"/&gt;
 *     &lt;enumeration value="DISABLED"/&gt;
 *     &lt;enumeration value="VALIDATED"/&gt;
 *     &lt;enumeration value="REJECTED"/&gt;
 *     &lt;enumeration value="BLACKLISTED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentMeanStatusCode", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans")
@XmlEnum
public enum PaymentMeanStatusCode {

    INITIALISED,
    DISABLED,
    VALIDATED,
    REJECTED,
    BLACKLISTED;

    public String value() {
        return name();
    }

    public static PaymentMeanStatusCode fromValue(String v) {
        return valueOf(v);
    }

}
