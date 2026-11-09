package com.orange.iml.client;

import com.orange.iml.client.model.OutParamatersUntokenize;
import com.orange.iml.client.model.OutParametersTokenize;
import com.orange.iml.client.model.Token;
import com.orange.iml.client.model.TokenizedBankAccount;
import com.orange.iml.client.model.UntokenizedBankAccount;

/**
 * Example: tokenize an IBAN, then untokenize the token.
 * <p>
 * {@code mvn compile exec:java -Dexec.args="<baseUrl> <appId> <iban>"}
 */
public final class ImlClientMain {

    public static void main(String[] args) {
        String baseUrl = args.length > 0 ? args[0] : ImlClient.DEFAULT_BASE_URL;
        String appId = args.length > 1 ? args[1] : "CLEMENTINE";
        String iban = args.length > 2 ? args[2] : "FR7630006000011234567890189";

        ImlClient iml = ImlClient.builder()
                .baseUrl(baseUrl)
                .appId(appId)
                .build();

        try {
            OutParametersTokenize tokenized = iml.tokenize(iban);
            for (TokenizedBankAccount account : ImlClient.orEmpty(tokenized.getTokenizedBankAccounts())) {
                Token t = account.getToken();
                String token = t.getCodeIban() + t.getBankIdentifier() + t.getBankBranchIdentifier()
                        + t.getAccountNumber() + t.getRibCheckDigits();
                System.out.println("uid=" + account.getUid() + " status=" + account.getStatus()
                        + " bic=" + account.getCodeBic() + " token=" + token);

                OutParamatersUntokenize untokenized = iml.untokenize(token);
                for (UntokenizedBankAccount back : ImlClient.orEmpty(untokenized.getUntokenizedBankAccounts())) {
                    System.out.println("  -> untokenized status=" + back.getStatus() + " bank=" + back.getBankName());
                }
            }
        } catch (ImlApiException e) {
            // 400 invalid input, 503 OPSI unavailable, 500 internal error
            System.err.println(e.getMessage());
        } catch (javax.ws.rs.ProcessingException e) {
            // connection refused, timeout...
            System.err.println("Technical error: " + e.getMessage());
        }
    }
}
