package com.orange.iml.client.model;

import com.orange.iml.client.model.UntokenizedBankAccount;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OutParamatersUntokenize  {
  
  @ApiModelProperty(example = "KARANBOL", required = true, value = "Même identifiant unique de l’application passé en entrée")
 /**
   * Même identifiant unique de l’application passé en entrée
  **/
  private String appId;

  @ApiModelProperty(example = "AD\\herm0001", value = "Même identifiant de l’utilisateur applicatif passé en entrée")
 /**
   * Même identifiant de l’utilisateur applicatif passé en entrée
  **/
  private String userId;

  @ApiModelProperty(value = "Liste d’informations bancaires (données déjetonisées) ")
 /**
   * Liste d’informations bancaires (données déjetonisées) 
  **/
  private List<UntokenizedBankAccount> untokenizedBankAccounts;
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

  public OutParamatersUntokenize appId(String appId) {
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

  public OutParamatersUntokenize userId(String userId) {
    this.userId = userId;
    return this;
  }

 /**
   * Liste d’informations bancaires (données déjetonisées) 
   * @return untokenizedBankAccounts
  **/
  @JsonProperty("untokenizedBankAccounts")
  public List<UntokenizedBankAccount> getUntokenizedBankAccounts() {
    return untokenizedBankAccounts;
  }

  public void setUntokenizedBankAccounts(List<UntokenizedBankAccount> untokenizedBankAccounts) {
    this.untokenizedBankAccounts = untokenizedBankAccounts;
  }

  public OutParamatersUntokenize untokenizedBankAccounts(List<UntokenizedBankAccount> untokenizedBankAccounts) {
    this.untokenizedBankAccounts = untokenizedBankAccounts;
    return this;
  }

  public OutParamatersUntokenize addUntokenizedBankAccountsItem(UntokenizedBankAccount untokenizedBankAccountsItem) {
    this.untokenizedBankAccounts.add(untokenizedBankAccountsItem);
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
    OutParamatersUntokenize outParamatersUntokenize = (OutParamatersUntokenize) o;
    return Objects.equals(appId, outParamatersUntokenize.appId) &&
        Objects.equals(userId, outParamatersUntokenize.userId) &&
        Objects.equals(untokenizedBankAccounts, outParamatersUntokenize.untokenizedBankAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, userId, untokenizedBankAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutParamatersUntokenize {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    untokenizedBankAccounts: ").append(toIndentedString(untokenizedBankAccounts)).append("\n");
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

