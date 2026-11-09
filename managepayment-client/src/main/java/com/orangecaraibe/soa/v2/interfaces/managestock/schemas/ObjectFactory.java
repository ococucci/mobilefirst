
package com.orangecaraibe.soa.v2.interfaces.managestock.schemas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.orangecaraibe.soa.v2.interfaces.managestock.schemas package. 
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

    private final static QName _CheckDeliveryOrder_QNAME = new QName("http://www.orangecaraibe.com/soa/v2/Interfaces/ManageStock/Schemas", "checkDeliveryOrder");
    private final static QName _CheckDeliveryOrderFault_QNAME = new QName("http://www.orangecaraibe.com/soa/v2/Interfaces/ManageStock/Schemas", "checkDeliveryOrderFault");
    private final static QName _CheckDeliveryOrderResponse_QNAME = new QName("http://www.orangecaraibe.com/soa/v2/Interfaces/ManageStock/Schemas", "checkDeliveryOrderResponse");
    private final static QName _CheckResourceInStock_QNAME = new QName("http://www.orangecaraibe.com/soa/v2/Interfaces/ManageStock/Schemas", "checkResourceInStock");
    private final static QName _CheckResourceInStockFault_QNAME = new QName("http://www.orangecaraibe.com/soa/v2/Interfaces/ManageStock/Schemas", "checkResourceInStockFault");
    private final static QName _CheckResourceInStockResponse_QNAME = new QName("http://www.orangecaraibe.com/soa/v2/Interfaces/ManageStock/Schemas", "checkResourceInStockResponse");
    private final static QName _InterfaceUnavailableFault_QNAME = new QName("http://www.orangecaraibe.com/soa/v2/Interfaces/ManageStock/Schemas", "interfaceUnavailableFault");
    private final static QName _ReserveResourceInStock_QNAME = new QName("http://www.orangecaraibe.com/soa/v2/Interfaces/ManageStock/Schemas", "reserveResourceInStock");
    private final static QName _ReserveResourceInStockFault_QNAME = new QName("http://www.orangecaraibe.com/soa/v2/Interfaces/ManageStock/Schemas", "reserveResourceInStockFault");
    private final static QName _ReserveResourceInStockResponse_QNAME = new QName("http://www.orangecaraibe.com/soa/v2/Interfaces/ManageStock/Schemas", "reserveResourceInStockResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.orangecaraibe.soa.v2.interfaces.managestock.schemas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckDeliveryOrder }
     * 
     */
    public CheckDeliveryOrder createCheckDeliveryOrder() {
        return new CheckDeliveryOrder();
    }

    /**
     * Create an instance of {@link CheckDeliveryOrderFault }
     * 
     */
    public CheckDeliveryOrderFault createCheckDeliveryOrderFault() {
        return new CheckDeliveryOrderFault();
    }

    /**
     * Create an instance of {@link CheckDeliveryOrderResponse }
     * 
     */
    public CheckDeliveryOrderResponse createCheckDeliveryOrderResponse() {
        return new CheckDeliveryOrderResponse();
    }

    /**
     * Create an instance of {@link CheckResourceInStock }
     * 
     */
    public CheckResourceInStock createCheckResourceInStock() {
        return new CheckResourceInStock();
    }

    /**
     * Create an instance of {@link CheckResourceInStockFault }
     * 
     */
    public CheckResourceInStockFault createCheckResourceInStockFault() {
        return new CheckResourceInStockFault();
    }

    /**
     * Create an instance of {@link CheckResourceInStockResponse }
     * 
     */
    public CheckResourceInStockResponse createCheckResourceInStockResponse() {
        return new CheckResourceInStockResponse();
    }

    /**
     * Create an instance of {@link InterfaceUnavailableFault }
     * 
     */
    public InterfaceUnavailableFault createInterfaceUnavailableFault() {
        return new InterfaceUnavailableFault();
    }

    /**
     * Create an instance of {@link ReserveResourceInStock }
     * 
     */
    public ReserveResourceInStock createReserveResourceInStock() {
        return new ReserveResourceInStock();
    }

    /**
     * Create an instance of {@link ReserveResourceInStockFault }
     * 
     */
    public ReserveResourceInStockFault createReserveResourceInStockFault() {
        return new ReserveResourceInStockFault();
    }

    /**
     * Create an instance of {@link ReserveResourceInStockResponse }
     * 
     */
    public ReserveResourceInStockResponse createReserveResourceInStockResponse() {
        return new ReserveResourceInStockResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckDeliveryOrder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckDeliveryOrder }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageStock/Schemas", name = "checkDeliveryOrder")
    public JAXBElement<CheckDeliveryOrder> createCheckDeliveryOrder(CheckDeliveryOrder value) {
        return new JAXBElement<CheckDeliveryOrder>(_CheckDeliveryOrder_QNAME, CheckDeliveryOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckDeliveryOrderFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckDeliveryOrderFault }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageStock/Schemas", name = "checkDeliveryOrderFault")
    public JAXBElement<CheckDeliveryOrderFault> createCheckDeliveryOrderFault(CheckDeliveryOrderFault value) {
        return new JAXBElement<CheckDeliveryOrderFault>(_CheckDeliveryOrderFault_QNAME, CheckDeliveryOrderFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckDeliveryOrderResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckDeliveryOrderResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageStock/Schemas", name = "checkDeliveryOrderResponse")
    public JAXBElement<CheckDeliveryOrderResponse> createCheckDeliveryOrderResponse(CheckDeliveryOrderResponse value) {
        return new JAXBElement<CheckDeliveryOrderResponse>(_CheckDeliveryOrderResponse_QNAME, CheckDeliveryOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckResourceInStock }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckResourceInStock }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageStock/Schemas", name = "checkResourceInStock")
    public JAXBElement<CheckResourceInStock> createCheckResourceInStock(CheckResourceInStock value) {
        return new JAXBElement<CheckResourceInStock>(_CheckResourceInStock_QNAME, CheckResourceInStock.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckResourceInStockFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckResourceInStockFault }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageStock/Schemas", name = "checkResourceInStockFault")
    public JAXBElement<CheckResourceInStockFault> createCheckResourceInStockFault(CheckResourceInStockFault value) {
        return new JAXBElement<CheckResourceInStockFault>(_CheckResourceInStockFault_QNAME, CheckResourceInStockFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckResourceInStockResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckResourceInStockResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageStock/Schemas", name = "checkResourceInStockResponse")
    public JAXBElement<CheckResourceInStockResponse> createCheckResourceInStockResponse(CheckResourceInStockResponse value) {
        return new JAXBElement<CheckResourceInStockResponse>(_CheckResourceInStockResponse_QNAME, CheckResourceInStockResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceUnavailableFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InterfaceUnavailableFault }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageStock/Schemas", name = "interfaceUnavailableFault")
    public JAXBElement<InterfaceUnavailableFault> createInterfaceUnavailableFault(InterfaceUnavailableFault value) {
        return new JAXBElement<InterfaceUnavailableFault>(_InterfaceUnavailableFault_QNAME, InterfaceUnavailableFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveResourceInStock }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReserveResourceInStock }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageStock/Schemas", name = "reserveResourceInStock")
    public JAXBElement<ReserveResourceInStock> createReserveResourceInStock(ReserveResourceInStock value) {
        return new JAXBElement<ReserveResourceInStock>(_ReserveResourceInStock_QNAME, ReserveResourceInStock.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveResourceInStockFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReserveResourceInStockFault }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageStock/Schemas", name = "reserveResourceInStockFault")
    public JAXBElement<ReserveResourceInStockFault> createReserveResourceInStockFault(ReserveResourceInStockFault value) {
        return new JAXBElement<ReserveResourceInStockFault>(_ReserveResourceInStockFault_QNAME, ReserveResourceInStockFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveResourceInStockResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReserveResourceInStockResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageStock/Schemas", name = "reserveResourceInStockResponse")
    public JAXBElement<ReserveResourceInStockResponse> createReserveResourceInStockResponse(ReserveResourceInStockResponse value) {
        return new JAXBElement<ReserveResourceInStockResponse>(_ReserveResourceInStockResponse_QNAME, ReserveResourceInStockResponse.class, null, value);
    }

}
