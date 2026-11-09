package com.orange.esim.client.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class StatusCodeData  {
  
  @ApiModelProperty(required = true, value = "OID of the subject code")
 /**
   * OID of the subject code
  **/
  private String subjectCode;

  @ApiModelProperty(required = true, value = "OID of the reason code")
 /**
   * OID of the reason code
  **/
  private String reasonCode;

  @ApiModelProperty(value = "Identifier of the subject")
 /**
   * Identifier of the subject
  **/
  private String subjectIdentifier;

  @ApiModelProperty(value = "Textual and human readable explanation")
 /**
   * Textual and human readable explanation
  **/
  private String message;
 /**
   * OID of the subject code
   * @return subjectCode
  **/
  @JsonProperty("subjectCode")
  public String getSubjectCode() {
    return subjectCode;
  }

  public void setSubjectCode(String subjectCode) {
    this.subjectCode = subjectCode;
  }

  public StatusCodeData subjectCode(String subjectCode) {
    this.subjectCode = subjectCode;
    return this;
  }

 /**
   * OID of the reason code
   * @return reasonCode
  **/
  @JsonProperty("reasonCode")
  public String getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }

  public StatusCodeData reasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

 /**
   * Identifier of the subject
   * @return subjectIdentifier
  **/
  @JsonProperty("subjectIdentifier")
  public String getSubjectIdentifier() {
    return subjectIdentifier;
  }

  public void setSubjectIdentifier(String subjectIdentifier) {
    this.subjectIdentifier = subjectIdentifier;
  }

  public StatusCodeData subjectIdentifier(String subjectIdentifier) {
    this.subjectIdentifier = subjectIdentifier;
    return this;
  }

 /**
   * Textual and human readable explanation
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public StatusCodeData message(String message) {
    this.message = message;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusCodeData statusCodeData = (StatusCodeData) o;
    return Objects.equals(subjectCode, statusCodeData.subjectCode) &&
        Objects.equals(reasonCode, statusCodeData.reasonCode) &&
        Objects.equals(subjectIdentifier, statusCodeData.subjectIdentifier) &&
        Objects.equals(message, statusCodeData.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subjectCode, reasonCode, subjectIdentifier, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusCodeData {\n");
    
    sb.append("    subjectCode: ").append(toIndentedString(subjectCode)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    subjectIdentifier: ").append(toIndentedString(subjectIdentifier)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

