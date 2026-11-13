import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { firstValueFrom } from 'rxjs';
import { APP_CONFIG, defaultHealthUrl } from '../config';
import { ApiErrors } from './api-base';

/** Disponibilité du backend : endpoint health de Spring Boot Actuator. */
@Injectable({ providedIn: 'root' })
export class HealthApi {
  private readonly http = inject(HttpClient);
  private readonly config = inject(APP_CONFIG);
  private readonly errors = inject(ApiErrors);

  /**
   * Vérifie que le backend répond « UP ». Une erreur HTTP (serveur injoignable, 503 « DOWN ») est affichée en
   * bandeau par l'intercepteur ; un autre statut est signalé ici.
   */
  async check(): Promise<boolean> {
    const res = await firstValueFrom(this.http.get<{ status?: string }>(this.config.healthUrl ?? defaultHealthUrl(this.config.apiUrl)));
    if (res?.status === 'UP') return true;
    this.errors.message.set(`Le serveur de commande n'est pas disponible (statut ${res?.status ?? 'inconnu'}). Réessayez dans un instant.`);
    return false;
  }
}
