package com.orange.rhoc.client;

import com.orange.rhoc.client.model.DiscountRight;
import com.orange.rhoc.client.model.DiscountRightStatus;
import com.orange.rhoc.client.model.PayloadPubSub;
import com.orange.rhoc.client.model.Vertical;
import com.sun.net.httpserver.HttpServer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/** Tests the client against a local stub HTTP server reproducing the RHOC (FastAPI) responses. */
public class RhocClientTest {

    private HttpServer server;
    private RhocClient client;

    private volatile int nextStatus;
    private volatile String nextBody;
    private volatile String nextLocation;
    private volatile String lastMethod;
    private volatile String lastPath;
    private volatile String lastQuery;
    private volatile String lastBody;
    private volatile String lastTraceHeader;

    @Before
    public void start() throws Exception {
        server = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
        server.createContext("/", exchange -> {
            lastMethod = exchange.getRequestMethod();
            lastPath = exchange.getRequestURI().getPath();
            String q = exchange.getRequestURI().getRawQuery();
            lastQuery = q == null ? "" : URLDecoder.decode(q, "UTF-8");
            lastTraceHeader = exchange.getRequestHeaders().getFirst("X-Cloud-Trace-Context");
            lastBody = read(exchange.getRequestBody());
            exchange.getResponseHeaders().add("Content-Type", "application/json");
            if (nextLocation != null) {
                exchange.getResponseHeaders().add("Location", nextLocation);
            }
            byte[] bytes = nextBody.getBytes(StandardCharsets.UTF_8);
            if (bytes.length == 0) {
                exchange.sendResponseHeaders(nextStatus, -1);
            } else {
                exchange.sendResponseHeaders(nextStatus, bytes.length);
                try (OutputStream os = exchange.getResponseBody()) {
                    os.write(bytes);
                }
            }
            exchange.close();
        });
        server.start();
        client = RhocClient.builder().baseUrl("http://127.0.0.1:" + server.getAddress().getPort()).build();
    }

    @After
    public void stop() {
        server.stop(0);
    }

    @Test
    public void getDiscountRightsSendsEnumsFiltersAndTraceHeader() {
        respond(200, "[{\"id\":\"a1\",\"discountRightCode\":\"PARRAIN10\",\"sponsorCid\":\"111\",\"beneficiaryCid\":\"222\","
                + "\"vertical\":\"MOBILE_OAG\",\"status\":\"Consomme\",\"timestamp\":\"2025-01-02T03:04:05Z\",\"pendingOrderId\":\"PO1\"}]");

        List<DiscountRight> rights = client.getDiscountRights(
                DiscountRightsQuery.of(DiscountRightStatus.CONSOMMABLE, Vertical.MOBILE_OAG).beneficiaryCid("222"));

        assertEquals("GET", lastMethod);
        assertEquals("/v0/discountRights", lastPath);
        assertTrue(lastQuery, lastQuery.contains("status=Consommable"));
        assertTrue(lastQuery, lastQuery.contains("vertical=MOBILE_OAG"));
        assertTrue(lastQuery, lastQuery.contains("beneficiaryCid=222"));
        assertFalse("unset filters must not be sent: " + lastQuery, lastQuery.contains("sponsorCid"));
        assertTrue(lastTraceHeader, lastTraceHeader.matches("[0-9a-f]{32}/\\d+;o=1"));

        assertEquals(1, rights.size());
        assertEquals("PARRAIN10", rights.get(0).getDiscountRightCode());
        assertEquals(DiscountRightStatus.CONSOMME, rights.get(0).getStatus());
        assertEquals("2025-01-02T03:04:05Z", rights.get(0).getTimestamp());
    }

    @Test
    public void getDiscountRightsWithGivenTraceContext() {
        respond(200, "[]");
        List<DiscountRight> rights = client.getDiscountRights(
                DiscountRightsQuery.of(DiscountRightStatus.ALL, Vertical.MOBILE_OAG).pendingOrderId("PO1"), "abc/1;o=1");
        assertEquals("abc/1;o=1", lastTraceHeader);
        assertTrue(lastQuery, lastQuery.contains("status=All"));
        assertTrue(rights.isEmpty());
    }

