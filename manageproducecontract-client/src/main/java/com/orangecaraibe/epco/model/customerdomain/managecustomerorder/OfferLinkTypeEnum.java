
package com.orangecaraibe.epco.model.customerdomain.managecustomerorder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfferLinkTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OfferLinkTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="brings"/&gt;
 *     &lt;enumeration value="migrateFrom"/&gt;
 *     &lt;enumeration value="migrateTo"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OfferLinkTypeEnum", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
@XmlEnum
public enum OfferLinkTypeEnum {

    @XmlEnumValue("brings")
    BRINGS("brings"),
    @XmlEnumValue("migrateFrom")
    MIGRATE_FROM("migrateFrom"),
    @XmlEnumValue("migrateTo")
    MIGRATE_TO("migrateTo");
    private final String value;

    OfferLinkTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OfferLinkTypeEnum fromValue(String v) {
        for (OfferLinkTypeEnum c: OfferLinkTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
