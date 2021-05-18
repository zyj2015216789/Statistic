package org.onosproject.mefnrpapi.api;

import org.onosproject.mefnrpapi.api.model.*;
import org.onosproject.mefnrpapi.api.ForwardingConstructApiService;
import org.onosproject.mefnrpapi.api.factories.ForwardingConstructApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.onosproject.mefnrpapi.api.model.NRPErrorResponse;
import org.onosproject.mefnrpapi.api.model.ForwardingConstruct;

import java.util.List;
import org.onosproject.mefnrpapi.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/ForwardingConstruct")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the ForwardingConstruct API")

public class ForwardingConstructApi  {
   private final ForwardingConstructApiService delegate = ForwardingConstructApiServiceFactory.getForwardingConstructApi();

    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create/Create and Activate ForwardingConstruct with {id}", notes = "Create, Create and Activate NRP Forwarding Construct. Use state variable for action. ", response = ForwardingConstruct.class, tags={ "ForwardingConstruct", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "NRP Forwarding Construct", response = ForwardingConstruct.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error has occurred", response = ForwardingConstruct.class) })
    public Response createAndActivateForwardingConstruct(@ApiParam(value = "ForwardingConstruct" ,required=true) ForwardingConstruct forwardingConstruct
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createAndActivateForwardingConstruct(forwardingConstruct,securityContext);
    }
    @DELETE
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete NRP Forwarding Construct with {id}", notes = "Delete NRP Forwarding Construct {id}", response = ForwardingConstruct.class, tags={ "ForwardingConstruct", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Delete ForwardingConstruct uniquely identified by id", response = ForwardingConstruct.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ForwardingConstruct identifier", response = ForwardingConstruct.class) })
    public Response deleteForwardingConstruct(@ApiParam(value = "id of NRP Forwarding Construct",required=true) @PathParam("id") String id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteForwardingConstruct(id,securityContext);
    }
    @GET
    @Path("/findByState/{state}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Find ForwardingConstruct by state", notes = "Finds NRP Forwarding Construct based on admininstrative state", response = ForwardingConstruct.class, responseContainer = "List", tags={ "ForwardingConstruct", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ForwardingConstruct(s) by state", response = ForwardingConstruct.class, responseContainer = "List") })
    public Response findForwardingConstructByState(@ApiParam(value = "State of NRP Forwarding Construct",required=true) @PathParam("state") String state
,@ApiParam(value = "") @QueryParam("adminState") String adminState
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.findForwardingConstructByState(state,adminState,securityContext);
    }
    @GET
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Gets ForwardingConstruct by id", notes = "Gets NRP Forwarding Construct by id", response = ForwardingConstruct.class, tags={ "ForwardingConstruct", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Get ForwardingConstruct with {id}", response = ForwardingConstruct.class) })
    public Response getForwardingConstructById(@ApiParam(value = "id of NRP Forwarding Construct",required=true) @PathParam("id") String id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getForwardingConstructById(id,securityContext);
    }
    @PATCH
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Change administrative state of Forwarding Construct", notes = "Activate, Deactivate, Suspend or Resume an existing  ForwardingConstruct identified with {id}. Use adminState variable for action.", response = ForwardingConstruct.class, tags={ "ForwardingConstruct", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "NRP Forwarding Construct", response = ForwardingConstruct.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ForwardingConstruct PATCH", response = ForwardingConstruct.class) })
    public Response modifyForwardingConstruct(@ApiParam(value = "id of NRP Forwarding Construct",required=true) @PathParam("id") String id
,@ApiParam(value = "Administrative state of ForwardingConstruct",required=true, allowableValues="active, inactive, suspended, terminated") @QueryParam("adminState") String adminState
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.modifyForwardingConstruct(id,adminState,securityContext);
    }
}
