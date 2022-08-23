package org.gs.proxy;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.gs.model.Matcher;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@RegisterRestClient(baseUri = "https://api.www.svenskaspel.se/draw/1/stryktipset/draws")
public interface MatcherProxy {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    Matcher get();

}
