import { describe, expect, it } from 'vitest';
import { Identity } from './models';
import { identityErrors, isValidPieceNumber, numberErrors, sepaErrors, sponsorError, terminalErrors } from './validation';

const today = '2026-10-29';
const id: Identity = {
  civilite: 'Mme', nom: 'Dupont', prenom: 'Marie', dateNaissance: '1988-03-14', departementNaissance: '971',
  nationalite: '', pieceType: 'CNI', pieceNumero: '12AB34567', mobileContact: '0690123456', email: 'a@b.fr',
};

describe('identité', () => {
  it('aucune erreur pour une identité complète', () => expect(identityErrors(id, true, today)).toEqual({}));
  it('champs obligatoires', () => {
    const e = identityErrors({ ...id, nom: ' ', prenom: '', dateNaissance: '', pieceNumero: '' }, false, today);
    expect(Object.keys(e).sort()).toEqual(['dateNaissance', 'nom', 'pieceNumero', 'prenom']);
  });
  it('date de naissance dans le futur', () => expect(identityErrors({ ...id, dateNaissance: '2030-01-01' }, false, today).dateNaissance).toBeTruthy());
  it('les champs complets ne sont contrôlés qu’en mode complet', () => {
    const partial = { ...id, departementNaissance: '', mobileContact: '', email: 'x' };
    expect(identityErrors(partial, false, today)).toEqual({});
    expect(Object.keys(identityErrors(partial, true, today)).sort()).toEqual(['departementNaissance', 'email', 'mobileContact']);
  });
  it('n° de pièce : 9 ou 12 caractères', () => {
    expect(isValidPieceNumber('12AB34567')).toBe(true);
    expect(isValidPieceNumber('880692310285')).toBe(true);
    expect(isValidPieceNumber('X1')).toBe(false);
  });
});

describe('numéro d’appel', () => {
  const n = { mode: 'portabilite' as const, msisdn: '', rio: '01P123456ABC', portedMsisdn: '0690112233', operator: 'FREE', portingDate: today };
  it('portabilité complète', () => expect(numberErrors(n, today)).toEqual({}));
  it('portabilité : quatre champs obligatoires', () => {
    expect(Object.keys(numberErrors({ ...n, rio: '', portedMsisdn: '', operator: '', portingDate: '' }, today))).toHaveLength(4);
  });
  it('date de portage passée', () => expect(numberErrors({ ...n, portingDate: '2026-10-28' }, today).portingDate).toBeTruthy());
  it('nouveau numéro à choisir', () => expect(numberErrors({ ...n, mode: 'nouveau' }, today).msisdn).toBeTruthy());
});

describe('Open ML, terminal et SEPA', () => {
  it('sponsor', () => {
    expect(sponsorError(false, '', null)).toBeNull();
    expect(sponsorError(true, '', null)).toContain('Saisissez');
    expect(sponsorError(true, '0690654321', null)).toContain('Vérifier');
    expect(sponsorError(true, '0690654321', false)).toContain('non reconnu');
    expect(sponsorError(true, '0690654321', true)).toBeNull();
  });
  it('terminal', () => {
    expect(terminalErrors({ withTerminal: false, terminalId: '', imei: '' })).toEqual({});
    expect(Object.keys(terminalErrors({ withTerminal: true, terminalId: '', imei: '123' }))).toEqual(['terminalId', 'imei']);
  });
  it('SEPA', () => {
    expect(sepaErrors('Marie Dupont', 'FR76 3000 6000 0112 3456 7890 189')).toEqual({});
    expect(Object.keys(sepaErrors('', 'FR00'))).toEqual(['holder', 'iban']);
  });
});
