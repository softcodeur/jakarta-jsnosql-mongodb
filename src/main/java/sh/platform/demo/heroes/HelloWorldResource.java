package sh.platform.demo.heroes;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/sggsg")
@RequestScoped
public class HelloWorldResource {

    @GET
    @Produces("text/plain")
    public String doGet() {
        return "sgsvgbjncdllkjhzgsdjkl";
    }
}
