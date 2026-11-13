import { describe, expect, it } from 'vitest';
import { DEFAULT_CONFIG, loadConfig } from './config';

const WITH_HEALTH = { ...DEFAULT_CONFIG, healthUrl: '/actuator/health' };

const fakeFetch = (response: { ok: boolean; json?: () => Promise<unknown> } | Error) =>
  (async () => {
    if (response instanceof Error) throw response;
    return response;
  }) as unknown as typeof fetch;

describe('configuration', () => {
  it('garde les valeurs du build sans config.json', async () => {
    expect(await loadConfig(DEFAULT_CONFIG, fakeFetch({ ok: false }))).toEqual(WITH_HEALTH);
    expect(await loadConfig(DEFAULT_CONFIG, fakeFetch(new Error('réseau')))).toEqual(WITH_HEALTH);
  });
  it('ignore une réponse qui n’est pas du JSON (page du serveur de dev)', async () => {
    const html = fakeFetch({ ok: true, json: () => Promise.reject(new SyntaxError('Unexpected token <')) });
    expect(await loadConfig(DEFAULT_CONFIG, html)).toEqual(WITH_HEALTH);
  });
  it('config.json surcharge l’endpoint et le mode', async () => {
    const config = fakeFetch({ ok: true, json: async () => ({ apiUrl: 'https://api.exemple.fr/api/v1/', backend: 'mock' }) });
    expect(await loadConfig(DEFAULT_CONFIG, config)).toEqual({
      backend: 'mock', apiUrl: 'https://api.exemple.fr/api/v1', healthUrl: 'https://api.exemple.fr/actuator/health',
    });
  });
  it('healthUrl : déduit de apiUrl, ou donné par config.json', async () => {
    const custom = fakeFetch({ ok: true, json: async () => ({ apiUrl: '/passerelle/order-first', healthUrl: '/passerelle/health' }) });
    expect((await loadConfig(DEFAULT_CONFIG, custom)).healthUrl).toBe('/passerelle/health');
    const noVersion = fakeFetch({ ok: true, json: async () => ({ apiUrl: 'http://localhost:8080/api' }) });
    expect((await loadConfig(DEFAULT_CONFIG, noVersion)).healthUrl).toBe('http://localhost:8080/actuator/health');
  });
  it('un mode inconnu revient sur l’API', async () => {
    const config = fakeFetch({ ok: true, json: async () => ({ backend: 'autre' }) });
    expect((await loadConfig(DEFAULT_CONFIG, config)).backend).toBe('api');
  });
});
