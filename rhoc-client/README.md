# Client Java RHOC (REST, Apache CXF 3.4)

Client REST de l'API **RHOC** (droits de remise / parrainage, OpenAPI 3.0.2 `2.4.0.0-RC1-SNAPSHOT`, service FastAPI),
basé sur le client JAX-RS de Apache CXF 3.4.10 et Jackson. Java 8+.

L'interface et les modèles sont **déjà générés et versionnés** dans `src/main/java` :

| Package | Contenu |
|---|---|
| `com.orange.rhoc.client.api` | `DefaultApi` : interface JAX-RS générée |
| `com.orange.rhoc.client.model` | 13 modèles générés (`DiscountRight`, `DiscountRightStatus`, `Vertical`, `PayloadPubSub`…) |
| `com.orange.rhoc.client` | code écrit à la main : `RhocClient` (façade), `DiscountRightsQuery`, `PubSubResult`, `RhocApiException`, exemple |

## Build

```bash
mvn clean install
```

## Utilisation

Le spec ne définit pas de serveur : l'URL est obligatoire (sans `/v0`).

```java
RhocClient rhoc = RhocClient.builder()
        .baseUrl("https://<host>")
        .connectTimeout(10_000)
        .receiveTimeout(30_000)
        .build();

// GET /v0/discountRights : status et vertical obligatoires, autres critères optionnels
List<DiscountRight> rights = rhoc.getDiscountRights(
        DiscountRightsQuery.of(DiscountRightStatus.CONSOMMABLE, Vertical.MOBILE_OAG)
                .beneficiaryCid("590690000000"));
```

L'en-tête obligatoire `X-Cloud-Trace-Context` est généré automatiquement (`TRACE_ID/SPAN_ID;o=1`).
Pour propager celui de la requête entrante : `rhoc.getDiscountRights(query, traceContext)`.

### Pub/Sub

`POST /v0/discountRights/pubsub` est normalement appelé par Google Pub/Sub (push). Sa réponse dépend du statut,
d'où `PubSubResult` :

| Statut | Signification | Accès |
|---|---|---|
| 201 | droits de remise créés | `getDiscountRights()` |
| 200 | payload non traité (code 1) ou invalide (code 2) | `getNotTreated()` |
| 204 | pas de contenu | `getLocation()` (URL des droits liés) |

```java
PubSubResult result = rhoc.handlePubSubMessage(
        RhocClient.pubSubPayload(customerOrderJson, "projects/<p>/subscriptions/<s>"));  // data encodé en base64
```

### Erreurs

`RhocApiException` : `getStatus()`, `getErrorCode()`, `getErrorMessage()`, `getErrorDescription()`, `getJson()`, `getRawBody()`.

| Statut | Codes |
|---|---|
| 400 | 25 en-tête manquant, 26 valeur d'en-tête manquante, 27 paramètre manquant, 28 paramètre invalide |
| 403 | 3 Forbidden |
| 422 | validation FastAPI (non documenté) : `getJson().get("detail")` |
| 503 | 5 API temporairement indisponible |

Connexion refusée / timeout : `javax.ws.rs.ProcessingException`.

Exemple exécutable :

```bash
mvn compile exec:java -Dexec.args="https://<host> 590690000000"
```

## Points d'attention sur le spec

- **`DiscountRight.timestamp`** a pour valeur par défaut `"2026-11-09T13:32:01Z"` dans le spec (heure de démarrage du
  serveur FastAPI figée à l'export). Le client la reprend : si l'API ne renvoie pas `timestamp`, cette valeur
  apparaît. Ne pas s'y fier.
- **`ValidationError.loc`** (`anyOf` string/entier) est généré comme une classe vide `LocationInner` : les erreurs
  422 sont donc lues via `getJson()` et non via les modèles.
- **`Message`** déclare `messageId`/`message_id` et `publishTime`/`publish_time` (Pub/Sub envoie les deux) : les
  variantes snake_case s'appellent `messageIdSnakeCase` / `publishTimeSnakeCase` en Java.

## Régénérer les classes

Après une évolution de l'API, remplacer `openapi/rhoc-api.json` puis :

```bash
mvn -Pgenerate generate-sources
```

Générateur : openapi-generator **7.4.0** (`nameMappings`, absent de la 6.x, est nécessaire pour `Message`),
`jaxrs-cxf-client`, `jackson=true` pour les enums. Le template `openapi/templates/api.mustache` retire deux imports
inutilisés qui imposeraient la dépendance `swagger-jaxrs`.
