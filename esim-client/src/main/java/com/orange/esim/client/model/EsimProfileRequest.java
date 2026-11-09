package com.orange.esim.client.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Recuperer un profil disponible pour un MSISDN
 **/
@ApiModel(description="Recuperer un profil disponible pour un MSISDN")

public class EsimProfileRequest  {
  
  @ApiModelProperty(value = "Profile type requested for the new eSIM profile to allocate.")
 /**
   * Profile type requested for the new eSIM profile to allocate.
  **/
  private String profileType;

  @ApiModelProperty(value = "obligatoire pour intérroger la base de livraisons")
 /**
   * obligatoire pour intérroger la base de livraisons
  **/
  private String msisdn;

  @ApiModelProperty(value = "")
  private String profileStatus;
 /**
   * Profile type requested for the new eSIM profile to allocate.
   * @return profileType
  **/
  @JsonProperty("profileType")
  public String getProfileType() {
    return profileType;
  }

  public void setProfileType(String profileType) {
    this.profileType = profileType;
  }

  public EsimProfileRequest profileType(String profileType) {
    this.profileType = profileType;
    return this;
  }

 /**
   * obligatoire pour intérroger la base de livraisons
   * @return msisdn
  **/
  @JsonProperty("msisdn")
  public String getMsisdn() {
    return msisdn;
  }

  public void setMsisdn(String msisdn) {
    this.msisdn = msisdn;
  }

  public EsimProfileRequest msisdn(String msisdn) {
    this.msisdn = msisdn;
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

  public EsimProfileRequest profileStatus(String profileStatus) {
    this.profileStatus = profileStatus;
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
    EsimProfileRequest esimProfileRequest = (EsimProfileRequest) o;
    return Objects.equals(profileType, esimProfileRequest.profileType) &&
        Objects.equals(msisdn, esimProfileRequest.msisdn) &&
        Objects.equals(profileStatus, esimProfileRequest.profileStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileType, msisdn, profileStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EsimProfileRequest {\n");
    
    sb.append("    profileType: ").append(toIndentedString(profileType)).append("\n");
    sb.append("    msisdn: ").append(toIndentedString(msisdn)).append("\n");
    sb.append("    profileStatus: ").append(toIndentedString(profileStatus)).append("\n");
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

