
package com.orangecaraibe.enra.model.customerdomain.customerproblem;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.orangecaraibe.enra.model.commonbusiness.interaction.Interaction;
import com.orangecaraibe.enra.model.commonbusiness.party.role.CustomerInterlocutor;
import com.orangecaraibe.enra.model.commonbusiness.party.role.CustomerServiceRepresentative;
import com.orangecaraibe.enra.model.commonbusiness.troubleticket.CollectiveTroubleTicket;
import com.orangecaraibe.enra.model.commonbusiness.troubleticket.ResourceTroubleTicket;
import com.orangecaraibe.enra.model.commonbusiness.troubleticket.TroubleTicket;
import com.orangecaraibe.enra.model.offeringandproducts.commercialcatalogue.CommercialClassification;
import com.orangecaraibe.enra.model.offeringandproducts.commercialinstalledbase.InstalledPublicKey;


/**
 * <p>Java class for CustomerProblem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProblem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/TroubleTicket}TroubleTicket"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateCreation" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="dateTroubleDetection" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="dateRepairEstimated" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="customerProblemStatus" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem}CustomerProblemStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="installedPublicKey" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialInstalledBase}InstalledPublicKey" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="interaction" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}Interaction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="reason" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem}Reason" minOccurs="0"/&gt;
 *         &lt;element name="resourceTroubleTicket" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/TroubleTicket}ResourceTroubleTicket" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CFSTroubleTicket" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/TroubleTicket}TroubleTicket" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="collectiveTroubleTicket" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/TroubleTicket}CollectiveTroubleTicket" minOccurs="0"/&gt;
 *         &lt;element name="customerServiceRepresentative" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role}CustomerServiceRepresentative" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="customerInterlocutor" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role}CustomerInterlocutor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="resolvesBy" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem}ResolutionAction" minOccurs="0"/&gt;
 *         &lt;element name="treatedBy" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem}ResolutionAction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="localCommercialClassifications" type="{http://www.orangecaraibe.com/soa/v2/Model/OfferingAndProducts/CommercialCatalogue}CommercialClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="localCustomerProblemImages" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem}LocalCustomerProblemImage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="localTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localKeyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProblem", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem", propOrder = {
    "priority",
    "dateCreation",
    "dateTroubleDetection",
    "dateRepairEstimated",
    "customerProblemStatus",
    "installedPublicKey",
    "interaction",
    "reason",
    "resourceTroubleTicket",
    "cfsTroubleTicket",
    "collectiveTroubleTicket",
    "customerServiceRepresentative",
    "customerInterlocutor",
    "resolvesBy",
    "treatedBy",
    "localCommercialClassifications",
    "localCustomerProblemImages",
    "localTitle",
    "localKeyword"
})
public class CustomerProblem
    extends TroubleTicket
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem")
    protected String priority;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateCreation;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateTroubleDetection;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateRepairEstimated;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem", nillable = true)
    protected List<CustomerProblemStatus> customerProblemStatus;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem", nillable = true)
    protected List<InstalledPublicKey> installedPublicKey;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem", nillable = true)
    protected List<Interaction> interaction;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem")
    protected Reason reason;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem", nillable = true)
    protected List<ResourceTroubleTicket> resourceTroubleTicket;
    @XmlElement(name = "CFSTroubleTicket", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem")
    protected List<TroubleTicket> cfsTroubleTicket;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem")
    protected CollectiveTroubleTicket collectiveTroubleTicket;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem", nillable = true)
    protected List<CustomerServiceRepresentative> customerServiceRepresentative;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem", nillable = true)
    protected List<CustomerInterlocutor> customerInterlocutor;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem")
    protected ResolutionAction resolvesBy;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem", nillable = true)
    protected List<ResolutionAction> treatedBy;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem", nillable = true)
    protected List<CommercialClassification> localCommercialClassifications;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem", nillable = true)
    protected List<LocalCustomerProblemImage> localCustomerProblemImages;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem")
    protected String localTitle;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem")
    protected String localKeyword;

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the dateCreation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreation() {
        return dateCreation;
    }

    /**
     * Sets the value of the dateCreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreation(XMLGregorianCalendar value) {
        this.dateCreation = value;
    }

    /**
     * Gets the value of the dateTroubleDetection property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTroubleDetection() {
        return dateTroubleDetection;
    }

    /**
     * Sets the value of the dateTroubleDetection property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTroubleDetection(XMLGregorianCalendar value) {
        this.dateTroubleDetection = value;
    }

    /**
     * Gets the value of the dateRepairEstimated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateRepairEstimated() {
        return dateRepairEstimated;
    }

    /**
     * Sets the value of the dateRepairEstimated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateRepairEstimated(XMLGregorianCalendar value) {
        this.dateRepairEstimated = value;
    }

    /**
     * Gets the value of the customerProblemStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerProblemStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerProblemStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerProblemStatus }
     * 
     * 
     */
    public List<CustomerProblemStatus> getCustomerProblemStatus() {
        if (customerProblemStatus == null) {
            customerProblemStatus = new ArrayList<CustomerProblemStatus>();
        }
        return this.customerProblemStatus;
    }

    /**
     * Gets the value of the installedPublicKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installedPublicKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstalledPublicKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstalledPublicKey }
     * 
     * 
     */
    public List<InstalledPublicKey> getInstalledPublicKey() {
        if (installedPublicKey == null) {
            installedPublicKey = new ArrayList<InstalledPublicKey>();
        }
        return this.installedPublicKey;
    }

    /**
     * Gets the value of the interaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInteraction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Interaction }
     * 
     * 
     */
    public List<Interaction> getInteraction() {
        if (interaction == null) {
            interaction = new ArrayList<Interaction>();
        }
        return this.interaction;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link Reason }
     *     
     */
    public Reason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reason }
     *     
     */
    public void setReason(Reason value) {
        this.reason = value;
    }

    /**
     * Gets the value of the resourceTroubleTicket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceTroubleTicket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceTroubleTicket().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceTroubleTicket }
     * 
     * 
     */
    public List<ResourceTroubleTicket> getResourceTroubleTicket() {
        if (resourceTroubleTicket == null) {
            resourceTroubleTicket = new ArrayList<ResourceTroubleTicket>();
        }
        return this.resourceTroubleTicket;
    }

    /**
     * Gets the value of the cfsTroubleTicket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cfsTroubleTicket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCFSTroubleTicket().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TroubleTicket }
     * 
     * 
     */
    public List<TroubleTicket> getCFSTroubleTicket() {
        if (cfsTroubleTicket == null) {
            cfsTroubleTicket = new ArrayList<TroubleTicket>();
        }
        return this.cfsTroubleTicket;
    }

    /**
     * Gets the value of the collectiveTroubleTicket property.
     * 
     * @return
     *     possible object is
     *     {@link CollectiveTroubleTicket }
     *     
     */
    public CollectiveTroubleTicket getCollectiveTroubleTicket() {
        return collectiveTroubleTicket;
    }

    /**
     * Sets the value of the collectiveTroubleTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectiveTroubleTicket }
     *     
     */
    public void setCollectiveTroubleTicket(CollectiveTroubleTicket value) {
        this.collectiveTroubleTicket = value;
    }

    /**
     * Gets the value of the customerServiceRepresentative property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerServiceRepresentative property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerServiceRepresentative().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerServiceRepresentative }
     * 
     * 
     */
    public List<CustomerServiceRepresentative> getCustomerServiceRepresentative() {
        if (customerServiceRepresentative == null) {
            customerServiceRepresentative = new ArrayList<CustomerServiceRepresentative>();
        }
        return this.customerServiceRepresentative;
    }

    /**
     * Gets the value of the customerInterlocutor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerInterlocutor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerInterlocutor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerInterlocutor }
     * 
     * 
     */
    public List<CustomerInterlocutor> getCustomerInterlocutor() {
        if (customerInterlocutor == null) {
            customerInterlocutor = new ArrayList<CustomerInterlocutor>();
        }
        return this.customerInterlocutor;
    }

    /**
     * Gets the value of the resolvesBy property.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionAction }
     *     
     */
    public ResolutionAction getResolvesBy() {
        return resolvesBy;
    }

    /**
     * Sets the value of the resolvesBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionAction }
     *     
     */
    public void setResolvesBy(ResolutionAction value) {
        this.resolvesBy = value;
    }

    /**
     * Gets the value of the treatedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the treatedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTreatedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResolutionAction }
     * 
     * 
     */
    public List<ResolutionAction> getTreatedBy() {
        if (treatedBy == null) {
            treatedBy = new ArrayList<ResolutionAction>();
        }
        return this.treatedBy;
    }

    /**
     * Gets the value of the localCommercialClassifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localCommercialClassifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalCommercialClassifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommercialClassification }
     * 
     * 
     */
    public List<CommercialClassification> getLocalCommercialClassifications() {
        if (localCommercialClassifications == null) {
            localCommercialClassifications = new ArrayList<CommercialClassification>();
        }
        return this.localCommercialClassifications;
    }

    /**
     * Gets the value of the localCustomerProblemImages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localCustomerProblemImages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalCustomerProblemImages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalCustomerProblemImage }
     * 
     * 
     */
    public List<LocalCustomerProblemImage> getLocalCustomerProblemImages() {
        if (localCustomerProblemImages == null) {
            localCustomerProblemImages = new ArrayList<LocalCustomerProblemImage>();
        }
        return this.localCustomerProblemImages;
    }

    /**
     * Gets the value of the localTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTitle() {
        return localTitle;
    }

    /**
     * Sets the value of the localTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTitle(String value) {
        this.localTitle = value;
    }

    /**
     * Gets the value of the localKeyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalKeyword() {
        return localKeyword;
    }

    /**
     * Sets the value of the localKeyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalKeyword(String value) {
        this.localKeyword = value;
    }

}
