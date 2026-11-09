package com.orange.iml.client.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Error  {
  
  @ApiModelProperty(value = "")
  private String appId;

  @ApiModelProperty(value = "")
  private String userId;

  @ApiModelProperty(value = "Code d'erreur")
 /**
   * Code d'erreur
  **/
  private String code;

  @ApiModelProperty(value = "Message d'erreur")
 /**
   * Message d'erreur
  **/
  private String message;

  @ApiModelProperty(value = "Détails")
 /**
   * Détails
  **/
  private String detail;
 /**
   * Get appId
   * @return appId
  **/
  @JsonProperty("appId")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public Error appId(String appId) {
    this.appId = appId;
    return this;
  }

 /**
   * Get userId
   * @return userId
  **/
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Error userId(String userId) {
    this.userId = userId;
    return this;
  }

 /**
   * Code d&#39;erreur
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Error code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Message d&#39;erreur
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Détails
   * @return detail
  **/
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public Error detail(String detail) {
    this.detail = detail;
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
    Error error = (Error) o;
    return Objects.equals(appId, error.appId) &&
        Objects.equals(userId, error.userId) &&
        Objects.equals(code, error.code) &&
        Objects.equals(message, error.message) &&
        Objects.equals(detail, error.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, userId, code, message, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

