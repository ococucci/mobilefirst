/**
 * Règles de gestion (section 2 de la cinématique), sous forme de fonctions pures
 * pour être testées indépendamment des écrans.
 */
import {
  CARD_SIM_PRICE,
  FamilyId,
  Flow,
  Identity,
  Line,
  Offer,
  OfferOption,
  Score,
  Screen,
  SIM_LOSS_FEE,
  SIM_REASONS,
} from './models';

export const digits = (value: string): string => value.replace(/\D/g, '');

export const compact = (value: string): string => value.replace(/[\s.-]/g, '').toUpperCase();

export function isValidMsisdn(value: string): boolean {
  return /^0[67]\d{8}$/.test(digits(value)) && digits(value).length === value.replace(/[\s.]/g, '').length;
}

/** Code RIO : 2 chiffres opérateur, P ou E, 6 caractères client, 3 caractères de clé. */
export function isValidRio(value: string): boolean {
  return /^\d{2}[PE][A-Z0-9]{6}[A-Z0-9]{3}$/.test(compact(value));
}

/** Contrôle ISO 13616 (modulo 97). */
export function isValidIban(value: string): boolean {
  const iban = compact(value);
  if (!/^[A-Z]{2}\d{2}[A-Z0-9]{10,30}$/.test(iban)) return false;
  const rearranged = iban.slice(4) + iban.slice(0, 4);
  const numeric = rearranged.replace(/[A-Z]/g, (c) => String(c.charCodeAt(0) - 55));
  let remainder = 0;
  for (const ch of numeric) remainder = (remainder * 10 + Number(ch)) % 97;
  return remainder === 1;
}

/** ICCID : 19 ou 20 chiffres commençant par 89 (télécom). */
export function isValidIccid(value: string): boolean {
  return /^89\d{17,18}$/.test(compact(value));
}

export function luhnValid(value: string): boolean {
  let sum = 0;
  const d = digits(value);
  for (let i = 0; i < d.length; i++) {
    let n = Number(d[d.length - 1 - i]);
    if (i % 2 === 1) {
      n *= 2;
      if (n > 9) n -= 9;
    }
    sum += n;
  }
  return d.length > 0 && sum % 10 === 0;
}

export function isValidImei(value: string): boolean {
  return /^\d{15}$/.test(compact(value)) && luhnValid(value);
}

export function isValidEmail(value: string): boolean {
  return /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(value.trim());
}

/** Score rouge : aucune vente. Orange : Carte Prépayée uniquement. Vert : parcours complet. */
export function allowedFamilies(score: Score): FamilyId[] {
  switch (score) {
    case 'vert':
      return ['bloque', 'non-bloque', 'internet', 'prepaye'];
    case 'orange':
      return ['prepaye'];
    case 'rouge':
      return [];
  }
}

/** Seuls le nom, le prénom et la date de naissance relancent le contrôle Préventel. */
export function identityChangeRequiresRescore(before: Identity, after: Identity): boolean {
  const norm = (s: string) => s.trim().toLowerCase();
  return (
    norm(before.nom) !== norm(after.nom) ||
    norm(before.prenom) !== norm(after.prenom) ||
    before.dateNaissance !== after.dateNaissance
  );
}

/** Open ML : selon l'éligibilité de l'offre (pas la Carte Prépayée) et jamais pour une ligne Card. */
export function isOpenMlAvailable(offer: Offer | undefined, line?: Line | null): boolean {
  return !!offer && offer.openMl.eligible && !line?.isCard;
}

/** Montant mensuel de la remise Open ML de l'offre (5 € pour une offre d'entrée de gamme, 10 € sinon). */
export function openMlDiscount(offer: Offer): number {
  return offer.openMl.monthlyDiscount ?? 0;
}

/** Options actives avec l'offre : les options incluses, plus celles choisies parmi celles proposées. */
export function selectedOptions(offer: Offer, optionIds: string[]): OfferOption[] {
  return offer.options.filter((o) => o.included || optionIds.includes(o.id));
}

