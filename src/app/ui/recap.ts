import { Component, inject } from '@angular/core';
import { FLOW_LABELS, SIM_REASONS } from '../domain/models';
import { formatEuro, formatMsisdn } from '../domain/format';
import { selectedOptions } from '../domain/rules';
import { OrderStore } from '../store/order.store';

interface Row {
  k: string;
  v: string;
  cls?: 'sep' | 'total' | 'sep total';
}

const STATUS_LABELS = { connu: 'Connu', controle: 'Contrôlé', cree: 'Créé' } as const;

@Component({
  selector: 'app-recap',
  template: `
    <details [open]="isDesktop">
      <summary>
        <span>Récapitulatif</span>
        @if (headline(); as h) { <span class="sum-total">{{ h }}</span> }
      </summary>
      <div class="rows">
        @for (row of rows(); track row.k) {
          <div class="row" [class]="row.cls ?? ''">
            <span class="k">{{ row.k }}</span><span class="v">{{ row.v }}</span>
          </div>
        } @empty {
          <span class="muted small">Aucune information pour le moment.</span>
        }
      </div>
    </details>
  `,
})
export class Recap {
  private readonly store = inject(OrderStore);
  protected readonly isDesktop = typeof matchMedia === 'function' && matchMedia('(min-width: 1024px)').matches;

  /** Montant affiché sur la barre repliée en mobile. */
  protected headline(): string | null {
    const flow = this.store.flow();
    const b = this.store.breakdown();
    if (flow === 'options') return this.signed(this.store.optionsChange().delta) + '/mois';
    if (b && (flow === 'acquisition' || flow === 'forfait')) return formatEuro(b.total) + '/mois';
    if (flow === 'sim' && this.store.cashDue()) return formatEuro(this.store.cashDue()) + ' en caisse';
    return null;
  }

  protected rows(): Row[] {
    const s = this.store;
    const d = s.draft;
    const customer = s.customer();
    const flow = s.flow();
    const rows: Row[] = [];
    const screen = s.screen();

    if (!flow) {
      const choice = s.flowChoice();
      if (screen === 'demande' && choice) rows.push({ k: 'Demande', v: FLOW_LABELS[choice] });
      if (s.searchMsisdn()) rows.push({ k: 'Ligne', v: formatMsisdn(s.searchMsisdn()) });
      const status = s.customerStatus();
      if (status) rows.push({ k: 'Client', v: STATUS_LABELS[status] });
      if (customer) rows.push({ k: 'Titulaire', v: s.holderName() });
      const score = s.score();
      if (score) rows.push({ k: 'Préventel', v: status === 'connu' ? 'Score en base' : `Score ${score}` });
      return rows;
    }

    if (flow !== 'acquisition') {
      rows.push({ k: 'Demande', v: FLOW_LABELS[flow] });
      rows.push({ k: 'Client', v: s.holderName() });
      const line = s.selectedLine();
      if (line) {
        rows.push({ k: 'Ligne', v: formatMsisdn(line.msisdn) });
        rows.push({ k: 'Offre actuelle', v: line.offerLabel });
      }
    } else {
      const msisdn = s.orderMsisdn();
      if (msisdn) rows.push({ k: 'Ligne', v: formatMsisdn(msisdn) + (d.number.mode === 'portabilite' ? ' (portabilité)' : '') });
      rows.push({ k: 'Titulaire', v: s.holderName() });
      if (d.address.commune) rows.push({ k: 'Facturation', v: `${d.address.codePostal} ${d.address.commune}` });
    }

    if (flow === 'acquisition' || flow === 'forfait') {
      const offer = s.selectedOffer();
      const b = s.breakdown();
      if (offer && b) {
        rows.push({ k: flow === 'forfait' ? 'Nouvelle offre' : offer.label, v: flow === 'forfait' ? offer.label : formatEuro(b.base), cls: 'sep' });
        if (flow === 'forfait') rows.push({ k: 'Prix', v: formatEuro(b.base) });
        for (const o of selectedOptions(offer, d.options)) {
          rows.push({ k: o.label, v: o.included ? 'Incluse' : '+' + formatEuro(o.price) });
        }
        if (b.openMl) rows.push({ k: 'Remise Open ML', v: `−${formatEuro(b.openMl)}/mois, à vie` });
        for (const p of offer.promos) rows.push({ k: 'Remise', v: p.label });
        rows.push({ k: 'Mensualité', v: formatEuro(b.total) + '/mois', cls: 'sep total' });
        if (b.promo) rows.push({ k: `Les ${b.promo.months} premiers mois`, v: formatEuro(b.promo.total) + '/mois' });
      }
    }

    if (flow === 'options' && s.selectedLine() && screen !== 'ligne') {
      const diff = s.optionsChange();
      const names = (ids: string[]) => ids.map((id) => s.option(id)?.label ?? id).join(', ') || '—';
      rows.push({ k: 'Ajout', v: names(diff.added), cls: 'sep' });
      rows.push({ k: 'Retrait', v: names(diff.removed) });
      rows.push({ k: 'Variation', v: this.signed(diff.delta) + '/mois', cls: 'sep total' });
    }

    if (flow === 'sim') {
      const reason = SIM_REASONS.find((r) => r.id === d.simReason);
      if (reason) rows.push({ k: 'Raison', v: reason.label });
      rows.push({ k: 'Frais en caisse', v: reason ? formatEuro(s.cashDue()) : '10 € si perte ou vol' });
    }

    if (flow === 'acquisition' && s.selectedOffer()) {
      rows.push({ k: 'À régler en caisse', v: formatEuro(s.cashDue()) });
    }
    return rows;
  }

  private signed(n: number): string {
    return (n > 0 ? '+' : n < 0 ? '−' : '±') + formatEuro(Math.abs(n));
  }
}
