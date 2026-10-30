import { Component, inject, input, signal } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpErrorResponse } from '@angular/common/http';
import { HardwareApi, IccidCheck } from '../api/hardware.api';
import { formatIccid } from '../domain/format';
import { OrderStore } from '../store/order.store';
import { FieldError } from './field-error';
import { run } from './run';

/** Bloc Carte SIM : type de SIM et N° ICCID contrôlé par l'enabler si-financier. */
@Component({
  selector: 'app-sim-block',
  imports: [FormsModule, FieldError],
  template: `
    @let h = store.draft.hardware;
    <div class="card">
      <h2>Carte SIM</h2>
      <div class="seg" style="margin-bottom: 1rem" role="radiogroup" aria-label="Type de SIM">
        <button type="button" role="radio" [attr.aria-checked]="h.simType === 'physique'" [class.on]="h.simType === 'physique'" (click)="h.simType = 'physique'">SIM physique</button>
        <button type="button" role="radio" [attr.aria-checked]="h.simType === 'esim'" [class.on]="h.simType === 'esim'" (click)="h.simType = 'esim'">eSIM</button>
      </div>
      <div class="field">
        <label for="iccid">N° ICCID</label>
        <div class="inline">
          <input id="iccid" class="grow" inputmode="numeric" autocomplete="off" placeholder="8933 0000 0000 0000 000"
            [ngModel]="h.iccid" (ngModelChange)="onInput($event)" (blur)="check()"
            [class.ok]="state() === 'ok'" [class.ko]="error()" [attr.aria-invalid]="!!error()" aria-describedby="iccid-error" />
          <button type="button" class="btn icon" (click)="scan()" [disabled]="scanning()" aria-label="Scanner le code-barres de la SIM" title="Scanner le code-barres">
            @if (scanning()) { <span class="spinner"></span> } @else {
              <svg width="22" height="22" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" aria-hidden="true"><path d="M3 7V4h3M18 4h3v3M21 17v3h-3M6 20H3v-3M8 8v8M11 8v8M14 8v8M17 8v8"/></svg>
            }
          </button>
        </div>
        @if (error(); as e) {
          <app-field-error for="iccid" [message]="e" />
        } @else {
          @switch (state()) {
            @case ('ok') { <span class="msg ok">SIM reconnue dans le stock boutique</span> }
            @case ('checking') { <span class="msg">Contrôle en cours…</span> }
            @default { <span class="msg">La SIM est obligatoire pour cette commande.</span> }
          }
        }
      </div>
    </div>
  `,
})
export class SimBlock {
  protected readonly store = inject(OrderStore);
  private readonly hardware = inject(HardwareApi);
  protected readonly state = signal<IccidCheck | 'checking' | null>(this.store.draft.hardware.iccidValid ? 'ok' : null);
  protected readonly scanning = signal(false);
  /** Affiche l'erreur « obligatoire » après une tentative de validation. */
  readonly showErrors = input(false);

  error(): string | null {
    switch (this.state()) {
      case 'format':
        return 'ICCID invalide : 19 ou 20 chiffres commençant par 89.';
      case 'inconnu':
        return 'ICCID inconnu du stock boutique (si-financier).';
      case null:
        return this.showErrors() && !this.store.draft.hardware.iccid.trim()
          ? "La SIM est obligatoire : saisissez ou scannez l'ICCID."
          : null;
      default:
        return null;
    }
  }

  protected onInput(value: string): void {
    this.store.draft.hardware.iccid = value;
    this.store.draft.hardware.iccidValid = false;
    this.state.set(null);
  }

  protected async scan(): Promise<void> {
    await run(this.scanning, async () => {
      this.store.draft.hardware.iccid = formatIccid(await this.hardware.scanSim());
    });
    await this.check();
  }

  /** Contrôle l'ICCID ; renvoie true s'il est valide. */
  async check(): Promise<boolean> {
    const h = this.store.draft.hardware;
    if (h.iccidValid) return true;
    if (!h.iccid.trim()) {
      this.state.set(null);
      return false;
    }
    this.state.set('checking');
    let result: IccidCheck;
    try {
      result = await this.hardware.checkIccid(h.iccid);
    } catch (e) {
      // Erreur déjà affichée en bandeau : l'ICCID reste à contrôler.
      this.state.set(null);
      if (e instanceof HttpErrorResponse) return false;
      throw e;
    }
    h.iccidValid = result === 'ok';
    if (h.iccidValid) h.iccid = formatIccid(h.iccid);
    this.state.set(result);
    return h.iccidValid;
  }
}
