package com.hw2.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;
import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;

public class Zoo {
	private List<Animal> animals; //= new ArrayList<Animal>(); 도 가능
	
	public Zoo() {
		
		 animals= new ArrayList<Animal>();

	}
	
	public void addAnimal() {};
	
	public void addAnimal(Animal animal) {
	
		animals.add(animal); 
	};
	
	public void displayMenu() {
		
		Scanner sc = new Scanner(System.in);
		int menu =0 ;

		try{
			do {
		
				System.out.println("****** KH 동물원 ******");
				
				System.out.println("원하는 작업을 선택하세요 : ");
				
				
				System.out.println("1. 동물들의 울음소리 듣기");
				System.out.println("2. 종료");
				
				System.out.println("선택: ");
				menu = sc.nextInt();
				
				switch(menu){
				case 1 : showAnimals(); break;
				case 2 : System.out.println("프로그램을 종료합니다.");break;
				default : System.out.println("잘못 입력하셨습니다"); 	
				}
	
			}while(menu !=2);
		}catch (InputMismatchException e) {
					
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
		}
	}

	public void showAnimals() throws InputMismatchException{
		
		System.out.println("동물들의 울음소리를 들어보세요 : ");
		
		for(Animal ani : animals) {
			
		ani.sound();
			
		}
		
	};
	
}