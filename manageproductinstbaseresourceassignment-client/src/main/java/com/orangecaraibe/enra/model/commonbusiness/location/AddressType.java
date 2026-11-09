
package com.orangecaraibe.enra.model.commonbusiness.location;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AddressType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HOME"/&gt;
 *     &lt;enumeration value="OFFICE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AddressType", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Location")
@XmlEnum
public enum AddressType {

    HOME,
    OFFICE;

    public String value() {
        return name();
    }

    public static AddressType fromValue(String v) {
        return valueOf(v);
    }

}
