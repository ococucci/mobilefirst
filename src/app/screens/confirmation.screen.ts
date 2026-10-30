import { Component, computed, inject, signal } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { OrderApi, OrderRequest } from '../api/order.api';
import { formatDate, formatEuro, formatMsisdn, maskIban } from '../domain/format';
import { FLOW_LABELS, Screen, SIM_REASONS } from '../domain/models';
import { requiresContract } from '../domain/rules';
import { OrderStore } from '../store/order.store';
import { Page } from '../ui/page';
import { run } from '../ui/run';

interface SummaryCard {
  k: string;
  v: string;
  s?: string;
  edit?: Screen;
}

/** Écrans 5, 4c, 4d et 4e : vérification de la commande, contrat et validation. */
@Component({
  selector: 'app-confirmation',
  imports: [FormsModule, Page],
  template: `
    @let c = store.draft.confirm;
    <app-page title="Vérifiez la commande" primaryLabel="Valider la commande" [disabled]="!canValidate()" [busy]="busy()"
      [hint]="hint()" (primary)="validate()">
      <div class="summary">
        @for (card of cards(); track card.k) {
          <div class="card">
            <div>
              <div class="k">{{ card.k }}</div>
              <div class="v">{{ card.v }}</div>
              @if (card.s) { <div class="s">{{ card.s }}</div> }
            </div>
            @if (card.edit) { <button type="button" class="btn link" (click)="store.go(card.edit)">Modifier</button> }
          </div>
        }
      </div>

      @if (withContract) {
        <div class="card" style="display: flex; gap: 1rem; align-items: center; justify-content: space-between; flex-wrap: wrap">
          <div>
            <h3 style="margin: 0">Contrat</h3>
            <span class="muted">Relisez le contrat avec le client avant de valider.</span>
            @if (c.contractRef) { <div class="small muted">Document stocké · {{ c.contractRef }}</div> }
          </div>
          <button type="button" class="btn" (click)="download()" [disabled]="generating()">
            @if (generating()) { <span class="spinner"></span> } @else { <span aria-hidden="true">⤓</span> }
            Télécharger le contrat (PDF)
          </button>
        </div>
      } @else {
        <div class="notice info">Aucun contrat n'est généré pour une modification d'options : acceptez les CGV et validez directement.</div>
      }

      <div class="card">
        @if (withContract) {
          <label class="check"><input type="checkbox" [(ngModel)]="c.signed" /><strong class="body">Le client a signé le contrat</strong></label>
        }
        <label class="check"><input type="checkbox" [(ngModel)]="c.cgv" /><span class="body">J'accepte les conditions générales de vente</span></label>
        <label class="check"><input type="checkbox" [(ngModel)]="c.rgpd" /><span class="body">J'ai pris connaissance de la politique de données personnelles</span></label>
      </div>
    </app-page>
  `,
})
export class ConfirmationScreen {
  protected readonly store = inject(OrderStore);
  private readonly orders = inject(OrderApi);

  private readonly flow = this.store.flow() ?? 'acquisition';
  protected readonly withContract = requiresContract(this.flow);
  protected readonly busy = signal(false);
  protected readonly generating = signal(false);
  protected readonly cards = computed(() => this.buildCards());

  protected canValidate(): boolean {
    const c = this.store.draft.confirm;
    return (!this.withContract || c.signed) && c.cgv && c.rgpd;
  }

  protected hint(): string | null {
    const c = this.store.draft.confirm;
    if (this.withContract && !c.signed) return 'Cochez « Le client a signé le contrat » pour valider.';
    if (!c.cgv || !c.rgpd) return 'Acceptez les CGV et la politique de données personnelles.';
    return null;
  }

