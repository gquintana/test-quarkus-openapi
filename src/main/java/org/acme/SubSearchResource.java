package org.acme;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.QueryParam;

public class SubSearchResource {
    private final String name;

    public SubSearchResource(String name) {
        this.name = name;
    }

    @GET
    public String get(@QueryParam("query") @NotNull @NotEmpty String query) {
        return "Search " + name + " result for " + query;
    }

    @POST
    public String post(@NotEmpty String query) {
        return "Search " + name + " result for " + query;
    }
}
