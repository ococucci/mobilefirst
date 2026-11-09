# Client Java ManagePayment (Apache CXF 3.4)

Client SOAP du service `ManagePaymentProviderService` (enabler-si-monetique), Apache CXF 3.4.10, Java 8+.

Les classes JAX-WS/JAXB (~520) sont **déjà générées et versionnées** dans `src/main/java` :

| Package | Contenu |
|---|---|
| `com.orangecaraibe.soa.managepayment` | `ManagePayment` (interface du service) + exceptions (`DoPaymentException`, `InterfaceUnavailableException`…) |
| `com.orangecaraibe.soa.managepayment.service` | `ManagePaymentProviderService` (classe Service JAX-WS) |
| `com.orangecaraibe.soa.v2.interfaces.managepayment.schemas` | wrappers requête/réponse et faults |
| `com.orangecaraibe.soa.v2.model.*` | modèle métier (`Payment`, `Refund`, `LocalPaymentFacility`, `Criteria`…) |
| `com.orangecaraibe.client.managepayment` | code écrit à la main : factory + exemples |

## Build

```bash
mvn clean install
```

Aucun accès réseau au serveur n'est nécessaire : les WSDL sont dans `wsdl/`
(`managePayment.wsdl` = binding + service, `ManagePayment.wsdl` = portType + XSD).

## Régénérer les classes

Après une évolution du contrat, remplacer les fichiers de `wsdl/` puis :

```bash
mvn -Pgenerate generate-sources
```

Ou directement depuis le serveur :

```bash
mvn -Pgenerate generate-sources -Dwsdl.url="http://it-enabler-si-monetique-1.xitg.ms.fcm:8080/enabler-si-monetique/soa/managePayment?wsdl"
```

## Utilisation

```java
ManagePayment port = new ManagePaymentClientFactory()
        .address("http://it-enabler-si-monetique-1.xitg.ms.fcm:8080/enabler-si-monetique/soa/managePayment")
        .connectTimeout(10_000)
        .receiveTimeout(30_000)
        .logMessages(true)          // log des messages SOAP
        // .basicAuth("user", "pwd") // si nécessaire
        .create();

// Recherche : Criteria + restrictions (Eq, Like, Gt, And, Or...)
Eq eq = new Eq();
eq.setProperty("paymentID");
eq.setValue("123");
Criteria criteria = new Criteria();
criteria.getRestrictions().add(eq);
List<Payment> payments = port.findAndGetPayment(criteria);

// Opérations de mise à jour : le paiement est un paramètre IN/OUT (Holder)
Holder<Payment> holder = new Holder<>(payment);
port.doPayment(useCase, holder, computerOrNetworkEquipment);
Payment result = holder.value;
```

Toutes les faults héritent de `Fault` (`getCode()`, `getLabel()`, `getFaultDetail()`), accessibles via
`e.getFaultInfo()`. Les erreurs techniques (réseau, timeout) arrivent en `javax.xml.ws.WebServiceException`.

Voir `ManagePaymentClientMain` pour des exemples complets, exécutables avec :

```bash
mvn compile exec:java -Dexec.args="http://host:8080/enabler-si-monetique/soa/managePayment"
```
