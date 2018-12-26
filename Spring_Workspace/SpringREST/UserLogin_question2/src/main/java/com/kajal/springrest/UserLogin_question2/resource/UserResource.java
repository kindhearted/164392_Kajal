package com.kajal.springrest.UserLogin_question2.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/")
public class UserResource {

	
	private String username;
	private String password;

	@Path("/{username}/{password}")
	public String authenticate(@QueryParam("username") String username, @QueryParam("password") String password) {
	    if(!username.equals("kajal") || !password.equals("kajal"))
	      return "Incorrect username or password";
	    this.username=username;
	    this.password=password;
	    return "Sucessfully authenticated";
	  }
	
}

