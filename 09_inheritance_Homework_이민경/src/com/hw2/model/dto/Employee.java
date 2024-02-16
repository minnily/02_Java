package com.hw2.model.dto;

public class Employee extends Person{

	private String position;
	public Employee() {};
	
	public Employee(String id, String name, String position) {
		
		super(id, name);
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String getlnfo() {
		
		return String.format("ID : %s , 이름 : %s , 죄목 : %s", id, name,position);
	}

}
