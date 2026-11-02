import { AppConfig } from '../app/config';

/** Valeurs par défaut du build : appels vers l'API (surchargées par config.json si présent). */
export const environment: AppConfig = { backend: 'api', apiUrl: '/api/v1' };
