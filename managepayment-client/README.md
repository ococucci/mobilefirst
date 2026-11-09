# Client Java ManagePayment (Apache CXF 3.4)

Client SOAP du service `ManagePaymentProviderService` (enabler-si-monetique), généré avec `cxf-codegen-plugin` 3.4.10.

## Génération + build

Le WSDL fourni (`wsdl/managePayment.wsdl`) ne contient que le binding et le service ; il importe
`ManagePayment.wsdl` (portType + XSD) depuis le serveur. Il faut donc avoir accès au réseau interne :

```bash
mvn clean install
```

Autre URL (autre environnement) :

```bash
mvn clean install -Dwsdl.url="http://autre-host:8080/enabler-si-monetique/soa/managePayment?wsdl"
```

Hors réseau : télécharger `?wsdl`, `?wsdl=ManagePayment.wsdl` et les éventuels `?xsd=...`,
réécrire les `location`/`schemaLocation` en relatif, puis `-Dwsdl.url=file:///chemin/managePayment.wsdl`.

Les classes sont générées dans `target/generated-sources/cxf` :
- `com.orangecaraibe.soa.managepayment.ManagePayment` : interface du service (SEI)
- `com.orangecaraibe.soa.managepayment.*` : requêtes/réponses et exceptions (faults)

## Utilisation

```java
ManagePayment port = new ManagePaymentClientFactory()
        .address("http://it-enabler-si-monetique-1.xitg.ms.fcm:8080/enabler-si-monetique/soa/managePayment")
        .connectTimeout(10_000)
        .receiveTimeout(30_000)
        .logMessages(true)          // log des messages SOAP
        // .basicAuth("user", "pwd") // si nécessaire
        .create();

FindAndGetPaymentResponse resp = port.findAndGetPayment(request);
```

Exemple exécutable :

```bash
mvn compile exec:java -Dexec.args="http://host:8080/enabler-si-monetique/soa/managePayment"
```

Java 8+ (testé jusqu'à Java 21).
