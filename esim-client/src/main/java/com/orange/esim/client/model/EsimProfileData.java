package com.orange.esim.client.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EsimProfileData  {
  
  @ApiModelProperty(value = "")
  private String iccid;

  @ApiModelProperty(value = "")
  private String eid;

  @ApiModelProperty(value = "")
  private String profileType;

  @ApiModelProperty(value = "")
  private String profileStatus;
 /**
   * Get iccid
   * @return iccid
  **/
  @JsonProperty("iccid")
  public String getIccid() {
    return iccid;
  }

  public void setIccid(String iccid) {
    this.iccid = iccid;
  }

  public EsimProfileData iccid(String iccid) {
    this.iccid = iccid;
    return this;
  }

 /**
   * Get eid
   * @return eid
  **/
  @JsonProperty("eid")
  public String getEid() {
    return eid;
  }

  public void setEid(String eid) {
    this.eid = eid;
  }

  public EsimProfileData eid(String eid) {
    this.eid = eid;
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

  public EsimProfileData profileType(String profileType) {
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

  public EsimProfileData profileStatus(String profileStatus) {
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
    EsimProfileData esimProfileData = (EsimProfileData) o;
    return Objects.equals(iccid, esimProfileData.iccid) &&
        Objects.equals(eid, esimProfileData.eid) &&
        Objects.equals(profileType, esimProfileData.profileType) &&
        Objects.equals(profileStatus, esimProfileData.profileStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iccid, eid, profileType, profileStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EsimProfileData {\n");
    
    sb.append("    iccid: ").append(toIndentedString(iccid)).append("\n");
    sb.append("    eid: ").append(toIndentedString(eid)).append("\n");
    sb.append("    profileType: ").append(toIndentedString(profileType)).append("\n");
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

