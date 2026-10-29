import { Injectable } from '@angular/core';
import { AVAILABLE_NUMBERS } from './mock-data';
import { latency } from './latency';

/** api ressource : numéros de mobile disponibles. */
@Injectable({ providedIn: 'root' })
export class RessourceApi {
  availableNumbers(): Promise<string[]> {
    return latency(AVAILABLE_NUMBERS);
  }
}
