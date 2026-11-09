package com.orange.esim.client.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Header  {
  
  @ApiModelProperty(required = true, value = "OID of the function requester")
 /**
   * OID of the function requester
  **/
  private String functionRequesterIdentifier;

  @ApiModelProperty(required = true, value = "identification of the function call: HandleDownloadProgressInfo")
 /**
   * identification of the function call: HandleDownloadProgressInfo
  **/
  private String functionCallIdentifier;
 /**
   * OID of the function requester
   * @return functionRequesterIdentifier
  **/
  @JsonProperty("functionRequesterIdentifier")
  public String getFunctionRequesterIdentifier() {
    return functionRequesterIdentifier;
  }

  public void setFunctionRequesterIdentifier(String functionRequesterIdentifier) {
    this.functionRequesterIdentifier = functionRequesterIdentifier;
  }

  public Header functionRequesterIdentifier(String functionRequesterIdentifier) {
    this.functionRequesterIdentifier = functionRequesterIdentifier;
    return this;
  }

 /**
   * identification of the function call: HandleDownloadProgressInfo
   * @return functionCallIdentifier
  **/
  @JsonProperty("functionCallIdentifier")
  public String getFunctionCallIdentifier() {
    return functionCallIdentifier;
  }

  public void setFunctionCallIdentifier(String functionCallIdentifier) {
    this.functionCallIdentifier = functionCallIdentifier;
  }

  public Header functionCallIdentifier(String functionCallIdentifier) {
    this.functionCallIdentifier = functionCallIdentifier;
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
    Header header = (Header) o;
    return Objects.equals(functionRequesterIdentifier, header.functionRequesterIdentifier) &&
        Objects.equals(functionCallIdentifier, header.functionCallIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functionRequesterIdentifier, functionCallIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Header {\n");
    
    sb.append("    functionRequesterIdentifier: ").append(toIndentedString(functionRequesterIdentifier)).append("\n");
    sb.append("    functionCallIdentifier: ").append(toIndentedString(functionCallIdentifier)).append("\n");
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

