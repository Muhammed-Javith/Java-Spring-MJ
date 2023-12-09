package com.app.provider;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/provider")
public class MessageProvider {
	@Path("/msg")
	@GET
	public String showMessage() {
		return "Welcome to RESTFul WebServices!!!!";
	}
}