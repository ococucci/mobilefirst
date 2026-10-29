# Orange Order First · Prise de commande mobile

Application Angular (mobile first) utilisée par le conseiller en boutique pour saisir des commandes mobiles
lorsque l'outil de vente Oreka Boutique est indisponible. Elle met en œuvre la cinématique
« Orange Order First · Prise de commande mobile » (version du 09/10/2026).

## Démarrer

```bash
npm install
npm start          # http://localhost:4200
npm test           # tests unitaires (Vitest)
npm run build      # build de production dans dist/
```

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
  domain/      règles de gestion (fonctions pures, testées) et modèles
  api/         un service par API de la section 9, bouchonné (données dans mock-data.ts)
  store/       état de la commande en cours (OrderStore)
  ui/          gabarit d'écran, étapes, récapitulatif, blocs réutilisés (identité, carte SIM)
  screens/     un composant par écran de la cinématique
```

| API (cinématique) | Service |
| --- | --- |
| Party (appy) | `api/party.api.ts` |
| api-scoring (Préventel) | `api/scoring.api.ts` |
| Catalogue Castor | `api/catalogue.api.ts` |
| api-promo advice | `api/promo-advice.api.ts` |
| api RHOC (Open ML) | `api/rhoc.api.ts` |
| api ressource | `api/ressource.api.ts` |
| api-order | `api/order.api.ts` (publie la commande validée dans le bus, `api/pubsub.ts`) |
| Enabler si-financier | `api/si-financier.api.ts` |
| Enabler managePayment | `api/manage-payment.api.ts` |
| Api-ORAS | `api/oras.api.ts` |
| Api-document | `api/document.api.ts` |
| api IML | `api/iml.api.ts` |
| api EPC | `api/epc.api.ts` |

Toutes les API sont bouchonnées : pour brancher le SI réel, il suffit de remplacer l'implémentation des
services (les écrans ne dépendent que de leurs signatures).

## Jeu de démonstration

| Saisie | Résultat |
| --- | --- |
| `06 90 12 34 56` | Mme Marie Dupont, score vert, 4 lignes (dont une Card prépayée et une ligne avec commande en cours) |
| `06 96 77 88 99` | M. Jean Martin, score orange, ligne Card (re-scoring orange : changement de forfait impossible) |
| `06 94 99 90 00` | Client en base avec score rouge : aucune vente |
| `06 90 40 05 00` | Client entreprise « Boulangerie des Îles » : actes de gestion uniquement |
| Autre numéro | Client inconnu : saisie de l'identité puis Préventel |
| Nom contenant « rouge » ou « orange » | Score Préventel correspondant (sinon vert) |
| Nouveau client Dupont Marie, 14/03/1988, CNI 12AB34567 | Doublon trouvé |
| N° sponsor Open ML | `0690 65 43 21` ou `0696 11 22 33` |
| ICCID en stock | `8933 0100 0000 0000 001`, `…019`, `…027`, `…035`, `…043`, ou bouton de scan |
| IBAN | `FR76 3000 6000 0112 3456 7890 189` |
| IMEI | `490154203237518` |
| Adresse | Saisir par exemple « Flamboyants » ou « Pointe-à-Pitre » |

Les montants et libellés d'offres sont des valeurs d'exemple.

## Hors périmètre (conformément à la cinématique)

- Incompatibilités entre remises commerciales et remise « Créateur d'entreprise ».
- Acquisition pour un client entreprise.
- Paiement par carte bancaire dans l'outil : les montants sont réglés en caisse, le mandat SEPA est signé hors outil.
