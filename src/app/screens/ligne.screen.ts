import { Component, computed, inject, signal } from '@angular/core';
import { ScoringApi } from '../api/scoring.api';
import { formatEuro, formatMsisdn } from '../domain/format';
import { FLOW_LABELS, Line, SIM_REASONS } from '../domain/models';
import { OrderStore } from '../store/order.store';
import { CustomerBanner } from '../ui/customer-banner';
import { Page } from '../ui/page';

/** Écrans 2b, 2c et 2d : choix de la ligne (et de la raison pour un changement de SIM). */
@Component({
  selector: 'app-ligne',
  imports: [Page, CustomerBanner],
  template: `
    @let d = store.draft;
    <app-page [title]="flowLabel()" [busy]="busy()" (primary)="next()" [hint]="error()">
      <app-customer-banner [badge]="flowLabel()" />

      <h2 class="section-title">{{ isSim ? 'Ligne concernée' : 'Lignes du client' }}</h2>
      <div class="choices" role="radiogroup" aria-label="Ligne">
        @for (line of lines(); track line.msisdn) {
          @let pending = isPending(line);
          <button type="button" class="choice" role="radio" [attr.aria-checked]="d.lineMsisdn === line.msisdn"
            [class.on]="d.lineMsisdn === line.msisdn" [disabled]="pending" (click)="select(line)">
            <span class="radio"></span>
            <span class="body">
              <span class="title" style="display: block">{{ fmt(line.msisdn) }}</span>
              <span class="sub" style="display: block">{{ line.offerLabel }}</span>
              @if (pending) { <span class="sub">Modification impossible : commande en cours</span> }
            </span>
            @if (pending) {
              <span class="badge soft">Commande en cours</span>
            } @else {
              <span class="end">{{ isSim ? (line.simType === 'esim' ? 'eSIM' : 'SIM physique') : (line.monthlyPrice === null ? 'Sans mensualité' : euro(line.monthlyPrice) + '/mois') }}</span>
            }
          </button>
        }
      </div>

      @if (store.flow() === 'forfait' && (store.selectedLine()?.isCard || !d.lineMsisdn)) {
        <div class="notice orange" style="margin-top: 1rem">
          <strong>Ligne Card prépayée :</strong> un nouveau contrôle Préventel est lancé avant le choix du forfait. Si le
          score est orange ou rouge, aucun forfait ne peut être pris. La remise Open ML n'est pas disponible pour cette ligne.
        </div>
      }
      @if (blocked()) {
        <div class="notice red"><strong>Re-scoring Préventel {{ blocked() }} :</strong> aucun forfait ne peut être pris pour cette ligne Card.</div>
      }

      @if (isSim) {
        <h2 class="section-title">Raison du changement</h2>
        <p class="muted">Seuls les motifs perte et vol donnent lieu à des frais de 10 €, à régler en caisse. Aucun paiement n'est pris dans l'application.</p>
        <div class="choices two" role="radiogroup" aria-label="Raison">
          @for (r of reasons; track r.id) {
            <button type="button" class="choice" role="radio" [attr.aria-checked]="d.simReason === r.id" [class.on]="d.simReason === r.id" (click)="d.simReason = r.id">
              <span class="radio"></span>
              <span class="body" [style.font-weight]="d.simReason === r.id ? 700 : 400">{{ r.label }}</span>
              @if (r.fee) { <span class="badge soft">Frais : 10 € en caisse</span> }
            </button>
          }
        </div>
      }
    </app-page>
  `,
})
export class LigneScreen {
  protected readonly store = inject(OrderStore);
  private readonly scoring = inject(ScoringApi);

  protected readonly isSim = this.store.flow() === 'sim';
  protected readonly reasons = SIM_REASONS;
  protected readonly busy = signal(false);
  protected readonly error = signal<string | null>(null);
  protected readonly blocked = signal<string | null>(null);
  protected readonly lines = computed(() => this.store.customer()?.lines ?? []);
  protected readonly flowLabel = computed(() => FLOW_LABELS[this.store.flow() ?? 'forfait']);

  protected readonly fmt = formatMsisdn;
  protected readonly euro = formatEuro;

  protected isPending(line: Line): boolean {
    return this.store.pendingLines().includes(line.msisdn);
  }

  protected select(line: Line): void {
    this.store.draft.lineMsisdn = line.msisdn;
    this.blocked.set(null);
    this.error.set(null);
  }

  async next(): Promise<void> {
    const d = this.store.draft;
    const line = this.store.selectedLine();
    const customer = this.store.customer();
    if (!line || !customer) return this.error.set('Choisissez une ligne.');
    if (this.isSim && !d.simReason) return this.error.set('Choisissez la raison du changement.');
    this.error.set(null);

    switch (this.store.flow()) {
      case 'forfait': {
        if (line.isCard) {
          this.busy.set(true);
          const score = await this.scoring.rescore(customer.id, customer.identity);
          this.busy.set(false);
          this.store.score.set(score);
          if (score !== 'vert') {
            this.blocked.set(score);
            return;
          }
        }
        d.options = [...line.options];
        d.offerId = null;
        // Une ligne Card change d'offre pour un forfait : on ouvre sur une famille avec mensualité.
        const family = this.store.offer(line.offerId)?.family ?? 'bloque';
        d.family = family === 'prepaye' ? 'bloque' : family;
        this.store.go('forfait');
        break;
      }
      case 'options':
        d.options = [...line.options];
        this.store.go('options');
        break;
      case 'sim':
        d.hardware.simType = d.simReason === 'esim' ? 'esim' : line.simType;
        this.store.go('sim');
        break;
    }
  }
}
