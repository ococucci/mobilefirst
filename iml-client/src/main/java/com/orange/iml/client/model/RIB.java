package com.orange.iml.client.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Objet rib représentant un format découpé du RIB 
 **/
@ApiModel(description="Objet rib représentant un format découpé du RIB ")

public class RIB  {
  
  @ApiModelProperty(example = "30006", value = "Le code banque ")
 /**
   * Le code banque 
  **/
  private String bankIdentifier;

  @ApiModelProperty(example = "00001", value = "Le code guichet")
 /**
   * Le code guichet
  **/
  private String bankBranchIdentifier;

  @ApiModelProperty(example = "12345678901", value = "Le numéro de compte ")
 /**
   * Le numéro de compte 
  **/
  private String accountNumber;

  @ApiModelProperty(example = "89", value = "La clé RIB ")
 /**
   * La clé RIB 
  **/
  private String ribCheckDigits;
 /**
   * Le code banque 
   * @return bankIdentifier
  **/
  @JsonProperty("bankIdentifier")
  public String getBankIdentifier() {
    return bankIdentifier;
  }

  public void setBankIdentifier(String bankIdentifier) {
    this.bankIdentifier = bankIdentifier;
  }

  public RIB bankIdentifier(String bankIdentifier) {
    this.bankIdentifier = bankIdentifier;
    return this;
  }

 /**
   * Le code guichet
   * @return bankBranchIdentifier
  **/
  @JsonProperty("bankBranchIdentifier")
  public String getBankBranchIdentifier() {
    return bankBranchIdentifier;
  }

  public void setBankBranchIdentifier(String bankBranchIdentifier) {
    this.bankBranchIdentifier = bankBranchIdentifier;
  }

  public RIB bankBranchIdentifier(String bankBranchIdentifier) {
    this.bankBranchIdentifier = bankBranchIdentifier;
    return this;
  }

 /**
   * Le numéro de compte 
   * @return accountNumber
  **/
  @JsonProperty("accountNumber")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public RIB accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

 /**
   * La clé RIB 
   * @return ribCheckDigits
  **/
  @JsonProperty("ribCheckDigits")
  public String getRibCheckDigits() {
    return ribCheckDigits;
  }

  public void setRibCheckDigits(String ribCheckDigits) {
    this.ribCheckDigits = ribCheckDigits;
  }

  public RIB ribCheckDigits(String ribCheckDigits) {
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
    RIB RIB = (RIB) o;
    return Objects.equals(bankIdentifier, RIB.bankIdentifier) &&
        Objects.equals(bankBranchIdentifier, RIB.bankBranchIdentifier) &&
        Objects.equals(accountNumber, RIB.accountNumber) &&
        Objects.equals(ribCheckDigits, RIB.ribCheckDigits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankIdentifier, bankBranchIdentifier, accountNumber, ribCheckDigits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RIB {\n");
    
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

