
package com.orangecaraibe.soa.v2.model.commons.exception;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.soa.v2.interfaces.managepayment.schemas.CancelPaymentFacilityFault;
import com.orangecaraibe.soa.v2.interfaces.managepayment.schemas.CancelPaymentFault;
import com.orangecaraibe.soa.v2.interfaces.managepayment.schemas.CreatePaymentFacilityFault;
import com.orangecaraibe.soa.v2.interfaces.managepayment.schemas.DoPaymentFault;
import com.orangecaraibe.soa.v2.interfaces.managepayment.schemas.ExecutePaymentFault;
import com.orangecaraibe.soa.v2.interfaces.managepayment.schemas.ExecuteRefundFault;
import com.orangecaraibe.soa.v2.interfaces.managepayment.schemas.FindAndGetPaymentFacilityFault;
import com.orangecaraibe.soa.v2.interfaces.managepayment.schemas.FindAndGetPaymentFault;
import com.orangecaraibe.soa.v2.interfaces.managepayment.schemas.FindAndGetRefundFault;
import com.orangecaraibe.soa.v2.interfaces.managepayment.schemas.FindAndGetRefundSpecificationFault;
import com.orangecaraibe.soa.v2.interfaces.managepayment.schemas.GetPaymentAuthorizationFault;
import com.orangecaraibe.soa.v2.interfaces.managepayment.schemas.PreparePaymentFault;
import com.orangecaraibe.soa.v2.interfaces.managepayment.schemas.SetPaymentFault;
import com.orangecaraibe.soa.v2.interfaces.managepayment.schemas.UpdatePaymentFault;
import com.orangecaraibe.soa.v2.interfaces.manageresourceinstalledbase.schemas.FindAndGetFault;
import com.orangecaraibe.soa.v2.interfaces.manageresourceinstalledbase.schemas.InstallFault;
import com.orangecaraibe.soa.v2.interfaces.manageresourceinstalledbase.schemas.UpdateFault;
import com.orangecaraibe.soa.v2.interfaces.managestock.schemas.CheckDeliveryOrderFault;
import com.orangecaraibe.soa.v2.interfaces.managestock.schemas.CheckResourceInStockFault;
import com.orangecaraibe.soa.v2.interfaces.managestock.schemas.ReserveResourceInStockFault;


/**
 * <p>Java class for Fault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="faultDetail" type="{http://www.orangecaraibe.com/soa/v2/Model/Commons/Exception}FaultDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="localCriticity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fault", namespace = "http://www.orangecaraibe.com/soa/v2/Model/Commons/Exception", propOrder = {
    "label",
    "faultDetail",
    "code",
    "localCriticity"
})
@XmlSeeAlso({
    CheckDeliveryOrderFault.class,
    CheckResourceInStockFault.class,
    com.orangecaraibe.soa.v2.interfaces.managestock.schemas.InterfaceUnavailableFault.class,
    ReserveResourceInStockFault.class,
    FindAndGetFault.class,
    InstallFault.class,
    com.orangecaraibe.soa.v2.interfaces.manageresourceinstalledbase.schemas.InterfaceUnavailableFault.class,
    UpdateFault.class,
    CancelPaymentFacilityFault.class,
    CancelPaymentFault.class,
    CreatePaymentFacilityFault.class,
    DoPaymentFault.class,
    ExecutePaymentFault.class,
    ExecuteRefundFault.class,
    FindAndGetPaymentFacilityFault.class,
    FindAndGetPaymentFault.class,
    FindAndGetRefundFault.class,
    FindAndGetRefundSpecificationFault.class,
    GetPaymentAuthorizationFault.class,
    com.orangecaraibe.soa.v2.interfaces.managepayment.schemas.InterfaceUnavailableFault.class,
    PreparePaymentFault.class,
    SetPaymentFault.class,
    UpdatePaymentFault.class
})
public class Fault {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/Commons/Exception", required = true)
    protected String label;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/Commons/Exception", nillable = true)
    protected List<FaultDetail> faultDetail;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/Commons/Exception", required = true)
    protected String code;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/Commons/Exception")
    protected String localCriticity;

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
     * Gets the value of the faultDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faultDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaultDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FaultDetail }
     * 
     * 
     */
    public List<FaultDetail> getFaultDetail() {
        if (faultDetail == null) {
            faultDetail = new ArrayList<FaultDetail>();
        }
        return this.faultDetail;
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
     * Gets the value of the localCriticity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalCriticity() {
        return localCriticity;
    }

    /**
     * Sets the value of the localCriticity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalCriticity(String value) {
        this.localCriticity = value;
    }

}
