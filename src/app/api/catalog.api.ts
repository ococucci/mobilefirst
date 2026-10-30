import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { firstValueFrom } from 'rxjs';
import { Offer } from '../domain/models';
import { API } from './api-base';

/** Catalogue (Castor et promo advice), numéros disponibles (api ressource) et Open ML (api RHOC). */
@Injectable({ providedIn: 'root' })
export class CatalogApi {
  private readonly http = inject(HttpClient);

  /** Offres avec, pour chacune, ses options, ses remises (appliquées automatiquement) et l'éligibilité Open ML. */
  offers(): Promise<Offer[]> {
    return firstValueFrom(this.http.get<Offer[]>(`${API}/catalog/offers`));
  }

  availableNumbers(): Promise<string[]> {
    return firstValueFrom(this.http.get<string[]>(`${API}/numbers/available`));
  }

  async checkSponsor(sponsor: string): Promise<boolean> {
    const res = await firstValueFrom(this.http.post<{ valid: boolean }>(`${API}/open-ml/sponsor-checks`, { sponsor }));
    return res.valid;
  }
}
