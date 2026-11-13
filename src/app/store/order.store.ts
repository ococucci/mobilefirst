import { computed, inject, Injectable, signal } from '@angular/core';
import { ApiErrors } from '../api/api-base';
import { CatalogApi } from '../api/catalog.api';
import { HardwareApi } from '../api/hardware.api';
import {
  Address,
  Customer,
  FamilyId,
  Flow,
  Identity,
  Line,
  Offer,
  OfferOption,
  OrderResult,
  Score,
  Screen,
  SimType,
  Terminal,
  TerminalColor,
} from '../domain/models';
import {
  acquisitionCashDue,
  blockedOptions,
  monthly,
  MonthlyBreakdown,
  optionsDiff,
  OptionsDiff,
  simChangeFee,
  stepsFor,
  terminalPrice,
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
    terminalBrand: string;
    /** Modèle choisi. */
    terminalId: string;
    /** Couleur choisie. */
    terminalColorId: string;
    imei: string;
  };
  sepa: { holder: string; iban: string; mandateRef: string | null };
  lineMsisdn: string | null;
  simReason: string | null;
  /** Ligne (et raison) pour laquelle les étapes suivantes ont été préparées. */
  preparedFor: string | null;
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
    terminalBrand: '',
    terminalId: '',
    terminalColorId: '',
    imei: '',
  },
  sepa: { holder: '', iban: '', mandateRef: null },
  lineMsisdn: null,
  simReason: null,
  preparedFor: null,
  confirm: { contractRef: null, signed: false, cgv: false, rgpd: false },
});

@Injectable({ providedIn: 'root' })
export class OrderStore {
  private readonly catalogApi = inject(CatalogApi);
  private readonly hardwareApi = inject(HardwareApi);
  private readonly apiErrors = inject(ApiErrors);

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

  /** Catalogue des offres, chargé à l'écran Forfait (ou Options). */
  readonly offers = signal<Offer[]>([]);
  /** Terminaux, chargés à l'écran Matériel et paiement. */
  readonly terminals = signal<Terminal[]>([]);
  /** Numéros disponibles (api ressource), chargés à l'écran Forfait d'une nouvelle ligne. */
  readonly availableNumbers = signal<string[]>([]);

  /**
   * Appels déjà lancés pour la commande en cours (catalogue, terminaux, numéros) : ils ne sont pas refaits au retour
   * sur un écran. reset() les oublie pour la commande suivante ; un appel en échec pourra être relancé.
   */
  private readonly loads = new Map<string, Promise<void>>();
  /** Incrémenté à chaque nouvelle commande : la réponse d'un appel lancé avant reset() est ignorée. */
  private generation = 0;

  draft: Draft = emptyDraft();

  readonly steps = computed(() => stepsFor(this.flow()));

  /** Catalogue des offres, appelé une seule fois par commande ; renvoie true s'il vient d'être chargé. */
  loadCatalog(): Promise<boolean> {
    return this.once('offers', () => this.catalogApi.offers(), (v) => this.offers.set(v));
  }

  /** Terminaux, appelés une seule fois par commande. */
  loadTerminals(): Promise<boolean> {
    return this.once('terminals', () => this.hardwareApi.terminals(), (v) => this.terminals.set(v));
  }

  /** Numéros disponibles, appelés une seule fois par commande. */
  loadNumbers(): Promise<boolean> {
    return this.once('numbers', () => this.catalogApi.availableNumbers(), (v) => this.availableNumbers.set(v));
  }

  /**
   * Lance l'appel s'il n'a pas déjà été fait pour la commande en cours (ou s'il est en cours : on attend le même).
   * Renvoie true si cet appel vient de charger les données, false si elles l'étaient déjà.
   */
  private async once<T>(key: string, fetch: () => Promise<T>, apply: (value: T) => void): Promise<boolean> {
    const pending = this.loads.get(key);
    if (pending) {
      await pending;
      return false;
    }
    const generation = this.generation;
    const load = fetch().then((value) => {
      if (generation === this.generation) apply(value);
    });
    this.loads.set(key, load);
    try {
      await load;
      return true;
    } catch (e) {
      if (this.loads.get(key) === load) this.loads.delete(key);
      throw e;
    }
  }

  go(screen: Screen): void {
    // Toute modification après la vérification invalide le contrat déjà édité et sa signature.
    if (this.screen() === 'confirmation' && screen !== 'succes') {
      this.draft.confirm.contractRef = null;
      this.draft.confirm.signed = false;
    }
    this.apiErrors.clear();
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

  /** Retour sur une étape déjà franchie, sans perdre les saisies. */
  goToStep(index: number): void {
    const target = this.steps()[index]?.screens[0];
    if (target) this.go(target);
  }

  chooseFlow(flow: Flow): void {
    // Même demande qu'avant un retour à l'identification : on conserve les saisies.
    if (flow === this.flow()) return;
    const keep = { identity: this.draft.identity, address: this.draft.address, snapshot: this.draft.identitySnapshot };
    this.draft = emptyDraft();
    Object.assign(this.draft, { identity: keep.identity, address: keep.address, identitySnapshot: keep.snapshot });
    this.flow.set(flow);
  }

  reset(): void {
    this.draft = emptyDraft();
    // Nouvelle commande : catalogue, terminaux et numéros seront rappelés (numéros réservés, catalogue à jour).
    this.generation++;
    this.loads.clear();
    this.offers.set([]);
    this.terminals.set([]);
    this.availableNumbers.set([]);
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

  /** Offre dont dépendent les options : l'offre choisie, ou l'offre actuelle de la ligne pour une modification d'options. */
  optionsOffer(): Offer | undefined {
    return this.flow() === 'options' ? this.offer(this.selectedLine()?.offerId) : this.selectedOffer();
  }

  option(id: string): OfferOption | undefined {
    return this.optionsOffer()?.options.find((o) => o.id === id);
  }

  /** Options non actives bloquées par une option incompatible, avec le libellé de l'option qui les bloque. */
  blockedOptions(): Map<string, string> {
    return blockedOptions(this.optionsOffer(), this.draft.options);
  }

  selectedOffer(): Offer | undefined {
    return this.offer(this.draft.offerId);
  }

  selectedLine(): Line | undefined {
    return this.customer()?.lines.find((l) => l.msisdn === this.draft.lineMsisdn);
  }

  /** Terminal ajouté à la commande (modèle et couleur), s'il y en a un. */
  selectedTerminal(): { terminal: Terminal; color: TerminalColor | undefined } | null {
    const h = this.draft.hardware;
    if (!h.withTerminal || this.selectedOffer()?.family === 'prepaye') return null;
    const terminal = this.terminals().find((t) => t.id === h.terminalId);
    return terminal ? { terminal, color: terminal.colors.find((c) => c.id === h.terminalColorId) } : null;
  }

  /** Prix du terminal choisi au niveau de l'offre choisie ; 0 sans terminal. */
  terminalPrice(): number {
    const offer = this.selectedOffer();
    const t = this.selectedTerminal();
    return offer && t ? terminalPrice(t.terminal, offer) : 0;
  }

  breakdown(): MonthlyBreakdown | null {
    const offer = this.selectedOffer();
    if (!offer) return null;
    return monthly(offer, this.draft.options, this.draft.openMl.enabled && !!this.draft.openMl.valid);
  }

  optionsChange(): OptionsDiff {
    return optionsDiff(this.selectedLine()?.options ?? [], this.draft.options, this.optionsOffer());
  }

  cashDue(): number {
    switch (this.flow()) {
      case 'acquisition':
        return acquisitionCashDue(this.selectedOffer(), this.terminalPrice());
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
