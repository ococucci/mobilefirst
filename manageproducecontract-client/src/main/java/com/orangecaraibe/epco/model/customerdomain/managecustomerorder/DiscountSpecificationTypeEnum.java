
package com.orangecaraibe.epco.model.customerdomain.managecustomerorder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscountSpecificationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DiscountSpecificationTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RecurringDiscountSpec"/&gt;
 *     &lt;enumeration value="NonRecurringDiscountSpec"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DiscountSpecificationTypeEnum", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
@XmlEnum
public enum DiscountSpecificationTypeEnum {

    @XmlEnumValue("RecurringDiscountSpec")
    RECURRING_DISCOUNT_SPEC("RecurringDiscountSpec"),
    @XmlEnumValue("NonRecurringDiscountSpec")
    NON_RECURRING_DISCOUNT_SPEC("NonRecurringDiscountSpec");
    private final String value;

    DiscountSpecificationTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiscountSpecificationTypeEnum fromValue(String v) {
        for (DiscountSpecificationTypeEnum c: DiscountSpecificationTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
