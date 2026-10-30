import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { firstValueFrom } from 'rxjs';
import { Terminal } from '../domain/models';
import { API } from './api-base';

export type IccidCheck = 'ok' | 'format' | 'inconnu';

/** Matériel : terminaux, contrôle de l'ICCID et lecture de SIM (enabler si-financier). */
@Injectable({ providedIn: 'root' })
export class HardwareApi {
  private readonly http = inject(HttpClient);

  terminals(): Promise<Terminal[]> {
    return firstValueFrom(this.http.get<Terminal[]>(`${API}/hardware/terminals`));
  }

  async checkIccid(iccid: string): Promise<IccidCheck> {
    const res = await firstValueFrom(this.http.post<{ result: IccidCheck }>(`${API}/hardware/iccid-checks`, { iccid }));
    return res.result;
  }

  /** Simule la lecture du code-barres d'une SIM du stock boutique. */
  async scanSim(): Promise<string> {
    const res = await firstValueFrom(this.http.post<{ iccid: string }>(`${API}/hardware/sim-scans`, null));
    return res.iccid;
  }
}
