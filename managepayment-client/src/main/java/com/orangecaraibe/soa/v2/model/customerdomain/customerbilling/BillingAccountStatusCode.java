
package com.orangecaraibe.soa.v2.model.customerdomain.customerbilling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingAccountStatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="BillingAccountStatusCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTIVE"/&gt;
 *     &lt;enumeration value="SUSPENDED"/&gt;
 *     &lt;enumeration value="CLOSED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BillingAccountStatusCode", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling")
@XmlEnum
public enum BillingAccountStatusCode {

    ACTIVE,
    SUSPENDED,
    CLOSED;

    public String value() {
        return name();
    }

    public static BillingAccountStatusCode fromValue(String v) {
        return valueOf(v);
    }

}
