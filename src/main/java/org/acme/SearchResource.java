package org.acme;

import jakarta.ws.rs.Path;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path("/search")
public class SearchResource {
    @Path("profile1")
    @Tag(name = "Profile1SearchResource")
    public SubSearchResource profile1() {
        return new SubSearchResource("Profile 1");
    }

    @Path("profile2")
    @Tag(name = "Profile2SearchResource")
    public SubSearchResource profile2() {
        return new SubSearchResource("Profile 2");
    }
}
