
package com.orangecaraibe.epco.model.commons;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="UnitCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SECOND"/&gt;
 *     &lt;enumeration value="MINUTE"/&gt;
 *     &lt;enumeration value="HOUR"/&gt;
 *     &lt;enumeration value="DAY"/&gt;
 *     &lt;enumeration value="MESSAGE"/&gt;
 *     &lt;enumeration value="KILOBYTE"/&gt;
 *     &lt;enumeration value="BYTE"/&gt;
 *     &lt;enumeration value="MEGABYTE"/&gt;
 *     &lt;enumeration value="LOYALTYPOINT"/&gt;
 *     &lt;enumeration value="EURO"/&gt;
 *     &lt;enumeration value="MONTH"/&gt;
 *     &lt;enumeration value="YEAR"/&gt;
 *     &lt;enumeration value="ACT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnitCode", namespace = "http://www.orangecaraibe.com/soa/v2/Model/Commons")
@XmlEnum
public enum UnitCode {

    SECOND,
    MINUTE,
    HOUR,
    DAY,
    MESSAGE,
    KILOBYTE,
    BYTE,
    MEGABYTE,
    LOYALTYPOINT,
    EURO,
    MONTH,
    YEAR,
    ACT;

    public String value() {
        return name();
    }

    public static UnitCode fromValue(String v) {
        return valueOf(v);
    }

}
