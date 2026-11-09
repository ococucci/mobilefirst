
package com.orangecaraibe.epco.model.resourcedomain.resourceinstalledbase;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.orangecaraibe.epco.model.resourcedomain.resourceinstalledbase package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.orangecaraibe.epco.model.resourcedomain.resourceinstalledbase
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InstalledResource }
     * 
     */
    public InstalledResource createInstalledResource() {
        return new InstalledResource();
    }

    /**
     * Create an instance of {@link InstalledResourceCharacteristicValue }
     * 
     */
    public InstalledResourceCharacteristicValue createInstalledResourceCharacteristicValue() {
        return new InstalledResourceCharacteristicValue();
    }

    /**
     * Create an instance of {@link InstalledLogicalResource }
     * 
     */
    public InstalledLogicalResource createInstalledLogicalResource() {
        return new InstalledLogicalResource();
    }

    /**
     * Create an instance of {@link InstalledPhysicalResource }
     * 
     */
    public InstalledPhysicalResource createInstalledPhysicalResource() {
        return new InstalledPhysicalResource();
    }

    /**
     * Create an instance of {@link InstalledMobileNetwork }
     * 
     */
    public InstalledMobileNetwork createInstalledMobileNetwork() {
        return new InstalledMobileNetwork();
    }

    /**
     * Create an instance of {@link InstalledMobileNetworkElement }
     * 
     */
    public InstalledMobileNetworkElement createInstalledMobileNetworkElement() {
        return new InstalledMobileNetworkElement();
    }

}
