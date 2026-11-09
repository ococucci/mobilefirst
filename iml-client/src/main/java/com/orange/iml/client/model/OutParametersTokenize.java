package com.orange.iml.client.model;

import com.orange.iml.client.model.TokenizedBankAccount;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OutParametersTokenize  {
  
  @ApiModelProperty(example = "CLEMENTINE", required = true, value = "Même identifiant unique de l’application passé en entrée")
 /**
   * Même identifiant unique de l’application passé en entrée
  **/
  private String appId;

  @ApiModelProperty(value = "Même identifiant de l’utilisateur applicatif passé en entrée")
 /**
   * Même identifiant de l’utilisateur applicatif passé en entrée
  **/
  private String userId;

  @ApiModelProperty(required = true, value = "Liste de données bancaires jetonisées (jetons)")
 /**
   * Liste de données bancaires jetonisées (jetons)
  **/
  private List<TokenizedBankAccount> tokenizedBankAccounts = new ArrayList<>();
 /**
   * Même identifiant unique de l’application passé en entrée
   * @return appId
  **/
  @JsonProperty("appId")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public OutParametersTokenize appId(String appId) {
    this.appId = appId;
    return this;
  }

 /**
   * Même identifiant de l’utilisateur applicatif passé en entrée
   * @return userId
  **/
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public OutParametersTokenize userId(String userId) {
    this.userId = userId;
    return this;
  }

 /**
   * Liste de données bancaires jetonisées (jetons)
   * @return tokenizedBankAccounts
  **/
  @JsonProperty("tokenizedBankAccounts")
  public List<TokenizedBankAccount> getTokenizedBankAccounts() {
    return tokenizedBankAccounts;
  }

  public void setTokenizedBankAccounts(List<TokenizedBankAccount> tokenizedBankAccounts) {
    this.tokenizedBankAccounts = tokenizedBankAccounts;
  }

  public OutParametersTokenize tokenizedBankAccounts(List<TokenizedBankAccount> tokenizedBankAccounts) {
    this.tokenizedBankAccounts = tokenizedBankAccounts;
    return this;
  }

  public OutParametersTokenize addTokenizedBankAccountsItem(TokenizedBankAccount tokenizedBankAccountsItem) {
    this.tokenizedBankAccounts.add(tokenizedBankAccountsItem);
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
    OutParametersTokenize outParametersTokenize = (OutParametersTokenize) o;
    return Objects.equals(appId, outParametersTokenize.appId) &&
        Objects.equals(userId, outParametersTokenize.userId) &&
        Objects.equals(tokenizedBankAccounts, outParametersTokenize.tokenizedBankAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, userId, tokenizedBankAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutParametersTokenize {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    tokenizedBankAccounts: ").append(toIndentedString(tokenizedBankAccounts)).append("\n");
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

