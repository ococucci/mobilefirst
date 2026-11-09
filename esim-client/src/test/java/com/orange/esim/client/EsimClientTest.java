package com.orange.esim.client;

import com.orange.esim.client.model.AllocateProfileRequest;
import com.orange.esim.client.model.AllocateProfileResponse;
import com.orange.esim.client.model.DeliverProfileRequest;
import com.orange.esim.client.model.DeliverProfileResponse;
import com.orange.esim.client.model.ESimProfile;
import com.orange.esim.client.model.GetProfileResponse;
import com.orange.esim.client.model.GetStatusResponse;
import com.orange.esim.client.model.ServiceOrder;
import com.orange.esim.client.model.ServiceOrderCreate;
import com.orange.esim.client.model.ServiceOrderItem;
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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/** Tests the client against a local stub HTTP server reproducing the enabler-esim responses. */
public class EsimClientTest {

    private HttpServer server;
    private EsimClient client;

    private volatile int nextStatus;
    private volatile String nextBody;
    private volatile String lastMethod;
    private volatile String lastPath;
    private volatile String lastBody;
    private volatile String lastContentType;
    private volatile String lastAppIdHeader;
    private volatile String lastUserIdHeader;

    @Before
    public void start() throws Exception {
        server = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
        server.createContext(EsimClient.BASE_PATH, exchange -> {
            lastMethod = exchange.getRequestMethod();
            lastPath = exchange.getRequestURI().getPath();
            lastContentType = exchange.getRequestHeaders().getFirst("Content-Type");
            lastAppIdHeader = exchange.getRequestHeaders().getFirst("X-ORANGE-Application-Id");
            lastUserIdHeader = exchange.getRequestHeaders().getFirst("X-ORANGE-User-Id");
            lastBody = read(exchange.getRequestBody());
            byte[] bytes = nextBody.getBytes(StandardCharsets.UTF_8);
            exchange.getResponseHeaders().add("Content-Type", "application/json");
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
        client = EsimClient.builder()
                .baseUrl("http://127.0.0.1:" + server.getAddress().getPort() + EsimClient.BASE_PATH)
                .applicationId("MYAPP")
                .userId("CUID")
                .build();
    }

    @After
    public void stop() {
        server.stop(0);
    }

    @Test
    public void allocateSendsJsonAndHeaders() {
        // /profiles/allocate declares no "consumes" in the Swagger: the client must still send JSON
        respond(200, "{\"iccid\":\"89330000000000000001\",\"imsi\":\"208010000000001\"}");

        AllocateProfileResponse out = client.allocateProfile(new AllocateProfileRequest().profileType("P9054-2").cid("590690000000"));

        assertEquals("POST", lastMethod);
        assertEquals(EsimClient.BASE_PATH + "/profiles/allocate", lastPath);
        assertTrue(lastContentType, lastContentType.startsWith("application/json"));
        assertEquals("MYAPP", lastAppIdHeader);
        assertEquals("CUID", lastUserIdHeader);
        assertTrue(lastBody, lastBody.contains("\"profileType\":\"P9054-2\""));
        assertTrue(lastBody, lastBody.contains("\"cid\":\"590690000000\""));
        assertEquals("89330000000000000001", out.getIccid());
        assertEquals("208010000000001", out.getImsi());
    }

    @Test
    public void deliverWithPathParam() {
        respond(200, "{\"iccid\":\"89330000000000000001\",\"activationCode\":\"LPA:1$smdp.example$MATCH\"}");

        DeliverProfileResponse out = client.deliverProfile("89330000000000000001", new DeliverProfileRequest().deliveryMode("AC"));

        assertEquals(EsimClient.BASE_PATH + "/profiles/89330000000000000001/deliver", lastPath);
        assertTrue(lastContentType, lastContentType.startsWith("application/json"));
        assertTrue(lastBody, lastBody.contains("\"deliveryMode\":\"AC\""));
        assertEquals("LPA:1$smdp.example$MATCH", out.getActivationCode());
    }

    @Test
    public void getProfileAndStatus() {
        respond(200, "{\"iccid\":\"8933\",\"imsi\":\"2080\",\"profileType\":\"P9054-2\",\"profileStatus\":\"RELEASED\","
                + "\"lastOperationDone\":\"deliver\",\"lastOperationResult\":\"failed\","
                + "\"lastOperationErrorDetails\":{\"source\":{\"name\":\"SMDP\",\"httpCode\":500,\"error\":\"boom\"}}}");
        GetProfileResponse profile = client.getProfileByIccid("8933");
        assertEquals("GET", lastMethod);
        assertEquals(EsimClient.BASE_PATH + "/profiles/8933", lastPath);
        assertEquals("RELEASED", profile.getProfileStatus());
        assertEquals(Integer.valueOf(500), profile.getLastOperationErrorDetails().getSource().getHttpCode());

        respond(200, "{\"name\":\"profiles\",\"status\":\"ok\",\"version\":\"2.0\"}");
        GetStatusResponse status = client.getStatus();
        assertEquals(EsimClient.BASE_PATH + "/profiles/status", lastPath);
        assertEquals("ok", status.getStatus());
    }

    @Test
    public void serviceOrderWithTypeFieldsAndEnums() {
        respond(200, "{\"state\":\"acknowledged\",\"serviceOrderItem\":[{\"id\":\"1\",\"action\":\"preparation\","
                + "\"service\":{\"msisdn\":\"590690000000\",\"@type\":\"ESimProfile\"}}]}");

        ServiceOrderCreate create = new ServiceOrderCreate().addServiceOrderItemItem(new ServiceOrderItem()
                .id("1")
                .action(ServiceOrderItem.ActionEnum.PREPARATION)
                .service(new ESimProfile().msisdn("590690000000").profileType("P9054-2").atType("ESimProfile")));
        ServiceOrder order = client.createServiceOrder(create);

        assertEquals(EsimClient.BASE_PATH + "/serviceOrder", lastPath);
        assertTrue(lastBody, lastBody.contains("\"action\":\"preparation\""));
        assertTrue(lastBody, lastBody.contains("\"@type\":\"ESimProfile\""));
        // the jaxrs-cxf-client generator exposes enum getters as their String value
        assertEquals("acknowledged", order.getState());
        assertEquals("ESimProfile", order.getServiceOrderItem().get(0).getService().getAtType());
    }

    @Test
    public void notFoundError() {
        respond(404, "{\"code\":\"PROFILE_NOT_FOUND\",\"message\":\"No profile\"}");
        try {
            client.getProfileByIccid("unknown");
            fail("EsimApiException expected");
        } catch (EsimApiException e) {
            assertTrue(e.isNotFound());
            assertEquals("PROFILE_NOT_FOUND", e.getErrorCode());
            assertEquals("No profile", e.getError().getMessage());
            assertNull(e.getSourceError());
        }
    }

    @Test
    public void failedDependencySourceError() {
        respond(424, "{\"source\":{\"name\":\"SMDP+\",\"httpCode\":503,\"error\":\"unavailable\"}}");
        try {
            client.allocateProfile(new AllocateProfileRequest().profileType("P9054-2"));
            fail("EsimApiException expected");
        } catch (EsimApiException e) {
            assertTrue(e.isFailedDependency());
            assertNotNull(e.getSourceError());
            assertEquals("SMDP+", e.getSourceError().getSource().getName());
            assertEquals(Integer.valueOf(503), e.getSourceError().getSource().getHttpCode());
            assertNull(e.getError());
        }
    }

    @Test
    public void serviceOrderEsimProfileError() {
        respond(400, "{\"code\":\"INVALID\",\"message\":\"bad msisdn\",\"data\":{\"iccid\":\"8933\",\"profileStatus\":\"ERROR\"}}");
        try {
            client.createServiceOrder(new ServiceOrderCreate());
            fail("EsimApiException expected");
        } catch (EsimApiException e) {
            assertEquals(400, e.getStatus());
            assertEquals("INVALID", e.getEsimProfileError().getCode());
            assertEquals("8933", e.getEsimProfileError().getData().getIccid());
        }
    }

    @Test
    public void notificationWithEmptyResponse() {
        respond(204, "");
        client.handleDownloadProgressInfo(new com.orange.esim.client.model.HandleDownloadProgressInfoRequest()
                .iccid("8933").profileType("P9054-2").timestamp("2001-12-17T09:30:47Z").notificationPointId(1));
        assertEquals(EsimClient.BASE_PATH + "/gsma/rsp2/es2plus/handleDownloadProgressInfo", lastPath);
        assertTrue(lastBody, lastBody.contains("\"notificationPointId\":1"));
    }

    private void respond(int status, String body) {
        nextStatus = status;
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
