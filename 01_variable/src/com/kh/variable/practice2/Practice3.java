package com.kh.variable.practice2;

import java.util.Scanner;

public class Practice3 {

	public void ex2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 :");
		double input1 = sc.nextDouble();
		
		System.out.print("영어 :");
		double input2 = sc.nextDouble();
		
		System.out.print("수학 :");
		double input3 = sc.nextDouble();
		
		
		System.out.printf("총점 : %d\n", (int)(input1+input2+input3));
		System.out.printf("평균 : %d\n", (int)(input1+input2+input3)/3);
		
	}
	
	public void ex3() {
		
		//sc.next() 와 sc.nextLine()의 차이

		//next() : 띄어쓰기 입력 불가, 띄어쓰기를 구분인자로 생각하여 각각 저장,
		//안녕하세요(o) 안녕 하세요(x)
		//nextLine() : 문자열에 띄어쓰기 가능, 줄구분까지 저장
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력1 : ");
		String input1 = sc.nextLine();

		System.out.print("문자열 입력2 : ");
		String input2 = sc.next();
		
			
		System.out.println(input1);
		System.out.println(input2);
	}
	
	public void ex4() {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("정수 입력 : ");
	int input1 =sc.nextInt();
	System.out.println(input1);
	

	sc.nextLine(); //입력버퍼에 남은 개행문자 제거
	
	
	System.out.print("문자열 입력 : ");
	String input2 =sc.nextLine();
	System.out.println(input2);
	
	}

}
	
	
	