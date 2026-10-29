import { Component, inject, signal } from '@angular/core';
import { formatEuro, formatMsisdn } from '../domain/format';
import { OrderStore } from '../store/order.store';
import { CustomerBanner } from '../ui/customer-banner';
import { Page } from '../ui/page';

/** Écran 3d : ajout ou retrait d'options sur une ligne existante. */
@Component({
  selector: 'app-options',
  imports: [Page, CustomerBanner],
  template: `
    @let d = store.draft;
    @let line = store.selectedLine();
    <app-page title="Changement d'option" (primary)="next()" [hint]="error()">
      @if (line) {
        <app-customer-banner badge="Changement d'option" [title]="'Ligne ' + fmt(line.msisdn)"
          [subtitle]="store.holderName() + ' · Offre actuelle : ' + line.offerLabel" />
      }
      <div class="card">
        <h2>Options mobile</h2>
        <p class="muted small">Cochez pour ajouter, décochez pour retirer. Les options actives sont cochées.</p>
        @for (o of store.catalogOptions(); track o.id) {
          @let active = line?.options?.includes(o.id);
          @let checked = d.options.includes(o.id);
          <label class="check">
            <span class="body">{{ o.label }}</span>
            @if (active && checked) { <span class="badge green">Active</span> }
            @else if (!active && checked) { <span class="badge orange">À ajouter</span> }
            @else if (active && !checked) { <span class="badge soft">À retirer</span> }
            <span class="price">+{{ euro(o.price) }}/mois</span>
            <input type="checkbox" [checked]="checked" (change)="toggle(o.id)" />
          </label>
        }
      </div>
    </app-page>
  `,
})
export class OptionsScreen {
  protected readonly store = inject(OrderStore);
  protected readonly error = signal<string | null>(null);
  protected readonly fmt = formatMsisdn;
  protected readonly euro = formatEuro;

  protected toggle(id: string): void {
    const d = this.store.draft;
    d.options = d.options.includes(id) ? d.options.filter((o) => o !== id) : [...d.options, id];
    this.error.set(null);
  }

  next(): void {
    const diff = this.store.optionsChange();
    if (!diff.added.length && !diff.removed.length) {
      this.error.set('Aucune option ajoutée ni retirée.');
      return;
    }
    this.store.go('confirmation');
  }
}
