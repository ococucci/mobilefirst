import { HttpInterceptorFn } from '@angular/common/http';
import { bootstrapApplication } from '@angular/platform-browser';
import { apiErrorInterceptor } from './app/api/api-base';
import { App } from './app/app';
import { createAppConfig } from './app/app.config';
import { loadConfig } from './app/config';
import { environment } from './environments/environment';

async function main(): Promise<void> {
  const config = await loadConfig(environment);
  const interceptors: HttpInterceptorFn[] = [apiErrorInterceptor];
  if (config.backend === 'mock') {
    // Chargé à la demande : les bouchons ne pèsent pas sur l'application en mode API.
    const { mockBackendInterceptor } = await import('./app/mock/mock-backend');
    interceptors.push(mockBackendInterceptor);
  }
  await bootstrapApplication(App, createAppConfig(config, interceptors));
}

main().catch((err) => console.error(err));
