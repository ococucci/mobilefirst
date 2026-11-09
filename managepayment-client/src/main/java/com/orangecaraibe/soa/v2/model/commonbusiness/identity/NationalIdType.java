
package com.orangecaraibe.soa.v2.model.commonbusiness.identity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NationalIdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="NationalIdType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IDENTITYCARD"/&gt;
 *     &lt;enumeration value="PASSPORT"/&gt;
 *     &lt;enumeration value="NATIONALORGANISATIONIDENTIFIER"/&gt;
 *     &lt;enumeration value="SIRET"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NationalIdType", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity")
@XmlEnum
public enum NationalIdType {

    IDENTITYCARD,
    PASSPORT,
    NATIONALORGANISATIONIDENTIFIER,
    SIRET;

    public String value() {
        return name();
    }

    public static NationalIdType fromValue(String v) {
        return valueOf(v);
    }

}
