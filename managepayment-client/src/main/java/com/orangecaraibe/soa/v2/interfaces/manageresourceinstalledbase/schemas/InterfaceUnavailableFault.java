
package com.orangecaraibe.soa.v2.interfaces.manageresourceinstalledbase.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.soa.v2.model.commons.exception.Fault;


/**
 * <p>Java class for InterfaceUnavailableFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterfaceUnavailableFault"&gt;
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
@XmlType(name = "InterfaceUnavailableFault", namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageResourceInstalledBase/Schemas")
public class InterfaceUnavailableFault
    extends Fault
{


}
