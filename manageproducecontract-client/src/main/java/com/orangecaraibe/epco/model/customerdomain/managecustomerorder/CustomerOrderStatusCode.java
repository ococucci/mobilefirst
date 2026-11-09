
package com.orangecaraibe.epco.model.customerdomain.managecustomerorder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerOrderStatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CustomerOrderStatusCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IN_PAYMENT"/&gt;
 *     &lt;enumeration value="FAILED"/&gt;
 *     &lt;enumeration value="WAITING_PAYMENT"/&gt;
 *     &lt;enumeration value="CANCELLED"/&gt;
 *     &lt;enumeration value="REJECTED"/&gt;
 *     &lt;enumeration value="PENDING_LOYALTY_BURN"/&gt;
 *     &lt;enumeration value="PENDING_EXECUTION"/&gt;
 *     &lt;enumeration value="NEW"/&gt;
 *     &lt;enumeration value="EXECUTED"/&gt;
 *     &lt;enumeration value="IN_TRANSIT_TO_CUSTOMER"/&gt;
 *     &lt;enumeration value="WAITING_STOCK_RESERVATION"/&gt;
 *     &lt;enumeration value="WAITING_VALIDATION"/&gt;
 *     &lt;enumeration value="IN_REFUND"/&gt;
 *     &lt;enumeration value="WAITING_HOMOLOGATION_UPLOAD"/&gt;
 *     &lt;enumeration value="HOMOLOGATION_UPLOAD"/&gt;
 *     &lt;enumeration value="WAITING_SIGNED_CONTRACT"/&gt;
 *     &lt;enumeration value="HOMOLOGATION_CONTRAT_SIGNE"/&gt;
 *     &lt;enumeration value="WAITING_HOMOLOG_DOC"/&gt;
 *     &lt;enumeration value="WAITING_CARRIER"/&gt;
 *     &lt;enumeration value="WAITING_PAYMENT_CAPTURE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomerOrderStatusCode", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
@XmlEnum
public enum CustomerOrderStatusCode {

    IN_PAYMENT,
    FAILED,
    WAITING_PAYMENT,
    CANCELLED,
    REJECTED,
    PENDING_LOYALTY_BURN,
    PENDING_EXECUTION,
    NEW,
    EXECUTED,
    IN_TRANSIT_TO_CUSTOMER,
    WAITING_STOCK_RESERVATION,
    WAITING_VALIDATION,
    IN_REFUND,
    WAITING_HOMOLOGATION_UPLOAD,
    HOMOLOGATION_UPLOAD,
    WAITING_SIGNED_CONTRACT,
    HOMOLOGATION_CONTRAT_SIGNE,
    WAITING_HOMOLOG_DOC,
    WAITING_CARRIER,
    WAITING_PAYMENT_CAPTURE;

    public String value() {
        return name();
    }

    public static CustomerOrderStatusCode fromValue(String v) {
        return valueOf(v);
    }

}
