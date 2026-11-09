
package com.orangecaraibe.epco.model.customerdomain.customerbilling.payment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PaymentTypeCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PAYMENT_INVOICE"/&gt;
 *     &lt;enumeration value="PAYMENT_DEPOSIT"/&gt;
 *     &lt;enumeration value="DIRECT_DEBIT_REFUSAL"/&gt;
 *     &lt;enumeration value="PAYMENT_CUSTOMER_ORDER"/&gt;
 *     &lt;enumeration value="PAYMENT_OTHER_WRITE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentTypeCode", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
@XmlEnum
public enum PaymentTypeCode {

    PAYMENT_INVOICE,
    PAYMENT_DEPOSIT,
    DIRECT_DEBIT_REFUSAL,
    PAYMENT_CUSTOMER_ORDER,
    PAYMENT_OTHER_WRITE;

    public String value() {
        return name();
    }

    public static PaymentTypeCode fromValue(String v) {
        return valueOf(v);
    }

}
