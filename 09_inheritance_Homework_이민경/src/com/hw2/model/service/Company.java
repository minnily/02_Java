package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem{

	Employee[] employees;
	int employeeCount =0;
	
	public Company() {};
	
	public Company(int size) {
		employees = new Employee[size]; 
	};
	
	
	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	@Override
	public void addPerson(Person person) {
		
		if(employees != null) {
			System.out.println("인원이 모두 충원되었습니다.");
		}
		//해당객체(person)를 employees 배열에 추가 후 추가된 객체의 정보를 출력
		
			
			//Employee[] employees=new Employee[person];
		
		
	}

	@Override
	public void removePerson(String id) {
		//매개변수로 전달받은 id와 일치하는 직원을 찾으면, 해당 직원을 삭제하고 관련 정보를 출력. 
		//일치하는 id가 없다면 해당 id를 가진 직원을 찾을 수 없다는 메시지를 출력
		
		
		for(int i =0; i < employees.length;i++) {
			
			if(id.equals(employees[i])) {
				employees[i]=null;
				
				System.out.print("직원이 삭제되었습니다.");
				System.out.println(employees[i].toString());
			
			}else {
				System.out.println("해당 id를 가진 직원을 찾을 수 없습니다");
			}
		}
		
	}

	@Override
	public void displayAllPerson() {
		//전체 직원 명단을 출력하는기능
		
		System.out.println("전체 직원 명단 : ");
		System.out.println("ID : "+  "이름 : " +"직책 : ");
		
	}

}
