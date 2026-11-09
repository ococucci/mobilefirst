
package com.orangecaraibe.enra.model.resourcedomain.resourcecatalogue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UsageState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="UsageState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="NOTINSTALLED"/&gt;
 *     &lt;enumeration value="INSTALLED"/&gt;
 *     &lt;enumeration value="INACTIVE"/&gt;
 *     &lt;enumeration value="IDLE"/&gt;
 *     &lt;enumeration value="ACTIVE"/&gt;
 *     &lt;enumeration value="BUSY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UsageState", namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue")
@XmlEnum
public enum UsageState {

    UNKNOWN,
    NOTINSTALLED,
    INSTALLED,
    INACTIVE,
    IDLE,
    ACTIVE,
    BUSY;

    public String value() {
        return name();
    }

    public static UsageState fromValue(String v) {
        return valueOf(v);
    }

}
