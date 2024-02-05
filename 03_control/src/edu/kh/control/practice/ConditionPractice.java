package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	Scanner sc =new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("숫자 한 개 입력하세요 :");
		int num1 =sc.nextInt();
		
		if(num1>0) { 
			
			//짝수인경우
			if(num1 % 2 == 0) {
				System.out.print("짝수입니다.");
			}else {
				System.out.print("홀수입니다");}	
		}else {
			System.out.println("양수만 입력해주세요");	
		}
		
		
	}

	
	public void practice2() {
		
		System.out.print("국어점수 :");
		int input1 =sc.nextInt();
		
		System.out.print("수학점수 :");
		int input2 =sc.nextInt();
		
		System.out.print("영어점수 :");
		int input3 =sc.nextInt();
		
		int sum = input1+input2+input3;
		double ava = sum/3;
		
		
		if((input1 >=40 && input2 >=40 &&  input3 >=40) && ava>=60){
		 
			System.out.printf("국어 : %d\n 수학 : %d\n 영어 : %d\n 합계 : %d\n  평균 : %.1f\n 축하합니다, 합격입니다!",
								input1, input2, input3, sum, ava);
		  
		}else{
			System.out.print("불합격입니다.");
		}
		
		
		
	}
	
	
	
}
