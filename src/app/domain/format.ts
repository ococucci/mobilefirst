import { digits } from './rules';

const euro = new Intl.NumberFormat('fr-FR', { style: 'currency', currency: 'EUR' });

export function formatEuro(amount: number): string {
  return euro.format(amount);
}

export function formatMsisdn(value: string): string {
  const d = digits(value);
  return d.length === 10 ? d.replace(/(\d{2})(?=\d)/g, '$1 ') : value;
}

export function formatIccid(value: string): string {
  return digits(value).replace(/(\d{4})(?=\d)/g, '$1 ');
}

export function formatDate(iso: string): string {
  const [y, m, d] = iso.split('-');
  return y && m && d ? `${d}/${m}/${y}` : iso;
}

/** Numéro et nom de la voie (ex. « 12 rue des Flamboyants »). */
export function formatVoie(a: { numeroVoie: string; nomVoie: string }): string {
  return `${a.numeroVoie ?? ''} ${a.nomVoie ?? ''}`.trim();
}

/** Adresse sur une ligne : « 12 rue des Flamboyants, 97100 Basse-Terre ». */
export function formatAddress(a: { numeroVoie: string; nomVoie: string; codePostal: string; commune: string }): string {
  const city = `${a.codePostal ?? ''} ${a.commune ?? ''}`.trim();
  return [formatVoie(a), city].filter(Boolean).join(', ');
}

export function maskIban(iban: string): string {
  const c = iban.replace(/\s/g, '').toUpperCase();
  return c.length > 7 ? `${c.slice(0, 4)} •••• ${c.slice(-3)}` : c;
}
