package com.orange.rhoc.client.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Attributes  {
  
  @ApiModelProperty(value = "")
  private String googclientSchemaencoding;

  @ApiModelProperty(value = "")
  private String googclientSchemarevisionid;
 /**
   * Get googclientSchemaencoding
   * @return googclientSchemaencoding
  **/
  @JsonProperty("googclient_schemaencoding")
  public String getGoogclientSchemaencoding() {
    return googclientSchemaencoding;
  }

  public void setGoogclientSchemaencoding(String googclientSchemaencoding) {
    this.googclientSchemaencoding = googclientSchemaencoding;
  }

  public Attributes googclientSchemaencoding(String googclientSchemaencoding) {
    this.googclientSchemaencoding = googclientSchemaencoding;
    return this;
  }

 /**
   * Get googclientSchemarevisionid
   * @return googclientSchemarevisionid
  **/
  @JsonProperty("googclient_schemarevisionid")
  public String getGoogclientSchemarevisionid() {
    return googclientSchemarevisionid;
  }

  public void setGoogclientSchemarevisionid(String googclientSchemarevisionid) {
    this.googclientSchemarevisionid = googclientSchemarevisionid;
  }

  public Attributes googclientSchemarevisionid(String googclientSchemarevisionid) {
    this.googclientSchemarevisionid = googclientSchemarevisionid;
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
    Attributes attributes = (Attributes) o;
    return Objects.equals(this.googclientSchemaencoding, attributes.googclientSchemaencoding) &&
        Objects.equals(this.googclientSchemarevisionid, attributes.googclientSchemarevisionid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(googclientSchemaencoding, googclientSchemarevisionid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attributes {\n");
    
    sb.append("    googclientSchemaencoding: ").append(toIndentedString(googclientSchemaencoding)).append("\n");
    sb.append("    googclientSchemarevisionid: ").append(toIndentedString(googclientSchemarevisionid)).append("\n");
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

