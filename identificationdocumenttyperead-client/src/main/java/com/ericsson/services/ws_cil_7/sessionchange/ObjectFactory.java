
package com.ericsson.services.ws_cil_7.sessionchange;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ericsson.services.ws_cil_7.sessionchange package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ericsson.services.ws_cil_7.sessionchange
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SessionChangeResponse }
     * 
     */
    public SessionChangeResponse createSessionChangeResponse() {
        return new SessionChangeResponse();
    }

    /**
     * Create an instance of {@link ValuesListpartRequest }
     * 
     */
    public ValuesListpartRequest createValuesListpartRequest() {
        return new ValuesListpartRequest();
    }

    /**
     * Create an instance of {@link ValuesRequest }
     * 
     */
    public ValuesRequest createValuesRequest() {
        return new ValuesRequest();
    }

    /**
     * Create an instance of {@link SessionChangeRequest }
     * 
     */
    public SessionChangeRequest createSessionChangeRequest() {
        return new SessionChangeRequest();
    }

}
