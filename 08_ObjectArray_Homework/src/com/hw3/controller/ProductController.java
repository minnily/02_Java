package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {
	
	private Product[] pro = new Product[10];
	
	
	public int count() {
		return 1;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		int book =0;
		
		do {
			
		System.out.println("=======제품 관리 메뉴=======");	
		System.out.println("1. 제품 정보 추가");
		System.out.println("2. 제품 전체 조회");
		System.out.println("0. 프로그램 종료");
		
		System.out.print(" 메뉴입력    :");
		book = sc.nextInt();
		sc.nextLine();
		
		switch(book) {
		case 1 : System.out.println(productlnput());break;
		case 2 : System.out.println(productPrint());break;
		case 0 : System.out.println("========프로그램을 끝마치겠습니다======"); break;
		default : System.out.println("잘못입력하셨네요 다시 입력해주세요");
		}
		
		}while(book !=0);
				
	}
	
	public void productlnput() {
		System.out.println("======제품 정보 추가======");
		
		String list = "";
		int count = 0;
		
		if(list != null) {
		System.out.print("\n제품 번호 : ");
		int pId = sc.nextInt();
		
		System.out.print("\n제품명 : ");
		String pName =sc.nextLine();
		
		System.out.println("\n제품 가격 : ");
		int price =sc.nextInt();
		
		System.out.println("\n제품 세금 : ");
		double tax = sc.nextDouble();
		
		
		
		count ++;
		
		count= count();
		}else {
			System.out.println("입력한 제품 정보가 없습니다");
		}
	}
	
	public void productPrint() {
		
	}
}
