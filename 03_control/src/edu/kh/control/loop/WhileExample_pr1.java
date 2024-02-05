package edu.kh.control.loop;

import java.util.Scanner;

public class WhileExample_pr1 {

	Scanner sc = new Scanner(System.in);
	
	
		/* while 문
		 *  
		 *  -별도의 초기식, 증감식이 존재하지 않고 반복 종료 조건을 자유롭게 설정하는 반복문
		 *  
		 *  **확실히 언제 반복이 끝날지는 모르지만 언젠가 반복 조건이 false 가 되는 경우 반복을 종료함
		 *  
		 *  
		 *  [작성법]
		 *  
		 *  while(조건식){
		 *  	조건식이 true 일 때 반복 수행할 구문
		 *  }
		 *  
		 *  */
	
	
		public void ex1() {
			// 임의로 들어갈 input값 지정
			//메뉴선택, 1쫄면 ,2김밥,3떡볶이,0종료를 스케너에 띄운 후 메뉴선택을 하게 만들기
			//값이 0이 아닐때까지 반복할 예정
			//switch문을 사용하여 case설정 (break꼭 쓰기) default도 작성
			
			int input =5;
			
			while(input!=0) {
				System.out.println("==메뉴선택==");
				System.out.println("==1.라면==");
				System.out.println("==2.김밥==");
				System.out.println("==3.돈까스==");
				System.out.println("==4.떡볶이==");
				System.out.println("==0.종료==");
				
				System.out.print("메뉴선택 >>> ");
				
				input = sc.nextInt();
				
				switch(input) {
				case 1 : System.out.print("라면을 선택하셨습니다"); break;
				case 2 : System.out.print("김밥을 선택하셨습니다"); break;
				case 3 : System.out.print("돈까스을 선택하셨습니다"); break;
				case 4 : System.out.print("떡볶이을 선택하셨습니다"); break;
				case 0 : System.out.print("메뉴선택을 종료하겠습니다"); break;
				default : System.out.print("다시 입력해주세요");
				}
			
			}	
		}

		public void ex2() {
			//입력되는 모든 정수의 합 구하기
			// 단, 0이 입력되면 반복 종료 후 결과 출력 -> 0이 입력되지 않으면 계속 반복
			//do~while 문
			
			/*
			 * do {
			 *
			 *	반복 수행할 코드 -> 무조건 한번은 수행
			 *
			 *}while(조건식);
			 *
			 **/
			
			//입력 받은 값을 저장할 변수하기
			//합을 저장할 변수 지정하기
			
			
			int input=0;
			int sum=0;
			
			do{
				System.out.print("정수를 입력하세요 :");
				input=sc.nextInt();
				sum += input;
				
			}while(input!=0);
			
			System.out.println("입력한 정수의 합 :" + sum);
			
			
			
		}		
}
