
package com.orangecaraibe.soa.v2.model.resourcedomain.resourceinstalledbase;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstalledMobileNetworkType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InstalledMobileNetworkType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HOME"/&gt;
 *     &lt;enumeration value="VISITED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InstalledMobileNetworkType", namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceInstalledBase")
@XmlEnum
public enum InstalledMobileNetworkType {

    HOME,
    VISITED;

    public String value() {
        return name();
    }

    public static InstalledMobileNetworkType fromValue(String v) {
        return valueOf(v);
    }

}
