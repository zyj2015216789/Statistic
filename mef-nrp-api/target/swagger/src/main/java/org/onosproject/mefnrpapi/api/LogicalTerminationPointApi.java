package org.onosproject.mefnrpapi.api;

import org.onosproject.mefnrpapi.api.model.*;
import org.onosproject.mefnrpapi.api.LogicalTerminationPointApiService;
import org.onosproject.mefnrpapi.api.factories.LogicalTerminationPointApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.onosproject.mefnrpapi.api.model.LogicalTerminationPoint;

import java.util.List;
import org.onosproject.mefnrpapi.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/LogicalTerminationPoint")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the LogicalTerminationPoint API")

public class LogicalTerminationPointApi  {
   private final LogicalTerminationPointApiService delegate = LogicalTerminationPointApiServiceFactory.getLogicalTerminationPointApi();

    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create/Create and Activate a LogicalTerminationPoint", notes = "Create or Create and Activate a LogicalTerminationPoint", response = LogicalTerminationPoint.class, tags={ "LogicalTerminationPoint", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Logical Termination Point", response = LogicalTerminationPoint.class) })
    public Response createLogicalTerminationPoint(@ApiParam(value = "" ,required=true) LogicalTerminationPoint id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createLogicalTerminationPoint(id,securityContext);
    }
    @DELETE
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete LogicalTerminationPoint with {id}", notes = "Delete LogicalTerminationPoint with {id}", response = void.class, tags={ "LogicalTerminationPoint", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Success", response = void.class) })
    public Response deleteLogicalTerminationPoint(@ApiParam(value = "",required=true) @PathParam("id") String id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteLogicalTerminationPoint(id,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all LogicalTerminationPoint(s) managed by Domain Controller", notes = "Get all LogicalTerminationPoints managed by a Domain Controller", response = LogicalTerminationPoint.class, responseContainer = "List", tags={ "LogicalTerminationPoint", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of LogicalTerminationPoint", response = LogicalTerminationPoint.class, responseContainer = "List") })
    public Response getAllLogicalTerminationPoint(@ApiParam(value = "") @QueryParam("fields") String fields
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAllLogicalTerminationPoint(fields,securityContext);
    }
    @GET
    @Path("/findByNode")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all Logical Termination Points on a Node identified by the provided id", notes = "Get all Logical Termination Points on a Node identified by the provided id", response = LogicalTerminationPoint.class, tags={ "LogicalTerminationPoint", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "LogicalTerminationPoint", response = LogicalTerminationPoint.class) })
    public Response getAllLogicalTerminationPointOnNode(@ApiParam(value = "",required=true) @QueryParam("id") String id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAllLogicalTerminationPointOnNode(id,securityContext);
    }
    @GET
    @Path("/findByLpSpec")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all Logical Termination Points identified by the provided LpSpec type", notes = "Get all Logical Termination Points identified by the provided LpSpec type", response = LogicalTerminationPoint.class, tags={ "LogicalTerminationPoint", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "LogicalTerminationPoint", response = LogicalTerminationPoint.class) })
    public Response getAllLtpsOnNodeOfLpspecType(@ApiParam(value = "",required=true, allowableValues="NRP_UNI_TerminationSpec, NRP_INNI_TerminationSpec, NRP_ENNI_TerminationSpec, NRP_EvcEndpoint_ConnAdaptSpec, NRP_IvcEndpoint_ConnAdaptSpec, NRP_OvcEndpoint_ConnAdaptSpec") @QueryParam("type") String type
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAllLtpsOnNodeOfLpspecType(type,securityContext);
    }
    @GET
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get LogicalTerminationPoint with {id}", notes = "Get LogicalTerminationPoint with {id}", response = LogicalTerminationPoint.class, tags={ "LogicalTerminationPoint", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "LogicalTerminationPoint", response = LogicalTerminationPoint.class) })
    public Response getLogicalTerminationPoint(@ApiParam(value = "",required=true) @PathParam("id") String id
,@ApiParam(value = "") @QueryParam("fields") String fields
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getLogicalTerminationPoint(id,fields,securityContext);
    }
    @PATCH
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Modify LogicalTerminationPoint", notes = "Modify LogicalTerminationPoint", response = LogicalTerminationPoint.class, tags={ "LogicalTerminationPoint", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success Individual", response = LogicalTerminationPoint.class) })
    public Response patchLogicalTerminationPoint(@ApiParam(value = "",required=true) @PathParam("id") String id
,@ApiParam(value = "" ,required=true) LogicalTerminationPoint ltp
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patchLogicalTerminationPoint(id,ltp,securityContext);
    }
}
