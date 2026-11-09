package com.orange.esim.client.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Nested object describing the source system and error which cause a failure.
 **/
@ApiModel(description="Nested object describing the source system and error which cause a failure.")

public class SourceData  {
  
  @ApiModelProperty(required = true, value = "Reference of the system at the origin of the error.")
 /**
   * Reference of the system at the origin of the error.
  **/
  private String name;

  @ApiModelProperty(required = true, value = "HTTP status code returned by source system.")
 /**
   * HTTP status code returned by source system.
  **/
  private Integer httpCode;

  @ApiModelProperty(value = "Raw source error message (as text).")
 /**
   * Raw source error message (as text).
  **/
  private String error;
 /**
   * Reference of the system at the origin of the error.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SourceData name(String name) {
    this.name = name;
    return this;
  }

 /**
   * HTTP status code returned by source system.
   * @return httpCode
  **/
  @JsonProperty("httpCode")
  public Integer getHttpCode() {
    return httpCode;
  }

  public void setHttpCode(Integer httpCode) {
    this.httpCode = httpCode;
  }

  public SourceData httpCode(Integer httpCode) {
    this.httpCode = httpCode;
    return this;
  }

 /**
   * Raw source error message (as text).
   * @return error
  **/
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public SourceData error(String error) {
    this.error = error;
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
    SourceData sourceData = (SourceData) o;
    return Objects.equals(name, sourceData.name) &&
        Objects.equals(httpCode, sourceData.httpCode) &&
        Objects.equals(error, sourceData.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, httpCode, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceData {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    httpCode: ").append(toIndentedString(httpCode)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

