# Client Java IBAN Management Layer (REST, Apache CXF 3.4)

Client REST de l'API **IBAN Management Layer** (`in-iml-as1`), basé sur le client JAX-RS de
Apache CXF 3.4.10 et Jackson. Java 8+.

L'interface et les modèles sont **déjà générés et versionnés** dans `src/main/java` :

| Package | Contenu |
|---|---|
| `com.orange.iml.client.api` | `ImlProviderApi` : interface JAX-RS générée (`tokenize1`, `untokenize1`) |
| `com.orange.iml.client.model` | 11 modèles générés (`InParametersTokenize`, `TokenizedBankAccount`, `Token`, `Error`…) |
| `com.orange.iml.client` | code écrit à la main : `ImlClient` (façade), `ImlApiException`, exemple |

## Build

```bash
mvn clean install
```

## Utilisation

```java
ImlClient iml = ImlClient.builder()
        .baseUrl("http://in-iml-as1.ms.fcm:9500/iban-management-layer/ws/api")
        .appId("CLEMENTINE")        // obligatoire
        .userId("CUID")             // optionnel
        .connectTimeout(10_000)
        .receiveTimeout(30_000)
        .build();

// Jetonisation (uid "1", "2"... attribués dans l'ordre)
OutParametersTokenize out = iml.tokenize("FR7630006000011234567890189");
Token token = out.getTokenizedBankAccounts().get(0).getToken();

// Déjetonisation
OutParamatersUntokenize back = iml.untokenize("FR793000600148YZPWWLX890101");
String iban = back.getUntokenizedBankAccounts().get(0).getIban();

// Ou avec les objets complets (uid choisis par l'appelant)
iml.tokenize(new InParametersTokenize()
        .appId("CLEMENTINE")
        .addUniqueBankAccountsItem(new UniqueBankAccount().uid("A1").bankAccount("FR76...")));
```

### Erreurs

| Cas | Exception |
|---|---|
| HTTP 400 (entrée invalide), 503 (OPSI indisponible), 500 (erreur interne) | `ImlApiException` : `getStatus()`, `getErrorCode()` (ex. `4000`, `5030`), `getError()`, `getRawBody()` |
| Connexion refusée, timeout | `javax.ws.rs.ProcessingException` |

Le corps d'erreur est lu qu'il soit envoyé en `application/json` ou en `text/plain` (les deux sont décrits dans le Swagger).

> `logMessages(true)` journalise les requêtes HTTP, qui contiennent des IBAN : à n'activer qu'en développement.

Exemple exécutable :

```bash
mvn compile exec:java -Dexec.args="http://in-iml-as1.ms.fcm:9500/iban-management-layer/ws/api CLEMENTINE FR7630006000011234567890189"
```

## Régénérer les classes

Après une évolution de l'API, remplacer `openapi/iml-api.json` puis :

```bash
mvn -Pgenerate generate-sources
```

Générateur : openapi-generator 6.6.0, `jaxrs-cxf-client`. Le template `openapi/templates/api.mustache` retire
deux imports inutilisés qui imposeraient la dépendance `swagger-jaxrs`. Le Swagger n'ayant pas de
`info.version`, la validation du spec est désactivée.
