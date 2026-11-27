import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { firstValueFrom } from 'rxjs';
import { Terminal } from '../domain/models';
import { APP_CONFIG } from '../config';

export type IccidCheck = 'ok' | 'format' | 'inconnu';

/** Matériel : terminaux, contrôle de l'ICCID et lecture de SIM (enabler si-financier). */
@Injectable({ providedIn: 'root' })
export class HardwareApi {
  private readonly http = inject(HttpClient);
  private readonly api = inject(APP_CONFIG).apiUrl;

  /** Terminaux vendables ; avec l'offre, seulement ceux qui ont un tarif pour sa gamme. */
  terminals(offerId?: string | null): Promise<Terminal[]> {
    const params: Record<string, string> = offerId ? { offerId } : {};
    return firstValueFrom(this.http.get<Terminal[]>(`${this.api}/hardware/terminals`, { params }));
  }

  async checkIccid(iccid: string): Promise<IccidCheck> {
    const res = await firstValueFrom(this.http.post<{ result: IccidCheck }>(`${this.api}/hardware/iccid-checks`, { iccid }));
    return res.result;
  }

  /** Simule la lecture du code-barres d'une SIM du stock boutique. */
  async scanSim(): Promise<string> {
    const res = await firstValueFrom(this.http.post<{ iccid: string }>(`${this.api}/hardware/sim-scans`, null));
    return res.iccid;
  }
}
