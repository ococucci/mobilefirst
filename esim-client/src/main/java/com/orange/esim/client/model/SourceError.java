package com.orange.esim.client.model;

import com.orange.esim.client.model.SourceData;
import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Object describing the source cause of a functional error or failure during an operation.
 **/
@ApiModel(description="Object describing the source cause of a functional error or failure during an operation.")

public class SourceError  {
  
  @ApiModelProperty(required = true, value = "")
  private SourceData source;
 /**
   * Get source
   * @return source
  **/
  @JsonProperty("source")
  public SourceData getSource() {
    return source;
  }

  public void setSource(SourceData source) {
    this.source = source;
  }

  public SourceError source(SourceData source) {
    this.source = source;
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
    SourceError sourceError = (SourceError) o;
    return Objects.equals(source, sourceError.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceError {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

