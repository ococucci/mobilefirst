
package com.ericsson.services.ws_cil_7.identificationdocumenttyperead;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 					<p></p>
 * 				
 * 
 * <p>Java class for identificationDocumentTypeReadResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="identificationDocumentTypeReadResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="listOfIdentificationDocumentType" type="{http://ericsson.com/services/ws_CIL_7/identificationdocumenttyperead}listOfIdentificationDocumentTypeResponse" minOccurs="0"/&gt;
 *         &lt;element name="idtypeDef" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identificationDocumentTypeReadResponse", namespace = "http://ericsson.com/services/ws_CIL_7/identificationdocumenttyperead", propOrder = {

})
public class IdentificationDocumentTypeReadResponse {

    @XmlElement(namespace = "http://ericsson.com/services/ws_CIL_7/identificationdocumenttyperead")
    protected ListOfIdentificationDocumentTypeResponse listOfIdentificationDocumentType;
    @XmlElement(namespace = "http://ericsson.com/services/ws_CIL_7/identificationdocumenttyperead")
    protected Long idtypeDef;

    /**
     * Gets the value of the listOfIdentificationDocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfIdentificationDocumentTypeResponse }
     *     
     */
    public ListOfIdentificationDocumentTypeResponse getListOfIdentificationDocumentType() {
        return listOfIdentificationDocumentType;
    }

    /**
     * Sets the value of the listOfIdentificationDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfIdentificationDocumentTypeResponse }
     *     
     */
    public void setListOfIdentificationDocumentType(ListOfIdentificationDocumentTypeResponse value) {
        this.listOfIdentificationDocumentType = value;
    }

    /**
     * Gets the value of the idtypeDef property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdtypeDef() {
        return idtypeDef;
    }

    /**
     * Sets the value of the idtypeDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdtypeDef(Long value) {
        this.idtypeDef = value;
    }

}
