
package com.orangecaraibe.epco.model.customerdomain.customerproblem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerProblemStatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CustomerProblemStatusCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Initialised"/&gt;
 *     &lt;enumeration value="Opened"/&gt;
 *     &lt;enumeration value="Canceled"/&gt;
 *     &lt;enumeration value="Closed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomerProblemStatusCode", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem")
@XmlEnum
public enum CustomerProblemStatusCode {

    @XmlEnumValue("Initialised")
    INITIALISED("Initialised"),
    @XmlEnumValue("Opened")
    OPENED("Opened"),
    @XmlEnumValue("Canceled")
    CANCELED("Canceled"),
    @XmlEnumValue("Closed")
    CLOSED("Closed");
    private final String value;

    CustomerProblemStatusCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerProblemStatusCode fromValue(String v) {
        for (CustomerProblemStatusCode c: CustomerProblemStatusCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
