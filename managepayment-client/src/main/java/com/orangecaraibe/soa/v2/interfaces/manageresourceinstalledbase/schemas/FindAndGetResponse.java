
package com.orangecaraibe.soa.v2.interfaces.manageresourceinstalledbase.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.soa.v2.model.resourcedomain.resourceinstalledbase.InstalledResource;


/**
 * <p>Java class for FindAndGetResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindAndGetResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="installedResources" type="{http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceInstalledBase}InstalledResource" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindAndGetResponse", namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageResourceInstalledBase/Schemas", propOrder = {
    "installedResources"
})
public class FindAndGetResponse {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Interfaces/ManageResourceInstalledBase/Schemas", nillable = true)
    protected List<InstalledResource> installedResources;

    /**
     * Gets the value of the installedResources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installedResources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstalledResources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstalledResource }
     * 
     * 
     */
    public List<InstalledResource> getInstalledResources() {
        if (installedResources == null) {
            installedResources = new ArrayList<InstalledResource>();
        }
        return this.installedResources;
    }

}
