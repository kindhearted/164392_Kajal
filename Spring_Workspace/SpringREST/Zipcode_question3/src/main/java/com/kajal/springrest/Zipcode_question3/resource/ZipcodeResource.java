package com.kajal.springrest.Zipcode_question3.resource;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.kajal.springrest.Zipcode_question3.model.Address;
import com.kajal.springrest.Zipcode_question3.service.ZipcodeService;

@Path("/check")
public class ZipcodeResource {

	
		ZipcodeService zipcodeService = new ZipcodeService();
	
	 	@GET
	    @Path("/{zipcode}")
	    @Produces(MediaType.APPLICATION_JSON)
	 	public Address getAddress(@PathParam("zipcode") long zipcode) {
			return zipcodeService.getAddress(zipcode);
		}
}
