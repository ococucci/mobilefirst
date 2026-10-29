import { TestBed } from '@angular/core/testing';
import { App } from './app';

describe('App', () => {
  it('affiche l’écran d’identification', async () => {
    await TestBed.configureTestingModule({ imports: [App] }).compileComponents();
    const fixture = TestBed.createComponent(App);
    await fixture.whenStable();
    const el = fixture.nativeElement as HTMLElement;
    expect(el.querySelector('.brand')?.textContent).toContain('Orange Order First');
    expect(el.querySelector('h1')?.textContent).toContain('Nouvelle demande');
  });
});
