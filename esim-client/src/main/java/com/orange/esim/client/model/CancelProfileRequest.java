package com.orange.esim.client.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Data required to cancel a non downloaded eSIM Profile.
 **/
@ApiModel(description="Data required to cancel a non downloaded eSIM Profile.")

public class CancelProfileRequest  {
  
  @ApiModelProperty(required = true, value = "The final status wanted.")
 /**
   * The final status wanted.
  **/
  private String finalProfileStatusIndicator;

  @ApiModelProperty(value = "")
  private String eid;
 /**
   * The final status wanted.
   * @return finalProfileStatusIndicator
  **/
  @JsonProperty("finalProfileStatusIndicator")
  public String getFinalProfileStatusIndicator() {
    return finalProfileStatusIndicator;
  }

  public void setFinalProfileStatusIndicator(String finalProfileStatusIndicator) {
    this.finalProfileStatusIndicator = finalProfileStatusIndicator;
  }

  public CancelProfileRequest finalProfileStatusIndicator(String finalProfileStatusIndicator) {
    this.finalProfileStatusIndicator = finalProfileStatusIndicator;
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

  public CancelProfileRequest eid(String eid) {
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
    CancelProfileRequest cancelProfileRequest = (CancelProfileRequest) o;
    return Objects.equals(finalProfileStatusIndicator, cancelProfileRequest.finalProfileStatusIndicator) &&
        Objects.equals(eid, cancelProfileRequest.eid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finalProfileStatusIndicator, eid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelProfileRequest {\n");
    
    sb.append("    finalProfileStatusIndicator: ").append(toIndentedString(finalProfileStatusIndicator)).append("\n");
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

