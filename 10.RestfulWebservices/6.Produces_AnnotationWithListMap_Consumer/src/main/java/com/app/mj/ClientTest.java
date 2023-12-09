package com.app.mj;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.Response;

public class ClientTest {
	public static void main(String[] args) {
		String targetUrl = "http://localhost:8080/MediaAnnotationWithListMap_Provider/rest/msg/show";
// 1. Create on empty Client object
		Client c = ClientBuilder.newClient();
// 2.Make a GET request
        Response response = c.target(targetUrl).request().get();
// 4. read entity from cr object
		String str = response.readEntity(String.class);
// 5. print entity
		System.out.println(str);
// 6. print extra details
		System.out.println(response.getStatus());
		System.out.println(response.getStatusInfo());
		System.out.println(response.getMediaType());
	}
}
