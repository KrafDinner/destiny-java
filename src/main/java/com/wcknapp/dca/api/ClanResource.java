package com.wcknapp.dca.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;

@Path("/api/clan")
public class ClanResource {

    @GET
    public List<String> getClanMemberNames() {
        ArrayList<String> retVal = new ArrayList<>();
        retVal.add("KrafDinner86");
        retVal.add("GotchaMeMomma");
        return retVal;
    }
}
