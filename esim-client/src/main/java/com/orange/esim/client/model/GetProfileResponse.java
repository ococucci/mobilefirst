package com.orange.esim.client.model;

import com.orange.esim.client.model.SourceError;
import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Profile data for the GET profile API.
 **/
@ApiModel(description="Profile data for the GET profile API.")

public class GetProfileResponse  {
  
  @ApiModelProperty(required = true, value = "The ICCID (Integrated Circuit Card IDentifier, i.e. eSIM profile identifier) identifying the new eSIM profile allocated. The ICCID is a numeric value of 20 digits.")
 /**
   * The ICCID (Integrated Circuit Card IDentifier, i.e. eSIM profile identifier) identifying the new eSIM profile allocated. The ICCID is a numeric value of 20 digits.
  **/
  private String iccid;

  @ApiModelProperty(required = true, value = "The Subscriber identifier associated to the new eSIM profile allocated. The IMSI is a numeric value of 15 digits.")
 /**
   * The Subscriber identifier associated to the new eSIM profile allocated. The IMSI is a numeric value of 15 digits.
  **/
  private String imsi;

  @ApiModelProperty(required = true, value = "The requested profile type identifier for this eSIM profile.")
 /**
   * The requested profile type identifier for this eSIM profile.
  **/
  private String profileType;

  @ApiModelProperty(value = "The contract identifier.")
 /**
   * The contract identifier.
  **/
  private String cid;

  @ApiModelProperty(required = true, value = "The state of the profile resulting from a successful operation. The values to consider are ALLOCATED, LINKED, RELEASED, DOWNLOADED, INSTALLED, ENABLED, DISABLED, DELETED, ERROR. Other values are possible due to SMDP+ vendors proprietary implementation, but they should not to be considered as exploitable values.")
 /**
   * The state of the profile resulting from a successful operation. The values to consider are ALLOCATED, LINKED, RELEASED, DOWNLOADED, INSTALLED, ENABLED, DISABLED, DELETED, ERROR. Other values are possible due to SMDP+ vendors proprietary implementation, but they should not to be considered as exploitable values.
  **/
  private String profileStatus;

  @ApiModelProperty(required = true, value = "The last operation attempted on the profile.")
 /**
   * The last operation attempted on the profile.
  **/
  private String lastOperationDone;

  @ApiModelProperty(required = true, value = "The result of the last operation attempted on the profile. If lastOperationResult is 'failed', then lastOperationErrorDetails is present.")
 /**
   * The result of the last operation attempted on the profile. If lastOperationResult is 'failed', then lastOperationErrorDetails is present.
  **/
  private String lastOperationResult;

  @ApiModelProperty(value = "")
  private SourceError lastOperationErrorDetails;

  @ApiModelProperty(value = "The delivery mode of the eSIM profile.")
 /**
   * The delivery mode of the eSIM profile.
  **/
  private String deliveryMode;

  @ApiModelProperty(value = "The EID identifying the eUICC (embedded Universal Integrated Circuit Card) linked to the eSIM profile. The EID must be a numeric value of 32 digits.")
 /**
   * The EID identifying the eUICC (embedded Universal Integrated Circuit Card) linked to the eSIM profile. The EID must be a numeric value of 32 digits.
  **/
  private String eid;

  @ApiModelProperty(value = "The activation code for the profile. Present only if deliveryMode=AC and profileStatus=RELEASED.")
 /**
   * The activation code for the profile. Present only if deliveryMode=AC and profileStatus=RELEASED.
  **/
  private String activationCode;

  @ApiModelProperty(value = "The matching ID of the profile. Present only if deliveryMode=AC and profileStatus=RELEASED.")
 /**
   * The matching ID of the profile. Present only if deliveryMode=AC and profileStatus=RELEASED.
  **/
  private String matchingId;

  @ApiModelProperty(value = "The activation code for the profile. Present only if exists and deliveryMode=AC and profileStatus=RELEASED.")
 /**
   * The activation code for the profile. Present only if exists and deliveryMode=AC and profileStatus=RELEASED.
  **/
  private String confirmationCode;

