package com.orange.rhoc.client.model;

import io.swagger.annotations.ApiModel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * An enumeration.
 */
public enum Vertical {
  
  MOBILE_OAG("MOBILE_OAG");

  private String value;

  Vertical(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Vertical fromValue(String value) {
    for (Vertical b : Vertical.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

