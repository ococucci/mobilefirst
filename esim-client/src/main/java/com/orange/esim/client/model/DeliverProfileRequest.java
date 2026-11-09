package com.orange.esim.client.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Data required to deliver a previously allocated eSIM Profile.
 **/
@ApiModel(description="Data required to deliver a previously allocated eSIM Profile.")

public class DeliverProfileRequest  {
  
  @ApiModelProperty(required = true, value = "Required delivery mode to deliver the specified eSIM Profile. Possible values are : \"defaultSMDPplus\", \"AC\", \"SMDS\". This value determines which others fields are required or not according to the following rules:  * __defaultSMDPplus__:     - eid is required if it was not sent in the previous allocation call    - smdsAddress should not be set  * __AC__: (Activation Code)    - if the matchingId is not present, SM-DP+ will generates a new matchingId for _ActivationCodeToken_    - smdsAddress should not be set  * __SMDS__:    - eid is required if it was not sent in the previous allocation call    - if the matchingId is present, it will be used as EventID    - smdsAddress is required")
 /**
   * Required delivery mode to deliver the specified eSIM Profile. Possible values are : \"defaultSMDPplus\", \"AC\", \"SMDS\". This value determines which others fields are required or not according to the following rules:  * __defaultSMDPplus__:     - eid is required if it was not sent in the previous allocation call    - smdsAddress should not be set  * __AC__: (Activation Code)    - if the matchingId is not present, SM-DP+ will generates a new matchingId for _ActivationCodeToken_    - smdsAddress should not be set  * __SMDS__:    - eid is required if it was not sent in the previous allocation call    - if the matchingId is present, it will be used as EventID    - smdsAddress is required
  **/
  private String deliveryMode;

  @ApiModelProperty(value = "The EID identifying the eUICC (embedded Universal Integrated Circuit Card) to link to the eSIM Profile. The EID must be a numeric value of 32 digits and respect the following control: (Value(EID) modulo 97) = 1. _See the description of field deliveryMode for the usage rules._")
 /**
   * The EID identifying the eUICC (embedded Universal Integrated Circuit Card) to link to the eSIM Profile. The EID must be a numeric value of 32 digits and respect the following control: (Value(EID) modulo 97) = 1. _See the description of field deliveryMode for the usage rules._
  **/
  private String eid;

  @ApiModelProperty(value = "Reference of the eSIM profile to be downloaded. _See the description of field deliveryMode for the usage rules._")
 /**
   * Reference of the eSIM profile to be downloaded. _See the description of field deliveryMode for the usage rules._
  **/
  private String matchingId;

  @ApiModelProperty(value = "A code used to authorise the usage of the MatchingID to confirm the download and installation of the eSIM Profile. _See the description of field deliveryMode for the usage rules._")
 /**
   * A code used to authorise the usage of the MatchingID to confirm the download and installation of the eSIM Profile. _See the description of field deliveryMode for the usage rules._
  **/
  private String confirmationCode;

  @ApiModelProperty(value = "The SM-DS address to be used for Event Registration with the SM-DP+ server. _See the description of field deliveryMode for the usage rules._")
 /**
   * The SM-DS address to be used for Event Registration with the SM-DP+ server. _See the description of field deliveryMode for the usage rules._
  **/
  private String smdsAddress;
 /**
   * Required delivery mode to deliver the specified eSIM Profile. Possible values are : \&quot;defaultSMDPplus\&quot;, \&quot;AC\&quot;, \&quot;SMDS\&quot;. This value determines which others fields are required or not according to the following rules:  * __defaultSMDPplus__:     - eid is required if it was not sent in the previous allocation call    - smdsAddress should not be set  * __AC__: (Activation Code)    - if the matchingId is not present, SM-DP+ will generates a new matchingId for _ActivationCodeToken_    - smdsAddress should not be set  * __SMDS__:    - eid is required if it was not sent in the previous allocation call    - if the matchingId is present, it will be used as EventID    - smdsAddress is required
   * @return deliveryMode
  **/
  @JsonProperty("deliveryMode")
  public String getDeliveryMode() {
    return deliveryMode;
  }

  public void setDeliveryMode(String deliveryMode) {
    this.deliveryMode = deliveryMode;
  }

  public DeliverProfileRequest deliveryMode(String deliveryMode) {
    this.deliveryMode = deliveryMode;
    return this;
  }

 /**
   * The EID identifying the eUICC (embedded Universal Integrated Circuit Card) to link to the eSIM Profile. The EID must be a numeric value of 32 digits and respect the following control: (Value(EID) modulo 97) &#x3D; 1. _See the description of field deliveryMode for the usage rules._
   * @return eid
  **/
  @JsonProperty("eid")
  public String getEid() {
    return eid;
  }

  public void setEid(String eid) {
    this.eid = eid;
  }

  public DeliverProfileRequest eid(String eid) {
    this.eid = eid;
    return this;
  }

 /**
   * Reference of the eSIM profile to be downloaded. _See the description of field deliveryMode for the usage rules._
   * @return matchingId
  **/
  @JsonProperty("matchingId")
  public String getMatchingId() {
    return matchingId;
  }

  public void setMatchingId(String matchingId) {
    this.matchingId = matchingId;
  }

  public DeliverProfileRequest matchingId(String matchingId) {
    this.matchingId = matchingId;
    return this;
  }

 /**
   * A code used to authorise the usage of the MatchingID to confirm the download and installation of the eSIM Profile. _See the description of field deliveryMode for the usage rules._
   * @return confirmationCode
  **/
  @JsonProperty("confirmationCode")
  public String getConfirmationCode() {
    return confirmationCode;
  }

  public void setConfirmationCode(String confirmationCode) {
    this.confirmationCode = confirmationCode;
  }

  public DeliverProfileRequest confirmationCode(String confirmationCode) {
    this.confirmationCode = confirmationCode;
    return this;
  }

 /**
   * The SM-DS address to be used for Event Registration with the SM-DP+ server. _See the description of field deliveryMode for the usage rules._
   * @return smdsAddress
  **/
  @JsonProperty("smdsAddress")
  public String getSmdsAddress() {
    return smdsAddress;
  }

  public void setSmdsAddress(String smdsAddress) {
    this.smdsAddress = smdsAddress;
  }

  public DeliverProfileRequest smdsAddress(String smdsAddress) {
    this.smdsAddress = smdsAddress;
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
    DeliverProfileRequest deliverProfileRequest = (DeliverProfileRequest) o;
    return Objects.equals(deliveryMode, deliverProfileRequest.deliveryMode) &&
        Objects.equals(eid, deliverProfileRequest.eid) &&
        Objects.equals(matchingId, deliverProfileRequest.matchingId) &&
        Objects.equals(confirmationCode, deliverProfileRequest.confirmationCode) &&
        Objects.equals(smdsAddress, deliverProfileRequest.smdsAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryMode, eid, matchingId, confirmationCode, smdsAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliverProfileRequest {\n");
    
    sb.append("    deliveryMode: ").append(toIndentedString(deliveryMode)).append("\n");
    sb.append("    eid: ").append(toIndentedString(eid)).append("\n");
    sb.append("    matchingId: ").append(toIndentedString(matchingId)).append("\n");
    sb.append("    confirmationCode: ").append(toIndentedString(confirmationCode)).append("\n");
    sb.append("    smdsAddress: ").append(toIndentedString(smdsAddress)).append("\n");
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

