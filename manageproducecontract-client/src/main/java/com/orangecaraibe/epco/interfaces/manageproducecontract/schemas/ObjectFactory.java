
package com.orangecaraibe.epco.interfaces.manageproducecontract.schemas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.orangecaraibe.epco.interfaces.manageproducecontract.schemas package. 
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

    private final static QName _FindAndGet_QNAME = new QName("http://www.orangecaraibe.com/soa/v2/Interfaces/ManageProduceContract/Schemas", "findAndGet");
    private final static QName _FindAndGetFault_QNAME = new QName("http://www.orangecaraibe.com/soa/v2/Interfaces/ManageProduceContract/Schemas", "findAndGetFault");
    private final static QName _FindAndGetResponse_QNAME = new QName("http://www.orangecaraibe.com/soa/v2/Interfaces/ManageProduceContract/Schemas", "findAndGetResponse");
    private final static QName _InterfaceUnavailableFault_QNAME = new QName("http://www.orangecaraibe.com/soa/v2/Interfaces/ManageProduceContract/Schemas", "interfaceUnavailableFault");
    private final static QName _ProduceContract_QNAME = new QName("http://www.orangecaraibe.com/soa/v2/Interfaces/ManageProduceContract/Schemas", "produceContract");
    private final static QName _ProduceContractFault_QNAME = new QName("http://www.orangecaraibe.com/soa/v2/Interfaces/ManageProduceContract/Schemas", "produceContractFault");
    private final static QName _ProduceContractResponse_QNAME = new QName("http://www.orangecaraibe.com/soa/v2/Interfaces/ManageProduceContract/Schemas", "produceContractResponse");
    private final static QName _UpdateContract_QNAME = new QName("http://www.orangecaraibe.com/soa/v2/Interfaces/ManageProduceContract/Schemas", "updateContract");
    private final static QName _UpdateContractFault_QNAME = new QName("http://www.orangecaraibe.com/soa/v2/Interfaces/ManageProduceContract/Schemas", "updateContractFault");
    private final static QName _UpdateContractResponse_QNAME = new QName("http://www.orangecaraibe.com/soa/v2/Interfaces/ManageProduceContract/Schemas", "updateContractResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.orangecaraibe.epco.interfaces.manageproducecontract.schemas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindAndGet }
     * 
     */
    public FindAndGet createFindAndGet() {
        return new FindAndGet();
    }

    /**
     * Create an instance of {@link FindAndGetFault }
     * 
     */
    public FindAndGetFault createFindAndGetFault() {
        return new FindAndGetFault();
    }

    /**
     * Create an instance of {@link FindAndGetResponse }
     * 
     */
    public FindAndGetResponse createFindAndGetResponse() {
        return new FindAndGetResponse();
    }

    /**
     * Create an instance of {@link InterfaceUnavailableFault }
     * 
     */
    public InterfaceUnavailableFault createInterfaceUnavailableFault() {
        return new InterfaceUnavailableFault();
    }

    /**
     * Create an instance of {@link ProduceContract }
     * 
     */
    public ProduceContract createProduceContract() {
        return new ProduceContract();
    }

    /**
     * Create an instance of {@link ProduceContractFault }
     * 
     */
    public ProduceContractFault createProduceContractFault() {
        return new ProduceContractFault();
    }

    /**
     * Create an instance of {@link ProduceContractResponse }
     * 
     */
    public ProduceContractResponse createProduceContractResponse() {
        return new ProduceContractResponse();
    }

    /**
     * Create an instance of {@link UpdateContract }
     * 
     */
    public UpdateContract createUpdateContract() {
        return new UpdateContract();
    }

    /**
     * Create an instance of {@link UpdateContractFault }
     * 
     */
    public UpdateContractFault createUpdateContractFault() {
        return new UpdateContractFault();
    }

    /**
     * Create an instance of {@link UpdateContractResponse }
     * 
     */
    public UpdateContractResponse createUpdateContractResponse() {
        return new UpdateContractResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAndGet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAndGet }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageProduceContract/Schemas", name = "findAndGet")
    public JAXBElement<FindAndGet> createFindAndGet(FindAndGet value) {
        return new JAXBElement<FindAndGet>(_FindAndGet_QNAME, FindAndGet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAndGetFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAndGetFault }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageProduceContract/Schemas", name = "findAndGetFault")
    public JAXBElement<FindAndGetFault> createFindAndGetFault(FindAndGetFault value) {
        return new JAXBElement<FindAndGetFault>(_FindAndGetFault_QNAME, FindAndGetFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAndGetResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAndGetResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageProduceContract/Schemas", name = "findAndGetResponse")
    public JAXBElement<FindAndGetResponse> createFindAndGetResponse(FindAndGetResponse value) {
        return new JAXBElement<FindAndGetResponse>(_FindAndGetResponse_QNAME, FindAndGetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceUnavailableFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InterfaceUnavailableFault }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageProduceContract/Schemas", name = "interfaceUnavailableFault")
    public JAXBElement<InterfaceUnavailableFault> createInterfaceUnavailableFault(InterfaceUnavailableFault value) {
        return new JAXBElement<InterfaceUnavailableFault>(_InterfaceUnavailableFault_QNAME, InterfaceUnavailableFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProduceContract }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProduceContract }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageProduceContract/Schemas", name = "produceContract")
    public JAXBElement<ProduceContract> createProduceContract(ProduceContract value) {
        return new JAXBElement<ProduceContract>(_ProduceContract_QNAME, ProduceContract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProduceContractFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProduceContractFault }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageProduceContract/Schemas", name = "produceContractFault")
    public JAXBElement<ProduceContractFault> createProduceContractFault(ProduceContractFault value) {
        return new JAXBElement<ProduceContractFault>(_ProduceContractFault_QNAME, ProduceContractFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProduceContractResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProduceContractResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageProduceContract/Schemas", name = "produceContractResponse")
    public JAXBElement<ProduceContractResponse> createProduceContractResponse(ProduceContractResponse value) {
        return new JAXBElement<ProduceContractResponse>(_ProduceContractResponse_QNAME, ProduceContractResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateContract }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateContract }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageProduceContract/Schemas", name = "updateContract")
    public JAXBElement<UpdateContract> createUpdateContract(UpdateContract value) {
        return new JAXBElement<UpdateContract>(_UpdateContract_QNAME, UpdateContract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateContractFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateContractFault }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageProduceContract/Schemas", name = "updateContractFault")
    public JAXBElement<UpdateContractFault> createUpdateContractFault(UpdateContractFault value) {
        return new JAXBElement<UpdateContractFault>(_UpdateContractFault_QNAME, UpdateContractFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateContractResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateContractResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageProduceContract/Schemas", name = "updateContractResponse")
    public JAXBElement<UpdateContractResponse> createUpdateContractResponse(UpdateContractResponse value) {
        return new JAXBElement<UpdateContractResponse>(_UpdateContractResponse_QNAME, UpdateContractResponse.class, null, value);
    }

}
