package com.orange.rhoc.client.model;

import com.orange.rhoc.client.model.Message;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PayloadPubSub  {
  
  @ApiModelProperty(value = "")
  private Message message;

  @ApiModelProperty(value = "")
  private String subscription;
 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  public Message getMessage() {
    return message;
  }

  public void setMessage(Message message) {
    this.message = message;
  }

  public PayloadPubSub message(Message message) {
    this.message = message;
    return this;
  }

 /**
   * Get subscription
   * @return subscription
  **/
  @JsonProperty("subscription")
  public String getSubscription() {
    return subscription;
  }

  public void setSubscription(String subscription) {
    this.subscription = subscription;
  }

  public PayloadPubSub subscription(String subscription) {
    this.subscription = subscription;
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
    PayloadPubSub payloadPubSub = (PayloadPubSub) o;
    return Objects.equals(this.message, payloadPubSub.message) &&
        Objects.equals(this.subscription, payloadPubSub.subscription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, subscription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadPubSub {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
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

