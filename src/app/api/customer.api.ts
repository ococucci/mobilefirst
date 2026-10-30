import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { firstValueFrom } from 'rxjs';
import { Address, Customer, Identity, Score } from '../domain/models';
import { digits } from '../domain/rules';
import { API } from './api-base';

/** Client : Party et Préventel, via /customers. Une recherche sans résultat répond 204 (null ici). */
@Injectable({ providedIn: 'root' })
export class CustomerApi {
  private readonly http = inject(HttpClient);

  findByMsisdn(msisdn: string): Promise<Customer | null> {
    return firstValueFrom(this.http.get<Customer | null>(`${API}/customers`, { params: { msisdn: digits(msisdn) } }));
  }

  /** Recherche d'existence sur nom, prénom, date de naissance et pièce. */
  findExisting(identity: Identity): Promise<Customer | null> {
    return firstValueFrom(this.http.post<Customer | null>(`${API}/customers/existence-checks`, { identity }));
  }

  /** Contrôle Préventel puis création ; pas de client créé si le score est rouge. */
  create(identity: Identity): Promise<{ score: Score; customer: Customer | null }> {
    return firstValueFrom(this.http.post<{ score: Score; customer: Customer | null }>(`${API}/customers`, { identity }));
  }

  /** Étape Client : Préventel est relancé côté serveur si le nom, le prénom ou la date de naissance changent. */
  update(id: string, identity: Identity, address: Address): Promise<{ score: Score; rescored: boolean; customer: Customer }> {
    return firstValueFrom(
      this.http.put<{ score: Score; rescored: boolean; customer: Customer }>(`${API}/customers/${id}`, { identity, address }),
    );
  }

  /** Lignes du client ayant une commande en cours (api-order). */
  pendingLines(id: string): Promise<string[]> {
    return firstValueFrom(this.http.get<string[]>(`${API}/customers/${id}/pending-lines`));
  }

  /** Re-scoring Préventel d'une ligne Card avant un changement de forfait. */
  async rescoreCardLine(id: string, msisdn: string): Promise<Score> {
    const res = await firstValueFrom(this.http.post<{ score: Score }>(`${API}/customers/${id}/lines/${msisdn}/rescoring`, null));
    return res.score;
  }
}
