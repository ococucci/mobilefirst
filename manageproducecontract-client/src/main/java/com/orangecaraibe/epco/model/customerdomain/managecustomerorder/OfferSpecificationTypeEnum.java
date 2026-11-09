
package com.orangecaraibe.epco.model.customerdomain.managecustomerorder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfferSpecificationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OfferSpecificationTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Play"/&gt;
 *     &lt;enumeration value="ContractType"/&gt;
 *     &lt;enumeration value="AtomicOffer"/&gt;
 *     &lt;enumeration value="Set"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OfferSpecificationTypeEnum", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
@XmlEnum
public enum OfferSpecificationTypeEnum {

    @XmlEnumValue("Play")
    PLAY("Play"),
    @XmlEnumValue("ContractType")
    CONTRACT_TYPE("ContractType"),
    @XmlEnumValue("AtomicOffer")
    ATOMIC_OFFER("AtomicOffer"),
    @XmlEnumValue("Set")
    SET("Set");
    private final String value;

    OfferSpecificationTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OfferSpecificationTypeEnum fromValue(String v) {
        for (OfferSpecificationTypeEnum c: OfferSpecificationTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
