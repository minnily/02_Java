package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem{
	Prisoner[] prisoners;
	int prisonerCount =0;
	
	public Prisoner[] getPrisoners() {
		return prisoners;
	}

	public void setPrisoners(Prisoner[] prisoners) {
		this.prisoners = prisoners;
	}

	public int getPrisonerCount() {
		return prisonerCount;
	}

	public void setPrisonerCount(int prisonerCount) {
		this.prisonerCount = prisonerCount;
	}

	public Prison() {};
	
	public Prison(int size){};
	
	@Override
	public void addPerson(Person person) {
		if(prisoners != null) {
			System.out.println("인원이 모두 충원되었습니다.");
		}
		//해당객체(person)를 employees 배열에 추가 후 추가된 객체의 정보를 출력
		
			
			//Prisoner[] prisoners=new Prisoner[person];
		
	}
	@Override
	public void removePerson(String id) {
		for(int i =0; i < prisoners.length;i++) {
					
					if(id.equals(prisoners[i])) {
						prisoners[i]=null;
						
						System.out.print("수감자가 삭제되었습니다.");
						System.out.println(prisoners[i].toString());
					
					}else {
						System.out.println("해당 id를 가진 수감자를 찾을 수 없습니다");
					}
				}
		
	}
	@Override
	public void displayAllPerson() {
		
		super.toString();
		
		//전체 수감자 명단을 출력하는기능
		
				System.out.println("전체 수감자 명단 : ");
				System.out.println("ID : "+  "이름 : " +"죄목 : ");
	}
	
	
}
