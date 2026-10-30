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
  selectedOptions,
  requiresContract,
  simChangeFee,
  stepsFor,
} from './rules';

const offer = (over: Partial<Offer> = {}): Offer => ({
  id: 'o', family: 'bloque', label: 'Offre', detail: '', price: 20,
  openMl: { eligible: true, monthlyDiscount: 10 },
  options: [
    { id: 'a', label: 'A', price: 5, included: false },
    { id: 'b', label: 'B', price: 3, included: false },
    { id: 'inc', label: 'Incluse', price: 0, included: true },
  ],
  promo: null,
  ...over,
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
  it('montant porté par l’offre (5 € en entrée de gamme, 10 € sinon)', () => {
    expect(openMlDiscount(offer({ openMl: { eligible: true, monthlyDiscount: 5 } }))).toBe(5);
    expect(openMlDiscount(offer())).toBe(10);
  });
  it('indisponible pour une offre non éligible et pour une ligne Card', () => {
    expect(isOpenMlAvailable(offer({ family: 'prepaye', openMl: { eligible: false } }))).toBe(false);
    expect(isOpenMlAvailable(offer(), { isCard: true } as Line)).toBe(false);
    expect(isOpenMlAvailable(offer(), { isCard: false } as Line)).toBe(true);
  });
});

describe('mensualité', () => {
  it('additionne les options payantes, déduit Open ML et applique la remise de l’offre', () => {
    const promo = { id: 'p', label: '−10 € / 6 mois', monthlyDiscount: 10, durationMonths: 6 };
    const b = monthly(offer({ price: 22.99, promo }), ['a', 'inc'], true);
    expect(b.total).toBe(17.99);
    expect(b.promo).toEqual({ amount: 10, months: 6, total: 7.99 });
    expect(monthly(offer({ price: 22.99 }), ['a'], true).promo).toBeUndefined();
  });
  it('la remise ne fait jamais passer la mensualité sous zéro', () => {
    const promo = { id: 'p', label: '', monthlyDiscount: 10, durationMonths: 12 };
    expect(monthly(offer({ price: 8, promo }), [], false).promo).toEqual({ amount: 10, months: 12, total: 0 });
  });
  it('option incluse toujours active et gratuite, option non proposée ignorée', () => {
    expect(selectedOptions(offer(), ['a', 'x']).map((o) => o.id)).toEqual(['a', 'inc']);
    expect(monthly(offer(), ['x'], false).total).toBe(20);
  });
  it('ne descend jamais sous zéro', () => {
    expect(monthly(offer({ price: 5, openMl: { eligible: true, monthlyDiscount: 5 } }), [], true).total).toBe(0);
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
  it('différence d’options, sans compter les options incluses', () => {
    expect(optionsDiff(['a'], ['b'], offer())).toEqual({ added: ['b'], removed: ['a'], delta: -2 });
    expect(optionsDiff(['a'], ['a', 'inc'], offer())).toEqual({ added: [], removed: [], delta: 0 });
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
