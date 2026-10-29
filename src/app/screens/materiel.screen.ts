import { Component, inject, signal, viewChild } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ImlApi } from '../api/iml.api';
import { SiFinancierApi } from '../api/si-financier.api';
import { formatEuro } from '../domain/format';
import { CARD_SIM_PRICE, Terminal } from '../domain/models';
import { isValidIban, isValidImei } from '../domain/rules';
import { OrderStore } from '../store/order.store';
import { Page } from '../ui/page';
import { SimBlock } from '../ui/sim-block';

/** Écrans 4 et 4b : SIM, terminal (si-financier) et prélèvement SEPA (api IML). */
@Component({
  selector: 'app-materiel',
  imports: [FormsModule, Page, SimBlock],
  template: `
    @let h = store.draft.hardware;
    @let sepa = store.draft.sepa;
    <app-page title="Matériel et paiement" [busy]="busy()" (primary)="next()" [hint]="error()">
      <app-sim-block />

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
                <select id="terminal" [ngModel]="h.terminalId" (ngModelChange)="selectTerminal($event)" [class.ko]="submitted() && !h.terminalId">
                  <option value="" disabled>Choisir un terminal</option>
                  @for (t of terminals(); track t.id) { <option [value]="t.id">{{ t.label }} · {{ euro(t.price) }}</option> }
                </select>
              </div>
              <div class="field">
                <label for="imei">IMEI</label>
                <input id="imei" inputmode="numeric" autocomplete="off" [(ngModel)]="h.imei" [class.ko]="submitted() && !imeiOk()" />
                @if (submitted() && !imeiOk()) { <span class="msg ko">IMEI invalide (15 chiffres)</span> }
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
            <input id="holder" [(ngModel)]="sepa.holder" (ngModelChange)="sepa.mandateRef = null" [class.ko]="submitted() && !sepa.holder.trim()" />
          </div>
          <div class="field">
            <label for="iban">IBAN</label>
            <input id="iban" autocomplete="off" placeholder="FR76 …" [(ngModel)]="sepa.iban" (ngModelChange)="sepa.mandateRef = null"
              [class.ok]="!!sepa.mandateRef" [class.ko]="submitted() && !ibanOk()" />
            @if (sepa.mandateRef) { <span class="msg ok">Mandat contrôlé et stocké (api IML) · RUM {{ sepa.mandateRef }}</span> }
            @else if (submitted() && !ibanOk()) { <span class="msg ko">IBAN invalide</span> }
          </div>
          <p class="small muted">Le mandat SEPA est signé hors de l'outil. Aucun paiement par carte bancaire dans l'outil.</p>
        </div>
      }
    </app-page>
  `,
})
export class MaterielScreen {
  protected readonly store = inject(OrderStore);
  private readonly siFinancier = inject(SiFinancierApi);
  private readonly iml = inject(ImlApi);
  private readonly simBlock = viewChild.required(SimBlock);

  protected readonly terminals = signal<Terminal[]>([]);
  protected readonly busy = signal(false);
  protected readonly submitted = signal(false);
  protected readonly error = signal<string | null>(null);
  protected readonly cardSimPrice = CARD_SIM_PRICE;
  protected readonly euro = formatEuro;

  constructor() {
    const sepa = this.store.draft.sepa;
    if (!sepa.holder) {
      const i = this.store.draft.identity;
      sepa.holder = `${i.prenom} ${i.nom}`.trim();
    }
    void this.siFinancier.terminals().then((t) => this.terminals.set(t));
  }

  protected isCard(): boolean {
    return this.store.selectedOffer()?.family === 'prepaye';
  }

  protected selectTerminal(id: string): void {
    const h = this.store.draft.hardware;
    h.terminalId = id;
    h.terminalPrice = this.terminals().find((t) => t.id === id)?.price ?? 0;
  }

  protected imeiOk(): boolean {
    return isValidImei(this.store.draft.hardware.imei);
  }

  protected ibanOk(): boolean {
    return isValidIban(this.store.draft.sepa.iban);
  }

  async next(): Promise<void> {
    this.submitted.set(true);
    this.error.set(null);
    this.busy.set(true);
    const simOk = await this.simBlock().check();
    const h = this.store.draft.hardware;
    const sepa = this.store.draft.sepa;
    let error: string | null = simOk ? null : 'Saisissez ou scannez un ICCID valide.';
    if (!error && !this.isCard()) {
      if (h.withTerminal && (!h.terminalId || !this.imeiOk())) error = 'Terminal : choisissez le modèle et saisissez un IMEI valide.';
      else if (!sepa.holder.trim() || !this.ibanOk()) error = 'Paiement : titulaire et IBAN valides obligatoires.';
      else if (!sepa.mandateRef) sepa.mandateRef = await this.iml.storeMandate(sepa.holder, sepa.iban);
    }
    if (this.isCard()) {
      h.withTerminal = false;
      sepa.mandateRef = null;
    }
    this.busy.set(false);
    this.error.set(error);
    if (!error) this.store.go('confirmation');
  }
}
