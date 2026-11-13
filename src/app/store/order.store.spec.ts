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
});
