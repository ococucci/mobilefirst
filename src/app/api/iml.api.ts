import { Injectable } from '@angular/core';
import { compact, isValidIban } from '../domain/rules';
import { latency } from './latency';

/** api IML : contrôle et stockage du mandat SEPA (signé hors de l'outil). */
@Injectable({ providedIn: 'root' })
export class ImlApi {
  private sequence = 1;

  async storeMandate(holder: string, iban: string): Promise<string> {
    if (!holder.trim() || !isValidIban(iban)) throw new Error('IBAN invalide');
    return latency(`RUM-OOF-${compact(iban).slice(-4)}-${String(this.sequence++).padStart(4, '0')}`);
  }
}
