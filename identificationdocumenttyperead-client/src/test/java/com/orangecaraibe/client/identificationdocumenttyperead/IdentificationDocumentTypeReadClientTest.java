package com.orangecaraibe.client.identificationdocumenttyperead;

import com.ericsson.services.ws_cil_7.IdentificationDocumentTypeReadService;
import com.ericsson.services.ws_cil_7.identificationdocumenttyperead.IdentificationDocumentTypeReadResponse;
import com.ericsson.services.ws_cil_7.identificationdocumenttyperead.ListOfIdentificationDocumentTypeListpartResponse;
import com.sun.net.httpserver.HttpServer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.xml.ws.soap.SOAPFaultException;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/** Calls the generated client against a fake SOAP endpoint (JDK HttpServer) returning canned responses. */
class IdentificationDocumentTypeReadClientTest {

    private static final String OK = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"><soapenv:Body>"
            + "<ns:identificationDocumentTypeReadResponse xmlns:ns=\"http://ericsson.com/services/ws_CIL_7/identificationdocumenttyperead\">"
            + "<ns:listOfIdentificationDocumentType>"
            + "<ns:item><ns:idtypeCode>1</ns:idtypeCode><ns:idtypeName>Carte nationale d'identité</ns:idtypeName></ns:item>"
            + "<ns:item><ns:idtypeCode>2</ns:idtypeCode><ns:idtypeName>Passeport</ns:idtypeName></ns:item>"
            + "</ns:listOfIdentificationDocumentType>"
            + "<ns:idtypeDef>1</ns:idtypeDef>"
            + "</ns:identificationDocumentTypeReadResponse></soapenv:Body></soapenv:Envelope>";

    private static final String EMPTY = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"><soapenv:Body>"
            + "<ns:identificationDocumentTypeReadResponse xmlns:ns=\"http://ericsson.com/services/ws_CIL_7/identificationdocumenttyperead\"/>"
            + "</soapenv:Body></soapenv:Envelope>";

    private static final String FAULT = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"><soapenv:Body>"
            + "<soapenv:Fault><faultcode>soapenv:Server</faultcode><faultstring>RC1234 Session invalide</faultstring></soapenv:Fault>"
            + "</soapenv:Body></soapenv:Envelope>";

    private HttpServer server;
    private volatile String lastRequest;
    private volatile String nextResponse = OK;
    private volatile int nextStatus = 200;

    @BeforeEach
    void start() throws Exception {
        server = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
        server.createContext("/wsi/services", exchange -> {
            lastRequest = read(exchange.getRequestBody());
            byte[] body = nextResponse.getBytes(StandardCharsets.UTF_8);
            exchange.getResponseHeaders().add("Content-Type", "text/xml; charset=UTF-8");
            exchange.sendResponseHeaders(nextStatus, body.length);
            try (OutputStream out = exchange.getResponseBody()) {
                out.write(body);
            }
        });
        server.start();
    }

    @AfterEach
    void stop() {
        server.stop(0);
    }

    private IdentificationDocumentTypeReadService port() {
        return new IdentificationDocumentTypeReadClientFactory()
                .address("http://127.0.0.1:" + server.getAddress().getPort() + "/wsi/services")
                .create();
    }

    @Test
    void readsDocumentTypesAndDefault() {
        IdentificationDocumentTypeReadResponse response =
                IdentificationDocumentTypeReadClientMain.read(port(), Collections.<String, String>emptyMap());

        List<ListOfIdentificationDocumentTypeListpartResponse> types = IdentificationDocumentTypeReadClientMain.types(response);
        assertEquals(2, types.size());
        assertEquals(Long.valueOf(1), types.get(0).getIdtypeCode());
        assertEquals("Carte nationale d'identité", types.get(0).getIdtypeName());
        assertEquals("Passeport", types.get(1).getIdtypeName());
        assertEquals(Long.valueOf(1), response.getIdtypeDef());

        assertTrue(lastRequest.contains("identificationDocumentTypeReadRequest"), lastRequest);
        assertTrue(lastRequest.contains("http://ericsson.com/services/ws_CIL_7/identificationdocumenttyperead"), lastRequest);
        assertFalse(lastRequest.contains("sessionChangeRequest"), lastRequest);
    }

    @Test
    void sendsSessionValues() {
        Map<String, String> session = Collections.singletonMap("BU_ID", "2");
        IdentificationDocumentTypeReadClientMain.read(port(), session);

        String compact = lastRequest.replaceAll("\\s", "");
        assertTrue(compact.contains("sessionChangeRequest"), lastRequest);
        assertTrue(compact.matches(".*<([a-z0-9]+:)?key>BU_ID</([a-z0-9]+:)?key><([a-z0-9]+:)?value>2</([a-z0-9]+:)?value>.*"), lastRequest);
    }

    @Test
    void emptyResponseGivesNoTypes() {
        nextResponse = EMPTY;
        IdentificationDocumentTypeReadResponse response =
                IdentificationDocumentTypeReadClientMain.read(port(), Collections.<String, String>emptyMap());
        assertTrue(IdentificationDocumentTypeReadClientMain.types(response).isEmpty());
        assertNull(response.getIdtypeDef());
    }

    @Test
    void soapFaultIsThrown() {
        nextResponse = FAULT;
        nextStatus = 500;
        SOAPFaultException e = assertThrows(SOAPFaultException.class,
                () -> IdentificationDocumentTypeReadClientMain.read(port(), Collections.<String, String>emptyMap()));
        assertTrue(e.getMessage().contains("RC1234"), e.getMessage());
    }

    private static String read(InputStream in) throws java.io.IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[4096];
        for (int n; (n = in.read(buf)) > 0; ) {
            out.write(buf, 0, n);
        }
        return new String(out.toByteArray(), StandardCharsets.UTF_8);
    }
}
