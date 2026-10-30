import { Component, computed, inject, signal } from '@angular/core';
import { CustomerApi } from '../api/customer.api';
import { formatEuro, formatMsisdn } from '../domain/format';
import { FLOW_LABELS, Line, SIM_REASONS } from '../domain/models';
import { OrderStore } from '../store/order.store';
import { CustomerBanner } from '../ui/customer-banner';
import { CORRECT_FIELDS, focusFirstError } from '../ui/field-error';
import { Page } from '../ui/page';
import { run } from '../ui/run';

/** Écrans 2b, 2c et 2d : choix de la ligne (et de la raison pour un changement de SIM). */
@Component({
  selector: 'app-ligne',
  imports: [Page, CustomerBanner],
  template: `
    @let d = store.draft;
    <app-page [title]="flowLabel()" [busy]="busy()" (primary)="next()" [hint]="hint()">
      <app-customer-banner [badge]="flowLabel()" />

      <h2 class="section-title">{{ isSim ? 'Ligne concernée' : 'Lignes du client' }}</h2>
      <div class="choices" role="radiogroup" aria-label="Ligne" [class.ko]="lineError()" aria-describedby="line-error">
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
      @if (lineError()) { <span class="msg ko group-error" id="line-error">{{ lineError() }}</span> }

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
        <div class="choices two" role="radiogroup" aria-label="Raison" [class.ko]="reasonError()" aria-describedby="reason-error">
          @for (r of reasons; track r.id) {
            <button type="button" class="choice" role="radio" [attr.aria-checked]="d.simReason === r.id" [class.on]="d.simReason === r.id" (click)="d.simReason = r.id">
              <span class="radio"></span>
              <span class="body" [style.font-weight]="d.simReason === r.id ? 700 : 400">{{ r.label }}</span>
              @if (r.fee) { <span class="badge soft">Frais : 10 € en caisse</span> }
            </button>
          }
        </div>
        @if (reasonError()) { <span class="msg ko group-error" id="reason-error">{{ reasonError() }}</span> }
      }
    </app-page>
  `,
})
export class LigneScreen {
  protected readonly store = inject(OrderStore);
  private readonly customers = inject(CustomerApi);

  protected readonly isSim = this.store.flow() === 'sim';
  protected readonly reasons = SIM_REASONS;
  protected readonly busy = signal(false);
  protected readonly blocked = signal<string | null>(null);
  protected readonly submitted = signal(false);
  protected readonly lines = computed(() => this.store.customer()?.lines ?? []);
  protected readonly flowLabel = computed(() => FLOW_LABELS[this.store.flow() ?? 'forfait']);

  protected readonly fmt = formatMsisdn;
  protected readonly euro = formatEuro;

  /** Rappel près du bouton, tant qu'il reste des choix en erreur. */
  protected hint(): string | null {
    return this.lineError() || this.reasonError() ? CORRECT_FIELDS : null;
  }

  protected lineError(): string | null {
    return this.submitted() && !this.store.selectedLine() ? 'Choisissez la ligne concernée.' : null;
  }

  protected reasonError(): string | null {
    return this.submitted() && this.isSim && !this.store.draft.simReason ? 'Choisissez la raison du changement.' : null;
  }

  protected isPending(line: Line): boolean {
    return this.store.pendingLines().includes(line.msisdn);
  }

  protected select(line: Line): void {
    this.store.draft.lineMsisdn = line.msisdn;
    this.blocked.set(null);
  }

  async next(): Promise<void> {
    const d = this.store.draft;
    const line = this.store.selectedLine();
    const customer = this.store.customer();
    this.submitted.set(true);
    if (!line || !customer || this.reasonError()) return focusFirstError();

    // Retour sur cette étape sans changer de ligne ni de raison : on garde les saisies suivantes.
    const key = this.isSim ? `${line.msisdn}|${d.simReason}` : line.msisdn;
    if (d.preparedFor === key) {
      this.store.go(this.isSim ? 'sim' : this.store.flow() === 'options' ? 'options' : 'forfait');
      return;
    }

    switch (this.store.flow()) {
      case 'forfait': {
        if (line.isCard) {
          const rescoring: { score?: string } = {};
          await run(this.busy, async () => {
            const score = await this.customers.rescoreCardLine(customer.id, line.msisdn);
            this.store.score.set(score);
            rescoring.score = score;
          });
          if (rescoring.score !== 'vert') {
            if (rescoring.score) this.blocked.set(rescoring.score);
            return;
          }
        }
        d.options = [...line.options];
        d.offerId = null;
        // Une ligne Card change d'offre pour un forfait : on ouvre sur une famille avec mensualité.
        const family = this.store.offer(line.offerId)?.family ?? 'bloque';
        d.family = family === 'prepaye' ? 'bloque' : family;
        d.openMl = { enabled: false, sponsor: '', valid: null };
        d.preparedFor = key;
        this.store.go('forfait');
        break;
      }
      case 'options':
        d.options = [...line.options];
        d.preparedFor = key;
        this.store.go('options');
        break;
      case 'sim':
        d.hardware.simType = d.simReason === 'esim' ? 'esim' : line.simType;
        d.preparedFor = key;
        this.store.go('sim');
        break;
    }
  }
}
