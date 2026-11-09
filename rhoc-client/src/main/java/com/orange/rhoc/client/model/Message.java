package com.orange.rhoc.client.model;

import com.orange.rhoc.client.model.Attributes;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Message  {
  
  @ApiModelProperty(value = "")
  private Attributes attributes;

  @ApiModelProperty(value = "")
  private String data;

  @ApiModelProperty(value = "")
  private String messageId;

  @ApiModelProperty(value = "")
  private String messageIdSnakeCase;

  @ApiModelProperty(value = "")
  private String publishTime;

  @ApiModelProperty(value = "")
  private String publishTimeSnakeCase;
 /**
   * Get attributes
   * @return attributes
  **/
  @JsonProperty("attributes")
  public Attributes getAttributes() {
    return attributes;
  }

  public void setAttributes(Attributes attributes) {
    this.attributes = attributes;
  }

  public Message attributes(Attributes attributes) {
    this.attributes = attributes;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public Message data(String data) {
    this.data = data;
    return this;
  }

 /**
   * Get messageId
   * @return messageId
  **/
  @JsonProperty("messageId")
  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public Message messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

 /**
   * Get messageIdSnakeCase
   * @return messageIdSnakeCase
  **/
  @JsonProperty("message_id")
  public String getMessageIdSnakeCase() {
    return messageIdSnakeCase;
  }

  public void setMessageIdSnakeCase(String messageIdSnakeCase) {
    this.messageIdSnakeCase = messageIdSnakeCase;
  }

  public Message messageIdSnakeCase(String messageIdSnakeCase) {
    this.messageIdSnakeCase = messageIdSnakeCase;
    return this;
  }

 /**
   * Get publishTime
   * @return publishTime
  **/
  @JsonProperty("publishTime")
  public String getPublishTime() {
    return publishTime;
  }

  public void setPublishTime(String publishTime) {
    this.publishTime = publishTime;
  }

  public Message publishTime(String publishTime) {
    this.publishTime = publishTime;
    return this;
  }

 /**
   * Get publishTimeSnakeCase
   * @return publishTimeSnakeCase
  **/
  @JsonProperty("publish_time")
  public String getPublishTimeSnakeCase() {
    return publishTimeSnakeCase;
  }

  public void setPublishTimeSnakeCase(String publishTimeSnakeCase) {
    this.publishTimeSnakeCase = publishTimeSnakeCase;
  }

  public Message publishTimeSnakeCase(String publishTimeSnakeCase) {
    this.publishTimeSnakeCase = publishTimeSnakeCase;
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
    Message message = (Message) o;
    return Objects.equals(this.attributes, message.attributes) &&
        Objects.equals(this.data, message.data) &&
        Objects.equals(this.messageId, message.messageId) &&
        Objects.equals(this.messageIdSnakeCase, message.messageIdSnakeCase) &&
        Objects.equals(this.publishTime, message.publishTime) &&
        Objects.equals(this.publishTimeSnakeCase, message.publishTimeSnakeCase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, data, messageId, messageIdSnakeCase, publishTime, publishTimeSnakeCase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    messageIdSnakeCase: ").append(toIndentedString(messageIdSnakeCase)).append("\n");
    sb.append("    publishTime: ").append(toIndentedString(publishTime)).append("\n");
    sb.append("    publishTimeSnakeCase: ").append(toIndentedString(publishTimeSnakeCase)).append("\n");
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

