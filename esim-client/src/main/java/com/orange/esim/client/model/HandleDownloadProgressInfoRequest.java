package com.orange.esim.client.model;

import com.orange.esim.client.model.Header;
import com.orange.esim.client.model.NotificationPointStatus;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class HandleDownloadProgressInfoRequest  {
  
  @ApiModelProperty(value = "")
  private Header header;

  @ApiModelProperty(value = "EID as described in SGP.02")
 /**
   * EID as described in SGP.02
  **/
  private String eid;

  @ApiModelProperty(required = true, value = "ICCID as described in ITU-T E.118")
 /**
   * ICCID as described in ITU-T E.118
  **/
  private String iccid;

  @ApiModelProperty(required = true, value = "Content free information defined by the Operator (e.g.‘P9054-2’)")
 /**
   * Content free information defined by the Operator (e.g.‘P9054-2’)
  **/
  private String profileType;

  @ApiModelProperty(required = true, value = "Date and time when the operation has been performed, in string format as specified by W3C: YYYY-MM-DDThh:mm:ssTZD (E.g. 2001-12-17T09:30:47Z)")
 /**
   * Date and time when the operation has been performed, in string format as specified by W3C: YYYY-MM-DDThh:mm:ssTZD (E.g. 2001-12-17T09:30:47Z)
  **/
  private String timestamp;

  @ApiModelProperty(value = "OPTIONAL - The matchingId from the procedure request")
 /**
   * OPTIONAL - The matchingId from the procedure request
  **/
  private String matchingId;

  @ApiModelProperty(value = "OPTIONAL - The SM-DP address of the affected DP+")
 /**
   * OPTIONAL - The SM-DP address of the affected DP+
  **/
  private String smdpAddress;

  @ApiModelProperty(value = "OPTIONAL - Date and time when the profile was last updated. Not affected by profile registration")
 /**
   * OPTIONAL - Date and time when the profile was last updated. Not affected by profile registration
  **/
  private String lastModified;

  @ApiModelProperty(value = "OPTIONAL - IMEI of the device")
 /**
   * OPTIONAL - IMEI of the device
  **/
  private String imei;

  @ApiModelProperty(value = "OPTIONAL - TAC of the device")
 /**
   * OPTIONAL - TAC of the device
  **/
  private String tac;

  @ApiModelProperty(required = true, value = "Identification of the step reached in the procedure")
 /**
   * Identification of the step reached in the procedure
  **/
  private Integer notificationPointId;

  @ApiModelProperty(required = true, value = "")
  private NotificationPointStatus notificationPointStatus;

  @ApiModelProperty(value = "base64 encoded binary data containing the Result data contained in the ProfileInstallationResult")
 /**
   * base64 encoded binary data containing the Result data contained in the ProfileInstallationResult
  **/
  private String resultData;
 /**
   * Get header
   * @return header
  **/
  @JsonProperty("header")
  public Header getHeader() {
    return header;
  }

  public void setHeader(Header header) {
    this.header = header;
  }

  public HandleDownloadProgressInfoRequest header(Header header) {
    this.header = header;
    return this;
  }

 /**
   * EID as described in SGP.02
   * @return eid
  **/
  @JsonProperty("eid")
  public String getEid() {
    return eid;
  }

  public void setEid(String eid) {
    this.eid = eid;
  }

  public HandleDownloadProgressInfoRequest eid(String eid) {
    this.eid = eid;
    return this;
  }

 /**
   * ICCID as described in ITU-T E.118
   * @return iccid
  **/
  @JsonProperty("iccid")
  public String getIccid() {
    return iccid;
  }

  public void setIccid(String iccid) {
    this.iccid = iccid;
  }

  public HandleDownloadProgressInfoRequest iccid(String iccid) {
    this.iccid = iccid;
    return this;
  }

 /**
   * Content free information defined by the Operator (e.g.‘P9054-2’)
   * @return profileType
  **/
  @JsonProperty("profileType")
  public String getProfileType() {
    return profileType;
  }

  public void setProfileType(String profileType) {
    this.profileType = profileType;
  }

  public HandleDownloadProgressInfoRequest profileType(String profileType) {
    this.profileType = profileType;
    return this;
  }

 /**
   * Date and time when the operation has been performed, in string format as specified by W3C: YYYY-MM-DDThh:mm:ssTZD (E.g. 2001-12-17T09:30:47Z)
   * @return timestamp
  **/
  @JsonProperty("timestamp")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public HandleDownloadProgressInfoRequest timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

 /**
   * OPTIONAL - The matchingId from the procedure request
   * @return matchingId
  **/
  @JsonProperty("matchingId")
  public String getMatchingId() {
    return matchingId;
  }

  public void setMatchingId(String matchingId) {
    this.matchingId = matchingId;
  }

  public HandleDownloadProgressInfoRequest matchingId(String matchingId) {
    this.matchingId = matchingId;
    return this;
  }

 /**
   * OPTIONAL - The SM-DP address of the affected DP+
   * @return smdpAddress
  **/
  @JsonProperty("smdpAddress")
  public String getSmdpAddress() {
    return smdpAddress;
  }

  public void setSmdpAddress(String smdpAddress) {
    this.smdpAddress = smdpAddress;
  }

  public HandleDownloadProgressInfoRequest smdpAddress(String smdpAddress) {
    this.smdpAddress = smdpAddress;
    return this;
  }

 /**
   * OPTIONAL - Date and time when the profile was last updated. Not affected by profile registration
   * @return lastModified
  **/
  @JsonProperty("lastModified")
  public String getLastModified() {
    return lastModified;
  }

  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  public HandleDownloadProgressInfoRequest lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

 /**
   * OPTIONAL - IMEI of the device
   * @return imei
  **/
  @JsonProperty("imei")
  public String getImei() {
    return imei;
  }

  public void setImei(String imei) {
    this.imei = imei;
  }

  public HandleDownloadProgressInfoRequest imei(String imei) {
    this.imei = imei;
    return this;
  }

 /**
   * OPTIONAL - TAC of the device
   * @return tac
  **/
  @JsonProperty("tac")
  public String getTac() {
    return tac;
  }

  public void setTac(String tac) {
    this.tac = tac;
  }

  public HandleDownloadProgressInfoRequest tac(String tac) {
    this.tac = tac;
    return this;
  }

 /**
   * Identification of the step reached in the procedure
   * @return notificationPointId
  **/
  @JsonProperty("notificationPointId")
  public Integer getNotificationPointId() {
    return notificationPointId;
  }

  public void setNotificationPointId(Integer notificationPointId) {
    this.notificationPointId = notificationPointId;
  }

  public HandleDownloadProgressInfoRequest notificationPointId(Integer notificationPointId) {
    this.notificationPointId = notificationPointId;
    return this;
  }

 /**
   * Get notificationPointStatus
   * @return notificationPointStatus
  **/
  @JsonProperty("notificationPointStatus")
  public NotificationPointStatus getNotificationPointStatus() {
    return notificationPointStatus;
  }

  public void setNotificationPointStatus(NotificationPointStatus notificationPointStatus) {
    this.notificationPointStatus = notificationPointStatus;
  }

  public HandleDownloadProgressInfoRequest notificationPointStatus(NotificationPointStatus notificationPointStatus) {
    this.notificationPointStatus = notificationPointStatus;
    return this;
  }

 /**
   * base64 encoded binary data containing the Result data contained in the ProfileInstallationResult
   * @return resultData
  **/
  @JsonProperty("resultData")
  public String getResultData() {
    return resultData;
  }

  public void setResultData(String resultData) {
    this.resultData = resultData;
  }

  public HandleDownloadProgressInfoRequest resultData(String resultData) {
    this.resultData = resultData;
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
    HandleDownloadProgressInfoRequest handleDownloadProgressInfoRequest = (HandleDownloadProgressInfoRequest) o;
    return Objects.equals(header, handleDownloadProgressInfoRequest.header) &&
        Objects.equals(eid, handleDownloadProgressInfoRequest.eid) &&
        Objects.equals(iccid, handleDownloadProgressInfoRequest.iccid) &&
        Objects.equals(profileType, handleDownloadProgressInfoRequest.profileType) &&
        Objects.equals(timestamp, handleDownloadProgressInfoRequest.timestamp) &&
        Objects.equals(matchingId, handleDownloadProgressInfoRequest.matchingId) &&
        Objects.equals(smdpAddress, handleDownloadProgressInfoRequest.smdpAddress) &&
        Objects.equals(lastModified, handleDownloadProgressInfoRequest.lastModified) &&
        Objects.equals(imei, handleDownloadProgressInfoRequest.imei) &&
        Objects.equals(tac, handleDownloadProgressInfoRequest.tac) &&
        Objects.equals(notificationPointId, handleDownloadProgressInfoRequest.notificationPointId) &&
        Objects.equals(notificationPointStatus, handleDownloadProgressInfoRequest.notificationPointStatus) &&
        Objects.equals(resultData, handleDownloadProgressInfoRequest.resultData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, eid, iccid, profileType, timestamp, matchingId, smdpAddress, lastModified, imei, tac, notificationPointId, notificationPointStatus, resultData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HandleDownloadProgressInfoRequest {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    eid: ").append(toIndentedString(eid)).append("\n");
    sb.append("    iccid: ").append(toIndentedString(iccid)).append("\n");
    sb.append("    profileType: ").append(toIndentedString(profileType)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    matchingId: ").append(toIndentedString(matchingId)).append("\n");
    sb.append("    smdpAddress: ").append(toIndentedString(smdpAddress)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    imei: ").append(toIndentedString(imei)).append("\n");
    sb.append("    tac: ").append(toIndentedString(tac)).append("\n");
    sb.append("    notificationPointId: ").append(toIndentedString(notificationPointId)).append("\n");
    sb.append("    notificationPointStatus: ").append(toIndentedString(notificationPointStatus)).append("\n");
    sb.append("    resultData: ").append(toIndentedString(resultData)).append("\n");
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

