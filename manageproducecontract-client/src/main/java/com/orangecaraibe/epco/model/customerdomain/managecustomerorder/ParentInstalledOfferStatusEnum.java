
package com.orangecaraibe.epco.model.customerdomain.managecustomerorder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParentInstalledOfferStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ParentInstalledOfferStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="future"/&gt;
 *     &lt;enumeration value="current"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParentInstalledOfferStatusEnum", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
@XmlEnum
public enum ParentInstalledOfferStatusEnum {

    @XmlEnumValue("future")
    FUTURE("future"),
    @XmlEnumValue("current")
    CURRENT("current");
    private final String value;

    ParentInstalledOfferStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParentInstalledOfferStatusEnum fromValue(String v) {
        for (ParentInstalledOfferStatusEnum c: ParentInstalledOfferStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
