package com.orange.esim.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.orange.esim.client.model.ESimProfile;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ServiceOrderItem  {
  
  @ApiModelProperty(required = true, value = "")
  private String id;

public enum ActionEnum {

PREPARATION(String.valueOf("preparation"));


    private String value;

    ActionEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ActionEnum fromValue(String value) {
        for (ActionEnum b : ActionEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")
  private ActionEnum action;

  @ApiModelProperty(required = true, value = "")
  private ESimProfile service;

  @ApiModelProperty(value = "")
  private String atType;
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

  public ServiceOrderItem id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get action
   * @return action
  **/
  @JsonProperty("action")
  public String getAction() {
    if (action == null) {
      return null;
    }
    return action.value();
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public ServiceOrderItem action(ActionEnum action) {
    this.action = action;
    return this;
  }

 /**
   * Get service
   * @return service
  **/
  @JsonProperty("service")
  public ESimProfile getService() {
    return service;
  }

  public void setService(ESimProfile service) {
    this.service = service;
  }

  public ServiceOrderItem service(ESimProfile service) {
    this.service = service;
    return this;
  }

 /**
   * Get atType
   * @return atType
  **/
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  public ServiceOrderItem atType(String atType) {
    this.atType = atType;
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
    ServiceOrderItem serviceOrderItem = (ServiceOrderItem) o;
    return Objects.equals(id, serviceOrderItem.id) &&
        Objects.equals(action, serviceOrderItem.action) &&
        Objects.equals(service, serviceOrderItem.service) &&
        Objects.equals(atType, serviceOrderItem.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, action, service, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOrderItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
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

