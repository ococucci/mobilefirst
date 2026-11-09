
package com.orangecaraibe.soa.v2.model.resourcedomain.resourcecatalogue;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.soa.v2.model.commonbusiness.party.role.PartyRole;
import com.orangecaraibe.soa.v2.model.customerdomain.customerorder.CustomerOrderItem;
import com.orangecaraibe.soa.v2.model.offeringandproducts.commercialcatalogue.SaleChannel;


/**
 * <p>Java class for Reservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reservation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reservationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reservationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reservedBy" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role}PartyRole" minOccurs="0"/&gt;
 *         &lt;element name="reservedFrom" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue}SaleChannel" minOccurs="0"/&gt;
 *         &lt;element name="resourceSpecification" type="{http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue}ResourceSpecification"/&gt;
 *         &lt;element name="customerOrderItem" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerOrder}CustomerOrderItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reservation", namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue", propOrder = {
    "reservationID",
    "reservationType",
    "reservedBy",
    "reservedFrom",
    "resourceSpecification",
    "customerOrderItem"
})
public class Reservation {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue")
    protected String reservationID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue")
    protected String reservationType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue")
    protected PartyRole reservedBy;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue")
    protected SaleChannel reservedFrom;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue", required = true)
    protected ResourceSpecification resourceSpecification;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue")
    protected CustomerOrderItem customerOrderItem;

    /**
     * Gets the value of the reservationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationID() {
        return reservationID;
    }

    /**
     * Sets the value of the reservationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationID(String value) {
        this.reservationID = value;
    }

    /**
     * Gets the value of the reservationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationType() {
        return reservationType;
    }

    /**
     * Sets the value of the reservationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationType(String value) {
        this.reservationType = value;
    }

    /**
     * Gets the value of the reservedBy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyRole }
     *     
     */
    public PartyRole getReservedBy() {
        return reservedBy;
    }

    /**
     * Sets the value of the reservedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRole }
     *     
     */
    public void setReservedBy(PartyRole value) {
        this.reservedBy = value;
    }

    /**
     * Gets the value of the reservedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link SaleChannel }
     *     
     */
    public SaleChannel getReservedFrom() {
        return reservedFrom;
    }

    /**
     * Sets the value of the reservedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleChannel }
     *     
     */
    public void setReservedFrom(SaleChannel value) {
        this.reservedFrom = value;
    }

    /**
     * Gets the value of the resourceSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceSpecification }
     *     
     */
    public ResourceSpecification getResourceSpecification() {
        return resourceSpecification;
    }

    /**
     * Sets the value of the resourceSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceSpecification }
     *     
     */
    public void setResourceSpecification(ResourceSpecification value) {
        this.resourceSpecification = value;
    }

    /**
     * Gets the value of the customerOrderItem property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderItem }
     *     
     */
    public CustomerOrderItem getCustomerOrderItem() {
        return customerOrderItem;
    }

    /**
     * Sets the value of the customerOrderItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderItem }
     *     
     */
    public void setCustomerOrderItem(CustomerOrderItem value) {
        this.customerOrderItem = value;
    }

}
