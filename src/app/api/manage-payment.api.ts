import { Injectable } from '@angular/core';
import { latency } from './latency';

/** Enabler managePayment : enregistrement d'un paiement effectué en caisse. */
@Injectable({ providedIn: 'root' })
export class ManagePaymentApi {
  private sequence = 1;

  recordCashPayment(orderNumber: string, amount: number): Promise<string> {
    const ref = `PAY-${orderNumber.slice(4)}-${this.sequence++}`;
    console.info('[managePayment]', { orderNumber, amount, ref });
    return latency(ref);
  }
}
