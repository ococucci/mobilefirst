
package com.orangecaraibe.enra.model.commonbusiness.party.contactmethods;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactMethodStatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ContactMethodStatusCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Initialised"/&gt;
 *     &lt;enumeration value="Validated"/&gt;
 *     &lt;enumeration value="Inactive"/&gt;
 *     &lt;enumeration value="Blacklisted"/&gt;
 *     &lt;enumeration value="Invalid"/&gt;
 *     &lt;enumeration value="NPAI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContactMethodStatusCode", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods")
@XmlEnum
public enum ContactMethodStatusCode {

    @XmlEnumValue("Initialised")
    INITIALISED("Initialised"),
    @XmlEnumValue("Validated")
    VALIDATED("Validated"),
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),
    @XmlEnumValue("Blacklisted")
    BLACKLISTED("Blacklisted"),
    @XmlEnumValue("Invalid")
    INVALID("Invalid"),
    NPAI("NPAI");
    private final String value;

    ContactMethodStatusCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactMethodStatusCode fromValue(String v) {
        for (ContactMethodStatusCode c: ContactMethodStatusCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
