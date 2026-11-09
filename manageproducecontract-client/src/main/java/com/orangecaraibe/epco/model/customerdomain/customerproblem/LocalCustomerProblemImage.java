
package com.orangecaraibe.epco.model.customerdomain.customerproblem;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orangecaraibe.epco.model.commonbusiness.interaction.LocalComment;
import com.orangecaraibe.epco.model.commons.Image;


/**
 * <p>Java class for LocalCustomerProblemImage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocalCustomerProblemImage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/Commons}Image"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="local_Comment" type="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Interaction}LocalComment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalCustomerProblemImage", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem", propOrder = {
    "localComment"
})
public class LocalCustomerProblemImage
    extends Image
{

    @XmlElement(name = "local_Comment", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CustomerDomain/CustomerProblem")
    protected List<LocalComment> localComment;

    /**
     * Gets the value of the localComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalComment }
     * 
     * 
     */
    public List<LocalComment> getLocalComment() {
        if (localComment == null) {
            localComment = new ArrayList<LocalComment>();
        }
        return this.localComment;
    }

}
