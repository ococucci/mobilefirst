
package com.orangecaraibe.epco.model.commonbusiness.interaction;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InteractionWay.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InteractionWay"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IN"/&gt;
 *     &lt;enumeration value="OUT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InteractionWay", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction")
@XmlEnum
public enum InteractionWay {

    IN,
    OUT;

    public String value() {
        return name();
    }

    public static InteractionWay fromValue(String v) {
        return valueOf(v);
    }

}
