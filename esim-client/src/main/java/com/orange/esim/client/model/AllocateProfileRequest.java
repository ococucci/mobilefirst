package com.orange.esim.client.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Data required to allocate a new eSIM Profile
 **/
@ApiModel(description="Data required to allocate a new eSIM Profile")

public class AllocateProfileRequest  {
  
  @ApiModelProperty(required = true, value = "Profile type requested for the new eSIM profile to allocate.")
 /**
   * Profile type requested for the new eSIM profile to allocate.
  **/
  private String profileType;

  @ApiModelProperty(value = "The identifier of customer contract. Generally MSISDN(590690000000).")
 /**
   * The identifier of customer contract. Generally MSISDN(590690000000).
  **/
  private String cid;

  @ApiModelProperty(value = "The EID identifying the eUICC (embedded Universal Integrated Circuit Card) to link to the eSIM Profile. The EID must be a numeric value of 32 digits and respect the following control: (Value(EID) modulo 97) = 1")
 /**
   * The EID identifying the eUICC (embedded Universal Integrated Circuit Card) to link to the eSIM Profile. The EID must be a numeric value of 32 digits and respect the following control: (Value(EID) modulo 97) = 1
  **/
  private String eid;
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

  public AllocateProfileRequest profileType(String profileType) {
    this.profileType = profileType;
    return this;
  }

 /**
   * The identifier of customer contract. Generally MSISDN(590690000000).
   * @return cid
  **/
  @JsonProperty("cid")
  public String getCid() {
    return cid;
  }

  public void setCid(String cid) {
    this.cid = cid;
  }

  public AllocateProfileRequest cid(String cid) {
    this.cid = cid;
    return this;
  }

 /**
   * The EID identifying the eUICC (embedded Universal Integrated Circuit Card) to link to the eSIM Profile. The EID must be a numeric value of 32 digits and respect the following control: (Value(EID) modulo 97) &#x3D; 1
   * @return eid
  **/
  @JsonProperty("eid")
  public String getEid() {
    return eid;
  }

  public void setEid(String eid) {
    this.eid = eid;
  }

  public AllocateProfileRequest eid(String eid) {
    this.eid = eid;
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
    AllocateProfileRequest allocateProfileRequest = (AllocateProfileRequest) o;
    return Objects.equals(profileType, allocateProfileRequest.profileType) &&
        Objects.equals(cid, allocateProfileRequest.cid) &&
        Objects.equals(eid, allocateProfileRequest.eid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileType, cid, eid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocateProfileRequest {\n");
    
    sb.append("    profileType: ").append(toIndentedString(profileType)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eid: ").append(toIndentedString(eid)).append("\n");
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

