import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { firstValueFrom } from 'rxjs';
import { Address, Flow, Identity, SimType } from '../domain/models';
import { API } from './api-base';

/** Corps commun à POST /contracts et POST /orders ; les champs utiles dépendent de la demande. */
export interface OrderRequest {
  flow: Flow;
  customerId: string;
  lineMsisdn?: string | null;
  holder?: Identity;
  billingAddress?: Address;
  number?:
    | { mode: 'nouveau'; msisdn: string }
    | { mode: 'portabilite'; rio: string; portedMsisdn: string; operator: string; portingDate: string };
  offerId?: string | null;
  /** Liste complète souhaitée (pour une modification d'options, le serveur calcule ajouts et retraits). */
  options?: string[];
  openMlSponsor?: string | null;
  sim?: { type: SimType; iccid: string };
  terminal?: { id: string; imei: string } | null;
  sepaMandateRef?: string | null;
  simReason?: string | null;
  contractRef?: string | null;
  contractSigned?: boolean;
  cgvAccepted?: boolean;
  privacyAccepted?: boolean;
}

export interface CreatedOrder {
  orderNumber: string;
  createdAt: string;
  /** Montant à régler en caisse, recalculé par le serveur. */
  cashDue: number;
}

/** Commande : mandat SEPA (api IML), contrat (api EPC, Api-document), commande (api-order) et encaissement (managePayment). */
@Injectable({ providedIn: 'root' })
export class OrderApi {
  private readonly http = inject(HttpClient);

  async storeMandate(holder: string, iban: string): Promise<string> {
    const res = await firstValueFrom(this.http.post<{ reference: string }>(`${API}/sepa-mandates`, { holder, iban }));
    return res.reference;
  }

  /** Génère et stocke le contrat ; renvoie son identifiant (contractRef). */
  async generateContract(request: OrderRequest): Promise<string> {
    const res = await firstValueFrom(this.http.post<{ documentId: string }>(`${API}/contracts`, request));
    return res.documentId;
  }

  downloadContract(documentId: string): Promise<Blob> {
    return firstValueFrom(this.http.get(`${API}/contracts/${documentId}`, { responseType: 'blob' }));
  }

  create(request: OrderRequest): Promise<CreatedOrder> {
    return firstValueFrom(this.http.post<CreatedOrder>(`${API}/orders`, request));
  }

  async recordCashPayment(orderNumber: string, amount: number): Promise<string> {
    const res = await firstValueFrom(
      this.http.post<{ reference: string }>(`${API}/orders/${orderNumber}/cash-payments`, { amount }),
    );
    return res.reference;
  }
}
