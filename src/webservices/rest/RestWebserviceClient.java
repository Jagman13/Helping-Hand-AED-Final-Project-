/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices.rest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import javax.ws.rs.core.MultivaluedMap;

/**
 *
 * @author Jagman
 */
public class RestWebserviceClient {

    public static ClientResponse getResponse(String URI, MultivaluedMap queryParams) {

        Client client = Client.create();

        WebResource webResource = client.resource(URI);

        return webResource.queryParams(queryParams).accept("application/json").get(ClientResponse.class);

    }
}
