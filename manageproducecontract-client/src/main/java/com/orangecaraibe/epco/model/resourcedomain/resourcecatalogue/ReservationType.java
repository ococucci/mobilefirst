
package com.orangecaraibe.epco.model.resourcedomain.resourcecatalogue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReservationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ReservationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RESERVED"/&gt;
 *     &lt;enumeration value="PAID"/&gt;
 *     &lt;enumeration value="CANCELED"/&gt;
 *     &lt;enumeration value="PRERESERVED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReservationType", namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue")
@XmlEnum
public enum ReservationType {

    RESERVED,
    PAID,
    CANCELED,
    PRERESERVED;

    public String value() {
        return name();
    }

    public static ReservationType fromValue(String v) {
        return valueOf(v);
    }

}
