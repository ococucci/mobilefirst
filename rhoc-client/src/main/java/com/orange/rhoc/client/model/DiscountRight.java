package com.orange.rhoc.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.orange.rhoc.client.model.DiscountRightStatus;
import com.orange.rhoc.client.model.Vertical;
import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * DiscountRight class Attributes:     id: uuid4 format     discountRightCode: discount right code value     sponsorPid: uuid4 format     sponsorCid: int format     beneficiaryPid: uuid4 format     beneficiaryCid: int format     vertical: vertical concerned by this discount right     status: discount status (Consommable, Consomme)     timestamp: timestamp last modification
 **/
@ApiModel(description="DiscountRight class Attributes:     id: uuid4 format     discountRightCode: discount right code value     sponsorPid: uuid4 format     sponsorCid: int format     beneficiaryPid: uuid4 format     beneficiaryCid: int format     vertical: vertical concerned by this discount right     status: discount status (Consommable, Consomme)     timestamp: timestamp last modification")

public class DiscountRight  {
  
  @ApiModelProperty(value = "")
  private String id;

  @ApiModelProperty(value = "")
  private String discountRightCode;

  @ApiModelProperty(value = "")
  private String sponsorPid;

  @ApiModelProperty(value = "")
  private String sponsorCid;

  @ApiModelProperty(value = "")
  private String beneficiaryPid;

  @ApiModelProperty(value = "")
  private String beneficiaryCid;

  @ApiModelProperty(value = "")
  private Vertical vertical = Vertical.MOBILE_OAG;

  @ApiModelProperty(value = "")
  private DiscountRightStatus status = DiscountRightStatus.CONSOMMABLE;

  @ApiModelProperty(value = "")
  private String timestamp = "2026-11-09T13:32:01Z";

  @ApiModelProperty(value = "")
  private String pendingOrderId;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DiscountRight id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get discountRightCode
   * @return discountRightCode
  **/
  @JsonProperty("discountRightCode")
  public String getDiscountRightCode() {
    return discountRightCode;
  }

  public void setDiscountRightCode(String discountRightCode) {
    this.discountRightCode = discountRightCode;
  }

  public DiscountRight discountRightCode(String discountRightCode) {
    this.discountRightCode = discountRightCode;
    return this;
  }

 /**
   * Get sponsorPid
   * @return sponsorPid
  **/
  @JsonProperty("sponsorPid")
  public String getSponsorPid() {
    return sponsorPid;
  }

  public void setSponsorPid(String sponsorPid) {
    this.sponsorPid = sponsorPid;
  }

  public DiscountRight sponsorPid(String sponsorPid) {
    this.sponsorPid = sponsorPid;
    return this;
  }

 /**
   * Get sponsorCid
   * @return sponsorCid
  **/
  @JsonProperty("sponsorCid")
  public String getSponsorCid() {
    return sponsorCid;
  }

  public void setSponsorCid(String sponsorCid) {
    this.sponsorCid = sponsorCid;
  }

  public DiscountRight sponsorCid(String sponsorCid) {
    this.sponsorCid = sponsorCid;
    return this;
  }

 /**
   * Get beneficiaryPid
   * @return beneficiaryPid
  **/
  @JsonProperty("beneficiaryPid")
  public String getBeneficiaryPid() {
    return beneficiaryPid;
  }

  public void setBeneficiaryPid(String beneficiaryPid) {
    this.beneficiaryPid = beneficiaryPid;
  }

  public DiscountRight beneficiaryPid(String beneficiaryPid) {
    this.beneficiaryPid = beneficiaryPid;
    return this;
  }

 /**
   * Get beneficiaryCid
   * @return beneficiaryCid
  **/
  @JsonProperty("beneficiaryCid")
  public String getBeneficiaryCid() {
    return beneficiaryCid;
  }

  public void setBeneficiaryCid(String beneficiaryCid) {
    this.beneficiaryCid = beneficiaryCid;
  }

  public DiscountRight beneficiaryCid(String beneficiaryCid) {
    this.beneficiaryCid = beneficiaryCid;
    return this;
  }

 /**
   * Get vertical
   * @return vertical
  **/
  @JsonProperty("vertical")
  public Vertical getVertical() {
    return vertical;
  }

  public void setVertical(Vertical vertical) {
    this.vertical = vertical;
  }

  public DiscountRight vertical(Vertical vertical) {
    this.vertical = vertical;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public DiscountRightStatus getStatus() {
    return status;
  }

  public void setStatus(DiscountRightStatus status) {
    this.status = status;
  }

  public DiscountRight status(DiscountRightStatus status) {
    this.status = status;
    return this;
  }

 /**
   * Get timestamp
   * @return timestamp
  **/
  @JsonProperty("timestamp")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public DiscountRight timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

 /**
   * Get pendingOrderId
   * @return pendingOrderId
  **/
  @JsonProperty("pendingOrderId")
  public String getPendingOrderId() {
    return pendingOrderId;
  }

  public void setPendingOrderId(String pendingOrderId) {
    this.pendingOrderId = pendingOrderId;
  }

  public DiscountRight pendingOrderId(String pendingOrderId) {
    this.pendingOrderId = pendingOrderId;
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
    DiscountRight discountRight = (DiscountRight) o;
    return Objects.equals(this.id, discountRight.id) &&
        Objects.equals(this.discountRightCode, discountRight.discountRightCode) &&
        Objects.equals(this.sponsorPid, discountRight.sponsorPid) &&
        Objects.equals(this.sponsorCid, discountRight.sponsorCid) &&
        Objects.equals(this.beneficiaryPid, discountRight.beneficiaryPid) &&
        Objects.equals(this.beneficiaryCid, discountRight.beneficiaryCid) &&
        Objects.equals(this.vertical, discountRight.vertical) &&
        Objects.equals(this.status, discountRight.status) &&
        Objects.equals(this.timestamp, discountRight.timestamp) &&
        Objects.equals(this.pendingOrderId, discountRight.pendingOrderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, discountRightCode, sponsorPid, sponsorCid, beneficiaryPid, beneficiaryCid, vertical, status, timestamp, pendingOrderId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscountRight {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    discountRightCode: ").append(toIndentedString(discountRightCode)).append("\n");
    sb.append("    sponsorPid: ").append(toIndentedString(sponsorPid)).append("\n");
    sb.append("    sponsorCid: ").append(toIndentedString(sponsorCid)).append("\n");
    sb.append("    beneficiaryPid: ").append(toIndentedString(beneficiaryPid)).append("\n");
    sb.append("    beneficiaryCid: ").append(toIndentedString(beneficiaryCid)).append("\n");
    sb.append("    vertical: ").append(toIndentedString(vertical)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    pendingOrderId: ").append(toIndentedString(pendingOrderId)).append("\n");
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

