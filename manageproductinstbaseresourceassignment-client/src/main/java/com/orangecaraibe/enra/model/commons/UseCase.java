
package com.orangecaraibe.enra.model.commons;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UseCase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UseCase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="useCaseID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UseCase", namespace = "http://www.orangecaraibe.com/soa/v2/Model/Commons", propOrder = {
    "useCaseID"
})
public class UseCase {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/Commons", required = true)
    protected String useCaseID;

    /**
     * Gets the value of the useCaseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseCaseID() {
        return useCaseID;
    }

    /**
     * Sets the value of the useCaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseCaseID(String value) {
        this.useCaseID = value;
    }

}
