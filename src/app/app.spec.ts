import { provideHttpClient } from '@angular/common/http';
import { HttpTestingController, provideHttpClientTesting } from '@angular/common/http/testing';
import { TestBed } from '@angular/core/testing';
import { App } from './app';

describe('App', () => {
  it('affiche l’écran d’identification et charge le catalogue depuis l’API', async () => {
    await TestBed.configureTestingModule({
      imports: [App],
      providers: [provideHttpClient(), provideHttpClientTesting()],
    }).compileComponents();
    const fixture = TestBed.createComponent(App);
    await fixture.whenStable();
    const el = fixture.nativeElement as HTMLElement;
    expect(el.querySelector('.brand')?.textContent).toContain('Orange Order First');
    expect(el.querySelector('h1')?.textContent).toContain('Nouvelle demande');
    const http = TestBed.inject(HttpTestingController);
    for (const url of ['/api/v1/catalog/offers', '/api/v1/catalog/options', '/api/v1/catalog/promotions']) {
      http.expectOne(url).flush([]);
    }
    http.verify();
  });
});
