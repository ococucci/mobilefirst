
package com.orangecaraibe.soa.v2.model.resourcedomain.resourcecatalogue;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.orangecaraibe.soa.v2.model.resourcedomain.resourcecatalogue package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.orangecaraibe.soa.v2.model.resourcedomain.resourcecatalogue
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResourceSpecification }
     * 
     */
    public ResourceSpecification createResourceSpecification() {
        return new ResourceSpecification();
    }

    /**
     * Create an instance of {@link ResourceSpecificationCharacteristic }
     * 
     */
    public ResourceSpecificationCharacteristic createResourceSpecificationCharacteristic() {
        return new ResourceSpecificationCharacteristic();
    }

    /**
     * Create an instance of {@link ResourceSpecificationCharacteristicValue }
     * 
     */
    public ResourceSpecificationCharacteristicValue createResourceSpecificationCharacteristicValue() {
        return new ResourceSpecificationCharacteristicValue();
    }

    /**
     * Create an instance of {@link GenericResource }
     * 
     */
    public GenericResource createGenericResource() {
        return new GenericResource();
    }

    /**
     * Create an instance of {@link Stock }
     * 
     */
    public Stock createStock() {
        return new Stock();
    }

    /**
     * Create an instance of {@link LogicalResourceSpec }
     * 
     */
    public LogicalResourceSpec createLogicalResourceSpec() {
        return new LogicalResourceSpec();
    }

    /**
     * Create an instance of {@link PhysicalResourceSpec }
     * 
     */
    public PhysicalResourceSpec createPhysicalResourceSpec() {
        return new PhysicalResourceSpec();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     */
    public Reservation createReservation() {
        return new Reservation();
    }

}
