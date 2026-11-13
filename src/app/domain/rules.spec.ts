import { describe, expect, it } from 'vitest';
import { Identity, Line, Offer, OfferOption, Terminal } from './models';
import {
  acquisitionCashDue,
  allowedFamilies,
  blockedOptions,
  compatibleOptions,
  withOption,
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
  terminalBrands,
  terminalPrice,
} from './rules';

const opt = (id: string, price: number, over: Partial<OfferOption> = {}): OfferOption => ({
  id, label: id.toUpperCase(), price, included: false, incompatibleOptions: [], ...over,
});

const offer = (over: Partial<Offer> = {}): Offer => ({
  id: 'o', family: 'bloque', level: 'silver', label: 'Offre', detail: '', price: 20,
  openMl: { eligible: true, monthlyDiscount: 10 },
  options: [opt('a', 5), opt('b', 3), opt('inc', 0, { label: 'Incluse', included: true })],
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

describe('options incompatibles', () => {
  // c est incompatible avec a (déclaré sur c seulement) ; d est incompatible avec l'option incluse.
  const withRules = offer({
    options: [opt('a', 5), opt('b', 3), opt('c', 9, { incompatibleOptions: ['a'] }), opt('d', 2), opt('inc', 0, { included: true, incompatibleOptions: ['d'] })],
  });

  it('une option active grise uniquement les options de sa propre liste', () => {
    expect([...blockedOptions(withRules, ['c'])]).toEqual([['a', 'C'], ['d', 'INC']]);
    // a ne liste rien : la liste de c (non cochée) n'a aucun effet.
    expect([...blockedOptions(withRules, ['a'])]).toEqual([['d', 'INC']]);
  });
  it('une option qui exclut une option incluse est grisée', () => {
    const o = offer({ options: [opt('x', 1, { incompatibleOptions: ['inc'] }), opt('inc', 0, { label: 'Incluse', included: true })] });
    expect([...blockedOptions(o, [])]).toEqual([['x', 'Incluse']]);
  });
  it('cocher une option décoche les options de sa liste', () => {
    expect(withOption(withRules, ['a', 'b'], 'c')).toEqual(['b', 'c']);
    expect(withOption(withRules, ['c'], 'a')).toEqual(['c', 'a']);
    expect(withOption(withRules, ['a'], 'a')).toEqual(['a']);
  });
  it('catalogue réel : les listes en escalier ne grisent que les options listées', () => {
    const ids = ['prev', 'sva', 'blocage', 'cine', 'tv'];
    const real = offer({ options: ids.map((id, i) => opt(id, 0, { incompatibleOptions: ids.slice(0, i) })) });
    expect([...blockedOptions(real, ['prev']).keys()]).toEqual([]);
    expect([...blockedOptions(real, ['cine']).keys()]).toEqual(['prev', 'sva', 'blocage']);
    expect([...blockedOptions(real, ['tv']).keys()]).toEqual(['prev', 'sva', 'blocage', 'cine']);
  });
  it('une option incluse bloque toujours ses incompatibles', () => {
    expect([...blockedOptions(withRules, [])]).toEqual([['d', 'INC']]);
  });
  it('sans offre, rien n’est bloqué', () => expect(blockedOptions(undefined, ['a']).size).toBe(0));
  it('changement d’offre : on retire les options incompatibles, incluses ou non proposées', () => {
    expect(compatibleOptions(withRules, ['a', 'c', 'b'])).toEqual(['c', 'b']);
    expect(compatibleOptions(withRules, ['c', 'a'])).toEqual(['c']);
    expect(compatibleOptions(withRules, ['d', 'inc', 'x'])).toEqual([]);
  });
});

describe('terminaux', () => {
  const t: Terminal = {
    id: 'ip16', brand: 'APPLE', model: 'iPhone 16', prices: { nonsub: 969, card: 969, silver: 829, gold: 689, elite: 619, platine: 549 },
    colors: [{ id: 'ip16-bleu', label: 'bleu' }, { id: 'ip16-noir', label: 'noir' }],
  };
  it('prix selon le niveau de l’offre', () => {
    expect(terminalPrice(t, offer({ level: 'silver' }))).toBe(829);
    expect(terminalPrice(t, offer({ level: 'gold' }))).toBe(689);
    expect(terminalPrice(t, offer({ level: 'nonsub' }))).toBe(969);
    expect(terminalPrice(t, offer({ level: 'platine' }))).toBe(549);
  });
  it('marques distinctes et triées', () => {
    expect(terminalBrands([{ ...t, brand: 'SAMSUNG' }, t, { ...t, brand: 'ALCATEL' }])).toEqual(['ALCATEL', 'APPLE', 'SAMSUNG']);
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
