package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {
	
	public void practice() {
		
		Book bo = new Book(null, 0, 0, null);
		
		
		System.out.print(bo.getTitle() + " /");
		System.out.print(bo.getPrice() + " /");
		System.out.print(bo.getDoscountRate() + " /");
		System.out.print(bo.getAuthor()+"\n");
		
		bo.setTitle("자바의 정석");
		bo.setPrice(30000);
		bo.setDoscountRate(0.2 );
		bo.setAuthor("남궁성");
		
		
		System.out.print(bo.getTitle().toString()+ " /");
		System.out.print(bo.getPrice()+ " /");
		System.out.print(bo.getDoscountRate()+ " /");
		System.out.print(bo.getAuthor().toString());
		
		
//		System.out.print("\n" + bo.getTitle()+ " /");
//		System.out.print(bo.getPrice()+ " /");
//		System.out.print(bo.getDoscountRate()+ " /");
//		System.out.print(bo.getAuthor());
		
		
		System.out.println("\n==================================");
		
		Book bo1 = new Book(null, 0, 0, null);
		
		bo1.setTitle("c언어");
		bo1.setPrice(30000);
		bo1.setDoscountRate(0.1 );
		bo1.setAuthor("홍길동");
		
		System.out.println("수정된 결과 확인");
		System.out.print(bo1.getTitle().toString()+ " /");
		System.out.print(bo1.getPrice()+ " /");
		System.out.print(bo1.getDoscountRate()+ " /");
		System.out.print(bo1.getAuthor().toString());
		System.out.println("\n==================================");
		
		
		
	}
	
		

	
}
