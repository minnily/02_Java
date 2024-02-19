package edu.kh.exception.model.service;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class ExceptionService {
	// 예외(Exception) : 소스 코드의 수정으로 해결 가능한 오류
	
	//예외는 두 종류로 구분되는데 , Unchecked Exception 와 Checked Exception 이 있다.
	// 1)Unchecked Exception : 선택적으로 예외처리(ex_ Runtime Exception..)
	// 2)Checked Exception : 필수적으로 예외처리(ex_ IOException,나머지 ...)
	
	//
	
	private Scanner sc= new Scanner(System.in);
	
	public void ex1() {
		System.out.println("[두 정수를 입력받아 나누기한 몫을 출력]");
		
		System.out.println("정수 1 입력 : ");
		int input1 = sc.nextInt();
		
		System.out.println("정수 2 입력 : ");
		int input2 = sc.nextInt();
		
		try {
			System.out.println("결과 : " + input1/input2); //예외가 발생할 것 같은 코드를 넣어줌!
		}catch(ArithmeticException e) {
			//try에서 던져진 예외를 catch문의 매개변수 e로 잡은 것!
		    //발생한 예외를 작성하고 + 매개변수를 지정해주면 된다.
			
			System.out.println("try문 infinity");//처리코드
			
		}
		
		//System.out.println("결과 : " + input1/input2);
			// 그냥 이렇게 출력하면 5를 0으로 나누게 되는 경우에 산술적 예외가 발생! ( 0으로 나눌수 없다)
			// 따라서 예외 발생에 대한 처리를 해주면 오류 발생하지 않고 실행된다. (위에 해결방안 적어둠!)
		
		//=======================================================================================================//
		if(input2 !=0 ) {
			System.out.println("결과 : " + input1/input2);
		}else {
			System.out.println("if 문 infinity");
		}
		
		/* => 발생하는 예외 중 일부 예외 try-catch 구문을 사용하지 않아도 예외 상황 방지를 할 수 있다!(if-else)
		 * 일부 예외 == 대부분 Unchecked Exception */
		
	} 

	public void ex2() {
		//[여러가지 예외에 대한 처리방법]
		
		try {
		System.out.println("입력 1 : "); //1번째 예외 InputMismatchException (문자열을 넣었을 때)
		int num1=sc.nextInt();
		
		System.out.println("입력 2 : ");
		int num2=sc.nextInt();
		
		System.out.println("결과 : " + num1/num2); //2번째 예외 ArithmeticException (0으로 나눴을 때)
		
		String str = null; //3번째 예외 ullPointerException (값이 null로 설정했을 때)
		
		System.out.println(str.charAt(0));
		//catch 여러가지 쓸때 자식 부분(작은 부분)부터 작성하고 부모타입을 마지막에 작성해야 한다!
		}catch(InputMismatchException e) {
			System.out.println("타입(정수)에 맞는 값만 넣어주세요"); 
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		}catch(Exception e) {
			//Exception 클래스 : 모든 예외의 최상위 부모!
			//다형성 중  업캐스팅 상태!(부모타입 참조변수로 자식객체를 참조하는 것임)
			
			//** 상위 타입의 예외 클래스를 catch문에 작성하면 다형성 업캐스팅에 의해 모두 잡아서 처리가 가능!**
			// 상세한 처리는 어렵지만 한번에 같은 명령이 필요한 경우에는 이 방법이 유용함.
			
			System.out.println("예외가 발생하여 처리가 필요함.");
			
			e.printStackTrace(); // 발생한 예외에 대한 메서드와 위치에 대한 모든 내용을 출력! => 예외 발생 지점 추적하는 것
					
		}
		
	}

	public void ex3() {
		//try-catch-finally
		//finally : try 구문에서 예외가 발생 하든 말든 무조건 마지막에 수행
		
		try {
			
			System.out.println("입력 1 : "); //1번째 예외 InputMismatchException (문자열을 넣었을 때)
			int num1=sc.nextInt();
			
			System.out.println("입력 2 : ");
			int num2=sc.nextInt();
			
			System.out.println("결과 : " + num1/num2); //2번째 예외 ArithmeticException (0으로 나눴을 때)
			
		}catch (Exception e) {
			
			System.out.println("예외 처리 됨");
			
			//catch문 매개변수 활용
			//매개변수 e : 예외 관련된 정보 + 예외 관련 기능
			
			System.out.println(e.getClass());
			//예외 발생 시 어떤 예외 클래스인지 보여주는 것 => class java.lang.ArithmeticException
			
			System.out.println(e.getMessage());
			//예외 발생 시 출력된 내용을 보여주는 것 => / by zero
			
			System.out.println(e);
			// e == e.toString(); 
			// 위의 내용들으 모두 보여준다!=> java.lang.ArithmeticException: / by zero
			
		}finally {
			
			System.out.println("예외발생 안해도 무조건 수행 됨");
			sc.close();//메모리 누수 방지!를 위해 버퍼 통로(스캐너 통로)를 꼭 닫아줘야 한다. 
			
		}
	}

	public void ex4() {
		//throws : 호출한 메서드에게 예외를 던짐 -> 호출한 메서드에게 에외를 처리하라고 위임하는 행위
		
		//throw : 예외를 강제로 발생시키는 구문
		try {
			methodA();//예외발생한 메서드
		}catch(Exception e) {
			//Exception : 모든 예외의 최상위 부모
			//== 예외 종류 상관없이 모두 처리
			
			System.out.println("methodC에서부터 발생한 예외를 ex4()에서 잡아 처리함");
		}
		
		
	}
	
	public void methodA() throws IOException{
		methodB();
	}
	
	public void methodB() throws IOException{
		methodC();
	}
	
	public void methodC() throws IOException{
		//예외 강제 발생
		throw new IOException(); //checked Exception!
	}
}
