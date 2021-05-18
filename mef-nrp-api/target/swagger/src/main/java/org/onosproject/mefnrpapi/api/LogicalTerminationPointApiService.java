package org.onosproject.mefnrpapi.api;

import org.onosproject.mefnrpapi.api.*;
import org.onosproject.mefnrpapi.api.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import org.onosproject.mefnrpapi.api.model.LogicalTerminationPoint;

import java.util.List;
import org.onosproject.mefnrpapi.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


public abstract class LogicalTerminationPointApiService {
    public abstract Response createLogicalTerminationPoint(LogicalTerminationPoint id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteLogicalTerminationPoint(String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAllLogicalTerminationPoint(String fields,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAllLogicalTerminationPointOnNode(String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAllLtpsOnNodeOfLpspecType(String type,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getLogicalTerminationPoint(String id,String fields,SecurityContext securityContext) throws NotFoundException;
    public abstract Response patchLogicalTerminationPoint(String id,LogicalTerminationPoint ltp,SecurityContext securityContext) throws NotFoundException;
}
