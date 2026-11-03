import { Component, computed, inject, signal } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CustomerApi } from '../api/customer.api';
import { formatDate, formatMsisdn } from '../domain/format';
import { Customer, Identity, Score } from '../domain/models';
import { digits, isValidMsisdn } from '../domain/rules';
import { MSISDN_MESSAGE } from '../domain/validation';
import { CustomerStatus, emptyAddress, emptyIdentity, OrderStore } from '../store/order.store';
import { IdentityForm, identityComplete } from '../ui/identity-form';
import { FieldError, focusFirstError } from '../ui/field-error';
import { Page } from '../ui/page';
import { run } from '../ui/run';

type Mode = 'search' | 'unknown' | 'new';

/** Écrans 1 à 1f : identification par MSISDN, contrôle Préventel, client sans numéro. */
@Component({
  selector: 'app-identification',
  imports: [FormsModule, Page, IdentityForm, FieldError],
  template: `
    <app-page [title]="title()" [disabled]="!canContinue()" (primary)="store.go('demande')"
      [hint]="store.score() === 'rouge' ? 'Score rouge : aucune vente possible.' : null">

      @if (mode() === 'search') {
        <div class="card">
          <div class="field" style="margin: 0">
            <label for="msisdn">Mobile (MSISDN)</label>
            <div class="inline" style="flex-wrap: wrap">
              <input id="msisdn" class="grow" type="tel" inputmode="tel" autocomplete="off" placeholder="06 90 12 34 56"
                [(ngModel)]="msisdn" (keyup.enter)="search()" [class.ko]="!!error()" [attr.aria-invalid]="!!error()"
                aria-describedby="msisdn-error" style="min-width: 12rem" />
              <button type="button" class="btn primary" style="width: auto" (click)="search()" [disabled]="busy()">
                @if (busy()) { <span class="spinner"></span> } Rechercher le client
              </button>
            </div>
            <app-field-error for="msisdn" [message]="error()" />
          </div>
        </div>
        <p style="display: flex; gap: 1rem; align-items: center; flex-wrap: wrap; margin-bottom: 1rem">
          <span class="muted">Le client n'a pas de numéro de mobile ?</span>
          <button type="button" class="btn" (click)="startNew()">Créer un nouveau client</button>
        </p>
      } @else {
        <p>
          <button type="button" class="btn link" (click)="restart()">← Nouvelle recherche</button>
        </p>
        @if (mode() === 'unknown') {
          <div class="notice orange">
            Le numéro <strong>{{ fmt(msisdn) }}</strong> n'existe pas. Saisissez l'identité du client pour lancer le
            contrôle Préventel. L'existence a déjà été contrôlée sur le numéro, elle n'est pas refaite.
          </div>
        } @else {
          <div class="notice info">
            Création d'un client sans numéro. « Vérifier » interroge la base sur le nom, le prénom, la date de
            naissance et la pièce pour éviter un doublon.
          </div>
        }
        @if (!result()) {
          <div class="card">
            <h2>Identité du client</h2>
            <app-identity-form [identity]="identity" [showErrors]="submitted()" />
            @if (!duplicate()) {
              <button type="button" class="btn" (click)="mode() === 'new' ? verify() : runPreventel('controle')" [disabled]="busy()">
                @if (busy()) { <span class="spinner"></span> }
                {{ mode() === 'new' ? 'Vérifier' : 'Lancer le contrôle Préventel' }}
              </button>
            }
          </div>
        }
      }

      @if (duplicate(); as d) {
        <div class="card">
          <div class="ident">
            <span class="ok-dot" style="background: var(--orange); color: var(--ink)" aria-hidden="true">!</span>
            <div class="body">
              <div class="name">Client existant trouvé</div>
              <div class="sub">{{ d.identity.civilite }} {{ d.identity.prenom }} {{ d.identity.nom }} · né(e) le {{ date(d.identity.dateNaissance) }} · {{ d.identity.pieceType }} {{ d.identity.pieceNumero }}</div>
            </div>
          </div>
          <div style="display: flex; gap: 0.75rem; flex-wrap: wrap; margin-top: 1rem">
            <button type="button" class="btn" (click)="useDuplicate(d)">Continuer avec ce client</button>
            <button type="button" class="btn" (click)="runPreventel('cree')" [disabled]="busy()">Ce n'est pas le même client, créer un nouveau</button>
          </div>
          <p class="small muted" style="margin-top: 0.75rem">« Continuer » reprend le client en base, sans nouveau contrôle Préventel.</p>
        </div>
      }

      @if (result(); as r) {
        @if (r.score === 'rouge') {
          <div class="card">
            <div class="ident">
              <span class="ok-dot ko-dot" aria-hidden="true">✕</span>
              <div class="body">
                <div class="name">Score Préventel rouge</div>
                <div class="sub">{{ store.holderName() }}</div>
              </div>
              <span class="badge red">Rouge</span>
            </div>
          </div>
          <div class="notice red">
            <strong>Aucune vente possible.</strong> Le contrôle Préventel bloque toute commande pour ce client.
            Le parcours s'arrête ici.
          </div>
        } @else {
          <div class="card">
            <div class="ident">
              <span class="ok-dot" aria-hidden="true">✓</span>
              <div class="body">
                <div class="name">{{ resultTitle() }}</div>
              </div>
              <span class="badge" [class.green]="r.score === 'vert'" [class.soft]="r.score === 'orange'">{{ resultBadge() }}</span>
            </div>
            <div class="facts">
              <div><div class="k">Titulaire</div><div class="v">{{ r.customer.company?.raisonSociale ?? store.holderName() }}</div>
                @if (r.customer.company; as co) { <div class="small muted">SIREN {{ co.siren }} · SIRET {{ co.siret }}</div> }
              </div>
              <div><div class="k">Naissance et pièce</div><div class="v">{{ date(r.customer.identity.dateNaissance) }} · {{ r.customer.identity.pieceType }} {{ r.customer.identity.pieceNumero }}</div></div>
              <div><div class="k">{{ r.customer.company ? 'Adresse du siège' : 'Adresse' }}</div><div class="v">{{ r.customer.address.ligne || '—' }}@if (r.customer.address.commune) {, {{ r.customer.address.codePostal }} {{ r.customer.address.commune }}}</div></div>
            </div>
          </div>
          @if (r.status === 'connu') {
            <div class="notice green">Informations récupérées. Client connu : <strong>pas de nouveau contrôle Préventel : le score déjà en base s'applique.</strong></div>
          } @else {
            <div class="notice green">Contrôle Préventel effectué : <strong>score {{ r.score }}</strong>. Le client est créé.</div>
          }
          @if (r.score === 'orange') {
            <div class="notice orange"><strong>Score orange :</strong> seule l'offre Carte Prépayée est vendable.</div>
          }
          @if (r.customer.type === 'PRO') {
            <div class="notice info">Client entreprise : seuls les actes de gestion sur les lignes existantes sont autorisés.</div>
          }
        }
      }
    </app-page>
  `,
})
export class IdentificationScreen {
  protected readonly store = inject(OrderStore);
  private readonly customers = inject(CustomerApi);

