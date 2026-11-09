
package com.orangecaraibe.epco.model.customerdomain.managecustomerorder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Distributor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Distributor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}PartyRole"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="channelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="distributionContractID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localDistributorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localCodeADV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localCodeCDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Distributor", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder", propOrder = {
    "channelID",
    "distributionContractID",
    "localDistributorType",
    "localCodeADV",
    "localCodeCDR"
})
public class Distributor
    extends PartyRole
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String channelID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String distributionContractID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String localDistributorType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String localCodeADV;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder")
    protected String localCodeCDR;

    /**
     * Gets the value of the channelID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelID() {
        return channelID;
    }

    /**
     * Sets the value of the channelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelID(String value) {
        this.channelID = value;
    }

    /**
     * Gets the value of the distributionContractID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributionContractID() {
        return distributionContractID;
    }

    /**
     * Sets the value of the distributionContractID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributionContractID(String value) {
        this.distributionContractID = value;
    }

    /**
     * Gets the value of the localDistributorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalDistributorType() {
        return localDistributorType;
    }

    /**
     * Sets the value of the localDistributorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalDistributorType(String value) {
        this.localDistributorType = value;
    }

    /**
     * Gets the value of the localCodeADV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalCodeADV() {
        return localCodeADV;
    }

    /**
     * Sets the value of the localCodeADV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalCodeADV(String value) {
        this.localCodeADV = value;
    }

    /**
     * Gets the value of the localCodeCDR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalCodeCDR() {
        return localCodeCDR;
    }

    /**
     * Sets the value of the localCodeCDR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalCodeCDR(String value) {
        this.localCodeCDR = value;
    }

}
