
package com.orangecaraibe.soa.v2.model.customerdomain.customerloyalty;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltyEarnAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LoyaltyEarnAction"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Credit"/&gt;
 *     &lt;enumeration value="Cancel"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LoyaltyEarnAction", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty")
@XmlEnum
public enum LoyaltyEarnAction {

    @XmlEnumValue("Credit")
    CREDIT("Credit"),
    @XmlEnumValue("Cancel")
    CANCEL("Cancel");
    private final String value;

    LoyaltyEarnAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoyaltyEarnAction fromValue(String v) {
        for (LoyaltyEarnAction c: LoyaltyEarnAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
