package com.app.mj;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;

@Path("/msg")
public class Message {
	@POST
	@Path("/show")
	@Consumes(MediaType.APPLICATION_JSON)
	public String show(Employee e) {
		return "Hello: id:" + e.getEmpId() + ", Name:" + e.getEmpName() + ", Sal:" + e.getEmpSal();

	}
}
