import { Component, inject, OnInit } from '@angular/core';
import { ClientScreen } from './screens/client.screen';
import { ConfirmationScreen } from './screens/confirmation.screen';
import { DemandeScreen } from './screens/demande.screen';
import { ForfaitScreen } from './screens/forfait.screen';
import { IdentificationScreen } from './screens/identification.screen';
import { LigneScreen } from './screens/ligne.screen';
import { MaterielScreen } from './screens/materiel.screen';
import { OptionsScreen } from './screens/options.screen';
import { SimScreen } from './screens/sim.screen';
import { SuccesScreen } from './screens/succes.screen';
import { OrderStore } from './store/order.store';
import { Stepper } from './ui/stepper';

@Component({
  selector: 'app-root',
  imports: [
    Stepper,
    IdentificationScreen,
    DemandeScreen,
    ClientScreen,
    ForfaitScreen,
    MaterielScreen,
    LigneScreen,
    OptionsScreen,
    SimScreen,
    ConfirmationScreen,
    SuccesScreen,
  ],
  template: `
    <header class="topbar">
      <span class="logo" aria-hidden="true"></span>
      <span class="brand">Orange Order First</span>
      <span class="who">Conseiller · Boutique</span>
    </header>
    @if (store.screen() === 'succes') {
      <app-succes />
    } @else {
      <div class="shell">
        <app-stepper />
        <main>
          @switch (store.screen()) {
            @case ('identification') { <app-identification /> }
            @case ('demande') { <app-demande /> }
            @case ('client') { <app-client /> }
            @case ('forfait') { <app-forfait /> }
            @case ('materiel') { <app-materiel /> }
            @case ('ligne') { <app-ligne /> }
            @case ('options') { <app-options /> }
            @case ('sim') { <app-sim /> }
            @case ('confirmation') { <app-confirmation /> }
          }
        </main>
      </div>
    }
  `,
})
export class App implements OnInit {
  protected readonly store = inject(OrderStore);

  ngOnInit(): void {
    void this.store.loadCatalog();
  }
}
