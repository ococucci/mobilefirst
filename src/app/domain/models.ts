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

/** Sponsor Open ML trouvé par api RHOC, envoyé tel quel dans la commande. */
export interface Sponsor {
  /** N° de mobile ou ND du sponsor, au format national. */
  msisdn: string;
  lastName: string;
  firstName: string;
  /** Jeton RHOC de la recherche. */
  tokenId: string;
}

/** Information bancaire tokenisée renvoyée par api IML à l'enregistrement du mandat SEPA. */
export interface IbanToken {
  /** Identifiant unique de l'information bancaire tokenisée. */
  uid: string;
  /** Les 4 premiers caractères du jeton (ex. FR79). */
  codeIban: string;
  /** Code banque du jeton. */
  bankIdentifier: string;
  /** Code guichet du jeton. */
  bankBranchIdentifier: string;
  /** Numéro de compte du jeton. */
  accountNumber: string;
  /** Clé RIB du jeton. */
  ribCheckDigits: string;
}


/** Pays de la liste de référence : la nationalité du client contient son id. */
export interface Country {
  id: string;
  label: string;
}

export interface Identity {
  civilite: 'M.' | 'Mme';
  nom: string;
  prenom: string;
  /** Format ISO yyyy-mm-dd. */
  dateNaissance: string;
  departementNaissance: string;
  /** Nationalité d'origine : id du pays (liste GET /catalog/countries) ; vide si non renseignée. */
  nationalite: string;
  pieceType: PieceType;
  pieceNumero: string;
  mobileContact: string;
  email: string;
}

/**
 * Adresse fiabilisée par Api-ORAS : numéro et nom de la voie, code postal et commune viennent de l'adresse choisie
 * dans la recherche ; le complément est saisi librement.
 */
export interface Address {
  /** Numéro dans la voie (ex. « 12 », « 3 bis ») ; vide pour une voie ou un lieu-dit sans numéro. */
  numeroVoie: string;
  /** Type et nom de la voie (ex. « rue des Flamboyants »). */
  nomVoie: string;
  codePostal: string;
  commune: string;
  /** Territoire déduit du code postal (GUADELOUPE, MARTINIQUE, GUYANE FRANCAISE, ST-MARTIN, ST-BARTHELEMY, FRANCE). */
  territoire: string;
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
}

export interface Family {
  id: FamilyId;
  label: string;
}

/** Niveau de l'offre : détermine le tarif (niveau de subvention) des terminaux. */
export type OfferLevel = 'nonsub' | 'card' | 'silver' | 'gold' | 'elite' | 'platine';

export interface Offer {
  id: string;
  family: FamilyId;
  /** Niveau de l'offre : le terminal est vendu au tarif de ce niveau. */
  level: OfferLevel;
  label: string;
  detail: string;
  /** Prix en euros : mensualité, ou tarif unique réglé en caisse pour la Carte Prépayée. */
  price: number;
  /** Remise Open ML : −5 €/mois pour une offre d'entrée de gamme, −10 € sinon ; non éligible pour la Carte Prépayée. */
  openMl: OpenMl;
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
  /**
   * Options (identifiants) incompatibles avec celle-ci : tant qu'elle est active, elles ne peuvent pas être choisies.
   * L'incompatibilité vaut dans les deux sens, même si elle n'est déclarée que sur l'une des deux options.
   */
  incompatibleOptions: string[];
}

/** Remise Open ML d'une offre, décrite comme une promo : code et libellé affichés sur la vignette de l'offre. */
export interface OpenMl {
  eligible: boolean;
  /** Code de la remise (ex. « OPENML_10E ») ; absent si l'offre n'est pas éligible. */
  id?: string | null;
  /** Libellé affiché sur l'offre (ex. « Open ML −10 €/mois ») ; absent si l'offre n'est pas éligible. */
  label?: string | null;
  monthlyDiscount?: number | null;
}

export interface Promo {
  id: string;
  label: string;
  monthlyDiscount: number;
  durationMonths: number;
}

/** Couleur proposée pour un modèle de terminal. */
export interface TerminalColor {
  id: string;
  label: string;
}

/** Modèle de terminal : prix selon le niveau de l'offre et couleurs proposées. */
export interface Terminal {
  id: string;
  brand: string;
  model: string;
  /** Prix du terminal (en euros) par niveau d'offre ; sans prix pour un niveau, il n'est pas proposé avec cette gamme. */
  prices: Partial<Record<OfferLevel, number>>;
  colors: TerminalColor[];
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

export const OFFER_LEVELS: { id: OfferLevel; label: string }[] = [
  { id: 'nonsub', label: 'Non subventionné' },
  { id: 'card', label: 'Card' },
  { id: 'silver', label: 'Silver' },
  { id: 'gold', label: 'Gold' },
  { id: 'elite', label: 'Elite' },
  { id: 'platine', label: 'Platine' },
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

export const SIM_LOSS_FEE = 10;

export const FLOW_LABELS: Record<Flow, string> = {
  acquisition: 'Nouvelle ligne',
  forfait: 'Changement de forfait',
  options: "Changement d'option",
  sim: 'Changement de SIM',
};
