package com.orange.esim.client.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Data returned as response to eSIM Profile allocate request.
 **/
@ApiModel(description="Data returned as response to eSIM Profile allocate request.")

public class AllocateProfileResponse  {
  
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

  public AllocateProfileResponse iccid(String iccid) {
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

  public AllocateProfileResponse imsi(String imsi) {
    this.imsi = imsi;
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
    AllocateProfileResponse allocateProfileResponse = (AllocateProfileResponse) o;
    return Objects.equals(iccid, allocateProfileResponse.iccid) &&
        Objects.equals(imsi, allocateProfileResponse.imsi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iccid, imsi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocateProfileResponse {\n");
    
    sb.append("    iccid: ").append(toIndentedString(iccid)).append("\n");
    sb.append("    imsi: ").append(toIndentedString(imsi)).append("\n");
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

