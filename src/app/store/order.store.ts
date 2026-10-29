import { computed, inject, Injectable, signal } from '@angular/core';
import { CatalogueApi } from '../api/catalogue.api';
import { PromoAdviceApi } from '../api/promo-advice.api';
import {
  Address,
  Customer,
  FamilyId,
  Flow,
  Identity,
  Line,
  MobileOption,
  Offer,
  OrderResult,
  Promo,
  Score,
  Screen,
  SimType,
} from '../domain/models';
import {
  acquisitionCashDue,
  monthly,
  MonthlyBreakdown,
  optionsDiff,
  OptionsDiff,
  simChangeFee,
  stepsFor,
} from '../domain/rules';

export type CustomerStatus = 'connu' | 'controle' | 'cree';

export const emptyIdentity = (): Identity => ({
  civilite: 'Mme',
  nom: '',
  prenom: '',
  dateNaissance: '',
  departementNaissance: '',
  nationalite: '',
  pieceType: 'CNI',
  pieceNumero: '',
  mobileContact: '',
  email: '',
});

export const emptyAddress = (): Address => ({ ligne: '', codePostal: '', commune: '', complement: '' });

/** Saisies du conseiller, liées aux formulaires (ngModel). */
export interface Draft {
  identity: Identity;
  address: Address;
  /** Identité avant modification, pour savoir si Préventel doit être relancé. */
  identitySnapshot: Identity;
  number: {
    mode: 'nouveau' | 'portabilite';
    msisdn: string;
    rio: string;
    portedMsisdn: string;
    operator: string;
    portingDate: string;
  };
  family: FamilyId;
  offerId: string | null;
  options: string[];
  openMl: { enabled: boolean; sponsor: string; valid: boolean | null };
  hardware: {
    simType: SimType;
    iccid: string;
    iccidValid: boolean;
    withTerminal: boolean;
    terminalId: string;
    terminalPrice: number;
    imei: string;
  };
  sepa: { holder: string; iban: string; mandateRef: string | null };
  lineMsisdn: string | null;
  simReason: string | null;
  confirm: { contractRef: string | null; signed: boolean; cgv: boolean; rgpd: boolean };
}

const emptyDraft = (): Draft => ({
  identity: emptyIdentity(),
  address: emptyAddress(),
  identitySnapshot: emptyIdentity(),
  number: { mode: 'nouveau', msisdn: '', rio: '', portedMsisdn: '', operator: '', portingDate: '' },
  family: 'bloque',
  offerId: null,
  options: [],
  openMl: { enabled: false, sponsor: '', valid: null },
  hardware: {
    simType: 'physique',
    iccid: '',
    iccidValid: false,
    withTerminal: false,
    terminalId: '',
    terminalPrice: 0,
    imei: '',
  },
  sepa: { holder: '', iban: '', mandateRef: null },
  lineMsisdn: null,
  simReason: null,
  confirm: { contractRef: null, signed: false, cgv: false, rgpd: false },
});

@Injectable({ providedIn: 'root' })
export class OrderStore {
  private readonly catalogueApi = inject(CatalogueApi);
  private readonly promoApi = inject(PromoAdviceApi);

  readonly screen = signal<Screen>('identification');
  readonly customer = signal<Customer | null>(null);
  readonly customerStatus = signal<CustomerStatus | null>(null);
  readonly score = signal<Score | null>(null);
  readonly flow = signal<Flow | null>(null);
  readonly pendingLines = signal<string[]>([]);
  readonly result = signal<OrderResult | null>(null);
  /** Numéro saisi à l'identification. */
  readonly searchMsisdn = signal('');
  /** Demande sélectionnée à l'écran Demande, avant validation du choix. */
  readonly flowChoice = signal<Flow | null>(null);

  readonly offers = signal<Offer[]>([]);
  readonly catalogOptions = signal<MobileOption[]>([]);
  readonly promos = signal<Promo[]>([]);

  draft: Draft = emptyDraft();

  readonly steps = computed(() => stepsFor(this.flow()));

  async loadCatalog(): Promise<void> {
    const [offers, options, promos] = await Promise.all([
      this.catalogueApi.offers(),
      this.catalogueApi.options(),
      this.promoApi.promos(),
    ]);
    this.offers.set(offers);
    this.catalogOptions.set(options);
    this.promos.set(promos);
  }

  go(screen: Screen): void {
    this.screen.set(screen);
    window.scrollTo?.({ top: 0 });
  }

  identify(customer: Customer, status: CustomerStatus, score: Score): void {
    this.customer.set(customer);
    this.customerStatus.set(status);
    this.score.set(score);
    this.draft.identity = structuredClone(customer.identity);
    this.draft.identitySnapshot = structuredClone(customer.identity);
    this.draft.address = structuredClone(customer.address);
  }

  chooseFlow(flow: Flow): void {
    const keep = { identity: this.draft.identity, address: this.draft.address, snapshot: this.draft.identitySnapshot };
    this.draft = emptyDraft();
    Object.assign(this.draft, { identity: keep.identity, address: keep.address, identitySnapshot: keep.snapshot });
    this.flow.set(flow);
  }

  reset(): void {
    this.draft = emptyDraft();
    this.customer.set(null);
    this.customerStatus.set(null);
    this.score.set(null);
    this.flow.set(null);
    this.flowChoice.set(null);
    this.searchMsisdn.set('');
    this.pendingLines.set([]);
    this.result.set(null);
    this.go('identification');
  }

  // ----- Lecture dérivée de l'état -----

  offer(id: string | null | undefined): Offer | undefined {
    return this.offers().find((o) => o.id === id);
  }

  promoFor(offerId: string | null | undefined): Promo | undefined {
    return this.promos().find((p) => p.offerId === offerId);
  }

  option(id: string): MobileOption | undefined {
    return this.catalogOptions().find((o) => o.id === id);
  }

  selectedOffer(): Offer | undefined {
    return this.offer(this.draft.offerId);
  }

  selectedLine(): Line | undefined {
    return this.customer()?.lines.find((l) => l.msisdn === this.draft.lineMsisdn);
  }

  breakdown(): MonthlyBreakdown | null {
    const offer = this.selectedOffer();
    if (!offer) return null;
    const options = this.draft.options.map((id) => this.option(id)).filter((o): o is MobileOption => !!o);
    return monthly(offer, options, this.draft.openMl.enabled && !!this.draft.openMl.valid, this.promoFor(offer.id));
  }

  optionsChange(): OptionsDiff {
    return optionsDiff(this.selectedLine()?.options ?? [], this.draft.options, this.catalogOptions());
  }

  cashDue(): number {
    switch (this.flow()) {
      case 'acquisition':
        return acquisitionCashDue(this.selectedOffer(), this.draft.hardware.withTerminal ? this.draft.hardware.terminalPrice : 0);
      case 'sim':
        return simChangeFee(this.draft.simReason);
      default:
        return 0;
    }
  }

  /** Numéro de la ligne concernée par la commande. */
  orderMsisdn(): string {
    if (this.flow() !== 'acquisition') return this.draft.lineMsisdn ?? '';
    const n = this.draft.number;
    return n.mode === 'portabilite' ? n.portedMsisdn : n.msisdn;
  }

  holderName(): string {
    const c = this.customer();
    if (c?.company) return c.company.raisonSociale;
    const i = this.draft.identity;
    return [i.civilite, i.prenom, i.nom].filter(Boolean).join(' ');
  }
}
