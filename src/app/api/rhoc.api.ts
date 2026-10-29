import { Injectable } from '@angular/core';
import { digits } from '../domain/rules';
import { SPONSORS } from './mock-data';
import { latency } from './latency';

/** api RHOC : validation du N° sponsor Open ML. */
@Injectable({ providedIn: 'root' })
export class RhocApi {
  checkSponsor(sponsor: string): Promise<boolean> {
    return latency(SPONSORS.includes(digits(sponsor)));
  }
}
