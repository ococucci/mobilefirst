
package com.orangecaraibe.enra.model.offeringandproducts.productcatalogue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SharedFxPricePackageUserType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SharedFxPricePackageUserType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="member"/&gt;
 *     &lt;enumeration value="leader"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SharedFxPricePackageUserType", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/Productcatalogue")
@XmlEnum
public enum SharedFxPricePackageUserType {

    @XmlEnumValue("member")
    MEMBER("member"),
    @XmlEnumValue("leader")
    LEADER("leader");
    private final String value;

    SharedFxPricePackageUserType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SharedFxPricePackageUserType fromValue(String v) {
        for (SharedFxPricePackageUserType c: SharedFxPricePackageUserType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
