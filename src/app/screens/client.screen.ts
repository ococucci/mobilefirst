import { Component, inject, signal } from '@angular/core';
import { takeUntilDestroyed } from '@angular/core/rxjs-interop';
import { FormsModule } from '@angular/forms';
import { Subject } from 'rxjs';
import { ADDRESS_MIN_LENGTH, AddressApi, AddressSuggestion, debouncedAddressSearch } from '../api/address.api';
import { formatAddress } from '../domain/format';
import { customerDataChanged, territoireFromCodePostal } from '../domain/rules';
import { CustomerApi } from '../api/customer.api';
import { OrderStore } from '../store/order.store';
import { IdentityForm, identityComplete } from '../ui/identity-form';
import { CORRECT_FIELDS, FieldError, focusFirstError } from '../ui/field-error';
import { Page } from '../ui/page';
import { run } from '../ui/run';

/** Écran 2 : titulaire et adresse de facturation (acquisition). */
/** Adresse choisie dans la recherche (le numéro de voie peut manquer : voie ou lieu-dit sans numéro). */
const hasAddress = (a: { nomVoie: string; codePostal: string; commune: string }): boolean =>
  !!(a.nomVoie && a.codePostal && a.commune);

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
        <!-- Champ de recherche seul : il remplit les champs ci-dessous et n'est pas enregistré dans la commande. -->
        <div class="field">
          <label for="addr">Rechercher une adresse</label>
          <input id="addr" type="search" autocomplete="off" placeholder="N° et voie, code postal ou commune"
            [ngModel]="query" (ngModelChange)="search($event)" [class.ko]="addressError()" [attr.aria-invalid]="!!addressError()"
            aria-describedby="addr-error" aria-controls="addr-suggestions" />
          @if (suggestions().length) {
            <ul class="suggest" id="addr-suggestions" role="listbox" aria-label="Adresses proposées">
              @for (s of suggestions(); track $index) {
                <li><button type="button" role="option" (click)="pick(s)">{{ addr(s) }}</button></li>
              }
            </ul>
          } @else if (searching()) {
            <span class="msg loading" role="status"><span class="spinner"></span> Recherche d'adresses (Api-ORAS)…</span>
          } @else if (searched() && query.trim().length >= minLength) {
            <span class="msg">Aucune adresse trouvée par Api-ORAS.</span>
          }
          @if (addressError()) {
            <app-field-error for="addr" [message]="addressError()" />
          } @else {
            <span class="msg">Choisissez une adresse proposée par Api-ORAS : elle remplit les champs ci-dessous.</span>
          }
        </div>
        <div class="address-grid">
          <div class="field">
            <label for="numvoie">N° de voie</label>
            <input id="numvoie" [value]="a.numeroVoie" readonly tabindex="-1" />
          </div>
          <div class="field">
            <label for="nomvoie">Nom de la voie</label>
            <input id="nomvoie" [value]="a.nomVoie" readonly tabindex="-1" />
          </div>
          <div class="field">
            <label for="cp">Code postal</label>
            <input id="cp" [value]="a.codePostal" readonly tabindex="-1" />
          </div>
          <div class="field">
            <label for="commune">Commune</label>
            <input id="commune" [value]="a.commune" readonly tabindex="-1" />
          </div>
          <div class="field territoire">
            <label for="territoire">Territoire</label>
            <input id="territoire" [value]="territoire(a.codePostal)" readonly tabindex="-1" />
          </div>
          <div class="field span2">
            <label for="cplt">Complément (facultatif)</label>
            <input id="cplt" placeholder="Bâtiment, étage, résidence…" [(ngModel)]="a.complement" />
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
  /** Saisie en attente de résultat (pause de frappe puis appel à Api-ORAS). */
  protected readonly searching = signal(false);
  /** Saisies successives, interrogées après une pause dans la frappe (debounce). */
  private readonly input$ = new Subject<string>();
  protected readonly busy = signal(false);
  protected readonly submitted = signal(false);
  protected readonly rescored = signal(false);
  /** Texte de recherche : état de l'écran uniquement, jamais envoyé dans la commande. */
  protected query = '';
  protected readonly minLength = ADDRESS_MIN_LENGTH;
  protected readonly addr = formatAddress;
  /** Territoire déduit du code postal (affichage). */
  protected readonly territoire = territoireFromCodePostal;

  constructor() {
    debouncedAddressSearch(this.input$, (q) => this.addresses.search(q))
      .pipe(takeUntilDestroyed())
      .subscribe(({ query, suggestions }) => {
        // Réponse à une saisie dépassée (l'adresse a été choisie entre-temps) : ignorée.
        if (query !== this.query.trim()) return;
        this.suggestions.set(suggestions);
        this.searched.set(query.length >= ADDRESS_MIN_LENGTH);
        this.searching.set(false);
      });
  }

  /**
   * La recherche part après une pause dans la saisie. Elle ne modifie pas l'adresse déjà choisie : seul le choix
   * d'une suggestion la remplace.
   */
  protected search(query: string): void {
    this.query = query;
    this.searched.set(false);
    const long = query.trim().length >= ADDRESS_MIN_LENGTH;
    this.searching.set(long);
    if (!long) this.suggestions.set([]);
    this.input$.next(query);
  }

  /** Remplit numéro, voie, code postal et commune ; le complément saisi est conservé. La recherche est vidée. */
  protected pick(s: AddressSuggestion): void {
    const { numeroVoie, nomVoie, codePostal, commune } = s;
    Object.assign(this.store.draft.address, { numeroVoie: numeroVoie ?? '', nomVoie, codePostal, commune });
    this.query = '';
    this.suggestions.set([]);
    this.searched.set(false);
    this.searching.set(false);
  }

  private invalid(): boolean {
    const d = this.store.draft;
    return !identityComplete(d.identity, true) || !hasAddress(d.address);
  }

  /** Rappel près du bouton, tant qu'il reste des champs en erreur. */
  protected hint(): string | null {
    return this.submitted() && this.invalid() ? CORRECT_FIELDS : null;
  }

  protected addressError(): string | null {
    if (!this.submitted() || hasAddress(this.store.draft.address)) return null;
    return this.query.trim()
      ? 'Sélectionnez une adresse dans la liste proposée.'
      : "Recherchez puis sélectionnez l'adresse de facturation.";
  }

  async next(): Promise<void> {
    this.submitted.set(true);
    const d = this.store.draft;
    if (this.invalid()) return focusFirstError();
    const customer = this.store.customer();
    if (!customer) return;
    // Aucune modification des informations du client : on passe à l'étape suivante sans appeler le backend.
    if (!customerDataChanged(customer, d.identity, d.address)) {
      this.store.go('forfait');
      return;
    }
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
