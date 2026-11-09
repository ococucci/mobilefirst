
package com.orangecaraibe.epco.model.customerdomain.managecustomerorder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhoneNumberType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PhoneNumberType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HOME"/&gt;
 *     &lt;enumeration value="MOBILE"/&gt;
 *     &lt;enumeration value="OFFICE"/&gt;
 *     &lt;enumeration value="FAX"/&gt;
 *     &lt;enumeration value="PHONE1"/&gt;
 *     &lt;enumeration value="PHONE2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PhoneNumberType", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
@XmlEnum
public enum PhoneNumberType {

    HOME("HOME"),
    MOBILE("MOBILE"),
    OFFICE("OFFICE"),
    FAX("FAX"),
    @XmlEnumValue("PHONE1")
    PHONE_1("PHONE1"),
    @XmlEnumValue("PHONE2")
    PHONE_2("PHONE2");
    private final String value;

    PhoneNumberType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PhoneNumberType fromValue(String v) {
        for (PhoneNumberType c: PhoneNumberType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
