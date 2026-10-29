import { describe, expect, it } from 'vitest';
import { Identity, Line, Offer } from './models';
import {
  acquisitionCashDue,
  allowedFamilies,
  identityChangeRequiresRescore,
  isOpenMlAvailable,
  isValidIban,
  isValidIccid,
  isValidImei,
  isValidMsisdn,
  isValidRio,
  monthly,
  openMlDiscount,
  optionsDiff,
  requiresContract,
  simChangeFee,
  stepsFor,
} from './rules';

const offer = (over: Partial<Offer> = {}): Offer => ({
  id: 'o', family: 'bloque', label: 'Offre', detail: '', price: 20, entryLevel: false, ...over,
});

const identity: Identity = {
  civilite: 'Mme', nom: 'Dupont', prenom: 'Marie', dateNaissance: '1988-03-14', departementNaissance: '971',
  nationalite: '', pieceType: 'CNI', pieceNumero: '12AB34567', mobileContact: '0690123456', email: 'a@b.fr',
};

describe('score Préventel', () => {
  it('vert : parcours complet', () => expect(allowedFamilies('vert')).toHaveLength(4));
  it('orange : Carte Prépayée uniquement', () => expect(allowedFamilies('orange')).toEqual(['prepaye']));
  it('rouge : aucune vente', () => expect(allowedFamilies('rouge')).toEqual([]));
});

describe('relance de Préventel', () => {
  it('nom, prénom ou date de naissance la relancent', () => {
    expect(identityChangeRequiresRescore(identity, { ...identity, nom: 'Durand' })).toBe(true);
    expect(identityChangeRequiresRescore(identity, { ...identity, prenom: 'Anne' })).toBe(true);
    expect(identityChangeRequiresRescore(identity, { ...identity, dateNaissance: '1990-01-01' })).toBe(true);
  });
  it('les autres champs ne la relancent pas', () => {
    expect(identityChangeRequiresRescore(identity, { ...identity, email: 'x@y.fr', pieceNumero: 'ZZ', nom: ' dupont ' })).toBe(false);
  });
});

describe('remise Open ML', () => {
  it('−5 € pour une offre d’entrée de gamme, −10 € sinon', () => {
    expect(openMlDiscount(offer({ entryLevel: true }))).toBe(5);
    expect(openMlDiscount(offer())).toBe(10);
  });
  it('indisponible pour la Carte Prépayée et pour une ligne Card', () => {
    expect(isOpenMlAvailable(offer({ family: 'prepaye' }))).toBe(false);
    expect(isOpenMlAvailable(offer(), { isCard: true } as Line)).toBe(false);
    expect(isOpenMlAvailable(offer(), { isCard: false } as Line)).toBe(true);
  });
});

describe('mensualité', () => {
  it('additionne options, déduit Open ML et calcule la période de remise', () => {
    const b = monthly(offer({ price: 22.99 }), [{ id: 'a', label: 'A', price: 5 }], true, { offerId: 'o', label: '', amount: 10, months: 6 });
    expect(b.total).toBe(17.99);
    expect(b.promo).toEqual({ amount: 10, months: 6, total: 7.99 });
  });
  it('ne descend jamais sous zéro', () => {
    expect(monthly(offer({ price: 5, entryLevel: true }), [], true).total).toBe(0);
  });
});

describe('montants en caisse', () => {
  it('changement de SIM : 10 € pour perte ou vol uniquement', () => {
    expect(simChangeFee('perte-vol')).toBe(10);
    expect(simChangeFee('mobile')).toBe(0);
    expect(simChangeFee(null)).toBe(0);
  });
  it('acquisition : puce Carte Prépayée à 10 € et terminal', () => {
    expect(acquisitionCashDue(offer({ family: 'prepaye' }), 0)).toBe(10);
    expect(acquisitionCashDue(offer(), 149)).toBe(149);
  });
});

describe('contrat et parcours', () => {
  it('pas de contrat pour une modification d’options', () => {
    expect(requiresContract('options')).toBe(false);
    expect(requiresContract('acquisition')).toBe(true);
    expect(requiresContract('forfait')).toBe(true);
    expect(requiresContract('sim')).toBe(true);
  });
  it('seule l’acquisition a une étape Matériel et paiement', () => {
    expect(stepsFor('acquisition').map((s) => s.label)).toContain('Matériel et paiement');
    for (const flow of ['forfait', 'options', 'sim'] as const) {
      expect(stepsFor(flow).map((s) => s.label)).not.toContain('Matériel et paiement');
    }
  });
  it('différence d’options', () => {
    const catalog = [{ id: 'a', label: 'A', price: 5 }, { id: 'b', label: 'B', price: 3 }];
    expect(optionsDiff(['a'], ['b'], catalog)).toEqual({ added: ['b'], removed: ['a'], delta: -2 });
  });
});

describe('contrôles de saisie', () => {
  it('MSISDN', () => {
    expect(isValidMsisdn('06 90 12 34 56')).toBe(true);
    expect(isValidMsisdn('0590123456')).toBe(false);
    expect(isValidMsisdn('06901234AB')).toBe(false);
  });
  it('RIO', () => {
    expect(isValidRio('01P123456ABC')).toBe(true);
    expect(isValidRio('01X123456ABC')).toBe(false);
  });
  it('IBAN (modulo 97)', () => {
    expect(isValidIban('FR76 3000 6000 0112 3456 7890 189')).toBe(true);
    expect(isValidIban('FR76 3000 6000 0112 3456 7890 188')).toBe(false);
  });
  it('ICCID', () => {
    expect(isValidIccid('8933 0100 0000 0000 001')).toBe(true);
    expect(isValidIccid('1234')).toBe(false);
  });
  it('IMEI (Luhn)', () => {
    expect(isValidImei('490154203237518')).toBe(true);
    expect(isValidImei('490154203237519')).toBe(false);
  });
});
