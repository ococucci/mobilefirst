package com.orange.esim.client.api;

import com.orange.esim.client.model.HandleDownloadProgressInfoRequest;

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
@Path("/gsma/rsp2/es2plus/handleDownloadProgressInfo")
@Api(value = "/", description = "")
public interface NotificationsApi  {

    /**
     * Post a notification resource
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @ApiOperation(value = "Post a notification resource", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void handleDownloadProgressInfo(HandleDownloadProgressInfoRequest body);
}
