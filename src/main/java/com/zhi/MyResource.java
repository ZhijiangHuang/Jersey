package com.zhi;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
}
