package edu.kh.control.condition;

import java.nio.file.spi.FileSystemProvider;
import java.security.PublicKey;
import java.util.Scanner;

public class ConditionExample_pr1 { //기능제공용 클래스

	//필드에 공통적으로 연결할 scanner를 만들어두면 안에 있는 
	//메서드에서 불러 사용할 수 있음.
	Scanner sc = new Scanner(System.in);

	public void ex1() {
	
		//if문
		//조건식이 true 일때만 내부코드 수행
		
		/*
		 * [작성법]
		 * if(조건식){
		 * 		조건식이 true 일때 수행할 코드
		 * }
		 * 
		 * */
		
		//입력받은 정수가 양수인지 검사
		//양수라면 "양수입니다"출력
	
		System.out.print("입력할 수 :");
		int num= sc.nextInt();
		
		if(num > 0) {
			System.out.print("양수입니다.");
			
		}else {
			System.out.println("양수가 아닙니다.");
		}
	}
	
	public void ex2() {
		
		//if-else 문
		//조건식 결과가 true면 if문, flase면 else 구문이 수행됨
		
		/*
		 * [작성법]
		 * 
		 * if(조건식){
		 * 		조건식이 true일 때 수행될 코드
		 * } else{
		 * 		조건식이 false일 때 수행 될 코드
		 * }
		 * */
		
		//홀짝 검사
		
		//입력 받은 정수 값이 홀수이면 "홀수입니다"출력
		//0이면 "0입니다"
		//짝수이면 "짝수입니다" 출력 (중첩if문으로 작성)
		
		 System.out.println("[홀짝검사]");
		 
		 System.out.println("입력할 정수 : ");
		 int i =sc.nextInt();
		 
		 if(i == 0) {
			 System.out.print(i+ "는 0입니다\n");
		 }else { 
			 if(i % 2 == 0) {
				 System.out.print(i+"는 짝수입니다\n");
			 }else {
				 System.out.print(i + "는(/은) 홀수입니다\n");
			 }
		 }
	}
	
	
	public void ex3() {
		
		//양수, 음수 , 0판별
		//if(조건식 =else if (조건식) -else
		
		System.out.println("[양수 vs 음수 vs 0 인지 판별하기]");
		
		System.out.println("입력할 수 ?");
		int input =sc.nextInt();
		if(input>0) {
			System.out.print("양수입니다\n");
		}else if(input == 0) {
			System.out.print("0입니다\n");
		}else {
			System.out.print("음수입니다\n");
		}
		
	}
	
	public void ex4() {
		//달(month)을 입력받아 해당 달에 맞는 계절을 출력
		//단, 겨울일때 온도가 -15도 이하 "한파경보", -12도 이하 "한파주의보"
		//여름일때 온도가 35도 이상 "폭염 경보" ,33도 이상 "폭염주의보"
		//1-12 사이가 아닐 땐"해당하는 계절이 없습니다" 출력
		//1,12,12 겨울
		//3~5 봄
		//6~8 여름
		//9~11 가을
		
		
		///
		
		//스케너에 입력할 달에 대해 입력할 수 있게 만들기
		//숫자가 들어갈 달에 대해서 스케너에 변수지정
		
		System.out.println("[계절과 온도 입력하여 나타내기]");
		
		System.out.println("달을 입력하세요 :");
		int month =sc.nextInt();
		
		//계절을 작성하여 결과를 저장할 변수를 임의로 선정하기
		String season;
		
		//if문을 사용하여 어떤 달은 그 계절인가에 대한 조건문 만들기
		if(month == 1 || month == 2 || month == 12) {
			season = "겨울";
			
			System.out.print(month +" 월은 "+season +" 입니다. "+ month +" 월의 온도는 몇도인가요?");
			int temp=sc.nextInt();
			
			if(temp <= -15) {
				season += "한파경보";
			
			}else if(temp <=-12) {
				season += "한파주의보";
			}
			
			System.out.print(season);
		}
			
			//온도를 입력하여 이를 출력할 상황 만들고 온도에는 수를 넣을 예정이니
			//임의의 변수 지정하기
	
	
			//조건문을 사용하여 온도에 관련된 조건문을 작성하고 계절을 나타내는 변수에 
			//누적해서 띄워줄 표현을 작성(옆에 작성해야하기에 print를 사용)
		else if(month == 9 || month == 10 || month == 11) {
			season = "가을";
			 System.out.print(month +" 월은 "+season +" 입니다. ");
		}
		
		 else if(month == 3 || month == 4 || month == 5) {
			 season = "봄";
			 
			 System.out.print(month +" 월은 "+season +" 입니다. ");
			}
		 else if(month == 6 || month == 7 || month ==8) {
			 season = "여름";
			 
			 System.out.print(month +" 월은 "+season +" 입니다. "+ month +" 월의 온도는 몇도인가요?");
				int temp=sc.nextInt();
				
				if(temp >= 35) {
					season += "폭염경보";
				
				}else if(temp >=33) {
					season += "폭염주의보";
				}
				
				System.out.print(season);
		 }else {
				System.out.print("해당하는 계절이 없습니다 다시입력해주세요");
			}
		//
		
		
		
		
	}
	
	public void ex5() {
		
	}
	
	public void ex6() {
		
	}	

	public void ex7() {
		
	}

	public void ex8() {
		
		
		
		
	}
}