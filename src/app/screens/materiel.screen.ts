import { Component, inject, signal, viewChild } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HardwareApi } from '../api/hardware.api';
import { OrderApi } from '../api/order.api';
import { formatEuro } from '../domain/format';
import { CARD_SIM_PRICE, Terminal } from '../domain/models';
import { sepaErrors, terminalErrors } from '../domain/validation';
import { OrderStore } from '../store/order.store';
import { Page } from '../ui/page';
import { SimBlock } from '../ui/sim-block';
import { run } from '../ui/run';
import { CORRECT_FIELDS, FieldError, focusFirstError } from '../ui/field-error';

/** Écrans 4 et 4b : SIM, terminal (si-financier) et prélèvement SEPA (api IML). */
@Component({
  selector: 'app-materiel',
  imports: [FormsModule, Page, SimBlock, FieldError],
  template: `
    @let h = store.draft.hardware;
    @let sepa = store.draft.sepa;
    <app-page title="Matériel et paiement" [busy]="busy()" (primary)="next()" [hint]="hint()">
      <app-sim-block [showErrors]="submitted()" />

      @if (isCard()) {
        <div class="notice orange">
          <strong>Carte Prépayée :</strong> la puce SIM à {{ euro(cardSimPrice) }} est à régler en caisse.
          Aucun mode de paiement n'est saisi dans l'outil.
        </div>
      } @else {
        <div class="card">
          <h2>Terminal</h2>
          <div class="choices" role="radiogroup" aria-label="Terminal">
            <button type="button" class="choice" role="radio" [attr.aria-checked]="!h.withTerminal" [class.on]="!h.withTerminal" (click)="h.withTerminal = false">
              <span class="radio"></span><span class="body title">SIM seule</span>
            </button>
            <button type="button" class="choice" role="radio" [attr.aria-checked]="h.withTerminal" [class.on]="h.withTerminal" (click)="h.withTerminal = true">
              <span class="radio"></span><span class="body title">Ajouter un terminal</span>
            </button>
          </div>
          @if (h.withTerminal) {
            <div class="grid2" style="margin-top: 1rem">
              <div class="field">
                <label for="terminal">Terminal</label>
                <select id="terminal" [ngModel]="h.terminalId" (ngModelChange)="selectTerminal($event)"
                  [class.ko]="terr('terminalId')" [attr.aria-invalid]="!!terr('terminalId')" aria-describedby="terminal-error">
                  <option value="" disabled>Choisir un terminal</option>
                  @for (t of terminals(); track t.id) { <option [value]="t.id">{{ t.label }} · {{ euro(t.price) }}</option> }
                </select>
                <app-field-error for="terminal" [message]="terr('terminalId')" />
              </div>
              <div class="field">
                <label for="imei">IMEI</label>
                <input id="imei" inputmode="numeric" autocomplete="off" [(ngModel)]="h.imei"
                  [class.ko]="terr('imei')" [attr.aria-invalid]="!!terr('imei')" aria-describedby="imei-error" />
                <app-field-error for="imei" [message]="terr('imei')" />
              </div>
            </div>
            <p class="small muted">Le terminal est géré par l'enabler si-financier et réglé en caisse.</p>
          }
        </div>

        <div class="card">
          <h2>Paiement</h2>
          <div class="seg" style="margin-bottom: 1rem"><button type="button" class="on">Prélèvement SEPA</button></div>
          <div class="field">
            <label for="holder">Titulaire du compte</label>
            <input id="holder" [(ngModel)]="sepa.holder" (ngModelChange)="sepa.mandateRef = null"
              [class.ko]="serr('holder')" [attr.aria-invalid]="!!serr('holder')" aria-describedby="holder-error" />
            <app-field-error for="holder" [message]="serr('holder')" />
          </div>
          <div class="field">
            <label for="iban">IBAN</label>
            <input id="iban" autocomplete="off" placeholder="FR76 …" [(ngModel)]="sepa.iban" (ngModelChange)="sepa.mandateRef = null"
              [class.ok]="!!sepa.mandateRef" [class.ko]="serr('iban')" [attr.aria-invalid]="!!serr('iban')" aria-describedby="iban-error" />
            @if (sepa.mandateRef) { <span class="msg ok">Mandat contrôlé et stocké (api IML) · RUM {{ sepa.mandateRef }}</span> }
            @else { <app-field-error for="iban" [message]="serr('iban')" /> }
          </div>
          <p class="small muted">Le mandat SEPA est signé hors de l'outil. Aucun paiement par carte bancaire dans l'outil.</p>
        </div>
      }
    </app-page>
  `,
})
export class MaterielScreen {
  protected readonly store = inject(OrderStore);
  private readonly hardware = inject(HardwareApi);
  private readonly orders = inject(OrderApi);
  private readonly simBlock = viewChild.required(SimBlock);

  protected readonly terminals = signal<Terminal[]>([]);
  protected readonly busy = signal(false);
  protected readonly submitted = signal(false);
  protected readonly cardSimPrice = CARD_SIM_PRICE;
  protected readonly euro = formatEuro;

  constructor() {
    const sepa = this.store.draft.sepa;
    if (!sepa.holder) {
      const i = this.store.draft.identity;
      sepa.holder = `${i.prenom} ${i.nom}`.trim();
    }
    void run(null, async () => this.terminals.set(await this.hardware.terminals()));
  }

  protected isCard(): boolean {
    return this.store.selectedOffer()?.family === 'prepaye';
  }

  protected selectTerminal(id: string): void {
    const h = this.store.draft.hardware;
    h.terminalId = id;
    h.terminalPrice = this.terminals().find((t) => t.id === id)?.price ?? 0;
  }

  protected terr(field: 'terminalId' | 'imei'): string | null {
    return this.submitted() ? (terminalErrors(this.store.draft.hardware)[field] ?? null) : null;
  }

  protected serr(field: 'holder' | 'iban'): string | null {
    const sepa = this.store.draft.sepa;
    return this.submitted() ? (sepaErrors(sepa.holder, sepa.iban)[field] ?? null) : null;
  }

  private invalid(): boolean {
    if (this.simBlock().error()) return true;
    if (this.isCard()) return false;
    const h = this.store.draft.hardware;
    const sepa = this.store.draft.sepa;
    return Object.keys(terminalErrors(h)).length > 0 || Object.keys(sepaErrors(sepa.holder, sepa.iban)).length > 0;
  }

  /** Rappel près du bouton, tant qu'il reste des champs en erreur. */
  protected hint(): string | null {
    return this.submitted() && this.invalid() ? CORRECT_FIELDS : null;
  }

  async next(): Promise<void> {
    this.submitted.set(true);
    await run(this.busy, async () => {
      const simOk = await this.simBlock().check();
      const h = this.store.draft.hardware;
      const sepa = this.store.draft.sepa;
      if (!simOk || this.invalid()) return focusFirstError();
      if (this.isCard()) {
        h.withTerminal = false;
        sepa.mandateRef = null;
      } else if (!sepa.mandateRef) {
        sepa.mandateRef = await this.orders.storeMandate(sepa.holder, sepa.iban);
      }
      this.store.go('confirmation');
    });
  }
}
