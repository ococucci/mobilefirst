
package com.orangecaraibe.soa.v2.model.customerdomain.customerproblem;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.orangecaraibe.soa.v2.model.commonbusiness.party.role.PartyRole;


/**
 * <p>Java class for ResolutionAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResolutionAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actionID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isCustomerAction" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="actionRequestDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="actionEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="actionDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="actionResult" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="actionResultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="intervention" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem}Intervention" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="partyRole" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role}PartyRole" minOccurs="0"/&gt;
 *         &lt;element name="localActionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResolutionAction", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem", propOrder = {
    "actionID",
    "isCustomerAction",
    "actionRequestDate",
    "actionEndDate",
    "actionDescription",
    "actionResult",
    "actionResultCode",
    "intervention",
    "partyRole",
    "localActionType"
})
public class ResolutionAction {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem", required = true)
    protected String actionID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem")
    protected boolean isCustomerAction;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actionRequestDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actionEndDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem", required = true)
    protected String actionDescription;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem", required = true)
    protected String actionResult;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem")
    protected String actionResultCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem", nillable = true)
    protected List<Intervention> intervention;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem")
    protected PartyRole partyRole;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem")
    protected String localActionType;

    /**
     * Gets the value of the actionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionID() {
        return actionID;
    }

    /**
     * Sets the value of the actionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionID(String value) {
        this.actionID = value;
    }

    /**
     * Gets the value of the isCustomerAction property.
     * 
     */
    public boolean isIsCustomerAction() {
        return isCustomerAction;
    }

    /**
     * Sets the value of the isCustomerAction property.
     * 
     */
    public void setIsCustomerAction(boolean value) {
        this.isCustomerAction = value;
    }

    /**
     * Gets the value of the actionRequestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActionRequestDate() {
        return actionRequestDate;
    }

    /**
     * Sets the value of the actionRequestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActionRequestDate(XMLGregorianCalendar value) {
        this.actionRequestDate = value;
    }

    /**
     * Gets the value of the actionEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActionEndDate() {
        return actionEndDate;
    }

    /**
     * Sets the value of the actionEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActionEndDate(XMLGregorianCalendar value) {
        this.actionEndDate = value;
    }

    /**
     * Gets the value of the actionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionDescription() {
        return actionDescription;
    }

    /**
     * Sets the value of the actionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionDescription(String value) {
        this.actionDescription = value;
    }

    /**
     * Gets the value of the actionResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionResult() {
        return actionResult;
    }

    /**
     * Sets the value of the actionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionResult(String value) {
        this.actionResult = value;
    }

    /**
     * Gets the value of the actionResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionResultCode() {
        return actionResultCode;
    }

    /**
     * Sets the value of the actionResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionResultCode(String value) {
        this.actionResultCode = value;
    }

    /**
     * Gets the value of the intervention property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intervention property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntervention().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intervention }
     * 
     * 
     */
    public List<Intervention> getIntervention() {
        if (intervention == null) {
            intervention = new ArrayList<Intervention>();
        }
        return this.intervention;
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
     * Gets the value of the localActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalActionType() {
        return localActionType;
    }

    /**
     * Sets the value of the localActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalActionType(String value) {
        this.localActionType = value;
    }

}
