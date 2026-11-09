package com.orange.iml.client.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Liste de jetons 
 **/
@ApiModel(description="Liste de jetons ")

public class UniqueToken  {
  
  @ApiModelProperty(example = "1", required = true, value = "Identifiant unique de l’information bancaire tokenisé")
 /**
   * Identifiant unique de l’information bancaire tokenisé
  **/
  private String uid;

  @ApiModelProperty(example = "FR793000600148YZPWWLX890101", required = true, value = "Jeton")
 /**
   * Jeton
  **/
  private String token;
 /**
   * Identifiant unique de l’information bancaire tokenisé
   * @return uid
  **/
  @JsonProperty("uid")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public UniqueToken uid(String uid) {
    this.uid = uid;
    return this;
  }

 /**
   * Jeton
   * @return token
  **/
  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public UniqueToken token(String token) {
    this.token = token;
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
    UniqueToken uniqueToken = (UniqueToken) o;
    return Objects.equals(uid, uniqueToken.uid) &&
        Objects.equals(token, uniqueToken.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UniqueToken {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