  protected readonly mode = signal<Mode>('search');
  protected readonly busy = signal(false);
  protected readonly error = signal<string | null>(null);
  protected readonly submitted = signal(false);
  protected readonly duplicate = signal<Customer | null>(null);
  protected readonly result = signal<{ customer: Customer; status: CustomerStatus; score: Score } | null>(null);

  protected msisdn = this.store.searchMsisdn() ? formatMsisdn(this.store.searchMsisdn()) : '';
  protected identity: Identity = emptyIdentity();

  protected readonly fmt = formatMsisdn;
  protected readonly date = formatDate;

  protected readonly title = computed(() => {
    switch (this.mode()) {
      case 'search': return 'Nouvelle demande';
      case 'unknown': return 'Client inconnu';
      case 'new': return 'Nouveau client';
    }
  });

  constructor() {
    // Retour sur l'écran avec un client déjà identifié : on réaffiche le résultat.
    const customer = this.store.customer();
    const status = this.store.customerStatus();
    const score = this.store.score();
    if (customer && status && score) this.result.set({ customer, status, score });
  }

  protected canContinue(): boolean {
    const r = this.result();
    return !!r && r.score !== 'rouge';
  }

  protected complete(): boolean {
    return identityComplete(this.identity);
  }

  protected resultTitle(): string {
    const r = this.result();
    if (!r) return '';
    return r.status === 'connu' ? 'Client connu' : r.status === 'cree' ? 'Client créé' : 'Client contrôlé';
  }

