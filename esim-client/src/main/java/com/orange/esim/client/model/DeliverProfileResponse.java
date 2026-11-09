package com.orange.esim.client.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Data returned as response to eSIM Profile delivery request.
 **/
@ApiModel(description="Data returned as response to eSIM Profile delivery request.")

public class DeliverProfileResponse  {
  
  @ApiModelProperty(required = true, value = "The ICCID (Integrated Circuit Card IDentifier, i.e. eSIM profile identifier) identifying the new eSIM profile allocated. The ICCID is a numeric value of 20 digits.")
 /**
   * The ICCID (Integrated Circuit Card IDentifier, i.e. eSIM profile identifier) identifying the new eSIM profile allocated. The ICCID is a numeric value of 20 digits.
  **/
  private String iccid;

  @ApiModelProperty(value = "The Subscriber identifier associated to the new eSIM profile allocated. The IMSI is a numeric value of 15 digits.")
 /**
   * The Subscriber identifier associated to the new eSIM profile allocated. The IMSI is a numeric value of 15 digits.
  **/
  private String imsi;

  @ApiModelProperty(value = "The EID identifying the eUICC (embedded Universal Integrated Circuit Card) linked to the eSIM Profile. The EID must be a numeric value of 32 digits. It is always present in this response when the deliveryMode is set to \"defaultSMDPplus\".")
 /**
   * The EID identifying the eUICC (embedded Universal Integrated Circuit Card) linked to the eSIM Profile. The EID must be a numeric value of 32 digits. It is always present in this response when the deliveryMode is set to \"defaultSMDPplus\".
  **/
  private String eid;

  @ApiModelProperty(value = "A code built using the SM-DP+ address, the MatchingID and the confirmationCode if any is specified as parameter. It is always present in this response when the deliveryMode is set to \"AC\".")
 /**
   * A code built using the SM-DP+ address, the MatchingID and the confirmationCode if any is specified as parameter. It is always present in this response when the deliveryMode is set to \"AC\".
  **/
  private String activationCode;

  @ApiModelProperty(value = "Reference of the eSIM profile to be downloaded. It is always present in this response when the deliveryMode is set to \"AC\".")
 /**
   * Reference of the eSIM profile to be downloaded. It is always present in this response when the deliveryMode is set to \"AC\".
  **/
  private String matchingId;

  @ApiModelProperty(value = "A code used to authorise the usage of the MatchingID to confirm the download and installation of the eSIM Profile. It can be present (optional) in this response when the deliveryMode is set to \"AC\".")
 /**
   * A code used to authorise the usage of the MatchingID to confirm the download and installation of the eSIM Profile. It can be present (optional) in this response when the deliveryMode is set to \"AC\".
  **/
  private String confirmationCode;

  @ApiModelProperty(value = "as defined in SGP.22")
 /**
   * as defined in SGP.22
  **/
  private String smdpAddress;
 /**
   * The ICCID (Integrated Circuit Card IDentifier, i.e. eSIM profile identifier) identifying the new eSIM profile allocated. The ICCID is a numeric value of 20 digits.
   * @return iccid
  **/
  @JsonProperty("iccid")
  public String getIccid() {
    return iccid;
  }

  public void setIccid(String iccid) {
    this.iccid = iccid;
  }

  public DeliverProfileResponse iccid(String iccid) {
    this.iccid = iccid;
    return this;
  }

 /**
   * The Subscriber identifier associated to the new eSIM profile allocated. The IMSI is a numeric value of 15 digits.
   * @return imsi
  **/
  @JsonProperty("imsi")
  public String getImsi() {
    return imsi;
  }

  public void setImsi(String imsi) {
    this.imsi = imsi;
  }

  public DeliverProfileResponse imsi(String imsi) {
    this.imsi = imsi;
    return this;
  }

 /**
   * The EID identifying the eUICC (embedded Universal Integrated Circuit Card) linked to the eSIM Profile. The EID must be a numeric value of 32 digits. It is always present in this response when the deliveryMode is set to \&quot;defaultSMDPplus\&quot;.
   * @return eid
  **/
  @JsonProperty("eid")
  public String getEid() {
    return eid;
  }

  public void setEid(String eid) {
    this.eid = eid;
  }

  public DeliverProfileResponse eid(String eid) {
    this.eid = eid;
    return this;
  }

 /**
   * A code built using the SM-DP+ address, the MatchingID and the confirmationCode if any is specified as parameter. It is always present in this response when the deliveryMode is set to \&quot;AC\&quot;.
   * @return activationCode
  **/
  @JsonProperty("activationCode")
  public String getActivationCode() {
    return activationCode;
  }

  public void setActivationCode(String activationCode) {
    this.activationCode = activationCode;
  }

  public DeliverProfileResponse activationCode(String activationCode) {
    this.activationCode = activationCode;
    return this;
  }

 /**
   * Reference of the eSIM profile to be downloaded. It is always present in this response when the deliveryMode is set to \&quot;AC\&quot;.
   * @return matchingId
  **/
  @JsonProperty("matchingId")
  public String getMatchingId() {
    return matchingId;
  }

  public void setMatchingId(String matchingId) {
    this.matchingId = matchingId;
  }

  public DeliverProfileResponse matchingId(String matchingId) {
    this.matchingId = matchingId;
    return this;
  }

 /**
   * A code used to authorise the usage of the MatchingID to confirm the download and installation of the eSIM Profile. It can be present (optional) in this response when the deliveryMode is set to \&quot;AC\&quot;.
   * @return confirmationCode
  **/
  @JsonProperty("confirmationCode")
  public String getConfirmationCode() {
    return confirmationCode;
  }

  public void setConfirmationCode(String confirmationCode) {
    this.confirmationCode = confirmationCode;
  }

  public DeliverProfileResponse confirmationCode(String confirmationCode) {
    this.confirmationCode = confirmationCode;
    return this;
  }

 /**
   * as defined in SGP.22
   * @return smdpAddress
  **/
  @JsonProperty("smdpAddress")
  public String getSmdpAddress() {
    return smdpAddress;
  }

  public void setSmdpAddress(String smdpAddress) {
    this.smdpAddress = smdpAddress;
  }

  public DeliverProfileResponse smdpAddress(String smdpAddress) {
    this.smdpAddress = smdpAddress;
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
    DeliverProfileResponse deliverProfileResponse = (DeliverProfileResponse) o;
    return Objects.equals(iccid, deliverProfileResponse.iccid) &&
        Objects.equals(imsi, deliverProfileResponse.imsi) &&
        Objects.equals(eid, deliverProfileResponse.eid) &&
        Objects.equals(activationCode, deliverProfileResponse.activationCode) &&
        Objects.equals(matchingId, deliverProfileResponse.matchingId) &&
        Objects.equals(confirmationCode, deliverProfileResponse.confirmationCode) &&
        Objects.equals(smdpAddress, deliverProfileResponse.smdpAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iccid, imsi, eid, activationCode, matchingId, confirmationCode, smdpAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliverProfileResponse {\n");
    
    sb.append("    iccid: ").append(toIndentedString(iccid)).append("\n");
    sb.append("    imsi: ").append(toIndentedString(imsi)).append("\n");
    sb.append("    eid: ").append(toIndentedString(eid)).append("\n");
    sb.append("    activationCode: ").append(toIndentedString(activationCode)).append("\n");
    sb.append("    matchingId: ").append(toIndentedString(matchingId)).append("\n");
    sb.append("    confirmationCode: ").append(toIndentedString(confirmationCode)).append("\n");
    sb.append("    smdpAddress: ").append(toIndentedString(smdpAddress)).append("\n");
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

