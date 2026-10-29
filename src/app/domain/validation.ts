/**
 * Messages d'erreur des formulaires, champ par champ. Chaque fonction renvoie
 * un objet { champ: message } ne contenant que les champs en erreur.
 */
import { Identity } from './models';
import { compact, isValidEmail, isValidIban, isValidImei, isValidMsisdn, isValidRio } from './rules';

export type Errors<K extends string = string> = Partial<Record<K, string>>;

export const hasErrors = (errors: Errors): boolean => Object.keys(errors).length > 0;

export const MSISDN_MESSAGE = 'Numéro invalide : 10 chiffres commençant par 06 ou 07.';

/** Ancienne CNI : 12 caractères ; nouvelle CNI et passeport : 9 caractères. */
export function isValidPieceNumber(value: string): boolean {
  return /^[A-Z0-9]{9}$|^[A-Z0-9]{12}$/.test(compact(value));
}

export function identityErrors(i: Identity, full: boolean, today = new Date().toISOString().slice(0, 10)): Errors<keyof Identity> {
  const e: Errors<keyof Identity> = {};
  if (!i.nom.trim()) e.nom = 'Le nom est obligatoire.';
  if (!i.prenom.trim()) e.prenom = 'Le prénom est obligatoire.';
  if (!i.dateNaissance) e.dateNaissance = 'La date de naissance est obligatoire.';
  else if (i.dateNaissance >= today || i.dateNaissance < '1900-01-01') e.dateNaissance = i.dateNaissance >= today ? 'La date de naissance doit être dans le passé.' : 'Date de naissance invalide.';
  if (!i.pieceNumero.trim()) e.pieceNumero = 'Le n° de la pièce est obligatoire.';
  else if (!isValidPieceNumber(i.pieceNumero)) e.pieceNumero = 'N° invalide : 9 ou 12 lettres et chiffres.';
  if (full) {
    if (!i.departementNaissance) e.departementNaissance = 'Le département de naissance est obligatoire.';
    if (!i.mobileContact.trim()) e.mobileContact = 'Le mobile de contact est obligatoire.';
    else if (!isValidMsisdn(i.mobileContact)) e.mobileContact = MSISDN_MESSAGE;
    if (!i.email.trim()) e.email = "L'email est obligatoire.";
    else if (!isValidEmail(i.email)) e.email = 'Email invalide (exemple : nom@domaine.fr).';
  }
  return e;
}

export interface NumberChoice {
  mode: 'nouveau' | 'portabilite';
  msisdn: string;
  rio: string;
  portedMsisdn: string;
  operator: string;
  portingDate: string;
}

export function numberErrors(n: NumberChoice, today = new Date().toISOString().slice(0, 10)): Errors<keyof NumberChoice> {
  const e: Errors<keyof NumberChoice> = {};
  if (n.mode === 'nouveau') {
    if (!n.msisdn) e.msisdn = 'Choisissez un numéro dans la liste.';
    return e;
  }
  if (!n.rio.trim()) e.rio = 'Le code RIO est obligatoire.';
  else if (!isValidRio(n.rio)) e.rio = 'Code RIO invalide : 12 caractères (ex. 01P123456ABC).';
  if (!n.portedMsisdn.trim()) e.portedMsisdn = 'Le numéro à conserver est obligatoire.';
  else if (!isValidMsisdn(n.portedMsisdn)) e.portedMsisdn = MSISDN_MESSAGE;
  if (!n.operator) e.operator = "L'opérateur donneur est obligatoire.";
  if (!n.portingDate) e.portingDate = "La date d'exécution du portage est obligatoire.";
  else if (n.portingDate < today) e.portingDate = 'La date ne peut pas être dans le passé.';
  return e;
}

export function sponsorError(enabled: boolean, sponsor: string, valid: boolean | null): string | null {
  if (!enabled) return null;
  if (!sponsor.trim()) return 'Saisissez le N° sponsor ou décochez la remise.';
  if (valid === false) return 'Sponsor non reconnu par api RHOC.';
  if (valid !== true) return 'Cliquez sur « Vérifier » pour contrôler le N° sponsor.';
  return null;
}

export interface TerminalInput {
  withTerminal: boolean;
  terminalId: string;
  imei: string;
}

export function terminalErrors(t: TerminalInput): Errors<'terminalId' | 'imei'> {
  const e: Errors<'terminalId' | 'imei'> = {};
  if (!t.withTerminal) return e;
  if (!t.terminalId) e.terminalId = 'Choisissez un terminal.';
  if (!t.imei.trim()) e.imei = "L'IMEI est obligatoire.";
  else if (!isValidImei(t.imei)) e.imei = 'IMEI invalide : 15 chiffres.';
  return e;
}

export function sepaErrors(holder: string, iban: string): Errors<'holder' | 'iban'> {
  const e: Errors<'holder' | 'iban'> = {};
  if (!holder.trim()) e.holder = 'Le titulaire du compte est obligatoire.';
  if (!iban.trim()) e.iban = "L'IBAN est obligatoire.";
  else if (!isValidIban(iban)) e.iban = 'IBAN invalide : vérifiez sa saisie.';
  return e;
}
