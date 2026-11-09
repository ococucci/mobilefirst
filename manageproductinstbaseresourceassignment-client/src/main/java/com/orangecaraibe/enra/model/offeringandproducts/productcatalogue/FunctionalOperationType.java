
package com.orangecaraibe.enra.model.offeringandproducts.productcatalogue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FunctionalOperationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FunctionalOperationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="add"/&gt;
 *     &lt;enumeration value="remove"/&gt;
 *     &lt;enumeration value="change"/&gt;
 *     &lt;enumeration value="unchange"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FunctionalOperationType", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue")
@XmlEnum
public enum FunctionalOperationType {

    @XmlEnumValue("add")
    ADD("add"),
    @XmlEnumValue("remove")
    REMOVE("remove"),
    @XmlEnumValue("change")
    CHANGE("change"),
    @XmlEnumValue("unchange")
    UNCHANGE("unchange");
    private final String value;

    FunctionalOperationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FunctionalOperationType fromValue(String v) {
        for (FunctionalOperationType c: FunctionalOperationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
