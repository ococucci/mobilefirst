/**
 * Jeu de données de démonstration. Les montants et libellés d'offres sont des valeurs
 * d'exemple, comme dans la cinématique.
 */
import { Customer, Line, Offer, OfferLevel, OfferOption, Terminal } from '../domain/models';

/** Client du jeu de démonstration, avec ses lignes (renvoyées à part par GET /customers/{id}/lines). */
export type MockCustomer = Customer & { lines: Line[] };

export const CUSTOMERS: MockCustomer[] = [
  {
    id: 'CL-000101',
    type: 'GP',
    identity: {
      civilite: 'Mme',
      nom: 'Dupont',
      prenom: 'Marie',
      dateNaissance: '1988-03-14',
      departementNaissance: '971 · Guadeloupe',
      nationalite: 'FR',
      pieceType: 'CNI',
      pieceNumero: '12AB34567',
      mobileContact: '0690123456',
      email: 'marie.dupont@exemple.fr',
    },
    address: {
      numeroVoie: '12', nomVoie: 'rue des Flamboyants',
      codePostal: '97100',
      commune: 'Basse-Terre',
      territoire: 'GUADELOUPE',
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
      nationalite: 'FR',
      pieceType: 'PASSEPORT',
      pieceNumero: '19FR55120',
      mobileContact: '0696778899',
      email: 'jean.martin@exemple.fr',
    },
    address: { numeroVoie: '4', nomVoie: 'avenue des Caraïbes', codePostal: '97200', commune: 'Fort-de-France', territoire: 'MARTINIQUE', complement: '' },
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
    address: { numeroVoie: '8', nomVoie: 'rue Lallouette', codePostal: '97300', commune: 'Cayenne', territoire: 'GUYANE FRANCAISE', complement: '' },
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
      nationalite: 'FR',
      pieceType: 'CNI',
      pieceNumero: '45GH78901',
      mobileContact: '0690400500',
      email: 'contact@boulangerie-des-iles.fr',
    },
    company: { raisonSociale: 'Boulangerie des Îles', siren: '812345678', siret: '81234567800015' },
    address: { numeroVoie: '25', nomVoie: 'boulevard Légitimus', codePostal: '97110', commune: 'Pointe-à-Pitre', territoire: 'GUADELOUPE', complement: '' },
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
  'europe-plus': 'Option Europe 25 Go',
  multisim: 'Multi-SIM',
  montre: 'eSIM montre connectée',
  securite: 'Sécurité mobile',
  international: 'Appels internationaux',
};
/**
 * Options incompatibles. Chaque incompatibilité n'est déclarée que d'un côté, comme le catalogue peut le faire :
 * elle s'applique quand même dans les deux sens.
 */
const INCOMPATIBLE: Record<string, string[]> = {
  'europe-plus': ['europe'],
  montre: ['multisim'],
};
const option = (id: string, price: number): OfferOption => ({ id, label: LABELS[id], price, included: false, incompatibleOptions: INCOMPATIBLE[id] ?? [] });
const included = (id: string): OfferOption => ({ ...option(id, 0), included: true });
/** Remise Open ML décrite comme une promo : code et libellé. */
const openMl = (monthlyDiscount: number) => ({
  eligible: true,
  id: `OPENML_${monthlyDiscount}E`,
  label: `Open ML −${monthlyDiscount} €/mois`,
  monthlyDiscount,
});
const promo10 = { id: 'promo-10e-6m', label: '−10 € / 6 mois', monthlyDiscount: 10, durationMonths: 6 };

