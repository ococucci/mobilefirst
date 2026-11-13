import { Observable } from 'rxjs';
import { TestScheduler } from 'rxjs/testing';
import { describe, expect, it } from 'vitest';
import { AddressSuggestion, debouncedAddressSearch } from './address.api';

const suggestion = (ligne: string): AddressSuggestion => ({ ligne, codePostal: '97100', commune: 'Basse-Terre' });

describe('recherche d’adresse au fil de la saisie', () => {
  const scheduler = () => new TestScheduler((actual, expected) => expect(actual).toEqual(expected));

  it('attend 300 ms sans frappe : une seule requête pour une saisie rapide', () => {
    const calls: string[] = [];
    scheduler().run(({ cold, hot, expectObservable }) => {
      const search = (q: string): Observable<AddressSuggestion[]> => {
        calls.push(q);
        return cold('50ms (r|)', { r: [suggestion(q)] });
      };
      // « Fl », « Fla », « Flam » tapés à 100 ms d'intervalle, puis pause.
      const input = hot('a 99ms b 99ms c', { a: 'Fl', b: 'Fla', c: 'Flam' });
      // Dernière frappe à 200 ms + 300 ms de debounce + 50 ms de réponse = 550 ms.
      expectObservable(debouncedAddressSearch(input, search)).toBe('550ms r', {
        r: { query: 'Flam', suggestions: [suggestion('Flam')] },
      });
    });
    expect(calls).toEqual(['Flam']);
  });

  it('une nouvelle saisie annule la requête en cours ; saisie trop courte : aucun appel', () => {
    const calls: string[] = [];
    scheduler().run(({ cold, hot, expectObservable }) => {
      const search = (q: string): Observable<AddressSuggestion[]> => {
        calls.push(q);
        return cold('500ms (r|)', { r: [suggestion(q)] });
      };
      // « Pointe » cherché à 300 ms, mais « Pointe-à » arrive à 400 ms avant sa réponse ; puis « P » (trop court).
      const input = hot('a 399ms b 999ms c', { a: 'Pointe', b: 'Pointe-à', c: 'P' });
      expectObservable(debouncedAddressSearch(input, search)).toBe('1200ms r 499ms e', {
        r: { query: 'Pointe-à', suggestions: [suggestion('Pointe-à')] },
        e: { query: 'P', suggestions: [] },
      });
    });
    expect(calls).toEqual(['Pointe', 'Pointe-à']);
  });

  it('une erreur HTTP donne une liste vide sans arrêter la recherche', () => {
    scheduler().run(({ cold, hot, expectObservable }) => {
      const search = (q: string): Observable<AddressSuggestion[]> =>
        q === 'erreur' ? cold('10ms #') : cold('10ms (r|)', { r: [suggestion(q)] });
      const input = hot('a 499ms b', { a: 'erreur', b: 'Flamboyants' });
      expectObservable(debouncedAddressSearch(input, search)).toBe('310ms e 499ms r', {
        e: { query: 'erreur', suggestions: [] },
        r: { query: 'Flamboyants', suggestions: [suggestion('Flamboyants')] },
      });
    });
  });
});
