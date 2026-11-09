
package com.orangecaraibe.enra.model.customerdomain.customerbilling.payment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocalRefundTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LocalRefundTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="REFUND"/&gt;
 *     &lt;enumeration value="CREDIT"/&gt;
 *     &lt;enumeration value="COMMERCIAL_GESTURE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocalRefundTypeEnum", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
@XmlEnum
public enum LocalRefundTypeEnum {

    REFUND,
    CREDIT,
    COMMERCIAL_GESTURE;

    public String value() {
        return name();
    }

    public static LocalRefundTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
