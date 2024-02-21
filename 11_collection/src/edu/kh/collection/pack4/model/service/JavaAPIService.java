package edu.kh.collection.pack4.model.service;

import java.util.ArrayList;
import java.util.List;

public class JavaAPIService {

	/*Wrapper Class
	 * 
	 * -wrap : 감싸다, 포장하다
	 * 
	 * -기본 자료형을 객체로 감싸는 클래스
	 * -> 기본  자료형의 객체화
	 * 
	 * ->왜? 컬렉션처럼 객체만 취급하는 상황에서 
	 * 기본 자료형도 취급 가능한 형태로 바꾸기 위해
	 * 
	 * 
	 * 			-->Boxing
	 * Unboxing
	 * 
	 * boolean <-->Boolean
	 * byte <-->Byte
	 * short <-->Short
	 * int <-->Integer
	 * long <--> Long
	 * float <--> Float
	 * double <--> Double
	 * char <--> Character
	 * 
	 * Boxing, Unboxing을 자동으로 수행되도록 구현되어 있음
	 * ->Auto Boxing, Auto Unboxing
	 * 
	 * */
	
	
	/**
	 * Auto Boxing, Auto Unboxing 확인
	 */
	public void method1() {
		
		int num1 = 100; //int
		
		//Integer wrap1 = new Integer(num1))->삭제 예정인 방법임..!
		
		Integer wrap1 = num1; //컴파일러가 Auto Boxing 수행 코드 추가
								//(int)num1 -> (Integer) num1
		
		int num2 = wrap1; // 컴파일러가 Auto Unboxing 수행 코드 추가
							//(Integer)wrap1 -> (int) wrap1에 저장된 값
		
		
		long num3 = 10_000-000_000L; // 100억
		
		Long wrap2 = num3; //Auto Boxing
		
		long num4 = wrap2; //Auto Unboxing
		
		
		//Integer 객체만 저장하는 List
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10000); //1000은 원래 int인데 Auto Boxing이 된 것 (int) 1000 ->(Integar) 1000
		list.add(20000);
		list.add(30000);
		
