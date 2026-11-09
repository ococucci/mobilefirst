
package com.orangecaraibe.soa.v2.model.marketsales.marketsegment;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.orangecaraibe.soa.v2.model.marketsales.marketsegment package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.orangecaraibe.soa.v2.model.marketsales.marketsegment
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MarketSegment }
     * 
     */
    public MarketSegment createMarketSegment() {
        return new MarketSegment();
    }

    /**
     * Create an instance of {@link AtomicMarketSegment }
     * 
     */
    public AtomicMarketSegment createAtomicMarketSegment() {
        return new AtomicMarketSegment();
    }

    /**
     * Create an instance of {@link CompositeMarketSegment }
     * 
     */
    public CompositeMarketSegment createCompositeMarketSegment() {
        return new CompositeMarketSegment();
    }

}
