
package com.orangecaraibe.soa.v2.model.commonbusiness.party.paymentmeans;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMeanStatusReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PaymentMeanStatusReason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONPAYMENT"/&gt;
 *     &lt;enumeration value="UNCHECKED_IBAN_CONTROL_KEY"/&gt;
 *     &lt;enumeration value="UNAUTHORIZED_COUNTRY_CODE"/&gt;
 *     &lt;enumeration value="NONEXISTENT_BIC"/&gt;
 *     &lt;enumeration value="NONEXISTENT_BANK_CODE"/&gt;
 *     &lt;enumeration value="NONEXISTENT_COUNTER_CODE"/&gt;
 *     &lt;enumeration value="APPROCHING_BIC_FOUND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentMeanStatusReason", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/PaymentMeans")
@XmlEnum
public enum PaymentMeanStatusReason {

    NONPAYMENT,
    UNCHECKED_IBAN_CONTROL_KEY,
    UNAUTHORIZED_COUNTRY_CODE,
    NONEXISTENT_BIC,
    NONEXISTENT_BANK_CODE,
    NONEXISTENT_COUNTER_CODE,
    APPROCHING_BIC_FOUND;

    public String value() {
        return name();
    }

    public static PaymentMeanStatusReason fromValue(String v) {
        return valueOf(v);
    }

}
