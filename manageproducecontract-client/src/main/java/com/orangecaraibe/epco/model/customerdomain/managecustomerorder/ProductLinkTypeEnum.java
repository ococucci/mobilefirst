
package com.orangecaraibe.epco.model.customerdomain.managecustomerorder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductLinkTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ProductLinkTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="relies on"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProductLinkTypeEnum", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
@XmlEnum
public enum ProductLinkTypeEnum {

    @XmlEnumValue("relies on")
    RELIES_ON("relies on");
    private final String value;

    ProductLinkTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductLinkTypeEnum fromValue(String v) {
        for (ProductLinkTypeEnum c: ProductLinkTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
