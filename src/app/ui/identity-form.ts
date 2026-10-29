import { Component, input } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { DEPARTEMENTS, Identity } from '../domain/models';
import { identityErrors } from '../domain/validation';
import { FieldError } from './field-error';

/** Saisie du titulaire. En mode réduit : champs utiles au contrôle Préventel et à l'existence. */
@Component({
  selector: 'app-identity-form',
  imports: [FormsModule, FieldError],
  template: `
    @let i = identity();
    <div class="grid2">
      <div class="field">
        <span class="label">Civilité</span>
        <div class="seg" role="radiogroup" aria-label="Civilité">
          <button type="button" role="radio" [attr.aria-checked]="i.civilite === 'M.'" [class.on]="i.civilite === 'M.'" (click)="i.civilite = 'M.'">M.</button>
          <button type="button" role="radio" [attr.aria-checked]="i.civilite === 'Mme'" [class.on]="i.civilite === 'Mme'" (click)="i.civilite = 'Mme'">Mme</button>
        </div>
      </div>
      @if (full()) {
        <div class="field">
          <label for="nat">Nationalité (facultatif)</label>
          <input id="nat" [(ngModel)]="i.nationalite" autocomplete="off" />
        </div>
      } @else {
        <div></div>
      }
      <div class="field">
        <label for="nom">Nom</label>
        <input id="nom" [(ngModel)]="i.nom" autocomplete="off" [class.ko]="err('nom')" [attr.aria-invalid]="!!err('nom')" aria-describedby="nom-error" />
        <app-field-error for="nom" [message]="err('nom')" />
      </div>
      <div class="field">
        <label for="prenom">Prénom</label>
        <input id="prenom" [(ngModel)]="i.prenom" autocomplete="off" [class.ko]="err('prenom')" [attr.aria-invalid]="!!err('prenom')" aria-describedby="prenom-error" />
        <app-field-error for="prenom" [message]="err('prenom')" />
      </div>
      <div class="field">
        <label for="dob">Date de naissance</label>
        <input id="dob" type="date" [(ngModel)]="i.dateNaissance" [max]="today" [class.ko]="err('dateNaissance')" [attr.aria-invalid]="!!err('dateNaissance')" aria-describedby="dob-error" />
        <app-field-error for="dob" [message]="err('dateNaissance')" />
      </div>
      @if (full()) {
        <div class="field">
          <label for="dep">Département de naissance</label>
          <select id="dep" [(ngModel)]="i.departementNaissance" [class.ko]="err('departementNaissance')" [attr.aria-invalid]="!!err('departementNaissance')" aria-describedby="dep-error">
            <option value="" disabled>Choisir</option>
            @for (d of departements; track d) { <option [value]="d">{{ d }}</option> }
          </select>
          <app-field-error for="dep" [message]="err('departementNaissance')" />
        </div>
      } @else {
        <div></div>
      }
      <div class="field">
        <span class="label">Type de pièce d'identité</span>
        <div class="seg" role="radiogroup" aria-label="Type de pièce">
          <button type="button" role="radio" [attr.aria-checked]="i.pieceType === 'CNI'" [class.on]="i.pieceType === 'CNI'" (click)="i.pieceType = 'CNI'">Carte d'identité</button>
          <button type="button" role="radio" [attr.aria-checked]="i.pieceType === 'PASSEPORT'" [class.on]="i.pieceType === 'PASSEPORT'" (click)="i.pieceType = 'PASSEPORT'">Passeport</button>
        </div>
      </div>
      <div class="field">
        <label for="piece">N° de la pièce</label>
        <input id="piece" [(ngModel)]="i.pieceNumero" autocomplete="off" [class.ko]="err('pieceNumero')" [attr.aria-invalid]="!!err('pieceNumero')" aria-describedby="piece-error" />
        <app-field-error for="piece" [message]="err('pieceNumero')" />
      </div>
      @if (full()) {
        <div class="field">
          <label for="mob">Mobile de contact</label>
          <input id="mob" type="tel" inputmode="tel" [(ngModel)]="i.mobileContact" [class.ko]="err('mobileContact')" [attr.aria-invalid]="!!err('mobileContact')" aria-describedby="mob-error" />
          <app-field-error for="mob" [message]="err('mobileContact')" />
        </div>
        <div class="field">
          <label for="mail">Email</label>
          <input id="mail" type="email" inputmode="email" [(ngModel)]="i.email" [class.ko]="err('email')" [attr.aria-invalid]="!!err('email')" aria-describedby="mail-error" />
          <app-field-error for="mail" [message]="err('email')" />
        </div>
      }
    </div>
  `,
})
export class IdentityForm {
  readonly identity = input.required<Identity>();
  readonly full = input(false);
  /** Les erreurs ne s'affichent qu'après une première tentative de validation. */
  readonly showErrors = input(false);
  protected readonly departements = DEPARTEMENTS;
  protected readonly today = new Date().toISOString().slice(0, 10);

  protected err(field: keyof Identity): string | null {
    if (!this.showErrors()) return null;
    return identityErrors(this.identity(), this.full())[field] ?? null;
  }
}

export function identityComplete(i: Identity, full = false): boolean {
  return Object.keys(identityErrors(i, full)).length === 0;
}
