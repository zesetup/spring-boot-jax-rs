package com.github.zesetup.bootjaxrs;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig extends ResourceConfig {
	public ApplicationConfig() {
		register(HelloWS.class);
	}
}

