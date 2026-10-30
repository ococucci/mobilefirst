import { Component, computed, inject, signal } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CatalogApi } from '../api/catalog.api';
import { formatEuro, formatMsisdn } from '../domain/format';
import { DONOR_OPERATORS, FAMILIES, FamilyId, Offer } from '../domain/models';
import { allowedFamilies, isOpenMlAvailable, openMlDiscount } from '../domain/rules';
import { NumberChoice, numberErrors, sponsorError } from '../domain/validation';
import { OrderStore } from '../store/order.store';
import { CustomerBanner } from '../ui/customer-banner';
import { CORRECT_FIELDS, FieldError, focusFirstError } from '../ui/field-error';
import { Page } from '../ui/page';
import { run } from '../ui/run';

/** Écrans 3, 3b et 3c : numéro d'appel, famille, forfaits, Open ML et options. */
@Component({
  selector: 'app-forfait',
  imports: [FormsModule, Page, CustomerBanner, FieldError],
  template: `
    @let d = store.draft;
    @let n = d.number;
    <app-page [title]="isChange ? 'Changement de forfait' : 'Forfait'" [busy]="busy()" (primary)="next()" [hint]="hint()">
      @if (isChange) {
        @if (store.selectedLine(); as line) {
          <app-customer-banner badge="Changement de forfait" [title]="'Ligne ' + fmt(line.msisdn)"
            [subtitle]="store.holderName() + ' · Offre actuelle : ' + line.offerLabel" />
        }
      } @else {
        <h2>Choix du numéro d'appel</h2>
        <div class="choices" role="radiogroup" aria-label="Numéro d'appel">
          <div class="choice top" [class.on]="n.mode === 'portabilite'" (click)="n.mode = 'portabilite'">
            <span class="radio" role="radio" [attr.aria-checked]="n.mode === 'portabilite'" tabindex="0" (keyup.enter)="n.mode = 'portabilite'"></span>
            <div class="body">
              <span class="title" style="font-weight: normal">Le client souhaite conserver son numéro de téléphone mobile détenu chez un autre opérateur</span>
              @if (n.mode === 'portabilite') {
                <div class="grid2" style="margin-top: 1rem">
                  <div class="field">
                    <label for="rio">Code RIO</label>
                    <input id="rio" autocomplete="off" placeholder="01P123456ABC" [(ngModel)]="n.rio"
                      [class.ko]="nerr('rio')" [attr.aria-invalid]="!!nerr('rio')" aria-describedby="rio-error" />
                    <app-field-error for="rio" [message]="nerr('rio')" />
                  </div>
                  <div class="field">
                    <label for="pmsisdn">Numéro à conserver</label>
                    <input id="pmsisdn" type="tel" inputmode="tel" [(ngModel)]="n.portedMsisdn"
                      [class.ko]="nerr('portedMsisdn')" [attr.aria-invalid]="!!nerr('portedMsisdn')" aria-describedby="pmsisdn-error" />
                    <app-field-error for="pmsisdn" [message]="nerr('portedMsisdn')" />
                  </div>
                  <div class="field">
                    <label for="op">Opérateur donneur</label>
                    <select id="op" [(ngModel)]="n.operator" [class.ko]="nerr('operator')" [attr.aria-invalid]="!!nerr('operator')" aria-describedby="op-error">
                      <option value="" disabled>Choisir</option>
                      @for (o of operators; track o) { <option [value]="o">{{ o }}</option> }
                    </select>
                    <app-field-error for="op" [message]="nerr('operator')" />
                  </div>
                  <div class="field">
                    <label for="pdate">Date d'exécution du portage</label>
                    <input id="pdate" type="date" [min]="today" [(ngModel)]="n.portingDate"
                      [class.ko]="nerr('portingDate')" [attr.aria-invalid]="!!nerr('portingDate')" aria-describedby="pdate-error" />
                    <app-field-error for="pdate" [message]="nerr('portingDate')" />
                  </div>
                </div>
                <span class="small muted">Les quatre champs sont obligatoires.</span>
              }
            </div>
          </div>
          <div class="choice top" [class.on]="n.mode === 'nouveau'" (click)="n.mode = 'nouveau'">
            <span class="radio" role="radio" [attr.aria-checked]="n.mode === 'nouveau'" tabindex="0" (keyup.enter)="n.mode = 'nouveau'"></span>
            <div class="body">
              <span class="title">Le client souhaite un nouveau numéro de téléphone mobile</span>
              @if (n.mode === 'nouveau') {
                <div class="field" style="margin: 1rem 0 0">
                  <label for="newmsisdn">Nouveau numéro MSISDN</label>
                  <select id="newmsisdn" [(ngModel)]="n.msisdn" [class.ko]="nerr('msisdn')" [attr.aria-invalid]="!!nerr('msisdn')" aria-describedby="newmsisdn-error">
                    <option value="" disabled>Choisir un numéro disponible</option>
                    @for (num of numbers(); track num) { <option [value]="num">{{ fmt(num) }}</option> }
                  </select>
                  @if (nerr('msisdn')) {
                    <app-field-error for="newmsisdn" [message]="nerr('msisdn')" />
                  } @else {
                    <span class="msg">Numéros disponibles fournis par api ressource.</span>
                  }
                </div>
              }
            </div>
          </div>
        </div>
      }

      <h2 class="section-title">Famille de forfait</h2>
      @if (allowed().length < families.length) {
        <div class="notice orange">
          @if (isChange && store.selectedLine()?.isCard) { Ligne Card re-scorée. }
          <strong>Score orange :</strong> seule l'offre Carte Prépayée est vendable. La remise Open ML est indisponible.
        </div>
      }
      <div class="choices four" role="radiogroup" aria-label="Famille de forfait">
        @for (f of families; track f.id) {
          <button type="button" class="choice family" role="radio" [attr.aria-checked]="d.family === f.id"
            [class.on]="d.family === f.id" [disabled]="!allowed().includes(f.id)" (click)="selectFamily(f.id)">
            <span [style.font-weight]="d.family === f.id ? 700 : 400">{{ f.label }}</span>
          </button>
        }
      </div>

      <h2 class="section-title">Forfaits</h2>
      <div class="card">
        <button type="button" class="tree-head" (click)="expanded.set(!expanded())" [attr.aria-expanded]="expanded()">
          <span><strong>{{ familyLabel() }}</strong><br /><span class="small muted">{{ familyOffers().length }} forfait(s) disponible(s)</span></span>
          <span aria-hidden="true">{{ expanded() ? '▾' : '▸' }}</span>
        </button>
        @if (expanded()) {
          <div class="tree choices" role="radiogroup" aria-label="Forfaits" [class.ko]="offerError()" aria-describedby="offer-error">
            @for (o of familyOffers(); track o.id) {
              @let current = isChange && o.id === store.selectedLine()?.offerId;
              <button type="button" class="choice" role="radio" [attr.aria-checked]="d.offerId === o.id"
                [class.on]="d.offerId === o.id" [disabled]="current" (click)="selectOffer(o)">
                <span class="radio"></span>
                <span class="body">
                  <span class="title" style="display: block">{{ o.label }}</span>
                  <span class="sub" style="display: block">{{ o.detail }}</span>
                  @if (current) { <span class="badge gray">Offre actuelle</span> }
                  @else if (store.promoFor(o.id); as p) { <span class="badge orange">{{ p.label }}</span> }
                </span>
                <span class="end">{{ o.price ? euro(o.price) + '/mois' : 'Sans mensualité' }}</span>
              </button>
            }
          </div>
        }
        @if (offerError()) { <span class="msg ko group-error" id="offer-error">{{ offerError() }}</span> }
      </div>

      <div class="card">
        <label class="check" [class.disabled]="!openMlAvailable()" style="padding-top: 0">
          <span class="body">
            <strong>Remise Open ML</strong><br />
            <span class="small muted">−5 € (offre d'entrée de gamme) ou −10 € / mois à vie. Indisponible pour une ligne Card.</span>
          </span>
          <input type="checkbox" [disabled]="!openMlAvailable()" [checked]="d.openMl.enabled && openMlAvailable()"
            (change)="d.openMl.enabled = $any($event.target).checked" />
        </label>
        @if (d.openMl.enabled && openMlAvailable()) {
          <div class="field" style="margin: 0.5rem 0 0">
            <label for="sponsor">N° sponsor</label>
            <div class="inline">
              <input id="sponsor" class="grow" type="tel" inputmode="tel" [ngModel]="d.openMl.sponsor"
                (ngModelChange)="d.openMl.sponsor = $event; d.openMl.valid = null"
                [class.ok]="d.openMl.valid === true" [class.ko]="sponsorErr()" [attr.aria-invalid]="!!sponsorErr()" aria-describedby="sponsor-error" />
              <button type="button" class="btn small" (click)="checkSponsor()" [disabled]="checkingSponsor()">
                @if (checkingSponsor()) { <span class="spinner"></span> } Vérifier
              </button>
            </div>
            @if (d.openMl.valid === true) {
              <span class="msg ok">Sponsor valide · remise de {{ euro(openMlAmount()) }}/mois à vie</span>
            } @else if (sponsorErr()) {
              <app-field-error for="sponsor" [message]="sponsorErr()" />
            } @else {
              <span class="msg">Le N° sponsor est contrôlé par api RHOC.</span>
            }
          </div>
        }
      </div>

      <div class="card">
        <h2>Options mobile</h2>
        @if (store.selectedOffer()?.family === 'prepaye') {
          <p class="muted">Pas d'option mobile sur la Carte Prépayée.</p>
        } @else {
          @for (o of store.catalogOptions(); track o.id) {
            <label class="check">
              <span class="body">{{ o.label }}</span>
              <span class="price">+{{ euro(o.price) }}/mois</span>
              <input type="checkbox" [checked]="d.options.includes(o.id)" (change)="setOption(o.id, $any($event.target).checked)" />
            </label>
          }
        }
      </div>
    </app-page>
  `,
})
export class ForfaitScreen {
  protected readonly store = inject(OrderStore);
  private readonly catalog = inject(CatalogApi);

