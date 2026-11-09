
package com.orangecaraibe.epco.model.customerdomain.managecustomerorder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommercialOperationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CommercialOperationTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="add"/&gt;
 *     &lt;enumeration value="change"/&gt;
 *     &lt;enumeration value="remove"/&gt;
 *     &lt;enumeration value="childChange"/&gt;
 *     &lt;enumeration value="unchange"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CommercialOperationTypeEnum", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
@XmlEnum
public enum CommercialOperationTypeEnum {

    @XmlEnumValue("add")
    ADD("add"),
    @XmlEnumValue("change")
    CHANGE("change"),
    @XmlEnumValue("remove")
    REMOVE("remove"),
    @XmlEnumValue("childChange")
    CHILD_CHANGE("childChange"),
    @XmlEnumValue("unchange")
    UNCHANGE("unchange");
    private final String value;

    CommercialOperationTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommercialOperationTypeEnum fromValue(String v) {
        for (CommercialOperationTypeEnum c: CommercialOperationTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
