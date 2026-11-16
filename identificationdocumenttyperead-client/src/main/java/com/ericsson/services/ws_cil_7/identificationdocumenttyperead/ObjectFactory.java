
package com.ericsson.services.ws_cil_7.identificationdocumenttyperead;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ericsson.services.ws_cil_7.identificationdocumenttyperead package. 
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

    private final static QName _IdentificationDocumentTypeReadRequest_QNAME = new QName("http://ericsson.com/services/ws_CIL_7/identificationdocumenttyperead", "identificationDocumentTypeReadRequest");
    private final static QName _IdentificationDocumentTypeReadResponse_QNAME = new QName("http://ericsson.com/services/ws_CIL_7/identificationdocumenttyperead", "identificationDocumentTypeReadResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ericsson.services.ws_cil_7.identificationdocumenttyperead
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IdentificationDocumentTypeReadRequest }
     * 
     */
    public IdentificationDocumentTypeReadRequest createIdentificationDocumentTypeReadRequest() {
        return new IdentificationDocumentTypeReadRequest();
    }

    /**
     * Create an instance of {@link IdentificationDocumentTypeReadResponse }
     * 
     */
    public IdentificationDocumentTypeReadResponse createIdentificationDocumentTypeReadResponse() {
        return new IdentificationDocumentTypeReadResponse();
    }

    /**
     * Create an instance of {@link ListOfIdentificationDocumentTypeListpartResponse }
     * 
     */
    public ListOfIdentificationDocumentTypeListpartResponse createListOfIdentificationDocumentTypeListpartResponse() {
        return new ListOfIdentificationDocumentTypeListpartResponse();
    }

    /**
     * Create an instance of {@link ListOfIdentificationDocumentTypeResponse }
     * 
     */
    public ListOfIdentificationDocumentTypeResponse createListOfIdentificationDocumentTypeResponse() {
        return new ListOfIdentificationDocumentTypeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentificationDocumentTypeReadRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IdentificationDocumentTypeReadRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ericsson.com/services/ws_CIL_7/identificationdocumenttyperead", name = "identificationDocumentTypeReadRequest")
    public JAXBElement<IdentificationDocumentTypeReadRequest> createIdentificationDocumentTypeReadRequest(IdentificationDocumentTypeReadRequest value) {
        return new JAXBElement<IdentificationDocumentTypeReadRequest>(_IdentificationDocumentTypeReadRequest_QNAME, IdentificationDocumentTypeReadRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentificationDocumentTypeReadResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IdentificationDocumentTypeReadResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ericsson.com/services/ws_CIL_7/identificationdocumenttyperead", name = "identificationDocumentTypeReadResponse")
    public JAXBElement<IdentificationDocumentTypeReadResponse> createIdentificationDocumentTypeReadResponse(IdentificationDocumentTypeReadResponse value) {
        return new JAXBElement<IdentificationDocumentTypeReadResponse>(_IdentificationDocumentTypeReadResponse_QNAME, IdentificationDocumentTypeReadResponse.class, null, value);
    }

}
