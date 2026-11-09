
package com.orangecaraibe.enra.model.commonbusiness.party;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocalPreventelFlagEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LocalPreventelFlagEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ABSENT"/&gt;
 *     &lt;enumeration value="APPROCHE"/&gt;
 *     &lt;enumeration value="PRESENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocalPreventelFlagEnum", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
@XmlEnum
public enum LocalPreventelFlagEnum {

    ABSENT,
    APPROCHE,
    PRESENT;

    public String value() {
        return name();
    }

    public static LocalPreventelFlagEnum fromValue(String v) {
        return valueOf(v);
    }

}
