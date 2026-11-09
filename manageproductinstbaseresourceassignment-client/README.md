# Client Java ManageProductInstBaseResourceAssignment (Apache CXF 3.4)

Client SOAP du service `ManageProductInstBaseResourceAssignmentProviderService` (ENRA : gestion des clés
publiques installées — MSISDN, SIM…), Apache CXF 3.4.10, Java 8+.

Les classes JAX-WS/JAXB (~490) sont **déjà générées et versionnées** dans `src/main/java` :

| Package | Contenu |
|---|---|
| `com.orangecaraibe.enra.manageproductinstbaseresourceassignment` | `ManageProductInstBaseResourceAssignment` (interface du service) + 9 exceptions |
| `com.orangecaraibe.enra.manageproductinstbaseresourceassignment.service` | `ManageProductInstBaseResourceAssignmentProviderService` (classe Service JAX-WS) |
| `com.orangecaraibe.enra.interfaces.manageproductinstbaseresourceassignment.schemas` | wrappers requête/réponse et faults |
| `com.orangecaraibe.enra.model.*` | modèle métier (`InstalledPublicKey`, `Distributor`, `Criteria`, `Fault`…) |
| `com.orangecaraibe.client.manageproductinstbaseresourceassignment` | code écrit à la main : factory + exemples |

> Les classes sont dans `com.orangecaraibe.enra.*` : le modèle commun publié par chaque service Orange Caraïbe
> diffère légèrement. Des packages propres permettent d'utiliser ce client avec ManagePayment et
> ManageProduceContract dans la même application (aucune classe en commun).

## Build

```bash
mvn clean install
```

Aucun accès réseau au serveur n'est nécessaire : les WSDL sont dans `wsdl/`
(`manageProductInstBaseResourceAssignment.wsdl` = binding + service,
`ManageProductInstBaseResourceAssignment.wsdl` = portType + XSD).

## Opérations

| Opération | Signature |
|---|---|
| `findAndGetInstalledPublicKey` | `List<InstalledPublicKey> (Criteria)` |
| `reserveInstalledPublicKey` | `void (Holder<InstalledPublicKey>, Distributor)` |
| `checkInstalledPublicKey` | `void (Holder<InstalledPublicKey>, Distributor)` |
| `confirmInstalledPublicKey` | `void (InstalledPublicKey, Distributor)` |
| `cancelInstalledPublicKey` | `void (InstalledPublicKey, Distributor)` |
| `releaseInstalledPublicKey` | `void (Holder<InstalledPublicKey>)` |
| `recycleInstalledPublicKey` | `void (Holder<InstalledPublicKey>)` |
| `recycleAndReserveInstalledPublicKey` | `void (Holder<InstalledPublicKey>)` |

Avec un `Holder`, la clé est en IN/OUT : après l'appel, `holder.value` contient la clé renvoyée par le service.

## Utilisation

```java
ManageProductInstBaseResourceAssignment port = new ManageProductInstBaseResourceAssignmentClientFactory()
        .address("http://enra.gitg.ms.fcm/soa/manageProductInstBaseResourceAssignment")
        .connectTimeout(10_000)
        .receiveTimeout(30_000)
        .logMessages(true)          // log des messages SOAP
        // .basicAuth("user", "pwd") // si nécessaire
        .create();

Distributor distributor = new Distributor();
distributor.setChannelID("WEB");

Holder<InstalledPublicKey> holder = new Holder<>(key);
port.reserveInstalledPublicKey(holder, distributor);
InstalledPublicKey reserved = holder.value;

port.confirmInstalledPublicKey(reserved, distributor);
```

Toutes les faults héritent de `Fault` (`getCode()`, `getLabel()`, `getFaultDetail()`), accessibles via
`e.getFaultInfo()`. Les erreurs techniques (réseau, timeout) arrivent en `javax.xml.ws.WebServiceException`.

Voir `ManageProductInstBaseResourceAssignmentClientMain` pour des exemples complets, exécutables avec :

```bash
mvn compile exec:java -Dexec.args="http://enra.gitg.ms.fcm/soa/manageProductInstBaseResourceAssignment"
```

## Régénérer les classes

Après une évolution du contrat, remplacer les fichiers de `wsdl/` puis :

```bash
mvn -Pgenerate generate-sources
```

Le pom associe chaque namespace XML à un package `com.orangecaraibe.enra.*` (`-p`). Si le nouveau contrat
ajoute un namespace, ajouter la ligne correspondante, sinon ses classes retomberont dans le package par défaut.

Récupérer le WSDL avec `curl` plutôt que « Enregistrer sous » du navigateur, qui ajoute un `<script/>`
rendant le fichier invalide pour CXF.
