/**
 * Jeu de données de démonstration. Les montants et libellés d'offres sont des valeurs
 * d'exemple, comme dans la cinématique.
 */
import { Customer, Offer, OfferOption, Terminal } from '../domain/models';

export const CUSTOMERS: Customer[] = [
  {
    id: 'CL-000101',
    type: 'GP',
    identity: {
      civilite: 'Mme',
      nom: 'Dupont',
      prenom: 'Marie',
      dateNaissance: '1988-03-14',
      departementNaissance: '971 · Guadeloupe',
      nationalite: 'Française',
      pieceType: 'CNI',
      pieceNumero: '12AB34567',
      mobileContact: '0690123456',
      email: 'marie.dupont@exemple.fr',
    },
    address: {
      ligne: '12 rue des Flamboyants',
      codePostal: '97100',
      commune: 'Basse-Terre',
      complement: 'Résidence Les Palmiers, bât. B',
    },
    score: 'vert',
    lines: [
      { msisdn: '0690123456', offerId: 'bl-60', offerLabel: 'Forfait bloqué 60 Go', monthlyPrice: 22.99, isCard: false, simType: 'physique', options: ['europe', 'multisim'] },
      { msisdn: '0690550123', offerId: 'nb-100', offerLabel: 'Forfait 100 Go', monthlyPrice: 24.99, isCard: false, simType: 'esim', options: [] },
      { msisdn: '0690550124', offerId: 'pp-classique', offerLabel: 'Card prépayée', monthlyPrice: null, isCard: true, simType: 'physique', options: [] },
      { msisdn: '0690550125', offerId: 'nb-10', offerLabel: 'Forfait 10 Go', monthlyPrice: 9.99, isCard: false, simType: 'physique', options: [] },
    ],
  },
  {
    id: 'CL-000102',
    type: 'GP',
    identity: {
      civilite: 'M.',
      nom: 'Martin',
      prenom: 'Jean',
      dateNaissance: '1975-07-02',
      departementNaissance: '972 · Martinique',
      nationalite: 'Française',
      pieceType: 'PASSEPORT',
      pieceNumero: '19FR55120',
      mobileContact: '0696778899',
      email: 'jean.martin@exemple.fr',
    },
    address: { ligne: '4 avenue des Caraïbes', codePostal: '97200', commune: 'Fort-de-France', complement: '' },
    score: 'orange',
    lines: [
      { msisdn: '0696778899', offerId: 'pp-classique', offerLabel: 'Card prépayée', monthlyPrice: null, isCard: true, simType: 'physique', options: [] },
    ],
  },
  {
    id: 'CL-000103',
    type: 'GP',
    identity: {
      civilite: 'M.',
      nom: 'Bernard',
      prenom: 'Luc',
      dateNaissance: '1990-11-21',
      departementNaissance: '973 · Guyane',
      nationalite: '',
      pieceType: 'CNI',
      pieceNumero: '88CD12345',
      mobileContact: '0694999000',
      email: 'luc.bernard@exemple.fr',
    },
    address: { ligne: '8 rue Lallouette', codePostal: '97300', commune: 'Cayenne', complement: '' },
    score: 'rouge',
    lines: [
      { msisdn: '0694999000', offerId: 'nb-10', offerLabel: 'Forfait 10 Go', monthlyPrice: 9.99, isCard: false, simType: 'physique', options: [] },
    ],
  },
  {
    id: 'CL-000201',
    type: 'PRO',
    identity: {
      civilite: 'Mme',
      nom: 'Lebon',
      prenom: 'Sophie',
      dateNaissance: '1982-05-09',
      departementNaissance: '971 · Guadeloupe',
      nationalite: 'Française',
      pieceType: 'CNI',
      pieceNumero: '45GH78901',
      mobileContact: '0690400500',
      email: 'contact@boulangerie-des-iles.fr',
    },
    company: { raisonSociale: 'Boulangerie des Îles', siren: '812345678', siret: '81234567800015' },
    address: { ligne: '25 boulevard Légitimus', codePostal: '97110', commune: 'Pointe-à-Pitre', complement: '' },
    score: 'vert',
    lines: [
      { msisdn: '0690400500', offerId: 'nb-200', offerLabel: 'Forfait 200 Go 5G', monthlyPrice: 34.99, isCard: false, simType: 'physique', options: ['international'] },
      { msisdn: '0690400501', offerId: 'nb-10', offerLabel: 'Forfait 10 Go', monthlyPrice: 9.99, isCard: false, simType: 'esim', options: [] },
    ],
  },
];

/** Lignes ayant une commande en cours (information portée par api-order). */
export const PENDING_ORDER_LINES = ['0690550125'];

/** Résultat du re-scoring Préventel pour les clients en base (ligne Card qui change de forfait). */
export const RESCORE: Record<string, 'vert' | 'orange' | 'rouge'> = {
  'CL-000101': 'vert',
  'CL-000102': 'orange',
};

