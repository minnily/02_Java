package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

//Service : 특정 기능(비즈니스 로직)을 제공하는 클래스
public class AbstractionService {

	
	public void ex1() {
		//국민 객체 만들기
		People p1= new People(); // => 새로운 People 객체를 Heap영역에 생성
		//People p1 : People객체의 주소를 저장하여 참조하는 변수 p1
		
		//**클래스 이름이 자료형 처럼 사용된다 ==그래서 클래스를 "사용자 정의 자료형!"이라고도 한다!**
		
		
		//[직접 접근하는 방법]
//		p1.name ="홍길동";
//		p1.gender ='남';
//		p1.pNo ="2000000-1234567";
//		p1.address ="서울시 중구 남대문구로 120 그레이츠청계 3층";
//		p1.phone ="010-3333-1234";
//		p1.age =10;
//		
//		System.out.println("p1의 name :" +p1.name);
//		System.out.println("p1의 gender :" +p1.gender);
//		System.out.println("p1의 pNo :" +p1.pNo);
//		System.out.println("p1의 address :" +p1.address);
//		System.out.println("p1의 phone :" +p1.phone);
//		System.out.println("p1의 age :" +p1.age);
		
		
		p1.setName("홍길동");
		p1.setGender('남');
		p1.setpNo("2000000-1234567");
		p1.setAddress("서울시 중구 남대문구로 120 그레이츠청계 3층");
		p1.setPhone("010-3333-1234");
		p1.setAge(4);
		
		System.out.println("p1의 name : " +p1.getName());
		System.out.println("p1의 gender : " +p1.getGender());
		System.out.println("p1의  pNo : " +p1.getpNo());
		System.out.println("p1의 address : " +p1.getAddress());
		System.out.println("p1의 phone : " +p1.getPhone());
		System.out.println("p1의 age : " +p1.getAge());
		p1.tax();
		p1.vote();
		
		//본인 객체 만들기
		
		System.out.println("===================================");
		
		People p2= new People();
		
		p2.setName("이민경");
		p2.setGender('여');
		p2.setpNo("960118-2******");
		p2.setAddress("경기도 수원시 ");
		p2.setPhone("010-2991-1957");
		p2.setAge(29);
		
		System.out.println(p2.getName()+"의 name : " +p2.getName());
		System.out.println(p2.getName()+"의 gender : " +p2.getGender());
		System.out.println(p2.getName()+"의  pNo : " +p2.getpNo());
		System.out.println(p2.getName()+"의 address : " +p2.getAddress());
		System.out.println(p2.getName()+"의 phone : " +p2.getPhone());
		System.out.println(p2.getName()+"의 age : " +p2.getAge());
		p2.tax(); //기본적으로 기능 부분은 print 기능을 하고 있기에 객체 입력하면 도출할 수 있음.
		p2.vote();
		
	}
}
