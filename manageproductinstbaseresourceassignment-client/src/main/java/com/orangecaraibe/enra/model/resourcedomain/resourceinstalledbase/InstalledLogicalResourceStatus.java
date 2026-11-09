
package com.orangecaraibe.enra.model.resourcedomain.resourceinstalledbase;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstalledLogicalResourceStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InstalledLogicalResourceStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="INITIALIZING"/&gt;
 *     &lt;enumeration value="STARTING"/&gt;
 *     &lt;enumeration value="PAUSED"/&gt;
 *     &lt;enumeration value="STOPPING"/&gt;
 *     &lt;enumeration value="DEGRADED"/&gt;
 *     &lt;enumeration value="STRESSED"/&gt;
 *     &lt;enumeration value="PREDICTEDFAILURE"/&gt;
 *     &lt;enumeration value="ERROR-GENERAL"/&gt;
 *     &lt;enumeration value="ERROR-NONRECOVERABLE"/&gt;
 *     &lt;enumeration value="NOTINSTALLED"/&gt;
 *     &lt;enumeration value="INMAINTENANCE"/&gt;
 *     &lt;enumeration value="UNABLETOCONTACT"/&gt;
 *     &lt;enumeration value="LOSTCOMMUNICATIONS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InstalledLogicalResourceStatus", namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceInstalledBase")
@XmlEnum
public enum InstalledLogicalResourceStatus {

    UNKNOWN("UNKNOWN"),
    OK("OK"),
    INITIALIZING("INITIALIZING"),
    STARTING("STARTING"),
    PAUSED("PAUSED"),
    STOPPING("STOPPING"),
    DEGRADED("DEGRADED"),
    STRESSED("STRESSED"),
    PREDICTEDFAILURE("PREDICTEDFAILURE"),
    @XmlEnumValue("ERROR-GENERAL")
    ERROR_GENERAL("ERROR-GENERAL"),
    @XmlEnumValue("ERROR-NONRECOVERABLE")
    ERROR_NONRECOVERABLE("ERROR-NONRECOVERABLE"),
    NOTINSTALLED("NOTINSTALLED"),
    INMAINTENANCE("INMAINTENANCE"),
    UNABLETOCONTACT("UNABLETOCONTACT"),
    LOSTCOMMUNICATIONS("LOSTCOMMUNICATIONS");
    private final String value;

    InstalledLogicalResourceStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InstalledLogicalResourceStatus fromValue(String v) {
        for (InstalledLogicalResourceStatus c: InstalledLogicalResourceStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
