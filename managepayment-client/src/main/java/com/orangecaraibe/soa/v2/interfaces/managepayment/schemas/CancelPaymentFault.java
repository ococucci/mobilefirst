
package com.orangecaraibe.soa.v2.interfaces.managepayment.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.soa.v2.model.commons.exception.Fault;


/**
 * <p>Java class for cancelPaymentFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cancelPaymentFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/Commons/Exception}Fault"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelPaymentFault", namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManagePayment/Schemas")
public class CancelPaymentFault
    extends Fault
{


}
