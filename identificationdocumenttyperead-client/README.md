# Client Java IdentificationDocumentTypeRead (Apache CXF 3.4)

Client SOAP du service CIL 7 `IdentificationDocumentTypeReadService` (BSCS / Ericsson), Apache CXF 3.4.10,
Java 8+. Le service renvoie la liste des types de pièce d'identité (code et libellé) et le code du type par
défaut s'il est défini.

Les classes JAX-WS/JAXB sont **déjà générées et versionnées** dans `src/main/java` :

| Package | Contenu |
|---|---|
| `com.ericsson.services.ws_cil_7` | `IdentificationDocumentTypeReadService` (interface du service) et `IdentificationDocumentTypeReadService_Service` (classe Service JAX-WS) |
| `com.ericsson.services.ws_cil_7.identificationdocumenttyperead` | requête, réponse et liste des types |
| `com.ericsson.services.ws_cil_7.sessionchange` | `SessionChangeRequest` (valeurs de session clé/valeur, facultatives) |
| `com.lhsgroup.lhsws.money`, `com.lhsgroup.lhsws.svlany` | types communs CIL déclarés dans le WSDL (non utilisés par cette opération) |
| `com.orangecaraibe.client.identificationdocumenttyperead` | code écrit à la main : factory, exemple et méthodes utilitaires |

Les packages suivent les namespaces Ericsson : les types communs (`sessionchange`, `money`, `svlany`) sont
identiques d'un service CIL 7 à l'autre.

## Build

```bash
mvn clean install
```

Aucun accès réseau au serveur n'est nécessaire : le WSDL est dans `wsdl/`. Les tests appellent le client contre
un faux service SOAP local (réponse nominale, réponse vide, valeurs de session, SOAP fault).

## Opération

| Opération | Signature |
|---|---|
| `identificationDocumentTypeRead` | `IdentificationDocumentTypeReadResponse identificationDocumentTypeRead(IdentificationDocumentTypeReadRequest request)` |

Réponse : `getListOfIdentificationDocumentType().getItem()` (liste de `idtypeCode` / `idtypeName`, la liste
peut être absente) et `getIdtypeDef()` (code du type par défaut, `null` s'il n'y en a pas).

## Utilisation

```java
IdentificationDocumentTypeReadService port = new IdentificationDocumentTypeReadClientFactory()
        .address("https://tst.eb.ms.fcm:443/wsi/services")
        .connectTimeout(10_000)
        .receiveTimeout(30_000)
        .logMessages(true)          // log des messages SOAP
        // .basicAuth("user", "pwd") // si nécessaire
        .create();

IdentificationDocumentTypeReadResponse response = port.identificationDocumentTypeRead(
        new IdentificationDocumentTypeReadRequest());

for (ListOfIdentificationDocumentTypeListpartResponse type : IdentificationDocumentTypeReadClientMain.types(response)) {
    System.out.println(type.getIdtypeCode() + " - " + type.getIdtypeName());
}
Long defaultType = response.getIdtypeDef();
```

Valeurs de session (`sessionChangeRequest`), si le service en attend : les clés dépendent de la release BSCS
(`BU_ID` ci-dessous est un exemple).

```java
IdentificationDocumentTypeReadClientMain.read(port, Collections.singletonMap("BU_ID", "2"));
```

Les erreurs du service arrivent en `javax.xml.ws.soap.SOAPFaultException` (le WSDL ne déclare pas de fault) ;
les erreurs techniques (réseau, timeout, TLS) en `javax.xml.ws.WebServiceException`.

L'adresse du WSDL est en HTTPS : le certificat du serveur doit être reconnu par la JVM (truststore par défaut ou
`-Djavax.net.ssl.trustStore=...`).

Voir `IdentificationDocumentTypeReadClientMain` pour un exemple complet, exécutable avec :

```bash
mvn compile exec:java -Dexec.args="https://tst.eb.ms.fcm:443/wsi/services"
```

## Régénérer les classes

Après une évolution du contrat, remplacer le fichier de `wsdl/` puis :

```bash
mvn -Pgenerate generate-sources
```

Pour régénérer depuis le service : `-Dwsdl.url="https://…/IdentificationDocumentTypeReadService?wsdl"`.
