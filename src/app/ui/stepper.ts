import { Component, computed, inject } from '@angular/core';
import { OrderStore } from '../store/order.store';

/** Étapes du parcours. Les étapes déjà franchies sont cliquables pour y revenir. */
@Component({
  selector: 'app-stepper',
  template: `
    <nav class="stepper" aria-label="Étapes du parcours">
      <div class="compact">
        @if (current() > 0) {
          <button type="button" class="btn link back" (click)="store.goToStep(current() - 1)">‹ {{ store.steps()[current() - 1].label }}</button>
        }
        <span>Étape {{ current() + 1 }}/{{ store.steps().length }} · <strong>{{ store.steps()[current()].label }}</strong></span>
      </div>
      <div class="bar"><span [style.width.%]="((current() + 1) / store.steps().length) * 100"></span></div>
      <ol>
        @for (step of store.steps(); track step.label; let i = $index) {
          <li [class.done]="i < current()" [class.current]="i === current()" [attr.aria-current]="i === current() ? 'step' : null">
            @if (i < current()) {
              <button type="button" class="step-link" (click)="store.goToStep(i)" [attr.aria-label]="'Revenir à l\\'étape ' + step.label">
                <span class="dot">✓</span>{{ step.label }}
              </button>
            } @else {
              <span class="dot">{{ i + 1 }}</span>{{ step.label }}
            }
          </li>
        }
      </ol>
    </nav>
  `,
})
export class Stepper {
  protected readonly store = inject(OrderStore);

  protected readonly current = computed(() => {
    const screen = this.store.screen();
    if (screen === 'demande') return 1;
    const index = this.store.steps().findIndex((s) => s.screens.includes(screen));
    return Math.max(0, index);
  });
}
