package com.orange.iml.client.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Liste de données bancaires
 **/
@ApiModel(description="Liste de données bancaires")

public class UniqueBankAccount  {
  
  @ApiModelProperty(example = "1", required = true, value = "Identifiant unique de l’information bancaire")
 /**
   * Identifiant unique de l’information bancaire
  **/
  private String uid;

  @ApiModelProperty(example = "FR7630006000011234567890189", required = true, value = "Donnée bancaire (RIB ou IBAN) ")
 /**
   * Donnée bancaire (RIB ou IBAN) 
  **/
  private String bankAccount;
 /**
   * Identifiant unique de l’information bancaire
   * @return uid
  **/
  @JsonProperty("uid")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public UniqueBankAccount uid(String uid) {
    this.uid = uid;
    return this;
  }

 /**
   * Donnée bancaire (RIB ou IBAN) 
   * @return bankAccount
  **/
  @JsonProperty("bankAccount")
  public String getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
  }

  public UniqueBankAccount bankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
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
    UniqueBankAccount uniqueBankAccount = (UniqueBankAccount) o;
    return Objects.equals(uid, uniqueBankAccount.uid) &&
        Objects.equals(bankAccount, uniqueBankAccount.bankAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, bankAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UniqueBankAccount {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
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

