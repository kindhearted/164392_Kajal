package com.kajal.springrest.UserLoginUsingPathparam;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/validate")
public class ValidateResource {

  
    @POST
    @Path("/{userName}/{password}")
    @Produces(MediaType.TEXT_PLAIN)
    public String authenticate(@PathParam("userName") String username,@PathParam("password") String password) {
    	if (!username.equals("kajal") || !password.equals("kajal"))
			return "Incorrect username or password";
		else
			return "Sucessfully authenticated";
    }
}
