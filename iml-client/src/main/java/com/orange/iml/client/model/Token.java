package com.orange.iml.client.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Jeton
 **/
@ApiModel(description="Jeton")

public class Token  {
  
  @ApiModelProperty(example = "FR79", required = true, value = "Les 4 premiers caractères du jeton ")
 /**
   * Les 4 premiers caractères du jeton 
  **/
  private String codeIban;

  @ApiModelProperty(example = "30006", required = true, value = "Code banque du jeton ")
 /**
   * Code banque du jeton 
  **/
  private String bankIdentifier;

  @ApiModelProperty(example = "00148", required = true, value = "Code guichet du jeton ")
 /**
   * Code guichet du jeton 
  **/
  private String bankBranchIdentifier;

  @ApiModelProperty(example = "YZPWWLX8901", required = true, value = "Numéro de compte du jeton ")
 /**
   * Numéro de compte du jeton 
  **/
  private String accountNumber;

  @ApiModelProperty(example = "01", required = true, value = "Clé RIB du jeton ")
 /**
   * Clé RIB du jeton 
  **/
  private String ribCheckDigits;
 /**
   * Les 4 premiers caractères du jeton 
   * @return codeIban
  **/
  @JsonProperty("codeIban")
  public String getCodeIban() {
    return codeIban;
  }

  public void setCodeIban(String codeIban) {
    this.codeIban = codeIban;
  }

  public Token codeIban(String codeIban) {
    this.codeIban = codeIban;
    return this;
  }

 /**
   * Code banque du jeton 
   * @return bankIdentifier
  **/
  @JsonProperty("bankIdentifier")
  public String getBankIdentifier() {
    return bankIdentifier;
  }

  public void setBankIdentifier(String bankIdentifier) {
    this.bankIdentifier = bankIdentifier;
  }

  public Token bankIdentifier(String bankIdentifier) {
    this.bankIdentifier = bankIdentifier;
    return this;
  }

 /**
   * Code guichet du jeton 
   * @return bankBranchIdentifier
  **/
  @JsonProperty("bankBranchIdentifier")
  public String getBankBranchIdentifier() {
    return bankBranchIdentifier;
  }

  public void setBankBranchIdentifier(String bankBranchIdentifier) {
    this.bankBranchIdentifier = bankBranchIdentifier;
  }

  public Token bankBranchIdentifier(String bankBranchIdentifier) {
    this.bankBranchIdentifier = bankBranchIdentifier;
    return this;
  }

 /**
   * Numéro de compte du jeton 
   * @return accountNumber
  **/
  @JsonProperty("accountNumber")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Token accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

 /**
   * Clé RIB du jeton 
   * @return ribCheckDigits
  **/
  @JsonProperty("ribCheckDigits")
  public String getRibCheckDigits() {
    return ribCheckDigits;
  }

  public void setRibCheckDigits(String ribCheckDigits) {
    this.ribCheckDigits = ribCheckDigits;
  }

  public Token ribCheckDigits(String ribCheckDigits) {
    this.ribCheckDigits = ribCheckDigits;
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
    Token token = (Token) o;
    return Objects.equals(codeIban, token.codeIban) &&
        Objects.equals(bankIdentifier, token.bankIdentifier) &&
        Objects.equals(bankBranchIdentifier, token.bankBranchIdentifier) &&
        Objects.equals(accountNumber, token.accountNumber) &&
        Objects.equals(ribCheckDigits, token.ribCheckDigits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeIban, bankIdentifier, bankBranchIdentifier, accountNumber, ribCheckDigits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Token {\n");
    
    sb.append("    codeIban: ").append(toIndentedString(codeIban)).append("\n");
    sb.append("    bankIdentifier: ").append(toIndentedString(bankIdentifier)).append("\n");
    sb.append("    bankBranchIdentifier: ").append(toIndentedString(bankBranchIdentifier)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    ribCheckDigits: ").append(toIndentedString(ribCheckDigits)).append("\n");
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

