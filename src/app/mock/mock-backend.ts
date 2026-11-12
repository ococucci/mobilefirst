import { HttpErrorResponse, HttpInterceptorFn, HttpRequest, HttpResponse } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { defer, delay, of, throwError } from 'rxjs';
import type { OrderRequest } from '../api/order.api';
import { APP_CONFIG } from '../config';
import { Address, Customer, FLOW_LABELS, Identity, Score, Terminal } from '../domain/models';
import {
  acquisitionCashDue,
  compact,
  digits,
  identityChangeRequiresRescore,
  isValidIban,
  isValidIccid,
  requiresContract,
  round,
  simChangeFee,
  terminalPrice,
} from '../domain/rules';
import {
  ADDRESSES,
  AVAILABLE_NUMBERS,
  CUSTOMERS,
  ICCID_STOCK,
  OFFERS,
  PENDING_ORDER_LINES,
  RESCORE,
  SPONSORS,
  TERMINALS,
} from './mock-data';
import { buildPdf } from './pdf';

/** Latence simulée des bouchons. */
const LATENCY_MS = 250;

/** Réponse d'un bouchon : statut HTTP et corps (objet JSON, Blob, ou null pour 204). */
interface MockResponse {
  status: number;
  body: unknown;
}

/** Erreur au format ProblemDetail, comme l'API. */
class Problem extends Error {
  constructor(
    readonly status: number,
    readonly title: string,
    detail: string,
    readonly errors?: { field: string; message: string }[],
  ) {
    super(detail);
  }
}

const ok = (body: unknown): MockResponse => ({ status: 200, body });
const created = (body: unknown): MockResponse => ({ status: 201, body });
/** Recherche sans résultat : 204, corps vide (comme l'API). */
const noContent = (): MockResponse => ({ status: 204, body: null });
const invalid = (errors: Record<string, string>) =>
  new Problem(400, 'Saisie invalide', 'Corrigez les champs en rouge pour continuer.',
    Object.entries(errors).map(([field, message]) => ({ field, message })));
const refused = (detail: string) => new Problem(422, 'Opération impossible', detail);
const notFound = (detail: string) => new Problem(404, 'Introuvable', detail);

/**
 * Bouchon de l'API mobilefirst-api, intégré au front pour le faire tourner seul (backend « mock »).
 * Il respecte le même contrat (routes, 204, ProblemDetail) et le même jeu de démonstration que les bouchons
 * de l'API. Il ne revérifie pas toutes les règles de gestion : le front les contrôle déjà avant chaque appel.
 */
@Injectable({ providedIn: 'root' })
export class MockBackend {
  private readonly customers: Customer[] = structuredClone(CUSTOMERS);
  private readonly pending = new Set(PENDING_ORDER_LINES);
  private readonly reserved = new Set<string>();
  private readonly stock = new Set(ICCID_STOCK);
  private readonly terminals: Terminal[] = TERMINALS;
  private readonly mandates = new Set<string>();
  private readonly contracts = new Map<string, Blob>();
  private readonly cashDue = new Map<string, number>();
  private orderSequence = 98417;
  private sequence = 1;

