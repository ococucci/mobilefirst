package com.orange.rhoc.client.model;

import com.orange.rhoc.client.model.LocationInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ValidationError  {
  
  @ApiModelProperty(required = true, value = "")
  private List<LocationInner> loc = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  private String msg;

  @ApiModelProperty(required = true, value = "")
  private String type;
 /**
   * Get loc
   * @return loc
  **/
  @JsonProperty("loc")
  public List<LocationInner> getLoc() {
    return loc;
  }

  public void setLoc(List<LocationInner> loc) {
    this.loc = loc;
  }

  public ValidationError loc(List<LocationInner> loc) {
    this.loc = loc;
    return this;
  }

  public ValidationError addLocItem(LocationInner locItem) {
    this.loc.add(locItem);
    return this;
  }

 /**
   * Get msg
   * @return msg
  **/
  @JsonProperty("msg")
  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public ValidationError msg(String msg) {
    this.msg = msg;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ValidationError type(String type) {
    this.type = type;
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
    ValidationError validationError = (ValidationError) o;
    return Objects.equals(this.loc, validationError.loc) &&
        Objects.equals(this.msg, validationError.msg) &&
        Objects.equals(this.type, validationError.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loc, msg, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationError {\n");
    
    sb.append("    loc: ").append(toIndentedString(loc)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

