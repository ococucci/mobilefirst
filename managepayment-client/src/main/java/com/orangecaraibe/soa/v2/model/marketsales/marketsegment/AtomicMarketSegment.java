
package com.orangecaraibe.soa.v2.model.marketsales.marketsegment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AtomicMarketSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AtomicMarketSegment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketSegment}MarketSegment"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parentMarketSegment" type="{http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketSegment}CompositeMarketSegment"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AtomicMarketSegment", namespace = "http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketSegment", propOrder = {
    "parentMarketSegment"
})
public class AtomicMarketSegment
    extends MarketSegment
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketSegment", required = true)
    protected CompositeMarketSegment parentMarketSegment;

    /**
     * Gets the value of the parentMarketSegment property.
     * 
     * @return
     *     possible object is
     *     {@link CompositeMarketSegment }
     *     
     */
    public CompositeMarketSegment getParentMarketSegment() {
        return parentMarketSegment;
    }

    /**
     * Sets the value of the parentMarketSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositeMarketSegment }
     *     
     */
    public void setParentMarketSegment(CompositeMarketSegment value) {
        this.parentMarketSegment = value;
    }

}
