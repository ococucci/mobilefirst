
package com.orangecaraibe.enra.model.commonbusiness.interaction;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InteractionStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InteractionStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IDLE"/&gt;
 *     &lt;enumeration value="SENT"/&gt;
 *     &lt;enumeration value="ACK"/&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *     &lt;enumeration value="PENDING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InteractionStatus", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction")
@XmlEnum
public enum InteractionStatus {

    IDLE,
    SENT,
    ACK,
    ERROR,
    PENDING;

    public String value() {
        return name();
    }

    public static InteractionStatus fromValue(String v) {
        return valueOf(v);
    }

}
