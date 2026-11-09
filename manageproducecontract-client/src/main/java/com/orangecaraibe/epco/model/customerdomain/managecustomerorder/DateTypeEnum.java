
package com.orangecaraibe.epco.model.customerdomain.managecustomerorder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DateTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="modificationDate"/&gt;
 *     &lt;enumeration value="ConfigurationCheckedDate"/&gt;
 *     &lt;enumeration value="CreationDate"/&gt;
 *     &lt;enumeration value="DepositeDate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DateTypeEnum", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
@XmlEnum
public enum DateTypeEnum {

    @XmlEnumValue("modificationDate")
    MODIFICATION_DATE("modificationDate"),
    @XmlEnumValue("ConfigurationCheckedDate")
    CONFIGURATION_CHECKED_DATE("ConfigurationCheckedDate"),
    @XmlEnumValue("CreationDate")
    CREATION_DATE("CreationDate"),
    @XmlEnumValue("DepositeDate")
    DEPOSITE_DATE("DepositeDate");
    private final String value;

    DateTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DateTypeEnum fromValue(String v) {
        for (DateTypeEnum c: DateTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
