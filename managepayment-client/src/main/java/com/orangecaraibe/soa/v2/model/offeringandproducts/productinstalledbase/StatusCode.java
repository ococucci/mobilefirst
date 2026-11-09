
package com.orangecaraibe.soa.v2.model.offeringandproducts.productinstalledbase;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="StatusCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="REMOVED"/&gt;
 *     &lt;enumeration value="INORDER"/&gt;
 *     &lt;enumeration value="SUSPENDED"/&gt;
 *     &lt;enumeration value="INITIALISED"/&gt;
 *     &lt;enumeration value="BLOCKED"/&gt;
 *     &lt;enumeration value="DEGRADED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatusCode", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase")
@XmlEnum
public enum StatusCode {

    REMOVED,
    INORDER,
    SUSPENDED,
    INITIALISED,
    BLOCKED,
    DEGRADED;

    public String value() {
        return name();
    }

    public static StatusCode fromValue(String v) {
        return valueOf(v);
    }

}
