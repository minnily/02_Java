package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String[] args) {
		
		//사칙연산 계산기
		// 두 실수를 입력받아 사칙연산 결과를 모두 출력 
		// 단, 출력된 결과값은 소수점 이하 2째자리까지만 표현
		
		//정수 : sc.nextInt(); 실수 : sc.nextDouble();
		
		Scanner s = new Scanner(System.in);
		
		//print()를 쓰는 이유?  입력받아야하는 내용이 옆이 아니라 밑에 생기기 때문!
		System.out.print("실수 1 입력 :"); 
		double dou1 = s.nextDouble();
		
		System.out.print("실수 1 입력 :");
		double dou2 = s.nextDouble();
		
		//사칙연산 결과 모두 출력
		System.out.printf("%.2f + %.2f = %.2f\n", dou1,dou2,dou1+dou2);
		System.out.printf("%.2f - %.2f = %.2f\n", dou1,dou2,dou1-dou2);
		System.out.printf("%.2f * %.2f = %.2f\n", dou1,dou2,dou1*dou2);
		System.out.printf("%.2f / %.2f = %.2f\n", dou1,dou2,dou1/dou2);
	}
}                            
