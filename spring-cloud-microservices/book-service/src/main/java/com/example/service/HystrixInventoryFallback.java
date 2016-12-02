package com.example.service;

import org.springframework.stereotype.Component;

@Component
public class HystrixInventoryFallback implements InventoryServiceClient{

	public Integer getInventory(String id) {
		return 1;
	}

}
