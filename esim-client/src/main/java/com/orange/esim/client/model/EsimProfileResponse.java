package com.orange.esim.client.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EsimProfileResponse  {
  
  @ApiModelProperty(required = true, value = "Integrated Circuit Card Identifier Il s'agit d'un identifiant de 19 (20 digits avec bourrage) qui identifie de manière unique un profile eSIM au niveau mondial. Il est retourné suite à la demande de réservation du profil eSIM.")
 /**
   * Integrated Circuit Card Identifier Il s'agit d'un identifiant de 19 (20 digits avec bourrage) qui identifie de manière unique un profile eSIM au niveau mondial. Il est retourné suite à la demande de réservation du profil eSIM.
  **/
  private String iccid;

  @ApiModelProperty(value = "Ce code est retourné par enabler eSIM si l'appel est effectué en définissant le profileStatus à \"downloadable\" ou \"downloadableWithConfirmationCode\" Le code d'activation retourné permet de générer le QR Code nécessaire au téléchargement du profil eSIM.")
 /**
   * Ce code est retourné par enabler eSIM si l'appel est effectué en définissant le profileStatus à \"downloadable\" ou \"downloadableWithConfirmationCode\" Le code d'activation retourné permet de générer le QR Code nécessaire au téléchargement du profil eSIM.
  **/
  private String activationCode;

  @ApiModelProperty(value = "Ce code est retourné en complément de l'activationCode si l'appel est effectué en définissant le profileStatus à \"downloadableWithConfirmationCode\". Le code de confirmation permet de sécuriser le téléchargement du profil (dépend des canaux). Il est généré par le module eSIM qui le transmet à  SM-DP+ dans le cas où le profileStatus est définit avec \"downloadableWithConfirmationCode\".")
 /**
   * Ce code est retourné en complément de l'activationCode si l'appel est effectué en définissant le profileStatus à \"downloadableWithConfirmationCode\". Le code de confirmation permet de sécuriser le téléchargement du profil (dépend des canaux). Il est généré par le module eSIM qui le transmet à  SM-DP+ dans le cas où le profileStatus est définit avec \"downloadableWithConfirmationCode\".
  **/
  private String confirmationCode;
 /**
   * Integrated Circuit Card Identifier Il s&#39;agit d&#39;un identifiant de 19 (20 digits avec bourrage) qui identifie de manière unique un profile eSIM au niveau mondial. Il est retourné suite à la demande de réservation du profil eSIM.
   * @return iccid
  **/
  @JsonProperty("iccid")
  public String getIccid() {
    return iccid;
  }

  public void setIccid(String iccid) {
    this.iccid = iccid;
  }

  public EsimProfileResponse iccid(String iccid) {
    this.iccid = iccid;
    return this;
  }

 /**
   * Ce code est retourné par enabler eSIM si l&#39;appel est effectué en définissant le profileStatus à \&quot;downloadable\&quot; ou \&quot;downloadableWithConfirmationCode\&quot; Le code d&#39;activation retourné permet de générer le QR Code nécessaire au téléchargement du profil eSIM.
   * @return activationCode
  **/
  @JsonProperty("activationCode")
  public String getActivationCode() {
    return activationCode;
  }

  public void setActivationCode(String activationCode) {
    this.activationCode = activationCode;
  }

  public EsimProfileResponse activationCode(String activationCode) {
    this.activationCode = activationCode;
    return this;
  }

 /**
   * Ce code est retourné en complément de l&#39;activationCode si l&#39;appel est effectué en définissant le profileStatus à \&quot;downloadableWithConfirmationCode\&quot;. Le code de confirmation permet de sécuriser le téléchargement du profil (dépend des canaux). Il est généré par le module eSIM qui le transmet à  SM-DP+ dans le cas où le profileStatus est définit avec \&quot;downloadableWithConfirmationCode\&quot;.
   * @return confirmationCode
  **/
  @JsonProperty("confirmationCode")
  public String getConfirmationCode() {
    return confirmationCode;
  }

  public void setConfirmationCode(String confirmationCode) {
    this.confirmationCode = confirmationCode;
  }

  public EsimProfileResponse confirmationCode(String confirmationCode) {
    this.confirmationCode = confirmationCode;
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
    EsimProfileResponse esimProfileResponse = (EsimProfileResponse) o;
    return Objects.equals(iccid, esimProfileResponse.iccid) &&
        Objects.equals(activationCode, esimProfileResponse.activationCode) &&
        Objects.equals(confirmationCode, esimProfileResponse.confirmationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iccid, activationCode, confirmationCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EsimProfileResponse {\n");
    
    sb.append("    iccid: ").append(toIndentedString(iccid)).append("\n");
    sb.append("    activationCode: ").append(toIndentedString(activationCode)).append("\n");
    sb.append("    confirmationCode: ").append(toIndentedString(confirmationCode)).append("\n");
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