    @Test
    public void invalidParameterError() {
        respond(400, "{\"code\":28,\"message\":\"Invalid query-string parameter\",\"description\":\"One or more query-string parameters are not expected value.\"}");
        try {
            client.getDiscountRights(DiscountRightsQuery.of(DiscountRightStatus.ALL, Vertical.MOBILE_OAG));
            fail("RhocApiException expected");
        } catch (RhocApiException e) {
            assertEquals(400, e.getStatus());
            assertEquals(Integer.valueOf(28), e.getErrorCode());
            assertEquals("Invalid query-string parameter", e.getErrorMessage());
        }
    }

    @Test
    public void fastApiValidationError() {
        respond(422, "{\"detail\":[{\"loc\":[\"query\",\"status\"],\"msg\":\"field required\",\"type\":\"value_error.missing\"}]}");
        try {
            client.getDiscountRights(DiscountRightsQuery.of(DiscountRightStatus.ALL, Vertical.MOBILE_OAG));
            fail("RhocApiException expected");
        } catch (RhocApiException e) {
            assertEquals(422, e.getStatus());
            assertNull(e.getErrorCode());
            assertEquals("status", e.getJson().get("detail").get(0).get("loc").get(1).asText());
        }
    }

    @Test
    public void serviceUnavailable() {
        respond(503, "{\"code\":5,\"message\":\"API Temporarily Unavailable\"}");
        try {
            client.getDiscountRights(DiscountRightsQuery.of(DiscountRightStatus.ALL, Vertical.MOBILE_OAG));
            fail("RhocApiException expected");
        } catch (RhocApiException e) {
            assertTrue(e.isServiceUnavailable());
            assertEquals(Integer.valueOf(5), e.getErrorCode());
        }
    }

    @Test
    public void pubsubCreated() {
        respond(201, "[{\"id\":\"a1\",\"discountRightCode\":\"PARRAIN10\",\"status\":\"Consommable\"}]");

        PayloadPubSub payload = RhocClient.pubSubPayload("{\"customerOrderID\":\"PO1\"}", "projects/p/subscriptions/s");
        PubSubResult result = client.handlePubSubMessage(payload);

        assertEquals("POST", lastMethod);
        assertEquals("/v0/discountRights/pubsub", lastPath);
        assertTrue(lastBody, lastBody.contains("\"subscription\":\"projects/p/subscriptions/s\""));
        assertTrue(lastBody, lastBody.contains("\"message_id\":"));
        assertTrue(lastBody, lastBody.contains("\"messageId\":"));
        String data = Base64.getEncoder().encodeToString("{\"customerOrderID\":\"PO1\"}".getBytes(StandardCharsets.UTF_8));
        assertTrue(lastBody, lastBody.contains("\"data\":\"" + data + "\""));

        assertTrue(result.isCreated());
        assertEquals("PARRAIN10", result.getDiscountRights().get(0).getDiscountRightCode());
    }

    @Test
    public void pubsubNotTreated() {
        respond(200, "{\"code\":2,\"message\":\"Invalid payload\",\"description\":\"bad\"}");
        PubSubResult result = client.handlePubSubMessage(RhocClient.pubSubPayload("{}", "s"));
        assertTrue(result.isNotTreated());
        assertEquals(Integer.valueOf(2), result.getNotTreated().getCode());
        assertTrue(result.getDiscountRights().isEmpty());
    }

    @Test
    public void pubsubNoContentWithLocation() {
        respond(204, "");
        nextLocation = "/v0/discountRights?vertical=MOBILE_OAG&status=All&pendingOrderId=PO1";
        PubSubResult result = client.handlePubSubMessage(RhocClient.pubSubPayload("{}", "s"));
        assertTrue(result.isNoContent());
        assertEquals("/v0/discountRights?vertical=MOBILE_OAG&status=All&pendingOrderId=PO1", result.getLocation());
    }

    @Test
    public void pubsubForbidden() {
        respond(403, "{\"code\":3,\"message\":\"Forbidden\",\"description\":\"Your token is not valid\"}");
        try {
            client.handlePubSubMessage(RhocClient.pubSubPayload("{}", "s"));
            fail("RhocApiException expected");
        } catch (RhocApiException e) {
            assertTrue(e.isForbidden());
            assertEquals("Your token is not valid", e.getErrorDescription());
        }
    }

    private void respond(int status, String body) {
        nextStatus = status;
        nextBody = body;
        nextLocation = null;
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
