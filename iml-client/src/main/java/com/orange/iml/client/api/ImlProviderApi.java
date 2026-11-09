package com.orange.iml.client.api;

import com.orange.iml.client.model.Error;
import com.orange.iml.client.model.InParametersTokenize;
import com.orange.iml.client.model.InParametersUntokenize;
import com.orange.iml.client.model.OutParamatersUntokenize;
import com.orange.iml.client.model.OutParametersTokenize;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

/**
 * IBAN Management Layer
 *
 * <p>IBAN Management Layer
 *
 */
@Path("")
@Api(value = "/", description = "")
public interface ImlProviderApi  {

    /**
     * Tokenize
     *
     * Service de jetonisation : Retourne la liste de tokens correspondant à une liste d&#39;IBAN
     *
     */
    @POST
    @Path("/tokenize")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "text/plain" })
    @ApiOperation(value = "Tokenize", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Succès", response = OutParametersTokenize.class),
        @ApiResponse(code = 400, message = "Erreur en entrée", response = Error.class),
        @ApiResponse(code = 503, message = "OPSI indisponible", response = Error.class),
        @ApiResponse(code = 500, message = "Erreur interne", response = Error.class) })
    public OutParametersTokenize tokenize1(InParametersTokenize inParametersTokenize);

    /**
     * Untokenize
     *
     * Service de déjetonisation : Retourne la liste d&#39;IBAN correspondant à une liste de tokens
     *
     */
    @POST
    @Path("/untokenize")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "text/plain" })
    @ApiOperation(value = "Untokenize", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Succès", response = OutParamatersUntokenize.class),
        @ApiResponse(code = 400, message = "Erreur en entrée", response = Error.class),
        @ApiResponse(code = 503, message = "OPSI indisponible", response = Error.class),
        @ApiResponse(code = 500, message = "Erreur interne", response = Error.class) })
    public OutParamatersUntokenize untokenize1(InParametersUntokenize inParametersUntokenize);
}
