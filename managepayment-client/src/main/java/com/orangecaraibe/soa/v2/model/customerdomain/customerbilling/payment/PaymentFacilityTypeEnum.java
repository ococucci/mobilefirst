
package com.orangecaraibe.soa.v2.model.customerdomain.customerbilling.payment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentFacilityTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PaymentFacilityTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PAYMENT_SCHEDULE"/&gt;
 *     &lt;enumeration value="PAYMENT_EXTENSION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentFacilityTypeEnum", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
@XmlEnum
public enum PaymentFacilityTypeEnum {

    PAYMENT_SCHEDULE,
    PAYMENT_EXTENSION;

    public String value() {
        return name();
    }

    public static PaymentFacilityTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
