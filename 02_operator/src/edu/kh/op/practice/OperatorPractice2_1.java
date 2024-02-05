package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2_1 {
	
	 public void practice1() {
		 
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.print("인원 수 : ");
		 int input1 = scan.nextInt();
		 
		 System.out.print("사탕 개수 : ");
		 int input2 = scan.nextInt();
		 
		 
		 int candy = input2/input1 ;
		 int all = input2%input1;
		 System.out.printf("1인당 사탕 개수: %d\n", candy);
		 System.out.printf("남는 사탕 개수: %d\n ", all);
		
		
	 }


	 
	 public void practice2() {
		 
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.print("이름 :");
		 String input1 = scan.next();
		 
		 System.out.print("학년 :");
		 int input2 =scan.nextInt();
		 
		 System.out.print("반 :");
		 int input3 =scan.nextInt();
		 
		 System.out.print("번호 :");
		 int input4 =scan.nextInt();
		 
		 System.out.print("성별 :");
		 String input5 =scan.next();
		 
		 System.out.print("성적 :");
		 double input6 =scan.nextDouble();
		 
		 System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n",
		 		input2, input3, input4, input1, input5, input6);
		 
		
	}
	 
	 public void practice3() {
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.print( "국어 :");
		 int input1 = scan.nextInt();
		 System.out.print("영어 :");
		 int input2 = scan.nextInt();
		 System.out.print("수학 :");
		int input3 = scan.nextInt();
		 
		 
		 int sum = input1 + input2 +input3;
		 double ave = sum / 3.0;
		 
		System.out.printf("합계 : %d\n",sum);
		System.out.printf("평균 : %.1f\n",ave);
		 
	}
}
