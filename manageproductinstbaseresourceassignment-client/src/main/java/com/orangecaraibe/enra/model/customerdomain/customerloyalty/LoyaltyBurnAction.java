
package com.orangecaraibe.enra.model.customerdomain.customerloyalty;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltyBurnAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LoyaltyBurnAction"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Cancel"/&gt;
 *     &lt;enumeration value="Debit"/&gt;
 *     &lt;enumeration value="CancelBooking"/&gt;
 *     &lt;enumeration value="Book"/&gt;
 *     &lt;enumeration value="ConfirmBooking"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LoyaltyBurnAction", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerLoyalty")
@XmlEnum
public enum LoyaltyBurnAction {

    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),
    @XmlEnumValue("Debit")
    DEBIT("Debit"),
    @XmlEnumValue("CancelBooking")
    CANCEL_BOOKING("CancelBooking"),
    @XmlEnumValue("Book")
    BOOK("Book"),
    @XmlEnumValue("ConfirmBooking")
    CONFIRM_BOOKING("ConfirmBooking");
    private final String value;

    LoyaltyBurnAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoyaltyBurnAction fromValue(String v) {
        for (LoyaltyBurnAction c: LoyaltyBurnAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
