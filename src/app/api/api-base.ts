import { HttpErrorResponse, HttpInterceptorFn } from '@angular/common/http';
import { inject, Injectable, signal } from '@angular/core';
import { tap } from 'rxjs';

/** Préfixe de l'API Orange Order First (mobilefirst-api). En développement, proxy.conf.json le redirige vers :8080. */
export const API = '/api/v1';

/** Dernière erreur renvoyée par l'API, affichée en bandeau rouge en haut de l'écran. */
@Injectable({ providedIn: 'root' })
export class ApiErrors {
  readonly message = signal<string | null>(null);

  clear(): void {
    this.message.set(null);
  }
}

interface ProblemDetail {
  detail?: string;
  errors?: { field: string; message: string }[];
}

const UNREACHABLE = "Le serveur de commande est injoignable. Vérifiez qu'il est démarré, puis réessayez.";

export function errorMessage(error: HttpErrorResponse): string {
  const problem = typeof error.error === 'object' ? (error.error as ProblemDetail | null) : null;
  // Pas de réponse, ou réponse qui ne vient pas de l'API (proxy ou passerelle sans ProblemDetail).
  if (error.status === 0 || (error.status >= 500 && !problem?.detail)) return UNREACHABLE;
  if (problem?.errors?.length) return problem.errors.map((e) => e.message).join(' ');
  if (problem?.detail) return problem.detail;
  return `Erreur ${error.status} du serveur de commande. Réessayez dans un instant.`;
}

/** Toute erreur HTTP alimente le bandeau ; l'écran concerné arrête simplement son action en cours. */
export const apiErrorInterceptor: HttpInterceptorFn = (req, next) => {
  const errors = inject(ApiErrors);
  errors.clear();
  return next(req).pipe(
    tap({ error: (e: unknown) => e instanceof HttpErrorResponse && errors.message.set(errorMessage(e)) }),
  );
};
