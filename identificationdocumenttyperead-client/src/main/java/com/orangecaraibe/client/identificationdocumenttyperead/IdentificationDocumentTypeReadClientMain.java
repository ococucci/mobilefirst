package com.orangecaraibe.client.identificationdocumenttyperead;

import com.ericsson.services.ws_cil_7.IdentificationDocumentTypeReadService;
import com.ericsson.services.ws_cil_7.identificationdocumenttyperead.IdentificationDocumentTypeReadRequest;
import com.ericsson.services.ws_cil_7.identificationdocumenttyperead.IdentificationDocumentTypeReadResponse;
import com.ericsson.services.ws_cil_7.identificationdocumenttyperead.ListOfIdentificationDocumentTypeListpartResponse;
import com.ericsson.services.ws_cil_7.sessionchange.SessionChangeRequest;
import com.ericsson.services.ws_cil_7.sessionchange.ValuesListpartRequest;
import com.ericsson.services.ws_cil_7.sessionchange.ValuesRequest;

import javax.xml.ws.WebServiceException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Usage example for the IdentificationDocumentTypeRead client.
 * <p>
 * Run with: {@code mvn compile exec:java -Dexec.args="https://tst.eb.ms.fcm:443/wsi/services"}
 * <p>
 * The optional session values (sessionChangeRequest) are release dependent: the key used below (BU_ID) is an
 * example, use the keys agreed with the BSCS team.
 */
public final class IdentificationDocumentTypeReadClientMain {

    public static void main(String[] args) {
        String address = args.length > 0 ? args[0] : IdentificationDocumentTypeReadClientFactory.DEFAULT_ADDRESS;

        IdentificationDocumentTypeReadService port = new IdentificationDocumentTypeReadClientFactory()
                .address(address)
                .logMessages(true)
                .create();

        try {
            IdentificationDocumentTypeReadResponse response = read(port, Collections.<String, String>emptyMap());
            System.out.println("Default type: " + response.getIdtypeDef());
            for (ListOfIdentificationDocumentTypeListpartResponse type : types(response)) {
                System.out.println(type.getIdtypeCode() + " - " + type.getIdtypeName());
            }
        } catch (WebServiceException e) {
            // network error, timeout, TLS, SOAP fault...
            System.err.println("identificationDocumentTypeRead: " + e.getMessage());
        }
    }

    /**
     * Reads the identification document types. {@code sessionValues} (may be empty) are sent as
     * sessionChangeRequest key/value pairs.
     */
    public static IdentificationDocumentTypeReadResponse read(IdentificationDocumentTypeReadService port,
                                                             Map<String, String> sessionValues) {
        IdentificationDocumentTypeReadRequest request = new IdentificationDocumentTypeReadRequest();
        if (!sessionValues.isEmpty()) {
            request.setSessionChangeRequest(sessionChange(sessionValues));
        }
        return port.identificationDocumentTypeRead(request);
    }

    /** Builds a sessionChangeRequest from key/value pairs, e.g. {@code BU_ID=2}. */
    public static SessionChangeRequest sessionChange(Map<String, String> values) {
        ValuesRequest list = new ValuesRequest();
        for (Map.Entry<String, String> e : new LinkedHashMap<>(values).entrySet()) {
            ValuesListpartRequest item = new ValuesListpartRequest();
            item.setKey(e.getKey());
            item.setValue(e.getValue());
            list.getItem().add(item);
        }
        SessionChangeRequest session = new SessionChangeRequest();
        session.setValues(list);
        return session;
    }

    /** Document types of the response; empty list if the service returned none. */
    public static List<ListOfIdentificationDocumentTypeListpartResponse> types(IdentificationDocumentTypeReadResponse response) {
        return response.getListOfIdentificationDocumentType() == null
                ? Collections.<ListOfIdentificationDocumentTypeListpartResponse>emptyList()
                : response.getListOfIdentificationDocumentType().getItem();
    }

    private IdentificationDocumentTypeReadClientMain() {
    }
}
