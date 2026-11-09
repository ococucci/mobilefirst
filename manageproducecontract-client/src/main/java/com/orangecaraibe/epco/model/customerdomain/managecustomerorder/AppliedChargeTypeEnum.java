
package com.orangecaraibe.epco.model.customerdomain.managecustomerorder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppliedChargeTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AppliedChargeTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="usage charge"/&gt;
 *     &lt;enumeration value="offer charge"/&gt;
 *     &lt;enumeration value="commercial operation charge"/&gt;
 *     &lt;enumeration value="all charges"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AppliedChargeTypeEnum", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
@XmlEnum
public enum AppliedChargeTypeEnum {

    @XmlEnumValue("usage charge")
    USAGE_CHARGE("usage charge"),
    @XmlEnumValue("offer charge")
    OFFER_CHARGE("offer charge"),
    @XmlEnumValue("commercial operation charge")
    COMMERCIAL_OPERATION_CHARGE("commercial operation charge"),
    @XmlEnumValue("all charges")
    ALL_CHARGES("all charges");
    private final String value;

    AppliedChargeTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AppliedChargeTypeEnum fromValue(String v) {
        for (AppliedChargeTypeEnum c: AppliedChargeTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
