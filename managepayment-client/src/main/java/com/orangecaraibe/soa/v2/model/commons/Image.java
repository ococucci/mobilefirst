
package com.orangecaraibe.soa.v2.model.commons;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.soa.v2.model.commonbusiness.interaction.InteractionAttachmentImage;
import com.orangecaraibe.soa.v2.model.customerdomain.customerbilling.payment.PaymentImage;
import com.orangecaraibe.soa.v2.model.customerdomain.customerproblem.LocalCustomerProblemImage;
import com.orangecaraibe.soa.v2.model.customerdomain.invoicing.InvoiceImage;
import com.orangecaraibe.soa.v2.model.offeringandproducts.commercialcatalogue.OfferImage;
import com.orangecaraibe.soa.v2.model.offeringandproducts.commercialinstalledbase.OfferTermsAndConditionsImage;
import com.orangecaraibe.soa.v2.model.offeringandproducts.productcatalogue.ProductImage;


/**
 * <p>Java class for Image complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Image"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="imageSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="imageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imageLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="binaryData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="imageMimeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Image", namespace = "http://www.orangecaraibe.com/soa/v2/Model/Commons", propOrder = {
    "imageSize",
    "imageName",
    "imageLink",
    "binaryData",
    "imageMimeType"
})
@XmlSeeAlso({
    ProductImage.class,
    OfferTermsAndConditionsImage.class,
    OfferImage.class,
    InvoiceImage.class,
    LocalCustomerProblemImage.class,
    PaymentImage.class,
    InteractionAttachmentImage.class
})
public class Image {

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/Commons")
    protected Long imageSize;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/Commons")
    protected String imageName;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/Commons")
    protected String imageLink;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/Commons")
    @XmlMimeType("application/octet-stream")
    protected DataHandler binaryData;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/Commons")
    protected String imageMimeType;

    /**
     * Gets the value of the imageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImageSize() {
        return imageSize;
    }

    /**
     * Sets the value of the imageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImageSize(Long value) {
        this.imageSize = value;
    }

    /**
     * Gets the value of the imageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageName() {
        return imageName;
    }

    /**
     * Sets the value of the imageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageName(String value) {
        this.imageName = value;
    }

    /**
     * Gets the value of the imageLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageLink() {
        return imageLink;
    }

    /**
     * Sets the value of the imageLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageLink(String value) {
        this.imageLink = value;
    }

    /**
     * Gets the value of the binaryData property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getBinaryData() {
        return binaryData;
    }

    /**
     * Sets the value of the binaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setBinaryData(DataHandler value) {
        this.binaryData = value;
    }

    /**
     * Gets the value of the imageMimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageMimeType() {
        return imageMimeType;
    }

    /**
     * Sets the value of the imageMimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageMimeType(String value) {
        this.imageMimeType = value;
    }

}
