package com.hw3.model.dto;

public class book {
	private String bookName;
	private int bookNum;
	private String autor;
	private int price;
	private String publisher;
	
	public book () {}

	public book(String bookName, int bookNum, String autor, int price, String publisher) {
		super();
		this.bookName = bookName;
		this.bookNum = bookNum;
		this.autor = autor;
		this.price = price;
		this.publisher = publisher;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	};
	
	@Override
	public String toString() {
		
		return "도서번호 : ;
	}
	
}
