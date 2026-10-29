import { Injectable } from '@angular/core';
import { Identity, Score } from '../domain/models';
import { RESCORE } from './mock-data';
import { latency } from './latency';

/**
 * api-scoring : contrôle Préventel.
 * Bouchon : un nom contenant « rouge » ou « orange » renvoie ce score, sinon vert.
 */
@Injectable({ providedIn: 'root' })
export class ScoringApi {
  preventel(identity: Identity): Promise<Score> {
    const nom = identity.nom.toLowerCase();
    const score: Score = nom.includes('rouge') ? 'rouge' : nom.includes('orange') ? 'orange' : 'vert';
    return latency(score, 600);
  }

  /** Re-scoring d'un client en base (ligne Card qui change de forfait). */
  rescore(customerId: string, identity: Identity): Promise<Score> {
    const known = RESCORE[customerId];
    return known ? latency(known, 600) : this.preventel(identity);
  }
}
