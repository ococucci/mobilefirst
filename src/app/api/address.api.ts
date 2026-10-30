import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { firstValueFrom } from 'rxjs';
import { API } from './api-base';

export interface AddressSuggestion {
  ligne: string;
  codePostal: string;
  commune: string;
}

/** Complétion et fiabilisation de l'adresse (Api-ORAS). */
@Injectable({ providedIn: 'root' })
export class AddressApi {
  private readonly http = inject(HttpClient);

  search(query: string): Promise<AddressSuggestion[]> {
    if (query.trim().length < 2) return Promise.resolve([]);
    return firstValueFrom(this.http.get<AddressSuggestion[]>(`${API}/addresses`, { params: { q: query } }));
  }
}
