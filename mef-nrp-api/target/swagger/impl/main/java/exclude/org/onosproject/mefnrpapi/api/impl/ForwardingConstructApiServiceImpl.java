package org.onosproject.mefnrpapi.api.impl;

import org.onosproject.mefnrpapi.api.*;
import org.onosproject.mefnrpapi.api.model.*;

import org.onosproject.mefnrpapi.api.model.NRPErrorResponse;
import org.onosproject.mefnrpapi.api.model.ForwardingConstruct;

import java.util.List;
import org.onosproject.mefnrpapi.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


public class ForwardingConstructApiServiceImpl extends ForwardingConstructApiService {
    @Override
    public Response createAndActivateForwardingConstruct(ForwardingConstruct forwardingConstruct, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deleteForwardingConstruct(String id, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response findForwardingConstructByState(String state, String adminState, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getForwardingConstructById(String id, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response modifyForwardingConstruct(String id, String adminState, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
