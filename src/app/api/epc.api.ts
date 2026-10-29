import { Injectable } from '@angular/core';
import { buildPdf } from './pdf';
import { latency } from './latency';

/** api EPC : génération du contrat (PDF). */
@Injectable({ providedIn: 'root' })
export class EpcApi {
  async generateContract(title: string, lines: string[]): Promise<Blob> {
    await latency(null, 400);
    return buildPdf(title, lines);
  }
}
