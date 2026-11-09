package com.orange.rhoc.client.model;

import io.swagger.annotations.ApiModel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * An enumeration.
 */
public enum DiscountRightStatus {
  
  CONSOMMABLE("Consommable"),
  
  CONSOMME("Consomme"),
  
  ALL("All");

  private String value;

  DiscountRightStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DiscountRightStatus fromValue(String value) {
    for (DiscountRightStatus b : DiscountRightStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

