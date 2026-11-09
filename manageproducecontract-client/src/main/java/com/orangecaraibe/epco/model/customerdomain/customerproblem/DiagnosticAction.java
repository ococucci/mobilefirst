
package com.orangecaraibe.epco.model.customerdomain.customerproblem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.orangecaraibe.epco.model.commonbusiness.party.role.PartyRole;


/**
 * <p>Java class for DiagnosticAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiagnosticAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actionID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isCustomerAction" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="actionRequestDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="actionEndDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="actionDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="actionResult" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="actionResultCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partyRole" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Party/Role}PartyRole" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosticAction", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem", propOrder = {
    "actionID",
    "isCustomerAction",
    "actionRequestDate",
    "actionEndDate",
    "actionDescription",
    "actionResult",
    "actionResultCode",
    "partyRole"
})
public class DiagnosticAction {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem", required = true)
    protected String actionID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem")
    protected boolean isCustomerAction;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actionRequestDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actionEndDate;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem", required = true)
    protected String actionDescription;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem", required = true)
    protected String actionResult;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem", required = true)
    protected String actionResultCode;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem")
    protected PartyRole partyRole;

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

}
