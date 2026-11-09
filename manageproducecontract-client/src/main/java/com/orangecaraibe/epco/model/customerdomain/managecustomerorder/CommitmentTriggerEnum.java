
package com.orangecaraibe.epco.model.customerdomain.managecustomerorder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommitmentTriggerEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CommitmentTriggerEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="customerOrderItem delivered"/&gt;
 *     &lt;enumeration value="ordered"/&gt;
 *     &lt;enumeration value="complete cutomerOrder delivered"/&gt;
 *     &lt;enumeration value="after the end of current commitment"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CommitmentTriggerEnum", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
@XmlEnum
public enum CommitmentTriggerEnum {

    @XmlEnumValue("customerOrderItem delivered")
    CUSTOMER_ORDER_ITEM_DELIVERED("customerOrderItem delivered"),
    @XmlEnumValue("ordered")
    ORDERED("ordered"),
    @XmlEnumValue("complete cutomerOrder delivered")
    COMPLETE_CUTOMER_ORDER_DELIVERED("complete cutomerOrder delivered"),
    @XmlEnumValue("after the end of current commitment")
    AFTER_THE_END_OF_CURRENT_COMMITMENT("after the end of current commitment");
    private final String value;

    CommitmentTriggerEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommitmentTriggerEnum fromValue(String v) {
        for (CommitmentTriggerEnum c: CommitmentTriggerEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