  private readonly routes: [string, RegExp, (m: RegExpMatchArray, req: HttpRequest<unknown>) => MockResponse][] = [
    ['GET', /^\/customers$/, (_, req) => this.byMsisdn(req.params.get('msisdn') ?? '')],
    ['POST', /^\/customers\/existence-checks$/, (_, req) => this.existence(this.body<{ identity: Identity }>(req).identity)],
    ['POST', /^\/customers$/, (_, req) => this.createCustomer(this.body<{ identity: Identity }>(req).identity)],
    ['GET', /^\/customers\/([^/]+)$/, (m) => this.customerById(m[1])],
    ['PUT', /^\/customers\/([^/]+)$/, (m, req) => this.updateCustomer(m[1], this.body(req))],
    ['GET', /^\/customers\/([^/]+)\/pending-lines$/, (m) => ok(this.customer(m[1]).lines.map((l) => l.msisdn).filter((n) => this.pending.has(n)))],
    ['POST', /^\/customers\/([^/]+)\/lines\/([^/]+)\/rescoring$/, (m) => this.rescore(m[1], m[2])],
    ['GET', /^\/catalog\/offers$/, () => ok(OFFERS)],
    ['GET', /^\/numbers\/available$/, () => ok(AVAILABLE_NUMBERS.filter((n) => !this.reserved.has(n)))],
    ['POST', /^\/open-ml\/sponsor-checks$/, (_, req) => ok({ valid: SPONSORS.includes(digits(this.body<{ sponsor: string }>(req).sponsor ?? '')) })],
    ['GET', /^\/hardware\/terminals$/, () => ok(this.terminals)],
    ['POST', /^\/hardware\/iccid-checks$/, (_, req) => ok({ result: this.checkIccid(this.body<{ iccid: string }>(req).iccid ?? '') })],
    ['POST', /^\/hardware\/sim-scans$/, () => ok({ iccid: [...this.stock][Math.floor(Math.random() * this.stock.size)] ?? '' })],
    ['GET', /^\/addresses$/, (_, req) => this.addresses(req.params.get('q') ?? '')],
    ['POST', /^\/sepa-mandates$/, (_, req) => this.mandate(this.body(req))],
    ['POST', /^\/contracts$/, (_, req) => this.contract(this.body<OrderRequest>(req))],
    ['GET', /^\/contracts\/([^/]+)$/, (m) => (this.contracts.has(m[1]) ? ok(this.contracts.get(m[1])) : noContent())],
    ['POST', /^\/orders$/, (_, req) => this.order(this.body<OrderRequest>(req))],
    ['POST', /^\/orders\/([^/]+)\/cash-payments$/, (m, req) => this.payment(m[1], this.body<{ amount: number }>(req).amount)],
  ];

  /** Traite une requête dont le chemin est relatif à l'URL de base de l'API. */
  handle(path: string, req: HttpRequest<unknown>): MockResponse {
    for (const [method, pattern, handler] of this.routes) {
      const match = path.match(pattern);
      if (match && method === req.method) return handler(match, req);
    }
    throw notFound(`Route inconnue des bouchons : ${req.method} ${path}`);
  }

  private body<T>(req: HttpRequest<unknown>): T {
    return (req.body ?? {}) as T;
  }

  // ----- Client

  private customer(id: string): Customer {
    const customer = this.customers.find((c) => c.id === id);
    if (!customer) throw notFound(`Client ${id} introuvable.`);
    return customer;
  }

  private byMsisdn(msisdn: string): MockResponse {
    const n = digits(msisdn);
    const customer = this.customers.find((c) => c.lines.some((l) => l.msisdn === n));
    return customer ? ok(customer) : noContent();
  }

  private customerById(id: string): MockResponse {
    const customer = this.customers.find((c) => c.id === id);
    return customer ? ok(customer) : noContent();
  }

  private existence(identity: Identity): MockResponse {
    const norm = (s: string) => s.trim().toLowerCase();
    const found = this.customers.find(
      (c) =>
        norm(c.identity.nom) === norm(identity.nom) &&
        norm(c.identity.prenom) === norm(identity.prenom) &&
        c.identity.dateNaissance === identity.dateNaissance &&
        compact(c.identity.pieceNumero) === compact(identity.pieceNumero),
    );
    return found ? ok(found) : noContent();
  }

  /** Préventel bouchonné : un nom contenant « rouge » ou « orange » renvoie ce score, sinon vert. */
  private preventel(identity: Identity): Score {
    const nom = identity.nom.toLowerCase();
    return nom.includes('rouge') ? 'rouge' : nom.includes('orange') ? 'orange' : 'vert';
  }

  private createCustomer(identity: Identity): MockResponse {
    const score = this.preventel(identity);
    if (score === 'rouge') return created({ score, customer: null });
    const customer: Customer = {
      id: `CL-${String(900000 + this.customers.length).padStart(6, '0')}`,
      type: 'GP',
      identity: structuredClone(identity),
      address: { ligne: '', codePostal: '', commune: '', complement: '' },
      score,
      lines: [],
    };
    this.customers.push(customer);
    return created({ score, customer });
  }