  protected readonly isChange = this.store.flow() === 'forfait';
  protected readonly families = FAMILIES;
  protected readonly operators = DONOR_OPERATORS;
  protected readonly today = new Date().toISOString().slice(0, 10);
  protected readonly numbers = signal<string[]>([]);
  protected readonly expanded = signal(true);
  protected readonly submitted = signal(false);
  protected readonly busy = signal(false);
  protected readonly checkingSponsor = signal(false);
  protected readonly familyId = signal<FamilyId>(this.store.draft.family);

  protected readonly fmt = formatMsisdn;
  protected readonly euro = formatEuro;

  protected readonly allowed = computed(() => allowedFamilies(this.store.score() ?? 'vert'));
  protected readonly familyOffers = computed(() => this.store.offers().filter((o) => o.family === this.familyId()));
  protected readonly familyLabel = computed(() => FAMILIES.find((f) => f.id === this.familyId())?.label ?? '');

  constructor() {
    if (!this.allowed().includes(this.store.draft.family)) this.selectFamily(this.allowed()[0] ?? 'prepaye');
    if (!this.isChange) void run(null, async () => this.numbers.set(await this.catalog.availableNumbers()));
  }

  protected openMlAvailable(): boolean {
    return isOpenMlAvailable(this.store.selectedOffer(), this.isChange ? this.store.selectedLine() : null);
  }

