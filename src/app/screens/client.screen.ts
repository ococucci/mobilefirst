import { Component, inject, signal } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AddressSuggestion, OrasApi } from '../api/oras.api';
import { PartyApi } from '../api/party.api';
import { ScoringApi } from '../api/scoring.api';
import { identityChangeRequiresRescore, isValidEmail, isValidMsisdn } from '../domain/rules';
import { OrderStore } from '../store/order.store';
import { IdentityForm, identityComplete } from '../ui/identity-form';
import { Page } from '../ui/page';

/** Écran 2 : titulaire et adresse de facturation (acquisition). */
@Component({
  selector: 'app-client',
  imports: [FormsModule, Page, IdentityForm],
  template: `
    @let a = store.draft.address;
    <app-page title="Client" [busy]="busy()" [disabled]="store.score() === 'rouge'" (primary)="next()">
      <div class="notice orange">
        Les informations du client sont modifiables. <strong>Modifier le nom, le prénom ou la date de naissance relance
        le contrôle Préventel.</strong>
      </div>
      @if (store.score() === 'rouge') {
        <div class="notice red"><strong>Score Préventel rouge après modification :</strong> aucune vente possible.</div>
      } @else if (rescored()) {
        <div class="notice green">Contrôle Préventel relancé : <strong>score {{ store.score() }}</strong>.</div>
      }

      <div class="card">
        <h2>Titulaire</h2>
        <app-identity-form [identity]="store.draft.identity" [full]="true" [showErrors]="submitted()" />
        @if (submitted() && contactError()) { <p class="msg ko small">{{ contactError() }}</p> }
      </div>

      <div class="card">
        <h2>Adresse de facturation</h2>
        <div class="field">
          <label for="addr">Rechercher l'adresse</label>
          <input id="addr" autocomplete="off" placeholder="N° et voie, code postal ou commune"
            [ngModel]="query" (ngModelChange)="search($event)" [class.ko]="submitted() && !a.codePostal" />
          @if (suggestions().length) {
            <ul class="suggest" role="listbox">
              @for (s of suggestions(); track s.ligne + s.codePostal) {
                <li><button type="button" role="option" (click)="pick(s)">{{ s.ligne }}, {{ s.codePostal }} {{ s.commune }}</button></li>
              }
            </ul>
          } @else if (query.length > 2 && !a.codePostal && searched()) {
            <span class="msg">Aucune adresse trouvée par Api-ORAS.</span>
          }
          <span class="msg">Adresse complétée et fiabilisée par Api-ORAS.</span>
        </div>
        <div class="grid2">
          <div class="field"><label for="cp">Code postal</label><input id="cp" [value]="a.codePostal" readonly /></div>
          <div class="field"><label for="commune">Commune</label><input id="commune" [value]="a.commune" readonly /></div>
          <div class="field span2">
            <label for="cplt">Complément (facultatif)</label>
            <input id="cplt" [(ngModel)]="a.complement" />
          </div>
        </div>
      </div>
      @if (error()) { <div class="notice red">{{ error() }}</div> }
    </app-page>
  `,
})
export class ClientScreen {
  protected readonly store = inject(OrderStore);
  private readonly oras = inject(OrasApi);
  private readonly party = inject(PartyApi);
  private readonly scoring = inject(ScoringApi);

  protected readonly suggestions = signal<AddressSuggestion[]>([]);
  protected readonly searched = signal(false);
  protected readonly busy = signal(false);
  protected readonly submitted = signal(false);
  protected readonly rescored = signal(false);
  protected readonly error = signal<string | null>(null);
  protected query = this.store.draft.address.ligne
    ? `${this.store.draft.address.ligne}, ${this.store.draft.address.codePostal} ${this.store.draft.address.commune}`
    : '';

  protected async search(query: string): Promise<void> {
    this.query = query;
    Object.assign(this.store.draft.address, { ligne: '', codePostal: '', commune: '' });
    const results = await this.oras.search(query);
    if (query !== this.query) return;
    this.suggestions.set(results);
    this.searched.set(true);
  }

  protected pick(s: AddressSuggestion): void {
    Object.assign(this.store.draft.address, s);
    this.query = `${s.ligne}, ${s.codePostal} ${s.commune}`;
    this.suggestions.set([]);
  }

  protected contactError(): string | null {
    const i = this.store.draft.identity;
    if (!isValidMsisdn(i.mobileContact)) return 'Mobile de contact invalide.';
    if (!isValidEmail(i.email)) return 'Email invalide.';
    return null;
  }

  async next(): Promise<void> {
    this.submitted.set(true);
    this.error.set(null);
    const d = this.store.draft;
    if (!identityComplete(d.identity, true) || this.contactError() || !d.address.codePostal) {
      this.error.set('Complétez les champs obligatoires du titulaire et l’adresse de facturation.');
      return;
    }
    const customer = this.store.customer();
    if (!customer) return;
    this.busy.set(true);
    let score = this.store.score() ?? customer.score;
    if (identityChangeRequiresRescore(d.identitySnapshot, d.identity)) {
      score = await this.scoring.preventel(d.identity);
      this.store.score.set(score);
      this.rescored.set(true);
      d.identitySnapshot = structuredClone(d.identity);
    }
    if (score === 'rouge') {
      this.busy.set(false);
      return;
    }
    const updated = await this.party.update(customer.id, d.identity, d.address, score);
    this.store.customer.set(updated);
    this.busy.set(false);
    this.store.go('forfait');
  }
}
