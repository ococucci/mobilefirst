package com.orange.rhoc.client.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UnauthorizatedModel  {
  
  @ApiModelProperty(value = "")
  private Integer code = 3;

  @ApiModelProperty(value = "")
  private String message = "Forbidden";

  @ApiModelProperty(value = "")
  private String description = "Your token is not valid";
 /**
   * Get code
   * @return code
  **/
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public UnauthorizatedModel code(Integer code) {
    this.code = code;
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public UnauthorizatedModel message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UnauthorizatedModel description(String description) {
    this.description = description;
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
    UnauthorizatedModel unauthorizatedModel = (UnauthorizatedModel) o;
    return Objects.equals(this.code, unauthorizatedModel.code) &&
        Objects.equals(this.message, unauthorizatedModel.message) &&
        Objects.equals(this.description, unauthorizatedModel.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnauthorizatedModel {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

