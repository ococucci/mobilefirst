
package com.orangecaraibe.epco.interfaces.manageproducecontract.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.epco.model.commons.UseCase;
import com.orangecaraibe.epco.model.customerdomain.managecustomerorder.CustomerOrder;


/**
 * <p>Java class for UpdateContract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateContract"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerOrder" type="{http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/ManageCustomerOrder}CustomerOrder" maxOccurs="unbounded"/&gt;
 *         &lt;element name="useCase" type="{http://www.orangecaraibe.com/soa/v2/Model/Commons}UseCase"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateContract", namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageProduceContract/Schemas", propOrder = {
    "customerOrder",
    "useCase"
})
public class UpdateContract {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageProduceContract/Schemas", required = true)
    protected List<CustomerOrder> customerOrder;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageProduceContract/Schemas", required = true)
    protected UseCase useCase;

    /**
     * Gets the value of the customerOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerOrder }
     * 
     * 
     */
    public List<CustomerOrder> getCustomerOrder() {
        if (customerOrder == null) {
            customerOrder = new ArrayList<CustomerOrder>();
        }
        return this.customerOrder;
    }

    /**
     * Gets the value of the useCase property.
     * 
     * @return
     *     possible object is
     *     {@link UseCase }
     *     
     */
    public UseCase getUseCase() {
        return useCase;
    }

    /**
     * Sets the value of the useCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link UseCase }
     *     
     */
    public void setUseCase(UseCase value) {
        this.useCase = value;
    }

}
