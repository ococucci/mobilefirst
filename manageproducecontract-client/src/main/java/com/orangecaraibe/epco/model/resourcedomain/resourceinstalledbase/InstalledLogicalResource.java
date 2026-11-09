
package com.orangecaraibe.epco.model.resourcedomain.resourceinstalledbase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstalledLogicalResource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstalledLogicalResource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceInstalledBase}InstalledResource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lrStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstalledLogicalResource", namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceInstalledBase", propOrder = {
    "lrStatus"
})
public class InstalledLogicalResource
    extends InstalledResource
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/ResourceDomain/ResourceInstalledBase", required = true)
    protected String lrStatus;

    /**
     * Gets the value of the lrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLrStatus() {
        return lrStatus;
    }

    /**
     * Sets the value of the lrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLrStatus(String value) {
        this.lrStatus = value;
    }

}
