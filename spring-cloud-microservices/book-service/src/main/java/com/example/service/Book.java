package com.example.service;

public class Book {

	private Long id;
	private String title;
	private String author;
	private String isbn;
	private Integer inventory;
	
	public Book(){
		
	}

	public Book(Long id, String title, String author, String isbn) {
		super();
		this.id =id;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}



	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Integer getInventory() {
		return inventory;
	}

	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

}
