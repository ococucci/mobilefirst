
package com.orangecaraibe.epco.model.commons;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocalCriticity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LocalCriticity"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INFO"/&gt;
 *     &lt;enumeration value="WARNING"/&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *     &lt;enumeration value="CRITICAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocalCriticity", namespace = "http://www.orangecaraibe.com/soa/v2/Model/Commons")
@XmlEnum
public enum LocalCriticity {

    INFO,
    WARNING,
    ERROR,
    CRITICAL;

    public String value() {
        return name();
    }

    public static LocalCriticity fromValue(String v) {
        return valueOf(v);
    }

}
