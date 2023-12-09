package com.app.mj;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/msg")
public class Message {
	@GET
	@Path("/show")
	@Produces(MediaType.APPLICATION_XML)
	public Employee show() {
		Employee e = new Employee();
		e.setEmpId(100);
		e.setEmpName("ABCD");
		e.setEmpSal(5.5);
		return e;
	}
}