  private updateCustomer(id: string, body: { identity: Identity; address: Address }): MockResponse {
    const customer = this.customer(id);
    const rescored = identityChangeRequiresRescore(customer.identity, body.identity);
    const score = rescored ? this.preventel(body.identity) : customer.score;
    if (score !== 'rouge') Object.assign(customer, { identity: structuredClone(body.identity), address: structuredClone(body.address), score });
    return ok({ score, rescored, customer });
  }

  private rescore(id: string, msisdn: string): MockResponse {
    const customer = this.customer(id);
    const line = customer.lines.find((l) => l.msisdn === digits(msisdn));
    if (!line) throw notFound(`La ligne ${msisdn} n'appartient pas au client ${id}.`);
    if (!line.isCard) throw refused('Seule une ligne Card prépayée est re-scorée avant un changement de forfait.');
    return ok({ score: RESCORE[id] ?? this.preventel(customer.identity) });
  }

  // ----- Matériel, adresse, paiement

  private checkIccid(iccid: string): 'ok' | 'format' | 'inconnu' {
    if (!isValidIccid(iccid)) return 'format';
    return this.stock.has(compact(iccid)) ? 'ok' : 'inconnu';
  }

  private addresses(query: string): MockResponse {
    const words = query.toLowerCase().split(/[\s,]+/).filter((w) => w.length > 1);
    if (!words.length) return ok([]);
    const matches = ADDRESSES.filter((a) => words.every((w) => `${a.ligne} ${a.codePostal} ${a.commune}`.toLowerCase().includes(w)));
    return ok(matches.slice(0, 5));
  }

  private mandate(body: { holder?: string; iban?: string }): MockResponse {
    const errors: Record<string, string> = {};
    if (!body.holder?.trim()) errors['holder'] = 'Le titulaire du compte est obligatoire.';
    if (!body.iban?.trim()) errors['iban'] = "L'IBAN est obligatoire.";
    else if (!isValidIban(body.iban)) errors['iban'] = 'IBAN invalide : vérifiez sa saisie.';
    if (Object.keys(errors).length) throw invalid(errors);
    const reference = `RUM-OOF-${compact(body.iban ?? '').slice(-4)}-${String(this.sequence++).padStart(4, '0')}`;
    this.mandates.add(reference);
    return created({ reference });
  }

  // ----- Contrat et commande

  private contract(request: OrderRequest): MockResponse {
    if (!requiresContract(request.flow)) throw refused("Aucun contrat n'est généré pour une modification d'options.");
    const customer = this.customer(request.customerId);
    const offer = OFFERS.find((o) => o.id === request.offerId);
    const terminal = this.terminals.find((t) => t.id === request.terminal?.id);
    const color = terminal?.colors.find((c) => c.id === request.terminal?.colorId);
    const lines = [
      `Objet : ${FLOW_LABELS[request.flow]}`,
      `Client : ${customer.id} - ${customer.identity.civilite} ${customer.identity.prenom} ${customer.identity.nom}`,
      `Ligne : ${this.msisdn(request)}`,
      ...(offer ? [`Offre : ${offer.label} - ${offer.price.toFixed(2)} EUR/mois`] : []),
      ...(offer?.promo ? [`Remise : ${offer.promo.label}`] : []),
      ...(terminal && offer
        ? [`Terminal : ${terminal.brand} ${terminal.model} ${color?.label ?? ''} - ${terminalPrice(terminal, offer).toFixed(2)} EUR (tarif ${offer.level}) - IMEI ${request.terminal?.imei}`]
        : []),
      ...(request.sim ? [`SIM : ${request.sim.type === 'esim' ? 'eSIM' : 'SIM physique'} - ICCID ${request.sim.iccid}`] : []),
      '',
      `Édité le ${new Date().toLocaleString('fr-FR')} par Orange Order First (mode démonstration).`,
      '',
      'Signature du client :',
    ];
    const documentId = `DOC-${customer.id}-${this.sequence++}`;
    this.contracts.set(documentId, buildPdf(`Contrat - ${FLOW_LABELS[request.flow]}`, lines));
    return created({ documentId, downloadUrl: `/api/v1/contracts/${documentId}` });
  }

