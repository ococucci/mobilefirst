
package com.orangecaraibe.enra.model.commonbusiness.party;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocalScoringCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LocalScoringCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GREEN"/&gt;
 *     &lt;enumeration value="RED"/&gt;
 *     &lt;enumeration value="BLACK"/&gt;
 *     &lt;enumeration value="WHITE"/&gt;
 *     &lt;enumeration value="ORANGE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocalScoringCode", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
@XmlEnum
public enum LocalScoringCode {

    GREEN,
    RED,
    BLACK,
    WHITE,
    ORANGE;

    public String value() {
        return name();
    }

    public static LocalScoringCode fromValue(String v) {
        return valueOf(v);
    }

}
