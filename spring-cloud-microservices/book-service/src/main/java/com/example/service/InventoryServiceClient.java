package com.example.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "inventory-service" , fallback=HystrixInventoryFallback.class)
public interface InventoryServiceClient {

	@RequestMapping(method= RequestMethod.GET, value="/book/{id}")
	public Integer getInventory(@PathVariable("id") String id);
}
