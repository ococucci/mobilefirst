
package com.orangecaraibe.epco.model.customerdomain.managecustomerorder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}PartyRole"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="computerOrNetworkEquipment" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}ComputerOrNetworkEquipment" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", propOrder = {
    "computerOrNetworkEquipment"
})
public class User
    extends PartyRole
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected ComputerOrNetworkEquipment computerOrNetworkEquipment;

    /**
     * Gets the value of the computerOrNetworkEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link ComputerOrNetworkEquipment }
     *     
     */
    public ComputerOrNetworkEquipment getComputerOrNetworkEquipment() {
        return computerOrNetworkEquipment;
    }

    /**
     * Sets the value of the computerOrNetworkEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputerOrNetworkEquipment }
     *     
     */
    public void setComputerOrNetworkEquipment(ComputerOrNetworkEquipment value) {
        this.computerOrNetworkEquipment = value;
    }

}
