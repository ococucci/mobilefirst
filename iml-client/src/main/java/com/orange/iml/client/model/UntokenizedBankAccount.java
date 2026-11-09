package com.orange.iml.client.model;

import com.orange.iml.client.model.RIB;
import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Liste d’informations bancaires (données déjetonisées) 
 **/
@ApiModel(description="Liste d’informations bancaires (données déjetonisées) ")

public class UntokenizedBankAccount  {
  
  @ApiModelProperty(example = "1", value = "Identifiant unique de l’information bancaire ")
 /**
   * Identifiant unique de l’information bancaire 
  **/
  private String uid;

  @ApiModelProperty(example = "FR7630006000011234567890189", value = "IBAN")
 /**
   * IBAN
  **/
  private String iban;

  @ApiModelProperty(example = "FR76", value = "Les 4 premiers caractères de l’IBAN ")
 /**
   * Les 4 premiers caractères de l’IBAN 
  **/
  private String codeIban;

  @ApiModelProperty(value = "")
  private RIB rib;

  @ApiModelProperty(example = "CREDIT AGRICOLE S A", value = "Libellé de la banque ")
 /**
   * Libellé de la banque 
  **/
  private String bankName;

  @ApiModelProperty(example = "FRANCE", value = "Libellé du pays ")
 /**
   * Libellé du pays 
  **/
  private String bankBranchName;

  @ApiModelProperty(example = "AGRIFRPPXXX", value = "Identifiant international de la banque ")
 /**
   * Identifiant international de la banque 
  **/
  private String codeBic;

  @ApiModelProperty(example = "UNTOKENIZED", value = "Statut de la déjetonisation ")
 /**
   * Statut de la déjetonisation 
  **/
  private String status;
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

  public UntokenizedBankAccount uid(String uid) {
    this.uid = uid;
    return this;
  }

 /**
   * IBAN
   * @return iban
  **/
  @JsonProperty("iban")
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public UntokenizedBankAccount iban(String iban) {
    this.iban = iban;
    return this;
  }

 /**
   * Les 4 premiers caractères de l’IBAN 
   * @return codeIban
  **/
  @JsonProperty("codeIban")
  public String getCodeIban() {
    return codeIban;
  }

  public void setCodeIban(String codeIban) {
    this.codeIban = codeIban;
  }

  public UntokenizedBankAccount codeIban(String codeIban) {
    this.codeIban = codeIban;
    return this;
  }

 /**
   * Get rib
   * @return rib
  **/
  @JsonProperty("rib")
  public RIB getRib() {
    return rib;
  }

  public void setRib(RIB rib) {
    this.rib = rib;
  }

  public UntokenizedBankAccount rib(RIB rib) {
    this.rib = rib;
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

  public UntokenizedBankAccount bankName(String bankName) {
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

  public UntokenizedBankAccount bankBranchName(String bankBranchName) {
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

  public UntokenizedBankAccount codeBic(String codeBic) {
    this.codeBic = codeBic;
    return this;
  }

 /**
   * Statut de la déjetonisation 
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public UntokenizedBankAccount status(String status) {
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
    UntokenizedBankAccount untokenizedBankAccount = (UntokenizedBankAccount) o;
    return Objects.equals(uid, untokenizedBankAccount.uid) &&
        Objects.equals(iban, untokenizedBankAccount.iban) &&
        Objects.equals(codeIban, untokenizedBankAccount.codeIban) &&
        Objects.equals(rib, untokenizedBankAccount.rib) &&
        Objects.equals(bankName, untokenizedBankAccount.bankName) &&
        Objects.equals(bankBranchName, untokenizedBankAccount.bankBranchName) &&
        Objects.equals(codeBic, untokenizedBankAccount.codeBic) &&
        Objects.equals(status, untokenizedBankAccount.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, iban, codeIban, rib, bankName, bankBranchName, codeBic, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UntokenizedBankAccount {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    codeIban: ").append(toIndentedString(codeIban)).append("\n");
    sb.append("    rib: ").append(toIndentedString(rib)).append("\n");
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

