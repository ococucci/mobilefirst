package com.orange.esim.client.model;

import com.orange.esim.client.model.EsimProfileData;
import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * A Service error.
 **/
@ApiModel(description="A Service error.")

public class EsimProfileError  {
  
  @ApiModelProperty(value = "")
  private EsimProfileData data;

  @ApiModelProperty(required = true, value = "Functional error code defined by the Service.")
 /**
   * Functional error code defined by the Service.
  **/
  private String code;

  @ApiModelProperty(required = true, value = "Description of the functional error.")
 /**
   * Description of the functional error.
  **/
  private String message;
 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public EsimProfileData getData() {
    return data;
  }

  public void setData(EsimProfileData data) {
    this.data = data;
  }

  public EsimProfileError data(EsimProfileData data) {
    this.data = data;
    return this;
  }

 /**
   * Functional error code defined by the Service.
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public EsimProfileError code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Description of the functional error.
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public EsimProfileError message(String message) {
    this.message = message;
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
    EsimProfileError esimProfileError = (EsimProfileError) o;
    return Objects.equals(data, esimProfileError.data) &&
        Objects.equals(code, esimProfileError.code) &&
        Objects.equals(message, esimProfileError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EsimProfileError {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

