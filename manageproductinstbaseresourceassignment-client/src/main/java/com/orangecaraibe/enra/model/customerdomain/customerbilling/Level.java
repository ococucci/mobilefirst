
package com.orangecaraibe.enra.model.customerdomain.customerbilling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Level.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="Level"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="aggregate level 1"/&gt;
 *     &lt;enumeration value="aggregate level 2"/&gt;
 *     &lt;enumeration value="unitary"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Level", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
@XmlEnum
public enum Level {

    @XmlEnumValue("aggregate level 1")
    AGGREGATE_LEVEL_1("aggregate level 1"),
    @XmlEnumValue("aggregate level 2")
    AGGREGATE_LEVEL_2("aggregate level 2"),
    @XmlEnumValue("unitary")
    UNITARY("unitary");
    private final String value;

    Level(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Level fromValue(String v) {
        for (Level c: Level.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
