import { Component, inject, signal, viewChild } from '@angular/core';
import { formatEuro, formatMsisdn } from '../domain/format';
import { SIM_REASONS } from '../domain/models';
import { OrderStore } from '../store/order.store';
import { CustomerBanner } from '../ui/customer-banner';
import { Page } from '../ui/page';
import { SimBlock } from '../ui/sim-block';

/** Écran 3e : saisie de la nouvelle carte SIM. */
@Component({
  selector: 'app-sim',
  imports: [Page, CustomerBanner, SimBlock],
  template: `
    @let line = store.selectedLine();
    <app-page title="Changement de SIM" [busy]="busy()" (primary)="next()" [hint]="error()">
      @if (line) {
        <app-customer-banner badge="Changement de SIM" [title]="'Ligne ' + fmt(line.msisdn)"
          [subtitle]="store.holderName() + ' · Raison : ' + reasonLabel()" />
      }
      <app-sim-block />
      @if (store.cashDue()) {
        <div class="notice orange">
          <strong>Frais de remplacement : {{ euro(store.cashDue()) }}</strong> (perte ou vol), à régler directement en caisse.
        </div>
      }
    </app-page>
  `,
})
export class SimScreen {
  protected readonly store = inject(OrderStore);
  private readonly simBlock = viewChild.required(SimBlock);
  protected readonly busy = signal(false);
  protected readonly error = signal<string | null>(null);
  protected readonly fmt = formatMsisdn;
  protected readonly euro = formatEuro;

  protected reasonLabel(): string {
    return SIM_REASONS.find((r) => r.id === this.store.draft.simReason)?.label ?? '';
  }

  async next(): Promise<void> {
    this.busy.set(true);
    const ok = await this.simBlock().check();
    this.busy.set(false);
    this.error.set(ok ? null : 'Saisissez ou scannez un ICCID valide.');
    if (ok) this.store.go('confirmation');
  }
}
