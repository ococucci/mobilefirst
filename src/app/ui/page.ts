import { Component, input, output } from '@angular/core';
import { Recap } from './recap';

/** Gabarit d'écran : contenu à gauche, récapitulatif et action principale à droite. */
@Component({
  selector: 'app-page',
  imports: [Recap],
  template: `
    <div class="page">
      <section class="content">
        <h1>{{ title() }}</h1>
        <ng-content />
      </section>
      <aside class="recap-panel" aria-label="Récapitulatif">
        <app-recap />
        @if (hint()) {
          <p class="hint">{{ hint() }}</p>
        }
        <button type="button" class="btn primary" [disabled]="disabled() || busy()" (click)="primary.emit()">
          @if (busy()) { <span class="spinner" aria-hidden="true"></span> }
          {{ primaryLabel() }}
        </button>
      </aside>
    </div>
  `,
})
export class Page {
  readonly title = input.required<string>();
  readonly primaryLabel = input('Continuer');
  readonly disabled = input(false);
  readonly busy = input(false);
  readonly hint = input<string | null>(null);
  readonly primary = output<void>();
}
