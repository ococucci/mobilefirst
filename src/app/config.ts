import { InjectionToken } from '@angular/core';

/** « api » : appels HTTP vers mobilefirst-api ; « mock » : bouchons intégrés au front, sans backend. */
export type BackendMode = 'api' | 'mock';

export interface AppConfig {
  backend: BackendMode;
  /** URL de base de l'API, relative (même domaine ou proxy) ou absolue (ex. https://api.exemple.fr/api/v1). */
  apiUrl: string;
  /**
   * Endpoint health d'Actuator, pour vérifier au démarrage que le backend répond. Par défaut, déduit de apiUrl :
   * « /api/v1 » remplacé par « /actuator/health » (ex. https://api.exemple.fr/actuator/health).
   */
  healthUrl?: string;
}

export const DEFAULT_CONFIG: AppConfig = { backend: 'api', apiUrl: '/api/v1' };

/** URL du health Actuator déduite de l'URL de l'API : même serveur, à la racine. */
export function defaultHealthUrl(apiUrl: string): string {
  return apiUrl.replace(/\/api(\/v\d+)?$/, '') + '/actuator/health';
}

export const APP_CONFIG = new InjectionToken<AppConfig>('APP_CONFIG', {
  providedIn: 'root',
  factory: () => DEFAULT_CONFIG,
});

/**
 * Configuration effective : valeurs de l'environnement de build, surchargées par un fichier « config.json »
 * facultatif déposé à côté de l'application (pour pointer sur un autre endpoint sans reconstruire).
 */
export async function loadConfig(defaults: AppConfig, fetchFn: typeof fetch = fetch): Promise<AppConfig> {
  let override: Partial<AppConfig> = {};
  try {
    const res = await fetchFn('config.json', { cache: 'no-store' });
    if (res.ok) override = (await res.json()) as Partial<AppConfig>;
  } catch {
    // Pas de config.json (ou contenu non JSON, comme la page renvoyée par le serveur de dev) : valeurs du build.
  }
  return normalize({ ...defaults, ...override });
}

export function normalize(config: AppConfig): AppConfig {
  const backend: BackendMode = config.backend === 'mock' ? 'mock' : 'api';
  const apiUrl = (config.apiUrl || DEFAULT_CONFIG.apiUrl).replace(/\/+$/, '');
  const healthUrl = config.healthUrl || defaultHealthUrl(apiUrl);
  return { backend, apiUrl, healthUrl };
}
