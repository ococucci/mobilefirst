
package com.orangecaraibe.epco.model.customerdomain.managecustomerorder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FunctionSpecificationActionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FunctionSpecificationActionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="unchange"/&gt;
 *     &lt;enumeration value="change"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FunctionSpecificationActionEnum", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
@XmlEnum
public enum FunctionSpecificationActionEnum {

    @XmlEnumValue("unchange")
    UNCHANGE("unchange"),
    @XmlEnumValue("change")
    CHANGE("change");
    private final String value;

    FunctionSpecificationActionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FunctionSpecificationActionEnum fromValue(String v) {
        for (FunctionSpecificationActionEnum c: FunctionSpecificationActionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
