
package com.orangecaraibe.enra.model.customerdomain.customerorder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductOrderItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductOrderItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productOrderItemID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerOrderItem" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerOrder}ProductCustomerOrderItem"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductOrderItem", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerOrder", propOrder = {
    "productOrderItemID",
    "customerOrderItem"
})
public class ProductOrderItem {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerOrder", required = true)
    protected String productOrderItemID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerOrder", required = true)
    protected ProductCustomerOrderItem customerOrderItem;

    /**
     * Gets the value of the productOrderItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductOrderItemID() {
        return productOrderItemID;
    }

    /**
     * Sets the value of the productOrderItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductOrderItemID(String value) {
        this.productOrderItemID = value;
    }

    /**
     * Gets the value of the customerOrderItem property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCustomerOrderItem }
     *     
     */
    public ProductCustomerOrderItem getCustomerOrderItem() {
        return customerOrderItem;
    }

    /**
     * Sets the value of the customerOrderItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCustomerOrderItem }
     *     
     */
    public void setCustomerOrderItem(ProductCustomerOrderItem value) {
        this.customerOrderItem = value;
    }

}
