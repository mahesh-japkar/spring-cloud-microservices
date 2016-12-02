package com.example.restapi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {

	@RequestMapping("/book/{id}")
	public Integer bookAvailablity(@PathVariable("id") String id) {
		return getBookAvailablity(id);
	}

	private Integer getBookAvailablity(String id) {
		if (id.equalsIgnoreCase("1")) {
			return 5;
		}
		return 10;
	}
}
