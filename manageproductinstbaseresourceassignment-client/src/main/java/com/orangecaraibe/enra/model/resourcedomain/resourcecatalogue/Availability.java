
package com.orangecaraibe.enra.model.resourcedomain.resourcecatalogue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Availability.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="Availability"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="YES"/&gt;
 *     &lt;enumeration value="NO"/&gt;
 *     &lt;enumeration value="NOTBEFORE"/&gt;
 *     &lt;enumeration value="YESBUTLIMITED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Availability", namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue")
@XmlEnum
public enum Availability {

    YES,
    NO,
    NOTBEFORE,
    YESBUTLIMITED;

    public String value() {
        return name();
    }

    public static Availability fromValue(String v) {
        return valueOf(v);
    }

}
