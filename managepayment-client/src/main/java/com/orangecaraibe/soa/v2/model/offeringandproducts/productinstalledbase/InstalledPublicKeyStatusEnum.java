
package com.orangecaraibe.soa.v2.model.offeringandproducts.productinstalledbase;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstalledPublicKeyStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InstalledPublicKeyStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RESERVED"/&gt;
 *     &lt;enumeration value="FREE"/&gt;
 *     &lt;enumeration value="ASSIGNED_TO_CUSTOMER"/&gt;
 *     &lt;enumeration value="DEACTIVE"/&gt;
 *     &lt;enumeration value="LOST"/&gt;
 *     &lt;enumeration value="PREACTIVE"/&gt;
 *     &lt;enumeration value="RECEIVED"/&gt;
 *     &lt;enumeration value="PURCHASED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InstalledPublicKeyStatusEnum", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/ProductInstalledBase")
@XmlEnum
public enum InstalledPublicKeyStatusEnum {

    RESERVED,
    FREE,
    ASSIGNED_TO_CUSTOMER,
    DEACTIVE,
    LOST,
    PREACTIVE,
    RECEIVED,
    PURCHASED;

    public String value() {
        return name();
    }

    public static InstalledPublicKeyStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
