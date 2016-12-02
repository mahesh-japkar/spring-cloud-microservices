package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableResourceServer
@EnableDiscoveryClient
public class InventoryReplicaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryReplicaServiceApplication.class, args);
	}
}
