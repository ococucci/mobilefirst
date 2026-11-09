package com.orange.iml.client.model;

import com.orange.iml.client.model.Token;
import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Liste de données bancaires jetonisées (jetons)
 **/
@ApiModel(description="Liste de données bancaires jetonisées (jetons)")

public class TokenizedBankAccount  {
  
  @ApiModelProperty(example = "1", required = true, value = "Identifiant unique de l’information bancaire tokenisé")
 /**
   * Identifiant unique de l’information bancaire tokenisé
  **/
  private String uid;

  @ApiModelProperty(required = true, value = "")
  private Token token;

  @ApiModelProperty(example = "CREDIT AGRICOLE S A", required = true, value = "Libellé de la banque ")
 /**
   * Libellé de la banque 
  **/
  private String bankName;

  @ApiModelProperty(example = "FRANCE", required = true, value = "Libellé du pays ")
 /**
   * Libellé du pays 
  **/
  private String bankBranchName;

  @ApiModelProperty(example = "AGRIFRPPXXX", required = true, value = "Identifiant international de la banque")
 /**
   * Identifiant international de la banque
  **/
  private String codeBic;

  @ApiModelProperty(example = "TOKENIZED", required = true, value = "Statut de la demande de jetonisation ")
 /**
   * Statut de la demande de jetonisation 
  **/
  private String status;
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

  public TokenizedBankAccount uid(String uid) {
    this.uid = uid;
    return this;
  }

 /**
   * Get token
   * @return token
  **/
  @JsonProperty("token")
  public Token getToken() {
    return token;
  }

  public void setToken(Token token) {
    this.token = token;
  }

  public TokenizedBankAccount token(Token token) {
    this.token = token;
    return this;
  }

 /**
   * Libellé de la banque 
   * @return bankName
  **/
  @JsonProperty("bankName")
  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public TokenizedBankAccount bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

 /**
   * Libellé du pays 
   * @return bankBranchName
  **/
  @JsonProperty("bankBranchName")
  public String getBankBranchName() {
    return bankBranchName;
  }

  public void setBankBranchName(String bankBranchName) {
    this.bankBranchName = bankBranchName;
  }

  public TokenizedBankAccount bankBranchName(String bankBranchName) {
    this.bankBranchName = bankBranchName;
    return this;
  }

 /**
   * Identifiant international de la banque
   * @return codeBic
  **/
  @JsonProperty("codeBic")
  public String getCodeBic() {
    return codeBic;
  }

  public void setCodeBic(String codeBic) {
    this.codeBic = codeBic;
  }

  public TokenizedBankAccount codeBic(String codeBic) {
    this.codeBic = codeBic;
    return this;
  }

 /**
   * Statut de la demande de jetonisation 
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public TokenizedBankAccount status(String status) {
    this.status = status;
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
    TokenizedBankAccount tokenizedBankAccount = (TokenizedBankAccount) o;
    return Objects.equals(uid, tokenizedBankAccount.uid) &&
        Objects.equals(token, tokenizedBankAccount.token) &&
        Objects.equals(bankName, tokenizedBankAccount.bankName) &&
        Objects.equals(bankBranchName, tokenizedBankAccount.bankBranchName) &&
        Objects.equals(codeBic, tokenizedBankAccount.codeBic) &&
        Objects.equals(status, tokenizedBankAccount.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, token, bankName, bankBranchName, codeBic, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenizedBankAccount {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bankBranchName: ").append(toIndentedString(bankBranchName)).append("\n");
    sb.append("    codeBic: ").append(toIndentedString(codeBic)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