const LABELS: Record<string, string> = {
  europe: 'Option Europe 10 Go',
  multisim: 'Multi-SIM',
  securite: 'Sécurité mobile',
  international: 'Appels internationaux',
};
const option = (id: string, price: number): OfferOption => ({ id, label: LABELS[id], price, included: false });
const included = (id: string): OfferOption => ({ id, label: LABELS[id], price: 0, included: true });
const openMl = (monthlyDiscount: number) => ({ eligible: true, monthlyDiscount });
const promo10 = { id: 'promo-10e-6m', label: '−10 € / 6 mois', monthlyDiscount: 10, durationMonths: 6 };

/** Offres avec leurs options, leur remise (une seule, appliquée automatiquement) et l'éligibilité Open ML. */
export const OFFERS: Offer[] = [
  { id: 'bl-20', family: 'bloque', label: 'Forfait bloqué 20 Go', detail: 'Appels 2 h, SMS illimités', price: 15.99, openMl: openMl(5),
    options: [option('europe', 5), option('multisim', 3), option('securite', 2)], promo: null },
  { id: 'bl-60', family: 'bloque', label: 'Forfait bloqué 60 Go', detail: 'Appels et SMS illimités', price: 22.99, openMl: openMl(10),
    options: [option('europe', 5), option('multisim', 3), option('securite', 2)], promo: promo10 },
  { id: 'bl-120', family: 'bloque', label: 'Forfait bloqué 120 Go', detail: 'Appels et SMS illimités, 5G', price: 29.99, openMl: openMl(10),
    options: [included('europe'), option('multisim', 3), option('international', 10)], promo: promo10 },
  { id: 'nb-10', family: 'non-bloque', label: 'Forfait 10 Go', detail: 'Appels et SMS illimités', price: 9.99, openMl: openMl(5),
    options: [option('europe', 5), option('securite', 2)], promo: null },
  { id: 'nb-100', family: 'non-bloque', label: 'Forfait 100 Go', detail: 'Appels et SMS illimités, 5G', price: 24.99, openMl: openMl(10),
    options: [option('europe', 5), option('multisim', 3), option('securite', 2), option('international', 10)], promo: promo10 },
  { id: 'nb-200', family: 'non-bloque', label: 'Forfait 200 Go 5G', detail: 'Appels illimités, 35 Go en Europe', price: 34.99, openMl: openMl(10),
    options: [included('europe'), option('multisim', 3), option('securite', 2), option('international', 8)], promo: null },
  { id: 'ie-4g', family: 'internet', label: 'Internet Everywhere 4G', detail: '100 Go, routeur nomade', price: 19.99, openMl: openMl(5),
    options: [option('securite', 2)], promo: null },
  { id: 'home-5g', family: 'internet', label: '4G/5G Home', detail: 'Internet illimité à domicile', price: 34.99, openMl: openMl(10),
    options: [], promo: { id: 'promo-5e-12m', label: '−5 € / 12 mois', monthlyDiscount: 5, durationMonths: 12 } },
  { id: 'pp-classique', family: 'prepaye', label: 'Carte Prépayée', detail: 'Sans engagement, rechargeable', price: 0, openMl: { eligible: false },
    options: [], promo: null },
];

/** N° sponsor Open ML reconnus par api RHOC. */
export const SPONSORS = ['0690654321', '0696112233'];

export const AVAILABLE_NUMBERS = ['0690123480', '0690123481', '0690123482', '0690123499', '0691245566'];

export const TERMINALS: Terminal[] = [
  { id: 'tel-a15', label: 'Samsung Galaxy A15', price: 149 },
  { id: 'tel-ip15', label: 'iPhone 15 128 Go', price: 769 },
  { id: 'tel-redmi', label: 'Xiaomi Redmi Note 13', price: 199 },
];

/** ICCID en stock boutique (enabler si-financier). */
export const ICCID_STOCK = [
  '8933010000000000001',
  '8933010000000000019',
  '8933010000000000027',
  '8933010000000000035',
  '8933010000000000043',
];

export const ADDRESSES = [
  { ligne: '12 rue des Flamboyants', codePostal: '97100', commune: 'Basse-Terre' },
  { ligne: '25 boulevard Légitimus', codePostal: '97110', commune: 'Pointe-à-Pitre' },
  { ligne: '3 rue Frébault', codePostal: '97110', commune: 'Pointe-à-Pitre' },
  { ligne: '14 rue Schoelcher', codePostal: '97100', commune: 'Basse-Terre' },
  { ligne: '4 avenue des Caraïbes', codePostal: '97200', commune: 'Fort-de-France' },
  { ligne: '8 rue Lallouette', codePostal: '97300', commune: 'Cayenne' },
  { ligne: '1 place de la Victoire', codePostal: '97110', commune: 'Pointe-à-Pitre' },
  { ligne: '17 route de Gosier', codePostal: '97190', commune: 'Le Gosier' },
];
