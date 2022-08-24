package org.gs;


import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.gs.model.Matcher;
import org.gs.proxy.MatcherProxy;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/matcher")
public class MatcherResource {

    @Inject
    Logger logger;
    @Inject
    @RestClient
    MatcherProxy proxy;
    private Matcher matcher;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get() {
        matcher = proxy.get();
        logger.info("Request was made");
        return Response.ok(matcher).build();
    }



}
