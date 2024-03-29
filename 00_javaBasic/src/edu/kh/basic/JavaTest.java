package edu.kh.basic; 

// 한 줄 주석 : (컴파일러(번역기)가 해석하지 않는 부분


/* 범위 주석 
 * 
 * 
 * 
 * 
 * */ 


//class : 자바 코드가 작성되는 영역
public class JavaTest {
	
	public static void main(String[] args) {
	//main method(메서드: 하나의 기능 단위) : 자바 애플리케이션(프로그램)을 실행하기 위해 반드시 필요한 메서드

		
		//ctrl +art + 방향키 : 작성한 방향으로 해당 줄 복사
		//저장 후 ctrl+ F11 콘솔창에 나오게 하는 단축키
		System.out.println("Hello world!!!");
		System.out.println("안녕");
		System.out.println("반가워");
		//syso +ctrl + space : System.out.println(); 자동완성 됨
		System.out.println("---------------------------------");
		
		
		//숫자연산
		System.out.println("1+2"); //1+2 (문자열로 인식)
		System.out.println(1+2); // 3
		
		// "" 안에 작성된 코드는 단순 문자열로 인식
		// "" 안에 작성되지 않은 코드는 숫자, 변수로 인식
		
		System.out.println(50 - 23);
		System.out.println(12 * 13);
		System.out.println(327 / 3);
		System.out.println(12 % 2);
		
		// ""(문자열) + 숫자 함께 작성
		System.out.println("14 * 19 =" + 266); // 14+19 = 266
		System.out.println("14 * 19 =" + 14*19); // 14+19 = 266
		
		System.out.println("90 + 70 + 65 =" + (90 + 70 + 65)); //우선순위에 따라 문자열 이어쓰기로 인식 됨. 계산하고 싶은 경우 () 로 묶어주면 됨
		//따라서 자바는 사칙 연산의 우선순위를 그대로 따르기에 우선계산을 원하면 () 사용하면 됨 
		// + 대신 ,쓰면 에러뜸. +로 연결해줘야 함.
		 												
		// +기호의 역할 -> 숫자 + 숫자 = 덧셈 연산 결과 -> 문자열 + 숫자  or  문자열 + 문자열 == 이어쓰기 
	}
} 
