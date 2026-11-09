# Client Java eSIM Consumer (REST, Apache CXF 3.4)

Client REST de l'API **eSIM Consumer** (`enabler-esim`, Swagger 2.0 `v2`), basé sur le client JAX-RS de
Apache CXF 3.4.10 et Jackson. Java 8+.

Les interfaces et les modèles sont **déjà générés et versionnés** dans `src/main/java` :

| Package | Contenu |
|---|---|
| `com.orange.esim.client.api` | `ProfilesApi`, `ServiceOrderApi`, `NotificationsApi` : interfaces JAX-RS générées |
| `com.orange.esim.client.model` | 25 modèles générés (`AllocateProfileRequest`, `GetProfileResponse`, `ServiceOrder`, `Error`, `SourceError`…) |
| `com.orange.esim.client` | code écrit à la main : `EsimClient` (façade), `EsimApiException`, exemple |

## Build

```bash
mvn clean install
```

## Utilisation

Le Swagger ne définit pas de serveur, seulement le chemin `/enabler-esim/api/api` : l'URL est obligatoire.

```java
EsimClient esim = EsimClient.builder()
        .baseUrl("http://<host>/enabler-esim/api/api")
        .applicationId("MYAPP")     // en-tête X-ORANGE-Application-Id (403 si absent ou inconnu)
        .userId("CUID")             // en-tête X-ORANGE-User-Id (optionnel)
        .connectTimeout(10_000)
        .receiveTimeout(30_000)
        .build();
```

| Méthode | Appel HTTP |
|---|---|
| `getStatus()` | `GET /profiles/status` |
| `getProfile(EsimProfileRequest)` | `POST /profiles` |
| `allocateProfile(AllocateProfileRequest)` | `POST /profiles/allocate` |
| `deliverProfile(iccid, DeliverProfileRequest)` | `POST /profiles/{iccid}/deliver` |
| `cancelProfile(iccid, CancelProfileRequest)` | `POST /profiles/{iccid}/cancel` |
| `getProfileByIccid(iccid)` | `GET /profiles/{iccid}` |
| `createServiceOrder(ServiceOrderCreate)` | `POST /serviceOrder` |
| `handleDownloadProgressInfo(...)` | `POST /gsma/rsp2/es2plus/handleDownloadProgressInfo` (notification ES2+, normalement envoyée par le SM-DP+) |

```java
AllocateProfileResponse allocated = esim.allocateProfile(new AllocateProfileRequest().profileType("P9054-2"));
DeliverProfileResponse delivered = esim.deliverProfile(allocated.getIccid(), new DeliverProfileRequest().deliveryMode("AC"));
String activationCode = delivered.getActivationCode();
```

### Erreurs

Les erreurs HTTP lèvent une `EsimApiException` (`getStatus()`, `getRawBody()`). Le corps est lu selon son format :

| Cas | Getter |
|---|---|
| 400 / 403 / 404 / 500 sur `/profiles…` | `getError()` (`code`, `message`), `getErrorCode()` |
| 424 Failed Dependency | `getSourceError()` (`source.name`, `source.httpCode`, `source.error`) |
| 400 / 404 / 500 sur `/serviceOrder` | `getEsimProfileError()` (`code`, `message`, `data`) |

Connexion refusée / timeout : `javax.ws.rs.ProcessingException`.

> `logMessages(true)` journalise les requêtes HTTP (ICCID, EID, codes d'activation…) : à n'activer qu'en développement.

Exemple exécutable :

```bash
mvn compile exec:java -Dexec.args="http://<host>/enabler-esim/api/api MYAPP P9054-2"
```

## Régénérer les classes

Après une évolution de l'API, remplacer `openapi/esim-api.json` puis :

```bash
mvn -Pgenerate generate-sources
```

Générateur : openapi-generator 6.6.0, `jaxrs-cxf-client`. Réglages notables du profil :
- `jackson=true` : ajoute `@JsonValue` / `@JsonCreator` aux enums (sinon `"acknowledged"`, `"preparation"` ne sont pas
  (dé)sérialisés). Les getters d'enum renvoient la valeur texte (`getState()` → `"acknowledged"`).
- `openapi/templates/api.mustache` retire deux imports inutilisés qui imposeraient la dépendance `swagger-jaxrs`.
- `EsimClient` force `Content-Type: application/json` : le Swagger n'en déclare pas pour `/profiles/allocate`
  et `/profiles/{iccid}/deliver`.
