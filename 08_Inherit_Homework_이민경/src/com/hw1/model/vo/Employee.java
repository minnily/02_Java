package com.hw1.model.vo;

public class Employee extends Person{
	private int salary;
	private String dept;
	
	public Employee() {}

	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		this.name = name; //상속 받은 부모의 name ==> Person의 protected 필드 (후손클래스는 직접접근 가능)
		this.salary = salary;
		this.dept = dept;
	}

	public String information() {
		return super.information() + String.format("/ 급여 %d :  / 부서 %s ", salary ,dept);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	};
	
	
	
	
}