/** Offres avec leurs options, leur remise (une seule, appliquée automatiquement) et l'éligibilité Open ML. */
export const OFFERS: Offer[] = [
  { id: 'bl-20', family: 'bloque', level: 'nonsub', label: 'Forfait bloqué 20 Go', detail: 'Appels 2 h, SMS illimités', price: 15.99, openMl: openMl(5),
    options: [option('europe', 5), option('multisim', 3), option('securite', 2)], promo: null },
  { id: 'bl-60', family: 'bloque', level: 'silver', label: 'Forfait bloqué 60 Go', detail: 'Appels et SMS illimités', price: 22.99, openMl: openMl(10),
    options: [option('europe', 5), option('europe-plus', 9), option('multisim', 3), option('montre', 5), option('securite', 2)], promo: promo10 },
  { id: 'bl-120', family: 'bloque', level: 'gold', label: 'Forfait bloqué 120 Go', detail: 'Appels et SMS illimités, 5G', price: 29.99, openMl: openMl(10),
    options: [included('europe'), option('europe-plus', 7), option('multisim', 3), option('montre', 5), option('international', 10)], promo: promo10 },
  { id: 'nb-10', family: 'non-bloque', level: 'nonsub', label: 'Forfait 10 Go', detail: 'Appels et SMS illimités', price: 9.99, openMl: openMl(5),
    options: [option('europe', 5), option('securite', 2)], promo: null },
  { id: 'nb-100', family: 'non-bloque', level: 'elite', label: 'Forfait 100 Go', detail: 'Appels et SMS illimités, 5G', price: 24.99, openMl: openMl(10),
    options: [option('europe', 5), option('europe-plus', 9), option('multisim', 3), option('montre', 5), option('securite', 2), option('international', 10)], promo: promo10 },
  { id: 'nb-200', family: 'non-bloque', level: 'platine', label: 'Forfait 200 Go 5G', detail: 'Appels illimités, 35 Go en Europe', price: 34.99, openMl: openMl(10),
    options: [included('europe'), option('multisim', 3), option('securite', 2), option('international', 8)], promo: null },
  { id: 'ie-4g', family: 'internet', level: 'nonsub', label: 'Internet Everywhere 4G', detail: '100 Go, routeur nomade', price: 19.99, openMl: openMl(5),
    options: [option('securite', 2)], promo: null },
  { id: 'home-5g', family: 'internet', level: 'silver', label: '4G/5G Home', detail: 'Internet illimité à domicile', price: 34.99, openMl: openMl(10),
    options: [], promo: { id: 'promo-5e-12m', label: '−5 € / 12 mois', monthlyDiscount: 5, durationMonths: 12 } },
  { id: 'pp-classique', family: 'prepaye', level: 'card', label: 'Carte Prépayée', detail: 'Sans engagement, rechargeable', price: 10, openMl: { eligible: false },
    options: [], promo: null },
];

/** Référentiel des pays (id ISO 3166-1 alpha-2, libellé), comme le bouchon du backend. */
export const COUNTRIES: { id: string; label: string }[] = [
  ['FR', 'France'], ['DZ', 'Algérie'], ['DE', 'Allemagne'], ['AG', 'Antigua-et-Barbuda'], ['AR', 'Argentine'], ['BS', 'Bahamas'],
  ['BB', 'Barbade'], ['BE', 'Belgique'], ['BJ', 'Bénin'], ['BR', 'Brésil'], ['CM', 'Cameroun'], ['CA', 'Canada'], ['CN', 'Chine'],
  ['CO', 'Colombie'], ['CG', 'Congo'], ['CD', 'Congo (Rép. dém.)'], ['CI', "Côte d'Ivoire"], ['CU', 'Cuba'], ['DM', 'Dominique'],
  ['EG', 'Égypte'], ['ES', 'Espagne'], ['US', 'États-Unis'], ['GA', 'Gabon'], ['GB', 'Royaume-Uni'], ['GD', 'Grenade'], ['GN', 'Guinée'],
  ['GY', 'Guyana'], ['HT', 'Haïti'], ['IN', 'Inde'], ['IT', 'Italie'], ['JM', 'Jamaïque'], ['LB', 'Liban'], ['LU', 'Luxembourg'],
  ['MG', 'Madagascar'], ['ML', 'Mali'], ['MA', 'Maroc'], ['MU', 'Maurice'], ['MX', 'Mexique'], ['NL', 'Pays-Bas'], ['PE', 'Pérou'],
  ['PL', 'Pologne'], ['PT', 'Portugal'], ['DO', 'République dominicaine'], ['RO', 'Roumanie'], ['KN', 'Saint-Christophe-et-Niévès'],
  ['LC', 'Sainte-Lucie'], ['VC', 'Saint-Vincent-et-les-Grenadines'], ['SN', 'Sénégal'], ['CH', 'Suisse'], ['SR', 'Suriname'],
  ['SY', 'Syrie'], ['TT', 'Trinité-et-Tobago'], ['TN', 'Tunisie'], ['TR', 'Turquie'], ['UA', 'Ukraine'], ['VE', 'Venezuela'], ['VN', 'Viêt Nam'],
]
  .map(([id, label]) => ({ id, label }))
  .sort((a, b) => a.label.localeCompare(b.label, 'fr'));

/** Sponsors Open ML reconnus par api RHOC (N° de mobile ou ND -> nom, prénom). */
export const SPONSORS: Record<string, { lastName: string; firstName: string }> = {
  '0690654321': { lastName: 'MARTIN', firstName: 'JULIEN' },
  '0696112233': { lastName: 'LOUISON', firstName: 'CHANTAL' },
  '0590240254': { lastName: 'ROSEMOND', firstName: 'PATRICE' },
};

export const AVAILABLE_NUMBERS = ['0690123480', '0690123481', '0690123482', '0690123499', '0691245566'];

/**
 * Modèle de terminal : prix par niveau d'offre [nonsub, card, silver, gold, elite, platine] (null : pas proposé avec
 * cette gamme) et couleurs proposées.
 */
