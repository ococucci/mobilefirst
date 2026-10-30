import { Component, inject, signal } from '@angular/core';
import { CustomerApi } from '../api/customer.api';
import { Flow } from '../domain/models';
import { firstScreenOf } from '../domain/rules';
import { OrderStore } from '../store/order.store';
import { CustomerBanner } from '../ui/customer-banner';
import { Page } from '../ui/page';
import { run } from '../ui/run';

interface Request {
  flow: Flow;
  title: string;
  path: string;
}

/** Écran 1g : choix de la demande. */
@Component({
  selector: 'app-demande',
  imports: [Page, CustomerBanner],
  template: `
    <app-page title="Que souhaite faire le client ?" [disabled]="!store.flowChoice()" [busy]="busy()" (primary)="next()">
      <app-customer-banner [badge]="store.customerStatus() === 'connu' ? 'Client connu' : 'Client identifié'" />
      <div class="choices two" role="radiogroup" aria-label="Demande">
        @for (r of requests; track r.flow) {
          @let reason = disabledReason(r.flow);
          <button type="button" class="choice top" role="radio" [attr.aria-checked]="store.flowChoice() === r.flow"
            [class.on]="store.flowChoice() === r.flow" [disabled]="!!reason" (click)="store.flowChoice.set(r.flow)">
            <span class="radio"></span>
            <span class="body">
              <span class="title" style="display: block">{{ r.title }}</span>
              <span class="sub">{{ reason || r.path }}</span>
            </span>
          </button>
        }
      </div>
      <div class="notice info" style="margin-top: 1rem">
        Une ligne avec une <strong>commande en cours</strong> ne peut pas être modifiée. Le client en base n'est pas
        re-scoré : le score déjà en base s'applique.
      </div>
      <p><button type="button" class="btn link" (click)="store.reset()">Changer de client</button></p>
    </app-page>
  `,
})
export class DemandeScreen {
  protected readonly store = inject(OrderStore);
  private readonly customers = inject(CustomerApi);
  protected readonly busy = signal(false);

  protected readonly requests: Request[] = [
    { flow: 'acquisition', title: 'Acquérir une nouvelle ligne mobile', path: 'Client › Forfait › Matériel et paiement › Confirmation' },
    { flow: 'forfait', title: "Changer le forfait d'une ligne existante", path: 'Ligne › Forfait › Confirmation' },
    { flow: 'options', title: "Modifier les options d'une ligne existante", path: 'Ligne › Options › Confirmation' },
    { flow: 'sim', title: "Changer la SIM d'une ligne existante", path: 'Ligne › Raison › Carte SIM › Confirmation' },
  ];

  constructor() {
    const choice = this.store.flowChoice();
    if (choice && this.disabledReason(choice)) this.store.flowChoice.set(null);
  }

  protected disabledReason(flow: Flow): string | null {
    const customer = this.store.customer();
    if (flow === 'acquisition') {
      return customer?.type === 'PRO' ? "Non ouvert aux clients entreprises : actes de gestion uniquement" : null;
    }
    return customer?.lines.length ? null : "Le client n'a pas de ligne mobile";
  }

  async next(): Promise<void> {
    const flow = this.store.flowChoice();
    if (!flow) return;
    await run(this.busy, async () => {
      const customer = this.store.customer();
      if (flow !== 'acquisition' && customer) {
        this.store.pendingLines.set(await this.customers.pendingLines(customer.id));
      }
      this.store.chooseFlow(flow);
      this.store.go(firstScreenOf(flow));
    });
  }
}
