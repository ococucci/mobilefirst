import { Component, inject, signal } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AddressApi, AddressSuggestion } from '../api/address.api';
import { CustomerApi } from '../api/customer.api';
import { OrderStore } from '../store/order.store';
import { IdentityForm, identityComplete } from '../ui/identity-form';
import { CORRECT_FIELDS, FieldError, focusFirstError } from '../ui/field-error';
import { Page } from '../ui/page';
import { run } from '../ui/run';

/** Écran 2 : titulaire et adresse de facturation (acquisition). */
@Component({
  selector: 'app-client',
  imports: [FormsModule, Page, IdentityForm, FieldError],
  template: `
    @let a = store.draft.address;
    <app-page title="Client" [busy]="busy()" [disabled]="store.score() === 'rouge'" (primary)="next()" [hint]="hint()">
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
      </div>

      <div class="card">
        <h2>Adresse de facturation</h2>
        <div class="field">
          <label for="addr">Rechercher l'adresse</label>
          <input id="addr" autocomplete="off" placeholder="N° et voie, code postal ou commune"
            [ngModel]="query" (ngModelChange)="search($event)" [class.ko]="addressError()" [attr.aria-invalid]="!!addressError()"
            aria-describedby="addr-error" />
          @if (suggestions().length) {
            <ul class="suggest" role="listbox">
              @for (s of suggestions(); track s.ligne + s.codePostal) {
                <li><button type="button" role="option" (click)="pick(s)">{{ s.ligne }}, {{ s.codePostal }} {{ s.commune }}</button></li>
              }
            </ul>
          } @else if (query.length > 2 && !a.codePostal && searched()) {
            <span class="msg">Aucune adresse trouvée par Api-ORAS.</span>
          }
          @if (addressError()) {
            <app-field-error for="addr" [message]="addressError()" />
          } @else {
            <span class="msg">Adresse complétée et fiabilisée par Api-ORAS.</span>
          }
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
    </app-page>
  `,
})
export class ClientScreen {
  protected readonly store = inject(OrderStore);
  private readonly addresses = inject(AddressApi);
  private readonly customers = inject(CustomerApi);

  protected readonly suggestions = signal<AddressSuggestion[]>([]);
  protected readonly searched = signal(false);
  protected readonly busy = signal(false);
  protected readonly submitted = signal(false);
  protected readonly rescored = signal(false);
  protected query = this.store.draft.address.ligne
    ? `${this.store.draft.address.ligne}, ${this.store.draft.address.codePostal} ${this.store.draft.address.commune}`
    : '';

  protected async search(query: string): Promise<void> {
    this.query = query;
    Object.assign(this.store.draft.address, { ligne: '', codePostal: '', commune: '' });
    await run(null, async () => {
      const results = await this.addresses.search(query);
      if (query !== this.query) return;
      this.suggestions.set(results);
      this.searched.set(true);
    });
  }

  protected pick(s: AddressSuggestion): void {
    Object.assign(this.store.draft.address, s);
    this.query = `${s.ligne}, ${s.codePostal} ${s.commune}`;
    this.suggestions.set([]);
  }

  private invalid(): boolean {
    const d = this.store.draft;
    return !identityComplete(d.identity, true) || !d.address.codePostal;
  }

  /** Rappel près du bouton, tant qu'il reste des champs en erreur. */
  protected hint(): string | null {
    return this.submitted() && this.invalid() ? CORRECT_FIELDS : null;
  }

  protected addressError(): string | null {
    if (!this.submitted() || this.store.draft.address.codePostal) return null;
    return this.query.trim() ? 'Sélectionnez une adresse dans la liste proposée.' : "L'adresse de facturation est obligatoire.";
  }

  async next(): Promise<void> {
    this.submitted.set(true);
    const d = this.store.draft;
    if (this.invalid()) return focusFirstError();
    const customer = this.store.customer();
    if (!customer) return;
    await run(this.busy, async () => {
      // Le serveur relance Préventel si le nom, le prénom ou la date de naissance ont changé ;
      // avec un score rouge, il n'enregistre rien.
      const { score, rescored, customer: updated } = await this.customers.update(customer.id, d.identity, d.address);
      this.store.score.set(score);
      if (rescored) {
        this.rescored.set(true);
        d.identitySnapshot = structuredClone(d.identity);
      }
      if (score === 'rouge') return;
      this.store.customer.set(updated);
      this.store.go('forfait');
    });
  }
}
