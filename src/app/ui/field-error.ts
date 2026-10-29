import { Component, input } from '@angular/core';

/** Message d'erreur affiché en rouge sous un champ. */
@Component({
  selector: 'app-field-error',
  template: `@if (message()) { <span class="msg ko" [id]="for() + '-error'">{{ message() }}</span> }`,
  host: { style: 'display: contents' },
})
export class FieldError {
  /** Id du champ concerné (le message reçoit l'id « <for>-error »). */
  readonly for = input.required<string>();
  readonly message = input<string | null | undefined>(null);
}

/** Rappel affiché près du bouton quand des champs sont en erreur. */
export const CORRECT_FIELDS = 'Corrigez les champs en rouge pour continuer.';

/** Amène le premier champ en erreur à l'écran et lui donne le focus. */
export function focusFirstError(): void {
  setTimeout(() => {
    const el = document.querySelector<HTMLElement>('[aria-invalid="true"], .choices.ko .choice:not([disabled])');
    if (!el) return;
    el.scrollIntoView({ block: 'center', behavior: 'smooth' });
    el.focus({ preventScroll: true });
  });
}
