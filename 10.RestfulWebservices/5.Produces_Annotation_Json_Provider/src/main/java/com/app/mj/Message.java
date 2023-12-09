package com.app.mj;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/msg")
public class Message {
	@GET
	@Path("/show")
	@Produces("application/json")
	public Employee show() {
		Employee e = new Employee();
		e.setEmpId(10);
		e.setEmpName("VENKY");
		e.setEmpSal(10.4);
		return e;
	}
}
