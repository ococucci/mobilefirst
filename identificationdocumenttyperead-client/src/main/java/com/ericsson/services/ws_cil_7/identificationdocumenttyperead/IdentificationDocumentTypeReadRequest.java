
package com.ericsson.services.ws_cil_7.identificationdocumenttyperead;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ericsson.services.ws_cil_7.sessionchange.SessionChangeRequest;


/**
 * <p>Java class for identificationDocumentTypeReadRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="identificationDocumentTypeReadRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="sessionChangeRequest" type="{http://ericsson.com/services/ws_CIL_7/sessionchange}sessionChangeRequest" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identificationDocumentTypeReadRequest", namespace = "http://ericsson.com/services/ws_CIL_7/identificationdocumenttyperead", propOrder = {

})
public class IdentificationDocumentTypeReadRequest {

    @XmlElement(namespace = "http://ericsson.com/services/ws_CIL_7/identificationdocumenttyperead")
    protected SessionChangeRequest sessionChangeRequest;

    /**
     * Gets the value of the sessionChangeRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SessionChangeRequest }
     *     
     */
    public SessionChangeRequest getSessionChangeRequest() {
        return sessionChangeRequest;
    }

    /**
     * Sets the value of the sessionChangeRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionChangeRequest }
     *     
     */
    public void setSessionChangeRequest(SessionChangeRequest value) {
        this.sessionChangeRequest = value;
    }

}
