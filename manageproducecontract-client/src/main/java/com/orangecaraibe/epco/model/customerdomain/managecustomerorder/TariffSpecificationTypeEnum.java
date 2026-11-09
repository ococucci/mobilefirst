
package com.orangecaraibe.epco.model.customerdomain.managecustomerorder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TariffSpecificationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TariffSpecificationTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RecurringTariffSpec"/&gt;
 *     &lt;enumeration value="NonRecurringTariffSpec"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TariffSpecificationTypeEnum", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
@XmlEnum
public enum TariffSpecificationTypeEnum {

    @XmlEnumValue("RecurringTariffSpec")
    RECURRING_TARIFF_SPEC("RecurringTariffSpec"),
    @XmlEnumValue("NonRecurringTariffSpec")
    NON_RECURRING_TARIFF_SPEC("NonRecurringTariffSpec");
    private final String value;

    TariffSpecificationTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TariffSpecificationTypeEnum fromValue(String v) {
        for (TariffSpecificationTypeEnum c: TariffSpecificationTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
