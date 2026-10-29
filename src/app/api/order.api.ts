import { inject, Injectable } from '@angular/core';
import { Flow } from '../domain/models';
import { PENDING_ORDER_LINES } from './mock-data';
import { latency } from './latency';
import { PubSubBus } from './pubsub';

export const ORDER_TOPIC = 'orange-order-first.mobile.order-validated';

export interface OrderRequest {
  flow: Flow;
  customerId: string;
  msisdn: string;
  [key: string]: unknown;
}

/** api-order : création de la commande, numéro de commande et commandes en cours. */
@Injectable({ providedIn: 'root' })
export class OrderApi {
  private readonly bus = inject(PubSubBus);
  private readonly pending = new Set(PENDING_ORDER_LINES);
  private sequence = 98417;

  linesWithPendingOrder(msisdns: string[]): Promise<string[]> {
    return latency(msisdns.filter((m) => this.pending.has(m)));
  }

  async create(request: OrderRequest): Promise<{ orderNumber: string; createdAt: Date }> {
    const orderNumber = `CMD-${new Date().getFullYear()}-${String(this.sequence++).padStart(7, '0')}`;
    const createdAt = new Date();
    await latency(null, 500);
    this.pending.add(request.msisdn);
    await this.bus.publish(ORDER_TOPIC, { orderNumber, createdAt: createdAt.toISOString(), ...request });
    return { orderNumber, createdAt };
  }
}
