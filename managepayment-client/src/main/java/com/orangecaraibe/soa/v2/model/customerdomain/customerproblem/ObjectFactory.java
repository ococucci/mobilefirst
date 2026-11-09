
package com.orangecaraibe.soa.v2.model.customerdomain.customerproblem;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.orangecaraibe.soa.v2.model.customerdomain.customerproblem package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.orangecaraibe.soa.v2.model.customerdomain.customerproblem
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LocalCustomerProblemImage }
     * 
     */
    public LocalCustomerProblemImage createLocalCustomerProblemImage() {
        return new LocalCustomerProblemImage();
    }

    /**
     * Create an instance of {@link CustomerProblem }
     * 
     */
    public CustomerProblem createCustomerProblem() {
        return new CustomerProblem();
    }

    /**
     * Create an instance of {@link CustomerProblemStatus }
     * 
     */
    public CustomerProblemStatus createCustomerProblemStatus() {
        return new CustomerProblemStatus();
    }

    /**
     * Create an instance of {@link Reason }
     * 
     */
    public Reason createReason() {
        return new Reason();
    }

    /**
     * Create an instance of {@link LocalReasonSpecification }
     * 
     */
    public LocalReasonSpecification createLocalReasonSpecification() {
        return new LocalReasonSpecification();
    }

    /**
     * Create an instance of {@link ResolutionAction }
     * 
     */
    public ResolutionAction createResolutionAction() {
        return new ResolutionAction();
    }

    /**
     * Create an instance of {@link Intervention }
     * 
     */
    public Intervention createIntervention() {
        return new Intervention();
    }

    /**
     * Create an instance of {@link DiagnosticAction }
     * 
     */
    public DiagnosticAction createDiagnosticAction() {
        return new DiagnosticAction();
    }

}
