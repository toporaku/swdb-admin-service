package com.admin_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

// @spec INFRA-ADM-001, INFRA-ADM-002, INFRA-ADM-003
@SpringBootApplication
@EnableAdminServer
public class AdminServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminServiceApplication.class, args);
	}

}
