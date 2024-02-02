package edu.kh.variable.ex2;

public class PrintExample {
	//main 작성 ctrl+space + enter
	public static void main(String[] args) {
		
		
		//System.out.print(); : 단순 출력(출력 후 줄바꿈X)
		//System.out.println(); : 한 줄 출력(출력 후 줄바꿈 수행)
		//줄바꿈이라는 차이점은 있지만 괄호안의 내용이 그대로 출력된다는 것은 똑같음
	
		//System.out.println(); 자동완성 syso + ctrl + space
		System.out.println("테스트1");
		System.out.println("테스트2");
		
		System.out.print("테스트3");
		
		System.out.println(); // 내용없는 prinln()을 쓰면 단순한 줄바꿈을 해줄 수 있음

		System.out.print("테스트4"); 

		
		//System.out.printf(); : 출력될 문자열 형식을 패턴으로 지정하는 출력구문
	
	
	
		System.out.println(); //단순줄바꿈
		
		int iNum1 = 10;
		int iNum2 = 5;
		
		// System.out.println() 로 10 + 5 = 15만들기 방법
		System.out.println(iNum1 +"+"+iNum2 + "=" + (iNum1+iNum2));
		
		/*printf 사용하는 패턴
		 * 
		 *  %d : 정수형, %o : 8진수, %x : 16진수
			%c : 문자, %s : 문자열
			%f : 실수(소수점아래6자리), %e : 지수형태표현, %g : 대입값그대로
			%A : 16진수실수
			%b : 논리형
			
		*/
		
		// System.out.printf("패턴",패턴에 들어갈 값);
		// System.out.printf()로 10  + 5 =15 출력 방법
	   System.out.printf("%d + %d = %d\n",iNum1,iNum2,iNum1+iNum2); 
	   System.out.printf("%d + %d = %d\n",iNum1,iNum2,iNum1+iNum2);
	   //prinf()는 문자열 뒤에 \n을 사용하면 줄바꿈을 할 수 있음.
	
	   
	   //10+10 *5/2 =35
	   System.out.printf("%d + %d * %d / %d = %d\n", iNum1,iNum1,iNum2,2,iNum1+iNum1*iNum2/2);
	   
	   
	   //패턴 연습
	   
	   int iNum3 =3;
	   
	   System.out.printf("%d\n",iNum3);
	   System.out.printf("%5d\n",iNum3); //5칸 공간을 확보 후 오른쪽 정렬 이라는 의미
	   System.out.printf("%-5d\n",iNum3); //5칸 공간을 확보 후 왼쪽 정렬 이라는 의미
	
	
	   //소수점 자리 제어(반올림처리)
	   System.out.printf("%f\n",10/4.0); //소수점 6번째 자리까지 출력됨
	   System.out.printf("%.2f\n",10/4.0); //소수점 2번째 자리까지 나타내고 싶을때 (f 앞에 .2)
	   System.out.printf("%.0f\n",10/4.0); //소수점 아래를 표현하지 않을때 반올림되서 표현됨(f 앞에 .0)
	   
	   
	   //'문자, 문자열 ,boolean'
	   boolean isTure =false;
	   char ch = '조'; // ch는 ''사용
	   String str ="안녕하세요"; //String은 참조형이라 S가 대문자, 그리고 문자열이기에 ""
	   
	   //'false /조 /안녕하세요' 출력하기
	   System.out.printf("%b / %c / %s\n", isTure, ch, str);
	   
	   //escape(탈출) 문자 : 일반 문자가 아닌 특수문자 표현

	   // '\'를 출력하는 방법
	   System.out.println("\\"); // '\\' 두개를 사용하면 된다.
	   // '\o/' 출력방법
	   System.out.println("\\o/");
	   
	   //tap 사용하여 'a    b    c     d'출력하는 방법 
	   System.out.println("a\tb\tc\td"); //드래그 했을 때  space와 같이 한공간씩 표현되는 것x, 한번의 공간차지하는 걸로 표현됨
	   
	   //유니코드 이스케이프 문자를 사용하여 출력하는 방법
	   System.out.println("\u0041");
	   // A가 출력됨. -> 유니코드(16진수)이기에 65(==A)를 16진수로 표현된 것임. 
	   // 65/16은 몫 4, 나머지 1 이므로 0041이 되는 것임.
	   
	   
	}
}
