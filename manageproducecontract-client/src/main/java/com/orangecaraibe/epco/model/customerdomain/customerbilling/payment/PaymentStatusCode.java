
package com.orangecaraibe.epco.model.customerdomain.customerbilling.payment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentStatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PaymentStatusCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CASHED"/&gt;
 *     &lt;enumeration value="REJECTED"/&gt;
 *     &lt;enumeration value="INITIALISED"/&gt;
 *     &lt;enumeration value="ISSUED"/&gt;
 *     &lt;enumeration value="GENERALLEDGERACCOUNTED"/&gt;
 *     &lt;enumeration value="MOVEDCLOSER"/&gt;
 *     &lt;enumeration value="ARACCOUNTED"/&gt;
 *     &lt;enumeration value="SENTTOBANK"/&gt;
 *     &lt;enumeration value="LETTERED"/&gt;
 *     &lt;enumeration value="PAYMENT_DONE"/&gt;
 *     &lt;enumeration value="PAYMENT_FAILED"/&gt;
 *     &lt;enumeration value="PAYMENT_PREPARATION_DONE"/&gt;
 *     &lt;enumeration value="PAYMENT_PREPARATION_FAILED"/&gt;
 *     &lt;enumeration value="PAYMENT_CANCELLED"/&gt;
 *     &lt;enumeration value="PAYMENT_CANCELLATION_FAILED"/&gt;
 *     &lt;enumeration value="NEW"/&gt;
 *     &lt;enumeration value="PLANNED"/&gt;
 *     &lt;enumeration value="PAYMENT_PREPARATION_INIT"/&gt;
 *     &lt;enumeration value="PAYMENT_AUTHORIZED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentStatusCode", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment")
@XmlEnum
public enum PaymentStatusCode {

    CASHED,
    REJECTED,
    INITIALISED,
    ISSUED,
    GENERALLEDGERACCOUNTED,
    MOVEDCLOSER,
    ARACCOUNTED,
    SENTTOBANK,
    LETTERED,
    PAYMENT_DONE,
    PAYMENT_FAILED,
    PAYMENT_PREPARATION_DONE,
    PAYMENT_PREPARATION_FAILED,
    PAYMENT_CANCELLED,
    PAYMENT_CANCELLATION_FAILED,
    NEW,
    PLANNED,
    PAYMENT_PREPARATION_INIT,
    PAYMENT_AUTHORIZED;

    public String value() {
        return name();
    }

    public static PaymentStatusCode fromValue(String v) {
        return valueOf(v);
    }

}
