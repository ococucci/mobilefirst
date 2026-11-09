package com.orange.esim.client.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Data returned as response to GET Profile Status request.
 **/
@ApiModel(description="Data returned as response to GET Profile Status request.")

public class GetStatusResponse  {
  
  @ApiModelProperty(required = true, value = "The name of the API='profiles'.")
 /**
   * The name of the API='profiles'.
  **/
  private String name;

  @ApiModelProperty(required = true, value = "The status of the API='ok'.")
 /**
   * The status of the API='ok'.
  **/
  private String status;

  @ApiModelProperty(required = true, value = "The version of the API. exp 2.0")
 /**
   * The version of the API. exp 2.0
  **/
  private String version;
 /**
   * The name of the API&#x3D;&#39;profiles&#39;.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetStatusResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The status of the API&#x3D;&#39;ok&#39;.
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public GetStatusResponse status(String status) {
    this.status = status;
    return this;
  }

 /**
   * The version of the API. exp 2.0
   * @return version
  **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public GetStatusResponse version(String version) {
    this.version = version;
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
    GetStatusResponse getStatusResponse = (GetStatusResponse) o;
    return Objects.equals(name, getStatusResponse.name) &&
        Objects.equals(status, getStatusResponse.status) &&
        Objects.equals(version, getStatusResponse.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStatusResponse {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

