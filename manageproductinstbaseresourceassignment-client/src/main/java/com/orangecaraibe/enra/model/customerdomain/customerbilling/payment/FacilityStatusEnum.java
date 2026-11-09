
package com.orangecaraibe.enra.model.customerdomain.customerbilling.payment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FacilityStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FacilityStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="VALIDATED"/&gt;
 *     &lt;enumeration value="WAITING_VALIDATION"/&gt;
 *     &lt;enumeration value="CLOSED"/&gt;
 *     &lt;enumeration value="CANCELLED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FacilityStatusEnum", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
@XmlEnum
public enum FacilityStatusEnum {

    VALIDATED,
    WAITING_VALIDATION,
    CLOSED,
    CANCELLED;

    public String value() {
        return name();
    }

    public static FacilityStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
