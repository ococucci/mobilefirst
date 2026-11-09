package com.orange.esim.client.model;

import com.orange.esim.client.model.ServiceOrderItem;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ServiceOrderCreate  {
  
  @ApiModelProperty(required = true, value = "")
  private List<ServiceOrderItem> serviceOrderItem = new ArrayList<>();
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

  public ServiceOrderCreate serviceOrderItem(List<ServiceOrderItem> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
    return this;
  }

  public ServiceOrderCreate addServiceOrderItemItem(ServiceOrderItem serviceOrderItemItem) {
    this.serviceOrderItem.add(serviceOrderItemItem);
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
    ServiceOrderCreate serviceOrderCreate = (ServiceOrderCreate) o;
    return Objects.equals(serviceOrderItem, serviceOrderCreate.serviceOrderItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceOrderItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOrderCreate {\n");
    
    sb.append("    serviceOrderItem: ").append(toIndentedString(serviceOrderItem)).append("\n");
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

