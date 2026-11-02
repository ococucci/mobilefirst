import { HttpInterceptorFn, provideHttpClient, withFetch, withInterceptors } from '@angular/common/http';
import { ApplicationConfig, provideBrowserGlobalErrorListeners } from '@angular/core';
import { APP_CONFIG, AppConfig } from './config';

export function createAppConfig(config: AppConfig, interceptors: HttpInterceptorFn[]): ApplicationConfig {
  return {
    providers: [
      provideBrowserGlobalErrorListeners(),
      { provide: APP_CONFIG, useValue: config },
      provideHttpClient(withFetch(), withInterceptors(interceptors)),
    ],
  };
}
