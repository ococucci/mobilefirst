
package com.orangecaraibe.soa.v2.interfaces.manageresourceinstalledbase.schemas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.orangecaraibe.soa.v2.interfaces.manageresourceinstalledbase.schemas package. 
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

    private final static QName _FindAndGet_QNAME = new QName("http://www.orangecaraibe.com/soa/v2/Interfaces/ManageResourceInstalledBase/Schemas", "findAndGet");
    private final static QName _FindAndGetFault_QNAME = new QName("http://www.orangecaraibe.com/soa/v2/Interfaces/ManageResourceInstalledBase/Schemas", "findAndGetFault");
    private final static QName _FindAndGetResponse_QNAME = new QName("http://www.orangecaraibe.com/soa/v2/Interfaces/ManageResourceInstalledBase/Schemas", "findAndGetResponse");
    private final static QName _Install_QNAME = new QName("http://www.orangecaraibe.com/soa/v2/Interfaces/ManageResourceInstalledBase/Schemas", "install");
    private final static QName _InstallFault_QNAME = new QName("http://www.orangecaraibe.com/soa/v2/Interfaces/ManageResourceInstalledBase/Schemas", "installFault");
    private final static QName _InstallResponse_QNAME = new QName("http://www.orangecaraibe.com/soa/v2/Interfaces/ManageResourceInstalledBase/Schemas", "installResponse");
    private final static QName _InterfaceUnavailableFault_QNAME = new QName("http://www.orangecaraibe.com/soa/v2/Interfaces/ManageResourceInstalledBase/Schemas", "interfaceUnavailableFault");
    private final static QName _Update_QNAME = new QName("http://www.orangecaraibe.com/soa/v2/Interfaces/ManageResourceInstalledBase/Schemas", "update");
    private final static QName _UpdateFault_QNAME = new QName("http://www.orangecaraibe.com/soa/v2/Interfaces/ManageResourceInstalledBase/Schemas", "updateFault");
    private final static QName _UpdateResponse_QNAME = new QName("http://www.orangecaraibe.com/soa/v2/Interfaces/ManageResourceInstalledBase/Schemas", "updateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.orangecaraibe.soa.v2.interfaces.manageresourceinstalledbase.schemas
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
     * Create an instance of {@link Install }
     * 
     */
    public Install createInstall() {
        return new Install();
    }

    /**
     * Create an instance of {@link InstallFault }
     * 
     */
    public InstallFault createInstallFault() {
        return new InstallFault();
    }

    /**
     * Create an instance of {@link InstallResponse }
     * 
     */
    public InstallResponse createInstallResponse() {
        return new InstallResponse();
    }

    /**
     * Create an instance of {@link InterfaceUnavailableFault }
     * 
     */
    public InterfaceUnavailableFault createInterfaceUnavailableFault() {
        return new InterfaceUnavailableFault();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link UpdateFault }
     * 
     */
    public UpdateFault createUpdateFault() {
        return new UpdateFault();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAndGet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAndGet }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageResourceInstalledBase/Schemas", name = "findAndGet")
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
    @XmlElementDecl(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageResourceInstalledBase/Schemas", name = "findAndGetFault")
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
    @XmlElementDecl(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageResourceInstalledBase/Schemas", name = "findAndGetResponse")
    public JAXBElement<FindAndGetResponse> createFindAndGetResponse(FindAndGetResponse value) {
        return new JAXBElement<FindAndGetResponse>(_FindAndGetResponse_QNAME, FindAndGetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Install }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Install }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageResourceInstalledBase/Schemas", name = "install")
    public JAXBElement<Install> createInstall(Install value) {
        return new JAXBElement<Install>(_Install_QNAME, Install.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstallFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InstallFault }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageResourceInstalledBase/Schemas", name = "installFault")
    public JAXBElement<InstallFault> createInstallFault(InstallFault value) {
        return new JAXBElement<InstallFault>(_InstallFault_QNAME, InstallFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstallResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InstallResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageResourceInstalledBase/Schemas", name = "installResponse")
    public JAXBElement<InstallResponse> createInstallResponse(InstallResponse value) {
        return new JAXBElement<InstallResponse>(_InstallResponse_QNAME, InstallResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceUnavailableFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InterfaceUnavailableFault }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageResourceInstalledBase/Schemas", name = "interfaceUnavailableFault")
    public JAXBElement<InterfaceUnavailableFault> createInterfaceUnavailableFault(InterfaceUnavailableFault value) {
        return new JAXBElement<InterfaceUnavailableFault>(_InterfaceUnavailableFault_QNAME, InterfaceUnavailableFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Update }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageResourceInstalledBase/Schemas", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateFault }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageResourceInstalledBase/Schemas", name = "updateFault")
    public JAXBElement<UpdateFault> createUpdateFault(UpdateFault value) {
        return new JAXBElement<UpdateFault>(_UpdateFault_QNAME, UpdateFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageResourceInstalledBase/Schemas", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

}
