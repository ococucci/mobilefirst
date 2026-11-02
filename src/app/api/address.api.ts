import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { firstValueFrom } from 'rxjs';
import { APP_CONFIG } from '../config';

export interface AddressSuggestion {
  ligne: string;
  codePostal: string;
  commune: string;
}

/** Complétion et fiabilisation de l'adresse (Api-ORAS). */
@Injectable({ providedIn: 'root' })
export class AddressApi {
  private readonly http = inject(HttpClient);
  private readonly api = inject(APP_CONFIG).apiUrl;

  search(query: string): Promise<AddressSuggestion[]> {
    if (query.trim().length < 2) return Promise.resolve([]);
    return firstValueFrom(this.http.get<AddressSuggestion[]>(`${this.api}/addresses`, { params: { q: query } }));
  }
}
