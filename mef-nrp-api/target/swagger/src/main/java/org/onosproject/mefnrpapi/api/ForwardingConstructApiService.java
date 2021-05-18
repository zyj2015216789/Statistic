package org.onosproject.mefnrpapi.api;

import org.onosproject.mefnrpapi.api.*;
import org.onosproject.mefnrpapi.api.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import org.onosproject.mefnrpapi.api.model.NRPErrorResponse;
import org.onosproject.mefnrpapi.api.model.ForwardingConstruct;

import java.util.List;
import org.onosproject.mefnrpapi.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


public abstract class ForwardingConstructApiService {
    public abstract Response createAndActivateForwardingConstruct(ForwardingConstruct forwardingConstruct,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteForwardingConstruct(String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response findForwardingConstructByState(String state,String adminState,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getForwardingConstructById(String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response modifyForwardingConstruct(String id,String adminState,SecurityContext securityContext) throws NotFoundException;
}
