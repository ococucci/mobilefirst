import { Injectable } from '@angular/core';
import { Address, Customer, Identity, Score } from '../domain/models';
import { compact, digits } from '../domain/rules';
import { CUSTOMERS } from './mock-data';
import { latency } from './latency';

/** API Party (appy) : identification, recherche d'existence et création du client. */
@Injectable({ providedIn: 'root' })
export class PartyApi {
  private readonly customers = structuredClone(CUSTOMERS);

  findByMsisdn(msisdn: string): Promise<Customer | null> {
    const n = digits(msisdn);
    const found = this.customers.find((c) => c.lines.some((l) => l.msisdn === n));
    return latency(found ?? null);
  }

  /** Recherche d'existence sur nom, prénom, date de naissance et pièce. */
  findExisting(identity: Identity): Promise<Customer | null> {
    const norm = (s: string) => s.trim().toLowerCase();
    const found = this.customers.find(
      (c) =>
        norm(c.identity.nom) === norm(identity.nom) &&
        norm(c.identity.prenom) === norm(identity.prenom) &&
        c.identity.dateNaissance === identity.dateNaissance &&
        compact(c.identity.pieceNumero) === compact(identity.pieceNumero),
    );
    return latency(found ?? null);
  }

  create(identity: Identity, address: Address, score: Score): Promise<Customer> {
    const customer: Customer = {
      id: `CL-${String(900000 + this.customers.length).padStart(6, '0')}`,
      type: 'GP',
      identity: structuredClone(identity),
      address: structuredClone(address),
      score,
      lines: [],
    };
    this.customers.push(customer);
    return latency(customer);
  }

  update(id: string, identity: Identity, address: Address, score: Score): Promise<Customer> {
    const customer = this.customers.find((c) => c.id === id);
    if (!customer) return Promise.reject(new Error(`Client ${id} introuvable`));
    Object.assign(customer, { identity: structuredClone(identity), address: structuredClone(address), score });
    return latency(customer);
  }
}
