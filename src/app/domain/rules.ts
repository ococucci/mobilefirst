/**
 * Règles de gestion (section 2 de la cinématique), sous forme de fonctions pures
 * pour être testées indépendamment des écrans.
 */
import {
  Address,
  FamilyId,
  Flow,
  Identity,
  Line,
  Offer,
  OFFER_LEVELS,
  OfferLevel,
  OfferOption,
  Score,
  Screen,
  SIM_LOSS_FEE,
  SIM_REASONS,
  Terminal,
} from './models';

export const digits = (value: string): string => value.replace(/\D/g, '');

/** N° au format national : 590690123456 ou +590 690… -> 0690123456, 33612345678 -> 0612345678 ; sinon les chiffres seuls. */
export function nationalNumber(value: string): string {
  const d = digits(value ?? '');
  if (d.length === 12 && /^(590|596|594|262)/.test(d)) return '0' + d.slice(3);
  if (d.length === 11 && d.startsWith('33')) return '0' + d.slice(2);
  return d;
}

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

/**
 * Les informations saisies à l'étape Client diffèrent-elles de celles du client connu ? Champ par champ, espaces
 * de début et de fin ignorés, un champ absent valant une chaîne vide. Sans modification, le client n'est pas mis à
 * jour (pas d'appel au backend).
 */
export function customerDataChanged(
  customer: { identity: Identity; address: Address },
  identity: Identity,
  address: Address,
): boolean {
  return differs(customer.identity, identity) || differs(customer.address, address);
}

function differs(before: object, after: object): boolean {
  const norm = (v: unknown) => (v === null || v === undefined ? '' : typeof v === 'string' ? v.trim() : JSON.stringify(v));
  const a = before as Record<string, unknown>;
  const b = after as Record<string, unknown>;
  return [...new Set([...Object.keys(a), ...Object.keys(b)])].some((k) => norm(a[k]) !== norm(b[k]));
}

/**
 * Territoire déduit du code postal : Saint-Martin (97150) et Saint-Barthélemy (97133) avant le reste de la
 * Guadeloupe (971), puis Martinique (972) et Guyane (973) ; sinon France. Vide sans code postal.
 */
export function territoireFromCodePostal(codePostal: string | null | undefined): string {
  const cp = (codePostal ?? '').trim();
  if (!cp) return '';
  if (cp === '97150') return 'ST-MARTIN';
  if (cp === '97133') return 'ST-BARTHELEMY';
  switch (cp.substring(0, 3)) {
    case '971':
      return 'GUADELOUPE';
    case '972':
      return 'MARTINIQUE';
    case '973':
      return 'GUYANE FRANCAISE';
    default:
      return 'FRANCE';
  }
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

/** Les deux options s'excluent : l'incompatibilité déclarée sur l'une vaut pour l'autre. */
export function areIncompatible(a: OfferOption, b: OfferOption): boolean {
  return a.id !== b.id && (a.incompatibleOptions.includes(b.id) || b.incompatibleOptions.includes(a.id));
}

/**
 * Options non actives qui ne peuvent pas être choisies, associées au libellé de l'option active qui les bloque.
 * Une option incluse bloque toujours les options incompatibles avec elle.
 */
export function blockedOptions(offer: Offer | undefined, optionIds: string[]): Map<string, string> {
  const blocked = new Map<string, string>();
  if (!offer) return blocked;
  const active = selectedOptions(offer, optionIds);
  for (const o of offer.options) {
    if (active.includes(o)) continue;
    const blocker = active.find((a) => areIncompatible(a, o));
    if (blocker) blocked.set(o.id, blocker.label);
  }
  return blocked;
}

/**
 * Retire de la sélection les options que l'offre ne propose pas, les options incluses (toujours actives)
 * et celles incompatibles avec une option incluse ou choisie avant elles.
 */
export function compatibleOptions(offer: Offer, optionIds: string[]): string[] {
  const kept: OfferOption[] = offer.options.filter((o) => o.included);
  for (const id of optionIds) {
    const o = offer.options.find((x) => x.id === id && !x.included);
    if (o && !kept.includes(o) && !kept.some((k) => areIncompatible(k, o))) kept.push(o);
  }
  return kept.filter((o) => !o.included).map((o) => o.id);
}

export function levelLabel(level: OfferLevel): string {
  return OFFER_LEVELS.find((l) => l.id === level)?.label ?? level;
}

/** Prix du terminal au niveau de l'offre choisie (niveau de subvention). */
export function terminalPrice(terminal: Terminal, offer: Offer): number {
  return terminal.prices[offer.level];
}

/** Marques distinctes, triées par ordre alphabétique. */
export function terminalBrands(terminals: Terminal[]): string[] {
  return [...new Set(terminals.map((t) => t.brand))].sort((a, b) => a.localeCompare(b, 'fr'));
}

/** Carte Prépayée : son prix est un tarif unique, réglé en caisse, et non une mensualité. */
export function hasOneOffPrice(offer: Offer | undefined): boolean {
  return offer?.family === 'prepaye';
}

/** Tarif unique de l'offre à régler en caisse (Carte Prépayée), 0 pour une offre à mensualité. */
export function oneOffPrice(offer: Offer | undefined): number {
  return offer && hasOneOffPrice(offer) ? round(offer.price) : 0;
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
  // Le prix d'une Carte Prépayée est un tarif unique : il n'entre pas dans la mensualité.
  const base = hasOneOffPrice(offer) ? 0 : offer.price;
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

/** Montant à régler en caisse pour une acquisition : tarif de la Carte Prépayée et terminal éventuel. */
export function acquisitionCashDue(offer: Offer | undefined, terminalPrice: number): number {
  return round(oneOffPrice(offer) + terminalPrice);
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
