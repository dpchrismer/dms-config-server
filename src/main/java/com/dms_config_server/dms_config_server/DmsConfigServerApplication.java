package com.dms_config_server.dms_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DmsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DmsConfigServerApplication.class, args);
	}

}
