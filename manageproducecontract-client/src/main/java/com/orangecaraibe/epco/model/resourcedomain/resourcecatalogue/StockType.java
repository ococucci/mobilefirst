
package com.orangecaraibe.epco.model.resourcedomain.resourcecatalogue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StockType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="StockType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AVAILABLE"/&gt;
 *     &lt;enumeration value="AVAILABLETOVIEW"/&gt;
 *     &lt;enumeration value="HISTORY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StockType", namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue")
@XmlEnum
public enum StockType {

    AVAILABLE,
    AVAILABLETOVIEW,
    HISTORY;

    public String value() {
        return name();
    }

    public static StockType fromValue(String v) {
        return valueOf(v);
    }

}
