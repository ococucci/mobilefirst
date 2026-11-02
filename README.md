# Orange Order First · Prise de commande mobile

Application Angular (mobile first) utilisée par le conseiller en boutique pour saisir des commandes mobiles
lorsque l'outil de vente Oreka Boutique est indisponible. Elle met en œuvre la cinématique
« Orange Order First · Prise de commande mobile » (version du 09/10/2026).

## Démarrer

Le front peut tourner de deux façons :

- **avec l'API** [`ococucci/mobilefirst-api`](https://github.com/ococucci/mobilefirst-api) (Spring Boot) ;
- **seul, avec les bouchons intégrés** : même contrat et même jeu de démonstration que l'API, sans backend.
  Un badge « Démo · bouchons » s'affiche alors dans l'en-tête.

```bash
npm install
```

| Commande | Usage |
| --- | --- |
| `npm start` | Développement avec l'API, `/api` redirigé vers `http://localhost:8080` (http://localhost:4200) |
| `API_TARGET=https://recette.exemple.fr npm start` | Développement avec une API sur un autre endpoint |
| `npm run start:mock` | Développement sans backend, bouchons intégrés |
| `npm run build` | Build de production (appels vers l'API) dans `dist/` |
| `npm run build:mock` | Build de démonstration (bouchons intégrés) dans `dist/` |
| `npm test` | Tests unitaires (Vitest) |

Pour lancer l'API : `./mvnw spring-boot:run` dans `mobilefirst-api`.

### Configuration à l'exécution

Après le build, le fichier `config.json` (à la racine de l'application, vide par défaut) permet de changer
l'endpoint ou le mode sans reconstruire. Exemple (voir aussi `config.example.json` à la racine du projet) :

```json
{ "backend": "api", "apiUrl": "https://api.exemple.fr/api/v1" }
```

- `apiUrl` : URL de base de l'API, relative (même domaine ou passerelle, `/api/v1` par défaut) ou absolue. Avec une
  URL absolue sur un autre domaine, ajouter l'origine du front à `orderfirst.cors.allowed-origins` côté API.
- `backend` : `api` (par défaut) ou `mock` pour une démonstration sans backend.

Les valeurs du build (`src/environments/`) s'appliquent pour tout ce que `config.json` ne précise pas. Les
bouchons ne sont chargés qu'en mode `mock` (fichier séparé), ils n'alourdissent pas l'application en mode `api`.

Si l'API ne répond pas ou renvoie une erreur, un bandeau rouge l'indique en haut de l'écran ; l'action en cours
s'arrête et le conseiller peut réessayer.

## Parcours couverts

| Cas | Écrans |
| --- | --- |
| Identification (commune) | Recherche par MSISDN · numéro inconnu + Préventel · client sans numéro avec contrôle de doublon · score rouge |
| 1 · Nouvelle ligne | Client › Forfait › Matériel et paiement › Confirmation › Commande validée (variante Carte Prépayée) |
| 2 · Changement de forfait | Ligne › Forfait › Confirmation › Commande validée (re-scoring d'une ligne Card) |
| 3 · Modification des options | Ligne › Options › Confirmation › Commande validée (sans contrat) |
| 4 · Changement de SIM | Ligne et raison › Carte SIM › Confirmation › Commande validée (frais de 10 € pour perte ou vol) |

Mise en page : barre latérale d'étapes et récapitulatif en colonne sur bureau ; barre de progression et
récapitulatif repliable en bas d'écran sur mobile.

## Organisation du code

```
src/app/
  domain/      règles de gestion (fonctions pures, testées), validation et modèles
  api/         clients HTTP de l'API mobilefirst-api, un par ressource
  mock/        bouchons intégrés (mode mock) : intercepteur qui répond comme l'API, jeu de démonstration
  store/       état de la commande en cours (OrderStore)
  ui/          gabarit d'écran, étapes, récapitulatif, blocs réutilisés (identité, carte SIM)
  screens/     un composant par écran de la cinématique
```

| Service | Endpoints (`/api/v1`) | API du SI derrière |
| --- | --- | --- |
| `api/customer.api.ts` | `/customers` (recherche, existence, création, mise à jour, lignes en cours, re-scoring) | Party, api-scoring, api-order |
| `api/catalog.api.ts` | `/catalog/*`, `/numbers/available`, `/open-ml/sponsor-checks` | Castor, promo advice, ressource, RHOC |
| `api/hardware.api.ts` | `/hardware/*` (terminaux, ICCID, lecture de SIM) | si-financier |
| `api/address.api.ts` | `/addresses` | Api-ORAS |
| `api/order.api.ts` | `/sepa-mandates`, `/contracts`, `/orders`, `/orders/{n}/cash-payments` | IML, EPC, Api-document, api-order, PubSub, managePayment |

Une recherche sans résultat répond 204 (numéro inconnu, aucun client existant) : le service renvoie alors `null`.
Les règles de gestion restent contrôlées dans le front pour guider la saisie, puis l'API les revérifie ; le
montant à régler en caisse affiché après validation est celui calculé par l'API.

## Jeu de démonstration

Les données viennent des bouchons de l'API, ou des bouchons intégrés en mode `mock` (même jeu). Une commande
validée consomme réellement la SIM, réserve le numéro et met la ligne en « commande en cours » : redémarrer l'API
(ou recharger la page en mode `mock`) remet le jeu à zéro.

| Saisie | Résultat |
| --- | --- |
| `06 90 12 34 56` | Mme Marie Dupont, score vert, 4 lignes (dont une Card prépayée et une ligne avec commande en cours) |
| `06 96 77 88 99` | M. Jean Martin, score orange, ligne Card (re-scoring orange : changement de forfait impossible) |
| `06 94 99 90 00` | Client en base avec score rouge : aucune vente |
| `06 90 40 05 00` | Client entreprise « Boulangerie des Îles » : actes de gestion uniquement |
| Autre numéro | Client inconnu : saisie de l'identité puis Préventel |
| Nom contenant « rouge » ou « orange » | Score Préventel correspondant (sinon vert) |
| Nouveau client Dupont Marie, 14/03/1988, CNI 12AB34567 | Doublon trouvé |
| N° de pièce d'identité | 9 caractères (CNI récente, passeport) ou 12 (ancienne CNI), lettres et chiffres |
| N° sponsor Open ML | `0690 65 43 21` ou `0696 11 22 33` |
| ICCID en stock | `8933 0100 0000 0000 001`, `…019`, `…027`, `…035`, `…043`, ou bouton de scan |
| IBAN | `FR76 3000 6000 0112 3456 7890 189` |
| IMEI | `490154203237518` |
| Adresse | Saisir par exemple « Flamboyants » ou « Pointe-à-Pitre » |

Les montants et libellés d'offres sont des valeurs d'exemple.

## Validation des saisies

Les règles et les messages d'erreur sont regroupés dans `src/app/domain/validation.ts` (testés). Après un clic
sur « Continuer », chaque champ en erreur passe en bordure rouge avec son message en dessous, le premier champ
en erreur reçoit le focus, et un rappel s'affiche près du bouton. Les messages disparaissent au fur et à mesure
des corrections.

## Hors périmètre (conformément à la cinématique)

- Incompatibilités entre remises commerciales et remise « Créateur d'entreprise ».
- Acquisition pour un client entreprise.
- Paiement par carte bancaire dans l'outil : les montants sont réglés en caisse, le mandat SEPA est signé hors outil.
