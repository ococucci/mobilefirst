package com.orange.iml.client;

import com.orange.iml.client.model.OutParamatersUntokenize;
import com.orange.iml.client.model.OutParametersTokenize;
import com.orange.iml.client.model.TokenizedBankAccount;
import com.sun.net.httpserver.HttpServer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/** Tests the client against a local stub HTTP server reproducing the IML responses. */
public class ImlClientTest {

    private HttpServer server;
    private ImlClient client;

    private volatile int nextStatus;
    private volatile String nextContentType;
    private volatile String nextBody;
    private volatile String lastRequestBody;
    private volatile String lastRequestPath;

    @Before
    public void start() throws Exception {
        server = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
        server.createContext("/iban-management-layer/ws/api", exchange -> {
            lastRequestPath = exchange.getRequestURI().getPath();
            lastRequestBody = read(exchange.getRequestBody());
            byte[] bytes = nextBody.getBytes(StandardCharsets.UTF_8);
            exchange.getResponseHeaders().add("Content-Type", nextContentType);
            exchange.sendResponseHeaders(nextStatus, bytes.length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(bytes);
            }
        });
        server.start();
        client = ImlClient.builder()
                .baseUrl("http://127.0.0.1:" + server.getAddress().getPort() + "/iban-management-layer/ws/api")
                .appId("CLEMENTINE")
                .userId("CUID")
                .build();
    }

    @After
    public void stop() {
        server.stop(0);
    }

    @Test
    public void tokenizeSuccess() {
        respond(200, "application/json", "{\"appId\":\"CLEMENTINE\",\"userId\":\"CUID\",\"tokenizedBankAccounts\":[{"
                + "\"uid\":\"1\",\"token\":{\"codeIban\":\"FR79\",\"bankIdentifier\":\"30006\",\"bankBranchIdentifier\":\"00148\","
                + "\"accountNumber\":\"YZPWWLX8901\",\"ribCheckDigits\":\"01\"},\"bankName\":\"CREDIT AGRICOLE S A\","
                + "\"bankBranchName\":\"FRANCE\",\"codeBic\":\"AGRIFRPPXXX\",\"status\":\"TOKENIZED\",\"unknownField\":true}]}");

        OutParametersTokenize out = client.tokenize("FR7630006000011234567890189");

        assertEquals("/iban-management-layer/ws/api/tokenize", lastRequestPath);
        assertTrue(lastRequestBody, lastRequestBody.contains("\"appId\":\"CLEMENTINE\""));
        assertTrue(lastRequestBody, lastRequestBody.contains("\"uniqueBankAccounts\":[{\"uid\":\"1\",\"bankAccount\":\"FR7630006000011234567890189\"}]"));

        TokenizedBankAccount account = out.getTokenizedBankAccounts().get(0);
        assertEquals("TOKENIZED", account.getStatus());
        assertEquals("AGRIFRPPXXX", account.getCodeBic());
        assertEquals("YZPWWLX8901", account.getToken().getAccountNumber());
    }

    @Test
    public void untokenizeSuccess() {
        respond(200, "application/json", "{\"appId\":\"CLEMENTINE\",\"untokenizedBankAccounts\":[{\"uid\":\"1\","
                + "\"iban\":\"FR7630006000011234567890189\",\"rib\":{\"bankIdentifier\":\"30006\"},\"status\":\"UNTOKENIZED\"}]}");

        OutParamatersUntokenize out = client.untokenize("FR793000600148YZPWWLX890101");

        assertEquals("/iban-management-layer/ws/api/untokenize", lastRequestPath);
        assertTrue(lastRequestBody, lastRequestBody.contains("\"uniqueTokens\":[{\"uid\":\"1\",\"token\":\"FR793000600148YZPWWLX890101\"}]"));
        assertEquals("FR7630006000011234567890189", out.getUntokenizedBankAccounts().get(0).getIban());
        assertEquals("30006", out.getUntokenizedBankAccounts().get(0).getRib().getBankIdentifier());
    }

    @Test
    public void badRequestJsonError() {
        respond(400, "application/json", "{\"code\":4000,\"message\":\"Invalid or missing string\"}");
        try {
            client.tokenize("bad");
            fail("ImlApiException expected");
        } catch (ImlApiException e) {
            assertTrue(e.isBadRequest());
            assertEquals("4000", e.getErrorCode());
            assertEquals("Invalid or missing string", e.getError().getMessage());
        }
    }

    @Test
    public void serviceUnavailableTextPlainError() {
        respond(503, "text/plain", "{\"code\":5030,\"message\":\"OPSI unreachable\",\"appId\":\"KARANBOL\"}");
        try {
            client.untokenize("FR793000600148YZPWWLX890101");
            fail("ImlApiException expected");
        } catch (ImlApiException e) {
            assertTrue(e.isServiceUnavailable());
            assertNotNull(e.getError());
            assertEquals("5030", e.getErrorCode());
            assertEquals("KARANBOL", e.getError().getAppId());
        }
    }

    @Test
    public void internalErrorNonJsonBody() {
        respond(500, "text/plain", "boom");
        try {
            client.tokenize("FR7630006000011234567890189");
            fail("ImlApiException expected");
        } catch (ImlApiException e) {
            assertEquals(500, e.getStatus());
            assertEquals("boom", e.getRawBody());
            assertEquals(null, e.getError());
        }
    }

    private void respond(int status, String contentType, String body) {
        nextStatus = status;
        nextContentType = contentType;
        nextBody = body;
    }

    private static String read(InputStream in) throws java.io.IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[4096];
        int n;
        while ((n = in.read(buf)) > 0) {
            out.write(buf, 0, n);
        }
        return new String(out.toByteArray(), StandardCharsets.UTF_8);
    }
}
