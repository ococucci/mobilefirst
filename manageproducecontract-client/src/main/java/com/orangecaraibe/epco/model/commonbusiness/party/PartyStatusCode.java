
package com.orangecaraibe.epco.model.commonbusiness.party;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyStatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PartyStatusCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INITIALISED"/&gt;
 *     &lt;enumeration value="VALIDATED"/&gt;
 *     &lt;enumeration value="BLACKLISTED"/&gt;
 *     &lt;enumeration value="DECEASED"/&gt;
 *     &lt;enumeration value="PHONEME"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartyStatusCode", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
@XmlEnum
public enum PartyStatusCode {

    INITIALISED,
    VALIDATED,
    BLACKLISTED,
    DECEASED,
    PHONEME;

    public String value() {
        return name();
    }

    public static PartyStatusCode fromValue(String v) {
        return valueOf(v);
    }

}
