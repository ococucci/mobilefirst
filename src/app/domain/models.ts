/** Modèle métier de la prise de commande mobile (Orange Order First). */

export type Score = 'vert' | 'orange' | 'rouge';

export type Flow = 'acquisition' | 'forfait' | 'options' | 'sim';

export type Screen =
  | 'identification'
  | 'demande'
  | 'client'
  | 'forfait'
  | 'materiel'
  | 'ligne'
  | 'options'
  | 'sim'
  | 'confirmation'
  | 'succes';

export type FamilyId = 'bloque' | 'non-bloque' | 'internet' | 'prepaye';

export type SimType = 'physique' | 'esim';

export type PieceType = 'CNI' | 'PASSEPORT';

export interface Identity {
  civilite: 'M.' | 'Mme';
  nom: string;
  prenom: string;
  /** Format ISO yyyy-mm-dd. */
  dateNaissance: string;
  departementNaissance: string;
  nationalite: string;
  pieceType: PieceType;
  pieceNumero: string;
  mobileContact: string;
  email: string;
}

export interface Address {
  ligne: string;
  codePostal: string;
  commune: string;
  complement: string;
}

export interface Company {
  raisonSociale: string;
  siren: string;
  siret: string;
}

export interface Line {
  msisdn: string;
  offerId: string;
  offerLabel: string;
  /** null pour une ligne Card prépayée (sans mensualité). */
  monthlyPrice: number | null;
  isCard: boolean;
  simType: SimType;
  options: string[];
}

export interface Customer {
  id: string;
  type: 'GP' | 'PRO';
  identity: Identity;
  company?: Company;
  address: Address;
  score: Score;
  lines: Line[];
}

export interface Family {
  id: FamilyId;
  label: string;
}

export interface Offer {
  id: string;
  family: FamilyId;
  label: string;
  detail: string;
  /** Prix mensuel en euros (0 pour la Carte Prépayée). */
  price: number;
  /** Remise Open ML : −5 €/mois pour une offre d'entrée de gamme, −10 € sinon ; non éligible pour la Carte Prépayée. */
  openMl: { eligible: boolean; monthlyDiscount?: number | null };
  /** Options proposées avec cette offre, à un prix propre à l'offre. */
  options: OfferOption[];
  /** Remise appliquée automatiquement (api-promo advice) : une seule par offre, les remises ne se cumulent pas. */
  promo: Promo | null;
}

export interface OfferOption {
  id: string;
  label: string;
  price: number;
  /** Option incluse dans l'offre : gratuite et toujours active. */
  included: boolean;
}

export interface Promo {
  id: string;
  label: string;
  monthlyDiscount: number;
  durationMonths: number;
}

export interface Terminal {
  id: string;
  label: string;
  price: number;
}

export interface SimReason {
  id: string;
  label: string;
  /** Frais de 10 € à régler en caisse (perte et vol uniquement). */
  fee: boolean;
}

export interface OrderResult {
  orderNumber: string;
  createdAt: Date;
  cashDue: number;
  paymentRef?: string;
}

export const FAMILIES: Family[] = [
  { id: 'bloque', label: 'Forfait bloqué' },
  { id: 'non-bloque', label: 'Forfait non bloqué' },
  { id: 'internet', label: 'Forfait Internet Everywhere et 4G/5G Home' },
  { id: 'prepaye', label: 'Carte Prépayée' },
];

export const SIM_REASONS: SimReason[] = [
  { id: 'mobile', label: 'Changement de mobile', fee: false },
  { id: 'technique', label: 'Problème technique', fee: false },
  { id: 'obsolete', label: 'SIM obsolète', fee: false },
  { id: 'perte-vol', label: 'SIM perdue ou volée', fee: true },
  { id: 'endommagee', label: 'SIM endommagée', fee: false },
  { id: 'esim', label: "Passage à l'eSIM", fee: false },
  { id: 'autre', label: 'Autre', fee: false },
];

export const DONOR_OPERATORS = ['SFR Caraibes', 'FREE', 'Dauphin Telecom', 'UTS', 'DIGICEL'];

export const DEPARTEMENTS = [
  '971 · Guadeloupe',
  '972 · Martinique',
  '973 · Guyane',
  '974 · La Réunion',
  '976 · Mayotte',
  '977 · Saint-Barthélemy',
  '978 · Saint-Martin',
  '75 · Paris',
  '99 · Né à l’étranger',
];

export const CARD_SIM_PRICE = 10;
export const SIM_LOSS_FEE = 10;

export const FLOW_LABELS: Record<Flow, string> = {
  acquisition: 'Nouvelle ligne',
  forfait: 'Changement de forfait',
  options: "Changement d'option",
  sim: 'Changement de SIM',
};
