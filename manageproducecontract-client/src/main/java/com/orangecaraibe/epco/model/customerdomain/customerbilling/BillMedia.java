
package com.orangecaraibe.epco.model.customerdomain.customerbilling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillMedia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="BillMedia"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PAPER"/&gt;
 *     &lt;enumeration value="ELECTRONIC"/&gt;
 *     &lt;enumeration value="PAPER-AND-ELECTRONIC"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="CHORUS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BillMedia", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
@XmlEnum
public enum BillMedia {

    PAPER("PAPER"),
    ELECTRONIC("ELECTRONIC"),
    @XmlEnumValue("PAPER-AND-ELECTRONIC")
    PAPER_AND_ELECTRONIC("PAPER-AND-ELECTRONIC"),
    NONE("NONE"),
    CHORUS("CHORUS");
    private final String value;

    BillMedia(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BillMedia fromValue(String v) {
        for (BillMedia c: BillMedia.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
