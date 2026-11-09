
package com.orangecaraibe.epco.model.customerdomain.managecustomerorder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Salutation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="Salutation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MR"/&gt;
 *     &lt;enumeration value="MRS"/&gt;
 *     &lt;enumeration value="MISS"/&gt;
 *     &lt;enumeration value="DR"/&gt;
 *     &lt;enumeration value="MAJOR"/&gt;
 *     &lt;enumeration value="M."/&gt;
 *     &lt;enumeration value="MLLE."/&gt;
 *     &lt;enumeration value="MME."/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Salutation", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
@XmlEnum
public enum Salutation {

    MR("MR"),
    MRS("MRS"),
    MISS("MISS"),
    DR("DR"),
    MAJOR("MAJOR"),
    @XmlEnumValue("M.")
    M("M."),
    @XmlEnumValue("MLLE.")
    MLLE("MLLE."),
    @XmlEnumValue("MME.")
    MME("MME.");
    private final String value;

    Salutation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Salutation fromValue(String v) {
        for (Salutation c: Salutation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
