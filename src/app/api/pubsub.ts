import { Injectable } from '@angular/core';

export interface BusMessage {
  topic: string;
  publishedAt: string;
  payload: unknown;
}

/**
 * Publication des commandes validées dans le bus PubSub (fonctionnement similaire à
 * MOC / MobileOnLine). Bouchon : les messages sont conservés en mémoire.
 */
@Injectable({ providedIn: 'root' })
export class PubSubBus {
  readonly published: BusMessage[] = [];

  publish(topic: string, payload: unknown): Promise<void> {
    const message = { topic, publishedAt: new Date().toISOString(), payload };
    this.published.push(message);
    console.info('[PubSub]', message);
    return Promise.resolve();
  }
}
