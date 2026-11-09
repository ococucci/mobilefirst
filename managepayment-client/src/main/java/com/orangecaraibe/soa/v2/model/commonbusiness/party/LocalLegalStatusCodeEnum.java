
package com.orangecaraibe.soa.v2.model.commonbusiness.party;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocalLegalStatusCodeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LocalLegalStatusCodeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TUTORSHIP"/&gt;
 *     &lt;enumeration value="GUARDIANSHIP"/&gt;
 *     &lt;enumeration value="RECEIVERSHIP"/&gt;
 *     &lt;enumeration value="LIQUIDATION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocalLegalStatusCodeEnum", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
@XmlEnum
public enum LocalLegalStatusCodeEnum {

    TUTORSHIP,
    GUARDIANSHIP,
    RECEIVERSHIP,
    LIQUIDATION;

    public String value() {
        return name();
    }

    public static LocalLegalStatusCodeEnum fromValue(String v) {
        return valueOf(v);
    }

}
