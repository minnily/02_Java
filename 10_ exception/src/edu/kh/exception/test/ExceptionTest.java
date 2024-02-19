package edu.kh.exception.test;

public class ExceptionTest {
	public static void main(String[] args) {
		
		//[에러]
		//1. 컴파일 에러 => 개발자가 코드를 잘못 쓴 경우
		//int a =99.9; Type mismatch: cannot convert from double to int 
		//-> 자료형이 맞지 않아 연산 불가하여 "컴파일 에러" 가 발생(코드 틀림)
		//=> 따라서 컴파일 에러는 개발자가 직접 코드로 수정이 가능하다! int a = (int) 99.9;
		
		//2. 런타임 에러 => 프로그램 수행 중 발생하는 에러
		//					주로 if문으로 처리가 가능하다.
		int[] arr = new int[3]; // 길이 3 : 인덱스 0,1,2 까지
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		//arr[3] = 40; => java.lang.ArrayIndexOutOfBoundsException : 배열 범위 초과 예외
		//(컴파일 했을 때는 에러가 안나지만 프로그램 실행했을 때 에러가 발생(=>런타임 에러) 
		
		if(3 >= arr.length) {//배열 인덱스 범위 초과 시를 말하는 것!
			System.out.println( "배열 범위를 초과했습니다." );
		}else {
			arr[3] = 40;
			arr[4] = 50;
		}
	}
}