const terminal = (id: string, brand: string, model: string, prices: (number | null)[], colors: string[]): Terminal => {
  const levels: OfferLevel[] = ['nonsub', 'card', 'silver', 'gold', 'elite', 'platine'];
  return {
    id,
    brand,
    model,
    prices: Object.fromEntries(levels.flatMap((l, i) => (prices[i] == null ? [] : [[l, prices[i]]]))) as Partial<Record<OfferLevel, number>>,
    colors: colors.map((label) => ({ id: `${id}-${label}`, label })),
  };
};

const APPLE_COLORS = ['blanc', 'bleu', 'noir', 'rose', 'vert'];

/** Terminaux (enabler si-financier) : prix selon le niveau de l'offre et couleurs proposées. */
export const TERMINALS: Terminal[] = [
  terminal('again-a1', 'AGAIN', 'Again A1 4G', [49, 49, 29, 9, 5, 1], ['noir']),
  terminal('alcatel-1b', 'ALCATEL', 'Alcatel 1B 32Go', [79, 79, 59, 29, 19, 9], ['bleu', 'noir']),
  terminal('alcatel-3l', 'ALCATEL', 'Alcatel 3L 64Go', [129, 129, 99, 59, 44, 29], ['noir']),
  terminal('ip15-128', 'APPLE', 'iPhone 15 128Go', [769, 769, 649, 529, 464, 399], APPLE_COLORS),
  terminal('ip15-256', 'APPLE', 'iPhone 15 256Go', [899, 899, 779, 659, 594, 529], APPLE_COLORS),
  terminal('ip15plus-256', 'APPLE', 'iPhone 15 PLUS 256Go', [999, 999, 879, 759, 694, 629], APPLE_COLORS),
  terminal('ip15pro-128', 'APPLE', 'iPhone 15 PRO 128Go', [null, null, null, 869, 804, 739], ['blanc', 'bleu', 'noir']),
  terminal('ip15pro-256', 'APPLE', 'iPhone 15 PRO 256Go', [null, null, null, 999, 934, 869], ['blanc', 'bleu', 'noir']),
  terminal('ip15promax-256', 'APPLE', 'iPhone 15 PRO MAX 256Go', [null, null, null, 1119, 1054, 989], ['blanc', 'bleu', 'noir']),
  terminal('ip15promax-512', 'APPLE', 'iPhone 15 PRO MAX 512Go', [null, null, null, 1369, 1304, 1239], ['blanc', 'bleu', 'noir']),
  terminal('ip16-128', 'APPLE', 'iPhone 16 5G 128Go', [969, 969, 829, 689, 619, 549], APPLE_COLORS),
  terminal('ip16-256', 'APPLE', 'iPhone 16 5G 256Go', [1099, 1099, 959, 819, 749, 679], APPLE_COLORS),
  terminal('ip16plus-128', 'APPLE', 'iPhone 16 PLUS 5G 128Go', [1119, 1119, 979, 839, 769, 699], APPLE_COLORS),
  terminal('ip16plus-256', 'APPLE', 'iPhone 16 PLUS 5G 256Go', [1249, 1249, 1109, 969, 899, 829], APPLE_COLORS),
  terminal('bb-key2', 'BLACK BERRY', 'BlackBerry KEY2 64Go', [349, 349, 299, 249, 224, 199], ['noir']),
  terminal('cadaoz-c3', 'CADAOZ', 'Cadaoz C3 4G', [59, 59, 39, 19, 10, 1], ['blanc', 'noir']),
  terminal('sam-a15', 'SAMSUNG', 'Galaxy A15 128Go', [149, 149, 99, 49, 25, 1], ['blanc', 'bleu', 'noir']),
  terminal('sam-s24', 'SAMSUNG', 'Galaxy S24 5G 256Go', [null, null, 749, 599, 524, 449], ['bleu', 'noir', 'vert']),
  terminal('xiaomi-rn13', 'XIAOMI', 'Redmi Note 13 128Go', [199, 199, 149, 99, 74, 49], ['bleu', 'noir', 'vert']),
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
  { numeroVoie: '12', nomVoie: 'rue des Flamboyants', codePostal: '97100', commune: 'Basse-Terre' },
  { numeroVoie: '25', nomVoie: 'boulevard Légitimus', codePostal: '97110', commune: 'Pointe-à-Pitre' },
  { numeroVoie: '3', nomVoie: 'rue Frébault', codePostal: '97110', commune: 'Pointe-à-Pitre' },
  { numeroVoie: '14', nomVoie: 'rue Schoelcher', codePostal: '97100', commune: 'Basse-Terre' },
  { numeroVoie: '4', nomVoie: 'avenue des Caraïbes', codePostal: '97200', commune: 'Fort-de-France' },
  { numeroVoie: '8', nomVoie: 'rue Lallouette', codePostal: '97300', commune: 'Cayenne' },
  { numeroVoie: '1', nomVoie: 'place de la Victoire', codePostal: '97110', commune: 'Pointe-à-Pitre' },
  { numeroVoie: '17', nomVoie: 'route de Gosier', codePostal: '97190', commune: 'Le Gosier' },
];
