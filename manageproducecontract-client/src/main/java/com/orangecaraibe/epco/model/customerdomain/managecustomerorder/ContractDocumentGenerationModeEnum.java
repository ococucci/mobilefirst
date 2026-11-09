
package com.orangecaraibe.epco.model.customerdomain.managecustomerorder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractDocumentGenerationModeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ContractDocumentGenerationModeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEGRADED"/&gt;
 *     &lt;enumeration value="DEMATERIALISED"/&gt;
 *     &lt;enumeration value="PAPER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContractDocumentGenerationModeEnum", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
@XmlEnum
public enum ContractDocumentGenerationModeEnum {

    DEGRADED,
    DEMATERIALISED,
    PAPER;

    public String value() {
        return name();
    }

    public static ContractDocumentGenerationModeEnum fromValue(String v) {
        return valueOf(v);
    }

}
