package com.orange.esim.client.api;

import com.orange.esim.client.model.EsimProfileError;
import com.orange.esim.client.model.ServiceOrder;
import com.orange.esim.client.model.ServiceOrderCreate;

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
 * eSIM Consumer REST API
 *
 * <p>REST Application
 *
 */
@Path("/serviceOrder")
@Api(value = "/", description = "")
public interface ServiceOrderApi  {

    /**
     * Creates a ServiceOrder
     *
     */
    @POST
    
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Creates a ServiceOrder", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created", response = ServiceOrder.class),
        @ApiResponse(code = 400, message = "Bad Request  ", response = EsimProfileError.class),
        @ApiResponse(code = 404, message = "Not Found  ", response = EsimProfileError.class),
        @ApiResponse(code = 500, message = "Internal Server Error  ", response = EsimProfileError.class) })
    public ServiceOrder createServiceOrder(ServiceOrderCreate body);
}
