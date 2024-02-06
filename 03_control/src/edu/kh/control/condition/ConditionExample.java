package edu.kh.control.condition;

import java.nio.file.spi.FileSystemProvider;
import java.security.PublicKey;
import java.util.Scanner;

public class ConditionExample { //기능제공용 클래스

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
		
		System.out.print("정수입력 :");
		int input1 =sc.nextInt();
		

		if(input1>0) {
			System.out.println("양수입니다");

		}
		if(input1<=0) {
			System.out.println("양수가 아닙니다");
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
		
		
		System.out.print("정수 입력 :");
		int input1 =sc.nextInt();
		
		if(input1 % 2 != 0) {
			System.out.println("홀수입니다.");
		} else {
			
			if(input1 == 0 ) {
			System.out.println("0입니다.");
		} else{
			System.out.println("짝수입니다.");}
			
		}
		
	}
	
	
	public void ex3() {
		
		//양수, 음수 , 0판별
		//if(조건식 =else if (조건식) -else
		
		System.out.print("정수 입력 :");
		int input1 =sc.nextInt();
		
		if(input1 > 0) {
			System.out.println("양수입니다.");
		} else if(input1 < 0 ) {
			System.out.println("음수입니다.");
		} else{
			System.out.println("0 입니다.");}
			
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
		
		
		System.out.print("달(month) 입력 : ");
		int month = sc.nextInt();
		
		
		String season; //아래 조건문 수행 결과를 저장할 변수 선언\

		if(month ==1 || month == 2 || month ==12) {
			season ="겨울";
			
			System.out.print("온도 입력 : ");
			int temperature = sc.nextInt();
			
			if(temperature <= -15) {
				season += "한파 경보";
				//시즌에 겨울이 들어가있었는데 +=하면 season에 "한파경보"를 넣겠다는 의미
				//== "겨울 한파 경보" 가된다(복합대입)
			} else if (temperature <= -12) {
				season += "한파 주의보";
			} //else if를 쓴이유는 나머지는 season에 대한 값이 나오게 하려고
			
			
			
		}else if(month >= 3 && month <=5) {
			season ="봄";
		} 
		
		
		
		else if (month >= 6 && month <= 8) {
			season ="여름";
			
			System.out.print("온도 입력 : ");
			int temperature = sc.nextInt();
			
			if(temperature > 35) {
				season += "폭염경보";
				//시즌에 겨울이 들어가있었는데 +=하면 season에 "한파경보"를 넣겠다는 의미
				//== "겨울 한파 경보" 가된다(복합대입)
			} else if (temperature >=33) {
				season += "폭염주의보";
			}
		
		}
		
		
		
		
		else if (month<=9 && month <= 11) {
			season ="가을";
		}else {
				season="해당하는 계절이 없습니다";
		}
		
		
		
	}
	
	public void ex5() {
		System.out.print("나이를 입력해주세요 :");
		int age =sc.nextInt();
		
		if(age>19) {
			System.out.print("성인 입니다.");
		} else if (age > 13) {
			System.out.print("청소년 입니다.");
		} else if (age > 0 && age <= 13) {
			System.out.print("어린이 입니다.");
		} else {
			System.out.print("다시 입력해주세요");
		};
	}
	
	public void ex6() {
		System.out.print("점수를 입력해주세요 :");
		int input1 = sc.nextInt();
		
		if(input1 < 0 || input1 >100) {
			System.out.print("잘못입력했습니다");
		}else if(input1 < 60) {
			System.out.print("F");
		}else if(input1 < 70) {
			System.out.print("D");
		}else if(input1 < 80) {
			System.out.print("C");
		}else if(input1 < 90) {
			System.out.print("B");
		}else {
				System.out.print("A");
		}
	}	

	public void ex7() {
		System.out.print("나이를 입력해주세요 :");
		int age =sc.nextInt();
		
		if(age< 0 || age > 100) {
			System.out.print("잘못 입력하셨습니다");
		}else if(age < 12) {
			System.out.print("적정 연령이 아닙니다");
		}else {
			
			System.out.print("키를 입력해주세요 :");
			int tall =sc.nextInt();
			
			if(tall < 140) {
				System.out.print("적정키가아닙니다");
			}else {
				System.out.print("탑승가능");
			}
		}
	}

	public void ex8() {
		System.out.print("나이를 입력하세요 :");
		int age = sc.nextInt();
		
		
		String result;
		
		if(age<0 ||  age > 100) {
			result ="나이를 잘못 입력하셨습니다";
		}else {
			
			System.out.print("키 입력 : ");
			double tall =sc.nextDouble();
			
			if(tall <0 || tall > 250) {
				result ="키를 잘못 입력하셨습니다";
			}else {
			
				if(age<12&& tall>=140.0) {
					result= "키는 적정하나, 나이나 적절치 않음";
			}else if(age >=12 && tall < 140.0) {
				result ="나이는 적절하나, 키가 적절치 않음";
			}else if (age <12 && tall <140.0) {
				result = "나이와 키 모두 적절치 않음";
			}else {
				result="탑승가능";
			}
		}
		
		
		
		}
	
		System.out.println(result);
		
//		System.out.print("키를 입력하세요 :");
//		double tall = sc.nextDouble();
//	
		
//		if(age>=0 && age <=100 && tall >= 0 && tall <=250.0) {
//			if(age>=12 && tall >=140.0) {
//				System.out.print("탑승가능");
//			}else if(age >=12 && tall <140.0) {
//				System.out.print("나이는 적절하나, 키가 적절치 않음");
//			}else if(age <12 && tall >=140.0) {
//				System.out.print("키는 적절하나, 나이가 적절치 않음");
//			}else {
//				System.out.print("나이와 키 모두 적절치 않음");
//			}
//		}else {
//			if(age<0 || age >100) {
//				System.out.print("나이를 잘못입력하셨습니다.");
//			}else if(tall < 0 || tall >250.0){
//				System.out.print("키를 잘못입력하셨습니다");
//			}
//		
//		}
		
		
	}
}