  private msisdn(r: OrderRequest): string {
    if (r.flow !== 'acquisition') return digits(r.lineMsisdn ?? '');
    return digits(r.number?.mode === 'portabilite' ? r.number.portedMsisdn : (r.number?.msisdn ?? ''));
  }

  private order(r: OrderRequest): MockResponse {
    const customer = this.customer(r.customerId);
    if (customer.score === 'rouge') throw refused('Score Préventel rouge : aucune vente possible.');
    const errors: Record<string, string> = {};
    if (requiresContract(r.flow)) {
      if (!r.contractRef || !this.contracts.has(r.contractRef)) errors['contractRef'] = 'Le contrat doit être généré avant la validation.';
      if (!r.contractSigned) errors['contractSigned'] = 'Cochez « Le client a signé le contrat » pour valider.';
    }
    if (!r.cgvAccepted) errors['cgvAccepted'] = 'Les conditions générales de vente doivent être acceptées.';
    if (!r.privacyAccepted) errors['privacyAccepted'] = 'La politique de données personnelles doit être acceptée.';
    if (Object.keys(errors).length) throw invalid(errors);
    const msisdn = this.msisdn(r);
    if (r.flow !== 'acquisition' && this.pending.has(msisdn)) {
      throw refused(`La ligne ${msisdn} a une commande en cours : elle ne peut pas être modifiée.`);
    }

    const offer = OFFERS.find((o) => o.id === r.offerId);
    const terminal = r.terminal ? this.terminals.find((t) => t.id === r.terminal?.id) : undefined;
    const color = terminal?.colors.find((c) => c.id === r.terminal?.colorId);
    if (r.terminal && (!terminal || !color)) throw invalid({ terminal: 'Terminal inconnu.' });
    const price = terminal && offer ? terminalPrice(terminal, offer) : 0;
    const cashDue = r.flow === 'acquisition' ? acquisitionCashDue(offer, price) : r.flow === 'sim' ? simChangeFee(r.simReason ?? null) : 0;
    const orderNumber = `CMD-${new Date().getFullYear()}-${String(this.orderSequence++).padStart(7, '0')}`;
    const createdAt = new Date().toISOString();

    this.pending.add(msisdn);
    if (r.number?.mode === 'nouveau') this.reserved.add(digits(r.number.msisdn));
    if (r.sim) this.stock.delete(compact(r.sim.iccid));
    this.cashDue.set(orderNumber, round(cashDue));
    console.info('[PubSub bouchonné] orange-order-first.mobile.order-validated', { orderNumber, createdAt, msisdn, cashDue, order: r });
    return created({ orderNumber, createdAt, cashDue: round(cashDue) });
  }

  private payment(orderNumber: string, amount: number): MockResponse {
    const due = this.cashDue.get(orderNumber);
    if (due === undefined) throw notFound(`Commande ${orderNumber} introuvable.`);
    if (due === 0) throw refused("Aucun montant n'est à régler en caisse pour cette commande.");
    if (Math.abs(due - amount) > 0.001) {
      throw invalid({ amount: `Le montant encaissé doit être de ${due.toFixed(2).replace('.', ',')} €.` });
    }
    return created({ reference: `PAY-${orderNumber.slice(4)}-${this.sequence++}` });
  }
}

/** Intercepte les appels à l'API et y répond avec les bouchons, après une courte latence. */
export const mockBackendInterceptor: HttpInterceptorFn = (req, next) => {
  const base = inject(APP_CONFIG).apiUrl;
  const backend = inject(MockBackend);
  if (!req.url.startsWith(base)) return next(req);
  const path = req.url.slice(base.length).split('?')[0];
  return defer(() => {
    try {
      const { status, body } = backend.handle(path, req);
      return of(new HttpResponse({ status, body, url: req.url }));
    } catch (e) {
      if (!(e instanceof Problem)) throw e;
      const error = { title: e.title, status: e.status, detail: e.message, instance: path, ...(e.errors ? { errors: e.errors } : {}) };
      return throwError(() => new HttpErrorResponse({ status: e.status, error, url: req.url }));
    }
  }).pipe(delay(LATENCY_MS));
};
