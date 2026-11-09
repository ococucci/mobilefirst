
package com.orangecaraibe.soa.v2.model.marketsales.marketsegment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketSegment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="marketSegmentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marketSegmentCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketSegment", namespace = "http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketSegment", propOrder = {
    "marketSegmentID",
    "label",
    "marketSegmentCategory"
})
@XmlSeeAlso({
    AtomicMarketSegment.class,
    CompositeMarketSegment.class
})
public class MarketSegment {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketSegment")
    protected String marketSegmentID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketSegment")
    protected String label;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketSegment")
    protected String marketSegmentCategory;

    /**
     * Gets the value of the marketSegmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketSegmentID() {
        return marketSegmentID;
    }

    /**
     * Sets the value of the marketSegmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketSegmentID(String value) {
        this.marketSegmentID = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the marketSegmentCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketSegmentCategory() {
        return marketSegmentCategory;
    }

    /**
     * Sets the value of the marketSegmentCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketSegmentCategory(String value) {
        this.marketSegmentCategory = value;
    }

}
