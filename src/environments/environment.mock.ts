import { AppConfig } from '../app/config';

/** Build « mock » : le front tourne seul avec les bouchons intégrés (npm run start:mock). */
export const environment: AppConfig = { backend: 'mock', apiUrl: '/api/v1' };
