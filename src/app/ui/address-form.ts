import { Component, inject, input, signal } from '@angular/core';
import { takeUntilDestroyed } from '@angular/core/rxjs-interop';
import { FormsModule } from '@angular/forms';
import { Subject } from 'rxjs';
import { ADDRESS_MIN_LENGTH, AddressApi, AddressSuggestion, debouncedAddressSearch } from '../api/address.api';
import { formatAddress } from '../domain/format';
import { Address } from '../domain/models';
import { territoireFromCodePostal } from '../domain/rules';
import { FieldError } from './field-error';

/** Adresse choisie dans la recherche (le numéro de voie peut manquer : voie ou lieu-dit sans numéro). */
export const hasAddress = (a: { nomVoie: string; codePostal: string; commune: string }): boolean =>
  !!(a.nomVoie && a.codePostal && a.commune);

/**
 * Bloc adresse : recherche Api-ORAS (champ de recherche seul, jamais enregistré), puis numéro et nom de voie, code
 * postal, commune et territoire grisés, remplis par l'adresse choisie ; complément modifiable.
 * Utilisé à la création du client (identification) et à l'étape Client.
 */
@Component({
  selector: 'app-address-form',
  imports: [FormsModule, FieldError],
  template: `
    @let a = address();
    <div class="field">
      <label for="addr">Rechercher une adresse</label>
      <input id="addr" type="search" autocomplete="off" placeholder="N° et voie, code postal ou commune"
        [ngModel]="query" (ngModelChange)="search($event)" [class.ko]="error()" [attr.aria-invalid]="!!error()"
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
      @if (error()) {
        <app-field-error for="addr" [message]="error()" />
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
        <input id="territoire" [value]="a.territoire" readonly tabindex="-1" />
      </div>
      <div class="field span2">
        <label for="cplt">Complément (facultatif)</label>
        <input id="cplt" placeholder="Bâtiment, étage, résidence…" [(ngModel)]="a.complement" />
      </div>
    </div>
  `,
})
export class AddressForm {
  private readonly addresses = inject(AddressApi);

  /** Adresse modifiée en place (brouillon de la commande ou fiche de création). */
  readonly address = input.required<Address>();
  /** Affiche l'erreur « adresse obligatoire » (après une tentative de validation). */
  readonly showErrors = input(false);

  protected readonly suggestions = signal<AddressSuggestion[]>([]);
  protected readonly searched = signal(false);
  /** Saisie en attente de résultat (pause de frappe puis appel à Api-ORAS). */
  protected readonly searching = signal(false);
  /** Saisies successives, interrogées après une pause dans la frappe (debounce). */
  private readonly input$ = new Subject<string>();
  /** Texte de recherche : état du bloc uniquement, jamais envoyé au backend. */
  protected query = '';
  protected readonly minLength = ADDRESS_MIN_LENGTH;
  protected readonly addr = formatAddress;

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

  /** Message d'erreur du champ de recherche, tant qu'aucune adresse n'est choisie. */
  error(): string | null {
    if (!this.showErrors() || hasAddress(this.address())) return null;
    return this.query.trim() ? 'Sélectionnez une adresse dans la liste proposée.' : "Recherchez puis sélectionnez l'adresse.";
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

  /** Remplit numéro, voie, code postal, commune et territoire ; le complément saisi est conservé. La recherche est vidée. */
  protected pick(s: AddressSuggestion): void {
    const { numeroVoie, nomVoie, codePostal, commune } = s;
    Object.assign(this.address(), {
      numeroVoie: numeroVoie ?? '',
      nomVoie,
      codePostal,
      commune,
      territoire: territoireFromCodePostal(codePostal),
    });
    this.query = '';
    this.suggestions.set([]);
    this.searched.set(false);
    this.searching.set(false);
  }
}
