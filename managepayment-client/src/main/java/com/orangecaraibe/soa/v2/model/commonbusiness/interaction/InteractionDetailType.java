
package com.orangecaraibe.soa.v2.model.commonbusiness.interaction;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InteractionDetailType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InteractionDetailType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TEXT"/&gt;
 *     &lt;enumeration value="HTML"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InteractionDetailType", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction")
@XmlEnum
public enum InteractionDetailType {

    TEXT,
    HTML;

    public String value() {
        return name();
    }

    public static InteractionDetailType fromValue(String v) {
        return valueOf(v);
    }

}
