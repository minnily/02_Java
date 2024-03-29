package edu.kh.variable.ex1;

public class VariableExample2 {
	
	public static void main(String[] args) {
		
		/* 자바 기본 자료형 8가지
		 * 
		 * 논리형 : boolean(1byte)
		 * 정수형 : byte(1byte), short(2byte), int(4byte), long(8byte)
		 * 실수형 : float(4byte), double(8byte)
		 * 문자형 : chat(2byte, 유니코드)
		 * */
		
		// 변수 선언 : 메모리에 값을 저장할 공간을 할당하는 것.
		// 변수 값 대입 : 변수에 값을 집어 넣는 것.
		
		
		// * 카멜 표기법 : 연결되는 두 단어 중 후속단어의 첫 문자를 대문자로 표기하는 방법
		
	
		boolean booleanData;
		// 메모리에 논리값(t/f)을 저장할 공간을 1byte 할당하고 할당된 공간을 booleanData 라고 부르겠다.
		
		booleanData = true; //booleanData 변수에 true; 값을 집어 넣기 
		
		
		System.out.println("booleanData :" + booleanData);
		
		
		
		
		byte byteNumber = 127;// byte가 최대로 표현할 수 있는 값은 127이기에 128을 넣으면 에러가 발생
		//메모리 정수 값을 저장할 공간을 1byte 할당하고 할당된 공간을 bytrNumber라고 부르겠다. 
		//선언된byteNumber 변수에 처음으로 127을 넣음. ---> 초기화 (처음 변수에 값을 대입)
		
		System.out.println("byteNumber : " + byteNumber);
		
		short shortNumber =32767;
		
		//정수 자료형의 기본형!(short, byte 옛날 코드 잔재)
		int intNumber =2147483647;
		//int :자료형 , intNumber :변수 명 ,값 : 2147483647) 리터럴
		// 프로그래밍에서는 대입되는 이 데이터(값자체)를 리터럴 이라는 단어로도 표현합니다.
		//** 리터럴: 변수에 대입되거나 작성되어지는 값자체 + 자료형에 따라 리터럴 표기법이 다름.
		
		
		
		long longNumber =10000000000L; //리터널 뒤에 l또는 L을 붙여 let이 아닌 long이라는 것을 명시해준다
		//  The literal 10000000000 of type int out of range
		//-> 100억 이라는 값은 int의 범위를 벗어났다. 뒤에 L을 붙여줌으로써 long 자료형인 것을 나타냄.
		
		
		//float floatNumber =1.1235;//f 또는 F 가능
		//1.2345 까지만 쓰면 에러 발생 (double 자료형이라서)
		
		double doubleNamber =3.141592;
		//bouble이 실수형 중에서 기본형(리터럴 표기법이 없는 실수는  double로 인식)
		//d를 뒤에 쓸 수는 있지만 사용하지 않아도 괜찮음. -> 3.1415925
		
		//문자형 리터럴 표기법 : ""(홑따옴표)
		// -> 문자 하나일 경우
		char ch = 'A';
		char ch2 = 66;
		
		/*char 자료형에 숫자가 대입될 수 있는 이유
		 * -컴퓨터에는 문자표가 존재하고 있음
		 * 숫자에 따라 지정된 문자 모양이 매핑되고 
		 * 'B'문자 그대로 대입되면 변수에 숫자 66으로 변환되어 저장
		 *  -> 반대로 생각하면 변수에 애초에 66이라는 숫자를 저장하는 것이 가능함.
		 *	
		 */
		
		System.out.println("ch : " +ch);
		System.out.println("ch2 : " +ch2);
		
		//변수 명명 규칙
		
		// 1. 대소문자 구분, 길이 제한 x
		// ex) int abcdefg123456789;
		// ex) int abcdefG123456789; // int는 대소문자를 구분함. 그래서 G 다르기에 다르게 인식함.
		
		// 2. 예약어 사용 x
		// ex) double int 등 ....
		
		// 3. 숫자 시작 x
		// ex) chr 1abc; =>x , char a2bc와 같이 숫자가 들어가는 것은 사용 가능
		
		
		
		// 4. 특수문자 $,_만 사용가능 (권장하지는 않음)
		// ex) int $intNumber; //문제는 x , 작성은 하지 않음 _도 마찬가지! 
		//자바는 카멜표기법을 따르고 _작성 표기법은 DB에서 사용하고 있으니 참고!
		
		// 5. 카멜 표기법
		// ex) char helloWorldAppleBanana.... 
		
		// 6. 변수명은 언어를 가리지 않음(한글도 가능 , 하지만 쓰지는 않음)
		// ex) int 정수1번;  문제없이 값도 잘 나오지만.. 쓰진 않는다! 
		
		
		//-----------------------------------------------------
		
		final double PI_VALUE =3.14;
		//PI_VALUE =2.33333; //에러 재대입 불가!
		
		
		/*상수(항상 같은 수):
		 * - 변수의 한 종류
		 * - 한번 값이 대입되면 다른 값을 재대입 할 수 없음!
		 * - 자료형 앞에 final 키워드를 작성 
		 * 
		 * - 상수 명명 규칙 : 모두 대문자, 여러단어 작성 시 _ 사용
		 * 
		 * - 상수를 사용하는 경우 
		 * 1) 변하면 안되는 고정된 값을 저장할 경우
		 * 2) 특정한 값에 의미를 부여하는 경우 ex) final int LEFT_MOVE = -1;
		 * 3) 
		 *  
		 * 
		 * */
 	
	
	System.out.println(1 + 1.3);
	
	
	
	}
}
