
package com.orangecaraibe.enra.model.resourcedomain.resourceinstalledbase;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.enra.model.commonbusiness.interaction.InteractionSubject;
import com.orangecaraibe.enra.model.resourcedomain.resourcecatalogue.ResourceSpecification;


/**
 * <p>Java class for InstalledResource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstalledResource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}InteractionSubject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="installedResourceID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resourceSpecification" type="{http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceCatalogue}ResourceSpecification"/&gt;
 *         &lt;element name="installedResourceCharacteristicValues" type="{http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceInstalledBase}InstalledResourceCharacteristicValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstalledResource", namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceInstalledBase", propOrder = {
    "installedResourceID",
    "resourceSpecification",
    "installedResourceCharacteristicValues"
})
@XmlSeeAlso({
    InstalledLogicalResource.class,
    InstalledPhysicalResource.class
})
public class InstalledResource
    extends InteractionSubject
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceInstalledBase", required = true)
    protected String installedResourceID;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceInstalledBase", required = true)
    protected ResourceSpecification resourceSpecification;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceInstalledBase", nillable = true)
    protected List<InstalledResourceCharacteristicValue> installedResourceCharacteristicValues;

    /**
     * Gets the value of the installedResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstalledResourceID() {
        return installedResourceID;
    }

    /**
     * Sets the value of the installedResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstalledResourceID(String value) {
        this.installedResourceID = value;
    }

    /**
     * Gets the value of the resourceSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceSpecification }
     *     
     */
    public ResourceSpecification getResourceSpecification() {
        return resourceSpecification;
    }

    /**
     * Sets the value of the resourceSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceSpecification }
     *     
     */
    public void setResourceSpecification(ResourceSpecification value) {
        this.resourceSpecification = value;
    }

    /**
     * Gets the value of the installedResourceCharacteristicValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installedResourceCharacteristicValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstalledResourceCharacteristicValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstalledResourceCharacteristicValue }
     * 
     * 
     */
    public List<InstalledResourceCharacteristicValue> getInstalledResourceCharacteristicValues() {
        if (installedResourceCharacteristicValues == null) {
            installedResourceCharacteristicValues = new ArrayList<InstalledResourceCharacteristicValue>();
        }
        return this.installedResourceCharacteristicValues;
    }

}
