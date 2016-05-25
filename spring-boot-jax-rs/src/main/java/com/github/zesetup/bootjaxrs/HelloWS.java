package com.github.zesetup.bootjaxrs;

import java.util.ArrayList;
import java.util.List;

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
	public static List<String> hello(){
			List<String> strings = new ArrayList<>();
			strings.add("one");
			strings.add("two");
			return strings;
	}
}
