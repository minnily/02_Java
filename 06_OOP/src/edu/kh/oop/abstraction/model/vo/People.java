package edu.kh.oop.abstraction.model.vo;

//VO(Value Object) : 값 저장용 객체를 만들기 위한 클래스를 모아두는 패키지
public class People {//국민(사람) 클래스

	/*
	 * 객체(object:물건, 객체): 독립적으로 각각 구분해서 인식할 수 있는 모든것
		ex) 키보드, 김치 등등.. 
		== 배열도 객체!
		
		객체의 속성 => 명사 (값, data)
		객체의 기능 => 동사 (동작, 행동)
		
		지향 : 어떤것으로 목표로 함
		객체지향: 독립적으로 각각 구분해서 인식할 수 있게 끔 하는 것을 목표로 함
		
		언어: 코드, 코딩방식
		-------------------------
		
		=>객체지향 언어: 독립적으로 각각 구분해서 인식할 수 있는 것을 목표로 하는 코딩 방식
		 즉, 객체와 객체의 사건을 코드를 사용하여 컴퓨터에 그대로 집어 넣는 것!
		
		**정확한 정의!!(외우기!)**
		현실 세계는 사물이나 개념처럼 독립되고 구분되는 각각의 객체로 이루어져 있으며, 발생하는 모든 사건들은 객체간의 상호작용
		이 개념을 컴퓨터로 옮겨 놓아 만들어낸 것이 객체지향 언어
		-----------------------------
		
		
		------------------------------
		*객체지향 특징
		
		-캡슐화
		
		-추상화
		: 공통된 코드만 작성하는 것 (즉, 개별적인 것들은 다 제거하는 것)
		 유연성이 높으며, 코드 길이 감소함. 공통속성을 만든 후 넣을 수 있음
		-상속화 
		
		    [장점]
			1)코드길이 감소 (부모객체를 통해 유추할 수 있기에)
			2)코드의 재사용성 용이
		
		-다형성 
		: 다양한 형태를 지니는 성질
		

	 * 
	 * 
	 * 
	 * 
	 * 
	 * ***MVC패턴***
	 * Model- 프로그램, 어플리케이션의 데이터, 비즈니스로직 담당
	 * 
	 * View - 사용자에게 데이터를 시각적으로 표현하는 부분 담당
	 * 
	 * Controller- model,view간의 상호작용을 조정, 제어하는 역할의 담당
	 * 			 - 사용자의 입력 처리하고 대응하는 작업담당*/
	
	
	
	//클래스란? 객체의 특성(속성, 기능)을 정의한 것
	//== 객체를 만들기 위한 설계도
	
	
	//속성 == 값 == data
	//값을 저장하기 위한 변수 선언
	//-> 국민이라면 공통적으로 가지고 있는 속성만 작성(추상화개념)
	//ex) 이름, 성별, 주민번호, 주소, 전화번호, 나이 ...
	
	//필드 == 필드변수 == 멤버변수 == 클래스 변수 => 필드랑 멤버변수라는 말을 가장 많이 사용하는 편임
	
	
	// [캡슐화]
	// - 데이터와 기능을 하나로 묶어서 관리하는 기법
	// - 데이터의 직접적인 접근을 제한 하는 것이 원칙
	// -> 직접 접근을 못하기 때문에 클래스 내부에 간접 접근 방법을 제공하는 기능을 작성해둔다.
	// -> getter/setter
	
	
	//**데이터 직접 접근 제한**
	//public(공공의) -> private(사적인, 개인적인) 변경
	
	
	//public : 접근제한자 / String(int 등 ...) : 자료형 / name(gender 등...) :변수명
	private String name;  //이름
	private char gender; //성별
	private String pNo; //주빈번호 (ex "222222-2222222 이라 문자형으로 저장)
	private String address; // 주소 
	private String phone; // 전화번호 (주민번호와 같이 -도 함께 받을 거라 문자형으로)
	private int age; //나이
	//공통점이 아니면 제거! ex public double bitCoin 등...!
	
	
	//기능 == 행동 == method(메서드)
	public void tax() {
		System.out.println("세금을 냅니다");
	}
	
	public void vote() {
		System.out.println("투표를 합니다");	
	}
	
	
	// Getter Setter의 자동완성 방법
			//alt + shift +s 또는 상단메뉴 Source 
			//->Genrate Getters and Setter ... 클릭
			//->selectAll -> generate
	
	
	
	
//==================================================================//
	//Getter 란?
	//name 변수의 값을 돌려 보내주는 간접 접근 기능
	
	//void : 반환할 값이 없다(반환형이 없다)
	//<-> 반환활 값이 있을 경우 그 값의 자료형을 작성(반환형)
	public String getName() {
		return name;
	}
	
	//Setter란?
	//name 변수에 값을 세팅하는 간접 접근 기능
	
	public void setName(String name) {
		//매개변수 String name
		//->String 타입의 데이터를 전달받아 저장하고 있는 변수 
		//this: 현재 객체
		//멤버변수 name에 매개변수 name을 대입시키는 역할을 함
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getpNo() {
		return pNo;
	}

	public void setpNo(String pNo) {
		this.pNo = pNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	//캡슐화에서 사용할 간접 접근 기능(getter/setter)
	
	//public :접근제한자 / String : 반환형 (되돌려주는 값이 없을때는 void사용)/ getName() : 메서드명
	//getter = get+필드명(카멜케이스)
//	public String getName() {
//		return name;
//	}
//	//반환할 필요가 없기에 void사용 
//	//setter = set+필드명(카멜케이스) 
//	public void setName(String name) {
//		this.name = name; //this.필드에 있는 name = name 은 위에 지정한 매개변수 name 임.
//	}
//	
//	public char getGender() {
//		return gender;
//	}
//	
//	public void setGender(char gender) {
//		this.gender = gender;
//	}
//	
//	public String getPNo() {
//		return pNo;
//	}
//	
//	public void setPNo(String pNo) {
//		this.pNo = pNo;
//	}
//	
//	public String getAddress() {
//		return address;
//	}
//	
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	public String getPhone() {
//		return phone;
//	}
//	
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//	public int getAge() {
//		return age;
//	}
//	
//	public void setAge(int age) {
//		this.age = age;
//	}
	//(이건 수기로 작성하는 방법 )
//=========================================================================//
	


}
