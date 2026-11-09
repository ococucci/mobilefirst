package com.orange.esim.client.api;

import com.orange.esim.client.model.AllocateProfileRequest;
import com.orange.esim.client.model.AllocateProfileResponse;
import com.orange.esim.client.model.CancelProfileRequest;
import com.orange.esim.client.model.CancelProfileResponse;
import com.orange.esim.client.model.DeliverProfileRequest;
import com.orange.esim.client.model.DeliverProfileResponse;
import com.orange.esim.client.model.Error;
import com.orange.esim.client.model.EsimProfileRequest;
import com.orange.esim.client.model.EsimProfileResponse;
import com.orange.esim.client.model.GetProfileResponse;
import com.orange.esim.client.model.GetStatusResponse;
import com.orange.esim.client.model.SourceError;

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
@Path("/profiles")
@Api(value = "/", description = "")
public interface ProfilesApi  {

    /**
     * Allocate an eSIM profile onto SM-DP+ server and get eSIM profile data back from SIM card server.
     *
     */
    @POST
    @Path("/allocate")
    @Produces({ "application/json" })
    @ApiOperation(value = "Allocate an eSIM profile onto SM-DP+ server and get eSIM profile data back from SIM card server.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Information about new allocated eSIM Profile in case of success.", response = AllocateProfileResponse.class),
        @ApiResponse(code = 400, message = "Bad request if one required parameters is malformed or missing.", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden - resquester id missing or unknown ", response = Error.class),
        @ApiResponse(code = 424, message = "Failed Dependency : this status code means that the method could not be performed on the resource because the requested action depended on another action and that action failed.", response = SourceError.class),
        @ApiResponse(code = 500, message = "Internal server error ", response = Error.class) })
    public AllocateProfileResponse profilesAllocatePost(@HeaderParam("X-ORANGE-Application-Id")  String xORANGEApplicationId, @HeaderParam("X-ORANGE-User-Id")  String xORANGEUserId, AllocateProfileRequest body);

    /**
     * Cancel the use for an eSIM profile onto SM-DP+ server. This eSIM profile must not have been downloaded .
     *
     */
    @POST
    @Path("/{iccid}/cancel")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Cancel the use for an eSIM profile onto SM-DP+ server. This eSIM profile must not have been downloaded .", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Information about delivered eSIM Profile in case of success.", response = CancelProfileResponse.class),
        @ApiResponse(code = 400, message = "Bad request if one required parameters is malformed or missing.", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden - resquester id missing or unknown ", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found : no eSIM profile could be found with the specified ICCID.", response = Error.class),
        @ApiResponse(code = 424, message = "Failed Dependency : this status code means that the method could not be performed on the resource because the requested action depended on another action and that action failed.", response = SourceError.class),
        @ApiResponse(code = 500, message = "Internal server error ", response = Error.class) })
    public CancelProfileResponse profilesIccidCancelPost(@PathParam("iccid") String iccid, @HeaderParam("X-ORANGE-Application-Id")  String xORANGEApplicationId, @HeaderParam("X-ORANGE-User-Id")  String xORANGEUserId, CancelProfileRequest body);

    /**
     * Confirm the use for an eSIM profile onto SM-DP+ server. This eSIM profile must have been allocated first.
     *
     */
    @POST
    @Path("/{iccid}/deliver")
    @Produces({ "application/json" })
    @ApiOperation(value = "Confirm the use for an eSIM profile onto SM-DP+ server. This eSIM profile must have been allocated first.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Information about delivered eSIM Profile in case of success.", response = DeliverProfileResponse.class),
        @ApiResponse(code = 400, message = "Bad request if one required parameters is malformed or missing.", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden - resquester id missing or unknown ", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found : no eSIM profile could be found with the specified ICCID.", response = Error.class),
        @ApiResponse(code = 424, message = "Failed Dependency : this status code means that the method could not be performed on the resource because the requested action depended on another action and that action failed.", response = SourceError.class),
        @ApiResponse(code = 500, message = "Internal server error ", response = Error.class) })
    public DeliverProfileResponse profilesIccidDeliverPost(@PathParam("iccid") String iccid, @HeaderParam("X-ORANGE-Application-Id")  String xORANGEApplicationId, @HeaderParam("X-ORANGE-User-Id")  String xORANGEUserId, DeliverProfileRequest body);

    /**
     * Get the eSIM profile identified with the ICCID in the path.
     *
     */
    @GET
    @Path("/{iccid}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get the eSIM profile identified with the ICCID in the path.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The profile data.", response = GetProfileResponse.class),
        @ApiResponse(code = 400, message = "Bad request if one required parameters is malformed or missing.", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden - resquester id missing or unknown ", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found : no eSIM profile could be found with the specified ICCID.", response = Error.class),
        @ApiResponse(code = 500, message = "Internal server error ", response = Error.class) })
    public GetProfileResponse profilesIccidGet(@PathParam("iccid") String iccid, @HeaderParam("X-ORANGE-Application-Id")  String xORANGEApplicationId, @HeaderParam("X-ORANGE-User-Id")  String xORANGEUserId);

    /**
     * Get an eSIM profile information for a given MSISDN and profileType
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Get an eSIM profile information for a given MSISDN and profileType", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Information about new allocated eSIM Profile in case of success.", response = EsimProfileResponse.class),
        @ApiResponse(code = 400, message = "Bad request if one required parameters is malformed or missing.", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden - resquester id missing or unknown ", response = Error.class),
        @ApiResponse(code = 424, message = "Failed Dependency : this status code means that the method could not be performed on the resource because the requested action depended on another action and that action failed.", response = SourceError.class),
        @ApiResponse(code = 500, message = "Internal server error ", response = Error.class) })
    public EsimProfileResponse profilesPost(@HeaderParam("X-ORANGE-Application-Id")  String xORANGEApplicationId, @HeaderParam("X-ORANGE-User-Id")  String xORANGEUserId, EsimProfileRequest body);

    /**
     * Get the profiles API availability.
     *
     */
    @GET
    @Path("/status")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get the profiles API availability.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The profile data.", response = GetStatusResponse.class) })
    public GetStatusResponse profilesStatusGet();
}
