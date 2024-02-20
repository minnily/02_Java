package com.hw2.run;

import java.util.ArrayList;
import java.util.List;

import com.hw2.model.dto.Animal;
import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;
import com.hw2.model.service.Zoo;

public class Run {
	public static void main(String[] args) {
		//zoo 객체 만들기
		Zoo z= new  Zoo();
		z.addAnimal(new Tiger("호랑이")); //업캐스팅 상태
		z.addAnimal(new Monkey("원숭이")); //업캐스팅 상태

		z.displayMenu();
		

		
	}
}
