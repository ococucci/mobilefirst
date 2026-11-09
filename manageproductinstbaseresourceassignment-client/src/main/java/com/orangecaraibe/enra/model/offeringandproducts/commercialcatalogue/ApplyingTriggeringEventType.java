
package com.orangecaraibe.enra.model.offeringandproducts.commercialcatalogue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplyingTriggeringEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ApplyingTriggeringEventType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INSTALLEDPRODUCTUPDATE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ApplyingTriggeringEventType", namespace = "http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue")
@XmlEnum
public enum ApplyingTriggeringEventType {

    INSTALLEDPRODUCTUPDATE;

    public String value() {
        return name();
    }

    public static ApplyingTriggeringEventType fromValue(String v) {
        return valueOf(v);
    }

}
