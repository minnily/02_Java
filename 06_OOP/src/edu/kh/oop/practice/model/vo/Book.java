package edu.kh.oop.practice.model.vo;

public class Book {
	private String title;
	private int price;
	private double doscountRate;
	private String author;
	
	public void Book() {}

	public Book(String title, int price, double doscountRate, String author) {
		super();
		this.title = title;
		this.price = price;
		this.doscountRate = doscountRate;
		this.author = author;
	}
	
	public String toString;


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public double getDoscountRate() {
		return doscountRate;
	}


	public void setDoscountRate(double doscountRate) {
		this.doscountRate = doscountRate;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