export interface MonthlyBreakdown {
  base: number;
  options: number;
  openMl: number;
  /** Mensualité hors remise temporaire. */
  total: number;
  /** Mensualité pendant la remise de l'offre (appliquée automatiquement) ; absent si l'offre n'a pas de remise. */
  promo?: { amount: number; months: number; total: number };
}

export function monthly(offer: Offer, optionIds: string[], openMlApplied: boolean): MonthlyBreakdown {
  const base = offer.price;
  const paid = selectedOptions(offer, optionIds).filter((o) => !o.included);
  const opts = round(paid.reduce((sum, o) => sum + o.price, 0));
  const openMl = openMlApplied ? openMlDiscount(offer) : 0;
  const total = Math.max(0, round(base + opts - openMl));
  const result: MonthlyBreakdown = { base, options: opts, openMl, total };
  if (offer.promo) {
    const { monthlyDiscount, durationMonths } = offer.promo;
    result.promo = { amount: monthlyDiscount, months: durationMonths, total: Math.max(0, round(total - monthlyDiscount)) };
  }
  return result;
}

export function simChangeFee(reasonId: string | null): number {
  return SIM_REASONS.find((r) => r.id === reasonId)?.fee ? SIM_LOSS_FEE : 0;
}

/** Montant à régler en caisse pour une acquisition : puce Carte Prépayée et terminal éventuel. */
export function acquisitionCashDue(offer: Offer | undefined, terminalPrice: number): number {
  return round((offer?.family === 'prepaye' ? CARD_SIM_PRICE : 0) + terminalPrice);
}

/** Pas de contrat pour une modification d'options. */
export function requiresContract(flow: Flow): boolean {
  return flow !== 'options';
}

export interface OptionsDiff {
  added: string[];
  removed: string[];
  delta: number;
}

/** Ajouts et retraits parmi les options payantes de l'offre : une option incluse n'est ni ajoutée ni retirée. */
export function optionsDiff(current: string[], selected: string[], offer: Offer | undefined): OptionsDiff {
  const paid = (ids: string[]) => (offer ? selectedOptions(offer, ids).filter((o) => !o.included).map((o) => o.id) : []);
  const before = paid(current);
  const after = paid(selected);
  const added = after.filter((id) => !before.includes(id));
  const removed = before.filter((id) => !after.includes(id));
  const price = (id: string) => offer?.options.find((o) => o.id === id)?.price ?? 0;
  const delta = round(added.reduce((s, id) => s + price(id), 0) - removed.reduce((s, id) => s + price(id), 0));
  return { added, removed, delta };
}

export interface StepDef {
  label: string;
  screens: Screen[];
}

export function stepsFor(flow: Flow | null): StepDef[] {
  const identification: StepDef = { label: 'Identification', screens: ['identification'] };
  const confirmation: StepDef = { label: 'Confirmation', screens: ['confirmation', 'succes'] };
  switch (flow) {
    case null:
      return [
        identification,
        { label: 'Demande', screens: ['demande'] },
        { label: 'Suite du parcours', screens: [] },
        confirmation,
      ];
    case 'acquisition':
      return [
        identification,
        { label: 'Client', screens: ['client'] },
        { label: 'Forfait', screens: ['forfait'] },
        { label: 'Matériel et paiement', screens: ['materiel'] },
        confirmation,
      ];
    case 'forfait':
      return [
        identification,
        { label: 'Ligne', screens: ['ligne'] },
        { label: 'Forfait', screens: ['forfait'] },
        confirmation,
      ];
    case 'options':
      return [
        identification,
        { label: 'Ligne', screens: ['ligne'] },
        { label: 'Options', screens: ['options'] },
        confirmation,
      ];
    case 'sim':
      return [
        identification,
        { label: 'Ligne et raison', screens: ['ligne'] },
        { label: 'Carte SIM', screens: ['sim'] },
        confirmation,
      ];
  }
}

export function firstScreenOf(flow: Flow): Screen {
  return flow === 'acquisition' ? 'client' : 'ligne';
}

export const round = (n: number): number => Math.round(n * 100) / 100;
