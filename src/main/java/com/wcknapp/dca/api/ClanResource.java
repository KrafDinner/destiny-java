package com.wcknapp.dca.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/clan")
public class ClanResource {

    @GET
    @Path("hw")
    @Produces(MediaType.APPLICATION_JSON)
    public String getClanMemberNames() {
        return "Hello world";
    }
}
