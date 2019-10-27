package com.webservice;
import javax.ws.rs.GET;  
import javax.ws.rs.Path;  
import javax.ws.rs.Produces;  
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response; 

@Path("/timeline")
public class TweetApi {
	int num = 1;
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("status")
	public Response getStatus() {
		return Response.ok("{\"status\":" + num + "\"}").build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/tweetpost")
	public Response getTweetpost() {
		return null;
	}
}
