
package com.orangecaraibe.epco.model.offeringandproducts.commercialinstalledbase;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocalCommimentStatusCodeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LocalCommimentStatusCodeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="VALIDATED"/&gt;
 *     &lt;enumeration value="CANCELLED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocalCommimentStatusCodeEnum", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase")
@XmlEnum
public enum LocalCommimentStatusCodeEnum {

    VALIDATED,
    CANCELLED;

    public String value() {
        return name();
    }

    public static LocalCommimentStatusCodeEnum fromValue(String v) {
        return valueOf(v);
    }

}
