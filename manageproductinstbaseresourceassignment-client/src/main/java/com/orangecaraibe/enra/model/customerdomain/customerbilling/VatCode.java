
package com.orangecaraibe.enra.model.customerdomain.customerbilling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VatCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="VatCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STANDARD"/&gt;
 *     &lt;enumeration value="EXONERED"/&gt;
 *     &lt;enumeration value="REDUCED"/&gt;
 *     &lt;enumeration value="LUXE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VatCode", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
@XmlEnum
public enum VatCode {

    STANDARD,
    EXONERED,
    REDUCED,
    LUXE;

    public String value() {
        return name();
    }

    public static VatCode fromValue(String v) {
        return valueOf(v);
    }

}
