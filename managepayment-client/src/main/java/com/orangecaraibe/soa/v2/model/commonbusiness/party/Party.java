
package com.orangecaraibe.soa.v2.model.commonbusiness.party;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.orangecaraibe.soa.v2.model.commonbusiness.identity.PartyIdentification;
import com.orangecaraibe.soa.v2.model.commonbusiness.interaction.InteractionSubject;
import com.orangecaraibe.soa.v2.model.commonbusiness.party.contactmethods.ContactMethod;
import com.orangecaraibe.soa.v2.model.commonbusiness.party.role.Distributor;
import com.orangecaraibe.soa.v2.model.commonbusiness.party.role.Operator;
import com.orangecaraibe.soa.v2.model.commonbusiness.party.role.PartyRole;
import com.orangecaraibe.soa.v2.model.customerdomain.customerbilling.BillingAccount;
import com.orangecaraibe.soa.v2.model.marketsales.marketsegment.MarketSegment;


/**
 * <p>Java class for Party complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Party"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}InteractionSubject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marketSegment" type="{http://www.orangecaraibe.com/soa/v2/Model/MarketSales/MarketSegment}MarketSegment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="partyIdentification" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity}PartyIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="partyExternalIdentification" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party}PartyExternalIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="referential" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partyName" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party}PartyName"/&gt;
 *         &lt;element name="partyTemporaryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isCheckAuthorisationGiven" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="partyStatus" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party}PartyStatus" maxOccurs="unbounded"/&gt;
 *         &lt;element name="operator" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role}Operator" minOccurs="0"/&gt;
 *         &lt;element name="distributor" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role}Distributor" minOccurs="0"/&gt;
 *         &lt;element name="contactMethods" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/ContactMethods}ContactMethod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="partyRoles" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role}PartyRole" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="localMarketingAgreement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="localBillingAccount" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling}BillingAccount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="localLastCheckDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="legalStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localLegalStatusRepresentative" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="localJudgementDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", propOrder = {
    "partyID",
    "marketSegment",
    "partyIdentification",
    "partyExternalIdentification",
    "code",
    "referential",
    "partyName",
    "partyTemporaryID",
    "isCheckAuthorisationGiven",
    "partyStatus",
    "operator",
    "distributor",
    "contactMethods",
    "partyRoles",
    "creationDate",
    "localMarketingAgreement",
    "localBillingAccount",
    "localLastCheckDate",
    "legalStatusCode",
    "localLegalStatusRepresentative",
    "localJudgementDate"
})
@XmlSeeAlso({
    Person.class,
    Organisation.class
})
public class Party
    extends InteractionSubject
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
    protected String partyID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", nillable = true)
    protected List<MarketSegment> marketSegment;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", nillable = true)
    protected List<PartyIdentification> partyIdentification;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", nillable = true)
    protected List<PartyExternalIdentification> partyExternalIdentification;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", required = true)
    protected String code;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", required = true)
    protected String referential;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", required = true)
    protected PartyName partyName;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
    protected String partyTemporaryID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
    protected Boolean isCheckAuthorisationGiven;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", required = true)
    protected List<PartyStatus> partyStatus;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
    protected Operator operator;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
    protected Distributor distributor;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", nillable = true)
    protected List<ContactMethod> contactMethods;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", nillable = true)
    protected List<PartyRole> partyRoles;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
    protected Boolean localMarketingAgreement;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", nillable = true)
    protected List<BillingAccount> localBillingAccount;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar localLastCheckDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party")
    protected String legalStatusCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", required = true)
    protected String localLegalStatusRepresentative;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar localJudgementDate;

    /**
     * Gets the value of the partyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyID() {
        return partyID;
    }

    /**
     * Sets the value of the partyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyID(String value) {
        this.partyID = value;
    }

    /**
     * Gets the value of the marketSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketSegment }
     * 
     * 
     */
    public List<MarketSegment> getMarketSegment() {
        if (marketSegment == null) {
            marketSegment = new ArrayList<MarketSegment>();
        }
        return this.marketSegment;
    }

    /**
     * Gets the value of the partyIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification }
     * 
     * 
     */
    public List<PartyIdentification> getPartyIdentification() {
        if (partyIdentification == null) {
            partyIdentification = new ArrayList<PartyIdentification>();
        }
        return this.partyIdentification;
    }

    /**
     * Gets the value of the partyExternalIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyExternalIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyExternalIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyExternalIdentification }
     * 
     * 
     */
    public List<PartyExternalIdentification> getPartyExternalIdentification() {
        if (partyExternalIdentification == null) {
            partyExternalIdentification = new ArrayList<PartyExternalIdentification>();
        }
        return this.partyExternalIdentification;
    }

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
     * Gets the value of the referential property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferential() {
        return referential;
    }

    /**
     * Sets the value of the referential property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferential(String value) {
        this.referential = value;
    }

    /**
     * Gets the value of the partyName property.
     * 
     * @return
     *     possible object is
     *     {@link PartyName }
     *     
     */
    public PartyName getPartyName() {
        return partyName;
    }

    /**
     * Sets the value of the partyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyName }
     *     
     */
    public void setPartyName(PartyName value) {
        this.partyName = value;
    }

    /**
     * Gets the value of the partyTemporaryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyTemporaryID() {
        return partyTemporaryID;
    }

    /**
     * Sets the value of the partyTemporaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyTemporaryID(String value) {
        this.partyTemporaryID = value;
    }

    /**
     * Gets the value of the isCheckAuthorisationGiven property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCheckAuthorisationGiven() {
        return isCheckAuthorisationGiven;
    }

    /**
     * Sets the value of the isCheckAuthorisationGiven property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCheckAuthorisationGiven(Boolean value) {
        this.isCheckAuthorisationGiven = value;
    }

    /**
     * Gets the value of the partyStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyStatus }
     * 
     * 
     */
    public List<PartyStatus> getPartyStatus() {
        if (partyStatus == null) {
            partyStatus = new ArrayList<PartyStatus>();
        }
        return this.partyStatus;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link Operator }
     *     
     */
    public Operator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operator }
     *     
     */
    public void setOperator(Operator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the distributor property.
     * 
     * @return
     *     possible object is
     *     {@link Distributor }
     *     
     */
    public Distributor getDistributor() {
        return distributor;
    }

    /**
     * Sets the value of the distributor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distributor }
     *     
     */
    public void setDistributor(Distributor value) {
        this.distributor = value;
    }

    /**
     * Gets the value of the contactMethods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactMethods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactMethods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactMethod }
     * 
     * 
     */
    public List<ContactMethod> getContactMethods() {
        if (contactMethods == null) {
            contactMethods = new ArrayList<ContactMethod>();
        }
        return this.contactMethods;
    }

    /**
     * Gets the value of the partyRoles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyRoles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyRole }
     * 
     * 
     */
    public List<PartyRole> getPartyRoles() {
        if (partyRoles == null) {
            partyRoles = new ArrayList<PartyRole>();
        }
        return this.partyRoles;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the localMarketingAgreement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalMarketingAgreement() {
        return localMarketingAgreement;
    }

    /**
     * Sets the value of the localMarketingAgreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalMarketingAgreement(Boolean value) {
        this.localMarketingAgreement = value;
    }

    /**
     * Gets the value of the localBillingAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localBillingAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalBillingAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingAccount }
     * 
     * 
     */
    public List<BillingAccount> getLocalBillingAccount() {
        if (localBillingAccount == null) {
            localBillingAccount = new ArrayList<BillingAccount>();
        }
        return this.localBillingAccount;
    }

    /**
     * Gets the value of the localLastCheckDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocalLastCheckDate() {
        return localLastCheckDate;
    }

    /**
     * Sets the value of the localLastCheckDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocalLastCheckDate(XMLGregorianCalendar value) {
        this.localLastCheckDate = value;
    }

    /**
     * Gets the value of the legalStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalStatusCode() {
        return legalStatusCode;
    }

    /**
     * Sets the value of the legalStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalStatusCode(String value) {
        this.legalStatusCode = value;
    }

    /**
     * Gets the value of the localLegalStatusRepresentative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalLegalStatusRepresentative() {
        return localLegalStatusRepresentative;
    }

    /**
     * Sets the value of the localLegalStatusRepresentative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalLegalStatusRepresentative(String value) {
        this.localLegalStatusRepresentative = value;
    }

    /**
     * Gets the value of the localJudgementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocalJudgementDate() {
        return localJudgementDate;
    }

    /**
     * Sets the value of the localJudgementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocalJudgementDate(XMLGregorianCalendar value) {
        this.localJudgementDate = value;
    }

}
