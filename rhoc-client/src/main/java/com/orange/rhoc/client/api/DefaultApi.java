package com.orange.rhoc.client.api;

import com.orange.rhoc.client.model.ApiPayloadNotTreatedModel;
import com.orange.rhoc.client.model.ApiTemporaryUnavailableResponse;
import com.orange.rhoc.client.model.DiscountRight;
import com.orange.rhoc.client.model.DiscountRightStatus;
import com.orange.rhoc.client.model.InvalidParameterModel;
import com.orange.rhoc.client.model.PayloadPubSub;
import com.orange.rhoc.client.model.UnauthorizatedModel;
import com.orange.rhoc.client.model.Vertical;

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
 * RHOC API
 *
 * <p>Swagger for RHOC API
 *
 */
@Path("/v0/discountRights")
@Api(value = "/", description = "")
public interface DefaultApi  {

    /**
     * Get Discount Rights
     *
     * Return list of Discount Right depending on given parameters Args:     status: discount status (All, Consommable, Consomme)     vertical: vertical concerned     sponsorCid: sponsorCid searched (optional)     sponsorPid: sponsorPid searched (optional)     beneficiaryCid: beneficiaryCid searched (optional)     beneficiaryPid: beneficiaryPid searched (optional)     pendingOrderId: pendingOrderId searched (optional)     db: Dependency Injection of the targeted database     X_Cloud_Trace_Context: id in the header of the HTTP request, for logging purpose Returns:     list of DiscountRight or empty list
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Discount Rights", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Response", response = DiscountRight.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "List of supported error codes:   * 25 Missing header   * 26 Missing header value   * 27 Missing query-string parameter   * 28 Invalid query-string parameter", response = InvalidParameterModel.class),
        @ApiResponse(code = 403, message = "List of supported error codes:   * 3 Forbidden", response = UnauthorizatedModel.class),
        @ApiResponse(code = 503, message = "List of supported error codes:   * 5 Api Temporarily Unavailable", response = ApiTemporaryUnavailableResponse.class) })
    public List<DiscountRight> getDiscountRightsV0DiscountRightsGet(@QueryParam("status") DiscountRightStatus status, @QueryParam("vertical") Vertical vertical, @HeaderParam("X-Cloud-Trace-Context")  Object xCloudTraceContext, @QueryParam("sponsorCid") @DefaultValue("")String sponsorCid, @QueryParam("sponsorPid") @DefaultValue("")String sponsorPid, @QueryParam("beneficiaryCid") @DefaultValue("")String beneficiaryCid, @QueryParam("beneficiaryPid") @DefaultValue("")String beneficiaryPid, @QueryParam("pendingOrderId") @DefaultValue("")String pendingOrderId);

    /**
     * Handle Pubsub Messages
     *
     * Receive payload from pubsub, determine the use_case and process it. Args:     payload: pubsub payload containing a CustomerOrder object     db: Dependency Injection of the targeted database Returns:     JSONResponse or Response. HTTP 2xx for pubsub subscriber acknowledgment
     *
     */
    @POST
    @Path("/pubsub")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Handle Pubsub Messages", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successful Response", response = DiscountRight.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "List of responses:   * 1 Payload not treated   * 2 Invalid payload", response = ApiPayloadNotTreatedModel.class),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 403, message = "List of supported error codes:   * 3 Forbidden", response = UnauthorizatedModel.class),
        @ApiResponse(code = 503, message = "List of supported error codes:   * 5 Api Temporarily Unavailable", response = ApiTemporaryUnavailableResponse.class) })
    public ApiPayloadNotTreatedModel handlePubsubMessagesV0DiscountRightsPubsubPost(PayloadPubSub payloadPubSub);
}
