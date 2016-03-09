package com.zhi;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by HUANGZHIJIANG416 on 2016/3/8.
 */

@Path("helloWorld")
public class MyResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String ping(){
        return "Hey, This is Jersey JAX-RS!";
    }

    @GET
    @Produces("text/plain")
    @Path("getHello")
    public String getHello(){
        return "hello";
    }

    @Path("/user/{username}")
    @GET
    @Produces("text/plain")
    public String getUser(@PathParam("username") String userName){
        return "hello " + userName;
    }

    @PUT
    @Path("put")
    @Produces("text/plain")
    public String putMethod(){
        return "put done!";
    }

    @Path("html")
    @Produces("text/html")
    @GET
    public String doGetAsHtml(){
        return "html";
    }

    @Path("json")
    @Produces("application/json")
    @GET
    public String doGetAsJson(){
        return "json";
    }

    @Path("smooth")
    @GET
    @Produces("text/plain")
    public String smooth(
            @DefaultValue("2") @QueryParam("step") int step,
            @DefaultValue("false") @QueryParam("min-m") boolean hasMin,
            @DefaultValue("false") @QueryParam("max-m") boolean hasMax,
            @DefaultValue("true") @QueryParam("last-m") boolean hasLast) {
        boolean b = false;
        b=true;
        return step + String.valueOf(hasMin) + String.valueOf(hasMax);
    }
}
