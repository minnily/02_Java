package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;
import com.hw3.model.vo.Product2;

public class ProductController2 {
	
	private Product2[] pro = null;
	
	
	public static int count = 0; //static 변수 부르는 방법 : 클래스명. 변수명
	
	Scanner sc = new Scanner(System.in);
	
	
	//초기화 블럭을 이용하여 10개의 product 배열 크기 할당
	{
		pro = new Product2[10]; 
	}
	
	
	//메인메뉴 메서드
	public void mainMenu() {
		int menu =0; //변수 설정
		
		do {
			
			System.out.println("=======제품 관리 메뉴=======");	
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("0. 프로그램 종료");
			
			System.out.print(" 메뉴 선택    :");
			menu = sc.nextInt();
		
		
			switch(menu) {
			
			case 1 : productInput();break;
			case 2 : productPrint();break;
			case 0 : System.out.println("========프로그램을 끝마치겠습니다======"); break;
			default : System.out.println("잘못입력하셨네요 다시 입력해주세요");
			}
		
		}while(menu !=0);
				
	}
	//키보드로 도서 정보를 입력 받아 객체 생성하기
	public void productInput() {
		
		System.out.println("======제품 정보 추가======");
		
		
		System.out.print("\n제품 번호 : ");
		int pId = sc.nextInt();
		sc.nextLine();//nextint 뒤에 nextline이 오는 경우 입력버퍼 개행 제거해주기!
		
		System.out.print("\n제품명 : ");
		String pName =sc.nextLine();
		
		System.out.println("\n제품 가격 : ");
		int price =sc.nextInt();
		
		System.out.println("\n제품 세금 : ");
		double tax = sc.nextDouble();
		
		
		//매개변수 생성하여 만든 값을 필드에 만든 배열 프로에 넣어주기(인덱스는 카운트로 해서)
		pro[count] =new Product2(pId,pName, price, tax);
		//=> 제품을 추가할때마다 해주는 것!
	}
	
	public void productPrint() {
		if(pro[count]==null) {
				System.out.println("\n--등록된 제품이 없습니다. 제품 등록을 먼저 해주세요--\n");
		}else {
		
		//현재 생성된 객체까지만 for문을 돌릴꺼라는 의미 count
		for(int i=0; i<=count; i++) {
			System.out.println(pro[i].information());
			
			}
			
		}
		
	}
}
