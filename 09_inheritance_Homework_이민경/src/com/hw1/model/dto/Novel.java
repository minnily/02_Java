package com.hw1.model.dto;

public class Novel extends Book{

	private String genere;
	public Novel() {};
	public Novel(String title, String author, String genere) {
		super(title, author);
		this.genere = genere;
	}
	
	
	@Override
	public void displayInfo() {
		System.out.printf("[소설] 제목 : %s / 저자 : %s / 장르 : %s\n",getTitle(),getAuthor(),getGenere()); 
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	
	
	
}
