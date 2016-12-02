package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	private InventoryServiceClient inventoryServiceClient;

	@RequestMapping(method = RequestMethod.GET)
	public List<Book> getBooks() {

		List<Book> books = prepareBookList();
		for (Book book : books) {
			book.setInventory(getInventory(book.getId().toString()));
		}

		return books;
	}

	private List<Book> prepareBookList() {
		List<Book> list = new ArrayList<Book>();

		Book spring = new Book(1L, "Spring In Action", "Craig Walls", "9789351197997");
		Book jpa = new Book(2L, "Java Persistence with Hibernate", "Gavin King", "9788177227192");

		list.add(spring);
		list.add(jpa);

		return list;

	}

	//@HystrixCommand(fallbackMethod = "getDefaultInventory")
	public Integer getInventory(String id) {
		return inventoryServiceClient.getInventory(id);
	}
//
//	public Integer getDefaultInventory(String id) {
//		return 1;
//	}

}