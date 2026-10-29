import { Injectable } from '@angular/core';
import { Terminal } from '../domain/models';
import { compact, isValidIccid } from '../domain/rules';
import { ICCID_STOCK, TERMINALS } from './mock-data';
import { latency } from './latency';

export type IccidCheck = 'ok' | 'format' | 'inconnu';

/** Enabler si-financier : matériel (SIM, terminal) et contrôle de l'ICCID. */
@Injectable({ providedIn: 'root' })
export class SiFinancierApi {
  private readonly stock = [...ICCID_STOCK];

  terminals(): Promise<Terminal[]> {
    return latency(TERMINALS);
  }

  checkIccid(iccid: string): Promise<IccidCheck> {
    const value = compact(iccid);
    if (!isValidIccid(value)) return latency<IccidCheck>('format', 100);
    return latency<IccidCheck>(this.stock.includes(value) ? 'ok' : 'inconnu');
  }

  /** Simule la lecture du code-barres d'une SIM du stock boutique. */
  scanSim(): Promise<string> {
    return latency(this.stock[Math.floor(Math.random() * this.stock.length)], 400);
  }
}
