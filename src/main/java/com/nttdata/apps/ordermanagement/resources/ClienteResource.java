package com.nttdata.apps.ordermanagement.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("api/v1/clientes")
public class ClienteResource {

    @GET
    public Response helloCliente(){
        return Response
                .accepted("Hello Cliente")
                .build();
    }

}
