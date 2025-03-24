package com.aktie.aktieapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default server URL") })
@SpringBootApplication
public class AktieApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AktieApiApplication.class, args);
	}

}
