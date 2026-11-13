import { provideHttpClient, withInterceptors } from '@angular/common/http';
import { HttpTestingController, provideHttpClientTesting } from '@angular/common/http/testing';
import { TestBed } from '@angular/core/testing';
import { ApiErrors, apiErrorInterceptor } from './api/api-base';
import { App } from './app';
import { APP_CONFIG, normalize } from './config';

describe('App', () => {
  const start = async () => {
    await TestBed.configureTestingModule({
      imports: [App],
      providers: [
        provideHttpClient(withInterceptors([apiErrorInterceptor])),
        provideHttpClientTesting(),
        { provide: APP_CONFIG, useValue: normalize({ backend: 'api', apiUrl: '/api/v1' }) },
      ],
    }).compileComponents();
    const fixture = TestBed.createComponent(App);
    await fixture.whenStable();
    return { fixture, http: TestBed.inject(HttpTestingController), errors: TestBed.inject(ApiErrors) };
  };

  it('affiche l’écran d’identification et vérifie le backend (Actuator), sans charger le catalogue', async () => {
    const { fixture, http, errors } = await start();
    const el = fixture.nativeElement as HTMLElement;
    expect(el.querySelector('.brand')?.textContent).toContain('Orange Order First');
    expect(el.querySelector('h1')?.textContent).toContain('Nouvelle demande');
    http.expectOne('/actuator/health').flush({ status: 'UP' });
    http.expectNone('/api/v1/catalog/offers');
    http.verify();
    await fixture.whenStable();
    expect(errors.message()).toBeNull();
  });

  it('backend injoignable ou DOWN : bandeau d’erreur', async () => {
    const { fixture, http, errors } = await start();
    http.expectOne('/actuator/health').flush({ status: 'DOWN' }, { status: 503, statusText: 'Service Unavailable' });
    await fixture.whenStable();
    expect(errors.message()).toContain('injoignable');
  });
});