  protected openMlAmount(): number {
    const offer = this.store.selectedOffer();
    return offer ? openMlDiscount(offer) : 0;
  }

  /** Erreur d'un champ du choix du numéro (affichée après une tentative de validation). */
  protected nerr(field: keyof NumberChoice): string | null {
    if (!this.submitted() || this.isChange) return null;
    return numberErrors(this.store.draft.number, this.today)[field] ?? null;
  }

  protected offerError(): string | null {
    return this.submitted() && !this.store.draft.offerId ? 'Choisissez un forfait.' : null;
  }

  /** Un sponsor refusé s'affiche tout de suite ; les autres erreurs après une tentative de validation. */
  protected sponsorErr(): string | null {
    const o = this.store.draft.openMl;
    if (!this.openMlAvailable() || (!this.submitted() && o.valid !== false)) return null;
    return sponsorError(o.enabled, o.sponsor, o.valid);
  }

  protected selectFamily(id: FamilyId): void {
    this.store.draft.family = id;
    this.familyId.set(id);
    this.expanded.set(true);
    if (this.store.selectedOffer()?.family !== id) this.store.draft.offerId = null;
  }

  protected selectOffer(offer: Offer): void {
    const d = this.store.draft;
    d.offerId = offer.id;
    if (offer.family === 'prepaye') d.options = [];
    if (!this.openMlAvailable()) d.openMl = { enabled: false, sponsor: '', valid: null };
  }

  protected setOption(id: string, checked: boolean): void {
    const d = this.store.draft;
    d.options = checked ? [...new Set([...d.options, id])] : d.options.filter((o) => o !== id);
  }

  protected async checkSponsor(): Promise<void> {
    await run(this.checkingSponsor, async () => {
      this.store.draft.openMl.valid = await this.catalog.checkSponsor(this.store.draft.openMl.sponsor);
    });
  }

  private invalid(): boolean {
    const numberInvalid = !this.isChange && Object.keys(numberErrors(this.store.draft.number, this.today)).length > 0;
    return numberInvalid || !!this.offerError() || !!this.sponsorErr();
  }

  /** Rappel près du bouton, tant qu'il reste des champs en erreur. */
  protected hint(): string | null {
    return this.submitted() && this.invalid() ? CORRECT_FIELDS : null;
  }

  async next(): Promise<void> {
    this.submitted.set(true);
    const d = this.store.draft;
    // Sponsor saisi mais pas encore vérifié : on le contrôle avant d'afficher une erreur.
    if (d.openMl.enabled && this.openMlAvailable() && d.openMl.valid === null && d.openMl.sponsor.trim()) {
      await this.checkSponsor();
    }
    if (!d.offerId) this.expanded.set(true);
    if (this.invalid()) return focusFirstError();
    if (!this.openMlAvailable()) d.openMl.enabled = false;
    this.store.go(this.isChange ? 'confirmation' : 'materiel');
  }
}
