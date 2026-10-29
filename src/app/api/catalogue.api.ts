import { Injectable } from '@angular/core';
import { MobileOption, Offer } from '../domain/models';
import { OFFERS, OPTIONS } from './mock-data';
import { latency } from './latency';

/** Catalogue Castor : familles, forfaits (arbre) et options mobile. */
@Injectable({ providedIn: 'root' })
export class CatalogueApi {
  offers(): Promise<Offer[]> {
    return latency(OFFERS);
  }

  options(): Promise<MobileOption[]> {
    return latency(OPTIONS);
  }
}
