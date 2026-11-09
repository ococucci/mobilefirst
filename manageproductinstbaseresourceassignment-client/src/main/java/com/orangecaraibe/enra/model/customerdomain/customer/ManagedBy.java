
package com.orangecaraibe.enra.model.customerdomain.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.enra.model.commonbusiness.party.role.PartyRole;


/**
 * <p>Java class for ManagedBy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagedBy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role}PartyRole"&gt;
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
@XmlType(name = "ManagedBy", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/Customer")
public class ManagedBy
    extends PartyRole
{


}
