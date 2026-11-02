import { HttpClient, HttpErrorResponse, provideHttpClient, withInterceptors } from '@angular/common/http';
import { TestBed } from '@angular/core/testing';
import { firstValueFrom } from 'rxjs';
import { beforeEach, describe, expect, it } from 'vitest';
import { mockBackendInterceptor } from './mock-backend';

describe('bouchons intégrés (mode mock)', () => {
  let http: HttpClient;
  const api = '/api/v1';

  beforeEach(() => {
    TestBed.configureTestingModule({ providers: [provideHttpClient(withInterceptors([mockBackendInterceptor]))] });
    http = TestBed.inject(HttpClient);
  });

  it('numéro connu : 200 ; inconnu : 204 (null)', async () => {
    const marie = await firstValueFrom(http.get<{ id: string }>(`${api}/customers`, { params: { msisdn: '0690123456' } }));
    expect(marie.id).toBe('CL-000101');
    expect(await firstValueFrom(http.get(`${api}/customers`, { params: { msisdn: '0690000001' } }))).toBeNull();
  });

  it('offres avec options, option incluse et remise unique', async () => {
    const offers = await firstValueFrom(http.get<{ id: string; promo: unknown; options: { id: string; included: boolean }[] }[]>(`${api}/catalog/offers`));
    const bl120 = offers.find((o) => o.id === 'bl-120')!;
    expect(bl120.options.find((o) => o.id === 'europe')?.included).toBe(true);
    expect(offers.find((o) => o.id === 'bl-20')?.promo).toBeNull();
  });

  it('complétion d’adresse', async () => {
    const res = await firstValueFrom(http.get<unknown[]>(`${api}/addresses`, { params: { q: 'Flamboyants' } }));
    expect(res.length).toBe(1);
  });

  it('erreur au format ProblemDetail', async () => {
    const error = await firstValueFrom(http.post(`${api}/sepa-mandates`, { holder: '', iban: 'FR00' })).catch((e) => e);
    expect(error).toBeInstanceOf(HttpErrorResponse);
    expect(error.status).toBe(400);
    expect(error.error.errors.map((e: { field: string }) => e.field)).toEqual(['holder', 'iban']);
  });

  it('changement de SIM perdue : frais de 10 € et SIM sortie du stock', async () => {
    const order = { flow: 'sim', customerId: 'CL-000101', lineMsisdn: '0690550123', simReason: 'perte-vol', sim: { type: 'esim', iccid: '8933010000000000035' } };
    const { documentId } = await firstValueFrom(http.post<{ documentId: string }>(`${api}/contracts`, order));
    const created = await firstValueFrom(
      http.post<{ orderNumber: string; cashDue: number }>(`${api}/orders`, { ...order, contractRef: documentId, contractSigned: true, cgvAccepted: true, privacyAccepted: true }),
    );
    expect(created.cashDue).toBe(10);
    const check = await firstValueFrom(http.post<{ result: string }>(`${api}/hardware/iccid-checks`, { iccid: '8933010000000000035' }));
    expect(check.result).toBe('inconnu');
    const pdf = await firstValueFrom(http.get(`${api}/contracts/${documentId}`, { responseType: 'blob' }));
    expect(pdf.type).toBe('application/pdf');
  });
});
