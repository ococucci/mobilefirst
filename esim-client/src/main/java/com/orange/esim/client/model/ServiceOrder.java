package com.orange.esim.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.orange.esim.client.model.ServiceOrderItem;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ServiceOrder  {
  
  @ApiModelProperty(value = "")
  private List<ServiceOrderItem> serviceOrderItem;

public enum StateEnum {

ACKNOWLEDGED(String.valueOf("acknowledged"));


    private String value;

    StateEnum (String v) {
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
    public static StateEnum fromValue(String value) {
        for (StateEnum b : StateEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")
  private StateEnum state;
 /**
   * Get serviceOrderItem
   * @return serviceOrderItem
  **/
  @JsonProperty("serviceOrderItem")
  public List<ServiceOrderItem> getServiceOrderItem() {
    return serviceOrderItem;
  }

  public void setServiceOrderItem(List<ServiceOrderItem> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
  }

  public ServiceOrder serviceOrderItem(List<ServiceOrderItem> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
    return this;
  }

  public ServiceOrder addServiceOrderItemItem(ServiceOrderItem serviceOrderItemItem) {
    this.serviceOrderItem.add(serviceOrderItemItem);
    return this;
  }

 /**
   * Get state
   * @return state
  **/
  @JsonProperty("state")
  public String getState() {
    if (state == null) {
      return null;
    }
    return state.value();
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public ServiceOrder state(StateEnum state) {
    this.state = state;
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
    ServiceOrder serviceOrder = (ServiceOrder) o;
    return Objects.equals(serviceOrderItem, serviceOrder.serviceOrderItem) &&
        Objects.equals(state, serviceOrder.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceOrderItem, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOrder {\n");
    
    sb.append("    serviceOrderItem: ").append(toIndentedString(serviceOrderItem)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

