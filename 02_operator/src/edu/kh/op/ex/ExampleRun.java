package edu.kh.op.ex;

public class ExampleRun { //코드 실행용 클래스
		//메인 메서드 필수 작성
	public static void main(String[] args) {
		
		//OpExample 생성 -> OpExample이라는  클래스(설계도)를 이용해서 객체를 생성하는데, 그 객체 이름이 ex이다
		OpExample ex = new OpExample();
		//import를 하지 않았는데 에러 발생하지 않음. 
		// why? => 같은 패키지(edu.kh.op.ex)안에 있는 클래스는 import를 하지 않아도 불러다 쓸 수 있다
	
	
		ex.ex1();//ex가 가지고 있는 ex1() 메서드 실행
		
		ex.ex2();
		
		ex.ex3();
		
		ex.ex4();
		ex.ex5();
	}
	
}
