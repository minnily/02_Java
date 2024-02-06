 package edu.kh.control.loop;


import java.util.Scanner;

public class ForExample {

	Scanner sc= new Scanner(System.in);
	
	/*
	  * for 문
	  * -끝이 정해져 있는 (횟수가 지정되어 있는) 반복문
	  * 
	  * [작성법]
	  * 
	  * for(초기식; 조건식; 증감식){
	  * 	조건식이 true 라면 반복 수행할 코드
	  * }
	  * 
	  * 
	  * 
	  * - 초기식 : for 문을 제어하는 용도의 변수 선언

	  * - 조건식 : for 문의 반복 여부를 지정하는 식.
	  * 			보통 초기식에 사용된 변수를 이용하여 조건식을 작성함.
	  * 
	  * - 증감식 : 초기식에 사용된 변수를 for 문이 끝날 때 마다
	  * 			증가 또는 감소시켜 조건식의 결과를 변하게 하는 식

	  * */
	
	public void ex1() {
		
		for(int i =1; i >=10; i++) {
			System.out.println(i);
		}
		
		
	}
	
	public void ex2() {
		
		
		System.out.print("입력번호 :");
		int num =sc.nextInt();
		
		for(int i =1; i <= num; i++) {
			System.out.println(num);
		}
		
	}
	
	public void ex3() {
		
		//영어 알파벳 A부터 Z까지 한줄로 출력
		//*char  자료형은 문자형이지만 실제로 정수(문자표 번호)를 저장한다.
		
		for(int i ='A'; i<='Z';i++) {
			System.out.print((char)i);//강제형변환
		}
		
		System.out.println("\n===============================");
		for(char i ='A';i<='Z';i++) {
			System.out.print(i);
		}
		
	}

	public void ex4() {
		//정수 5개를 입력받아서 합계 구하기
		
		
		int sum =0; //합계에 저장용 변수로 sum으로 만들어주고 초기값을 0으로 둔다.
		
		
		
		
		for(int i =1; i <= 5; i++) {
			System.out.print("입력 " + i + ":");
			int input1 =sc.nextInt();
			
			//합계저장용 변수(sum)에 input1값 누적
			sum+= input1;
			
		}
		
		System.out.println("합계 :" + sum);
		
	}

	public void ex5() {
		
		//1부터 20까지 1씩 증가하면서 출력
		//단, 입력받은 수의 배수는 양쪽에 ()표시
		
		//ex) 괄호를 표시할 배수 : 3
		//1 2 (3) 4 5 (6) 7 8 (9) ...
		
		System.out.print("괄호를 표시할 배수 : ");
		int input =sc.nextInt();
		
		
		for(int i=1; i<=20; i++) {
						
			if(i % input ==0 ) {
				System.out.print("(" + i + ")" );
			}else {
				System.out.print(i +  " " );
			}
		}
		
		
		
		
	}

	public void ex6() {
		//[구구단 출력]
		//2~9사이 수를 하나 입력받아 해당 단을 출력
		//단, 입력받은 수가 2~9사이 숫자가 아니면 "잘못 입력하셨습니다" 출력
	
		
		System.out.print("단 입력 :");
		int num =sc.nextInt();
		
			
			if(num>=2 && num <=9) {
				for(int i = 1; i <=9 ; i++) {
				System.out.printf("%d X %d = %d\n", num , i , num*i);		
			   }	
			}else {
				System.out.println("잘못 입력하셨습니다.");
			
			}
					
						
		
	}

	public void ex7() {
		//구구단 모두 출력하기
		
		for(int num =2 ; num <=9; num++) {
			
			for(int i =1; i <=9; i++) {
					
				System.out.printf("%d X %d = %2d  ", num, i, num * i);	
				//%2d를 넣으면 2자리인 수와 1자리인 수가 잘 정렬된다.
			}
			System.out.println(); //안쪽 포문이 끝나면 줄바꿈하는 방법
		}

	System.out.println("===============================================");	
		
		//구구단 역순 출력하기
		//9단 -> 2단까지 역방향 , 곱해지는 수는 1-> 9 정방향
		
		for(int num=9; num >= 2; num--) {
			for(int i =1; i <=9; i++) {
				
				System.out.printf("%d X %d = %2d  ", num, i, num * i);		
			}
			System.out.println();
		}
		
	}

	public void ex8() {
		//숫자세기 count
		
		//1부터 20까지 1씩 증가하면서 입력받은 수의 배수의 총 개수 출력
		//입력받은 수의 배수의 합계 출력
		
		// ex) 배수 입력 : 3
		// 3 6 9 12 15 18 : 6개
		// 3의 배수 합계 : 63
		
		int count =0; //n의 배수의 개수를 세기 위한 변수
		int sum =0; //n의 배수의 합계를 구하기 위한 변수
		String result ="";
		
		
		System.out.print("배수 입력 :");
		int num = sc.nextInt();
		
		for(int i =1; i<=20; i++) {
		
			if(i % num == 0 ) {
				
				result += i + " ";
				count++;
				sum += i;
				
			}	
		}
		
		System.out.printf("%s : %d개\n", result, count);
		System.out.printf("%d의 배수 합계 : %d", num, sum);
			
	}
}
