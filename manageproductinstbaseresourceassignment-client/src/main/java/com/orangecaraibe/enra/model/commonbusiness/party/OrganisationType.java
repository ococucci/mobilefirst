
package com.orangecaraibe.enra.model.commonbusiness.party;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganisationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OrganisationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="geographical"/&gt;
 *     &lt;enumeration value="hierarchical"/&gt;
 *     &lt;enumeration value="functional"/&gt;
 *     &lt;enumeration value="juridical"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrganisationType", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
@XmlEnum
public enum OrganisationType {

    @XmlEnumValue("geographical")
    GEOGRAPHICAL("geographical"),
    @XmlEnumValue("hierarchical")
    HIERARCHICAL("hierarchical"),
    @XmlEnumValue("functional")
    FUNCTIONAL("functional"),
    @XmlEnumValue("juridical")
    JURIDICAL("juridical");
    private final String value;

    OrganisationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrganisationType fromValue(String v) {
        for (OrganisationType c: OrganisationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
