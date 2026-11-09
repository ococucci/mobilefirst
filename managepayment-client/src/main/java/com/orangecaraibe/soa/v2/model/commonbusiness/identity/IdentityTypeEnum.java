
package com.orangecaraibe.soa.v2.model.commonbusiness.identity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentityTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="IdentityTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MOBILE"/&gt;
 *     &lt;enumeration value="INTERNET"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IdentityTypeEnum", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity")
@XmlEnum
public enum IdentityTypeEnum {

    MOBILE,
    INTERNET;

    public String value() {
        return name();
    }

    public static IdentityTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
