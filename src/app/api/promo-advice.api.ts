import { Injectable } from '@angular/core';
import { Promo } from '../domain/models';
import { PROMOS } from './mock-data';
import { latency } from './latency';

/** api-promo advice : remises applicables aux offres éligibles. */
@Injectable({ providedIn: 'root' })
export class PromoAdviceApi {
  promos(): Promise<Promo[]> {
    return latency(PROMOS);
  }
}
