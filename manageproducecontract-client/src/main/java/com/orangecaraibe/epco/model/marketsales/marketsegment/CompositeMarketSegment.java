
package com.orangecaraibe.epco.model.marketsales.marketsegment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompositeMarketSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompositeMarketSegment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketSegment}MarketSegment"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChildrenMarketSegment" type="{http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketSegment}MarketSegment"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeMarketSegment", namespace = "http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketSegment", propOrder = {
    "childrenMarketSegment"
})
public class CompositeMarketSegment
    extends MarketSegment
{

    @XmlElement(name = "ChildrenMarketSegment", namespace = "http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketSegment", required = true)
    protected MarketSegment childrenMarketSegment;

    /**
     * Gets the value of the childrenMarketSegment property.
     * 
     * @return
     *     possible object is
     *     {@link MarketSegment }
     *     
     */
    public MarketSegment getChildrenMarketSegment() {
        return childrenMarketSegment;
    }

    /**
     * Sets the value of the childrenMarketSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketSegment }
     *     
     */
    public void setChildrenMarketSegment(MarketSegment value) {
        this.childrenMarketSegment = value;
    }

}
