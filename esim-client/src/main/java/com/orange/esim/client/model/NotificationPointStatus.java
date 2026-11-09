package com.orange.esim.client.model;

import com.orange.esim.client.model.StatusCodeData;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class NotificationPointStatus  {
  
  @ApiModelProperty(required = true, value = "Executed-Success, Executed-WithWarning, Failed or Expired")
 /**
   * Executed-Success, Executed-WithWarning, Failed or Expired
  **/
  private String status;

  @ApiModelProperty(value = "")
  private StatusCodeData statusCodeData;
 /**
   * Executed-Success, Executed-WithWarning, Failed or Expired
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public NotificationPointStatus status(String status) {
    this.status = status;
    return this;
  }

 /**
   * Get statusCodeData
   * @return statusCodeData
  **/
  @JsonProperty("statusCodeData")
  public StatusCodeData getStatusCodeData() {
    return statusCodeData;
  }

  public void setStatusCodeData(StatusCodeData statusCodeData) {
    this.statusCodeData = statusCodeData;
  }

  public NotificationPointStatus statusCodeData(StatusCodeData statusCodeData) {
    this.statusCodeData = statusCodeData;
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
    NotificationPointStatus notificationPointStatus = (NotificationPointStatus) o;
    return Objects.equals(status, notificationPointStatus.status) &&
        Objects.equals(statusCodeData, notificationPointStatus.statusCodeData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, statusCodeData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationPointStatus {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusCodeData: ").append(toIndentedString(statusCodeData)).append("\n");
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

