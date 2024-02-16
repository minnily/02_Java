package com.hw2.model.dto;

public class Prisoner extends Person{

	private String crime;
	
	public Prisoner() {}
	
	
	public String getCrime() {
		return crime;
	}

	public void setCrime(String crime) {
		this.crime = crime;
	}



	public Prisoner(String id, String name, String crime) {
		super(id, name);
		this.crime = crime;
	}



	@Override
	public String getlnfo() {
		
		
		return String.format("ID : %s , 이름 : %s , 직책 : %s", id, name,crime);
	}

}
