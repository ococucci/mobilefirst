package com.orange.iml.client.model;

import com.orange.iml.client.model.UniqueToken;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class InParametersUntokenize  {
  
  @ApiModelProperty(example = "KARANBOL", required = true, value = "Identifiant unique de l’application")
 /**
   * Identifiant unique de l’application
  **/
  private String appId;

  @ApiModelProperty(example = "AD\\herm0001", value = "Identifiant unique de l’utilisateur applicatif à l’origine de l’appel")
 /**
   * Identifiant unique de l’utilisateur applicatif à l’origine de l’appel
  **/
  private String userId;

  @ApiModelProperty(required = true, value = "Liste de jetons ")
 /**
   * Liste de jetons 
  **/
  private List<UniqueToken> uniqueTokens = new ArrayList<>();
 /**
   * Identifiant unique de l’application
   * @return appId
  **/
  @JsonProperty("appId")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public InParametersUntokenize appId(String appId) {
    this.appId = appId;
    return this;
  }

 /**
   * Identifiant unique de l’utilisateur applicatif à l’origine de l’appel
   * @return userId
  **/
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public InParametersUntokenize userId(String userId) {
    this.userId = userId;
    return this;
  }

 /**
   * Liste de jetons 
   * @return uniqueTokens
  **/
  @JsonProperty("uniqueTokens")
  public List<UniqueToken> getUniqueTokens() {
    return uniqueTokens;
  }

  public void setUniqueTokens(List<UniqueToken> uniqueTokens) {
    this.uniqueTokens = uniqueTokens;
  }

  public InParametersUntokenize uniqueTokens(List<UniqueToken> uniqueTokens) {
    this.uniqueTokens = uniqueTokens;
    return this;
  }

  public InParametersUntokenize addUniqueTokensItem(UniqueToken uniqueTokensItem) {
    this.uniqueTokens.add(uniqueTokensItem);
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
    InParametersUntokenize inParametersUntokenize = (InParametersUntokenize) o;
    return Objects.equals(appId, inParametersUntokenize.appId) &&
        Objects.equals(userId, inParametersUntokenize.userId) &&
        Objects.equals(uniqueTokens, inParametersUntokenize.uniqueTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, userId, uniqueTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InParametersUntokenize {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    uniqueTokens: ").append(toIndentedString(uniqueTokens)).append("\n");
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

