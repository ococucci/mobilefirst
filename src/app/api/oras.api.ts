import { Injectable } from '@angular/core';
import { ADDRESSES } from './mock-data';
import { latency } from './latency';

export interface AddressSuggestion {
  ligne: string;
  codePostal: string;
  commune: string;
}

/** Api-ORAS : complétion et fiabilisation de l'adresse. */
@Injectable({ providedIn: 'root' })
export class OrasApi {
  search(query: string): Promise<AddressSuggestion[]> {
    const words = query.toLowerCase().split(/[\s,]+/).filter((w) => w.length > 1);
    if (!words.length) return latency([], 0);
    const matches = ADDRESSES.filter((a) => {
      const text = `${a.ligne} ${a.codePostal} ${a.commune}`.toLowerCase();
      return words.every((w) => text.includes(w));
    });
    return latency(matches.slice(0, 5), 150);
  }
}
