package edu.kh.variable.ex2;

import java.util.Scanner;

//import java.util.Scanner;

//import : 다른 패키지에 존재하는 클래스를 얻어오는 구문
//import java.util.Scanner : java.util 패키지에서  Scanner 설계도 수입
public class ScannerExample {
	public static void main(String[] args) {
		
		//Scanner : 프로그램 실행 중 키보드 입력을 받을 수 있게하는 역할
	
		//Scanner 생성 -> 프로그램 안에 스캐너라는 기계를 만드는 행위
		
		Scanner sc = new Scanner(System.in);
		// 오류 발생 ! (오류발생 시 오류발생한 부분에 마우스커서 올려두면 어떤 오류인지 해결할 수 있음)
		// why?  만들고 싶지만 설계도(Class)가 없어서 만들지 못함 
		//따라서 import 구문을 작성하면 오류 해결됨.
		
		System.out.print("정수 1 입력 : ");
		
		
		int input1 = sc.nextInt(); //사용자가 입력받은 정수를 input1이라는 변수에 대입한 것
		//nextInt() : 다음(키보드로) 입력된 정수를 읽어오는 것
		
		System.out.print("정수 2 입력 : ");
		int input2 = sc.nextInt();
		
		System.out.printf("%d + %d = %d\n", input1,input2,input1+input2);
	
	}

}

