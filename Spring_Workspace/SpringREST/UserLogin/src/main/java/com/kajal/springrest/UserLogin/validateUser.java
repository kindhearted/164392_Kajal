package com.kajal.springrest.UserLogin;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/validate")
public class validateUser {
	// private String username;
	// private String password;
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String authenticate(@FormParam("username") String username, @FormParam("password") String password) {

		if (!username.equals("kajal") || !password.equals("kajal"))
			return "Incorrect username or password";
		else
			return "Sucessfully authenticated";
	}

}