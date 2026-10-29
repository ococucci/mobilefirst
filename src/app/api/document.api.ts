import { Injectable } from '@angular/core';
import { latency } from './latency';

/** Api-document : création et stockage du document (contrat). */
@Injectable({ providedIn: 'root' })
export class DocumentApi {
  private readonly documents = new Map<string, Blob>();

  store(customerId: string, document: Blob): Promise<string> {
    const id = `DOC-${customerId}-${this.documents.size + 1}`;
    this.documents.set(id, document);
    return latency(id);
  }
}
