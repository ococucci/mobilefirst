
package com.orangecaraibe.soa.v2.model.customerdomain.customerbilling.payment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.soa.v2.model.commonbusiness.location.Site;


/**
 * <p>Java class for LocalRefundSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocalRefundSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="site" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Location}Site" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="refundNature" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment}LocalRefundNature" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="refundFamily" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment}LocalRefundFamily" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalRefundSpecification", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment", propOrder = {
    "site",
    "refundNature",
    "refundFamily"
})
public class LocalRefundSpecification {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment", nillable = true)
    protected List<Site> site;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment", nillable = true)
    protected List<LocalRefundNature> refundNature;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerBilling/Payment", nillable = true)
    protected List<LocalRefundFamily> refundFamily;

    /**
     * Gets the value of the site property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the site property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Site }
     * 
     * 
     */
    public List<Site> getSite() {
        if (site == null) {
            site = new ArrayList<Site>();
        }
        return this.site;
    }

    /**
     * Gets the value of the refundNature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refundNature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefundNature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalRefundNature }
     * 
     * 
     */
    public List<LocalRefundNature> getRefundNature() {
        if (refundNature == null) {
            refundNature = new ArrayList<LocalRefundNature>();
        }
        return this.refundNature;
    }

    /**
     * Gets the value of the refundFamily property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refundFamily property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefundFamily().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalRefundFamily }
     * 
     * 
     */
    public List<LocalRefundFamily> getRefundFamily() {
        if (refundFamily == null) {
            refundFamily = new ArrayList<LocalRefundFamily>();
        }
        return this.refundFamily;
    }

}
