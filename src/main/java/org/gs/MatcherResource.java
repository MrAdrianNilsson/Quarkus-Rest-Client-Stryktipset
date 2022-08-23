package org.gs;


import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.gs.model.Matcher;
import org.gs.proxy.MatcherProxy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/matcher")
public class MatcherResource {

    @RestClient
    MatcherProxy proxy;
    private Matcher matcher;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get() {
        matcher = proxy.get();
        return Response.ok(matcher).build();
    }



}
