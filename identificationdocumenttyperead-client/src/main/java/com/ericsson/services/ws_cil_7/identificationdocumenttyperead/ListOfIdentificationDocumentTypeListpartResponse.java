
package com.ericsson.services.ws_cil_7.identificationdocumenttyperead;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listOfIdentificationDocumentTypeListpartResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listOfIdentificationDocumentTypeListpartResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="idtypeCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idtypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listOfIdentificationDocumentTypeListpartResponse", namespace = "http://ericsson.com/services/ws_CIL_7/identificationdocumenttyperead", propOrder = {

})
public class ListOfIdentificationDocumentTypeListpartResponse {

    @XmlElement(namespace = "http://ericsson.com/services/ws_CIL_7/identificationdocumenttyperead")
    protected Long idtypeCode;
    @XmlElement(namespace = "http://ericsson.com/services/ws_CIL_7/identificationdocumenttyperead")
    protected String idtypeName;

    /**
     * Gets the value of the idtypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdtypeCode() {
        return idtypeCode;
    }

    /**
     * Sets the value of the idtypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdtypeCode(Long value) {
        this.idtypeCode = value;
    }

    /**
     * Gets the value of the idtypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdtypeName() {
        return idtypeName;
    }

    /**
     * Sets the value of the idtypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdtypeName(String value) {
        this.idtypeName = value;
    }

}
