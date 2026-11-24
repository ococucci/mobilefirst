import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { firstValueFrom } from 'rxjs';
import { Offer } from '../domain/models';
import { APP_CONFIG } from '../config';

/** Catalogue (Castor et promo advice), numéros disponibles (api ressource) et Open ML (api RHOC). */
/** Résultat de la recherche du sponsor Open ML (api RHOC). */
export interface SponsorResult {
  valid: boolean;
  /** N° du sponsor au format national. */
  msisdn?: string | null;
  lastName?: string | null;
  firstName?: string | null;
  /** Jeton RHOC de la vérification, à renvoyer avec la commande. */
  tokenId?: string | null;
}

@Injectable({ providedIn: 'root' })
export class CatalogApi {
  private readonly http = inject(HttpClient);
  private readonly api = inject(APP_CONFIG).apiUrl;

  /** Offres avec, pour chacune, ses options, ses remises (appliquées automatiquement) et l'éligibilité Open ML. */
  /** Offres vendables sur le territoire de l'adresse du client (toutes si le territoire n'est pas connu). */
  offers(territoire?: string): Promise<Offer[]> {
    const params: Record<string, string> = territoire ? { territoire } : {};
    return firstValueFrom(this.http.get<Offer[]>(`${this.api}/catalog/offers`, { params }));
  }

  availableNumbers(): Promise<string[]> {
    return firstValueFrom(this.http.get<string[]>(`${this.api}/numbers/available`));
  }

  /** Recherche du sponsor Open ML (N° de mobile ou ND) : nom, prénom et jeton RHOC s'il est reconnu. */
  checkSponsor(sponsor: string): Promise<SponsorResult> {
    return firstValueFrom(this.http.post<SponsorResult>(`${this.api}/open-ml/sponsor-checks`, { sponsor }));
  }
}
