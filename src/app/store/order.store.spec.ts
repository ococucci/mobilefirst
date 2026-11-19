import { provideHttpClient } from '@angular/common/http';
import { HttpTestingController, provideHttpClientTesting } from '@angular/common/http/testing';
import { TestBed } from '@angular/core/testing';
import { beforeEach, describe, expect, it } from 'vitest';
import { OrderStore } from './order.store';

/** Laisse les promesses en attente se résoudre (réponses HTTP simulées). */
const settle = () => new Promise((r) => setTimeout(r));

describe('OrderStore : appels faits une seule fois par commande', () => {
  let store: OrderStore;
  let http: HttpTestingController;

  beforeEach(() => {
    TestBed.configureTestingModule({ providers: [provideHttpClient(), provideHttpClientTesting()] });
    store = TestBed.inject(OrderStore);
    http = TestBed.inject(HttpTestingController);
  });

  it('catalogue, terminaux et numéros : un seul appel, même au retour sur l’écran', async () => {
    const first = store.loadCatalog();
    http.expectOne('/api/v1/catalog/offers').flush([{ id: 'o1' }]);
    expect(await first).toBe(true);
    expect(await store.loadCatalog()).toBe(false);
    http.expectNone('/api/v1/catalog/offers');
    expect(store.offers().map((o) => o.id)).toEqual(['o1']);

    const terminals = store.loadTerminals();
    http.expectOne('/api/v1/hardware/terminals').flush([]);
    await terminals;
    await store.loadTerminals();
    http.expectNone('/api/v1/hardware/terminals');

    const numbers = store.loadNumbers();
    http.expectOne('/api/v1/numbers/available').flush(['0690123480']);
    await numbers;
    await store.loadNumbers();
    http.expectNone('/api/v1/numbers/available');
    expect(store.availableNumbers()).toEqual(['0690123480']);
    http.verify();
  });

  it('catalogue : territoire de l’adresse du client envoyé, nouvel appel si le territoire change', async () => {
    Object.assign(store.draft.address, { codePostal: '97200', territoire: 'MARTINIQUE' });
    const first = store.loadCatalog();
    http.expectOne('/api/v1/catalog/offers?territoire=MARTINIQUE').flush([{ id: 'm1' }]);
    await first;
    await store.loadCatalog();
    http.expectNone((r) => r.url.endsWith('/catalog/offers'));

    // Adresse modifiée (autre territoire) : le catalogue est redemandé.
    Object.assign(store.draft.address, { codePostal: '97150', territoire: '' });
    const second = store.loadCatalog();
    http.expectOne('/api/v1/catalog/offers?territoire=ST-MARTIN').flush([{ id: 's1' }]);
    expect(await second).toBe(true);
    expect(store.offers().map((o) => o.id)).toEqual(['s1']);
    http.verify();
  });

  it('deux demandes simultanées partagent le même appel', async () => {
    const a = store.loadCatalog();
    const b = store.loadCatalog();
    http.expectOne('/api/v1/catalog/offers').flush([]);
    expect(await Promise.all([a, b])).toEqual([true, false]);
    http.verify();
  });

  it('nouvelle commande (reset) : les données sont oubliées et rappelées', async () => {
    const first = store.loadNumbers();
    http.expectOne('/api/v1/numbers/available').flush(['0690123480']);
    await first;
    store.reset();
    expect(store.availableNumbers()).toEqual([]);
    const again = store.loadNumbers();
    http.expectOne('/api/v1/numbers/available').flush(['0690123481']);
    expect(await again).toBe(true);
    expect(store.availableNumbers()).toEqual(['0690123481']);
    http.verify();
  });

  it('une réponse arrivée après reset est ignorée', async () => {
    const stale = store.loadCatalog();
    store.reset();
    http.expectOne('/api/v1/catalog/offers').flush([{ id: 'ancien' }]);
    await stale;
    expect(store.offers()).toEqual([]);
  });

  it('un appel en échec pourra être relancé', async () => {
    const failed = store.loadTerminals().catch((e) => e);
    http.expectOne('/api/v1/hardware/terminals').flush(null, { status: 503, statusText: 'Unavailable' });
    expect(await failed).toBeTruthy();
    await settle();
    const retry = store.loadTerminals();
    http.expectOne('/api/v1/hardware/terminals').flush([]);
    expect(await retry).toBe(true);
    http.verify();
  });

  describe('lignes du client', () => {
    const customer = (id: string) => ({ id, type: 'GP', identity: {}, address: {}, score: 'vert' }) as never;
    const flushLines = (id: string, lines: unknown[], pending: string[] = []) => {
      http.expectOne(`/api/v1/customers/${id}/lines`).flush(lines);
      http.expectOne(`/api/v1/customers/${id}/pending-lines`).flush(pending);
    };

    it('demandées une seule fois tant que l’on reste sur le même client', async () => {
      store.identify(customer('CL-1'), 'connu', 'vert');
      expect(store.lines()).toBeNull();
      const first = store.loadLines();
      flushLines('CL-1', [{ msisdn: '0690123456' }], ['0690123456']);
      expect((await first).length).toBe(1);
      expect(store.pendingLines()).toEqual(['0690123456']);

      await store.loadLines();
      // Même client, à nouveau identifié (retour à l'identification) : pas de nouvel appel.
      store.identify(customer('CL-1'), 'connu', 'vert');
      await store.loadLines();
      http.expectNone('/api/v1/customers/CL-1/lines');
      expect(store.lines()?.length).toBe(1);
      http.verify();
    });

    it('autre client ou nouvelle commande : les lignes sont oubliées et redemandées', async () => {
      store.identify(customer('CL-1'), 'connu', 'vert');
      const first = store.loadLines();
      flushLines('CL-1', [{ msisdn: '0690123456' }]);
      await first;

      store.identify(customer('CL-2'), 'connu', 'vert');
      expect(store.lines()).toBeNull();
      const second = store.loadLines();
      flushLines('CL-2', []);
      expect(await second).toEqual([]);

      store.reset();
      store.identify(customer('CL-2'), 'connu', 'vert');
      const third = store.loadLines();
      flushLines('CL-2', []);
      await third;
      http.verify();
    });

    it('une réponse pour un client qui n’est plus le client courant est ignorée', async () => {
      store.identify(customer('CL-1'), 'connu', 'vert');
      const stale = store.loadLines();
      store.identify(customer('CL-2'), 'connu', 'vert');
      flushLines('CL-1', [{ msisdn: '0690123456' }]);
      await stale;
      expect(store.lines()).toBeNull();
    });
  });
});