  @ApiModelProperty(value = "The matching ID of the profile. Present only if deliveryMode=SMDS and profileStatus=RELEASED.")
 /**
   * The matching ID of the profile. Present only if deliveryMode=SMDS and profileStatus=RELEASED.
  **/
  private String smdsAddress;
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

  public GetProfileResponse iccid(String iccid) {
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

  public GetProfileResponse imsi(String imsi) {
    this.imsi = imsi;
    return this;
  }

 /**
   * The requested profile type identifier for this eSIM profile.
   * @return profileType
  **/
  @JsonProperty("profileType")
  public String getProfileType() {
    return profileType;
  }

  public void setProfileType(String profileType) {
    this.profileType = profileType;
  }

  public GetProfileResponse profileType(String profileType) {
    this.profileType = profileType;
    return this;
  }

 /**
   * The contract identifier.
   * @return cid
  **/
  @JsonProperty("cid")
  public String getCid() {
    return cid;
  }

  public void setCid(String cid) {
    this.cid = cid;
  }

  public GetProfileResponse cid(String cid) {
    this.cid = cid;
    return this;
  }

 /**
   * The state of the profile resulting from a successful operation. The values to consider are ALLOCATED, LINKED, RELEASED, DOWNLOADED, INSTALLED, ENABLED, DISABLED, DELETED, ERROR. Other values are possible due to SMDP+ vendors proprietary implementation, but they should not to be considered as exploitable values.
   * @return profileStatus
  **/
  @JsonProperty("profileStatus")
  public String getProfileStatus() {
    return profileStatus;
  }

  public void setProfileStatus(String profileStatus) {
    this.profileStatus = profileStatus;
  }

  public GetProfileResponse profileStatus(String profileStatus) {
    this.profileStatus = profileStatus;
    return this;
  }

 /**
   * The last operation attempted on the profile.
   * @return lastOperationDone
  **/
  @JsonProperty("lastOperationDone")
  public String getLastOperationDone() {
    return lastOperationDone;
  }

  public void setLastOperationDone(String lastOperationDone) {
    this.lastOperationDone = lastOperationDone;
  }

  public GetProfileResponse lastOperationDone(String lastOperationDone) {
    this.lastOperationDone = lastOperationDone;
    return this;
  }

 /**
   * The result of the last operation attempted on the profile. If lastOperationResult is &#39;failed&#39;, then lastOperationErrorDetails is present.
   * @return lastOperationResult
  **/
  @JsonProperty("lastOperationResult")
  public String getLastOperationResult() {
    return lastOperationResult;
  }

  public void setLastOperationResult(String lastOperationResult) {
    this.lastOperationResult = lastOperationResult;
  }

  public GetProfileResponse lastOperationResult(String lastOperationResult) {
    this.lastOperationResult = lastOperationResult;
    return this;
  }

 /**
   * Get lastOperationErrorDetails
   * @return lastOperationErrorDetails
  **/
  @JsonProperty("lastOperationErrorDetails")
  public SourceError getLastOperationErrorDetails() {
    return lastOperationErrorDetails;
  }

  public void setLastOperationErrorDetails(SourceError lastOperationErrorDetails) {
    this.lastOperationErrorDetails = lastOperationErrorDetails;
  }

  public GetProfileResponse lastOperationErrorDetails(SourceError lastOperationErrorDetails) {
    this.lastOperationErrorDetails = lastOperationErrorDetails;
    return this;
  }

 /**
   * The delivery mode of the eSIM profile.
   * @return deliveryMode
  **/
  @JsonProperty("deliveryMode")
  public String getDeliveryMode() {
    return deliveryMode;
  }

  public void setDeliveryMode(String deliveryMode) {
    this.deliveryMode = deliveryMode;
  }

  public GetProfileResponse deliveryMode(String deliveryMode) {
    this.deliveryMode = deliveryMode;
    return this;
  }

 /**
   * The EID identifying the eUICC (embedded Universal Integrated Circuit Card) linked to the eSIM profile. The EID must be a numeric value of 32 digits.
   * @return eid
  **/
  @JsonProperty("eid")
  public String getEid() {
    return eid;
  }

  public void setEid(String eid) {
    this.eid = eid;
  }

  public GetProfileResponse eid(String eid) {
    this.eid = eid;
    return this;
  }

 /**
   * The activation code for the profile. Present only if deliveryMode&#x3D;AC and profileStatus&#x3D;RELEASED.
   * @return activationCode
  **/
  @JsonProperty("activationCode")
  public String getActivationCode() {
    return activationCode;
  }

  public void setActivationCode(String activationCode) {
    this.activationCode = activationCode;
  }

  public GetProfileResponse activationCode(String activationCode) {
    this.activationCode = activationCode;
    return this;
  }

 /**
   * The matching ID of the profile. Present only if deliveryMode&#x3D;AC and profileStatus&#x3D;RELEASED.
   * @return matchingId
  **/
  @JsonProperty("matchingId")
  public String getMatchingId() {
    return matchingId;
  }

  public void setMatchingId(String matchingId) {
    this.matchingId = matchingId;
  }

  public GetProfileResponse matchingId(String matchingId) {
    this.matchingId = matchingId;
    return this;
  }

 /**
   * The activation code for the profile. Present only if exists and deliveryMode&#x3D;AC and profileStatus&#x3D;RELEASED.
   * @return confirmationCode
  **/
  @JsonProperty("confirmationCode")
  public String getConfirmationCode() {
    return confirmationCode;
  }

  public void setConfirmationCode(String confirmationCode) {
    this.confirmationCode = confirmationCode;
  }

  public GetProfileResponse confirmationCode(String confirmationCode) {
    this.confirmationCode = confirmationCode;
    return this;
  }

 /**
   * The matching ID of the profile. Present only if deliveryMode&#x3D;SMDS and profileStatus&#x3D;RELEASED.
   * @return smdsAddress
  **/
  @JsonProperty("smdsAddress")
  public String getSmdsAddress() {
    return smdsAddress;
  }

  public void setSmdsAddress(String smdsAddress) {
    this.smdsAddress = smdsAddress;
  }

  public GetProfileResponse smdsAddress(String smdsAddress) {
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
    GetProfileResponse getProfileResponse = (GetProfileResponse) o;
    return Objects.equals(iccid, getProfileResponse.iccid) &&
        Objects.equals(imsi, getProfileResponse.imsi) &&
        Objects.equals(profileType, getProfileResponse.profileType) &&
        Objects.equals(cid, getProfileResponse.cid) &&
        Objects.equals(profileStatus, getProfileResponse.profileStatus) &&
        Objects.equals(lastOperationDone, getProfileResponse.lastOperationDone) &&
        Objects.equals(lastOperationResult, getProfileResponse.lastOperationResult) &&
        Objects.equals(lastOperationErrorDetails, getProfileResponse.lastOperationErrorDetails) &&
        Objects.equals(deliveryMode, getProfileResponse.deliveryMode) &&
        Objects.equals(eid, getProfileResponse.eid) &&
        Objects.equals(activationCode, getProfileResponse.activationCode) &&
        Objects.equals(matchingId, getProfileResponse.matchingId) &&
        Objects.equals(confirmationCode, getProfileResponse.confirmationCode) &&
        Objects.equals(smdsAddress, getProfileResponse.smdsAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iccid, imsi, profileType, cid, profileStatus, lastOperationDone, lastOperationResult, lastOperationErrorDetails, deliveryMode, eid, activationCode, matchingId, confirmationCode, smdsAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProfileResponse {\n");
    
    sb.append("    iccid: ").append(toIndentedString(iccid)).append("\n");
    sb.append("    imsi: ").append(toIndentedString(imsi)).append("\n");
    sb.append("    profileType: ").append(toIndentedString(profileType)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    profileStatus: ").append(toIndentedString(profileStatus)).append("\n");
    sb.append("    lastOperationDone: ").append(toIndentedString(lastOperationDone)).append("\n");
    sb.append("    lastOperationResult: ").append(toIndentedString(lastOperationResult)).append("\n");
    sb.append("    lastOperationErrorDetails: ").append(toIndentedString(lastOperationErrorDetails)).append("\n");
    sb.append("    deliveryMode: ").append(toIndentedString(deliveryMode)).append("\n");
    sb.append("    eid: ").append(toIndentedString(eid)).append("\n");
    sb.append("    activationCode: ").append(toIndentedString(activationCode)).append("\n");
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

