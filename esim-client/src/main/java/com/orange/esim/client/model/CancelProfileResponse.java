package com.orange.esim.client.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * status of cancel action.
 **/
@ApiModel(description="status of cancel action.")

public class CancelProfileResponse  {
  
  @ApiModelProperty(required = true, value = "The final status executed.")
 /**
   * The final status executed.
  **/
  private String finalProfileStatusIndicator;
 /**
   * The final status executed.
   * @return finalProfileStatusIndicator
  **/
  @JsonProperty("finalProfileStatusIndicator")
  public String getFinalProfileStatusIndicator() {
    return finalProfileStatusIndicator;
  }

  public void setFinalProfileStatusIndicator(String finalProfileStatusIndicator) {
    this.finalProfileStatusIndicator = finalProfileStatusIndicator;
  }

  public CancelProfileResponse finalProfileStatusIndicator(String finalProfileStatusIndicator) {
    this.finalProfileStatusIndicator = finalProfileStatusIndicator;
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
    CancelProfileResponse cancelProfileResponse = (CancelProfileResponse) o;
    return Objects.equals(finalProfileStatusIndicator, cancelProfileResponse.finalProfileStatusIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finalProfileStatusIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelProfileResponse {\n");
    
    sb.append("    finalProfileStatusIndicator: ").append(toIndentedString(finalProfileStatusIndicator)).append("\n");
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