  protected resultBadge(): string {
    const r = this.result();
    if (!r) return '';
    if (r.status === 'connu') return r.score === 'orange' ? 'Trouvé · score orange' : 'Trouvé';
    return r.score === 'orange' ? 'Score orange' : 'Score vert';
  }

  async search(): Promise<void> {
    this.error.set(null);
    if (!isValidMsisdn(this.msisdn)) {
      this.error.set(this.msisdn.trim() ? MSISDN_MESSAGE : 'Saisissez le numéro de mobile du client.');
      focusFirstError();
      return;
    }
    await run(this.busy, async () => {
      // 204 (numéro inconnu) : pas de client, on passe à la saisie de l'identité.
      const customer = await this.customers.findByMsisdn(this.msisdn);
      this.store.searchMsisdn.set(digits(this.msisdn));
      if (customer) {
        this.setResult(customer, 'connu', customer.score);
      } else {
        this.identity = emptyIdentity();
        this.identity.mobileContact = digits(this.msisdn);
        this.mode.set('unknown');
      }
    });
  }

  protected startNew(): void {
    this.reset();
    this.store.searchMsisdn.set('');
    this.identity = emptyIdentity();
    this.mode.set('new');
  }

  protected restart(): void {
    this.reset();
    this.mode.set('search');
  }

  private reset(): void {
    this.store.reset();
    this.result.set(null);
    this.duplicate.set(null);
    this.submitted.set(false);
    this.error.set(null);
  }

  /** Client sans numéro : recherche d'existence avant création. */
  async verify(): Promise<void> {
    this.submitted.set(true);
    if (!this.complete()) return focusFirstError();
    // undefined : l'appel a échoué (erreur affichée en bandeau) ; null : 204, aucun client ne correspond.
    const check: { existing?: Customer | null } = {};
    await run(this.busy, async () => {
      check.existing = await this.customers.findExisting(this.identity);
    });
    if (check.existing) this.duplicate.set(check.existing);
    else if (check.existing === null) await this.runPreventel('cree');
  }

  protected useDuplicate(customer: Customer): void {
    this.duplicate.set(null);
    this.setResult(customer, 'connu', customer.score);
  }

  /** Contrôle Préventel puis création du client, côté serveur (pas de création si le score est rouge). */
  async runPreventel(status: 'controle' | 'cree'): Promise<void> {
    this.submitted.set(true);
    if (!this.complete()) return focusFirstError();
    await run(this.busy, async () => {
      const { score, customer } = await this.customers.create(this.identity);
      const shown = customer ?? {
        id: '',
        type: 'GP' as const,
        identity: structuredClone(this.identity),
        address: emptyAddress(),
        score,
        lines: [],
      };
      this.duplicate.set(null);
      this.setResult(shown, status, score);
    });
  }

  private setResult(customer: Customer, status: CustomerStatus, score: Score): void {
    this.store.identify(customer, status, score);
    this.result.set({ customer, status, score });
  }
}