		//print 구문 내에서 Wrapper 클래스로 만든 객체를 참조할 때
		//.toString() 호출하는 것이 아닌 Auto Unboxing을 진행해서 기본 자료형으로 변경한다!
		System.out.println(list.get(0) + list.get(1) + list.get(2));
		
	}
	
	/**
	 * Wrapper Class가 제공하는 필드, 메소드
	 * -> 대부분이 static!! 
	 * 	->클래스명. 필드명  / 클래스명. 메소드명() 사용
	 */
	public void method2() {
		
		// 정수형, 실수형 공통
		System.out.println("byte의 용량 : " + Byte.BYTES +"바이트");
		System.out.println("byte의 용량 : " + Byte.SIZE +"비트");
		System.out.println("byte의 최대값 : " + Byte.MAX_VALUE);
		System.out.println("byte의 최소값 : " + Byte.MIN_VALUE);
		
		//실수형만 사용가능
		System.out.println(Double.NaN);
		System.out.println(Double.NEGATIVE_INFINITY);
		System.out.println(Double.POSITIVE_INFINITY);
		
		
		//Boolean(논리형)은 true/false 밖에 없음
		System.out.println(Boolean.FALSE);
		System.out.println(Boolean.TRUE);
		
		System.out.println("=========================================================");
		
		System.out.println("[String-> 기본 자료형 변환]");
		
		//HTML 연결 시 (요청 데이터 처리) 많이 사용
		//HTML에 관련된 모든 값은 String
		
		byte b = Byte.parseByte("1");
		short s = Short.parseShort("2");
		int i =Integer.parseInt("3"); //중요
		long l =Long.parseLong("4");// 중요
		float f = Float.parseFloat("0.1");
		double d =Double.parseDouble("0.2"); //중요
		boolean bool = Boolean.parseBoolean("true");
		
		
		//char는 없음!
		System.out.println("=========================================================");
		
		System.out.println("[기본자료형-> String 변환]");
		
		//String 이어쓰기를 이용한 방법
		// -> 코드는 짧으나 효율이 좋지 않음(속도 down, 메모리 소모 up)
		long test1 =12345678910L;
		String change1 = test1 +""; //long +String = String
		
		//Wrapper Class를 이용하는 방법
		//-코드는 길지만 효율이 좋음
		int test2 = 400;
		String change2 = Integer.valueOf(test2).toString();
		
		double test3 = 4.321;
		String change3 =Double.valueOf(test3).toString();
		
		//자바에서 String은 불변성을 가지고 있음(변하지 x) 
		
		
	}
	
	/**
	 * String의 불변성(Immutable, 변하지 않는 성질 == 상수)
	 * - 문자열이 수정되면 새로운 String 객체가 생성됨0
	 */
	public void method3() {
			
		//System.idenityHashCode(str)
		//-> 주소 값을 이용해서 만든 해시코드 (식별번호)
		//-> 같은 객체에 저장된 값이 변했다면 주소는 일정해야 된다.
		//identityHashCode 도 일정해야한다.
		
		String str = "Hello";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));//617901222
		
		str="World";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));//1159190947
		
		str += "!!!";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));//2061475679
				
		
		
	}
	
	/**
	 * String 리터럴("")로 생성된 객체 활용
	 * -동일한 리터럴을 이용해 String 객체를 생성한 경우
	 * 추가적으로 객체를 생성하지 않고 
	 * 기존에 존재하는 String 객체의 주소를 반환(재활용)
	 * 
	 * 
	 * String 만드는 방법
	 * String str =""; / String str = newString("");
	 */
	public void method4() {
		
		String temp1 = "Hello!!"; //617901222
		String temp2 = "Hello!!"; //617901222
		
		System.out.println(System.identityHashCode(temp1));
		System.out.println(System.identityHashCode(temp2));
		
		//객체의 필드 값을 비교
		System.out.println("저장된 값 비교 : " + temp1.equals(temp2));//true
		
		// 변수에 저장된 값(주소) 비교
		
		System.out.println("주소를 비교 : " +(temp1 == temp2));//true
		
	}
	
	
	/**
	 * 사용자(개발자)가 관리하는 String 객체 생성
	 * - "" 리터럴로 생성된 String -> 상수풀 (JVM관리)
	 * - new 연산자로 생성된 String -> Heap 영역(사용자가 관리)
	 */
	public void method5() {
		
		String temp1 = "abcd"; //리터럴로 생성
		String temp2 = new String("abcd"); //new 연산자로 생성
		String temp3 = new String("abcd"); //new 연산자로 생성했을 경우 Heap영역에 같은 값이어도 새롭게 만들어짐!
		
		System.out.println("temp1 : "+ System.identityHashCode(temp1));//617901222
		System.out.println("temp2 : "+ System.identityHashCode(temp2));//2001049719
		System.out.println("temp3 : "+ System.identityHashCode(temp3));//1528902577
		
		//셋 다 주소가 다름 == "abcd"를 재활용하지 않음
		//-> 값은 같지만 전부 다른 객체!
		
		
		temp2+="efg";
		System.out.println("efg가 붙은 temp2 : "+ System.identityHashCode(temp2));//868693306
		
		//new 연산자로 생성했기에 같은 변수에다가 이어쓰기 했어도 heap영역에 새객체가 형성된다.
		//기존 temp2 해시코드와 다르다 --> 다른 객체라는 것을 말한다.
		
	}
	
	/**
	 * StringBuilder(가변성)/ StringBuffer(가변성) 클래스
	 * -String의 불변성 문제를 해결한 클래스
	 * ->가변성(mutable)
	 * 
	 * - 기본 16글자 저장할 크기로 생성
	 *   저장되는 문자열의 길이에 따라 크기가 증가/ 감소
	 *    -> 마음대로 문자열 수정, 삭제 가능
	 *    -> 수정, 삭제를 해도 추가적인 객체 생성이 없어 효율성이 좋음!
	 *    
	 *    
	 *    => String은 문자를 삭제하고 수정하거나 추가할때 마다 객체가 계속해서 생성되기 때문에 효율성이 떨어진다고 표현!
	 *    
	 *    - StringBuilder :Thread Safe 미제공 (비동기) _ 공동작업 처리가 가능함/ 작업수행 시간이 빠름, Thread 안정성이 다소 떨어져보임.
	 *   
	 *    	: 속도면에서는 StringBuffer 보다 성능이 좋음.
	 *    -> 멀리쓰레드 환경에서는 안쓰는 것이 좋음
	 *    만약 String Thread 환경에서 사용하게 되면 쓰레드 충동 가능서 있음 . -> 글자가 깨지거나 오류 발생! 
	 *    단일 쓰레드 환경에서 유리함!!! (추천)
	 *    
	 *    
	 *    - StringBuffer :Thread Safe(동기) _ 순서대로 처리가 됨/ 작업수행 시간이 느림, Thread 안정성이 보장되어 보임.
	 *    : 속도면에서는 StringBuilder 보다 성능 떨어짐
	 *    -> 멀티쓰레드 환경에서 안정하게 동작할 수 있음.
	 *    -> 멀티쓰레드 환경에서 유리
	 *    
	 *    
	 */
	public void method6() {
		
		
		//String builder 객체 생성
		StringBuilder sb = new StringBuilder();
		
		//StringBuilder 객체에 문자열을 쌓아 나가는 방식으로 사용
		//-> 뒤에 추가(append), 앞에 추가(insert)
		
		sb.append("오늘 점심은 " );//"오늘 점심은"
		System.out.println(System.identityHashCode(sb)); 
		
		sb.append("무엇을 먹을까요? " );
		System.out.println(System.identityHashCode(sb));
		
		sb.insert(0, "2월 21일 "); ///0번 인덱스 삽입 = 제일 앞에 추가
		System.out.println(System.identityHashCode(sb)); 
		
		System.out.println(sb);
		
		//identityHashCode 값이 일정함
		//== 참조하는 객체가 변하지 ㅇ낳음
		//== 객체 내에 값만 수정되고 있다 == 가변성

		
		//StringBuilder => String 변환
		String temp = sb.toString(); // 객체에 저장된 필드를 문자열로 반환
		
		//String[] 문자열.split("구분자")
		// - 문자열을 "구분자"를 기준으로 쪼개어 String[]로 반환
		//2월 21일 오늘 점심은 무엇을 먹을까요? 에서 띄어쓰기를 기준으로 구분해줄것임
		String[] arr = temp.split(" ");
		
		for(String str : arr) {
			System.out.println(str);
		}
		
		System.out.println("-------------------------------------------------");
		
		//equalsIgnoreCase() : 문자열을 비교할 때 대소문자를 무시하고 비교하는 메서드 
		
		String str1 = "hello";
		String str2 = "HELLO";
		
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("두 문자열은 동일합니다");
		}else {
			System.out.println("두 문자열은 다릅니다");
		}
		
	}
	
	
		
	
	
	
	
	
	
	
}
