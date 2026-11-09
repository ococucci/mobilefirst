
package com.orangecaraibe.enra.model.commonbusiness.identity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoginPasswordCredential complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoginPasswordCredential"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity}Credential"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="secretQuestionAnswer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginPasswordCredential", namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity", propOrder = {
    "login",
    "password",
    "secretQuestionAnswer"
})
public class LoginPasswordCredential
    extends Credential
{

    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity", required = true)
    protected String login;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity", required = true)
    protected String password;
    @XmlElement(namespace = "http://www.orangecaraibe.com/soa/v2/Model/CommonBusiness/Identity")
    protected String secretQuestionAnswer;

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the secretQuestionAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecretQuestionAnswer() {
        return secretQuestionAnswer;
    }

    /**
     * Sets the value of the secretQuestionAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecretQuestionAnswer(String value) {
        this.secretQuestionAnswer = value;
    }

}
