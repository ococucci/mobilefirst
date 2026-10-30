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
        @for (o of store.optionsOffer()?.options ?? []; track o.id) {
          @let active = o.included || line?.options?.includes(o.id);
          @let checked = o.included || d.options.includes(o.id);
          <label class="check" [class.disabled]="o.included">
            <span class="body">{{ o.label }}</span>
            @if (o.included) { <span class="badge green">Incluse</span> }
            @else if (active && checked) { <span class="badge green">Active</span> }
            @else if (!active && checked) { <span class="badge orange">À ajouter</span> }
            @else if (active && !checked) { <span class="badge soft">À retirer</span> }
            @if (!o.included) { <span class="price">+{{ euro(o.price) }}/mois</span> }
            <input type="checkbox" [disabled]="o.included" [checked]="checked" (change)="setOption(o.id, $any($event.target).checked)" />
          </label>
        } @empty {
          <p class="muted">Aucune option n'est proposée avec l'offre actuelle de cette ligne.</p>
        }
        @if (error()) { <span class="msg ko group-error" role="alert">{{ error() }}</span> }
      </div>
    </app-page>
  `,
})
export class OptionsScreen {
  protected readonly store = inject(OrderStore);
  protected readonly error = signal<string | null>(null);
  protected readonly fmt = formatMsisdn;
  protected readonly euro = formatEuro;

  protected setOption(id: string, checked: boolean): void {
    const d = this.store.draft;
    d.options = checked ? [...new Set([...d.options, id])] : d.options.filter((o) => o !== id);
    this.error.set(null);
  }

  next(): void {
    const diff = this.store.optionsChange();
    if (!diff.added.length && !diff.removed.length) {
      this.error.set('Ajoutez ou retirez au moins une option.');
      return;
    }
    this.store.go('confirmation');
  }
}
