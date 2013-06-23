package fm.webapp.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author: jl
 * @date: 6/22/13
 */
@Path("/")
public class FoodMuseResource {
    @Path("/")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public Response home() {
        return Response.ok("<h1>FoodMuse</h1>").build();
    }
}
