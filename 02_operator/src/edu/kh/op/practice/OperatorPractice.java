package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수 : ");
		int input1 =sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int input2 =sc.nextInt();
		
		int candy = input2 / input1;
		int result = input2 - (input1 * candy);
		System.out.printf("1인당 사탕 개수 : %d\n", candy);
		System.out.printf("남은 사탕 개수 : %d\n", result );
		//input2%input1
		
	}
	
	 public void practice2(){
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("이름 :");
		 String input1 = sc.next();
		 
		 System.out.print("학년 :");
		 int input2 = sc.nextInt();
		 
		 System.out.print("반 :");
		 int input3 = sc.nextInt();
		 
		 System.out.print("번호 : " );
		 int input4 = sc.nextInt();
		 
		 System.out.print("성별 : "  );
		 String input5 = sc.next();
		 
		 System.out.print("성적 :");
		 double input6 = sc.nextDouble();
		 
		
		 
		 System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n", input1 , input2, input3, input4, input5, input6);
		 
		 	 	 
	 }
	 
	 public void practice3(){
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("국어 :");
		 int kor = sc.nextInt();
		 
		 System.out.print("영어 :");
		 int eng = sc.nextInt();
		 
		 System.out.print("수학 :");
		 int math = sc.nextInt();
	 
	 
		 int sum = kor + eng + math;
		 
		 double avg =sum/3.0;
		
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.1f\n" , avg);
		// 세과목의 점수가 각각 40점 이면서 평균이 60점 이상일때 합격
		//아니면 불합격을 출력해라
		
		boolean result = (kor >= 40)&& (eng >= 40) && (math >= 40) && (avg >= 60); 
		
		System.out.println(result ? "합격": "불합격");
	 }
}
