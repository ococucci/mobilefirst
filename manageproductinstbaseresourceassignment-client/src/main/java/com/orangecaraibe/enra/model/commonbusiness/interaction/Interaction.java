
package com.orangecaraibe.enra.model.commonbusiness.interaction;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.orangecaraibe.enra.model.commonbusiness.party.contactmethods.ContactMethod;
import com.orangecaraibe.enra.model.commonbusiness.troubleticket.TroubleTicket;
import com.orangecaraibe.enra.model.customerdomain.customerproblem.CustomerProblem;
import com.orangecaraibe.enra.model.marketsales.marketingcampaigns.Media;


/**
 * <p>Java class for Interaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Interaction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="interactionID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="interactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="references" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}Interaction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="to" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}InteractionActor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="from" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}InteractionActor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="interactionRole" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}InteractionRole"/&gt;
 *         &lt;element name="interactionStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="interactionDateCompleted" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="media" type="{http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketingCampaigns}Media"/&gt;
 *         &lt;element name="details" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}InteractionDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="attachments" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}InteractionAttachmentImage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="interactionSubject" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}InteractionSubject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="localAsynchronous" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="interactionWay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toContactMethod" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods}ContactMethod"/&gt;
 *         &lt;element name="fromContactMethod" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods}ContactMethod"/&gt;
 *         &lt;element name="localCRMInteractionStatus" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}LocalCRMInteractionStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="localCustomerProblems" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem}CustomerProblem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="local_Comment" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}LocalComment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="localFunctionalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localExternalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Interaction", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", propOrder = {
    "interactionID",
    "interactionDate",
    "description",
    "references",
    "to",
    "from",
    "interactionRole",
    "interactionStatus",
    "interactionDateCompleted",
    "media",
    "details",
    "attachments",
    "interactionSubject",
    "localAsynchronous",
    "interactionWay",
    "localPriority",
    "toContactMethod",
    "fromContactMethod",
    "localCRMInteractionStatus",
    "localCustomerProblems",
    "localComment",
    "localFunctionalID",
    "localExternalID"
})
@XmlSeeAlso({
    TroubleTicket.class,
    CompositeInteraction.class,
    AtomicInteraction.class
})
public class Interaction {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", required = true)
    protected String interactionID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar interactionDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", required = true)
    protected String description;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", nillable = true)
    protected List<Interaction> references;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", nillable = true)
    protected List<InteractionActor> to;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", nillable = true)
    protected List<InteractionActor> from;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", required = true)
    protected InteractionRole interactionRole;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", required = true)
    protected String interactionStatus;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar interactionDateCompleted;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", required = true)
    protected Media media;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", nillable = true)
    protected List<InteractionDetail> details;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", nillable = true)
    protected List<InteractionAttachmentImage> attachments;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", nillable = true)
    protected List<InteractionSubject> interactionSubject;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction")
    protected Boolean localAsynchronous;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction")
    protected String interactionWay;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction")
    protected String localPriority;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", required = true)
    protected ContactMethod toContactMethod;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", required = true)
    protected ContactMethod fromContactMethod;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", nillable = true)
    protected List<LocalCRMInteractionStatus> localCRMInteractionStatus;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction", nillable = true)
    protected List<CustomerProblem> localCustomerProblems;
    @XmlElement(name = "local_Comment", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction")
    protected List<LocalComment> localComment;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction")
    protected String localFunctionalID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction")
    protected String localExternalID;

    /**
     * Gets the value of the interactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteractionID() {
        return interactionID;
    }

    /**
     * Sets the value of the interactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteractionID(String value) {
        this.interactionID = value;
    }

    /**
     * Gets the value of the interactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInteractionDate() {
        return interactionDate;
    }

    /**
     * Sets the value of the interactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInteractionDate(XMLGregorianCalendar value) {
        this.interactionDate = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the references property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the references property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Interaction }
     * 
     * 
     */
    public List<Interaction> getReferences() {
        if (references == null) {
            references = new ArrayList<Interaction>();
        }
        return this.references;
    }

    /**
     * Gets the value of the to property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the to property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InteractionActor }
     * 
     * 
     */
    public List<InteractionActor> getTo() {
        if (to == null) {
            to = new ArrayList<InteractionActor>();
        }
        return this.to;
    }

    /**
     * Gets the value of the from property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the from property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InteractionActor }
     * 
     * 
     */
    public List<InteractionActor> getFrom() {
        if (from == null) {
            from = new ArrayList<InteractionActor>();
        }
        return this.from;
    }

    /**
     * Gets the value of the interactionRole property.
     * 
     * @return
     *     possible object is
     *     {@link InteractionRole }
     *     
     */
    public InteractionRole getInteractionRole() {
        return interactionRole;
    }

    /**
     * Sets the value of the interactionRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractionRole }
     *     
     */
    public void setInteractionRole(InteractionRole value) {
        this.interactionRole = value;
    }

    /**
     * Gets the value of the interactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteractionStatus() {
        return interactionStatus;
    }

    /**
     * Sets the value of the interactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteractionStatus(String value) {
        this.interactionStatus = value;
    }

    /**
     * Gets the value of the interactionDateCompleted property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInteractionDateCompleted() {
        return interactionDateCompleted;
    }

    /**
     * Sets the value of the interactionDateCompleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInteractionDateCompleted(XMLGregorianCalendar value) {
        this.interactionDateCompleted = value;
    }

    /**
     * Gets the value of the media property.
     * 
     * @return
     *     possible object is
     *     {@link Media }
     *     
     */
    public Media getMedia() {
        return media;
    }

    /**
     * Sets the value of the media property.
     * 
     * @param value
     *     allowed object is
     *     {@link Media }
     *     
     */
    public void setMedia(Media value) {
        this.media = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the details property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InteractionDetail }
     * 
     * 
     */
    public List<InteractionDetail> getDetails() {
        if (details == null) {
            details = new ArrayList<InteractionDetail>();
        }
        return this.details;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InteractionAttachmentImage }
     * 
     * 
     */
    public List<InteractionAttachmentImage> getAttachments() {
        if (attachments == null) {
            attachments = new ArrayList<InteractionAttachmentImage>();
        }
        return this.attachments;
    }

    /**
     * Gets the value of the interactionSubject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interactionSubject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInteractionSubject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InteractionSubject }
     * 
     * 
     */
    public List<InteractionSubject> getInteractionSubject() {
        if (interactionSubject == null) {
            interactionSubject = new ArrayList<InteractionSubject>();
        }
        return this.interactionSubject;
    }

    /**
     * Gets the value of the localAsynchronous property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalAsynchronous() {
        return localAsynchronous;
    }

    /**
     * Sets the value of the localAsynchronous property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalAsynchronous(Boolean value) {
        this.localAsynchronous = value;
    }

    /**
     * Gets the value of the interactionWay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteractionWay() {
        return interactionWay;
    }

    /**
     * Sets the value of the interactionWay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteractionWay(String value) {
        this.interactionWay = value;
    }

    /**
     * Gets the value of the localPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalPriority() {
        return localPriority;
    }

    /**
     * Sets the value of the localPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalPriority(String value) {
        this.localPriority = value;
    }

    /**
     * Gets the value of the toContactMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ContactMethod }
     *     
     */
    public ContactMethod getToContactMethod() {
        return toContactMethod;
    }

    /**
     * Sets the value of the toContactMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMethod }
     *     
     */
    public void setToContactMethod(ContactMethod value) {
        this.toContactMethod = value;
    }

    /**
     * Gets the value of the fromContactMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ContactMethod }
     *     
     */
    public ContactMethod getFromContactMethod() {
        return fromContactMethod;
    }

    /**
     * Sets the value of the fromContactMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMethod }
     *     
     */
    public void setFromContactMethod(ContactMethod value) {
        this.fromContactMethod = value;
    }

    /**
     * Gets the value of the localCRMInteractionStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localCRMInteractionStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalCRMInteractionStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalCRMInteractionStatus }
     * 
     * 
     */
    public List<LocalCRMInteractionStatus> getLocalCRMInteractionStatus() {
        if (localCRMInteractionStatus == null) {
            localCRMInteractionStatus = new ArrayList<LocalCRMInteractionStatus>();
        }
        return this.localCRMInteractionStatus;
    }

    /**
     * Gets the value of the localCustomerProblems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localCustomerProblems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalCustomerProblems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerProblem }
     * 
     * 
     */
    public List<CustomerProblem> getLocalCustomerProblems() {
        if (localCustomerProblems == null) {
            localCustomerProblems = new ArrayList<CustomerProblem>();
        }
        return this.localCustomerProblems;
    }

    /**
     * Gets the value of the localComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalComment }
     * 
     * 
     */
    public List<LocalComment> getLocalComment() {
        if (localComment == null) {
            localComment = new ArrayList<LocalComment>();
        }
        return this.localComment;
    }

    /**
     * Gets the value of the localFunctionalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalFunctionalID() {
        return localFunctionalID;
    }

    /**
     * Sets the value of the localFunctionalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalFunctionalID(String value) {
        this.localFunctionalID = value;
    }

    /**
     * Gets the value of the localExternalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalExternalID() {
        return localExternalID;
    }

    /**
     * Sets the value of the localExternalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalExternalID(String value) {
        this.localExternalID = value;
    }

}
