import { describe, expect, it } from 'vitest';
import { DEFAULT_CONFIG, loadConfig } from './config';

const fakeFetch = (response: { ok: boolean; json?: () => Promise<unknown> } | Error) =>
  (async () => {
    if (response instanceof Error) throw response;
    return response;
  }) as unknown as typeof fetch;

describe('configuration', () => {
  it('garde les valeurs du build sans config.json', async () => {
    expect(await loadConfig(DEFAULT_CONFIG, fakeFetch({ ok: false }))).toEqual(DEFAULT_CONFIG);
    expect(await loadConfig(DEFAULT_CONFIG, fakeFetch(new Error('réseau')))).toEqual(DEFAULT_CONFIG);
  });
  it('ignore une réponse qui n’est pas du JSON (page du serveur de dev)', async () => {
    const html = fakeFetch({ ok: true, json: () => Promise.reject(new SyntaxError('Unexpected token <')) });
    expect(await loadConfig(DEFAULT_CONFIG, html)).toEqual(DEFAULT_CONFIG);
  });
  it('config.json surcharge l’endpoint et le mode', async () => {
    const config = fakeFetch({ ok: true, json: async () => ({ apiUrl: 'https://api.exemple.fr/api/v1/', backend: 'mock' }) });
    expect(await loadConfig(DEFAULT_CONFIG, config)).toEqual({ backend: 'mock', apiUrl: 'https://api.exemple.fr/api/v1' });
  });
  it('un mode inconnu revient sur l’API', async () => {
    const config = fakeFetch({ ok: true, json: async () => ({ backend: 'autre' }) });
    expect((await loadConfig(DEFAULT_CONFIG, config)).backend).toBe('api');
  });
});
