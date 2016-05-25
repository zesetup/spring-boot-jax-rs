package com.github.zesetup.bootjaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Component
@Path("hello")
public class HelloWS {
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public static String hello(){
		  return "{\"a\":1,\"b\":\"bstring\"}";
	}
}
