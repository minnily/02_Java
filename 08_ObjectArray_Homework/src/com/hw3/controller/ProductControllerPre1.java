package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.ProductPre1;

public class ProductControllerPre1 {
	private ProductPre1[] pro = null;	
	
	
	public static int count = 0;
	
	Scanner sc = new Scanner(System.in);
	
	{
		pro = new ProductPre1[10];
	}
	
	public void mainMenu() {
		//반복적으로 메뉴화면 출력 
		//각 버튼 선택시 각각의 메소드 호출
		//제품관리 메뉴/ 제품 정보 추가/ 제품전체조회/프로그램 종료
		
		//1.제품 정보가 추가되는 곳에 저장을 할 수 있게 변수를 지정한다.
		int menunum =0;
		
		do {
			System.out.println("=======[제품 관리 메뉴]=======");
			
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("어떤 메뉴를 선택하시겠습니까? :");
			menunum =sc. nextInt();
			
			switch(menunum){
				
				case 1 : productlnput(); break;
				case 2 : productPrint(); break;
				case 0 : System.out.println("프로그램을 종료합니다"); break;
				default : System.out.println("메뉴에 없는 번호/기호를 누르셨습니다. 다시 입력해주세요");
			}
			
		}while(menunum !=0);
		
	};
	
	public void productlnput() {
		
		System.out.println("[1. 제품 정보 추가]");
		
		System.out.print("제품 번호 : ");
		int pld = sc.nextInt();
		
		System.out.print("제품명 : ");
		String pName =sc.nextLine();
		
		System.out.print("제품 가격 : ");
		int price= sc.nextInt();
		
		System.out.print("제품 세금 : ");
		double tax =sc.nextDouble();
		
		pro[count] = new ProductPre1(pld, pName, price, tax);
		
		
	};
	
	public void productPrint() {
		
		System.out.println("====[제품 전체 조회]====");
		
		if(pro[count] == null) {
			System.out.println("입력한 제품 정보가 없습니다. 정보 추가 필요합니다.");
		}
		
		
	};
}
