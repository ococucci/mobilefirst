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

export function maskIban(iban: string): string {
  const c = iban.replace(/\s/g, '').toUpperCase();
  return c.length > 7 ? `${c.slice(0, 4)} •••• ${c.slice(-3)}` : c;
}
