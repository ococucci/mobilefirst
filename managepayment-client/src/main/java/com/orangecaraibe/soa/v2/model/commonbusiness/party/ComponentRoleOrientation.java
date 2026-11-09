
package com.orangecaraibe.soa.v2.model.commonbusiness.party;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComponentRoleOrientation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ComponentRoleOrientation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="contains"/&gt;
 *     &lt;enumeration value="is contained"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ComponentRoleOrientation", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
@XmlEnum
public enum ComponentRoleOrientation {

    @XmlEnumValue("contains")
    CONTAINS("contains"),
    @XmlEnumValue("is contained")
    IS_CONTAINED("is contained");
    private final String value;

    ComponentRoleOrientation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComponentRoleOrientation fromValue(String v) {
        for (ComponentRoleOrientation c: ComponentRoleOrientation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
