import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { firstValueFrom } from 'rxjs';
import { Offer } from '../domain/models';
import { APP_CONFIG } from '../config';

/** Catalogue (Castor et promo advice), numéros disponibles (api ressource) et Open ML (api RHOC). */
@Injectable({ providedIn: 'root' })
export class CatalogApi {
  private readonly http = inject(HttpClient);
  private readonly api = inject(APP_CONFIG).apiUrl;

  /** Offres avec, pour chacune, ses options, ses remises (appliquées automatiquement) et l'éligibilité Open ML. */
  offers(): Promise<Offer[]> {
    return firstValueFrom(this.http.get<Offer[]>(`${this.api}/catalog/offers`));
  }

  availableNumbers(): Promise<string[]> {
    return firstValueFrom(this.http.get<string[]>(`${this.api}/numbers/available`));
  }

  async checkSponsor(sponsor: string): Promise<boolean> {
    const res = await firstValueFrom(this.http.post<{ valid: boolean }>(`${this.api}/open-ml/sponsor-checks`, { sponsor }));
    return res.valid;
  }
}
