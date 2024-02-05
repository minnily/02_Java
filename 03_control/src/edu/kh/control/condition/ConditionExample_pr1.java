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
		
		
		
		
	}
	
	
	public void ex3() {
		
		//양수, 음수 , 0판별
		//if(조건식 =else if (조건식) -else
		
		
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