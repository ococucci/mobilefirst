package com.orange.iml.client.model;

import com.orange.iml.client.model.UniqueBankAccount;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class InParametersTokenize  {
  
  @ApiModelProperty(example = "CLEMENTINE", required = true, value = "Identifiant unique de l’application")
 /**
   * Identifiant unique de l’application
  **/
  private String appId;

  @ApiModelProperty(example = "CUID", value = "Identifiant unique de l’utilisateur applicatif à l’origine de l’appel")
 /**
   * Identifiant unique de l’utilisateur applicatif à l’origine de l’appel
  **/
  private String userId;

  @ApiModelProperty(required = true, value = "Liste de données bancaires")
 /**
   * Liste de données bancaires
  **/
  private List<UniqueBankAccount> uniqueBankAccounts = new ArrayList<>();
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

  public InParametersTokenize appId(String appId) {
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

  public InParametersTokenize userId(String userId) {
    this.userId = userId;
    return this;
  }

 /**
   * Liste de données bancaires
   * @return uniqueBankAccounts
  **/
  @JsonProperty("uniqueBankAccounts")
  public List<UniqueBankAccount> getUniqueBankAccounts() {
    return uniqueBankAccounts;
  }

  public void setUniqueBankAccounts(List<UniqueBankAccount> uniqueBankAccounts) {
    this.uniqueBankAccounts = uniqueBankAccounts;
  }

  public InParametersTokenize uniqueBankAccounts(List<UniqueBankAccount> uniqueBankAccounts) {
    this.uniqueBankAccounts = uniqueBankAccounts;
    return this;
  }

  public InParametersTokenize addUniqueBankAccountsItem(UniqueBankAccount uniqueBankAccountsItem) {
    this.uniqueBankAccounts.add(uniqueBankAccountsItem);
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
    InParametersTokenize inParametersTokenize = (InParametersTokenize) o;
    return Objects.equals(appId, inParametersTokenize.appId) &&
        Objects.equals(userId, inParametersTokenize.userId) &&
        Objects.equals(uniqueBankAccounts, inParametersTokenize.uniqueBankAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, userId, uniqueBankAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InParametersTokenize {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    uniqueBankAccounts: ").append(toIndentedString(uniqueBankAccounts)).append("\n");
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

