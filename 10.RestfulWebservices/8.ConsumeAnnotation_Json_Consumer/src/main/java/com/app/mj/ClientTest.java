package com.app.mj;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class ClientTest {
	public static void main(String[] args) {
		String targetUrl = "http://localhost:8080/ConumeAnnotations_Json_Provider/rest/msg/show";
// 1. Create on empty Client object
		Client c = ClientBuilder.newClient();
// 2.Make a GET request
		String json = "{ \"empId\":445,\"empName\":\"AA\", \"empSal\":55.56 }";

		Response response = c.target(targetUrl).request(MediaType.APPLICATION_JSON).post(Entity.json(json));
// 4. read entity from cr object
// 5. print entity
		if (response.getStatus() == 200) {
			// Read and display the response
			String responseData = response.readEntity(String.class);
			System.out.println("Response: " + responseData);
			System.out.println(response.getStatus());
			System.out.println(response.getStatusInfo());
			System.out.println(response.getMediaType());
		} else {
			System.err.println("Error: " + response.getStatusInfo().getReasonPhrase());
		}
	}
}
