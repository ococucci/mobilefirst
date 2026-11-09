# Client Java ManageProduceContract (Apache CXF 3.4)

Client SOAP du service `ManageProduceContractProviderService` (EPCO), Apache CXF 3.4.10, Java 8+.

Les classes JAX-WS/JAXB (~590) sont **déjà générées et versionnées** dans `src/main/java` :

| Package | Contenu |
|---|---|
| `com.orangecaraibe.epco.manageproducecontract` | `ManageProduceContract` (interface du service) + exceptions (`ProduceContractException`, `UpdateContractException`, `FindAndGetException`, `InterfaceUnavailableException`) |
| `com.orangecaraibe.epco.manageproducecontract.service` | `ManageProduceContractProviderService` (classe Service JAX-WS) |
| `com.orangecaraibe.epco.interfaces.manageproducecontract.schemas` | wrappers requête/réponse et faults |
| `com.orangecaraibe.epco.model.*` | modèle métier (`CustomerOrder`, `Criteria`, `Fault`…) |
| `com.orangecaraibe.client.manageproducecontract` | code écrit à la main : factory + exemples |

> Les classes sont dans `com.orangecaraibe.epco.*` et non dans `com.orangecaraibe.soa.v2.*` : le modèle
> commun publié par EPCO diffère de celui d'autres services (ex. ManagePayment : 24 classes de même nom
> au contenu différent). Des packages propres permettent d'utiliser les deux clients dans la même application.

## Build

```bash
mvn clean install
```

Aucun accès réseau au serveur n'est nécessaire : les WSDL sont dans `wsdl/`
(`manageProduceContract.wsdl` = binding + service, `ManageProduceContract.wsdl` = portType + XSD).

## Opérations

| Opération | Signature |
|---|---|
| `findAndGet` | `List<CustomerOrder> findAndGet(Criteria criteria)` |
| `produceContract` | `void produceContract(Holder<List<CustomerOrder>> customerOrder)` |
| `updateContract` | `void updateContract(Holder<List<CustomerOrder>> customerOrder, UseCase useCase)` |

`produceContract` et `updateContract` prennent les commandes en IN/OUT : après l'appel, `holder.value`
contient les commandes renvoyées par le service.

## Utilisation

```java
ManageProduceContract port = new ManageProduceContractClientFactory()
        .address("http://epco.gitg.ms.fcm/soa/manageProduceContract")
        .connectTimeout(10_000)
        .receiveTimeout(30_000)
        .logMessages(true)          // log des messages SOAP
        // .basicAuth("user", "pwd") // si nécessaire
        .create();

Eq eq = new Eq();
eq.setProperty("customerOrderID");
eq.setValue("123");
Criteria criteria = new Criteria();
criteria.getRestrictions().add(eq);
List<CustomerOrder> orders = port.findAndGet(criteria);

Holder<List<CustomerOrder>> holder = new Holder<>(orders);
port.produceContract(holder);
List<CustomerOrder> result = holder.value;
```

Toutes les faults héritent de `Fault` (`getCode()`, `getLabel()`, `getFaultDetail()`), accessibles via
`e.getFaultInfo()`. Les erreurs techniques (réseau, timeout) arrivent en `javax.xml.ws.WebServiceException`.

Voir `ManageProduceContractClientMain` pour des exemples complets, exécutables avec :

```bash
mvn compile exec:java -Dexec.args="http://epco.gitg.ms.fcm/soa/manageProduceContract"
```

## Régénérer les classes

Après une évolution du contrat, remplacer les fichiers de `wsdl/` puis :

```bash
mvn -Pgenerate generate-sources
```

Le pom associe chaque namespace XML à un package `com.orangecaraibe.epco.*` (`-p`). Si le nouveau contrat
ajoute un namespace, ajouter la ligne correspondante, sinon ses classes retomberont dans le package par défaut.
