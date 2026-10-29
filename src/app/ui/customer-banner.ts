import { Component, inject, input } from '@angular/core';
import { OrderStore } from '../store/order.store';

/** Rappel du client identifié en tête des écrans de demande. */
@Component({
  selector: 'app-customer-banner',
  template: `
    @if (store.customer(); as c) {
      <div class="card ident">
        <span class="ok-dot" aria-hidden="true">✓</span>
        <div class="body">
          <div class="name">{{ title() || store.holderName() }}</div>
          <div class="sub">
            @if (subtitle()) {
              {{ subtitle() }}
            } @else {
              Client {{ store.customerStatus() === 'connu' ? 'connu' : 'identifié' }}
              @if (c.company) { · SIREN {{ c.company.siren }} } @else { · {{ c.identity.pieceType }} {{ c.identity.pieceNumero }} }
            }
          </div>
        </div>
        <span class="badge green">{{ badge() }}</span>
      </div>
    }
  `,
})
export class CustomerBanner {
  protected readonly store = inject(OrderStore);
  readonly badge = input.required<string>();
  readonly title = input<string>('');
  readonly subtitle = input<string>('');
}
