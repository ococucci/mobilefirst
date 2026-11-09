
package com.orangecaraibe.enra.model.commonbusiness.interaction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.orangecaraibe.enra.model.commonbusiness.party.role.PartyRole;


/**
 * <p>Java class for LocalComment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocalComment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="partyRole" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role}PartyRole" minOccurs="0"/&gt;
 *         &lt;element name="commentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalComment", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", propOrder = {
    "code",
    "label",
    "operationType",
    "partyRole",
    "commentDate",
    "subject"
})
public class LocalComment {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction")
    protected String code;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction")
    protected String label;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction")
    protected String operationType;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction")
    protected PartyRole partyRole;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar commentDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction")
    protected String subject;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationType(String value) {
        this.operationType = value;
    }

    /**
     * Gets the value of the partyRole property.
     * 
     * @return
     *     possible object is
     *     {@link PartyRole }
     *     
     */
    public PartyRole getPartyRole() {
        return partyRole;
    }

    /**
     * Sets the value of the partyRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRole }
     *     
     */
    public void setPartyRole(PartyRole value) {
        this.partyRole = value;
    }

    /**
     * Gets the value of the commentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommentDate() {
        return commentDate;
    }

    /**
     * Sets the value of the commentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCommentDate(XMLGregorianCalendar value) {
        this.commentDate = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

}
