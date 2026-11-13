import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import {
  asyncScheduler,
  catchError,
  debounceTime,
  distinctUntilChanged,
  map,
  Observable,
  of,
  SchedulerLike,
  switchMap,
} from 'rxjs';
import { APP_CONFIG } from '../config';

export interface AddressSuggestion {
  ligne: string;
  codePostal: string;
  commune: string;
}

/** Délai sans frappe avant d'interroger Api-ORAS. */
export const ADDRESS_DEBOUNCE_MS = 300;
/** Nombre de caractères minimum pour lancer une recherche. */
export const ADDRESS_MIN_LENGTH = 2;

/** Résultat d'une recherche, avec la saisie à laquelle il répond. */
export interface AddressResults {
  query: string;
  suggestions: AddressSuggestion[];
}

/**
 * Recherche au fil de la saisie : on attend une pause dans la frappe (debounce), on ignore une saisie identique à
 * la précédente et une nouvelle saisie annule la requête en cours (switchMap) : seule la dernière réponse compte.
 * Une saisie trop courte vide les suggestions sans appel. Une erreur HTTP (déjà affichée en bandeau) donne une
 * liste vide sans interrompre la recherche.
 */
export function debouncedAddressSearch(
  input$: Observable<string>,
  search: (query: string) => Observable<AddressSuggestion[]>,
  dueTime = ADDRESS_DEBOUNCE_MS,
  scheduler: SchedulerLike = asyncScheduler,
): Observable<AddressResults> {
  return input$.pipe(
    map((q) => q.trim()),
    debounceTime(dueTime, scheduler),
    distinctUntilChanged(),
    switchMap((query) =>
      query.length < ADDRESS_MIN_LENGTH
        ? of({ query, suggestions: [] })
        : search(query).pipe(
            map((suggestions) => ({ query, suggestions })),
            catchError(() => of({ query, suggestions: [] })),
          ),
    ),
  );
}

/** Complétion et fiabilisation de l'adresse (Api-ORAS). */
@Injectable({ providedIn: 'root' })
export class AddressApi {
  private readonly http = inject(HttpClient);
  private readonly api = inject(APP_CONFIG).apiUrl;

  search(query: string): Observable<AddressSuggestion[]> {
    return this.http.get<AddressSuggestion[]>(`${this.api}/addresses`, { params: { q: query } });
  }
}
