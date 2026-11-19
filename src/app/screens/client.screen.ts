import { Component, inject, signal } from '@angular/core';
import { customerDataChanged } from '../domain/rules';
import { CustomerApi } from '../api/customer.api';
import { OrderStore } from '../store/order.store';
import { AddressForm, hasAddress } from '../ui/address-form';
import { IdentityForm, identityComplete } from '../ui/identity-form';
import { CORRECT_FIELDS, focusFirstError } from '../ui/field-error';
import { Page } from '../ui/page';
import { run } from '../ui/run';

/** Écran 2 : titulaire et adresse de facturation (acquisition). */
@Component({
  selector: 'app-client',
  imports: [Page, IdentityForm, AddressForm],
  template: `
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
        <app-address-form [address]="store.draft.address" [showErrors]="submitted()" />
      </div>
    </app-page>
  `,
})
export class ClientScreen {
  protected readonly store = inject(OrderStore);
  private readonly customers = inject(CustomerApi);

  protected readonly busy = signal(false);
  protected readonly submitted = signal(false);
  protected readonly rescored = signal(false);

  private invalid(): boolean {
    const d = this.store.draft;
    return !identityComplete(d.identity, true) || !hasAddress(d.address);
  }

  /** Rappel près du bouton, tant qu'il reste des champs en erreur. */
  protected hint(): string | null {
    return this.submitted() && this.invalid() ? CORRECT_FIELDS : null;
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
