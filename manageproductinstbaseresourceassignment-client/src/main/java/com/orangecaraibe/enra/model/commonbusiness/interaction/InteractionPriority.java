
package com.orangecaraibe.enra.model.commonbusiness.interaction;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InteractionPriority.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InteractionPriority"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LOW"/&gt;
 *     &lt;enumeration value="NORMAL"/&gt;
 *     &lt;enumeration value="HIGH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InteractionPriority", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction")
@XmlEnum
public enum InteractionPriority {

    LOW,
    NORMAL,
    HIGH;

    public String value() {
        return name();
    }

    public static InteractionPriority fromValue(String v) {
        return valueOf(v);
    }

}
