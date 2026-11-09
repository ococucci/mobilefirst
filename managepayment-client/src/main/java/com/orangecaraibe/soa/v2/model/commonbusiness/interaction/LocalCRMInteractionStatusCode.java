
package com.orangecaraibe.soa.v2.model.commonbusiness.interaction;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocalCRMInteractionStatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LocalCRMInteractionStatusCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COMPLETED"/&gt;
 *     &lt;enumeration value="IN_PROGRESS"/&gt;
 *     &lt;enumeration value="CANCELLED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocalCRMInteractionStatusCode", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction")
@XmlEnum
public enum LocalCRMInteractionStatusCode {

    COMPLETED,
    IN_PROGRESS,
    CANCELLED;

    public String value() {
        return name();
    }

    public static LocalCRMInteractionStatusCode fromValue(String v) {
        return valueOf(v);
    }

}
