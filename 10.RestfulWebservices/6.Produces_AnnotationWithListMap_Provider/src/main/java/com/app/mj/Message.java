package com.app.mj;

import java.util.Arrays;
import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/msg")
public class Message {
	@GET
	@Path("/show")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> show() {
		List<Employee> emps = Arrays.asList(new Employee(10, "V", 2.2), new Employee(11, "E", 3.2),
				new Employee(12, "N", 4.2), new Employee(13, "K", 5.2), new Employee(14, "I", 6.2));
		return emps;
	}
}