  private buildCards(): SummaryCard[] {
    const s = this.store;
    const d = s.draft;
    const i = d.identity;
    const line = s.selectedLine();
    const cards: SummaryCard[] = [];
    const offerCard = (): SummaryCard => {
      const offer = s.selectedOffer();
      const b = s.breakdown();
      const opts = d.options.length ? ` + ${d.options.length} option${d.options.length > 1 ? 's' : ''}` : '';
      const extras = [
        ...(offer?.promos.map((p) => `Remise ${p.label}`) ?? []),
        b?.openMl ? `Remise Open ML −${formatEuro(b.openMl)}` : '',
        b ? `${formatEuro(b.total)}/mois` : '',
      ].filter(Boolean);
      return { k: this.flow === 'forfait' ? 'Nouvelle offre' : 'Forfait', v: (offer?.label ?? '') + opts, s: extras.join(' · '), edit: 'forfait' };
    };

    if (this.flow === 'acquisition') {
      cards.push({ k: 'Titulaire', v: s.holderName(), s: `Né(e) le ${formatDate(i.dateNaissance)} · ${i.pieceType} ${i.pieceNumero}`, edit: 'client' });
      cards.push({ k: 'Adresse de facturation', v: d.address.ligne, s: `${d.address.codePostal} ${d.address.commune}`, edit: 'client' });
      const n = d.number;
      cards.push({
        k: "Numéro d'appel",
        v: formatMsisdn(s.orderMsisdn()),
        s: n.mode === 'portabilite' ? `Portabilité depuis ${n.operator} le ${formatDate(n.portingDate)}` : 'Nouveau numéro',
        edit: 'forfait',
      });
      cards.push(offerCard());
      const h = d.hardware;
      const card = s.selectedOffer()?.family === 'prepaye';
      cards.push({
        k: 'Matériel et paiement',
        v: `${h.simType === 'esim' ? 'eSIM' : 'SIM physique'} · ${card ? 'Puce à régler en caisse' : 'SEPA'}`,
        s: card ? `ICCID ${h.iccid}` : `IBAN ${maskIban(d.sepa.iban)}${h.withTerminal ? ' · terminal en caisse' : ''}`,
        edit: 'materiel',
      });
      return cards;
    }

    cards.push({ k: 'Ligne', v: formatMsisdn(line?.msisdn ?? ''), s: `${s.holderName()} · ${FLOW_LABELS[this.flow]}`, edit: 'ligne' });
    cards.push({ k: 'Offre actuelle', v: line?.offerLabel ?? '', s: line?.monthlyPrice != null ? `${formatEuro(line.monthlyPrice)}/mois` : 'Sans mensualité' });
    if (this.flow === 'forfait') cards.push(offerCard());
    if (this.flow === 'options') {
      const diff = s.optionsChange();
      const names = (ids: string[]) => ids.map((id) => s.option(id)?.label ?? id).join(', ') || '—';
      cards.push({ k: 'Options ajoutées', v: names(diff.added), edit: 'options' });
      cards.push({ k: 'Options retirées', v: names(diff.removed), s: `Variation ${diff.delta >= 0 ? '+' : '−'}${formatEuro(Math.abs(diff.delta))}/mois`, edit: 'options' });
    }
    if (this.flow === 'sim') {
      cards.push({ k: 'Raison', v: SIM_REASONS.find((r) => r.id === d.simReason)?.label ?? '', edit: 'ligne' });
      cards.push({
        k: 'Nouvelle SIM',
        v: d.hardware.simType === 'esim' ? 'eSIM' : 'SIM physique',
        s: `ICCID ${d.hardware.iccid}${s.cashDue() ? ` · Frais ${formatEuro(s.cashDue())} à régler en caisse` : ''}`,
        edit: 'sim',
      });
    }
    return cards;
  }

  /** Le serveur contrôle la commande, génère le contrat (api EPC) et le stocke (Api-document). */
  private async ensureContract(): Promise<string> {
    const c = this.store.draft.confirm;
    c.contractRef ??= await this.orders.generateContract(this.request());
    return c.contractRef;
  }

  async download(): Promise<void> {
    await run(this.generating, async () => {
      const pdf = await this.orders.downloadContract(await this.ensureContract());
      const url = URL.createObjectURL(pdf);
      const a = document.createElement('a');
      a.href = url;
      a.download = `contrat-${this.store.customer()?.id ?? 'client'}.pdf`;
      a.click();
      setTimeout(() => URL.revokeObjectURL(url), 1000);
    });
  }

  async validate(): Promise<void> {
    if (!this.canValidate()) return;
    const s = this.store;
    await run(this.busy, async () => {
      if (this.withContract) await this.ensureContract();
      // Le montant à régler en caisse est celui recalculé par le serveur.
      const { orderNumber, createdAt, cashDue } = await this.orders.create(this.request());
      s.result.set({ orderNumber, createdAt: new Date(createdAt), cashDue });
      s.go('succes');
    });
  }

  /** Commande au format de l'API (même corps pour le contrat et pour la validation). */
  private request(): OrderRequest {
    const s = this.store;
    const d = s.draft;
    const iccid = d.hardware.iccid.replace(/\s/g, '');
    const openMlSponsor = d.openMl.enabled && d.openMl.valid ? d.openMl.sponsor : null;
    const base: OrderRequest = {
      flow: this.flow,
      customerId: s.customer()?.id ?? '',
      contractRef: d.confirm.contractRef,
      contractSigned: d.confirm.signed,
      cgvAccepted: d.confirm.cgv,
      privacyAccepted: d.confirm.rgpd,
    };
    switch (this.flow) {
      case 'acquisition': {
        const n = d.number;
        const card = s.selectedOffer()?.family === 'prepaye';
        return {
          ...base,
          holder: d.identity,
          billingAddress: d.address,
          number:
            n.mode === 'nouveau'
              ? { mode: 'nouveau', msisdn: n.msisdn }
              : { mode: 'portabilite', rio: n.rio, portedMsisdn: n.portedMsisdn, operator: n.operator, portingDate: n.portingDate },
          offerId: d.offerId,
          options: d.options,
          openMlSponsor,
          sim: { type: d.hardware.simType, iccid },
          terminal: d.hardware.withTerminal && !card ? { id: d.hardware.terminalId, imei: d.hardware.imei } : null,
          sepaMandateRef: card ? null : d.sepa.mandateRef,
        };
      }
      case 'forfait':
        return { ...base, lineMsisdn: d.lineMsisdn, offerId: d.offerId, options: d.options, openMlSponsor };
      case 'options':
        return { ...base, lineMsisdn: d.lineMsisdn, options: d.options };
      case 'sim':
        return { ...base, lineMsisdn: d.lineMsisdn, simReason: d.simReason, sim: { type: d.hardware.simType, iccid } };
    }
  }
}
