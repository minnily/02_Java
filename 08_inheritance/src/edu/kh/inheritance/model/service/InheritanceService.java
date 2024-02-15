package edu.kh.inheritance.model.service;

import edu.kh.inheritance.model.dto.Empolyee;
import edu.kh.inheritance.model.dto.Person;
import edu.kh.inheritance.model.dto.Student;

//비즈니스 로직 처리하는 클래스
public class InheritanceService {
	
	//상속 확인 예제
	public void ex1() {
		
		Person p = new Person();
		p.setName("홍길동");
		p.setAge(25);
		p.setNationality("대한민국");
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getNationality());

		//person을 상속받은 student가 person의 필드, 메소드를 정말 사용할 수 있는가?
		
		//student 객체 생성
		Student std =new Student();
		
		//student만의 고유한 필드
		std.setGrade(3);
		std.setClassRoom(5);
	
		
		//person 클래스로부터 상속받은 필드, 메서드
		std.setName("고길동");
		std.setAge(19);
		std.setNationality("대한민국");
		
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		
		System.out.println("-----------------------------");
		
		Empolyee emp =new Empolyee();
		
		//Empolyee 만의 고유 메서드
		emp.setCompany("kh정보교육원");
		
		
		//Person 클래스로부터 상속받은 메서드
		emp.setName("이민경");
		emp.setAge(20);
		emp.setNationality("대한민국");
		
		System.out.println(emp.getCompany());
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getNationality());
		
		p.breath();
		p.move();
		std.breath();
		std.move();
		emp.breath();
		emp.move();
		
		//상속의 특징 : 코드 추가 및 수정에 용이함 
		//				코드 길이 감소 및 중복 제거 효과
	}
	
	//super()생성자 이용방법
	public void ex2() {
		
		//Student 매개변수 5개짜리 생성자
		System.out.println("================================");
		Student std = new Student("김철수",17,"한국",1,3);
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());

	}

	//오버라이딩 확인 예제
	public void ex3() {
		
		Student std = new Student();
		Empolyee emp = new Empolyee();
		
		std.move();//오버라이딩 x -> Person의 메소드 수행
		
		emp.move(); //오버라이딩o -> Empolyee의 메소드 수행
		
		
		
	}

	//toString() 오버라이딩 확인 예제
	public void ex4() {
		Person p = new Person("김철수", 17, "한국");
		System.out.println("==============================");
		System.out.println(p.toString());
		System.out.println(p); 
		//print 구문 수행시 참조변수명을 작성하면 
		//자동으로 tostring() 메소드를 호출해서 출력해준다(이미 작성되어 있기에!)
		//작성된게 없다면 주소값으로 나옴!
		
		System.out.println("===================================");
		Student std = new Student("이백점", 18, "미국",2,6);
		System.out.println(std.toString());
		System.out.println(std);
		
		System.out.println("===================================");
		Empolyee emp = new Empolyee("김노동",30,"한국","삼성전자");
		
		System.out.println(emp);
		
		
		
	}

	
}
