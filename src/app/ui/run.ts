import { HttpErrorResponse } from '@angular/common/http';
import { WritableSignal } from '@angular/core';

/**
 * Exécute une action qui appelle l'API en affichant l'indicateur d'attente.
 * Une erreur HTTP est déjà affichée en bandeau par l'intercepteur : l'action s'arrête là, l'écran reste utilisable.
 */
export async function run(busy: WritableSignal<boolean> | null, task: () => Promise<void>): Promise<void> {
  busy?.set(true);
  try {
    await task();
  } catch (e) {
    if (!(e instanceof HttpErrorResponse)) throw e;
  } finally {
    busy?.set(false);
  }
}
