package com.orange.esim.client.model;

import com.orange.esim.client.model.Characteristic;
import com.orange.esim.client.model.ResourceRef;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ESimProfile  {
  
  @ApiModelProperty(value = "")
  private String id;

  @ApiModelProperty(value = "")
  private String serviceType;

  @ApiModelProperty(value = "")
  private List<Characteristic> serviceCharacteristic;

  @ApiModelProperty(value = "")
  private List<ResourceRef> supportingResource;

  @ApiModelProperty(value = "")
  private String msisdn;

  @ApiModelProperty(value = "")
  private String matchingId;

  @ApiModelProperty(value = "")
  private String profileType;

  @ApiModelProperty(value = "")
  private String profileStatus;

  @ApiModelProperty(value = "")
  private String confirmationCode;

  @ApiModelProperty(value = "")
  private String atType;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ESimProfile id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get serviceType
   * @return serviceType
  **/
  @JsonProperty("serviceType")
  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public ESimProfile serviceType(String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

 /**
   * Get serviceCharacteristic
   * @return serviceCharacteristic
  **/
  @JsonProperty("serviceCharacteristic")
  public List<Characteristic> getServiceCharacteristic() {
    return serviceCharacteristic;
  }

  public void setServiceCharacteristic(List<Characteristic> serviceCharacteristic) {
    this.serviceCharacteristic = serviceCharacteristic;
  }

  public ESimProfile serviceCharacteristic(List<Characteristic> serviceCharacteristic) {
    this.serviceCharacteristic = serviceCharacteristic;
    return this;
  }

  public ESimProfile addServiceCharacteristicItem(Characteristic serviceCharacteristicItem) {
    this.serviceCharacteristic.add(serviceCharacteristicItem);
    return this;
  }

 /**
   * Get supportingResource
   * @return supportingResource
  **/
  @JsonProperty("supportingResource")
  public List<ResourceRef> getSupportingResource() {
    return supportingResource;
  }

  public void setSupportingResource(List<ResourceRef> supportingResource) {
    this.supportingResource = supportingResource;
  }

  public ESimProfile supportingResource(List<ResourceRef> supportingResource) {
    this.supportingResource = supportingResource;
    return this;
  }

  public ESimProfile addSupportingResourceItem(ResourceRef supportingResourceItem) {
    this.supportingResource.add(supportingResourceItem);
    return this;
  }

 /**
   * Get msisdn
   * @return msisdn
  **/
  @JsonProperty("msisdn")
  public String getMsisdn() {
    return msisdn;
  }

  public void setMsisdn(String msisdn) {
    this.msisdn = msisdn;
  }

  public ESimProfile msisdn(String msisdn) {
    this.msisdn = msisdn;
    return this;
  }

 /**
   * Get matchingId
   * @return matchingId
  **/
  @JsonProperty("matchingId")
  public String getMatchingId() {
    return matchingId;
  }

  public void setMatchingId(String matchingId) {
    this.matchingId = matchingId;
  }

  public ESimProfile matchingId(String matchingId) {
    this.matchingId = matchingId;
    return this;
  }

 /**
   * Get profileType
   * @return profileType
  **/
  @JsonProperty("profileType")
  public String getProfileType() {
    return profileType;
  }

  public void setProfileType(String profileType) {
    this.profileType = profileType;
  }

  public ESimProfile profileType(String profileType) {
    this.profileType = profileType;
    return this;
  }

 /**
   * Get profileStatus
   * @return profileStatus
  **/
  @JsonProperty("profileStatus")
  public String getProfileStatus() {
    return profileStatus;
  }

  public void setProfileStatus(String profileStatus) {
    this.profileStatus = profileStatus;
  }

  public ESimProfile profileStatus(String profileStatus) {
    this.profileStatus = profileStatus;
    return this;
  }

 /**
   * Get confirmationCode
   * @return confirmationCode
  **/
  @JsonProperty("confirmationCode")
  public String getConfirmationCode() {
    return confirmationCode;
  }

  public void setConfirmationCode(String confirmationCode) {
    this.confirmationCode = confirmationCode;
  }

  public ESimProfile confirmationCode(String confirmationCode) {
    this.confirmationCode = confirmationCode;
    return this;
  }

 /**
   * Get atType
   * @return atType
  **/
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  public ESimProfile atType(String atType) {
    this.atType = atType;
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
    ESimProfile esimProfile = (ESimProfile) o;
    return Objects.equals(id, esimProfile.id) &&
        Objects.equals(serviceType, esimProfile.serviceType) &&
        Objects.equals(serviceCharacteristic, esimProfile.serviceCharacteristic) &&
        Objects.equals(supportingResource, esimProfile.supportingResource) &&
        Objects.equals(msisdn, esimProfile.msisdn) &&
        Objects.equals(matchingId, esimProfile.matchingId) &&
        Objects.equals(profileType, esimProfile.profileType) &&
        Objects.equals(profileStatus, esimProfile.profileStatus) &&
        Objects.equals(confirmationCode, esimProfile.confirmationCode) &&
        Objects.equals(atType, esimProfile.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, serviceType, serviceCharacteristic, supportingResource, msisdn, matchingId, profileType, profileStatus, confirmationCode, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ESimProfile {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    serviceCharacteristic: ").append(toIndentedString(serviceCharacteristic)).append("\n");
    sb.append("    supportingResource: ").append(toIndentedString(supportingResource)).append("\n");
    sb.append("    msisdn: ").append(toIndentedString(msisdn)).append("\n");
    sb.append("    matchingId: ").append(toIndentedString(matchingId)).append("\n");
    sb.append("    profileType: ").append(toIndentedString(profileType)).append("\n");
    sb.append("    profileStatus: ").append(toIndentedString(profileStatus)).append("\n");
    sb.append("    confirmationCode: ").append(toIndentedString(confirmationCode)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
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

