
package com.orangecaraibe.enra.model.commons;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Periodicity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="Periodicity"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DAILY"/&gt;
 *     &lt;enumeration value="WEEKLY"/&gt;
 *     &lt;enumeration value="MONTHLY"/&gt;
 *     &lt;enumeration value="ANNUALY"/&gt;
 *     &lt;enumeration value="FORTNIGHTLY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Periodicity", namespace = "http://www.orangecaraibe.com/soa/v2/Model/Commons")
@XmlEnum
public enum Periodicity {

    DAILY,
    WEEKLY,
    MONTHLY,
    ANNUALY,
    FORTNIGHTLY;

    public String value() {
        return name();
    }

    public static Periodicity fromValue(String v) {
        return valueOf(v);
    }

}
