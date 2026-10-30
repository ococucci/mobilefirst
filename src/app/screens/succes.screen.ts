import { Component, computed, inject, signal } from '@angular/core';
import { OrderApi } from '../api/order.api';
import { run } from '../ui/run';
import { formatEuro, formatMsisdn } from '../domain/format';
import { CARD_SIM_PRICE, SIM_REASONS } from '../domain/models';
import { OrderStore } from '../store/order.store';

/** Écrans 6, 6b, 5c, 5d et 5e : commande validée. */
@Component({
  selector: 'app-succes',
  template: `
    @if (store.result(); as r) {
      <div class="success-page">
        <section>
          <div class="success-head">
            <span class="tick" aria-hidden="true">✓</span>
            <div>
              <h1>Commande validée</h1>
              <span class="muted">{{ subtitle() }}</span>
            </div>
          </div>
          <div class="card">
            <span class="muted small">Numéro de commande</span>
            <div class="order-number">{{ r.orderNumber }}</div>
            <span class="muted small">Commande enregistrée et publiée dans le bus PubSub.</span>
          </div>
          <div class="card">
            @for (row of rows(); track row[0]) {
              <div class="kv"><span class="k">{{ row[0] }}</span><span class="v">{{ row[1] }}</span></div>
            }
          </div>
        </section>
        <section>
          <div class="card">
            <h2>À faire maintenant</h2>
            <ol class="todo">
              @for (t of todo(); track t) { <li>{{ t }}</li> }
            </ol>
          </div>
          @if (r.cashDue > 0) {
            <div class="cash"><span>À régler en caisse</span><span>{{ euro(r.cashDue) }}</span></div>
            @if (r.paymentRef) {
              <div class="notice green">Paiement en caisse enregistré (managePayment) · {{ r.paymentRef }}</div>
            } @else {
              <button type="button" class="btn" style="width: 100%; margin-bottom: 1rem" (click)="recordPayment()" [disabled]="recording()">
                @if (recording()) { <span class="spinner"></span> } Confirmer l'encaissement en caisse
              </button>
            }
          }
          <button type="button" class="btn primary" (click)="store.reset()">Nouvelle commande</button>
        </section>
      </div>
    }
  `,
})
export class SuccesScreen {
  protected readonly store = inject(OrderStore);
  private readonly orders = inject(OrderApi);
  protected readonly recording = signal(false);
  protected readonly euro = formatEuro;

  private readonly flow = this.store.flow() ?? 'acquisition';

  protected readonly subtitle = computed(() =>
    this.flow === 'options' ? 'La demande est transmise. Pas de contrat à remettre.' : 'La demande est transmise, le contrat est signé.',
  );

  protected readonly rows = computed<[string, string][]>(() => {
    const s = this.store;
    const d = s.draft;
    const r = s.result();
    const line = s.selectedLine();
    const when = r ? `${r.createdAt.toLocaleDateString('fr-FR')} · ${r.createdAt.toLocaleTimeString('fr-FR', { hour: '2-digit', minute: '2-digit' })}` : '';
    const rows: [string, string][] = [
      ['Ligne', formatMsisdn(s.orderMsisdn())],
      ['Client', s.holderName()],
    ];
    const optionsLabel = (ids: string[]) => ids.map((id) => s.option(id)?.label ?? id).join(', ') || '—';
    switch (this.flow) {
      case 'acquisition':
        rows.push(['Offre', `${s.selectedOffer()?.label ?? ''}${d.options.length ? ` + ${d.options.length} option(s)` : ''}`]);
        rows.push(['SIM (ICCID)', d.hardware.iccid]);
        break;
      case 'forfait':
        rows.push(['Ancienne offre', line?.offerLabel ?? '']);
        rows.push(['Nouvelle offre', s.selectedOffer()?.label ?? '']);
        rows.push(["Date d'effet", r?.createdAt.toLocaleDateString('fr-FR') ?? '']);
        break;
      case 'options': {
        const diff = s.optionsChange();
        rows.push(['Options ajoutées', optionsLabel(diff.added)]);
        rows.push(['Options retirées', optionsLabel(diff.removed)]);
        rows.push(["Date d'effet", r?.createdAt.toLocaleDateString('fr-FR') ?? '']);
        break;
      }
      case 'sim':
        rows.push(['Raison', SIM_REASONS.find((x) => x.id === d.simReason)?.label ?? '']);
        rows.push(['Nouvelle SIM', `${d.hardware.simType === 'esim' ? 'eSIM' : 'SIM physique'} · ${d.hardware.iccid}`]);
        break;
    }
    rows.push(['Date et heure', when]);
    rows.push(['Conseiller', 'Boutique']);
    return rows;
  });

  protected readonly todo = computed(() => {
    const s = this.store;
    const d = s.draft;
    const due = s.result()?.cashDue ?? 0;
    const items: string[] = [];
    switch (this.flow) {
      case 'acquisition': {
        const card = s.selectedOffer()?.family === 'prepaye';
        if (due) {
          const parts = [card ? `puce SIM ${formatEuro(CARD_SIM_PRICE)} pour une Card prépayée` : '', d.hardware.withTerminal ? 'terminal' : ''].filter(Boolean);
          items.push(`Encaisser en caisse le montant dû (${parts.join(', ')}).`);
        }
        items.push(`Remettre ${d.hardware.simType === 'esim' ? "le QR code de l'eSIM" : 'la SIM'} et un exemplaire du contrat signé au client.`);
        if (!card) items.push('Faire signer le mandat SEPA au client (hors outil).');
        if (d.number.mode === 'portabilite') items.push(`Informer le client que la portabilité sera exécutée le ${new Date(d.number.portingDate).toLocaleDateString('fr-FR')}.`);
        break;
      }
      case 'forfait':
        items.push('Remettre au client un exemplaire du contrat signé.');
        items.push("Informer le client de la date d'effet de la nouvelle offre.");
        break;
      case 'options':
        items.push("Informer le client de la date d'effet des options. Pas de contrat à remettre.");
        break;
      case 'sim':
        if (due) items.push(`Encaisser les ${formatEuro(due)} de frais (motif perte ou vol).`);
        items.push(`Remettre la nouvelle ${d.hardware.simType === 'esim' ? 'eSIM' : 'SIM'} au client et un exemplaire du contrat signé.`);
        items.push("Récupérer l'ancienne SIM.");
        break;
    }
    items.push('Conserver le numéro de commande pour tout suivi ou réclamation.');
    return items;
  });

  /** Enregistre le paiement effectué en caisse (enabler managePayment). */
  async recordPayment(): Promise<void> {
    const r = this.store.result();
    if (!r) return;
    await run(this.recording, async () => {
      const paymentRef = await this.orders.recordCashPayment(r.orderNumber, r.cashDue);
      this.store.result.set({ ...r, paymentRef });
    });
  }
}
